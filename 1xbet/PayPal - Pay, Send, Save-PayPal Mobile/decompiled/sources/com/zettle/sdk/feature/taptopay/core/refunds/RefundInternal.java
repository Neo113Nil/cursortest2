package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \f2\u00020\u0001:\u0003\r\f\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal;", "", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;", "action", "", "dispatchAction", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;)V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Companion", "Action", "Effects"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RefundInternal {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void dispatchAction(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action action);

    kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> getEffects();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "", "<init>", "()V", "PaymentInfoRetrieveFailed", "PaymentInfoRetrieved", "PaymentRefundFailed", "PaymentRefunded", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentInfoRetrieveFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentInfoRetrieved;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentRefundFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentRefunded;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Effects {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentInfoRetrieved;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "getCardPaymentPayload", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PaymentInfoRetrieved extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects {
            private final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentInfoRetrieved(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
                this.cardPaymentPayload = cardPaymentPayload;
            }

            public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload getCardPaymentPayload() {
                return this.cardPaymentPayload;
            }
        }

        private Effects() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentInfoRetrieveFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PaymentInfoRetrieveFailed extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects {
            private final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentInfoRetrieveFailed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason refundFailureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundFailureReason, "");
                this.reason = refundFailureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason getReason() {
                return this.reason;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentRefunded;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PaymentRefunded extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects {
            private final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload payload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentRefunded(com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload refundPayload) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundPayload, "");
                this.payload = refundPayload;
            }

            public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload getPayload() {
                return this.payload;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects$PaymentRefundFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PaymentRefundFailed extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects {
            private final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentRefundFailed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason refundFailureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundFailureReason, "");
                this.reason = refundFailureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason getReason() {
                return this.reason;
            }
        }

        public /* synthetic */ Effects(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;", "", "<init>", "()V", "DoRefund", "RetrievePaymentInfo", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action$DoRefund;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action$RetrievePaymentInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {
        private Action() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action$RetrievePaymentInfo;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;", "", "paymentReferenceId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getPaymentReferenceId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RetrievePaymentInfo extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action {
            private final java.lang.String paymentReferenceId;

            public final java.lang.String getPaymentReferenceId() {
                return this.paymentReferenceId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetrievePaymentInfo(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.paymentReferenceId = str;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action$DoRefund;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "", "amount", "", "refundReferenceId", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "getCardPaymentPayload", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "Ljava/lang/String;", "getRefundReferenceId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DoRefund extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action {
            private final java.lang.Long amount;
            private final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload;
            private final java.lang.String refundReferenceId;

            public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload getCardPaymentPayload() {
                return this.cardPaymentPayload;
            }

            public final java.lang.Long getAmount() {
                return this.amount;
            }

            public final java.lang.String getRefundReferenceId() {
                return this.refundReferenceId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoRefund(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, java.lang.Long l, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
                this.cardPaymentPayload = cardPaymentPayload;
                this.amount = l;
                this.refundReferenceId = str;
            }
        }

        public /* synthetic */ Action(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Companion();

        private Companion() {
        }
    }
}
