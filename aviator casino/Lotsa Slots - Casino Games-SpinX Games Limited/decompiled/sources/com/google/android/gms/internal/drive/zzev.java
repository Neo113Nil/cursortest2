package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public abstract class zzev extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzeu {
    public static com.google.android.gms.internal.drive.zzeu zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
        if (queryLocalInterface instanceof com.google.android.gms.internal.drive.zzeu) {
            return (com.google.android.gms.internal.drive.zzeu) queryLocalInterface;
        }
        return new com.google.android.gms.internal.drive.zzew(iBinder);
    }
}
