package org.betup.ui.dialogs.offer.bridge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferWebViewBridgeHandlers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0002\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/betup/ui/dialogs/offer/bridge/LambdaOfferWebViewBridgeHandler;", "Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", "onClose", "Lkotlin/Function0;", "", "onPurchaseRequest", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LambdaOfferWebViewBridgeHandler implements OfferWebViewBridgeHandler {
    public static final int $stable = 0;
    private final Function0<Unit> onClose;
    private final Function0<Unit> onPurchaseRequest;

    public LambdaOfferWebViewBridgeHandler(Function0<Unit> onClose, Function0<Unit> onPurchaseRequest) {
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onPurchaseRequest, "onPurchaseRequest");
        this.onClose = onClose;
        this.onPurchaseRequest = onPurchaseRequest;
    }

    @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
    public void onClose() {
        this.onClose.invoke();
    }

    @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
    public void onPurchaseRequest() {
        this.onPurchaseRequest.invoke();
    }
}
