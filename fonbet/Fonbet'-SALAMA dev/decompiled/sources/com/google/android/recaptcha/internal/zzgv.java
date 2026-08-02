package com.google.android.recaptcha.internal;

import D6.C0136t;
import D6.D0;
import D6.E;
import D6.InterfaceC0135s;
import a.AbstractC0603a;
import android.content.Context;
import android.webkit.WebView;
import f6.C1116i;
import g6.AbstractC1159h;
import i6.InterfaceC1287d;
import j6.a;
import java.util.LinkedHashMap;
import java.util.Map;
import t6.h;

/* loaded from: classes.dex */
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
        zzdc zza = zzdcVar.zza();
        zza.zzc(zzdcVar.zzd());
        this.zzl = zza;
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
    public final Object zzd(String str, InterfaceC1287d interfaceC1287d) {
        zzpv zzf = zzpw.zzf();
        zzf.zzd(str);
        return zzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, InterfaceC1287d interfaceC1287d) {
        zzgs zzgsVar;
        int i7;
        zzgv zzgvVar;
        InterfaceC0135s interfaceC0135s;
        if (interfaceC1287d instanceof zzgs) {
            zzgsVar = (zzgs) interfaceC1287d;
            int i8 = zzgsVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzgsVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzgsVar.zza;
                a aVar = a.f14642a;
                i7 = zzgsVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    try {
                        C0136t a2 = E.a();
                        this.zzi.put(str, a2);
                        zzqw zzf = zzqx.zzf();
                        zzf.zzd(str);
                        byte[] zzd = ((zzqx) zzf.zzj()).zzd();
                        E.p(this.zzn.zzb(), new zzgt(this, zzhz.zzh().zzi(zzd, 0, zzd.length), null));
                        zzgsVar.zzd = this;
                        zzgsVar.zze = str;
                        zzgsVar.zzc = 1;
                        obj = a2.j(zzgsVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        zzgvVar = this;
                    } catch (Exception e7) {
                        e = e7;
                        zzgvVar = this;
                        zzbj zza = zzf.zza(e, new zzbj(zzbh.zzb, zzbg.zzW, e.getClass().getSimpleName()));
                        interfaceC0135s = (InterfaceC0135s) zzgvVar.zzi.remove(str);
                        if (interfaceC0135s != null) {
                        }
                        return AbstractC0603a.h(zza);
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzgsVar.zze;
                    zzgvVar = zzgsVar.zzd;
                    try {
                        AbstractC0603a.p0(obj);
                    } catch (Exception e8) {
                        e = e8;
                        zzbj zza2 = zzf.zza(e, new zzbj(zzbh.zzb, zzbg.zzW, e.getClass().getSimpleName()));
                        interfaceC0135s = (InterfaceC0135s) zzgvVar.zzi.remove(str);
                        if (interfaceC0135s != null) {
                            ((C0136t) interfaceC0135s).O(zza2);
                        }
                        return AbstractC0603a.h(zza2);
                    }
                }
                zzpw zzpwVar = (zzpw) obj;
                zzpv zzpvVar = (zzpv) zzpwVar.zzq();
                zzpz zzf2 = zzqa.zzf();
                zzf2.zzd(zzpwVar.zzJ());
                zzpvVar.zzp(zzf2);
                zzpx zzf3 = zzpy.zzf();
                zzf3.zzd(zzpwVar.zzj());
                zzf3.zze(zzpwVar.zzK());
                zzpvVar.zzq(zzf3);
                return zzpvVar.zzj();
            }
        }
        zzgsVar = new zzgs(this, interfaceC1287d);
        Object obj2 = zzgsVar.zza;
        a aVar2 = a.f14642a;
        i7 = zzgsVar.zzc;
        if (i7 != 0) {
        }
        zzpw zzpwVar2 = (zzpw) obj2;
        zzpv zzpvVar2 = (zzpv) zzpwVar2.zzq();
        zzpz zzf22 = zzqa.zzf();
        zzf22.zzd(zzpwVar2.zzJ());
        zzpvVar2.zzp(zzf22);
        zzpx zzf32 = zzpy.zzf();
        zzf32.zzd(zzpwVar2.zzj());
        zzf32.zze(zzpwVar2.zzK());
        zzpvVar2.zzq(zzf32);
        return zzpvVar2.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbj zzbjVar, InterfaceC1287d interfaceC1287d) {
        if (h.a(zzbjVar.zza(), zzbg.zzb)) {
            zzdf zzdfVar = this.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            this.zzm = null;
        }
        return C1116i.f13008a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzpq zzpqVar, InterfaceC1287d interfaceC1287d) {
        zzgu zzguVar;
        int i7;
        try {
            if (interfaceC1287d instanceof zzgu) {
                zzguVar = (zzgu) interfaceC1287d;
                int i8 = zzguVar.zzc;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    zzguVar.zzc = i8 - Integer.MIN_VALUE;
                    Object obj = zzguVar.zza;
                    a aVar = a.f14642a;
                    i7 = zzguVar.zzc;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        this.zzb = zzy(zzpqVar, new zzcb(zzpqVar.zzf()));
                        this.zza = E.a();
                        new Integer(zzu().hashCode());
                        this.zzj.zzd();
                        this.zzj.zze();
                        E.p(this.zzn.zza(), new zzgr(this, zzpqVar, null));
                        new Integer(zzu().hashCode());
                        InterfaceC0135s zzu = zzu();
                        zzguVar.zzc = 1;
                        if (((C0136t) zzu).j(zzguVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0603a.p0(obj);
                    }
                    return C1116i.f13008a;
                }
            }
            if (i7 != 0) {
            }
            return C1116i.f13008a;
        } catch (Exception e7) {
            e7.getMessage();
            return AbstractC0603a.h(zzf.zza(e7, new zzbj(zzbh.zzb, zzbg.zzV, e7.getClass().getSimpleName())));
        }
        zzguVar = new zzgu(this, interfaceC1287d);
        Object obj2 = zzguVar.zza;
        a aVar2 = a.f14642a;
        i7 = zzguVar.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, InterfaceC1287d interfaceC1287d) {
        InterfaceC0135s interfaceC0135s = (InterfaceC0135s) this.zzi.remove(str);
        if (interfaceC0135s != null) {
            ((C0136t) interfaceC0135s).O(exc);
        }
        return C1116i.f13008a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, InterfaceC1287d interfaceC1287d) {
        Long zza = this.zzk.zza();
        if ((exc instanceof D0) && zza == null) {
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
        zzgfVar.zzb(AbstractC1159h.b1(zzpqVar.zzN()));
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
