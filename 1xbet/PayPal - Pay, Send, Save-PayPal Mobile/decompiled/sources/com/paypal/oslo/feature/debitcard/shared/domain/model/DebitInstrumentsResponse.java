package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "instruments", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "balances", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getInstruments", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "getBalances", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitInstrumentsResponse {
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances balances;
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> instruments;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse.m14581$r8$lambda$TqlfqIkSH_SBv_UaODueMHFd0A();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitInstrumentsResponse(int i, java.util.List list, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.instruments = list;
        if ((i & 2) == 0) {
            this.balances = null;
        } else {
            this.balances = debitInstrumentBalances;
        }
    }

    public DebitInstrumentsResponse(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.instruments = list;
        this.balances = debitInstrumentBalances;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.instruments);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.balances != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances$$serializer.INSTANCE, self.balances);
        }
    }

    public /* synthetic */ DebitInstrumentsResponse(java.util.List list, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : debitInstrumentBalances);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getInstruments() {
        return this.instruments;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances getBalances() {
        return this.balances;
    }

    /* renamed from: $r8$lambda$TqlfqIkSH_SBv_UaODu-eMHFd0A, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m14581$r8$lambda$TqlfqIkSH_SBv_UaODueMHFd0A() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list = this.instruments;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances = this.balances;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentsResponse(instruments=");
        sb.append(list);
        sb.append(", balances=");
        sb.append(debitInstrumentBalances);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instruments.hashCode();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances = this.balances;
        return (hashCode * 31) + (debitInstrumentBalances == null ? 0 : debitInstrumentBalances.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instruments, debitInstrumentsResponse.instruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, debitInstrumentsResponse.balances);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse copy(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> instruments, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances balances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruments, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse(instruments, balances);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances getBalances() {
        return this.balances;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> component1() {
        return this.instruments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse, java.util.List list, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = debitInstrumentsResponse.instruments;
        }
        if ((i & 2) != 0) {
            debitInstrumentBalances = debitInstrumentsResponse.balances;
        }
        return debitInstrumentsResponse.copy(list, debitInstrumentBalances);
    }
}
