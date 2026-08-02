package org.betup.ui.dialogs.interstitial.bridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.google.android.gms.appinvite.PreviewActivity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialWebViewBridgeImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0007J\b\u0010\u0018\u001a\u00020\u0007H\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\b\u0010\u001a\u001a\u00020\tH\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\tH\u0007J\b\u0010\u001d\u001a\u00020\fH\u0007J\b\u0010\u001e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeImpl;", "", "handler", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "dismissPolicy", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "allowSkip", "", "requireClickToClose", "skipAfterSeconds", "", "metadataJson", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;Ljava/lang/String;ZZILjava/lang/String;)V", "mainHandler", "Landroid/os/Handler;", PreviewActivity.ON_CLICK_LISTENER_CLOSE, "", "skip", "click", "url", "trackVideoComplete", "getLanguage", "isSkipEnabled", "canSkip", "isCountdownComplete", "isClickRequiredToClose", "getSkipAfterSeconds", "getCampaignMetadata", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialWebViewBridgeImpl {
    public static final int $stable = 8;
    private final boolean allowSkip;
    private final InterstitialDismissPolicy dismissPolicy;
    private final InterstitialWebViewBridgeHandler handler;
    private final String languageCode;
    private final Handler mainHandler;
    private final String metadataJson;
    private final boolean requireClickToClose;
    private final int skipAfterSeconds;

    public InterstitialWebViewBridgeImpl(InterstitialWebViewBridgeHandler handler, InterstitialDismissPolicy dismissPolicy, String languageCode, boolean z, boolean z2, int i, String metadataJson) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(dismissPolicy, "dismissPolicy");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        this.handler = handler;
        this.dismissPolicy = dismissPolicy;
        this.languageCode = languageCode;
        this.allowSkip = z;
        this.requireClickToClose = z2;
        this.skipAfterSeconds = i;
        this.metadataJson = metadataJson;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$0(InterstitialWebViewBridgeImpl interstitialWebViewBridgeImpl) {
        interstitialWebViewBridgeImpl.handler.onClose();
    }

    @JavascriptInterface
    public final void close() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialWebViewBridgeImpl.close$lambda$0(InterstitialWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void skip$lambda$1(InterstitialWebViewBridgeImpl interstitialWebViewBridgeImpl) {
        interstitialWebViewBridgeImpl.handler.onSkip();
    }

    @JavascriptInterface
    public final void skip() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialWebViewBridgeImpl.skip$lambda$1(InterstitialWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void click$lambda$3(InterstitialWebViewBridgeImpl interstitialWebViewBridgeImpl, String str) {
        String obj;
        InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler = interstitialWebViewBridgeImpl.handler;
        String str2 = null;
        if (str != null && (obj = StringsKt.trim((CharSequence) str).toString()) != null && !StringsKt.isBlank(obj)) {
            str2 = obj;
        }
        interstitialWebViewBridgeHandler.onClick(str2);
    }

    @JavascriptInterface
    public final void click(final String url) {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialWebViewBridgeImpl.click$lambda$3(InterstitialWebViewBridgeImpl.this, url);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackVideoComplete$lambda$4(InterstitialWebViewBridgeImpl interstitialWebViewBridgeImpl) {
        interstitialWebViewBridgeImpl.handler.onVideoComplete();
    }

    @JavascriptInterface
    public final void trackVideoComplete() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialWebViewBridgeImpl.trackVideoComplete$lambda$4(InterstitialWebViewBridgeImpl.this);
            }
        });
    }

    @JavascriptInterface
    /* renamed from: getLanguage, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @JavascriptInterface
    /* renamed from: isSkipEnabled, reason: from getter */
    public final boolean getAllowSkip() {
        return this.allowSkip;
    }

    @JavascriptInterface
    public final boolean canSkip() {
        return this.dismissPolicy.canDismiss();
    }

    @JavascriptInterface
    public final boolean isCountdownComplete() {
        return this.dismissPolicy.getCountdownDone();
    }

    @JavascriptInterface
    /* renamed from: isClickRequiredToClose, reason: from getter */
    public final boolean getRequireClickToClose() {
        return this.requireClickToClose;
    }

    @JavascriptInterface
    public final int getSkipAfterSeconds() {
        return this.skipAfterSeconds;
    }

    @JavascriptInterface
    /* renamed from: getCampaignMetadata, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }
}
