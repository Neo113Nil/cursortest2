package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgad {
    final /* synthetic */ zzgae zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzgad(zzgae zzgaeVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzgaeVar);
        this.zza = zzgaeVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzgae zzgaeVar = this.zza;
            if (zzgaeVar.zzb) {
                zzgah zzgahVar = zzgaeVar.zza;
                zzgahVar.zzg(this.zzb);
                zzgahVar.zzh(this.zzc);
                zzgahVar.zzi(this.zzd);
                zzgahVar.zzf(null);
                zzgahVar.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final zzgad zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final zzgad zzc(int i) {
        this.zzd = i;
        return this;
    }
}
