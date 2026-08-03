package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Iterable<java.lang.String> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzbe> CREATOR = new com.google.android.gms.measurement.internal.zzbf();
    private final android.os.Bundle zza;

    zzbe(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.measurement.internal.zzbd(this);
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, zzf(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final java.lang.Object zza(java.lang.String str) {
        return this.zza.get(str);
    }

    final java.lang.Long zzb(java.lang.String str) {
        return java.lang.Long.valueOf(this.zza.getLong(str));
    }

    final java.lang.Double zzc(java.lang.String str) {
        return java.lang.Double.valueOf(this.zza.getDouble("value"));
    }

    final java.lang.String zzd(java.lang.String str) {
        return this.zza.getString(str);
    }

    public final int zze() {
        return this.zza.size();
    }

    public final android.os.Bundle zzf() {
        return new android.os.Bundle(this.zza);
    }

    final /* synthetic */ android.os.Bundle zzg() {
        return this.zza;
    }
}
