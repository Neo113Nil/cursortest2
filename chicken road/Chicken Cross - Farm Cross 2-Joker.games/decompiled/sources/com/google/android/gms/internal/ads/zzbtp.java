package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbtp implements zzbth, zzbtf {
    private zzclm zza;

    public zzbtp(Context context, VersionInfoParcel versionInfoParcel, zzbbd zzbbdVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcmb {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzclm zza = zzcmc.zza(context, zzcnw.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbif.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbto
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbtp.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzf(String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbtp.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzg(final String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbtp.this.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbtp.this.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzi(final zzbtg zzbtgVar) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzcnk zzP = zzclmVar.zzP();
            Objects.requireNonNull(zzbtgVar);
            zzP.zzH(new zzcnj() { // from class: com.google.android.gms.internal.ads.zzbtj
                @Override // com.google.android.gms.internal.ads.zzcnj
                public final /* synthetic */ void zza() {
                    zzbtg.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzj() {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final boolean zzk() {
        zzclm zzclmVar = this.zza;
        return zzclmVar == null || zzclmVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final zzbuo zzl() {
        return new zzbuo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzm(String str, zzbqh zzbqhVar) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.zzab(str, new zzbti(this, zzbqhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzn(String str, final zzbqh zzbqhVar) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbtn
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(Object obj) {
                    zzbqh zzbqhVar2 = (zzbqh) obj;
                    if (zzbqhVar2 instanceof zzbti) {
                        return ((zzbti) zzbqhVar2).zzb().equals(zzbqh.this);
                    }
                    return false;
                }
            });
        }
    }

    final /* synthetic */ void zzo(String str) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.zza(str);
        }
    }

    final /* synthetic */ void zzp(String str) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzq(String str) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzr(String str) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.loadUrl(str);
        }
    }
}
