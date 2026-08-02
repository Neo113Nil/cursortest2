package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/notifier/CardSuspendedNotifier;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardTokenSuspender;", "cardTokenSuspender", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardTokenSuspender;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/NotifyCardSuspendError;", "", "invoke$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardTokenSuspender;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardSuspendedNotifier {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardSuspendedNotifier(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender cardTokenSuspender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardTokenSuspender, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardTokenSuspender;
    }

    public final java.lang.Object invoke$taptopay_prodRelease(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardSuspendError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting CardSuspendedNotifier", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId.getId())), null, 4, null);
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(deviceWalletServiceCardId.getId(), continuation);
    }
}
