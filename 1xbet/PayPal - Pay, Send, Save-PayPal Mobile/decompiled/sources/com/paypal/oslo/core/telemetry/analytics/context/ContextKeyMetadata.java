package com.paypal.oslo.core.telemetry.analytics.context;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/ContextKeyMetadata;", "", "", "contextKey", "", "propertyKeys", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextKeyMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextKey", "Ljava/util/Map;", "getPropertyKeys"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContextKeyMetadata {
    public static final int $stable = 8;
    private final java.lang.String contextKey;
    private final java.util.Map<java.lang.String, java.lang.String> propertyKeys;

    public ContextKeyMetadata(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.contextKey = str;
        this.propertyKeys = map;
    }

    public final java.lang.String getContextKey() {
        return this.contextKey;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getPropertyKeys() {
        return this.propertyKeys;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.contextKey;
        java.util.Map<java.lang.String, java.lang.String> map = this.propertyKeys;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextKeyMetadata(contextKey=");
        sb.append(str);
        sb.append(", propertyKeys=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.contextKey.hashCode() * 31) + this.propertyKeys.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata contextKeyMetadata = (com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.contextKey, contextKeyMetadata.contextKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.propertyKeys, contextKeyMetadata.propertyKeys);
    }

    public final com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata copy(java.lang.String contextKey, java.util.Map<java.lang.String, java.lang.String> propertyKeys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyKeys, "");
        return new com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata(contextKey, propertyKeys);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.propertyKeys;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getContextKey() {
        return this.contextKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata copy$default(com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata contextKeyMetadata, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contextKeyMetadata.contextKey;
        }
        if ((i & 2) != 0) {
            map = contextKeyMetadata.propertyKeys;
        }
        return contextKeyMetadata.copy(str, map);
    }
}
