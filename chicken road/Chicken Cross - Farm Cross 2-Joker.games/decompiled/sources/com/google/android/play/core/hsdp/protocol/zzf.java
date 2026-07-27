package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public final class zzf extends com.google.android.gms.internal.playcore_hsdp.zza implements zzh {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService");
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zzc(String str, String str2, Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(zza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(zza, zzjVar);
        zzb(3, zza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zzd(Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(zza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(zza, zzjVar);
        zzb(4, zza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zze(String str, List list, zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(zza, zzlVar);
        zzb(1, zza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zzf(String str, String str2, String str3, Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(zza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(zza, zzjVar);
        zzb(2, zza);
    }
}
