package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzdmu extends zzcpw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdez zze;
    private final zzdbt zzf;
    private final zzcvd zzg;
    private final zzcwk zzh;
    private final zzcqr zzi;
    private final zzbvq zzj;
    private final zzfmn zzk;
    private final zzfat zzl;
    private boolean zzm;

    public zzdmu(zzcpv zzcpvVar, Context context, zzceb zzcebVar, zzdez zzdezVar, zzdbt zzdbtVar, zzcvd zzcvdVar, zzcwk zzcwkVar, zzcqr zzcqrVar, zzfaf zzfafVar, zzfmn zzfmnVar, zzfat zzfatVar) {
        super(zzcpvVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdezVar;
        this.zzd = new WeakReference(zzcebVar);
        this.zzf = zzdbtVar;
        this.zzg = zzcvdVar;
        this.zzh = zzcwkVar;
        this.zzi = zzcqrVar;
        this.zzk = zzfmnVar;
        zzbvm zzbvmVar = zzfafVar.zzl;
        this.zzj = new zzbwk(zzbvmVar != null ? zzbvmVar.zza : "", zzbvmVar != null ? zzbvmVar.zzb : 1);
        this.zzl = zzfatVar;
    }

    public final void finalize() {
        try {
            final zzceb zzcebVar = (zzceb) this.zzd.get();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgF)).booleanValue()) {
                if (!this.zzm && zzcebVar != null) {
                    zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzceb.this.destroy();
                        }
                    });
                }
            } else if (zzcebVar != null) {
                zzcebVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvq zzc() {
        return this.zzj;
    }

    public final zzfat zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzceb zzcebVar = (zzceb) this.zzd.get();
        return (zzcebVar == null || zzcebVar.zzaG()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z4, Activity activity) {
        zzbbp zzbbpVar = zzbby.zzaP;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.f(this.zzc)) {
                int i7 = J.f3546b;
                j.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzaQ)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            int i8 = J.f3546b;
            j.g("The rewarded ad have been showed.");
            this.zzg.zza(zzfcb.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z4, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdey e7) {
            this.zzg.zzc(e7);
            return false;
        }
    }
}
