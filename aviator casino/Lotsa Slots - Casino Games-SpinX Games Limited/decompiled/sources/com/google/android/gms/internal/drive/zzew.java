package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzew extends com.google.android.gms.internal.drive.zza implements com.google.android.gms.internal.drive.zzeu {
    zzew(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IEventReleaseCallback");
    }

    @Override // com.google.android.gms.internal.drive.zzeu
    public final void zza(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.writeBoolean(zza, z);
        zzc(1, zza);
    }
}
