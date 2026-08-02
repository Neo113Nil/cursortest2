package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "totalAvailableAmount", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalanceItem;", "items", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "getTotalAvailableAmount", "Ljava/util/List;", "getItems", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitInstrumentBalances {
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem> items;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount totalAvailableAmount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances.m14572$r8$lambda$3aLChDUTErrs1isAJ0fUgdg5w();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitInstrumentBalances(int i, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances$$serializer.INSTANCE.getDescriptor());
        }
        this.totalAvailableAmount = debitInstrumentMoneyAmount;
        this.items = list;
    }

    public DebitInstrumentBalances(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentMoneyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.totalAvailableAmount = debitInstrumentMoneyAmount;
        this.items = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount$$serializer.INSTANCE, self.totalAvailableAmount);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.items);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount getTotalAvailableAmount() {
        return this.totalAvailableAmount;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem> getItems() {
        return this.items;
    }

    /* renamed from: $r8$lambda$3aLChD-UTErrs1isAJ0fUgd-g5w, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m14572$r8$lambda$3aLChDUTErrs1isAJ0fUgdg5w() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount = this.totalAvailableAmount;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentBalances(totalAvailableAmount=");
        sb.append(debitInstrumentMoneyAmount);
        sb.append(", items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.totalAvailableAmount.hashCode() * 31) + this.items.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAvailableAmount, debitInstrumentBalances.totalAvailableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, debitInstrumentBalances.items);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount totalAvailableAmount, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances(totalAvailableAmount, items);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalanceItem> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount getTotalAvailableAmount() {
        return this.totalAvailableAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentMoneyAmount = debitInstrumentBalances.totalAvailableAmount;
        }
        if ((i & 2) != 0) {
            list = debitInstrumentBalances.items;
        }
        return debitInstrumentBalances.copy(debitInstrumentMoneyAmount, list);
    }
}
