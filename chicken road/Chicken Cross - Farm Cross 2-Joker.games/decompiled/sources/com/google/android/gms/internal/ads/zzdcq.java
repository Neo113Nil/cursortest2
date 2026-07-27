package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdcq implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzflo zzc;
    private final zzfld zzd;
    private final Clock zze;
    private final zzeaj zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfsc zza = zzfsd.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzdcq(zzflo zzfloVar, zzfld zzfldVar, Clock clock, zzeaj zzeajVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfloVar;
        this.zzd = zzfldVar;
        this.zze = clock;
        this.zzf = zzeajVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            zzeaj zzeajVar = this.zzf;
            String str = this.zzc.zzb.zzb.zzb;
            String encodeToString = Base64.encodeToString(((zzfsd) this.zza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoB)).booleanValue()) {
                zzeai zza = zzeajVar.zza();
                zza.zzc("action", "pclma");
                zza.zzc("pclmd", encodeToString);
                zza.zzc("gqi", str);
                zza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i = this.zzd.zzaE;
            if (i > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdcp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdcq.this.zzm();
                    }
                }, i, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            if (this.zzi) {
                return;
            }
            this.zzi = true;
            zzn();
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            if (!this.zzi && this.zzh) {
                zzfsc zzfscVar = this.zza;
                zzfqs zza = zzfqt.zza();
                zza.zzb(i);
                zza.zza(this.zze.currentTimeMillis());
                zzfscVar.zza((zzfqt) zza.zzbu());
                if (i == 10) {
                    zzn();
                    this.zzi = true;
                }
            }
        }
    }
}
