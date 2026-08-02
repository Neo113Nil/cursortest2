package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0081\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u0010.Jª\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b8\u0010.J'\u0010?\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bD\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010$R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010&R\u001f\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\u0012\n\u0004\b\r\u0010K\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bQ\u0010 R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bR\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bU\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bV\u0010."}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "", "", "enrolled", "enrollmentEligible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "repaymentOption", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "customAmount", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "fundingInstruments", "Ljava/time/Instant;", "effectiveDueTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "paymentConstraints", "effectiveInCurrentBillingCycle", "eligibleFundingInstruments", "", "autopayTermsUrl", "maxAllowableRepaymentAmount", "creditAccountId", "<init>", "(ZLjava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/util/List;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/util/List;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component5", "()Ljava/util/List;", "component6", "()Ljava/time/Instant;", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "component8", "component9", "component10", "()Ljava/lang/String;", "component11", "component12", "copy", "(ZLjava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/util/List;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getEnrolled", "Ljava/lang/Boolean;", "getEnrollmentEligible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getRepaymentOption", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCustomAmount", "Ljava/util/List;", "getFundingInstruments", "Ljava/time/Instant;", "getEffectiveDueTime", "getEffectiveDueTime$annotations", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "getPaymentConstraints", "getEffectiveInCurrentBillingCycle", "getEligibleFundingInstruments", "Ljava/lang/String;", "getAutopayTermsUrl", "getMaxAllowableRepaymentAmount", "getCreditAccountId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AutopayOverview {
    private final java.lang.String autopayTermsUrl;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount;
    private final java.time.Instant effectiveDueTime;
    private final java.lang.Boolean effectiveInCurrentBillingCycle;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments;
    private final boolean enrolled;
    private final java.lang.Boolean enrollmentEligible;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maxAllowableRepaymentAmount;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption repaymentOption;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.m18124$r8$lambda$wD260_6kdUrzTpG6fdZOJMwCb0();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.m18123$r8$lambda$tEATLkzE9PpcVI8b09L5MiFoXo();
        }
    }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.m18122$r8$lambda$ZBtnIAXJnq98dfKrUxTtx3hzFw();
        }
    }), null, null, null};

    public static /* synthetic */ void getEffectiveDueTime$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AutopayOverview(int i, boolean z, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.util.List list, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints, java.lang.Boolean bool2, java.util.List list2, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$serializer.INSTANCE.getDescriptor());
        }
        this.enrolled = z;
        this.enrollmentEligible = bool;
        this.repaymentOption = paymentOption;
        this.customAmount = currencyAmount;
        this.fundingInstruments = list;
        this.effectiveDueTime = instant;
        this.paymentConstraints = paymentConstraints;
        this.effectiveInCurrentBillingCycle = bool2;
        this.eligibleFundingInstruments = list2;
        this.autopayTermsUrl = str;
        this.maxAllowableRepaymentAmount = currencyAmount2;
        this.creditAccountId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutopayOverview(boolean z, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints, java.lang.Boolean bool2, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str2) {
        this.enrolled = z;
        this.enrollmentEligible = bool;
        this.repaymentOption = paymentOption;
        this.customAmount = currencyAmount;
        this.fundingInstruments = list;
        this.effectiveDueTime = instant;
        this.paymentConstraints = paymentConstraints;
        this.effectiveInCurrentBillingCycle = bool2;
        this.eligibleFundingInstruments = list2;
        this.autopayTermsUrl = str;
        this.maxAllowableRepaymentAmount = currencyAmount2;
        this.creditAccountId = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.enrolled);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.enrollmentEligible);
        output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.repaymentOption);
        output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.customAmount);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.fundingInstruments);
        output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.effectiveDueTime);
        output.encodeNullableSerializableElement(serialDesc, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$serializer.INSTANCE, self.paymentConstraints);
        output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.effectiveInCurrentBillingCycle);
        output.encodeNullableSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.eligibleFundingInstruments);
        output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.autopayTermsUrl);
        output.encodeNullableSerializableElement(serialDesc, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.maxAllowableRepaymentAmount);
        output.encodeNullableSerializableElement(serialDesc, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.creditAccountId);
    }

    public final boolean getEnrolled() {
        return this.enrolled;
    }

    public final java.lang.Boolean getEnrollmentEligible() {
        return this.enrollmentEligible;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getRepaymentOption() {
        return this.repaymentOption;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCustomAmount() {
        return this.customAmount;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.time.Instant getEffectiveDueTime() {
        return this.effectiveDueTime;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints getPaymentConstraints() {
        return this.paymentConstraints;
    }

    public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
        return this.effectiveInCurrentBillingCycle;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getEligibleFundingInstruments() {
        return this.eligibleFundingInstruments;
    }

    public final java.lang.String getAutopayTermsUrl() {
        return this.autopayTermsUrl;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMaxAllowableRepaymentAmount() {
        return this.maxAllowableRepaymentAmount;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: $r8$lambda$ZBtnIAXJnq98-dfKrUxTtx3hzFw, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18122$r8$lambda$ZBtnIAXJnq98dfKrUxTtx3hzFw() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.INSTANCE.serializer());
    }

    /* renamed from: $r8$lambda$tEATLkzE9P-pcVI8b09L5MiFoXo, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18123$r8$lambda$tEATLkzE9PpcVI8b09L5MiFoXo() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.time.Instant.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    /* renamed from: $r8$lambda$wD-260_6kdUrzTpG6fdZOJMwCb0, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18124$r8$lambda$wD260_6kdUrzTpG6fdZOJMwCb0() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.INSTANCE.serializer());
    }

    public final java.lang.String toString() {
        boolean z = this.enrolled;
        java.lang.Boolean bool = this.enrollmentEligible;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.repaymentOption;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.customAmount;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.fundingInstruments;
        java.time.Instant instant = this.effectiveDueTime;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints = this.paymentConstraints;
        java.lang.Boolean bool2 = this.effectiveInCurrentBillingCycle;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2 = this.eligibleFundingInstruments;
        java.lang.String str = this.autopayTermsUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.maxAllowableRepaymentAmount;
        java.lang.String str2 = this.creditAccountId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayOverview(enrolled=");
        sb.append(z);
        sb.append(", enrollmentEligible=");
        sb.append(bool);
        sb.append(", repaymentOption=");
        sb.append(paymentOption);
        sb.append(", customAmount=");
        sb.append(currencyAmount);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(", effectiveDueTime=");
        sb.append(instant);
        sb.append(", paymentConstraints=");
        sb.append(paymentConstraints);
        sb.append(", effectiveInCurrentBillingCycle=");
        sb.append(bool2);
        sb.append(", eligibleFundingInstruments=");
        sb.append(list2);
        sb.append(", autopayTermsUrl=");
        sb.append(str);
        sb.append(", maxAllowableRepaymentAmount=");
        sb.append(currencyAmount2);
        sb.append(", creditAccountId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.enrolled);
        java.lang.Boolean bool = this.enrollmentEligible;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.repaymentOption;
        int hashCode3 = paymentOption == null ? 0 : paymentOption.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.customAmount;
        int hashCode4 = currencyAmount == null ? 0 : currencyAmount.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.fundingInstruments;
        int hashCode5 = list == null ? 0 : list.hashCode();
        java.time.Instant instant = this.effectiveDueTime;
        int hashCode6 = instant == null ? 0 : instant.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints = this.paymentConstraints;
        int hashCode7 = paymentConstraints == null ? 0 : paymentConstraints.hashCode();
        java.lang.Boolean bool2 = this.effectiveInCurrentBillingCycle;
        int hashCode8 = bool2 == null ? 0 : bool2.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2 = this.eligibleFundingInstruments;
        int hashCode9 = list2 == null ? 0 : list2.hashCode();
        java.lang.String str = this.autopayTermsUrl;
        int hashCode10 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.maxAllowableRepaymentAmount;
        int hashCode11 = currencyAmount2 == null ? 0 : currencyAmount2.hashCode();
        java.lang.String str2 = this.creditAccountId;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) other;
        return this.enrolled == autopayOverview.enrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentEligible, autopayOverview.enrollmentEligible) && this.repaymentOption == autopayOverview.repaymentOption && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, autopayOverview.customAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, autopayOverview.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveDueTime, autopayOverview.effectiveDueTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentConstraints, autopayOverview.paymentConstraints) && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveInCurrentBillingCycle, autopayOverview.effectiveInCurrentBillingCycle) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleFundingInstruments, autopayOverview.eligibleFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayTermsUrl, autopayOverview.autopayTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAllowableRepaymentAmount, autopayOverview.maxAllowableRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, autopayOverview.creditAccountId);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview copy(boolean enrolled, java.lang.Boolean enrollmentEligible, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption repaymentOption, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments, java.time.Instant effectiveDueTime, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints, java.lang.Boolean effectiveInCurrentBillingCycle, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments, java.lang.String autopayTermsUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maxAllowableRepaymentAmount, java.lang.String creditAccountId) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(enrolled, enrollmentEligible, repaymentOption, customAmount, fundingInstruments, effectiveDueTime, paymentConstraints, effectiveInCurrentBillingCycle, eligibleFundingInstruments, autopayTermsUrl, maxAllowableRepaymentAmount, creditAccountId);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> component9() {
        return this.eligibleFundingInstruments;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
        return this.effectiveInCurrentBillingCycle;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints getPaymentConstraints() {
        return this.paymentConstraints;
    }

    /* renamed from: component6, reason: from getter */
    public final java.time.Instant getEffectiveDueTime() {
        return this.effectiveDueTime;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> component5() {
        return this.fundingInstruments;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCustomAmount() {
        return this.customAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getRepaymentOption() {
        return this.repaymentOption;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getEnrollmentEligible() {
        return this.enrollmentEligible;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMaxAllowableRepaymentAmount() {
        return this.maxAllowableRepaymentAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAutopayTermsUrl() {
        return this.autopayTermsUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnrolled() {
        return this.enrolled;
    }
}
