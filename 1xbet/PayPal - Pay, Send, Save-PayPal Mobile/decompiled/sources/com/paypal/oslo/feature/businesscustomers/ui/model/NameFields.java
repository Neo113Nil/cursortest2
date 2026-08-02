package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameFields;", "Landroid/os/Parcelable;", "", "firstName", "lastName", "businessName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/model/NameFields;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFirstName", "getLastName", "getBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NameFields implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.NameFields> CREATOR = new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields.Creator();
    private final java.lang.String businessName;
    private final java.lang.String firstName;
    private final java.lang.String lastName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NameFields(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.firstName = str;
        this.lastName = str2;
        this.businessName = str3;
    }

    public /* synthetic */ NameFields(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final java.lang.String getBusinessName() {
        return this.businessName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.businessName);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.firstName;
        java.lang.String str2 = this.lastName;
        java.lang.String str3 = this.businessName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NameFields(firstName=");
        sb.append(str);
        sb.append(", lastName=");
        sb.append(str2);
        sb.append(", businessName=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.firstName;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.lastName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.businessName;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.model.NameFields)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields = (com.paypal.oslo.feature.businesscustomers.ui.model.NameFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, nameFields.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, nameFields.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, nameFields.businessName);
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.NameFields copy(java.lang.String firstName, java.lang.String lastName, java.lang.String businessName) {
        return new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields(firstName, lastName, businessName);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBusinessName() {
        return this.businessName;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.NameFields> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.NameFields[] newArray(int i) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.NameFields createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.model.NameFields(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.NameFields copy$default(com.paypal.oslo.feature.businesscustomers.ui.model.NameFields nameFields, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = nameFields.firstName;
        }
        if ((i & 2) != 0) {
            str2 = nameFields.lastName;
        }
        if ((i & 4) != 0) {
            str3 = nameFields.businessName;
        }
        return nameFields.copy(str, str2, str3);
    }

    public NameFields() {
        this(null, null, null, 7, null);
    }
}
