package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import H2.c;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdnp {
    private final zzcuo zza;
    private final zzdcn zzb;
    private final zzcvx zzc;
    private final zzcwk zzd;
    private final zzcww zze;
    private final zzczm zzf;
    private final Executor zzg;
    private final zzdcj zzh;
    private final zzcmk zzi;
    private final E2.b zzj;
    private final zzbwy zzk;
    private final zzauo zzl;
    private final zzczd zzm;
    private final zzeaf zzn;
    private final zzfia zzo;
    private final zzdqq zzp;
    private final zzcln zzq;
    private final zzdnv zzr;

    public zzdnp(zzcuo zzcuoVar, zzcvx zzcvxVar, zzcwk zzcwkVar, zzcww zzcwwVar, zzczm zzczmVar, Executor executor, zzdcj zzdcjVar, zzcmk zzcmkVar, E2.b bVar, zzbwy zzbwyVar, zzauo zzauoVar, zzczd zzczdVar, zzeaf zzeafVar, zzfia zzfiaVar, zzdqq zzdqqVar, zzdcn zzdcnVar, zzcln zzclnVar, zzdnv zzdnvVar) {
        this.zza = zzcuoVar;
        this.zzc = zzcvxVar;
        this.zzd = zzcwkVar;
        this.zze = zzcwwVar;
        this.zzf = zzczmVar;
        this.zzg = executor;
        this.zzh = zzdcjVar;
        this.zzi = zzcmkVar;
        this.zzj = bVar;
        this.zzk = zzbwyVar;
        this.zzl = zzauoVar;
        this.zzm = zzczdVar;
        this.zzn = zzeafVar;
        this.zzo = zzfiaVar;
        this.zzp = zzdqqVar;
        this.zzb = zzdcnVar;
        this.zzq = zzclnVar;
        this.zzr = zzdnvVar;
    }

    public static void zze(zzdnp zzdnpVar, View view) {
        zzdnpVar.zzj.f1909b = true;
    }

    public static boolean zzh(zzdnp zzdnpVar, View view, MotionEvent motionEvent) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzka)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            zzdnpVar.zzr.zzb(motionEvent);
        }
        zzdnpVar.zzj.f1909b = true;
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public static final I3.b zzj(zzceb zzcebVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcq)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, bundle, zzdpy.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzbzf zzbzfVar = new zzbzf();
        zzcebVar.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.internal.ads.zzcfr
            public final void zza(boolean z4, int i7, String str3, String str4) {
                zzbzf zzbzfVar2 = zzbzfVar;
                if (z4) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcq)).booleanValue()) {
                        p150v0.a.n(o.f1952C.j, bundle, zzdpy.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzbzfVar2.zzc(null);
                    return;
                }
                zzbzfVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i7 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcebVar.zzae(str, str2, null);
        return zzbzfVar;
    }

    public final void zzi(final zzceb zzcebVar, boolean z4, zzbjc zzbjcVar, Bundle bundle) {
        zzauj zzaujVarZzc;
        zzbbp zzbbpVar = zzbby.zzcq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, bundle, zzdpy.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcebVar.zzN().zzV(new InterfaceC0217a() { // from class: com.google.android.gms.internal.ads.zzdnh
            @Override // F2.InterfaceC0217a
            public final void onAdClicked() {
                this.zza.zza.onAdClicked();
            }
        }, this.zzd, this.zze, new zzbhr() { // from class: com.google.android.gms.internal.ads.zzdni
            @Override // com.google.android.gms.internal.ads.zzbhr
            public final void zzb(String str, String str2) {
                this.zza.zzf.zzb(str, str2);
            }
        }, new c() { // from class: com.google.android.gms.internal.ads.zzdnj
            @Override // H2.c
            public final void zzg() {
                this.zza.zzc.zzb();
            }
        }, z4, zzbjcVar, this.zzj, new zzdno(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcebVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdnk
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdnp.zzh(this.zza, view, motionEvent);
                return false;
            }
        });
        zzcebVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdnl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdnp.zze(this.zza, view);
            }
        });
        zzbbp zzbbpVar2 = zzbby.zzcO;
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && (zzaujVarZzc = this.zzl.zzc()) != null) {
            zzaujVarZzc.zzo(zzcebVar.zzF());
        }
        this.zzh.zzo(zzcebVar, this.zzg);
        this.zzh.zzo(new zzaxx() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // com.google.android.gms.internal.ads.zzaxx
            public final void zzdn(zzaxw zzaxwVar) {
                zzcft zzcftVarZzN = zzcebVar.zzN();
                Rect rect = zzaxwVar.zzd;
                zzcftVarZzN.zzr(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcebVar.zzF());
        zzcebVar.zzag("/trackActiveViewUnit", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdnn
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                this.zza.zzi.zzh(zzcebVar);
            }
        });
        this.zzi.zzi(zzcebVar);
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, bundle, zzdpy.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
