package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0260w;
import I2.J;
import I2.P;
import J2.j;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzewr implements zzejt {
    private final Context zza;
    private final Executor zzb;
    private final zzcgb zzc;
    private final zzejd zzd;
    private final zzejh zze;
    private final ViewGroup zzf;
    private zzbct zzg;
    private final zzcxi zzh;
    private final zzfgb zzi;
    private final zzczo zzj;
    private final zzfay zzk;
    private I3.b zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzejs zzo;

    public zzewr(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcgb zzcgbVar, zzejd zzejdVar, zzejh zzejhVar, zzfay zzfayVar, zzczo zzczoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgbVar;
        this.zzd = zzejdVar;
        this.zze = zzejhVar;
        this.zzk = zzfayVar;
        this.zzh = zzcgbVar.zze();
        this.zzi = zzcgbVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzczoVar;
        zzfayVar.zzs(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzig)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewn
                @Override // java.lang.Runnable
                public final void run() {
                    zzewr.this.zzd.zzdz(zzeVar);
                }
            });
        }
        zzejs zzejsVar = this.zzo;
        if (zzejsVar != null) {
            zzejsVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zza() {
        I3.b bVar = this.zzl;
        return (bVar == null || bVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejr zzejrVar, zzejs zzejsVar) {
        zzcot zzh;
        if (str == null) {
            int i7 = J.f3546b;
            j.d("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewp
                @Override // java.lang.Runnable
                public final void run() {
                    zzewr.this.zzd.zzdz(zzfcb.zzd(6, null, null));
                }
            });
            return false;
        }
        if (!zza()) {
            zzbbp zzbbpVar = zzbby.zziU;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzmVar.f10761f) {
                this.zzc.zzk().zzo(true);
            }
            Pair pair = new Pair(zzdpy.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.f10755Q));
            String zza = zzdpy.DYNAMITE_ENTER.zza();
            o.f1952C.j.getClass();
            Bundle zza2 = zzdqa.zza(pair, new Pair(zza, Long.valueOf(System.currentTimeMillis())));
            zzfay zzfayVar = this.zzk;
            zzfayVar.zzt(str);
            zzfayVar.zzH(zzmVar);
            zzfayVar.zzA(zza2);
            Context context = this.zza;
            zzfba zzJ = zzfayVar.zzJ();
            zzffn zzb = zzffm.zzb(context, zzffx.zzf(zzJ), 3, zzmVar);
            zzffy zzffyVar = null;
            if (!((Boolean) zzbee.zzd.zze()).booleanValue() || !this.zzk.zzh().f10766B) {
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzig)).booleanValue()) {
                    zzcos zzd = this.zzc.zzd();
                    zzctx zzctxVar = new zzctx();
                    zzctxVar.zzf(this.zza);
                    zzctxVar.zzk(zzJ);
                    zzd.zzi(zzctxVar.zzl());
                    zzdah zzdahVar = new zzdah();
                    zzdahVar.zzj(this.zzd, this.zzb);
                    zzdahVar.zzk(this.zzd, this.zzb);
                    zzd.zzf(zzdahVar.zzn());
                    zzd.zze(new zzehm(this.zzg));
                    zzd.zzd(new zzdfi(zzdhn.zza, null));
                    zzd.zzg(new zzcpo(this.zzh, this.zzj));
                    zzd.zzc(new zzcnm(this.zzf));
                    zzh = zzd.zzh();
                } else {
                    zzcos zzd2 = this.zzc.zzd();
                    zzctx zzctxVar2 = new zzctx();
                    zzctxVar2.zzf(this.zza);
                    zzctxVar2.zzk(zzJ);
                    zzd2.zzi(zzctxVar2.zzl());
                    zzdah zzdahVar2 = new zzdah();
                    zzdahVar2.zzj(this.zzd, this.zzb);
                    zzdahVar2.zza(this.zzd, this.zzb);
                    zzdahVar2.zza(this.zze, this.zzb);
                    zzdahVar2.zzl(this.zzd, this.zzb);
                    zzdahVar2.zzd(this.zzd, this.zzb);
                    zzdahVar2.zze(this.zzd, this.zzb);
                    zzdahVar2.zzf(this.zzd, this.zzb);
                    zzdahVar2.zzb(this.zzd, this.zzb);
                    zzdahVar2.zzk(this.zzd, this.zzb);
                    zzdahVar2.zzi(this.zzd, this.zzb);
                    zzd2.zzf(zzdahVar2.zzn());
                    zzd2.zze(new zzehm(this.zzg));
                    zzd2.zzd(new zzdfi(zzdhn.zza, null));
                    zzd2.zzg(new zzcpo(this.zzh, this.zzj));
                    zzd2.zzc(new zzcnm(this.zzf));
                    zzh = zzd2.zzh();
                }
                if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
                    zzffyVar = zzh.zzh();
                    zzffyVar.zzi(3);
                    zzffyVar.zzb(zzmVar.f10745G);
                    zzffyVar.zzf(zzmVar.f10742D);
                }
                this.zzo = zzejsVar;
                zzcra zzc = zzh.zzc();
                I3.b zzh2 = zzc.zzh(zzc.zzi());
                this.zzl = zzh2;
                zzgbc.zzr(zzh2, new zzewq(this, zzffyVar, zzb, zzh), this.zzb);
                return true;
            }
            zzejd zzejdVar = this.zzd;
            if (zzejdVar != null) {
                zzejdVar.zzdz(zzfcb.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfay zzf() {
        return this.zzk;
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(InterfaceC0260w interfaceC0260w) {
        this.zze.zza(interfaceC0260w);
    }

    public final void zzo(zzcxc zzcxcVar) {
        this.zzh.zzo(zzcxcVar, this.zzb);
    }

    public final void zzp(zzbct zzbctVar) {
        this.zzg = zzbctVar;
    }

    public final void zzq() {
        synchronized (this) {
            try {
                I3.b bVar = this.zzl;
                if (bVar != null && bVar.isDone()) {
                    try {
                        zzcnp zzcnpVar = (zzcnp) this.zzl.get();
                        this.zzl = null;
                        this.zzf.removeAllViews();
                        zzcnpVar.zzd();
                        ViewParent parent = zzcnpVar.zzd().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "Banner view provided from " + (zzcnpVar.zzl() != null ? zzcnpVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.";
                            int i7 = J.f3546b;
                            j.g(str);
                            ((ViewGroup) parent).removeView(zzcnpVar.zzd());
                        }
                        zzbbp zzbbpVar = zzbby.zzig;
                        C0254t c0254t = C0254t.f2723d;
                        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                            zzcyw zzn = zzcnpVar.zzn();
                            zzn.zza(this.zzd);
                            zzn.zzc(this.zze);
                        }
                        this.zzf.addView(zzcnpVar.zzd());
                        zzejs zzejsVar = this.zzo;
                        if (zzejsVar != null) {
                            zzejsVar.zzb(zzcnpVar);
                        }
                        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzejd zzejdVar = this.zzd;
                            Objects.requireNonNull(zzejdVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzejd.this.zzs();
                                }
                            });
                        }
                        if (zzcnpVar.zza() >= 0) {
                            this.zzm = false;
                            this.zzh.zzd(zzcnpVar.zza());
                            this.zzh.zze(zzcnpVar.zzc());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcnpVar.zzc());
                        }
                    } catch (InterruptedException e7) {
                        e = e7;
                        zzt();
                        J.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    } catch (ExecutionException e8) {
                        e = e8;
                        zzt();
                        J.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    }
                } else if (this.zzl != null) {
                    J.k("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    J.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzs() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        P p5 = o.f1952C.f1957c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return P.o(view, powerManager, keyguardManager);
    }
}
