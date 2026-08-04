package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import R0.d;
import R0.q;
import S0.C0431b;
import S0.w;
import android.os.Build;
import android.webkit.WebSettings;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class InAppWebViewSettings implements ISettings<InAppWebViewInterface> {
    public static final String LOG_TAG = "InAppWebViewSettings";
    public Boolean algorithmicDarkeningAllowed;
    public Boolean allowBackgroundAudioPlaying;
    public Boolean allowContentAccess;
    public Boolean allowFileAccess;
    public Boolean allowFileAccessFromFileURLs;
    public Boolean allowUniversalAccessFromFileURLs;
    public Double alpha;
    public String appCachePath;
    public String applicationNameForUserAgent;
    public Boolean blockNetworkImage;
    public Boolean blockNetworkLoads;
    public Boolean builtInZoomControls;
    public Boolean cacheEnabled;
    public Integer cacheMode;

    @Deprecated
    public Boolean clearCache;

    @Deprecated
    public Boolean clearSessionCache;
    public List<Map<String, Map<String, Object>>> contentBlockers;
    public String cursiveFontFamily;
    public Boolean databaseEnabled;
    public Integer defaultFixedFontSize;
    public Integer defaultFontSize;
    public String defaultTextEncodingName;
    public byte[] defaultVideoPoster;
    public Boolean disableContextMenu;
    public Boolean disableDefaultErrorPage;
    public Boolean disableHorizontalScroll;
    public Boolean disableVerticalScroll;
    public Integer disabledActionModeMenuItems;
    public Boolean displayZoomControls;
    public Boolean domStorageEnabled;
    public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
    public String fantasyFontFamily;
    public String fixedFontFamily;

    @Deprecated
    public Integer forceDark;

    @Deprecated
    public Integer forceDarkStrategy;
    public Boolean geolocationEnabled;
    public Boolean hardwareAcceleration;
    public Boolean horizontalScrollBarEnabled;
    public String horizontalScrollbarThumbColor;
    public String horizontalScrollbarTrackColor;
    public Boolean incognito;
    public Integer initialScale;
    public Boolean interceptOnlyAsyncAjaxRequests;
    public Boolean isUserInteractionEnabled;
    public Boolean javaScriptBridgeEnabled;
    public Boolean javaScriptBridgeForMainFrameOnly;
    public Set<String> javaScriptBridgeOriginAllowList;
    public Boolean javaScriptCanOpenWindowsAutomatically;
    public Boolean javaScriptEnabled;
    public Boolean javaScriptHandlersForMainFrameOnly;
    public Set<Pattern> javaScriptHandlersOriginAllowList;
    public WebSettings.LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode;
    public Boolean loadsImagesAutomatically;
    public Boolean mediaPlaybackRequiresUserGesture;
    public Integer minimumFontSize;
    public Integer minimumLogicalFontSize;
    public Integer mixedContentMode;
    public Boolean needInitialFocus;
    public Boolean networkAvailable;
    public Boolean offscreenPreRaster;
    public Integer overScrollMode;
    public Boolean pluginScriptsForMainFrameOnly;
    public Set<String> pluginScriptsOriginAllowList;
    public Integer preferredContentMode;
    public Pattern regexToAllowSyncUrlLoading;
    public Pattern regexToCancelSubFramesLoading;
    public Map<String, Object> rendererPriorityPolicy;
    public Set<String> requestedWithHeaderOriginAllowList;
    public List<String> resourceCustomSchemes;
    public Boolean safeBrowsingEnabled;
    public String sansSerifFontFamily;
    public Boolean saveFormData;
    public Integer scrollBarDefaultDelayBeforeFade;
    public Integer scrollBarFadeDuration;
    public Integer scrollBarStyle;
    public Boolean scrollbarFadingEnabled;
    public String serifFontFamily;
    public String standardFontFamily;
    public Boolean supportMultipleWindows;
    public Boolean supportZoom;
    public Integer textZoom;
    public Boolean thirdPartyCookiesEnabled;
    public Boolean transparentBackground;
    public Boolean useHybridComposition;
    public Boolean useOnDownloadStart;
    public Boolean useOnLoadResource;
    public Boolean useOnRenderProcessGone;
    public Boolean useShouldInterceptAjaxRequest;
    public Boolean useShouldInterceptFetchRequest;
    public Boolean useShouldInterceptRequest;
    public Boolean useShouldOverrideUrlLoading;
    public Boolean useWideViewPort;
    public String userAgent;
    public Boolean verticalScrollBarEnabled;
    public Integer verticalScrollbarPosition;
    public String verticalScrollbarThumbColor;
    public String verticalScrollbarTrackColor;
    public Map<String, Object> webViewAssetLoader;

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm;

        static {
            int[] iArr = new int[WebSettings.LayoutAlgorithm.values().length];
            $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm = iArr;
            try {
                iArr[WebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public InAppWebViewSettings() {
        Boolean bool = Boolean.FALSE;
        this.useShouldOverrideUrlLoading = bool;
        this.useOnLoadResource = bool;
        this.useOnDownloadStart = bool;
        this.clearCache = bool;
        this.userAgent = "";
        this.applicationNameForUserAgent = "";
        Boolean bool2 = Boolean.TRUE;
        this.javaScriptEnabled = bool2;
        this.javaScriptCanOpenWindowsAutomatically = bool;
        this.mediaPlaybackRequiresUserGesture = bool2;
        this.minimumFontSize = 8;
        this.verticalScrollBarEnabled = bool2;
        this.horizontalScrollBarEnabled = bool2;
        this.resourceCustomSchemes = new ArrayList();
        this.contentBlockers = new ArrayList();
        this.preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
        this.useShouldInterceptAjaxRequest = bool;
        this.interceptOnlyAsyncAjaxRequests = bool2;
        this.useShouldInterceptFetchRequest = bool;
        this.incognito = bool;
        this.cacheEnabled = bool2;
        this.transparentBackground = bool;
        this.disableVerticalScroll = bool;
        this.disableHorizontalScroll = bool;
        this.disableContextMenu = bool;
        this.supportZoom = bool2;
        this.allowFileAccessFromFileURLs = bool;
        this.allowUniversalAccessFromFileURLs = bool;
        this.allowBackgroundAudioPlaying = bool;
        this.clearSessionCache = bool;
        this.builtInZoomControls = bool2;
        this.displayZoomControls = bool;
        this.databaseEnabled = bool;
        this.domStorageEnabled = bool2;
        this.useWideViewPort = bool2;
        this.safeBrowsingEnabled = bool2;
        this.allowContentAccess = bool2;
        this.allowFileAccess = bool2;
        this.blockNetworkImage = bool;
        this.blockNetworkLoads = bool;
        this.cacheMode = -1;
        this.cursiveFontFamily = "cursive";
        this.defaultFixedFontSize = 16;
        this.defaultFontSize = 16;
        this.defaultTextEncodingName = "UTF-8";
        this.fantasyFontFamily = "fantasy";
        this.fixedFontFamily = "monospace";
        this.geolocationEnabled = bool2;
        this.loadWithOverviewMode = bool2;
        this.loadsImagesAutomatically = bool2;
        this.minimumLogicalFontSize = 8;
        this.initialScale = 0;
        this.needInitialFocus = bool2;
        this.offscreenPreRaster = bool;
        this.sansSerifFontFamily = "sans-serif";
        this.serifFontFamily = "sans-serif";
        this.standardFontFamily = "sans-serif";
        this.saveFormData = bool2;
        this.thirdPartyCookiesEnabled = bool2;
        this.hardwareAcceleration = bool2;
        this.supportMultipleWindows = bool;
        this.overScrollMode = 1;
        this.scrollBarStyle = 0;
        this.verticalScrollbarPosition = 0;
        this.scrollbarFadingEnabled = bool2;
        this.useShouldInterceptRequest = bool;
        this.useOnRenderProcessGone = bool;
        this.disableDefaultErrorPage = bool;
        this.useHybridComposition = bool2;
        this.algorithmicDarkeningAllowed = bool;
        this.enterpriseAuthenticationAppLinkPolicyEnabled = bool2;
        this.javaScriptHandlersForMainFrameOnly = bool;
        this.javaScriptBridgeEnabled = bool2;
        this.pluginScriptsForMainFrameOnly = bool;
        this.isUserInteractionEnabled = bool2;
    }

    private String getLayoutAlgorithm() {
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.layoutAlgorithm;
        if (layoutAlgorithm == null) {
            return null;
        }
        int i7 = AnonymousClass2.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[layoutAlgorithm.ordinal()];
        if (i7 == 1) {
            return "NORMAL";
        }
        if (i7 == 2) {
            return "TEXT_AUTOSIZING";
        }
        if (i7 != 3) {
            return null;
        }
        return "NARROW_COLUMNS";
    }

    private void setLayoutAlgorithm(String str) {
        if (str != null) {
            switch (str) {
                case "NARROW_COLUMNS":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                case "NORMAL":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
                case "TEXT_AUTOSIZING":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
                    break;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<InAppWebViewInterface> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("useShouldOverrideUrlLoading", this.useShouldOverrideUrlLoading);
        map.put("useOnLoadResource", this.useOnLoadResource);
        map.put("useOnDownloadStart", this.useOnDownloadStart);
        map.put("clearCache", this.clearCache);
        map.put("userAgent", this.userAgent);
        map.put("applicationNameForUserAgent", this.applicationNameForUserAgent);
        map.put("javaScriptEnabled", this.javaScriptEnabled);
        map.put("javaScriptCanOpenWindowsAutomatically", this.javaScriptCanOpenWindowsAutomatically);
        map.put("mediaPlaybackRequiresUserGesture", this.mediaPlaybackRequiresUserGesture);
        map.put("minimumFontSize", this.minimumFontSize);
        map.put("verticalScrollBarEnabled", this.verticalScrollBarEnabled);
        map.put("horizontalScrollBarEnabled", this.horizontalScrollBarEnabled);
        map.put("resourceCustomSchemes", this.resourceCustomSchemes);
        map.put("contentBlockers", this.contentBlockers);
        map.put("preferredContentMode", this.preferredContentMode);
        map.put("useShouldInterceptAjaxRequest", this.useShouldInterceptAjaxRequest);
        map.put("interceptOnlyAsyncAjaxRequests", this.interceptOnlyAsyncAjaxRequests);
        map.put("useShouldInterceptFetchRequest", this.useShouldInterceptFetchRequest);
        map.put("incognito", this.incognito);
        map.put("cacheEnabled", this.cacheEnabled);
        map.put("transparentBackground", this.transparentBackground);
        map.put("disableVerticalScroll", this.disableVerticalScroll);
        map.put("disableHorizontalScroll", this.disableHorizontalScroll);
        map.put("disableContextMenu", this.disableContextMenu);
        map.put("textZoom", this.textZoom);
        map.put("clearSessionCache", this.clearSessionCache);
        map.put("builtInZoomControls", this.builtInZoomControls);
        map.put("displayZoomControls", this.displayZoomControls);
        map.put("supportZoom", this.supportZoom);
        map.put("databaseEnabled", this.databaseEnabled);
        map.put("domStorageEnabled", this.domStorageEnabled);
        map.put("useWideViewPort", this.useWideViewPort);
        map.put("safeBrowsingEnabled", this.safeBrowsingEnabled);
        map.put("mixedContentMode", this.mixedContentMode);
        map.put("allowContentAccess", this.allowContentAccess);
        map.put("allowFileAccess", this.allowFileAccess);
        map.put("allowFileAccessFromFileURLs", this.allowFileAccessFromFileURLs);
        map.put("allowUniversalAccessFromFileURLs", this.allowUniversalAccessFromFileURLs);
        map.put("appCachePath", this.appCachePath);
        map.put("blockNetworkImage", this.blockNetworkImage);
        map.put("blockNetworkLoads", this.blockNetworkLoads);
        map.put("cacheMode", this.cacheMode);
        map.put("cursiveFontFamily", this.cursiveFontFamily);
        map.put("defaultFixedFontSize", this.defaultFixedFontSize);
        map.put("defaultFontSize", this.defaultFontSize);
        map.put("defaultTextEncodingName", this.defaultTextEncodingName);
        map.put("disabledActionModeMenuItems", this.disabledActionModeMenuItems);
        map.put("fantasyFontFamily", this.fantasyFontFamily);
        map.put("fixedFontFamily", this.fixedFontFamily);
        map.put("forceDark", this.forceDark);
        map.put("forceDarkStrategy", this.forceDarkStrategy);
        map.put("geolocationEnabled", this.geolocationEnabled);
        map.put("layoutAlgorithm", getLayoutAlgorithm());
        map.put("loadWithOverviewMode", this.loadWithOverviewMode);
        map.put("loadsImagesAutomatically", this.loadsImagesAutomatically);
        map.put("minimumLogicalFontSize", this.minimumLogicalFontSize);
        map.put("initialScale", this.initialScale);
        map.put("needInitialFocus", this.needInitialFocus);
        map.put("offscreenPreRaster", this.offscreenPreRaster);
        map.put("sansSerifFontFamily", this.sansSerifFontFamily);
        map.put("serifFontFamily", this.serifFontFamily);
        map.put("standardFontFamily", this.standardFontFamily);
        map.put("saveFormData", this.saveFormData);
        map.put("thirdPartyCookiesEnabled", this.thirdPartyCookiesEnabled);
        map.put("hardwareAcceleration", this.hardwareAcceleration);
        map.put("supportMultipleWindows", this.supportMultipleWindows);
        Pattern pattern = this.regexToCancelSubFramesLoading;
        map.put("regexToCancelSubFramesLoading", pattern != null ? pattern.pattern() : null);
        Pattern pattern2 = this.regexToAllowSyncUrlLoading;
        map.put("regexToAllowSyncUrlLoading", pattern2 != null ? pattern2.pattern() : null);
        map.put("overScrollMode", this.overScrollMode);
        map.put("networkAvailable", this.networkAvailable);
        map.put("scrollBarStyle", this.scrollBarStyle);
        map.put("verticalScrollbarPosition", this.verticalScrollbarPosition);
        map.put("scrollBarDefaultDelayBeforeFade", this.scrollBarDefaultDelayBeforeFade);
        map.put("scrollbarFadingEnabled", this.scrollbarFadingEnabled);
        map.put("scrollBarFadeDuration", this.scrollBarFadeDuration);
        map.put("rendererPriorityPolicy", this.rendererPriorityPolicy);
        map.put("useShouldInterceptRequest", this.useShouldInterceptRequest);
        map.put("useOnRenderProcessGone", this.useOnRenderProcessGone);
        map.put("disableDefaultErrorPage", this.disableDefaultErrorPage);
        map.put("useHybridComposition", this.useHybridComposition);
        map.put("verticalScrollbarThumbColor", this.verticalScrollbarThumbColor);
        map.put("verticalScrollbarTrackColor", this.verticalScrollbarTrackColor);
        map.put("horizontalScrollbarThumbColor", this.horizontalScrollbarThumbColor);
        map.put("horizontalScrollbarTrackColor", this.horizontalScrollbarTrackColor);
        map.put("algorithmicDarkeningAllowed", this.algorithmicDarkeningAllowed);
        map.put("enterpriseAuthenticationAppLinkPolicyEnabled", this.enterpriseAuthenticationAppLinkPolicyEnabled);
        map.put("allowBackgroundAudioPlaying", this.allowBackgroundAudioPlaying);
        map.put("defaultVideoPoster", this.defaultVideoPoster);
        map.put("requestedWithHeaderOriginAllowList", this.requestedWithHeaderOriginAllowList != null ? new ArrayList(this.requestedWithHeaderOriginAllowList) : null);
        map.put("javaScriptHandlersOriginAllowList", this.javaScriptHandlersOriginAllowList != null ? new ArrayList<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings.1
            {
                Iterator<Pattern> it = InAppWebViewSettings.this.javaScriptHandlersOriginAllowList.iterator();
                while (it.hasNext()) {
                    add(it.next().pattern());
                }
            }
        } : null);
        map.put("javaScriptHandlersForMainFrameOnly", this.javaScriptHandlersForMainFrameOnly);
        map.put("javaScriptBridgeEnabled", this.javaScriptBridgeEnabled);
        map.put("javaScriptBridgeOriginAllowList", this.javaScriptBridgeOriginAllowList != null ? new ArrayList(this.javaScriptBridgeOriginAllowList) : null);
        map.put("javaScriptBridgeForMainFrameOnly", this.javaScriptBridgeForMainFrameOnly);
        map.put("pluginScriptsOriginAllowList", this.pluginScriptsOriginAllowList != null ? new ArrayList(this.pluginScriptsOriginAllowList) : null);
        map.put("pluginScriptsForMainFrameOnly", this.pluginScriptsForMainFrameOnly);
        map.put("isUserInteractionEnabled", this.isUserInteractionEnabled);
        map.put(ViewHierarchyNode.JsonKeys.ALPHA, this.alpha);
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(InAppWebViewInterface inAppWebViewInterface) {
        int iD;
        boolean zG;
        Map<String, Object> map = toMap();
        if (inAppWebViewInterface instanceof InAppWebView) {
            InAppWebView inAppWebView = (InAppWebView) inAppWebViewInterface;
            map.put(ViewHierarchyNode.JsonKeys.ALPHA, Float.valueOf(inAppWebView.getAlpha()));
            WebSettings settings = inAppWebView.getSettings();
            map.put("userAgent", settings.getUserAgentString());
            map.put("javaScriptEnabled", Boolean.valueOf(settings.getJavaScriptEnabled()));
            map.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(settings.getJavaScriptCanOpenWindowsAutomatically()));
            map.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(settings.getMediaPlaybackRequiresUserGesture()));
            map.put("minimumFontSize", Integer.valueOf(settings.getMinimumFontSize()));
            map.put("verticalScrollBarEnabled", Boolean.valueOf(inAppWebView.isVerticalScrollBarEnabled()));
            map.put("horizontalScrollBarEnabled", Boolean.valueOf(inAppWebView.isHorizontalScrollBarEnabled()));
            map.put("textZoom", Integer.valueOf(settings.getTextZoom()));
            map.put("builtInZoomControls", Boolean.valueOf(settings.getBuiltInZoomControls()));
            map.put("supportZoom", Boolean.valueOf(settings.supportZoom()));
            map.put("displayZoomControls", Boolean.valueOf(settings.getDisplayZoomControls()));
            map.put("databaseEnabled", Boolean.valueOf(settings.getDatabaseEnabled()));
            map.put("domStorageEnabled", Boolean.valueOf(settings.getDomStorageEnabled()));
            map.put("useWideViewPort", Boolean.valueOf(settings.getUseWideViewPort()));
            if (d.a("SAFE_BROWSING_ENABLE")) {
                C0431b c0431b = w.f6287b;
                if (c0431b.a()) {
                    zG = settings.getSafeBrowsingEnabled();
                } else {
                    if (!c0431b.b()) {
                        throw w.a();
                    }
                    zG = q.a(settings).g();
                }
                map.put("safeBrowsingEnabled", Boolean.valueOf(zG));
            } else if (Build.VERSION.SDK_INT >= 26) {
                map.put("safeBrowsingEnabled", Boolean.valueOf(settings.getSafeBrowsingEnabled()));
            }
            int i7 = Build.VERSION.SDK_INT;
            map.put("mixedContentMode", Integer.valueOf(settings.getMixedContentMode()));
            map.put("allowContentAccess", Boolean.valueOf(settings.getAllowContentAccess()));
            map.put("allowFileAccess", Boolean.valueOf(settings.getAllowFileAccess()));
            map.put("allowFileAccessFromFileURLs", Boolean.valueOf(settings.getAllowFileAccessFromFileURLs()));
            map.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(settings.getAllowUniversalAccessFromFileURLs()));
            map.put("blockNetworkImage", Boolean.valueOf(settings.getBlockNetworkImage()));
            map.put("blockNetworkLoads", Boolean.valueOf(settings.getBlockNetworkLoads()));
            map.put("cacheMode", Integer.valueOf(settings.getCacheMode()));
            map.put("cursiveFontFamily", settings.getCursiveFontFamily());
            map.put("defaultFixedFontSize", Integer.valueOf(settings.getDefaultFixedFontSize()));
            map.put("defaultFontSize", Integer.valueOf(settings.getDefaultFontSize()));
            map.put("defaultTextEncodingName", settings.getDefaultTextEncodingName());
            if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                w.f6288c.getClass();
                map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
            }
            map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
            map.put("fantasyFontFamily", settings.getFantasyFontFamily());
            map.put("fixedFontFamily", settings.getFixedFontFamily());
            if (d.a("FORCE_DARK")) {
                C0431b c0431b2 = w.f6274H;
                if (c0431b2.a()) {
                    iD = settings.getForceDark();
                } else {
                    if (!c0431b2.b()) {
                        throw w.a();
                    }
                    iD = q.a(settings).d();
                }
                map.put("forceDark", Integer.valueOf(iD));
            } else if (i7 >= 29) {
                map.put("forceDark", Integer.valueOf(settings.getForceDark()));
            }
            if (d.a("FORCE_DARK_STRATEGY")) {
                if (!w.f6275I.b()) {
                    throw w.a();
                }
                map.put("forceDarkStrategy", Integer.valueOf(q.a(settings).d()));
            }
            map.put("layoutAlgorithm", settings.getLayoutAlgorithm().name());
            map.put("loadWithOverviewMode", Boolean.valueOf(settings.getLoadWithOverviewMode()));
            map.put("loadsImagesAutomatically", Boolean.valueOf(settings.getLoadsImagesAutomatically()));
            map.put("minimumLogicalFontSize", Integer.valueOf(settings.getMinimumLogicalFontSize()));
            if (d.a("OFF_SCREEN_PRERASTER")) {
                w.f6286a.getClass();
                map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
            } else {
                map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
            }
            map.put("sansSerifFontFamily", settings.getSansSerifFontFamily());
            map.put("serifFontFamily", settings.getSerifFontFamily());
            map.put("standardFontFamily", settings.getStandardFontFamily());
            map.put("saveFormData", Boolean.valueOf(settings.getSaveFormData()));
            map.put("supportMultipleWindows", Boolean.valueOf(settings.supportMultipleWindows()));
            map.put("overScrollMode", Integer.valueOf(inAppWebView.getOverScrollMode()));
            map.put("scrollBarStyle", Integer.valueOf(inAppWebView.getScrollBarStyle()));
            map.put("verticalScrollbarPosition", Integer.valueOf(inAppWebView.getVerticalScrollbarPosition()));
            map.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(inAppWebView.getScrollBarDefaultDelayBeforeFade()));
            map.put("scrollbarFadingEnabled", Boolean.valueOf(inAppWebView.isScrollbarFadingEnabled()));
            map.put("scrollBarFadeDuration", Integer.valueOf(inAppWebView.getScrollBarFadeDuration()));
            if (i7 >= 26) {
                HashMap map2 = new HashMap();
                map2.put("rendererRequestedPriority", Integer.valueOf(inAppWebView.getRendererRequestedPriority()));
                map2.put("waivedWhenNotVisible", Boolean.valueOf(inAppWebView.getRendererPriorityWaivedWhenNotVisible()));
                map.put("rendererPriorityPolicy", map2);
            }
            if (d.a("ALGORITHMIC_DARKENING") && i7 >= 29) {
                if (!w.f6271E.b()) {
                    throw w.a();
                }
                map.put("algorithmicDarkeningAllowed", Boolean.valueOf(q.a(settings).i()));
            }
            if (d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
                if (!w.f6280N.b()) {
                    throw w.a();
                }
                map.put("enterpriseAuthenticationAppLinkPolicyEnabled", Boolean.valueOf(q.a(settings).c()));
            }
            if (d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
                if (!w.f6282P.b()) {
                    throw w.a();
                }
                map.put("requestedWithHeaderOriginAllowList", new ArrayList(q.a(settings).f()));
            }
        }
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<InAppWebViewInterface> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                switch (key) {
                    case "pluginScriptsOriginAllowList":
                        this.pluginScriptsOriginAllowList = new HashSet((List) value);
                        break;
                    case "disableHorizontalScroll":
                        this.disableHorizontalScroll = (Boolean) value;
                        break;
                    case "scrollBarDefaultDelayBeforeFade":
                        this.scrollBarDefaultDelayBeforeFade = (Integer) value;
                        break;
                    case "useWideViewPort":
                        this.useWideViewPort = (Boolean) value;
                        break;
                    case "allowFileAccessFromFileURLs":
                        this.allowFileAccessFromFileURLs = (Boolean) value;
                        break;
                    case "defaultFontSize":
                        this.defaultFontSize = (Integer) value;
                        break;
                    case "javaScriptHandlersOriginAllowList":
                        this.javaScriptHandlersOriginAllowList = new HashSet();
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            this.javaScriptHandlersOriginAllowList.add(Pattern.compile((String) it.next()));
                        }
                        break;
                    case "supportZoom":
                        this.supportZoom = (Boolean) value;
                        break;
                    case "scrollbarFadingEnabled":
                        this.scrollbarFadingEnabled = (Boolean) value;
                        break;
                    case "defaultTextEncodingName":
                        this.defaultTextEncodingName = (String) value;
                        break;
                    case "needInitialFocus":
                        this.needInitialFocus = (Boolean) value;
                        break;
                    case "pluginScriptsForMainFrameOnly":
                        this.pluginScriptsForMainFrameOnly = (Boolean) value;
                        break;
                    case "useShouldOverrideUrlLoading":
                        this.useShouldOverrideUrlLoading = (Boolean) value;
                        break;
                    case "preferredContentMode":
                        this.preferredContentMode = (Integer) value;
                        break;
                    case "allowContentAccess":
                        this.allowContentAccess = (Boolean) value;
                        break;
                    case "fixedFontFamily":
                        this.fixedFontFamily = (String) value;
                        break;
                    case "builtInZoomControls":
                        this.builtInZoomControls = (Boolean) value;
                        break;
                    case "javaScriptEnabled":
                        this.javaScriptEnabled = (Boolean) value;
                        break;
                    case "hardwareAcceleration":
                        this.hardwareAcceleration = (Boolean) value;
                        break;
                    case "networkAvailable":
                        this.networkAvailable = (Boolean) value;
                        break;
                    case "useShouldInterceptFetchRequest":
                        this.useShouldInterceptFetchRequest = (Boolean) value;
                        break;
                    case "loadsImagesAutomatically":
                        this.loadsImagesAutomatically = (Boolean) value;
                        break;
                    case "resourceCustomSchemes":
                        this.resourceCustomSchemes = (List) value;
                        break;
                    case "disabledActionModeMenuItems":
                        this.disabledActionModeMenuItems = (Integer) value;
                        break;
                    case "incognito":
                        this.incognito = (Boolean) value;
                        break;
                    case "allowBackgroundAudioPlaying":
                        this.allowBackgroundAudioPlaying = (Boolean) value;
                        break;
                    case "webViewAssetLoader":
                        this.webViewAssetLoader = (Map) value;
                        break;
                    case "overScrollMode":
                        this.overScrollMode = (Integer) value;
                        break;
                    case "domStorageEnabled":
                        this.domStorageEnabled = (Boolean) value;
                        break;
                    case "disableContextMenu":
                        this.disableContextMenu = (Boolean) value;
                        break;
                    case "useShouldInterceptAjaxRequest":
                        this.useShouldInterceptAjaxRequest = (Boolean) value;
                        break;
                    case "textZoom":
                        this.textZoom = (Integer) value;
                        break;
                    case "interceptOnlyAsyncAjaxRequests":
                        this.interceptOnlyAsyncAjaxRequests = (Boolean) value;
                        break;
                    case "minimumFontSize":
                        this.minimumFontSize = (Integer) value;
                        break;
                    case "layoutAlgorithm":
                        setLayoutAlgorithm((String) value);
                        break;
                    case "clearCache":
                        this.clearCache = (Boolean) value;
                        break;
                    case "transparentBackground":
                        this.transparentBackground = (Boolean) value;
                        break;
                    case "enterpriseAuthenticationAppLinkPolicyEnabled":
                        this.enterpriseAuthenticationAppLinkPolicyEnabled = (Boolean) value;
                        break;
                    case "allowUniversalAccessFromFileURLs":
                        this.allowUniversalAccessFromFileURLs = (Boolean) value;
                        break;
                    case "databaseEnabled":
                        this.databaseEnabled = (Boolean) value;
                        break;
                    case "useShouldInterceptRequest":
                        this.useShouldInterceptRequest = (Boolean) value;
                        break;
                    case "cacheMode":
                        this.cacheMode = (Integer) value;
                        break;
                    case "isUserInteractionEnabled":
                        this.isUserInteractionEnabled = (Boolean) value;
                        break;
                    case "horizontalScrollBarEnabled":
                        this.horizontalScrollBarEnabled = (Boolean) value;
                        break;
                    case "scrollBarStyle":
                        this.scrollBarStyle = (Integer) value;
                        break;
                    case "initialScale":
                        this.initialScale = (Integer) value;
                        break;
                    case "verticalScrollbarPosition":
                        this.verticalScrollbarPosition = (Integer) value;
                        break;
                    case "disableVerticalScroll":
                        this.disableVerticalScroll = (Boolean) value;
                        break;
                    case "javaScriptCanOpenWindowsAutomatically":
                        this.javaScriptCanOpenWindowsAutomatically = (Boolean) value;
                        break;
                    case "horizontalScrollbarTrackColor":
                        this.horizontalScrollbarTrackColor = (String) value;
                        break;
                    case "offscreenPreRaster":
                        this.offscreenPreRaster = (Boolean) value;
                        break;
                    case "fantasyFontFamily":
                        this.fantasyFontFamily = (String) value;
                        break;
                    case "javaScriptBridgeOriginAllowList":
                        this.javaScriptBridgeOriginAllowList = new HashSet((List) value);
                        break;
                    case "rendererPriorityPolicy":
                        this.rendererPriorityPolicy = (Map) value;
                        break;
                    case "sansSerifFontFamily":
                        this.sansSerifFontFamily = (String) value;
                        break;
                    case "regexToCancelSubFramesLoading":
                        this.regexToCancelSubFramesLoading = Pattern.compile((String) value);
                        break;
                    case "alpha":
                        this.alpha = (Double) value;
                        break;
                    case "verticalScrollbarTrackColor":
                        this.verticalScrollbarTrackColor = (String) value;
                        break;
                    case "useOnDownloadStart":
                        this.useOnDownloadStart = (Boolean) value;
                        break;
                    case "forceDarkStrategy":
                        this.forceDarkStrategy = (Integer) value;
                        break;
                    case "cursiveFontFamily":
                        this.cursiveFontFamily = (String) value;
                        break;
                    case "mediaPlaybackRequiresUserGesture":
                        this.mediaPlaybackRequiresUserGesture = (Boolean) value;
                        break;
                    case "blockNetworkImage":
                        this.blockNetworkImage = (Boolean) value;
                        break;
                    case "blockNetworkLoads":
                        this.blockNetworkLoads = (Boolean) value;
                        break;
                    case "userAgent":
                        this.userAgent = (String) value;
                        break;
                    case "useOnRenderProcessGone":
                        this.useOnRenderProcessGone = (Boolean) value;
                        break;
                    case "useOnLoadResource":
                        this.useOnLoadResource = (Boolean) value;
                        break;
                    case "cacheEnabled":
                        this.cacheEnabled = (Boolean) value;
                        break;
                    case "saveFormData":
                        this.saveFormData = (Boolean) value;
                        break;
                    case "requestedWithHeaderOriginAllowList":
                        this.requestedWithHeaderOriginAllowList = new HashSet((List) value);
                        break;
                    case "useHybridComposition":
                        this.useHybridComposition = (Boolean) value;
                        break;
                    case "javaScriptBridgeEnabled":
                        this.javaScriptBridgeEnabled = (Boolean) value;
                        break;
                    case "applicationNameForUserAgent":
                        this.applicationNameForUserAgent = (String) value;
                        break;
                    case "mixedContentMode":
                        this.mixedContentMode = (Integer) value;
                        break;
                    case "javaScriptHandlersForMainFrameOnly":
                        this.javaScriptHandlersForMainFrameOnly = (Boolean) value;
                        break;
                    case "scrollBarFadeDuration":
                        this.scrollBarFadeDuration = (Integer) value;
                        break;
                    case "allowFileAccess":
                        this.allowFileAccess = (Boolean) value;
                        break;
                    case "appCachePath":
                        this.appCachePath = (String) value;
                        break;
                    case "horizontalScrollbarThumbColor":
                        this.horizontalScrollbarThumbColor = (String) value;
                        break;
                    case "regexToAllowSyncUrlLoading":
                        this.regexToAllowSyncUrlLoading = Pattern.compile((String) value);
                        break;
                    case "standardFontFamily":
                        this.standardFontFamily = (String) value;
                        break;
                    case "displayZoomControls":
                        this.displayZoomControls = (Boolean) value;
                        break;
                    case "geolocationEnabled":
                        this.geolocationEnabled = (Boolean) value;
                        break;
                    case "loadWithOverviewMode":
                        this.loadWithOverviewMode = (Boolean) value;
                        break;
                    case "safeBrowsingEnabled":
                        this.safeBrowsingEnabled = (Boolean) value;
                        break;
                    case "serifFontFamily":
                        this.serifFontFamily = (String) value;
                        break;
                    case "verticalScrollbarThumbColor":
                        this.verticalScrollbarThumbColor = (String) value;
                        break;
                    case "forceDark":
                        this.forceDark = (Integer) value;
                        break;
                    case "disableDefaultErrorPage":
                        this.disableDefaultErrorPage = (Boolean) value;
                        break;
                    case "contentBlockers":
                        this.contentBlockers = (List) value;
                        break;
                    case "supportMultipleWindows":
                        this.supportMultipleWindows = (Boolean) value;
                        break;
                    case "defaultFixedFontSize":
                        this.defaultFixedFontSize = (Integer) value;
                        break;
                    case "thirdPartyCookiesEnabled":
                        this.thirdPartyCookiesEnabled = (Boolean) value;
                        break;
                    case "minimumLogicalFontSize":
                        this.minimumLogicalFontSize = (Integer) value;
                        break;
                    case "verticalScrollBarEnabled":
                        this.verticalScrollBarEnabled = (Boolean) value;
                        break;
                    case "clearSessionCache":
                        this.clearSessionCache = (Boolean) value;
                        break;
                    case "defaultVideoPoster":
                        this.defaultVideoPoster = (byte[]) value;
                        break;
                    case "algorithmicDarkeningAllowed":
                        this.algorithmicDarkeningAllowed = (Boolean) value;
                        break;
                    case "javaScriptBridgeForMainFrameOnly":
                        this.javaScriptBridgeForMainFrameOnly = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }
}
