package com.paypal.oslo.feature.activity.ui.detail.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;", "", "", "sellerName", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitleFirstLine", "()Ljava/lang/String;", "getTitleSecondLine", "", "hasTwoLineTitle", "()Z", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/detail/model/ContactSellerData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSellerName", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContactSellerData {
    public static final int $stable = 0;
    private final java.lang.String email;
    private final java.lang.String sellerName;

    public ContactSellerData(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.sellerName = str;
        this.email = str2;
    }

    public final java.lang.String getSellerName() {
        return this.sellerName;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getTitleFirstLine() {
        return kotlin.text.StringsKt.substringBefore$default(this.sellerName, " ", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final java.lang.String getTitleSecondLine() {
        return kotlin.text.StringsKt.substringAfter$default(this.sellerName, " ", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final boolean hasTwoLineTitle() {
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.sellerName, (java.lang.CharSequence) " ", false, 2, (java.lang.Object) null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sellerName;
        java.lang.String str2 = this.email;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSellerData(sellerName=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.sellerName.hashCode() * 31) + this.email.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData contactSellerData = (com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sellerName, contactSellerData.sellerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, contactSellerData.email);
    }

    public final com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData copy(java.lang.String sellerName, java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sellerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        return new com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData(sellerName, email);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSellerName() {
        return this.sellerName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData copy$default(com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData contactSellerData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactSellerData.sellerName;
        }
        if ((i & 2) != 0) {
            str2 = contactSellerData.email;
        }
        return contactSellerData.copy(str, str2);
    }
}
