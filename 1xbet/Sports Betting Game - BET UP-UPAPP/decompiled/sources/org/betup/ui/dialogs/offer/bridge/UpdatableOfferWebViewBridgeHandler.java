package org.betup.ui.dialogs.offer.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.MethodDelegation;

/* compiled from: UpdatableOfferWebViewBridgeHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0005\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/offer/bridge/UpdatableOfferWebViewBridgeHandler;", "Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", "initial", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;)V", MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX, "getDelegate", "()Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", "setDelegate", "onClose", "", "onPurchaseRequest", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatableOfferWebViewBridgeHandler implements OfferWebViewBridgeHandler {
    public static final int $stable = 8;
    private volatile OfferWebViewBridgeHandler delegate;

    public UpdatableOfferWebViewBridgeHandler(OfferWebViewBridgeHandler initial) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        this.delegate = initial;
    }

    public final OfferWebViewBridgeHandler getDelegate() {
        return this.delegate;
    }

    public final void setDelegate(OfferWebViewBridgeHandler offerWebViewBridgeHandler) {
        Intrinsics.checkNotNullParameter(offerWebViewBridgeHandler, "<set-?>");
        this.delegate = offerWebViewBridgeHandler;
    }

    @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
    public void onClose() {
        this.delegate.onClose();
    }

    @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
    public void onPurchaseRequest() {
        this.delegate.onPurchaseRequest();
    }
}
