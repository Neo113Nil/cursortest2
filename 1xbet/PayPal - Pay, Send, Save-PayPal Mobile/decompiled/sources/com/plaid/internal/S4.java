package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes16.dex */
public final class S4 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.S4> CREATOR = new com.plaid.internal.S4.a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5919a;

    public static final class a implements android.os.Parcelable.Creator<com.plaid.internal.S4> {
        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.S4 createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.internal.S4(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.S4[] newArray(int i) {
            return new com.plaid.internal.S4[i];
        }
    }

    public S4() {
        this.f5919a = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.plaid.internal.S4) && this.f5919a == ((com.plaid.internal.S4) obj).f5919a;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f5919a);
    }

    public final java.lang.String toString() {
        boolean z = this.f5919a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaidClientSideOnlyConfiguration(noLoadingUi=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.f5919a ? 1 : 0);
    }

    public S4(boolean z) {
        this.f5919a = z;
    }
}
