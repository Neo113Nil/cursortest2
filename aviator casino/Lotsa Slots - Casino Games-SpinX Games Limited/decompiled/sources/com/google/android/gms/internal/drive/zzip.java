package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzip extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzio {
    public static com.google.android.gms.internal.drive.zzio zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (queryLocalInterface instanceof com.google.android.gms.internal.drive.zzio) {
            return (com.google.android.gms.internal.drive.zzio) queryLocalInterface;
        }
        return new com.google.android.gms.internal.drive.zziq(iBinder);
    }
}
