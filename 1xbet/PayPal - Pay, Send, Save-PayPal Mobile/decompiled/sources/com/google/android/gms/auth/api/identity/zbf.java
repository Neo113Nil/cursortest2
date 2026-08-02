package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public final class zbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.zbf> CREATOR = new com.google.android.gms.auth.api.identity.zbg();
    private final java.lang.String zba;
    private final boolean zbb;

    public zbf(java.lang.String str, boolean z) {
        this.zba = str;
        this.zbb = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.zbf)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.zbf zbfVar = (com.google.android.gms.auth.api.identity.zbf) obj;
        return this.zba.equals(zbfVar.zba) && this.zbb == zbfVar.zbb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, java.lang.Boolean.valueOf(this.zbb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zba;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zbb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
