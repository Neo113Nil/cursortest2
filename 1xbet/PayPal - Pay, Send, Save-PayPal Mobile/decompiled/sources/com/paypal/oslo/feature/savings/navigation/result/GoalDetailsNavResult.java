package com.paypal.oslo.feature.savings.navigation.result;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "deletedGoalName", "", "shouldRefresh", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getDeletedGoalName", "Z", "getShouldRefresh", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class GoalDetailsNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult.Companion INSTANCE = new com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult.Companion(null);
    private final java.lang.String deletedGoalName;
    private final boolean shouldRefresh;

    public /* synthetic */ GoalDetailsNavResult(int i, java.lang.String str, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.deletedGoalName = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.shouldRefresh = false;
        } else {
            this.shouldRefresh = z;
        }
    }

    public GoalDetailsNavResult(java.lang.String str, boolean z) {
        this.deletedGoalName = str;
        this.shouldRefresh = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.deletedGoalName != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.deletedGoalName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.shouldRefresh) {
            output.encodeBooleanElement(serialDesc, 1, self.shouldRefresh);
        }
    }

    public /* synthetic */ GoalDetailsNavResult(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public final java.lang.String getDeletedGoalName() {
        return this.deletedGoalName;
    }

    public final boolean getShouldRefresh() {
        return this.shouldRefresh;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult$Companion;", "", "<init>", "()V", "", "goalName", "Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;", "withDeletion", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;", "withEdit", "()Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;", "withoutChanges", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult> serializer() {
            return com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult$$serializer.INSTANCE;
        }

        public final com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult withDeletion(java.lang.String goalName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
            return new com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult(goalName, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult withEdit() {
            return new com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult((java.lang.String) null, true, (int) (1 == true ? 1 : 0), (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult withoutChanges() {
            return new com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult((java.lang.String) null, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deletedGoalName;
        boolean z = this.shouldRefresh;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GoalDetailsNavResult(deletedGoalName=");
        sb.append(str);
        sb.append(", shouldRefresh=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.deletedGoalName;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldRefresh);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult goalDetailsNavResult = (com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deletedGoalName, goalDetailsNavResult.deletedGoalName) && this.shouldRefresh == goalDetailsNavResult.shouldRefresh;
    }

    public final com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult copy(java.lang.String deletedGoalName, boolean shouldRefresh) {
        return new com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult(deletedGoalName, shouldRefresh);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldRefresh() {
        return this.shouldRefresh;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeletedGoalName() {
        return this.deletedGoalName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult copy$default(com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult goalDetailsNavResult, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = goalDetailsNavResult.deletedGoalName;
        }
        if ((i & 2) != 0) {
            z = goalDetailsNavResult.shouldRefresh;
        }
        return goalDetailsNavResult.copy(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalDetailsNavResult() {
        this((java.lang.String) null, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
