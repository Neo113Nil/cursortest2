package com.paypal.oslo.core.telemetry.analytics.schema.context.standard;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "navigation")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "type", "deepLink", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getDeepLink", "getDeepLink$annotations", "getSource", "getSource$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigationContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String deepLink;
    private final java.lang.String source;
    private final java.lang.String type;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "deep_link")
    public static /* synthetic */ void getDeepLink$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public NavigationContext(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.deepLink = str2;
        this.source = str3;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.String str2 = this.deepLink;
        java.lang.String str3 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationContext(type=");
        sb.append(str);
        sb.append(", deepLink=");
        sb.append(str2);
        sb.append(", source=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.deepLink;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.source;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, navigationContext.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, navigationContext.deepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, navigationContext.source);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext copy(java.lang.String type, java.lang.String deepLink, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(type, deepLink, source);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = navigationContext.type;
        }
        if ((i & 2) != 0) {
            str2 = navigationContext.deepLink;
        }
        if ((i & 4) != 0) {
            str3 = navigationContext.source;
        }
        return navigationContext.copy(str, str2, str3);
    }
}
