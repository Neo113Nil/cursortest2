package com.paypal.oslo.core.telemetry.analytics.schema.context;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "user_intent")
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR \u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "product", "feature", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProduct", "getProduct$annotations", "()V", "getFeature", "getFeature$annotations", "getAction", "getAction$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserIntentContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String action;
    private final java.lang.String feature;
    private final java.lang.String product;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "action")
    public static /* synthetic */ void getAction$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "feature")
    public static /* synthetic */ void getFeature$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "product")
    public static /* synthetic */ void getProduct$annotations() {
    }

    @kotlin.Deprecated(message = "Use the constructor with Product enum parameter instead", replaceWith = @kotlin.ReplaceWith(expression = "UserIntentContext(product = Product.valueOf(product), feature = feature, action = action)", imports = {}))
    public UserIntentContext(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.product = str;
        this.feature = str2;
        this.action = str3;
    }

    public final java.lang.String getProduct() {
        return this.product;
    }

    public final java.lang.String getFeature() {
        return this.feature;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product product, java.lang.String str, java.lang.String str2) {
        this(product.getValue(), str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    public final java.lang.String toString() {
        java.lang.String str = this.product;
        java.lang.String str2 = this.feature;
        java.lang.String str3 = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserIntentContext(product=");
        sb.append(str);
        sb.append(", feature=");
        sb.append(str2);
        sb.append(", action=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.product.hashCode() * 31) + this.feature.hashCode()) * 31) + this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.product, userIntentContext.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, userIntentContext.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, userIntentContext.action);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext copy(java.lang.String product, java.lang.String feature, java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, feature, action);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFeature() {
        return this.feature;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getProduct() {
        return this.product;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userIntentContext.product;
        }
        if ((i & 2) != 0) {
            str2 = userIntentContext.feature;
        }
        if ((i & 4) != 0) {
            str3 = userIntentContext.action;
        }
        return userIntentContext.copy(str, str2, str3);
    }
}
