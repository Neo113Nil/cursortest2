package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import W5.AbstractC0486a1;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcmu implements zzaxx {
    private zzceb zza;
    private final Executor zzb;
    private final zzcmg zzc;
    private final p090m3.a zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcmj zzg = new zzcmj();

    public zzcmu(Executor executor, zzcmg zzcmgVar, p090m3.a aVar) {
        this.zzb = executor;
        this.zzc = zzcmgVar;
        this.zzd = aVar;
    }

    public static /* synthetic */ void zza(zzcmu zzcmuVar, JSONObject jSONObject) {
        String strH = AbstractC0486a1.h("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
        int i7 = J.f3546b;
        j.b(strH);
        zzcmuVar.zza.zzp("AFMA_updateActiveView", jSONObject);
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmu.zza(this.zza, jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e7) {
            J.l("Failed to call video active view js", e7);
        }
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        boolean z4 = this.zzf ? false : zzaxwVar.zzj;
        zzcmj zzcmjVar = this.zzg;
        zzcmjVar.zza = z4;
        ((p090m3.b) this.zzd).getClass();
        zzcmjVar.zzd = SystemClock.elapsedRealtime();
        this.zzg.zzf = zzaxwVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z4) {
        this.zzf = z4;
    }

    public final void zzf(zzceb zzcebVar) {
        this.zza = zzcebVar;
    }
}
