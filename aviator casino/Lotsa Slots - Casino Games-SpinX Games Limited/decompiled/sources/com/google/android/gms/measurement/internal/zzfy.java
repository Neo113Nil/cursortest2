package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfy extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.measurement.internal.zzga {
    zzfy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzA(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzB(com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzon zzonVar, com.google.android.gms.measurement.internal.zzgg zzggVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzonVar);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzggVar);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzC(com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzaf zzafVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzafVar);
        zzc(30, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzD(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzgd zzgdVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzgdVar);
        zzc(31, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zze(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzbgVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzf(com.google.android.gms.measurement.internal.zzpk zzpkVar, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzpkVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzg(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzh(com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzi(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzj(com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zza.writeInt(z ? 1 : 0);
        android.os.Parcel zzP = zzP(7, zza);
        java.util.ArrayList createTypedArrayList = zzP.createTypedArrayList(com.google.android.gms.measurement.internal.zzpk.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final byte[] zzk(com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzbgVar);
        zza.writeString(str);
        android.os.Parcel zzP = zzP(9, zza);
        byte[] createByteArray = zzP.createByteArray();
        zzP.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzl(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.lang.String zzm(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        android.os.Parcel zzP = zzP(11, zza);
        java.lang.String readString = zzP.readString();
        zzP.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzn(com.google.android.gms.measurement.internal.zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzahVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzo(com.google.android.gms.measurement.internal.zzah zzahVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzp(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i = com.google.android.gms.internal.measurement.zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        android.os.Parcel zzP = zzP(14, zza);
        java.util.ArrayList createTypedArrayList = zzP.createTypedArrayList(com.google.android.gms.measurement.internal.zzpk.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzq(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i = com.google.android.gms.internal.measurement.zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        android.os.Parcel zzP = zzP(15, zza);
        java.util.ArrayList createTypedArrayList = zzP.createTypedArrayList(com.google.android.gms.measurement.internal.zzpk.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzr(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        android.os.Parcel zzP = zzP(16, zza);
        java.util.ArrayList createTypedArrayList = zzP.createTypedArrayList(com.google.android.gms.measurement.internal.zzah.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzs(java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        android.os.Parcel zzP = zzP(17, zza);
        java.util.ArrayList createTypedArrayList = zzP.createTypedArrayList(com.google.android.gms.measurement.internal.zzah.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzt(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzu(android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzv(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final com.google.android.gms.measurement.internal.zzao zzw(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        android.os.Parcel zzP = zzP(21, zza);
        com.google.android.gms.measurement.internal.zzao zzaoVar = (com.google.android.gms.measurement.internal.zzao) com.google.android.gms.internal.measurement.zzbn.zzb(zzP, com.google.android.gms.measurement.internal.zzao.CREATOR);
        zzP.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzx(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzy(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzz(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzrVar);
        zzc(26, zza);
    }
}
