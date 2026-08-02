package com.paypal.oslo.core.telemetry.analytics.schema.context.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORReference;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORReference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getId$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SORReference {
    public static final int $stable = 0;
    private final java.lang.String id;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    public SORReference(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SORReference(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference) other).id);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference sORReference, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sORReference.id;
        }
        return sORReference.copy(str);
    }
}
