package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public class zzk implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    protected final android.os.Parcel zza() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    protected final void zzb(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zza;
    }

    protected zzk(android.os.IBinder iBinder, java.lang.String str) {
        this.zza = iBinder;
    }
}
