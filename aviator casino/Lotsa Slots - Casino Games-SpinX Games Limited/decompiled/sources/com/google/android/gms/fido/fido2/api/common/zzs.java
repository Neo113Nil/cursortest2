package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzs> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzt();
    private final java.util.List zza;

    public zzs(java.util.List list) {
        this.zza = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzs)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.zzs zzsVar = (com.google.android.gms.fido.fido2.api.common.zzs) obj;
        return this.zza.containsAll(zzsVar.zza) && zzsVar.zza.containsAll(this.zza);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(new java.util.HashSet(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
