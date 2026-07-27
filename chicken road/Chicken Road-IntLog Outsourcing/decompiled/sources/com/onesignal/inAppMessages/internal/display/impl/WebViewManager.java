package com.onesignal.inAppMessages.internal.display.impl;

import B4.k;
import B4.l;
import B4.r;
import D4.AbstractC0024y;
import D4.E;
import I4.o;
import L4.d;
import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.ViewUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.display.impl.InAppMessageView;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import e5.g;
import f4.v;
import java.util.Arrays;
import java.util.Locale;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import n4.InterfaceC1344a;
import org.json.JSONException;
import org.json.JSONObject;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class WebViewManager implements IActivityLifecycleHandler {
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
    public static final String EVENT_TYPE_RESIZE = "resize";
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
    public static final String JS_OBJ_NAME = "OSAndroid";
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    private final IApplicationService _applicationService;
    private final IInAppLifecycleService _lifecycle;
    private final IInAppMessagePromptFactory _promptFactory;
    private Activity activity;
    private boolean closing;
    private String currentActivityName;
    private boolean dismissFired;
    private Integer lastPageHeight;
    private final InAppMessage message;
    private final InAppMessageContent messageContent;
    private InAppMessageView messageView;
    private final L4.a messageViewMutex;
    private OSWebView webView;
    public static final Companion Companion = new Companion(null);
    private static final int MARGIN_PX_SIZE = ViewUtils.INSTANCE.dpToPx(24);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class OSJavaScriptInterface {
        public OSJavaScriptInterface() {
        }

        private final Position getDisplayLocation(JSONObject jSONObject) {
            Position position = Position.FULL_SCREEN;
            try {
                if (!jSONObject.has(WebViewManager.IAM_DISPLAY_LOCATION_KEY) || i.a(jSONObject.get(WebViewManager.IAM_DISPLAY_LOCATION_KEY), "")) {
                    return position;
                }
                String optString = jSONObject.optString(WebViewManager.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                i.d(optString, "optString(...)");
                Locale locale = Locale.getDefault();
                i.d(locale, "getDefault(...)");
                String upperCase = optString.toUpperCase(locale);
                i.d(upperCase, "toUpperCase(...)");
                return Position.valueOf(upperCase);
            } catch (JSONException e3) {
                e3.printStackTrace();
                return position;
            }
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(WebViewManager.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                WebViewManager webViewManager = WebViewManager.this;
                Activity activity = webViewManager.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(WebViewManager.IAM_PAGE_META_DATA_KEY);
                i.d(jSONObject2, "getJSONObject(...)");
                return webViewManager.pageRectToViewHeight(activity, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            i.b(jSONObject2);
            String safeString = JSONObjectExtensionsKt.safeString(jSONObject2, OutcomeConstants.OUTCOME_ID);
            WebViewManager.this.closing = jSONObject2.getBoolean("close");
            if (WebViewManager.this.message.isPreview()) {
                WebViewManager.this._lifecycle.messageActionOccurredOnPreview(WebViewManager.this.message, new InAppMessageClickResult(jSONObject2, WebViewManager.this._promptFactory));
            } else if (safeString != null) {
                WebViewManager.this._lifecycle.messageActionOccurredOnMessage(WebViewManager.this.message, new InAppMessageClickResult(jSONObject2, WebViewManager.this._promptFactory));
            }
            if (WebViewManager.this.closing) {
                WebViewManager.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            WebViewManager.this._lifecycle.messagePageChanged(WebViewManager.this.message, new InAppMessagePage(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            Position displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == Position.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            WebViewManager.this.messageContent.setDisplayLocation(displayLocation);
            WebViewManager.this.messageContent.setPageHeight(pageHeightData);
            WebViewManager.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void postMessage(String message) {
            InAppMessageView inAppMessageView;
            i.e(message, "message");
            try {
                Logging.debug$default("OSJavaScriptInterface:postMessage: ".concat(message), null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString(WebViewManager.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (!string.equals(WebViewManager.EVENT_TYPE_PAGE_CHANGE)) {
                                break;
                            } else {
                                handlePageChange(jSONObject);
                                break;
                            }
                        case -934437708:
                            string.equals(WebViewManager.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(WebViewManager.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                break;
                            }
                            break;
                        case 1851145598:
                            if (string.equals(WebViewManager.EVENT_TYPE_ACTION_TAKEN) && (inAppMessageView = WebViewManager.this.messageView) != null && !inAppMessageView.isDragging()) {
                                handleActionTaken(jSONObject);
                                break;
                            }
                            break;
                    }
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Position {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position TOP_BANNER = new Position("TOP_BANNER", 0);
        public static final Position BOTTOM_BANNER = new Position("BOTTOM_BANNER", 1);
        public static final Position CENTER_MODAL = new Position("CENTER_MODAL", 2);
        public static final Position FULL_SCREEN = new Position("FULL_SCREEN", 3);

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Position.values().length];
                try {
                    iArr[Position.TOP_BANNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Position.BOTTOM_BANNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{TOP_BANNER, BOTTOM_BANNER, CENTER_MODAL, FULL_SCREEN};
        }

        static {
            Position[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
        }

        private Position(String str, int i2) {
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        public final boolean isBanner() {
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i2 == 1 || i2 == 2;
        }
    }

    public WebViewManager(InAppMessage message, Activity activity, InAppMessageContent messageContent, IInAppLifecycleService _lifecycle, IApplicationService _applicationService, IInAppMessagePromptFactory _promptFactory) {
        i.e(message, "message");
        i.e(activity, "activity");
        i.e(messageContent, "messageContent");
        i.e(_lifecycle, "_lifecycle");
        i.e(_applicationService, "_applicationService");
        i.e(_promptFactory, "_promptFactory");
        this.message = message;
        this.activity = activity;
        this.messageContent = messageContent;
        this._lifecycle = _lifecycle;
        this._applicationService = _applicationService;
        this._promptFactory = _promptFactory;
        this.messageViewMutex = L4.e.a();
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String L5 = r.L(r.L(str, '\n', ' '), '\r', ' ');
        return L5.length() <= LOG_BODY_SNIPPET_MAX_CHARS ? L5 : k.l0(LOG_BODY_SNIPPET_MAX_CHARS, L5).concat("…");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateHeightAndShowWebViewAfterNewActivity(InterfaceC1218d interfaceC1218d) {
        WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1;
        int i2;
        final WebViewManager webViewManager;
        WebViewManager webViewManager2;
        if (interfaceC1218d instanceof WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) {
            webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 = (WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) interfaceC1218d;
            int i3 = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    InAppMessageView inAppMessageView = this.messageView;
                    if (inAppMessageView == null) {
                        return vVar;
                    }
                    if (inAppMessageView.getDisplayPosition() == Position.FULL_SCREEN && !this.messageContent.isFullBleed()) {
                        webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = 1;
                        return showMessageView(null, webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) == enumC1260a ? enumC1260a : vVar;
                    }
                    Logging.debug$default("In app message new activity, calculate height and show ", null, 2, null);
                    IApplicationService iApplicationService = this._applicationService;
                    webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0 = this;
                    webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = 2;
                    if (iApplicationService.waitUntilActivityReady(webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    webViewManager = this;
                    webViewManager.setWebViewToMaxSize(webViewManager.activity);
                    if (webViewManager.messageContent.isFullBleed()) {
                    }
                    OSWebView oSWebView = webViewManager.webView;
                    i.b(oSWebView);
                    oSWebView.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.b
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            WebViewManager.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager.this, (String) obj2);
                        }
                    });
                    return vVar;
                }
                if (i2 == 1) {
                    g.y(obj);
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webViewManager2 = (WebViewManager) webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0;
                    g.y(obj);
                    webViewManager = webViewManager2;
                    OSWebView oSWebView2 = webViewManager.webView;
                    i.b(oSWebView2);
                    oSWebView2.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.b
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            WebViewManager.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager.this, (String) obj2);
                        }
                    });
                    return vVar;
                }
                webViewManager = (WebViewManager) webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0;
                g.y(obj);
                webViewManager.setWebViewToMaxSize(webViewManager.activity);
                if (webViewManager.messageContent.isFullBleed()) {
                    webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.L$0 = webViewManager;
                    webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label = 3;
                    if (webViewManager.updateSafeAreaInsets(webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    webViewManager2 = webViewManager;
                    webViewManager = webViewManager2;
                }
                OSWebView oSWebView22 = webViewManager.webView;
                i.b(oSWebView22);
                oSWebView22.evaluateJavascript(GET_PAGE_META_DATA_JS_FUNCTION, new ValueCallback() { // from class: com.onesignal.inAppMessages.internal.display.impl.b
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        WebViewManager.calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager.this, (String) obj2);
                    }
                });
                return vVar;
            }
        }
        webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1 = new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$1(this, interfaceC1218d);
        Object obj2 = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = webViewManager$calculateHeightAndShowWebViewAfterNewActivity$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateHeightAndShowWebViewAfterNewActivity$lambda$0(WebViewManager this$0, String str) {
        i.e(this$0, "this$0");
        if (str == null || k.Z(str) || i.a(str, "null")) {
            Logging.warn$default("calculateHeightAndShowWebViewAfterNewActivity: empty/null page metadata from WebView; skipping height update", null, 2, null);
            return;
        }
        try {
            ThreadUtilsKt.suspendifyOnIO(new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(this$0, this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null));
        } catch (JSONException e3) {
            Logging.warn("calculateHeightAndShowWebViewAfterNewActivity: could not parse page metadata; snippet=" + this$0.bodySnippet(str), e3);
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (Logging.atLogLevel(LogLevel.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return ViewUtils.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return ViewUtils.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return ViewUtils.INSTANCE.getWindowHeight(activity) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("rect");
        int optInt = optJSONObject != null ? optJSONObject.optInt("height", -1) : -1;
        if (optInt < 0) {
            Logging.warn$default("pageRectToViewHeight could not get page height (missing/invalid 'rect.height'); snippet=" + bodySnippet(jSONObject.toString()), null, 2, null);
            return -1;
        }
        int dpToPx = ViewUtils.INSTANCE.dpToPx(optInt);
        Logging.debug$default("getPageHeightData:pxHeight: " + dpToPx, null, 2, null);
        int webViewMaxSizeY = getWebViewMaxSizeY(activity);
        if (dpToPx <= webViewMaxSizeY) {
            return dpToPx;
        }
        Logging.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
        return webViewMaxSizeY;
    }

    private final void setMessageView(InAppMessageView inAppMessageView) {
        this.messageView = inAppMessageView;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        OSWebView oSWebView = this.webView;
        i.b(oSWebView);
        oSWebView.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:22:0x00e3, B:24:0x00e7, B:28:0x005a, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:40:0x0097, B:42:0x00aa, B:44:0x00b4, B:46:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:22:0x00e3, B:24:0x00e7, B:28:0x005a, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:40:0x0097, B:42:0x00aa, B:44:0x00b4, B:46:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:22:0x00e3, B:24:0x00e7, B:28:0x005a, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:40:0x0097, B:42:0x00aa, B:44:0x00b4, B:46:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:22:0x00e3, B:24:0x00e7, B:28:0x005a, B:29:0x00ce, B:31:0x00d2, B:35:0x0088, B:37:0x008c, B:40:0x0097, B:42:0x00aa, B:44:0x00b4, B:46:0x00ba), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMessageView(Integer num, InterfaceC1218d interfaceC1218d) {
        WebViewManager$showMessageView$1 webViewManager$showMessageView$1;
        int i2;
        WebViewManager webViewManager;
        Integer num2;
        L4.a aVar;
        WebViewManager webViewManager2;
        InAppMessageView inAppMessageView;
        InAppMessageView inAppMessageView2;
        try {
            if (interfaceC1218d instanceof WebViewManager$showMessageView$1) {
                webViewManager$showMessageView$1 = (WebViewManager$showMessageView$1) interfaceC1218d;
                int i3 = webViewManager$showMessageView$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    webViewManager$showMessageView$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = webViewManager$showMessageView$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = webViewManager$showMessageView$1.label;
                    v vVar = v.f5689a;
                    if (i2 != 0) {
                        g.y(obj);
                        L4.a aVar2 = this.messageViewMutex;
                        webViewManager$showMessageView$1.L$0 = this;
                        webViewManager$showMessageView$1.L$1 = num;
                        webViewManager$showMessageView$1.L$2 = aVar2;
                        webViewManager$showMessageView$1.label = 1;
                        d dVar = (d) aVar2;
                        if (dVar.c(webViewManager$showMessageView$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        webViewManager = this;
                        num2 = num;
                        aVar = dVar;
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                aVar = (L4.a) webViewManager$showMessageView$1.L$1;
                                webViewManager2 = (WebViewManager) webViewManager$showMessageView$1.L$0;
                                g.y(obj);
                                inAppMessageView = webViewManager2.messageView;
                                if (inAppMessageView != null) {
                                    Activity activity = webViewManager2.activity;
                                    webViewManager$showMessageView$1.L$0 = webViewManager2;
                                    webViewManager$showMessageView$1.L$1 = aVar;
                                    webViewManager$showMessageView$1.L$2 = null;
                                    webViewManager$showMessageView$1.label = 3;
                                    if (inAppMessageView.showView(activity, webViewManager$showMessageView$1) == enumC1260a) {
                                        return enumC1260a;
                                    }
                                }
                                inAppMessageView2 = webViewManager2.messageView;
                                if (inAppMessageView2 != null) {
                                }
                                ((d) aVar).e(null);
                                return vVar;
                            }
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar = (L4.a) webViewManager$showMessageView$1.L$0;
                                g.y(obj);
                                ((d) aVar).e(null);
                                return vVar;
                            }
                            aVar = (L4.a) webViewManager$showMessageView$1.L$1;
                            webViewManager2 = (WebViewManager) webViewManager$showMessageView$1.L$0;
                            g.y(obj);
                            inAppMessageView2 = webViewManager2.messageView;
                            if (inAppMessageView2 != null) {
                                webViewManager$showMessageView$1.L$0 = aVar;
                                webViewManager$showMessageView$1.L$1 = null;
                                webViewManager$showMessageView$1.L$2 = null;
                                webViewManager$showMessageView$1.label = 4;
                                if (inAppMessageView2.checkIfShouldDismiss(webViewManager$showMessageView$1) == enumC1260a) {
                                    return enumC1260a;
                                }
                            }
                            ((d) aVar).e(null);
                            return vVar;
                        }
                        aVar = (L4.a) webViewManager$showMessageView$1.L$2;
                        num2 = (Integer) webViewManager$showMessageView$1.L$1;
                        webViewManager = (WebViewManager) webViewManager$showMessageView$1.L$0;
                        g.y(obj);
                    }
                    if (webViewManager.messageView != null) {
                        Logging.warn$default("No messageView found to update a with a new height.", null, 2, null);
                        ((d) aVar).e(null);
                        return vVar;
                    }
                    Logging.debug$default("In app message, showing first one with height: " + num2, null, 2, null);
                    InAppMessageView inAppMessageView3 = webViewManager.messageView;
                    if (inAppMessageView3 != null) {
                        OSWebView oSWebView = webViewManager.webView;
                        i.b(oSWebView);
                        inAppMessageView3.setWebView(oSWebView);
                    }
                    if (num2 != null) {
                        webViewManager.lastPageHeight = num2;
                        InAppMessageView inAppMessageView4 = webViewManager.messageView;
                        if (inAppMessageView4 != null) {
                            int intValue = num2.intValue();
                            webViewManager$showMessageView$1.L$0 = webViewManager;
                            webViewManager$showMessageView$1.L$1 = aVar;
                            webViewManager$showMessageView$1.L$2 = null;
                            webViewManager$showMessageView$1.label = 2;
                            if (inAppMessageView4.updateHeight(intValue, webViewManager$showMessageView$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                    }
                    webViewManager2 = webViewManager;
                    inAppMessageView = webViewManager2.messageView;
                    if (inAppMessageView != null) {
                    }
                    inAppMessageView2 = webViewManager2.messageView;
                    if (inAppMessageView2 != null) {
                    }
                    ((d) aVar).e(null);
                    return vVar;
                }
            }
            if (i2 != 0) {
            }
            if (webViewManager.messageView != null) {
            }
        } catch (Throwable th) {
            ((d) num).e(null);
            throw th;
        }
        webViewManager$showMessageView$1 = new WebViewManager$showMessageView$1(this, interfaceC1218d);
        Object obj2 = webViewManager$showMessageView$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = webViewManager$showMessageView$1.label;
        v vVar2 = v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(InterfaceC1218d interfaceC1218d) {
        K4.d dVar = E.f459a;
        Object w3 = AbstractC0024y.w(o.f1316a, new WebViewManager$updateSafeAreaInsets$2(this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        ThreadUtilsKt.suspendifyOnDefault(new WebViewManager$backgroundDismissAndAwaitNextMessage$1(this, null));
    }

    public final void createNewInAppMessageView(boolean z) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        OSWebView oSWebView = this.webView;
        i.b(oSWebView);
        setMessageView(new InAppMessageView(oSWebView, this.messageContent, z, manifestMetaBoolean));
        InAppMessageView inAppMessageView = this.messageView;
        i.b(inAppMessageView);
        inAppMessageView.setMessageController(new InAppMessageView.InAppMessageViewListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.WebViewManager$createNewInAppMessageView$1
            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWasDismissed() {
                IApplicationService iApplicationService;
                WebViewManager.this._lifecycle.messageWasDismissed(WebViewManager.this.message);
                iApplicationService = WebViewManager.this._applicationService;
                iApplicationService.removeActivityLifecycleHandler(this);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWasDisplayed() {
                WebViewManager.this._lifecycle.messageWasDisplayed(WebViewManager.this.message);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.InAppMessageViewListener
            public void onMessageWillDismiss() {
                WebViewManager.this._lifecycle.messageWillDismiss(WebViewManager.this.message);
            }
        });
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismissAndAwaitNextMessage(InterfaceC1218d interfaceC1218d) {
        WebViewManager$dismissAndAwaitNextMessage$1 webViewManager$dismissAndAwaitNextMessage$1;
        int i2;
        WebViewManager webViewManager;
        if (interfaceC1218d instanceof WebViewManager$dismissAndAwaitNextMessage$1) {
            webViewManager$dismissAndAwaitNextMessage$1 = (WebViewManager$dismissAndAwaitNextMessage$1) interfaceC1218d;
            int i3 = webViewManager$dismissAndAwaitNextMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webViewManager$dismissAndAwaitNextMessage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webViewManager$dismissAndAwaitNextMessage$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = webViewManager$dismissAndAwaitNextMessage$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    InAppMessageView inAppMessageView = this.messageView;
                    if (inAppMessageView != null && !this.dismissFired) {
                        this.dismissFired = true;
                        this._lifecycle.messageWillDismiss(this.message);
                        webViewManager$dismissAndAwaitNextMessage$1.L$0 = this;
                        webViewManager$dismissAndAwaitNextMessage$1.label = 1;
                        if (inAppMessageView.dismissAndAwaitNextMessage(webViewManager$dismissAndAwaitNextMessage$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        webViewManager = this;
                    }
                    return vVar;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webViewManager = (WebViewManager) webViewManager$dismissAndAwaitNextMessage$1.L$0;
                g.y(obj);
                webViewManager.dismissFired = false;
                webViewManager.setMessageView(null);
                return vVar;
            }
        }
        webViewManager$dismissAndAwaitNextMessage$1 = new WebViewManager$dismissAndAwaitNextMessage$1(this, interfaceC1218d);
        Object obj2 = webViewManager$dismissAndAwaitNextMessage$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = webViewManager$dismissAndAwaitNextMessage$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        webViewManager.dismissFired = false;
        webViewManager.setMessageView(null);
        return vVar2;
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityAvailable(Activity activity) {
        i.e(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        Logging.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        ThreadUtilsKt.suspendifyOnMain(new WebViewManager$onActivityAvailable$1(str, this, null));
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
        Logging.debug$default(l.E("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !i.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        InAppMessageView inAppMessageView = this.messageView;
        i.b(inAppMessageView);
        inAppMessageView.removeAllViews();
    }

    public final void secureSetup(WebView webView) {
        i.e(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    public final void setContentSafeAreaInsets(InAppMessageContent content, Activity activity) {
        i.e(content, "content");
        i.e(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = ViewUtils.INSTANCE.getCutoutAndStatusBarInsets(activity);
        content.setContentHtml(contentHtml + String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4))}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupWebView(Activity activity, String str, boolean z, InterfaceC1218d interfaceC1218d) {
        WebViewManager$setupWebView$1 webViewManager$setupWebView$1;
        int i2;
        WebViewManager webViewManager;
        if (interfaceC1218d instanceof WebViewManager$setupWebView$1) {
            webViewManager$setupWebView$1 = (WebViewManager$setupWebView$1) interfaceC1218d;
            int i3 = webViewManager$setupWebView$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webViewManager$setupWebView$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webViewManager$setupWebView$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = webViewManager$setupWebView$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    enableWebViewRemoteDebugging();
                    OSWebView oSWebView = new OSWebView(activity);
                    this.webView = oSWebView;
                    oSWebView.setOverScrollMode(2);
                    OSWebView oSWebView2 = this.webView;
                    i.b(oSWebView2);
                    oSWebView2.setVerticalScrollBarEnabled(false);
                    OSWebView oSWebView3 = this.webView;
                    i.b(oSWebView3);
                    oSWebView3.setHorizontalScrollBarEnabled(false);
                    OSWebView oSWebView4 = this.webView;
                    i.b(oSWebView4);
                    secureSetup(oSWebView4);
                    OSWebView oSWebView5 = this.webView;
                    i.b(oSWebView5);
                    oSWebView5.addJavascriptInterface(new OSJavaScriptInterface(), JS_OBJ_NAME);
                    if (z) {
                        OSWebView oSWebView6 = this.webView;
                        i.b(oSWebView6);
                        oSWebView6.setSystemUiVisibility(3074);
                        if (Build.VERSION.SDK_INT >= 30) {
                            OSWebView oSWebView7 = this.webView;
                            i.b(oSWebView7);
                            oSWebView7.setFitsSystemWindows(false);
                        }
                    }
                    this._lifecycle.messageWillDisplay(this.message);
                    IApplicationService iApplicationService = this._applicationService;
                    webViewManager$setupWebView$1.L$0 = this;
                    webViewManager$setupWebView$1.L$1 = activity;
                    webViewManager$setupWebView$1.L$2 = str;
                    webViewManager$setupWebView$1.label = 1;
                    if (iApplicationService.waitUntilActivityReady(webViewManager$setupWebView$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    webViewManager = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) webViewManager$setupWebView$1.L$2;
                    activity = (Activity) webViewManager$setupWebView$1.L$1;
                    webViewManager = (WebViewManager) webViewManager$setupWebView$1.L$0;
                    g.y(obj);
                }
                webViewManager.setWebViewToMaxSize(activity);
                OSWebView oSWebView8 = webViewManager.webView;
                i.b(oSWebView8);
                oSWebView8.loadData(str, "text/html; charset=utf-8", "base64");
                return v.f5689a;
            }
        }
        webViewManager$setupWebView$1 = new WebViewManager$setupWebView$1(this, interfaceC1218d);
        Object obj2 = webViewManager$setupWebView$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = webViewManager$setupWebView$1.label;
        if (i2 != 0) {
        }
        webViewManager.setWebViewToMaxSize(activity);
        OSWebView oSWebView82 = webViewManager.webView;
        i.b(oSWebView82);
        oSWebView82.loadData(str, "text/html; charset=utf-8", "base64");
        return v.f5689a;
    }
}
