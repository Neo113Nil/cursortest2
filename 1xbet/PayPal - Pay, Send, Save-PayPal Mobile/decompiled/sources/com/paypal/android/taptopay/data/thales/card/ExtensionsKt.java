package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a6\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\r\u0010\u0005\u001a \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0010\u0010\u0005"}, d2 = {"Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;", "Lcom/paypal/android/taptopay/domain/Result;", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardDetails;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "getCardDetails", "(Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardState;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard$Status;", "digitalizedCardStateMapper", "getCardStatus", "(Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;Lcom/paypal/android/taptopay/domain/core/Mapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;", "getThalesCardStatus", "", "Lcom/paypal/android/taptopay/domain/model/card/IsDefaultCardError;", "isDefault"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final java.lang.Object isDefault(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.IsDefaultCardError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ExtensionsKt$isDefault$2(digitalizedCard, null), continuation);
    }

    public static final java.lang.Object getCardDetails(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getCardDetails$2(digitalizedCard, null), continuation);
    }

    public static /* synthetic */ java.lang.Object getCardStatus$default(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.paypal.android.taptopay.domain.core.Mapper mapper, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mapper = new com.paypal.android.taptopay.data.thales.payment.mapper.DigitalizedCardStateMapper();
        }
        return getCardStatus(digitalizedCard, mapper, continuation);
    }

    public static final java.lang.Object getCardStatus(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState, com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status> mapper, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getCardStatus$2(digitalizedCard, mapper, null), continuation);
    }

    public static final java.lang.Object getThalesCardStatus(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2(digitalizedCard, null), continuation);
    }
}
