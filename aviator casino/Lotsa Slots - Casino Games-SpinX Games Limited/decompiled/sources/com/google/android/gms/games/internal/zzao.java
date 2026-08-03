package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzao extends com.google.android.gms.internal.games_v2.zza implements android.os.IInterface {
    zzao(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void zzA(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zzc(6504, zza);
    }

    public final void zzB(com.google.android.gms.games.internal.zzal zzalVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeInt(z ? 1 : 0);
        zzc(6503, zza);
    }

    public final void zzC(com.google.android.gms.games.internal.zzal zzalVar, android.os.Bundle bundle, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, bundle);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc(5021, zza);
    }

    public final void zzD(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, int i, int i2, int i3, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(z ? 1 : 0);
        zzc(5020, zza);
    }

    public final void zzE(com.google.android.gms.games.internal.zzal zzalVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeInt(z ? 1 : 0);
        zzc(17001, zza);
    }

    public final void zzF(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zzc(13006, zza);
    }

    public final void zzG(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, int i, boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(z2 ? 1 : 0);
        zzc(9020, zza);
    }

    public final void zzH(com.google.android.gms.games.internal.zzal zzalVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeInt(z ? 1 : 0);
        zzc(12002, zza);
    }

    public final void zzI(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, int i, int i2, int i3, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(z ? 1 : 0);
        zzc(5019, zza);
    }

    public final void zzJ(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, boolean z, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(i);
        zzc(15001, zza);
    }

    public final void zzK(com.google.android.gms.games.internal.zzan zzanVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzanVar);
        zza.writeLong(j);
        zzc(15501, zza);
    }

    public final void zzL(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zzc(27003, zza);
    }

    public final void zzM(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, com.google.android.gms.drive.Contents contents) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, contents);
        zzc(12033, zza);
    }

    public final void zzN(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, bundle);
        zzc(5023, zza);
    }

    public final void zzO(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, int i, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, bundle);
        zzc(com.facebook.ads.AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, zza);
    }

    public final void zzP(android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, bundle);
        zzc(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_loadException, zza);
    }

    public final void zzQ(com.google.android.gms.games.internal.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zzc(5002, zza);
    }

    public final void zzR(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, long j, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeLong(j);
        zza.writeString(str2);
        zzc(com.facebook.ads.AdError.LOAD_CALLED_WHILE_SHOWING_AD, zza);
    }

    public final void zzS(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, bundle);
        zzc(5024, zza);
    }

    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(12036, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final int zze() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(12035, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final android.app.PendingIntent zzf() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(25015, zza());
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.app.PendingIntent.CREATOR);
        zzb.recycle();
        return pendingIntent;
    }

    public final android.content.Intent zzg() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(9005, zza());
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final android.content.Intent zzh() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(9003, zza());
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final android.content.Intent zzi(com.google.android.gms.games.PlayerEntity playerEntity) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, playerEntity);
        android.os.Parcel zzb = zzb(15503, zza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final android.content.Intent zzj(java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        android.os.Parcel zzb = zzb(25016, zza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final android.content.Intent zzk(java.lang.String str, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        android.os.Parcel zzb = zzb(18001, zza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final android.content.Intent zzl() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(9010, zza());
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final android.content.Intent zzm(java.lang.String str, boolean z, boolean z2, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        int i2 = com.google.android.gms.internal.games_v2.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(z2 ? 1 : 0);
        zza.writeInt(i);
        android.os.Parcel zzb = zzb(12001, zza);
        android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(zzb, android.content.Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final com.google.android.gms.common.data.DataHolder zzn() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(5013, zza());
        com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(zzb, com.google.android.gms.common.data.DataHolder.CREATOR);
        zzb.recycle();
        return dataHolder;
    }

    public final java.lang.String zzo() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(5012, zza());
        java.lang.String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final void zzp() throws android.os.RemoteException {
        zzc(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_showFailed, zza());
    }

    public final void zzq(long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        zzc(5001, zza);
    }

    public final void zzr(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, com.google.android.gms.drive.Contents contents) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, contents);
        zzc(12007, zza);
    }

    public final void zzs(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zzc(12020, zza);
    }

    public final void zzt(com.google.android.gms.drive.Contents contents) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, contents);
        zzc(androidx.compose.runtime.ComposeVersion.version, zza);
    }

    public final void zzu(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, java.lang.String str2, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc(8001, zza);
    }

    public final void zzv(com.google.android.gms.games.internal.zzal zzalVar, java.lang.String str, int i, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, bundle);
        zzc(5025, zza);
    }

    public final void zzw(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zzc(12017, zza);
    }

    public final void zzx(com.google.android.gms.games.internal.zzal zzalVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeInt(z ? 1 : 0);
        zzc(6001, zza);
    }

    public final void zzy(com.google.android.gms.games.internal.zzal zzalVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeInt(z ? 1 : 0);
        zzc(12016, zza);
    }

    public final void zzz(com.google.android.gms.games.internal.zzal zzalVar, boolean z, java.lang.String[] strArr) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzalVar);
        zza.writeInt(z ? 1 : 0);
        zza.writeStringArray(strArr);
        zzc(12031, zza);
    }
}
