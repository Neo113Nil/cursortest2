package com.paypal.oslo.core.userstore.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "", "", "id", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "primary", "confirmed", "Ljava/util/Date;", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Date;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Date;)Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getEmailAddress", "Z", "getPrimary", "getConfirmed", "Ljava/util/Date;", "getCreatedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileEmail {
    private final boolean confirmed;
    private final java.util.Date createdTime;
    private final java.lang.String emailAddress;
    private final java.lang.String id;
    private final boolean primary;

    public ProfileEmail(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        this.id = str;
        this.emailAddress = str2;
        this.primary = z;
        this.confirmed = z2;
        this.createdTime = date;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getEmailAddress() {
        return this.emailAddress;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.emailAddress;
        boolean z = this.primary;
        boolean z2 = this.confirmed;
        java.util.Date date = this.createdTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileEmail(id=");
        sb.append(str);
        sb.append(", emailAddress=");
        sb.append(str2);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", confirmed=");
        sb.append(z2);
        sb.append(", createdTime=");
        sb.append(date);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + java.lang.Boolean.hashCode(this.confirmed)) * 31) + this.createdTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.userstore.model.ProfileEmail)) {
            return false;
        }
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = (com.paypal.oslo.core.userstore.model.ProfileEmail) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, profileEmail.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, profileEmail.emailAddress) && this.primary == profileEmail.primary && this.confirmed == profileEmail.confirmed && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, profileEmail.createdTime);
    }

    public final com.paypal.oslo.core.userstore.model.ProfileEmail copy(java.lang.String id, java.lang.String emailAddress, boolean primary, boolean confirmed, java.util.Date createdTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
        return new com.paypal.oslo.core.userstore.model.ProfileEmail(id, emailAddress, primary, confirmed, createdTime);
    }

    /* renamed from: component5, reason: from getter */
    public final java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.core.userstore.model.ProfileEmail copy$default(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = profileEmail.id;
        }
        if ((i & 2) != 0) {
            str2 = profileEmail.emailAddress;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = profileEmail.primary;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = profileEmail.confirmed;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            date = profileEmail.createdTime;
        }
        return profileEmail.copy(str, str3, z3, z4, date);
    }
}
