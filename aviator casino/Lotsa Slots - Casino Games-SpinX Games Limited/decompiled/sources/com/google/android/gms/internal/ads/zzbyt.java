package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbyt extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbyu {
    public zzbyt() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static com.google.android.gms.internal.ads.zzbyu zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyu ? (com.google.android.gms.internal.ads.zzbyu) queryLocalInterface : new com.google.android.gms.internal.ads.zzbys(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zze(intent);
                break;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(asInterface, readString, readString2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(asInterface2);
                break;
            case 5:
                java.lang.String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(createStringArray, createIntArray, asInterface3);
                break;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(asInterface4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
