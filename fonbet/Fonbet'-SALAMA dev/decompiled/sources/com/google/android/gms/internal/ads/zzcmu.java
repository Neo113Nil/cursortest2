package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import W5.AbstractC0486a1;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import m3.InterfaceC1436a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcmu implements zzaxx {
    private zzceb zza;
    private final Executor zzb;
    private final zzcmg zzc;
    private final InterfaceC1436a zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcmj zzg = new zzcmj();

    public zzcmu(Executor executor, zzcmg zzcmgVar, InterfaceC1436a interfaceC1436a) {
        this.zzb = executor;
        this.zzc = zzcmgVar;
        this.zzd = interfaceC1436a;
    }

    public static /* synthetic */ void zza(zzcmu zzcmuVar, JSONObject jSONObject) {
        String h6 = AbstractC0486a1.h("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
        int i7 = J.f3546b;
        j.b(h6);
        zzcmuVar.zza.zzp("AFMA_updateActiveView", jSONObject);
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmu.zza(zzcmu.this, zzb);
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
        ((m3.b) this.zzd).getClass();
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
