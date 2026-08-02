package com.zettle.sdk.core.payment;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Companion;", "Lcom/zettle/android/entities/PaymentType;", "type", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator;", "create", "(Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Companion;Lcom/zettle/android/entities/PaymentType;Lcom/zettle/sdk/core/user/UserModule;)Lcom/zettle/sdk/core/payment/PaymentTypeValidator;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PaymentTypeValidatorKt {
    public static final com.zettle.sdk.core.payment.PaymentTypeValidator create(com.zettle.sdk.core.payment.PaymentTypeValidator.Companion companion, com.zettle.android.entities.PaymentType paymentType, com.zettle.sdk.core.user.UserModule userModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        return new com.zettle.sdk.core.payment.PaymentTypeValidatorImpl(paymentType, userModule);
    }

    public static final /* synthetic */ java.lang.String access$toConfigKey(com.zettle.android.entities.PaymentType paymentType) {
        int i = com.zettle.sdk.core.payment.PaymentTypeValidatorKt.WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i == 1) {
            return "EMV";
        }
        if (i == 2) {
            return "KLARNA_INSTORE";
        }
        if (i == 3) {
            return "PAYPAL_QRC";
        }
        if (i == 4) {
            return "VENMO_QRC";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentType ");
        sb.append(paymentType);
        sb.append(" not supported");
        throw new java.lang.AssertionError(sb.toString());
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.android.entities.PaymentType.values().length];
            try {
                iArr[com.zettle.android.entities.PaymentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.android.entities.PaymentType.KLARNA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zettle.android.entities.PaymentType.PAYPAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.zettle.android.entities.PaymentType.VENMO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
