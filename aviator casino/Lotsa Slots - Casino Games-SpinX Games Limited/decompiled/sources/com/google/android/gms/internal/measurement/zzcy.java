package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzcy extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.internal.measurement.zzda {
    zzcy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzP = zzP(2, zza());
        int readInt = zzP.readInt();
        zzP.recycle();
        return readInt;
    }
}
