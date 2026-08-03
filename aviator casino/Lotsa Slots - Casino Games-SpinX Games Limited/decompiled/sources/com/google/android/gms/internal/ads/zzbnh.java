package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbnh extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbni {
    public zzbnh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static com.google.android.gms.internal.ads.zzbni zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbni ? (com.google.android.gms.internal.ads.zzbni) queryLocalInterface : new com.google.android.gms.internal.ads.zzbng(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbmv zzbmtVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmtVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbmtVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmv ? (com.google.android.gms.internal.ads.zzbmv) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmt(readStrongBinder);
        }
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zze(zzbmtVar);
        parcel2.writeNoException();
        return true;
    }
}
