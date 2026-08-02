package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/model/CardScheme;", "", "toTokenTspId", "(Lcom/payair/model/CardScheme;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenMetadataMapperKt {
    public static final java.lang.String toTokenTspId(com.payair.model.CardScheme cardScheme) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardScheme, "");
        int i = com.paypal.oslo.feature.taptopay.data.payair.card.TokenMetadataMapperKt.WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
        if (i == 1) {
            return "MDES";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "VTS";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.CardScheme.values().length];
            try {
                iArr[com.payair.model.CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.CardScheme.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
