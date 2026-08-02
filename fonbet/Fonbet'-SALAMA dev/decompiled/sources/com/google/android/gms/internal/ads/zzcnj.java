package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzcnj extends zzcpw {
    private final zzceb zzc;
    private final int zzd;
    private final Context zze;
    private final zzcmx zzf;
    private final zzdez zzg;
    private final zzdbt zzh;
    private final zzcvd zzi;
    private final boolean zzj;
    private final zzbyu zzk;
    private boolean zzl;

    public zzcnj(zzcpv zzcpvVar, Context context, zzceb zzcebVar, int i7, zzcmx zzcmxVar, zzdez zzdezVar, zzdbt zzdbtVar, zzcvd zzcvdVar, zzbyu zzbyuVar) {
        super(zzcpvVar);
        this.zzl = false;
        this.zzc = zzcebVar;
        this.zze = context;
        this.zzd = i7;
        this.zzf = zzcmxVar;
        this.zzg = zzdezVar;
        this.zzh = zzdbtVar;
        this.zzi = zzcvdVar;
        this.zzj = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfv)).booleanValue();
        this.zzk = zzbyuVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpw
    public final void zzb() {
        super.zzb();
        zzceb zzcebVar = this.zzc;
        if (zzcebVar != null) {
            zzcebVar.destroy();
        }
    }

    public final void zzc(zzazk zzazkVar) {
        zzceb zzcebVar = this.zzc;
        if (zzcebVar != null) {
            zzcebVar.zzak(zzazkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.Context] */
    public final void zzd(Activity activity, zzazx zzazxVar, boolean z4) {
        zzceb zzcebVar;
        zzfaf zzD;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        zzbbp zzbbpVar = zzbby.zzaP;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            o oVar = o.f1952C;
            P p5 = oVar.f1957c;
            if (P.f(activity2)) {
                int i7 = J.f3546b;
                j.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzaQ)).booleanValue()) {
                    new zzfmn(activity2.getApplicationContext(), oVar.f1972s.l()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlS)).booleanValue() && (zzcebVar = this.zzc) != null && (zzD = zzcebVar.zzD()) != null && zzD.zzar && zzD.zzas != this.zzk.zzb()) {
            int i8 = J.f3546b;
            j.g("The app open consent form has been shown.");
            this.zzi.zza(zzfcb.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            int i9 = J.f3546b;
            j.g("App open interstitial ad is already visible.");
            this.zzi.zza(zzfcb.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z4, activity2, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdey e7) {
            this.zzi.zzc(e7);
        }
    }

    public final void zze(long j, int i7) {
        this.zzf.zza(j, i7);
    }
}
