package org.betup.ui.dialogs.offer.bridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.google.android.gms.appinvite.PreviewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferWebViewBridgeImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\r\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeImpl;", "", "handler", "Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;)V", "mainHandler", "Landroid/os/Handler;", PreviewActivity.ON_CLICK_LISTENER_CLOSE, "", FirebaseAnalytics.Event.PURCHASE, "productId", "", "watchVideo", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferWebViewBridgeImpl {
    public static final int $stable = 8;
    private final OfferWebViewBridgeHandler handler;
    private final Handler mainHandler;

    public OfferWebViewBridgeImpl(OfferWebViewBridgeHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$0(OfferWebViewBridgeImpl offerWebViewBridgeImpl) {
        offerWebViewBridgeImpl.handler.onClose();
    }

    @JavascriptInterface
    public final void close() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OfferWebViewBridgeImpl.close$lambda$0(OfferWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchase$lambda$1(OfferWebViewBridgeImpl offerWebViewBridgeImpl) {
        offerWebViewBridgeImpl.handler.onPurchaseRequest();
    }

    @JavascriptInterface
    public final void purchase() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfferWebViewBridgeImpl.purchase$lambda$1(OfferWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchase$lambda$2(OfferWebViewBridgeImpl offerWebViewBridgeImpl) {
        offerWebViewBridgeImpl.handler.onPurchaseRequest();
    }

    @JavascriptInterface
    public final void purchase(String productId) {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                OfferWebViewBridgeImpl.purchase$lambda$2(OfferWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void watchVideo$lambda$3(OfferWebViewBridgeImpl offerWebViewBridgeImpl) {
        offerWebViewBridgeImpl.handler.onPurchaseRequest();
    }

    @JavascriptInterface
    public final void watchVideo() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfferWebViewBridgeImpl.watchVideo$lambda$3(OfferWebViewBridgeImpl.this);
            }
        });
    }
}
