package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0081\b\u0018\u0000 g2\u00020\u0001:\u0002hgBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015BÅ\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u0014\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u00105J~\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010&J'\u0010E\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bN\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010.R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\r\u0010Q\u0012\u0004\bS\u0010T\u001a\u0004\bR\u00100R\u001f\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u0012\u0004\bV\u0010T\u001a\u0004\bU\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010W\u001a\u0004\bX\u00103R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u00105R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\b[\u00105R\u001a\u0010\u001b\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010\u001c\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\b_\u0010&R\u001a\u0010\u001d\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010`\u001a\u0004\b\u001d\u0010aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bb\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010G\u001a\u0004\bc\u0010&R\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\be\u0010f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "", "id", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;", "repaymentType", "", "cancelable", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "Ljava/time/Instant;", "creationDate", "paymentTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;", "paymentChannel", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/RepaymentFundingInstrument;", "fundingInstruments", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;Ljava/util/List;)V", "", "seen0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionFundingInstrument;", "transactionFundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "transactionType", "referenceId", "isCancellable", "transactionCashbackPercentage", "transactionName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "transactionImage", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component6", "()Ljava/time/Instant;", "component7", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;", "getRepaymentType", "Ljava/lang/Boolean;", "getCancelable", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "getStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAmount", "Ljava/time/Instant;", "getCreationDate", "getCreationDate$annotations", "()V", "getPaymentTime", "getPaymentTime$annotations", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;", "getPaymentChannel", "Ljava/util/List;", "getFundingInstruments", "getTransactionFundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getTransactionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getReferenceId", "Z", "()Z", "getTransactionCashbackPercentage", "getTransactionName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "getTransactionImage", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class RepaymentActivity implements com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount;
    private final java.lang.Boolean cancelable;
    private final java.time.Instant creationDate;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> fundingInstruments;
    private final java.lang.String id;
    private final boolean isCancellable;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel paymentChannel;
    private final java.time.Instant paymentTime;
    private final java.lang.String referenceId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus status;
    private final java.lang.String transactionCashbackPercentage;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage;
    private final java.lang.String transactionName;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.$r8$lambda$q1pNmen13hV7cX6TB0o_0_urq3M();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.m18152$r8$lambda$2YsjEeGIpTD7ZXs68qrx2qGTHQ();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.$r8$lambda$U4gEboJqMBvX9yN25Y0W719vUjg();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.m18153$r8$lambda$7uaTZbQLW8HaMATwahoSDX6xRE();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.values());
            return createSimpleEnumSerializer;
        }
    }), null, null, null, null, null};

    public static /* synthetic */ void getCreationDate$annotations() {
    }

    public static /* synthetic */ void getPaymentTime$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RepaymentActivity(int i, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.Instant instant, java.time.Instant instant2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel, java.util.List list, java.util.List list2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        boolean z2;
        java.util.ArrayList arrayList;
        if (191 != (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.repaymentType = repaymentType;
        this.cancelable = bool;
        this.status = repaymentStatus;
        this.amount = currencyAmount;
        this.creationDate = instant;
        if ((i & 64) == 0) {
            this.paymentTime = null;
        } else {
            this.paymentTime = instant2;
        }
        this.paymentChannel = repaymentChannel;
        if ((i & 256) == 0) {
            this.fundingInstruments = null;
        } else {
            this.fundingInstruments = list;
        }
        if ((i & 512) == 0) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list3 = this.fundingInstruments;
            if (list3 != null) {
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list4 = list3;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument repaymentFundingInstrument : list4) {
                    arrayList2.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument(repaymentFundingInstrument.getImageUrl(), repaymentFundingInstrument.getDescription(), repaymentFundingInstrument.getLastDigits()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            this.transactionFundingInstruments = arrayList;
        } else {
            this.transactionFundingInstruments = list2;
        }
        this.transactionType = (i & 1024) == 0 ? this.repaymentType.toTransactionType() : transactionType;
        this.referenceId = (i & 2048) == 0 ? getGetHighResolutionOutputSizeshNQ4ISI() : str2;
        if ((i & 4096) == 0) {
            java.lang.Boolean bool2 = this.cancelable;
            z2 = bool2 != null ? bool2.booleanValue() : false;
        } else {
            z2 = z;
        }
        this.isCancellable = z2;
        if ((i & 8192) == 0) {
            this.transactionCashbackPercentage = null;
        } else {
            this.transactionCashbackPercentage = str3;
        }
        if ((i & 16384) == 0) {
            this.transactionName = null;
        } else {
            this.transactionName = str4;
        }
        if ((i & 32768) == 0) {
            this.transactionImage = null;
        } else {
            this.transactionImage = creditImage;
        }
    }

    public RepaymentActivity(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.Instant instant, java.time.Instant instant2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentType, "");
        this.id = str;
        this.repaymentType = repaymentType;
        this.cancelable = bool;
        this.status = repaymentStatus;
        this.amount = currencyAmount;
        this.creationDate = instant;
        this.paymentTime = instant2;
        this.paymentChannel = repaymentChannel;
        this.fundingInstruments = list;
        if (list != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list2 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument repaymentFundingInstrument : list2) {
                arrayList2.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument(repaymentFundingInstrument.getImageUrl(), repaymentFundingInstrument.getDescription(), repaymentFundingInstrument.getLastDigits()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        this.transactionFundingInstruments = arrayList;
        this.transactionType = this.repaymentType.toTransactionType();
        this.referenceId = getGetHighResolutionOutputSizeshNQ4ISI();
        java.lang.Boolean bool2 = this.cancelable;
        this.isCancellable = bool2 != null ? bool2.booleanValue() : false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013a, code lost:
    
        if (r1 != (r3 != null ? r3.booleanValue() : false)) goto L41;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        java.util.ArrayList arrayList;
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getGetHighResolutionOutputSizeshNQ4ISI());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.repaymentType);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.cancelable);
        output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.status);
        output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.getCamera2StreamConfigurationMap());
        output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.getGetHighSpeedVideoFpsRangesFor());
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.paymentTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.paymentTime);
        }
        output.encodeNullableSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.paymentChannel);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.fundingInstruments != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.fundingInstruments);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9)) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments = self.getTransactionFundingInstruments();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list = self.fundingInstruments;
            if (list != null) {
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list2 = list;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument repaymentFundingInstrument : list2) {
                    arrayList2.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument(repaymentFundingInstrument.getImageUrl(), repaymentFundingInstrument.getDescription(), repaymentFundingInstrument.getLastDigits()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.getTransactionFundingInstruments());
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.getGetHighSpeedVideoFpsRanges() != self.repaymentType.toTransactionType()) {
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.getGetHighSpeedVideoFpsRanges());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !kotlin.jvm.internal.Intrinsics.areEqual(self.getGetInputFormats(), self.getGetHighResolutionOutputSizeshNQ4ISI())) {
            output.encodeStringElement(serialDesc, 11, self.getGetInputFormats());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12)) {
            boolean getHighSpeedVideoSizes = self.getGetHighSpeedVideoSizes();
            java.lang.Boolean bool = self.cancelable;
        }
        output.encodeBooleanElement(serialDesc, 12, self.getGetHighSpeedVideoSizes());
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.getGetHighSpeedVideoSizesFor() != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getGetHighSpeedVideoSizesFor());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.getGetOutputMinFrameDuration() != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getGetOutputMinFrameDuration());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.getGetInputSizeshNQ4ISI() != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, self.getGetInputSizeshNQ4ISI());
        }
    }

    public /* synthetic */ RepaymentActivity(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.Instant instant, java.time.Instant instant2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, repaymentType, bool, repaymentStatus, currencyAmount, instant, (i & 64) != 0 ? null : instant2, repaymentChannel, (i & 256) != 0 ? null : list);
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getId */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.id;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType getRepaymentType() {
        return this.repaymentType;
    }

    public final java.lang.Boolean getCancelable() {
        return this.cancelable;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus getStatus() {
        return this.status;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getAmount */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCamera2StreamConfigurationMap() {
        return this.amount;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getCreationDate */
    public final java.time.Instant getGetHighSpeedVideoFpsRangesFor() {
        return this.creationDate;
    }

    public final java.time.Instant getPaymentTime() {
        return this.paymentTime;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel getPaymentChannel() {
        return this.paymentChannel;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
        return this.transactionFundingInstruments;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getTransactionType, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getGetHighSpeedVideoFpsRanges() {
        return this.transactionType;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getReferenceId, reason: from getter */
    public final java.lang.String getGetInputFormats() {
        return this.referenceId;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: isCancellable, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.isCancellable;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getTransactionCashbackPercentage, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizesFor() {
        return this.transactionCashbackPercentage;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getTransactionName, reason: from getter */
    public final java.lang.String getGetOutputMinFrameDuration() {
        return this.transactionName;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: getTransactionImage, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getGetInputSizeshNQ4ISI() {
        return this.transactionImage;
    }

    /* renamed from: $r8$lambda$2Y-sjEeGIpTD7ZXs68qrx2qGTHQ, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18152$r8$lambda$2YsjEeGIpTD7ZXs68qrx2qGTHQ() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.time.Instant.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    /* renamed from: $r8$lambda$7uaTZbQLW8-HaMATwahoSDX6xRE, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18153$r8$lambda$7uaTZbQLW8HaMATwahoSDX6xRE() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument$$serializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$U4gEboJqMBvX9yN25Y0W719vUjg() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument$$serializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$q1pNmen13hV7cX6TB0o_0_urq3M() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.time.Instant.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType = this.repaymentType;
        java.lang.Boolean bool = this.cancelable;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.amount;
        java.time.Instant instant = this.creationDate;
        java.time.Instant instant2 = this.paymentTime;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel = this.paymentChannel;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list = this.fundingInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentActivity(id=");
        sb.append(str);
        sb.append(", repaymentType=");
        sb.append(repaymentType);
        sb.append(", cancelable=");
        sb.append(bool);
        sb.append(", status=");
        sb.append(repaymentStatus);
        sb.append(", amount=");
        sb.append(currencyAmount);
        sb.append(", creationDate=");
        sb.append(instant);
        sb.append(", paymentTime=");
        sb.append(instant2);
        sb.append(", paymentChannel=");
        sb.append(repaymentChannel);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.repaymentType.hashCode();
        java.lang.Boolean bool = this.cancelable;
        int hashCode3 = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus = this.status;
        int hashCode4 = repaymentStatus == null ? 0 : repaymentStatus.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.amount;
        int hashCode5 = currencyAmount == null ? 0 : currencyAmount.hashCode();
        java.time.Instant instant = this.creationDate;
        int hashCode6 = instant == null ? 0 : instant.hashCode();
        java.time.Instant instant2 = this.paymentTime;
        int hashCode7 = instant2 == null ? 0 : instant2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel = this.paymentChannel;
        int hashCode8 = repaymentChannel == null ? 0 : repaymentChannel.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> list = this.fundingInstruments;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, repaymentActivity.id) && this.repaymentType == repaymentActivity.repaymentType && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelable, repaymentActivity.cancelable) && this.status == repaymentActivity.status && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, repaymentActivity.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.creationDate, repaymentActivity.creationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTime, repaymentActivity.paymentTime) && this.paymentChannel == repaymentActivity.paymentChannel && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, repaymentActivity.fundingInstruments);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity copy(java.lang.String id, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType, java.lang.Boolean cancelable, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus status, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount, java.time.Instant creationDate, java.time.Instant paymentTime, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel paymentChannel, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> fundingInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity(id, repaymentType, cancelable, status, amount, creationDate, paymentTime, paymentChannel, fundingInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> component9() {
        return this.fundingInstruments;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel getPaymentChannel() {
        return this.paymentChannel;
    }

    /* renamed from: component7, reason: from getter */
    public final java.time.Instant getPaymentTime() {
        return this.paymentTime;
    }

    /* renamed from: component6, reason: from getter */
    public final java.time.Instant getCreationDate() {
        return this.creationDate;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getCancelable() {
        return this.cancelable;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType getRepaymentType() {
        return this.repaymentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
