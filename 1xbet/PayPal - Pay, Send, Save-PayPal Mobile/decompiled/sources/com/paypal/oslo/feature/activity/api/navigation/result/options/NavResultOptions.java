package com.paypal.oslo.feature.activity.api.navigation.result.options;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "", "isRefreshRequired", "<init>", "(IZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_api_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getActions", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class NavResultOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions.Companion(null);
    private final int actions;
    private final boolean isRefreshRequired;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/api/navigation/result/options/NavResultOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions> serializer() {
            return com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ NavResultOptions(int i, int i2, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actions = 0;
        } else {
            this.actions = i2;
        }
        if ((i & 2) == 0) {
            this.isRefreshRequired = false;
        } else {
            this.isRefreshRequired = z;
        }
    }

    public NavResultOptions(int i, boolean z) {
        this.actions = i;
        this.isRefreshRequired = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_api_prodRelease(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.actions != 0) {
            output.encodeIntElement(serialDesc, 0, self.actions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isRefreshRequired) {
            output.encodeBooleanElement(serialDesc, 1, self.isRefreshRequired);
        }
    }

    public /* synthetic */ NavResultOptions(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }

    public final int getActions() {
        return this.actions;
    }

    public final boolean isRefreshRequired() {
        return this.isRefreshRequired;
    }

    public final java.lang.String toString() {
        int i = this.actions;
        boolean z = this.isRefreshRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavResultOptions(actions=");
        sb.append(i);
        sb.append(", isRefreshRequired=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.actions) * 31) + java.lang.Boolean.hashCode(this.isRefreshRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions)) {
            return false;
        }
        com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions = (com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions) other;
        return this.actions == navResultOptions.actions && this.isRefreshRequired == navResultOptions.isRefreshRequired;
    }

    public final com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions copy(int actions, boolean isRefreshRequired) {
        return new com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions(actions, isRefreshRequired);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRefreshRequired() {
        return this.isRefreshRequired;
    }

    /* renamed from: component1, reason: from getter */
    public final int getActions() {
        return this.actions;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions copy$default(com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = navResultOptions.actions;
        }
        if ((i2 & 2) != 0) {
            z = navResultOptions.isRefreshRequired;
        }
        return navResultOptions.copy(i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavResultOptions() {
        this(0, (boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
