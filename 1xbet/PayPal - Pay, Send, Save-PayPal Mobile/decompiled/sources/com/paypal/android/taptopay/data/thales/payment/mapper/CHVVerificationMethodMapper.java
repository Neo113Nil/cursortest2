package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/CHVVerificationMethodMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/payment/CHVerificationMethod;", "Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "<init>", "()V", "input", "map", "(Lcom/gemalto/mfs/mwsdk/payment/CHVerificationMethod;)Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CHVVerificationMethodMapper implements com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod> {
    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod map(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.android.taptopay.data.thales.payment.mapper.CHVVerificationMethodMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()];
        if (i == 1) {
            return com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.BIOMETRICS;
        }
        if (i == 2) {
            return com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.KEYGUARD;
        }
        if (i == 3) {
            return com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.PIN;
        }
        if (i == 4) {
            return com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.NONE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
