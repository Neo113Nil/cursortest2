package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzfze extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzfzf {
    public zzfze() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
