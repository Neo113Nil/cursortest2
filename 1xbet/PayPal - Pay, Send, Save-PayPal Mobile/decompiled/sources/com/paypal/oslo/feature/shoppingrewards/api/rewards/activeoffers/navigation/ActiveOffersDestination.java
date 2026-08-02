package com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "targetingUnitId", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "origin", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;)Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$shopping_rewards_api_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTargetingUnitId", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersOrigin;", "getOrigin", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActiveOffersDestination implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin origin;
    private final java.lang.String targetingUnitId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/activeoffers/navigation/ActiveOffersDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination> serializer() {
            return com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActiveOffersDestination(int i, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.targetingUnitId = str;
        if ((i & 2) == 0) {
            this.origin = com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.DeepLink;
        } else {
            this.origin = activeOffersOrigin;
        }
    }

    public ActiveOffersDestination(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersOrigin, "");
        this.targetingUnitId = str;
        this.origin = activeOffersOrigin;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$shopping_rewards_api_prodRelease(com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.targetingUnitId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.origin != com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.DeepLink) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.origin);
        }
    }

    public final java.lang.String getTargetingUnitId() {
        return this.targetingUnitId;
    }

    public /* synthetic */ ActiveOffersDestination(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.DeepLink : activeOffersOrigin);
    }

    public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin getOrigin() {
        return this.origin;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.targetingUnitId;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin = this.origin;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActiveOffersDestination(targetingUnitId=");
        sb.append(str);
        sb.append(", origin=");
        sb.append(activeOffersOrigin);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.targetingUnitId.hashCode() * 31) + this.origin.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination activeOffersDestination = (com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.targetingUnitId, activeOffersDestination.targetingUnitId) && this.origin == activeOffersDestination.origin;
    }

    public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination copy(java.lang.String targetingUnitId, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin origin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetingUnitId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
        return new com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination(targetingUnitId, origin);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin getOrigin() {
        return this.origin;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTargetingUnitId() {
        return this.targetingUnitId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination copy$default(com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination activeOffersDestination, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin activeOffersOrigin, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activeOffersDestination.targetingUnitId;
        }
        if ((i & 2) != 0) {
            activeOffersOrigin = activeOffersDestination.origin;
        }
        return activeOffersDestination.copy(str, activeOffersOrigin);
    }
}
