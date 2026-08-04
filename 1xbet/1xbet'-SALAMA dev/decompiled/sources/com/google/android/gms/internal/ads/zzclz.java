package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import I2.P;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzclz implements zzcuq, zzcwe, zzcvk, InterfaceC0217a, zzcvg, zzdcg {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfar zze;
    private final zzfaf zzf;
    private final zzfhv zzg;
    private final zzfbm zzh;
    private final zzauo zzi;
    private final zzbdf zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzctq zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    public zzclz(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfar zzfarVar, zzfaf zzfafVar, zzfhv zzfhvVar, zzfbm zzfbmVar, View view, zzceb zzcebVar, zzauo zzauoVar, zzbdf zzbdfVar, zzbdh zzbdhVar, zzffy zzffyVar, zzctq zzctqVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfarVar;
        this.zzf = zzfafVar;
        this.zzg = zzfhvVar;
        this.zzh = zzfbmVar;
        this.zzi = zzauoVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcebVar);
        this.zzj = zzbdfVar;
        this.zzm = zzctqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzls)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.c(this.zza)) {
                Object systemService = this.zza.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String strZzh;
        int i7;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbbp zzbbpVar = zzbby.zzdJ;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) c0254t.f2726c.zzb(zzbby.zzaE)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbdx.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zze(this.zze, this.zzf, false, strZzh, null, zzu()));
            return;
        }
        if (((Boolean) zzbdx.zzg.zze()).booleanValue() && ((i7 = this.zzf.zzb) == 1 || i7 == 2 || i7 == 5)) {
        }
        zzgbc.zzr((zzgat) zzgbc.zzo(zzgat.zzu(zzgbc.zzh(null)), ((Long) c0254t.f2726c.zzb(zzbby.zzbh)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcly(this, strZzh), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(final int i7, final int i8) {
        View view;
        if (i7 <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclv
                @Override // java.lang.Runnable
                public final void run() {
                    zzclz zzclzVar = this.zza;
                    zzclzVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzclzVar.zzw(i - 1, i);
                        }
                    });
                }
            }, i8, TimeUnit.MILLISECONDS);
        }
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        if (!(((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaE)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbdx.zzd.zze()).booleanValue()) {
            zzgbc.zzr((zzgat) zzgbc.zze(zzgat.zzu(this.zzj.zza()), Throwable.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // com.google.android.gms.internal.ads.zzfsw
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzbza.zzg), new zzclx(this), this.zzb);
            return;
        }
        zzfbm zzfbmVar = this.zzh;
        zzfhv zzfhvVar = this.zzg;
        zzfar zzfarVar = this.zze;
        zzfaf zzfafVar = this.zzf;
        zzfbmVar.zzc(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzc), true == o.f1952C.f1961g.zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(zzbva zzbvaVar, String str, String str2) {
        zzfbm zzfbmVar = this.zzh;
        zzfhv zzfhvVar = this.zzg;
        zzfaf zzfafVar = this.zzf;
        zzfbmVar.zza(zzfhvVar.zzf(zzfafVar, zzfafVar.zzh, zzbvaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
        zzfbm zzfbmVar = this.zzh;
        zzfhv zzfhvVar = this.zzg;
        zzfar zzfarVar = this.zze;
        zzfaf zzfafVar = this.zzf;
        zzfbmVar.zza(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
        zzfbm zzfbmVar = this.zzh;
        zzfhv zzfhvVar = this.zzg;
        zzfar zzfarVar = this.zze;
        zzfaf zzfafVar = this.zzf;
        zzfbmVar.zza(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzg));
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbG)).booleanValue()) {
            int i7 = zzeVar.f10720a;
            zzfaf zzfafVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = zzfafVar.zzo.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfhv.zzc((String) it.next(), "@gw_mpe@", "2." + i7));
            }
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            zzbbp zzbbpVar = zzbby.zzdS;
            C0254t c0254t = C0254t.f2723d;
            int iIntValue = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
            if (iIntValue > 0) {
                zzw(iIntValue, ((Integer) c0254t.f2726c.zzb(zzbby.zzdT)).intValue());
                return;
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdR)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcls
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzclz zzclzVar = this.zza;
                        zzclzVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclu
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzclzVar.zzv();
                            }
                        });
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final synchronized void zzs() {
        zzctq zzctqVar;
        try {
            if (this.zzn) {
                ArrayList arrayList = new ArrayList(zzu());
                arrayList.addAll(this.zzf.zzf);
                this.zzh.zza(this.zzg.zze(this.zze, this.zzf, true, null, null, arrayList));
            } else {
                zzfbm zzfbmVar = this.zzh;
                zzfhv zzfhvVar = this.zzg;
                zzfar zzfarVar = this.zze;
                zzfaf zzfafVar = this.zzf;
                zzfbmVar.zza(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzm));
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdO)).booleanValue() && (zzctqVar = this.zzm) != null) {
                    List list = zzctqVar.zzb().zzm;
                    String strZzg = zzctqVar.zza().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfhv.zzc((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZza = this.zzm.zza().zza();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfhv.zzc((String) it2.next(), "@gw_ttr@", Long.toString(jZza, 10)));
                    }
                    zzfbm zzfbmVar2 = this.zzh;
                    zzfhv zzfhvVar2 = this.zzg;
                    zzctq zzctqVar2 = this.zzm;
                    zzfbmVar2.zza(zzfhvVar2.zzd(zzctqVar2.zzc(), zzctqVar2.zzb(), arrayList3));
                }
                zzfbm zzfbmVar3 = this.zzh;
                zzfhv zzfhvVar3 = this.zzg;
                zzfar zzfarVar2 = this.zze;
                zzfaf zzfafVar2 = this.zzf;
                zzfbmVar3.zza(zzfhvVar3.zzd(zzfarVar2, zzfafVar2, zzfafVar2.zzf));
            }
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzt() {
        zzfbm zzfbmVar = this.zzh;
        zzfhv zzfhvVar = this.zzg;
        zzfar zzfarVar = this.zze;
        zzfaf zzfafVar = this.zzf;
        zzfbmVar.zza(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzau));
    }
}
