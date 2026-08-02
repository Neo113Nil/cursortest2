package com.paypal.oslo.feature.pools.api.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/api/navigation/PoolDetailsDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "poolId", "poolCreatorAccountId", "userRole", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/api/navigation/PoolDetailsDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$pools_api_prodRelease", "(Lcom/paypal/oslo/feature/pools/api/navigation/PoolDetailsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPoolId", "getPoolCreatorAccountId", "getUserRole", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PoolDetailsDestination implements androidx.navigation3.runtime.NavKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination.Companion INSTANCE = new com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination.Companion(null);
    private final java.lang.String poolCreatorAccountId;
    private final java.lang.String poolId;
    private final java.lang.String userRole;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/api/navigation/PoolDetailsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/pools/api/navigation/PoolDetailsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination> serializer() {
            return com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PoolDetailsDestination(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.poolId = str;
        this.poolCreatorAccountId = str2;
        this.userRole = str3;
    }

    public PoolDetailsDestination(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.poolId = str;
        this.poolCreatorAccountId = str2;
        this.userRole = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$pools_api_prodRelease(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.poolId);
        output.encodeStringElement(serialDesc, 1, self.poolCreatorAccountId);
        output.encodeStringElement(serialDesc, 2, self.userRole);
    }

    public final java.lang.String getPoolId() {
        return this.poolId;
    }

    public final java.lang.String getPoolCreatorAccountId() {
        return this.poolCreatorAccountId;
    }

    public final java.lang.String getUserRole() {
        return this.userRole;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.poolId;
        java.lang.String str2 = this.poolCreatorAccountId;
        java.lang.String str3 = this.userRole;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PoolDetailsDestination(poolId=");
        sb.append(str);
        sb.append(", poolCreatorAccountId=");
        sb.append(str2);
        sb.append(", userRole=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.poolId.hashCode() * 31) + this.poolCreatorAccountId.hashCode()) * 31) + this.userRole.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination)) {
            return false;
        }
        com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination = (com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, poolDetailsDestination.poolId) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolCreatorAccountId, poolDetailsDestination.poolCreatorAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.userRole, poolDetailsDestination.userRole);
    }

    public final com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination copy(java.lang.String poolId, java.lang.String poolCreatorAccountId, java.lang.String userRole) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolCreatorAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
        return new com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination(poolId, poolCreatorAccountId, userRole);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUserRole() {
        return this.userRole;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPoolCreatorAccountId() {
        return this.poolCreatorAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPoolId() {
        return this.poolId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination copy$default(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = poolDetailsDestination.poolId;
        }
        if ((i & 2) != 0) {
            str2 = poolDetailsDestination.poolCreatorAccountId;
        }
        if ((i & 4) != 0) {
            str3 = poolDetailsDestination.userRole;
        }
        return poolDetailsDestination.copy(str, str2, str3);
    }
}
