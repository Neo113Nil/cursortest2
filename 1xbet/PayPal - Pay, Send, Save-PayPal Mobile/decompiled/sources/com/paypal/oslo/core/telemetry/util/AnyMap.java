package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getValue", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = com.paypal.oslo.core.telemetry.util.AnyMapSerializer.class)
/* loaded from: classes2.dex */
public final /* data */ class AnyMap {
    private final java.util.Map<java.lang.String, java.lang.Object> value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.telemetry.util.AnyMap.Companion INSTANCE = new com.paypal.oslo.core.telemetry.util.AnyMap.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/util/AnyMap$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/telemetry/util/AnyMap;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.telemetry.util.AnyMap> serializer() {
            return com.paypal.oslo.core.telemetry.util.AnyMapSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AnyMap(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.value = map;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnyMap(value=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.telemetry.util.AnyMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.core.telemetry.util.AnyMap) other).value);
    }

    public final com.paypal.oslo.core.telemetry.util.AnyMap copy(java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.core.telemetry.util.AnyMap(value);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component1() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.util.AnyMap copy$default(com.paypal.oslo.core.telemetry.util.AnyMap anyMap, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = anyMap.value;
        }
        return anyMap.copy(map);
    }
}
