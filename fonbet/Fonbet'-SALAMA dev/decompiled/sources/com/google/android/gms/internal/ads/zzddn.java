package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzddn extends zzcpw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdbt zze;
    private final zzdez zzf;
    private final zzcqr zzg;
    private final zzfmn zzh;
    private final zzcvd zzi;
    private final zzbyu zzj;
    private boolean zzk;

    public zzddn(zzcpv zzcpvVar, Context context, zzceb zzcebVar, zzdbt zzdbtVar, zzdez zzdezVar, zzcqr zzcqrVar, zzfmn zzfmnVar, zzcvd zzcvdVar, zzbyu zzbyuVar) {
        super(zzcpvVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcebVar);
        this.zze = zzdbtVar;
        this.zzf = zzdezVar;
        this.zzg = zzcqrVar;
        this.zzh = zzfmnVar;
        this.zzi = zzcvdVar;
        this.zzj = zzbyuVar;
    }

    public final void finalize() {
        try {
            final zzceb zzcebVar = (zzceb) this.zzd.get();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgF)).booleanValue()) {
                if (!this.zzk && zzcebVar != null) {
                    zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddm
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z4, Activity activity) {
        zzfaf zzD;
        this.zze.zzb();
        zzbbp zzbbpVar = zzbby.zzaP;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.f(this.zzc)) {
                int i7 = J.f3546b;
                j.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzaQ)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzceb zzcebVar = (zzceb) this.zzd.get();
        if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzlS)).booleanValue() || zzcebVar == null || (zzD = zzcebVar.zzD()) == null || !zzD.zzar || zzD.zzas == this.zzj.zzb()) {
            if (this.zzk) {
                int i8 = J.f3546b;
                j.g("The interstitial ad has been shown.");
                this.zzi.zza(zzfcb.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z4, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdey e7) {
                    this.zzi.zzc(e7);
                }
            }
        } else {
            int i9 = J.f3546b;
            j.g("The interstitial consent form has been shown.");
            this.zzi.zza(zzfcb.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}
