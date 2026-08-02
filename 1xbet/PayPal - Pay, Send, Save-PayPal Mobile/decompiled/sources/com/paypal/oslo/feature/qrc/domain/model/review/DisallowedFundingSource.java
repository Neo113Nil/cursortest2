package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "type", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;", "balance", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;)Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "getType", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Balance;", "getBalance", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DisallowedFundingSource {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.domain.model.review.Balance balance;
    private final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.INSTANCE.serializer();
            return serializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DisallowedFundingSource(int i, com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource$$serializer.INSTANCE.getDescriptor());
        }
        this.type = instrumentType;
        if ((i & 2) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
    }

    public DisallowedFundingSource(com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        this.type = instrumentType;
        this.balance = balance;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.balance != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.qrc.domain.model.review.Balance$$serializer.INSTANCE, self.balance);
        }
    }

    public /* synthetic */ DisallowedFundingSource(com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(instrumentType, (i & 2) != 0 ? null : balance);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.Balance getBalance() {
        return this.balance;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType = this.type;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance = this.balance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisallowedFundingSource(type=");
        sb.append(instrumentType);
        sb.append(", balance=");
        sb.append(balance);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance = this.balance;
        return (hashCode * 31) + (balance == null ? 0 : balance.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource disallowedFundingSource = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource) other;
        return this.type == disallowedFundingSource.type && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, disallowedFundingSource.balance);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource copy(com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType type, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource(type, balance);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.Balance getBalance() {
        return this.balance;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource copy$default(com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource disallowedFundingSource, com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType, com.paypal.oslo.feature.qrc.domain.model.review.Balance balance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            instrumentType = disallowedFundingSource.type;
        }
        if ((i & 2) != 0) {
            balance = disallowedFundingSource.balance;
        }
        return disallowedFundingSource.copy(instrumentType, balance);
    }
}
