package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/AssociatedWalletInstrument;", "associatedWalletInstruments", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAssociatedWalletInstruments", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class WalletOverview {
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> associatedWalletInstruments;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview.$r8$lambda$aJ9ItTA6cX13yhmVvWiR8LVtYiU();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WalletOverview(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview$$serializer.INSTANCE.getDescriptor());
        }
        this.associatedWalletInstruments = list;
    }

    public WalletOverview(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> list) {
        this.associatedWalletInstruments = list;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> getAssociatedWalletInstruments() {
        return this.associatedWalletInstruments;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$aJ9ItTA6cX13yhmVvWiR8LVtYiU() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> list = this.associatedWalletInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletOverview(associatedWalletInstruments=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> list = this.associatedWalletInstruments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.associatedWalletInstruments, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview) other).associatedWalletInstruments);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> associatedWalletInstruments) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview(associatedWalletInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.AssociatedWalletInstrument> component1() {
        return this.associatedWalletInstruments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = walletOverview.associatedWalletInstruments;
        }
        return walletOverview.copy(list);
    }
}
