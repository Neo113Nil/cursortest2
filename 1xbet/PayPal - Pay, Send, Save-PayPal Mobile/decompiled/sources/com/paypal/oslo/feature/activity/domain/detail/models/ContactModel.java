package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ContactModel;", "", "", "email", "url", "Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ContactModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail", "getUrl", "Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;", "getPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContactModel {
    public static final int $stable = 0;
    private final java.lang.String email;
    private final com.paypal.oslo.feature.activity.domain.detail.models.Phone phone;
    private final java.lang.String url;

    public ContactModel(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.domain.detail.models.Phone phone) {
        this.email = str;
        this.url = str2;
        this.phone = phone;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.Phone getPhone() {
        return this.phone;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.email;
        java.lang.String str2 = this.url;
        com.paypal.oslo.feature.activity.domain.detail.models.Phone phone = this.phone;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactModel(email=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.email;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.url;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.activity.domain.detail.models.Phone phone = this.phone;
        return (((hashCode * 31) + hashCode2) * 31) + (phone != null ? phone.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ContactModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ContactModel contactModel = (com.paypal.oslo.feature.activity.domain.detail.models.ContactModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.email, contactModel.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, contactModel.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, contactModel.phone);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ContactModel copy(java.lang.String email, java.lang.String url, com.paypal.oslo.feature.activity.domain.detail.models.Phone phone) {
        return new com.paypal.oslo.feature.activity.domain.detail.models.ContactModel(email, url, phone);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.Phone getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ContactModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ContactModel contactModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.activity.domain.detail.models.Phone phone, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactModel.email;
        }
        if ((i & 2) != 0) {
            str2 = contactModel.url;
        }
        if ((i & 4) != 0) {
            phone = contactModel.phone;
        }
        return contactModel.copy(str, str2, phone);
    }
}
