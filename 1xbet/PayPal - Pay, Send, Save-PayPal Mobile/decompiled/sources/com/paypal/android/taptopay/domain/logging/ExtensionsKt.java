package com.paypal.android.taptopay.domain.logging;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0006"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "", "", "toLogAttributes", "(Lcom/paypal/android/taptopay/domain/model/card/GetCardError;)Ljava/util/Map;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardMetaDataError;", "(Lcom/paypal/android/taptopay/domain/model/card/GetCardMetaDataError;)Ljava/util/Map;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final java.util.Map<java.lang.String, java.lang.String> toLogAttributes(com.paypal.android.taptopay.domain.model.card.GetCardError getCardError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardError, "");
        if (getCardError instanceof com.paypal.android.taptopay.domain.model.card.GetCardError.CardNotFound) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "Card not found"));
        }
        if (!(getCardError instanceof com.paypal.android.taptopay.domain.model.card.GetCardError.DefaultError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        com.paypal.android.taptopay.domain.model.card.GetCardError.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.card.GetCardError.DefaultError) getCardError;
        java.lang.Throwable throwable = defaultError.getThrowable();
        pairArr[0] = kotlin.TuplesKt.to("error", throwable != null ? throwable.getMessage() : null);
        pairArr[1] = kotlin.TuplesKt.to("debugMessage", defaultError.getDebugMessage());
        return kotlin.collections.MapsKt.mapOf(pairArr);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> toLogAttributes(com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError getCardMetaDataError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardMetaDataError, "");
        if (!(getCardMetaDataError instanceof com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError.DefaultError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError.DefaultError) getCardMetaDataError;
        java.lang.Throwable throwable = defaultError.getThrowable();
        pairArr[0] = kotlin.TuplesKt.to("error", throwable != null ? throwable.getMessage() : null);
        pairArr[1] = kotlin.TuplesKt.to("debugMessage", defaultError.getDebugMessage());
        return kotlin.collections.MapsKt.mapOf(pairArr);
    }
}
