package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzadr {
    private final Context zza;
    private final zzaed zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzaee zzh = new zzaee(1.0f);
    private zzdp zze = zzdp.zza;

    public zzadr(Context context, zzaed zzaedVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaedVar;
    }

    public final zzadr zza(boolean z) {
        this.zzd = true;
        return this;
    }

    public final zzadr zzb(zzdp zzdpVar) {
        this.zze = zzdpVar;
        return this;
    }

    public final zzadr zzc(long j) {
        this.zzg = j;
        return this;
    }

    public final zzadz zzd() {
        zzguk.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzadx(false);
        }
        zzadz zzadzVar = new zzadz(this, null);
        this.zzf = true;
        return zzadzVar;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzaed zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ zzdp zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ zzaee zzk() {
        return this.zzh;
    }
}
