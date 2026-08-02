package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u0000 [2\u00020\u0001:\u0002\\[Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B«\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0012\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0084\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010!J'\u0010?\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\t\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bM\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\b\u000e\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bO\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bP\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bQ\u0010!R\u001a\u0010\u0017\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bU\u0010!R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\u001c\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001c\u0010Y\u001a\u0004\b\u001c\u0010Z"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "", "id", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;", "type", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "Ljava/time/Instant;", "creationDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "transactionImage", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "isSettled", "transactionCashbackPercentage", "businessName", "referenceId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "transactionType", "transactionName", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionFundingInstrument;", "transactionFundingInstruments", "isCancellable", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;Ljava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component4", "()Ljava/time/Instant;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;", "getType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAmount", "Ljava/time/Instant;", "getCreationDate", "getCreationDate$annotations", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "getTransactionImage", "getDescription", "Ljava/lang/Boolean;", "getTransactionCashbackPercentage", "getBusinessName", "getReferenceId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getTransactionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getTransactionName", "Ljava/util/List;", "getTransactionFundingInstruments", "()Ljava/util/List;", "Z", "()Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class TransactionActivity implements com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount;
    private final java.lang.String businessName;
    private final java.time.Instant creationDate;
    private final java.lang.String description;
    private final java.lang.String id;
    private final boolean isCancellable;
    private final java.lang.Boolean isSettled;
    private final java.lang.String referenceId;
    private final java.lang.String transactionCashbackPercentage;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage;
    private final java.lang.String transactionName;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.$r8$lambda$Sg5UVrMKh2esvXAmoRCMZO2bpu4();
        }
    }), null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.$r8$lambda$XWhuvH_URjCmlxLkigwQzZNcM5U();
        }
    }), null};

    public static /* synthetic */ void getCreationDate$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TransactionActivity(int i, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType, java.lang.String str6, java.util.List list, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        java.lang.String str7 = str4;
        if (1023 != (i & 1023)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1023, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = activityType;
        this.amount = currencyAmount;
        this.creationDate = instant;
        this.transactionImage = creditImage;
        this.description = str2;
        this.isSettled = bool;
        this.transactionCashbackPercentage = str3;
        this.businessName = str7;
        this.referenceId = str5;
        this.transactionType = (i & 1024) == 0 ? activityType.toTransactionType() : transactionType;
        this.transactionName = (i & 2048) != 0 ? str6 : str7;
        this.transactionFundingInstruments = (i & 4096) == 0 ? null : list;
        this.isCancellable = (i & 8192) == 0 ? false : z;
    }

    public TransactionActivity(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
        this.id = str;
        this.type = activityType;
        this.amount = currencyAmount;
        this.creationDate = instant;
        this.transactionImage = creditImage;
        this.description = str2;
        this.isSettled = bool;
        this.transactionCashbackPercentage = str3;
        this.businessName = str4;
        this.referenceId = str5;
        this.transactionType = activityType.toTransactionType();
        this.transactionName = str4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.type);
        output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.getAmount());
        output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.getCreationDate());
        output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, self.getTransactionImage());
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.description);
        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.isSettled);
        output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getTransactionCashbackPercentage());
        output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.businessName);
        output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getReferenceId());
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.getTransactionType() != self.type.toTransactionType()) {
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.getTransactionType());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !kotlin.jvm.internal.Intrinsics.areEqual(self.getTransactionName(), self.businessName)) {
            output.encodeNullableSerializableElement(serialDesc, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getTransactionName());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.getTransactionFundingInstruments() != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, lazyArr[12].getValue(), self.getTransactionFundingInstruments());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.getIsCancellable()) {
            output.encodeBooleanElement(serialDesc, 13, self.getIsCancellable());
        }
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.time.Instant getCreationDate() {
        return this.creationDate;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage() {
        return this.transactionImage;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.Boolean isSettled() {
        return this.isSettled;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.lang.String getTransactionCashbackPercentage() {
        return this.transactionCashbackPercentage;
    }

    public final java.lang.String getBusinessName() {
        return this.businessName;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getTransactionType() {
        return this.transactionType;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.lang.String getTransactionName() {
        return this.transactionName;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
        return this.transactionFundingInstruments;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
    /* renamed from: isCancellable, reason: from getter */
    public final boolean getIsCancellable() {
        return this.isCancellable;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Sg5UVrMKh2esvXAmoRCMZO2bpu4() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.time.Instant.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$XWhuvH_URjCmlxLkigwQzZNcM5U() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType = this.type;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.amount;
        java.time.Instant instant = this.creationDate;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage = this.transactionImage;
        java.lang.String str2 = this.description;
        java.lang.Boolean bool = this.isSettled;
        java.lang.String str3 = this.transactionCashbackPercentage;
        java.lang.String str4 = this.businessName;
        java.lang.String str5 = this.referenceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionActivity(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(activityType);
        sb.append(", amount=");
        sb.append(currencyAmount);
        sb.append(", creationDate=");
        sb.append(instant);
        sb.append(", transactionImage=");
        sb.append(creditImage);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", isSettled=");
        sb.append(bool);
        sb.append(", transactionCashbackPercentage=");
        sb.append(str3);
        sb.append(", businessName=");
        sb.append(str4);
        sb.append(", referenceId=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.amount;
        int hashCode3 = currencyAmount == null ? 0 : currencyAmount.hashCode();
        java.time.Instant instant = this.creationDate;
        int hashCode4 = instant == null ? 0 : instant.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage = this.transactionImage;
        int hashCode5 = creditImage == null ? 0 : creditImage.hashCode();
        java.lang.String str = this.description;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.isSettled;
        int hashCode7 = bool == null ? 0 : bool.hashCode();
        java.lang.String str2 = this.transactionCashbackPercentage;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.businessName;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.referenceId;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity transactionActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, transactionActivity.id) && this.type == transactionActivity.type && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transactionActivity.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.creationDate, transactionActivity.creationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionImage, transactionActivity.transactionImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, transactionActivity.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.isSettled, transactionActivity.isSettled) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCashbackPercentage, transactionActivity.transactionCashbackPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, transactionActivity.businessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, transactionActivity.referenceId);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity copy(java.lang.String id, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType type, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount, java.time.Instant creationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage, java.lang.String description, java.lang.Boolean isSettled, java.lang.String transactionCashbackPercentage, java.lang.String businessName, java.lang.String referenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity(id, type, amount, creationDate, transactionImage, description, isSettled, transactionCashbackPercentage, businessName, referenceId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getBusinessName() {
        return this.businessName;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getTransactionCashbackPercentage() {
        return this.transactionCashbackPercentage;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Boolean getIsSettled() {
        return this.isSettled;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage() {
        return this.transactionImage;
    }

    /* renamed from: component4, reason: from getter */
    public final java.time.Instant getCreationDate() {
        return this.creationDate;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
