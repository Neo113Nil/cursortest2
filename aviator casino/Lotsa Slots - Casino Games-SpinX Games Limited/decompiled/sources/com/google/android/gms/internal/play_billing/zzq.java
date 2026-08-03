package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzq extends com.google.android.gms.internal.play_billing.zzv implements com.google.android.gms.internal.play_billing.zzs {
    zzq(android.os.IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zza(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        android.os.Parcel zzv = zzv(5, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zzc(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(10, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzd(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(902, zzu);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zze(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(12, zzu);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzf(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        android.os.Parcel zzv = zzv(3, zzu);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzg(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(8, zzu);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzh(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(6);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(9, zzu);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzi(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        android.os.Parcel zzv = zzv(4, zzu);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzj(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(11, zzu);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzk(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        android.os.Parcel zzv = zzv(2, zzu);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final android.os.Bundle zzl(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle2);
        android.os.Parcel zzv = zzv(901, zzu);
        android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(zzv, android.os.Bundle.CREATOR);
        zzv.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzm(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzd zzdVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzdVar);
        zzx(1501, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzn(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzf zzfVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzfVar);
        zzx(1801, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzo(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzhVar);
        zzx(1601, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzp(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(18);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzjVar);
        zzw(com.ironsource.InterfaceC3047fe.c.e, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzq(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzl zzlVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzlVar);
        zzx(1901, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzr(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zznVar);
        zzx(1401, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzs(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzpVar);
        zzx(1701, zzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzs
    public final void zzt(int i, java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.play_billing.zzu zzuVar) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(12);
        zzu.writeString(str);
        com.google.android.gms.internal.play_billing.zzx.zzc(zzu, bundle);
        zzu.writeStrongBinder(zzuVar);
        zzw(com.ironsource.InterfaceC3047fe.a.b, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int zzy(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        android.os.Parcel zzv = zzv(1, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }
}
