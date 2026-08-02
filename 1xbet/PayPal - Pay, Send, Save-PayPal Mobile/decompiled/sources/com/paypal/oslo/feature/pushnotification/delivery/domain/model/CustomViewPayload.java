package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewPayload;", "", "", "type", "version", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;", "fallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewPayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getVersion", "Ljava/util/Map;", "getData", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;", "getFallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomViewPayload {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Object> data;
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback fallback;
    private final java.lang.String type;
    private final java.lang.String version;

    public CustomViewPayload(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback customViewFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.type = str;
        this.version = str2;
        this.data = map;
        this.fallback = customViewFallback;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback getFallback() {
        return this.fallback;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.String str2 = this.version;
        java.util.Map<java.lang.String, java.lang.Object> map = this.data;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback customViewFallback = this.fallback;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomViewPayload(type=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(map);
        sb.append(", fallback=");
        sb.append(customViewFallback);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.version;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.data.hashCode();
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback customViewFallback = this.fallback;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (customViewFallback != null ? customViewFallback.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customViewPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, customViewPayload.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, customViewPayload.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, customViewPayload.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.fallback, customViewPayload.fallback);
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload copy(java.lang.String type, java.lang.String version, java.util.Map<java.lang.String, ? extends java.lang.Object> data, com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback fallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload(type, version, data, fallback);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback getFallback() {
        return this.fallback;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customViewPayload, java.lang.String str, java.lang.String str2, java.util.Map map, com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback customViewFallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = customViewPayload.type;
        }
        if ((i & 2) != 0) {
            str2 = customViewPayload.version;
        }
        if ((i & 4) != 0) {
            map = customViewPayload.data;
        }
        if ((i & 8) != 0) {
            customViewFallback = customViewPayload.fallback;
        }
        return customViewPayload.copy(str, str2, map, customViewFallback);
    }
}
