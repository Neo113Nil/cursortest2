package com.zettle.sdk.core.payment;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator;", "", "", "amount", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "validate", "(J)Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "Companion", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface PaymentTypeValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Companion INSTANCE = com.zettle.sdk.core.payment.PaymentTypeValidator.Companion.getHighSpeedVideoSizes;

    com.zettle.sdk.core.payment.PaymentTypeValidator.Result validate(long amount);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "", "<init>", "()V", "AboveMaximum", "BelowMinimum", "EmptyConfigurationForCurrency", "EmptyConfigurationForPaymentType", "EmptyMaximumAmount", "EmptyMinimumAmount", "NotAuthenticated", "Ok", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$AboveMaximum;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$BelowMinimum;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyConfigurationForCurrency;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyConfigurationForPaymentType;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyMaximumAmount;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyMinimumAmount;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$NotAuthenticated;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$Ok;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$Ok;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Ok extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Result.Ok INSTANCE = new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.Ok();

            private Ok() {
                super(null);
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$NotAuthenticated;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NotAuthenticated extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Result.NotAuthenticated INSTANCE = new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.NotAuthenticated();

            private NotAuthenticated() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyConfigurationForCurrency;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class EmptyConfigurationForCurrency extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyConfigurationForCurrency INSTANCE = new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyConfigurationForCurrency();

            private EmptyConfigurationForCurrency() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyConfigurationForPaymentType;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class EmptyConfigurationForPaymentType extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyConfigurationForPaymentType INSTANCE = new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyConfigurationForPaymentType();

            private EmptyConfigurationForPaymentType() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyMinimumAmount;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class EmptyMinimumAmount extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyMinimumAmount INSTANCE = new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyMinimumAmount();

            private EmptyMinimumAmount() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$EmptyMaximumAmount;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class EmptyMaximumAmount extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            public static final com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyMaximumAmount INSTANCE = new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyMaximumAmount();

            private EmptyMaximumAmount() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$AboveMaximum;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "", "amount", "<init>", "(J)V", "J", "getAmount", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AboveMaximum extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            private final long amount;

            public AboveMaximum(long j) {
                super(null);
                this.amount = j;
            }

            public final long getAmount() {
                return this.amount;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result$BelowMinimum;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "", "amount", "<init>", "(J)V", "J", "getAmount", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BelowMinimum extends com.zettle.sdk.core.payment.PaymentTypeValidator.Result {
            private final long amount;

            public BelowMinimum(long j) {
                super(null);
                this.amount = j;
            }

            public final long getAmount() {
                return this.amount;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.payment.PaymentTypeValidator.Companion getHighSpeedVideoSizes = new com.zettle.sdk.core.payment.PaymentTypeValidator.Companion();

        private Companion() {
        }
    }
}
