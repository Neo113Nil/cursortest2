package com.google.android.gms.internal.ads;

import H2.m;
import I2.J;
import J2.j;
import W5.AbstractC0486a1;
import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.InterfaceC1436a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcmk implements zzaxx, zzcvl, m, zzcvk {
    private final zzcmf zza;
    private final zzcmg zzb;
    private final zzboc zzd;
    private final Executor zze;
    private final InterfaceC1436a zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcmj zzh = new zzcmj();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcmk(zzbnz zzbnzVar, zzcmg zzcmgVar, Executor executor, zzcmf zzcmfVar, InterfaceC1436a interfaceC1436a) {
        this.zza = zzcmfVar;
        zzbnk zzbnkVar = zzbnn.zza;
        this.zzd = zzbnzVar.zza("google.afma.activeView.handleUpdate", zzbnkVar, zzbnkVar);
        this.zzb = zzcmgVar;
        this.zze = executor;
        this.zzf = interfaceC1436a;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzceb) it.next());
        }
        this.zza.zze();
    }

    @Override // H2.m
    public final synchronized void zzdE() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final synchronized void zzdh(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // H2.m
    public final synchronized void zzdi() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final synchronized void zzdj(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final synchronized void zzdk(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final synchronized void zzdn(zzaxw zzaxwVar) {
        zzcmj zzcmjVar = this.zzh;
        zzcmjVar.zza = zzaxwVar.zzj;
        zzcmjVar.zzf = zzaxwVar;
        zzg();
    }

    @Override // H2.m
    public final void zzdo() {
    }

    @Override // H2.m
    public final void zzdp() {
    }

    @Override // H2.m
    public final void zzdr() {
    }

    @Override // H2.m
    public final void zzds(int i7) {
    }

    public final synchronized void zzg() {
        try {
            if (this.zzj.get() == null) {
                zzj();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcmj zzcmjVar = this.zzh;
                ((m3.b) this.zzf).getClass();
                zzcmjVar.zzd = SystemClock.elapsedRealtime();
                final JSONObject zzb = this.zzb.zzb(this.zzh);
                for (final zzceb zzcebVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
                        @Override // java.lang.Runnable
                        public final void run() {
                            JSONObject jSONObject = zzb;
                            String h6 = AbstractC0486a1.h("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
                            int i7 = J.f3546b;
                            j.b(h6);
                            zzcebVar.zzp("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzbzd.zzb(this.zzd.zzc(zzb), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e7) {
                J.l("Failed to call ActiveViewJS", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzh(zzceb zzcebVar) {
        this.zzc.add(zzcebVar);
        this.zza.zzd(zzcebVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
