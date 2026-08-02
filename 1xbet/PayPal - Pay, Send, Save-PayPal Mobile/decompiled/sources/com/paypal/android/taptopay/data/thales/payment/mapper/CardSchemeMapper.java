package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/CardSchemeMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/payment/engine/CardScheme;", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainCardScheme;", "<init>", "()V", "input", "map", "(Lcom/gemalto/mfs/mwsdk/payment/engine/CardScheme;)Lcom/paypal/android/taptopay/domain/model/CardScheme;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardSchemeMapper implements com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.CardScheme, com.paypal.android.taptopay.domain.model.CardScheme> {
    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final com.paypal.android.taptopay.domain.model.CardScheme map(com.gemalto.mfs.mwsdk.payment.engine.CardScheme input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.android.taptopay.data.thales.payment.mapper.CardSchemeMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()];
        if (i == 1) {
            return com.paypal.android.taptopay.domain.model.CardScheme.MASTERCARD;
        }
        if (i == 2) {
            return com.paypal.android.taptopay.domain.model.CardScheme.VISA;
        }
        if (i == 3) {
            return com.paypal.android.taptopay.domain.model.CardScheme.PURE;
        }
        if (i == 4) {
            return com.paypal.android.taptopay.domain.model.CardScheme.UNKNOWN;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.engine.CardScheme.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.engine.CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.engine.CardScheme.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.engine.CardScheme.PURE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.engine.CardScheme.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
