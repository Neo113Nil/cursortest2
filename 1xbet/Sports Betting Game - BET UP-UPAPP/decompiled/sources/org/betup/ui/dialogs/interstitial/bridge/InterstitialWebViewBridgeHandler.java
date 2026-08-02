package org.betup.ui.dialogs.interstitial.bridge;

import kotlin.Metadata;

/* compiled from: InterstitialWebViewBridgeHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "", "onPresentationStarted", "", "onClose", "onSkip", "onClick", "targetUrl", "", "onVideoComplete", "canSkip", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface InterstitialWebViewBridgeHandler {

    /* compiled from: InterstitialWebViewBridgeHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean canSkip(InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler) {
            return true;
        }

        public static void onPresentationStarted(InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler) {
        }
    }

    boolean canSkip();

    void onClick(String targetUrl);

    void onClose();

    void onPresentationStarted();

    void onSkip();

    void onVideoComplete();
}
