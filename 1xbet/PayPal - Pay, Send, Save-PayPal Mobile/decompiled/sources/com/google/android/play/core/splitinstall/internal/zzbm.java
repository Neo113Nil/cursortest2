package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbm extends com.google.android.play.core.splitinstall.internal.zzk implements com.google.android.play.core.splitinstall.internal.zzbo {
    zzbm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzc(java.lang.String str, int i, android.os.Bundle bundle, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.play.core.splitinstall.internal.zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzd(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        com.google.android.play.core.splitinstall.internal.zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(8, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zze(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        com.google.android.play.core.splitinstall.internal.zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(13, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzf(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        com.google.android.play.core.splitinstall.internal.zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(14, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzg(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        com.google.android.play.core.splitinstall.internal.zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(7, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzh(java.lang.String str, int i, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(zzbqVar);
        zzb(5, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzi(java.lang.String str, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeStrongBinder(zzbqVar);
        zzb(6, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzj(java.lang.String str, java.util.List list, android.os.Bundle bundle, com.google.android.play.core.splitinstall.internal.zzbq zzbqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        com.google.android.play.core.splitinstall.internal.zzm.zzc(zza, bundle);
        zza.writeStrongBinder(zzbqVar);
        zzb(2, zza);
    }
}
