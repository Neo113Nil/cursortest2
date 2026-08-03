package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzt> CREATOR = new com.google.android.gms.common.zzu();
    private final java.lang.String zza;

    @javax.annotation.Nullable
    private final com.google.android.gms.common.zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzt(java.lang.String str, @javax.annotation.Nullable android.os.IBinder iBinder, boolean z, boolean z2) {
        this.zza = str;
        com.google.android.gms.common.zzk zzkVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper zzd = com.google.android.gms.common.internal.zzw.zzg(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzd);
                if (bArr != null) {
                    zzkVar = new com.google.android.gms.common.zzk(bArr);
                } else {
                    android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zzkVar;
        this.zzc = z;
        this.zzd = z2;
    }

    zzt(java.lang.String str, @javax.annotation.Nullable com.google.android.gms.common.zzj zzjVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzjVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.zzj zzjVar = this.zzb;
        if (zzjVar == null) {
            android.util.Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzjVar = null;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzjVar, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
