package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzad> CREATOR = new com.google.android.gms.location.zzae();
    private final boolean zza;
    private final com.google.android.gms.internal.identity.ClientIdentity zzb;

    zzad(boolean z, com.google.android.gms.internal.identity.ClientIdentity clientIdentity) {
        this.zza = z;
        this.zzb = clientIdentity;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.zzad)) {
            return false;
        }
        com.google.android.gms.location.zzad zzadVar = (com.google.android.gms.location.zzad) obj;
        return this.zza == zzadVar.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LocationAvailabilityRequest[");
        if (this.zza) {
            sb.append("bypass, ");
        }
        if (this.zzb != null) {
            sb.append("impersonation=");
            sb.append(this.zzb);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, z);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
