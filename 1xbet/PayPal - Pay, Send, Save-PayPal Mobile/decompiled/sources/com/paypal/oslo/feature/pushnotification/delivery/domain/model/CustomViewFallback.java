package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;", "", "", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewFallback;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomViewFallback {
    public static final int $stable = 0;
    private final java.lang.String body;
    private final java.lang.String title;

    public CustomViewFallback(java.lang.String str, java.lang.String str2) {
        this.title = str;
        this.body = str2;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.body;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomViewFallback(title=");
        sb.append(str);
        sb.append(", body=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.body;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback customViewFallback = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, customViewFallback.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, customViewFallback.body);
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback copy(java.lang.String title, java.lang.String body) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback(title, body);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback customViewFallback, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = customViewFallback.title;
        }
        if ((i & 2) != 0) {
            str2 = customViewFallback.body;
        }
        return customViewFallback.copy(str, str2);
    }
}
