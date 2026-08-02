package com.paypal.oslo.core.telemetry.analytics.schema.context.domain;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "merchant")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MerchantContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final java.lang.String name;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    public MerchantContext(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.name = str2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantContext(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchantContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchantContext.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchantContext.name);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext copy(java.lang.String id, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(id, name2);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchantContext, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = merchantContext.id;
        }
        if ((i & 2) != 0) {
            str2 = merchantContext.name;
        }
        return merchantContext.copy(str, str2);
    }
}
