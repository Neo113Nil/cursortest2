package com.paypal.oslo.feature.controlcenter.api.observability;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourneyError;", "", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "error", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourneyError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getAttributes", "Ljava/lang/Throwable;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserJourneyError {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Object> attributes;
    private final java.lang.Throwable error;
    private final java.lang.String message;

    public UserJourneyError(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.message = str;
        this.attributes = map;
        this.error = th;
    }

    public /* synthetic */ UserJourneyError(java.lang.String str, java.util.Map map, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : th);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return this.attributes;
    }

    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
        java.lang.Throwable th = this.error;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserJourneyError(message=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", error=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        int hashCode2 = this.attributes.hashCode();
        java.lang.Throwable th = this.error;
        return (((hashCode * 31) + hashCode2) * 31) + (th == null ? 0 : th.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError)) {
            return false;
        }
        com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError userJourneyError = (com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, userJourneyError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, userJourneyError.attributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, userJourneyError.error);
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError copy(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        return new com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError(message, attributes, error);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
        return this.attributes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError copy$default(com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError userJourneyError, java.lang.String str, java.util.Map map, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userJourneyError.message;
        }
        if ((i & 2) != 0) {
            map = userJourneyError.attributes;
        }
        if ((i & 4) != 0) {
            th = userJourneyError.error;
        }
        return userJourneyError.copy(str, map, th);
    }
}
