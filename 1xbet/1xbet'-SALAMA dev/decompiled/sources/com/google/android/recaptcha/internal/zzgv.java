package com.google.android.recaptcha.internal;

import D6.C0136t;
import D6.D0;
import D6.E;
import D6.InterfaceC0135s;
import android.content.Context;
import android.webkit.WebView;
import j6.a;
import java.util.LinkedHashMap;
import java.util.Map;
import p044f6.i;
import p065i6.d;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzgv extends zze {
    public InterfaceC0135s zza;
    public zzdv zzb;
    private final WebView zzc;
    private final Context zzd;
    private final zzbv zze;
    private final zzdc zzf;
    private final zzdq zzg;
    private final Map zzh = zzgw.zza();
    private final Map zzi = new LinkedHashMap();
    private final zzgz zzj = zzgz.zzc();
    private final zzgo zzk;
    private final zzdc zzl;
    private zzdf zzm;
    private final zzbo zzn;

    public zzgv(WebView webView, Context context, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar) {
        this.zzc = webView;
        this.zzd = context;
        this.zze = zzbvVar;
        this.zzf = zzdcVar;
        this.zzn = zzboVar;
        this.zzg = zzdqVar;
        zzgo zzgoVar = new zzgo(this);
        this.zzk = zzgoVar;
        zzdc zzdcVarZza = zzdcVar.zza();
        zzdcVarZza.zzc(zzdcVar.zzd());
        this.zzl = zzdcVarZza;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzgoVar, "RN");
        webView.setWebViewClient(new zzgp(this));
    }

    public static final /* synthetic */ void zzv(zzgv zzgvVar, String str) {
        zzgvVar.zzm = zzgvVar.zzl.zzf(26);
        try {
            zzgvVar.zzc.loadDataWithBaseURL(zzgvVar.zze.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzU, null);
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            zzgvVar.zzm = null;
            ((C0136t) zzgvVar.zzu()).O(zzbjVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzdf zza(String str) {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzdf zzb() {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, d dVar) {
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str);
        return zzpvVarZzf.zzj();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzf(String str, d dVar) {
        zzgs zzgsVar;
        zzgv zzgvVar;
        zzbj zzbjVarZza;
        InterfaceC0135s interfaceC0135s;
        if (dVar instanceof zzgs) {
            zzgsVar = (zzgs) dVar;
            int i7 = zzgsVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzgsVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzgsVar = new zzgs(this, dVar);
            }
        } else {
            zzgsVar = new zzgs(this, dVar);
        }
        Object objJ = zzgsVar.zza;
        a aVar = a.f14648a;
        int i8 = zzgsVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objJ);
            try {
                C0136t c0136tA = E.a();
                this.zzi.put(str, c0136tA);
                zzqw zzqwVarZzf = zzqx.zzf();
                zzqwVarZzf.zzd(str);
                byte[] bArrZzd = ((zzqx) zzqwVarZzf.zzj()).zzd();
                E.p(this.zzn.zzb(), new zzgt(this, zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), null));
                zzgsVar.zzd = this;
                zzgsVar.zze = str;
                zzgsVar.zzc = 1;
                objJ = c0136tA.j(zzgsVar);
                if (objJ == aVar) {
                    return aVar;
                }
                zzgvVar = this;
            } catch (Exception e7) {
                e = e7;
                zzgvVar = this;
                zzbjVarZza = zzf.zza(e, new zzbj(zzbh.zzb, zzbg.zzW, e.getClass().getSimpleName()));
                interfaceC0135s = (InterfaceC0135s) zzgvVar.zzi.remove(str);
                if (interfaceC0135s != null) {
                    ((C0136t) interfaceC0135s).O(zzbjVarZza);
                }
                return p003a.a.h(zzbjVarZza);
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzgsVar.zze;
            zzgvVar = zzgsVar.zzd;
            try {
                p003a.a.p0(objJ);
            } catch (Exception e8) {
                e = e8;
                zzbjVarZza = zzf.zza(e, new zzbj(zzbh.zzb, zzbg.zzW, e.getClass().getSimpleName()));
                interfaceC0135s = (InterfaceC0135s) zzgvVar.zzi.remove(str);
                if (interfaceC0135s != null) {
                    ((C0136t) interfaceC0135s).O(zzbjVarZza);
                }
                return p003a.a.h(zzbjVarZza);
            }
        }
        zzpw zzpwVar = (zzpw) objJ;
        zzpv zzpvVar = (zzpv) zzpwVar.zzq();
        zzpz zzpzVarZzf = zzqa.zzf();
        zzpzVarZzf.zzd(zzpwVar.zzJ());
        zzpvVar.zzp(zzpzVarZzf);
        zzpx zzpxVarZzf = zzpy.zzf();
        zzpxVarZzf.zzd(zzpwVar.zzj());
        zzpxVarZzf.zze(zzpwVar.zzK());
        zzpvVar.zzq(zzpxVarZzf);
        return zzpvVar.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbj zzbjVar, d dVar) {
        if (h.a(zzbjVar.zza(), zzbg.zzb)) {
            zzdf zzdfVar = this.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            this.zzm = null;
        }
        return i.f13014a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzh(zzpq zzpqVar, d dVar) {
        zzgu zzguVar;
        if (dVar instanceof zzgu) {
            zzguVar = (zzgu) dVar;
            int i7 = zzguVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzguVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzguVar = new zzgu(this, dVar);
            }
        } else {
            zzguVar = new zzgu(this, dVar);
        }
        Object obj = zzguVar.zza;
        a aVar = a.f14648a;
        int i8 = zzguVar.zzc;
        try {
            if (i8 == 0) {
                p003a.a.p0(obj);
                this.zzb = zzy(zzpqVar, new zzcb(zzpqVar.zzf()));
                this.zza = E.a();
                new Integer(zzu().hashCode());
                this.zzj.zzd();
                this.zzj.zze();
                E.p(this.zzn.zza(), new zzgr(this, zzpqVar, null));
                new Integer(zzu().hashCode());
                InterfaceC0135s interfaceC0135sZzu = zzu();
                zzguVar.zzc = 1;
                if (((C0136t) interfaceC0135sZzu).j(zzguVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(obj);
            }
            return i.f13014a;
        } catch (Exception e7) {
            e7.getMessage();
            return p003a.a.h(zzf.zza(e7, new zzbj(zzbh.zzb, zzbg.zzV, e7.getClass().getSimpleName())));
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, d dVar) {
        InterfaceC0135s interfaceC0135s = (InterfaceC0135s) this.zzi.remove(str);
        if (interfaceC0135s != null) {
            ((C0136t) interfaceC0135s).O(exc);
        }
        return i.f13014a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, d dVar) {
        Long lZza = this.zzk.zza();
        if ((exc instanceof D0) && lZza == null) {
            return new zzbj(zzbh.zzc, zzbg.zzH, null);
        }
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzV, exc.getClass().getSimpleName()));
    }

    public final WebView zzm() {
        return this.zzc;
    }

    public final zzdq zzp() {
        return this.zzg;
    }

    public final zzgo zzq() {
        return this.zzk;
    }

    public final InterfaceC0135s zzu() {
        InterfaceC0135s interfaceC0135s = this.zza;
        if (interfaceC0135s != null) {
            return interfaceC0135s;
        }
        return null;
    }

    public final zzea zzy(zzpq zzpqVar, zzcb zzcbVar) {
        zzed zzedVar = new zzed(this.zzc, this.zzn.zzb());
        zzgf zzgfVar = new zzgf();
        zzgfVar.zzb(p050g6.h.b1(zzpqVar.zzN()));
        zzem zzemVar = new zzem(zzedVar, zzcbVar, new zzbu());
        zzgg zzggVar = new zzgg(zzgfVar, new zzgd());
        zzemVar.zze(3, this.zzd);
        zzemVar.zze(5, zzgm.class.getMethod("cs", new Object[0].getClass()));
        zzemVar.zze(6, new zzgh(this.zzd));
        zzemVar.zze(7, new zzgj());
        zzemVar.zze(8, new zzgn(this.zzd));
        zzemVar.zze(9, new zzgk(this.zzd));
        zzemVar.zze(10, new zzgi(this.zzd));
        return new zzea(this.zzn.zzd(), zzemVar, zzggVar, zzdu.zza());
    }
}
