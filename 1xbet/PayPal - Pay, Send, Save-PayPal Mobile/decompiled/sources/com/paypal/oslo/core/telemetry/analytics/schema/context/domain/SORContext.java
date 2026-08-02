package com.paypal.oslo.core.telemetry.analytics.schema.context.domain;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "sor")
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORType;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORReference;", "references", "<init>", "(Ljava/util/Map;)V", "type", "", "id", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORType;Ljava/lang/String;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getReferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SORContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 8;
    private final java.util.Map<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> references;

    public SORContext(java.util.Map<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.references = map;
    }

    public final java.util.Map<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> getReferences() {
        return this.references;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SORContext(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType sORType, java.lang.String str) {
        this(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(sORType, new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference(str))));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sORType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public final java.lang.String toString() {
        java.util.Map<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> map = this.references;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SORContext(references=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.references.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.references, ((com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext) other).references);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext copy(java.util.Map<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> references) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(references, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext(references);
    }

    public final java.util.Map<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> component1() {
        return this.references;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext sORContext, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = sORContext.references;
        }
        return sORContext.copy(map);
    }
}
