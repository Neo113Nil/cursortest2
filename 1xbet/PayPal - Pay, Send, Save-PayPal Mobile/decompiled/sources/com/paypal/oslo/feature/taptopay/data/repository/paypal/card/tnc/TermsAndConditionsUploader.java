package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsUploader;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "id", "", "termsAndConditionText", "acceptedTime", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/UploadTermsAndConditionsError;", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TermsAndConditionsUploader {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TermsAndConditionsUploader() {
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.UploadTermsAndConditionsError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Uploading TermsAndConditions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("device_wallet_id", deviceWalletServiceCardId.getId())), null, 4, null);
        arrow.core.Either right = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Upload Terms and conditions completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("device_wallet_id", deviceWalletServiceCardId.getId())), null, 4, null);
        return right;
    }
}
