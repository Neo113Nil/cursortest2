package com.google.android.gms.internal.ads_identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes4.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected zza(android.os.IBinder iBinder, java.lang.String str) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zza;
    }

    protected final android.os.Parcel zza() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    protected final android.os.Parcel zzb(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.zza.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (java.lang.RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
