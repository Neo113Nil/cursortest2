package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzbn extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.util.zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            java.lang.String readString = parcel.readString();
            java.lang.String readString2 = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            boolean zze = zze(asInterface, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i == 2) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(asInterface2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            boolean zzg = zzg(asInterface3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}
