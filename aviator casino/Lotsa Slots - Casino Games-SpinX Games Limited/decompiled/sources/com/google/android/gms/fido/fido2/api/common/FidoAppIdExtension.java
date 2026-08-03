package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class FidoAppIdExtension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzx();
    private final java.lang.String zza;

    public FidoAppIdExtension(java.lang.String str) {
        this.zza = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) {
            return this.zza.equals(((com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) obj).zza);
        }
        return false;
    }

    public java.lang.String getAppId() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getAppId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
