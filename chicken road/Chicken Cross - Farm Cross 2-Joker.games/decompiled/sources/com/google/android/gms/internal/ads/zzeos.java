package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeos extends zzbxj {
    private final zzemt zza;

    /* synthetic */ zzeos(zzeot zzeotVar, zzemt zzemtVar, byte[] bArr) {
        Objects.requireNonNull(zzeotVar);
        this.zza = zzemtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zze() throws RemoteException {
        ((zzeof) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzf(String str) throws RemoteException {
        ((zzeof) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeof) this.zza.zzc).zzx(zzeVar);
    }
}
