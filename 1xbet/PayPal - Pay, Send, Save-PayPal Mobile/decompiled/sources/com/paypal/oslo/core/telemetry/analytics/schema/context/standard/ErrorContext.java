package com.paypal.oslo.core.telemetry.analytics.schema.context.standard;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "error")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\nR \u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\nR \u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "code", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "type", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getCode$annotations", "()V", "getDescription", "getDescription$annotations", "getType", "getType$annotations", "getSource", "getSource$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ErrorContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String code;
    private final java.lang.String description;
    private final java.lang.String source;
    private final java.lang.String type;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION)
    public static /* synthetic */ void getDescription$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public ErrorContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.code = str;
        this.description = str2;
        this.type = str3;
        this.source = str4;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.type;
        java.lang.String str4 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorContext(code=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(str3);
        sb.append(", source=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.code.hashCode() * 31) + this.description.hashCode()) * 31) + this.type.hashCode()) * 31) + this.source.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, errorContext.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, errorContext.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, errorContext.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, errorContext.source);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext copy(java.lang.String code, java.lang.String description, java.lang.String type, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(code, description, type, source);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = errorContext.code;
        }
        if ((i & 2) != 0) {
            str2 = errorContext.description;
        }
        if ((i & 4) != 0) {
            str3 = errorContext.type;
        }
        if ((i & 8) != 0) {
            str4 = errorContext.source;
        }
        return errorContext.copy(str, str2, str3, str4);
    }
}
