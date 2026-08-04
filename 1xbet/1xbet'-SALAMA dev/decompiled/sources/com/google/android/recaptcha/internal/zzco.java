package com.google.android.recaptcha.internal;

import B6.b;
import D6.B;
import D6.E;
import D6.InterfaceC0118e0;
import M6.a;
import M6.e;
import Y4.D;
import android.app.Application;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import p044f6.f;
import p065i6.d;
import p065i6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzco {
    private static zzcx zzb;
    public static final zzco zza = new zzco();
    private static final String zzc = UUID.randomUUID().toString();
    private static final a zzd = e.a();
    private static final zzbo zzf = new zzbo();
    private static final zzl zze = new zzl(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i7 = zzbb.zza;
        zzba.zzb(new zzbc(915034663, new zzbf(null, 1, null)), new zzbc(915034752, new zzeb()), new zzbc(915034668, new zzbk()));
    }

    private zzco() {
    }

    public static final /* synthetic */ zzcx zza(zzco zzcoVar, String str) throws zzbj {
        zzcx zzcxVar = zzb;
        if (zzcxVar == null) {
            return null;
        }
        if (h.a(zzcxVar.zze(), str)) {
            return zzcxVar;
        }
        throw new zzbj(zzbh.zzd, zzbg.zzan, null);
    }

    public static final Object zzg(Application application, String str, long j, zzdq zzdqVar, d dVar) {
        return E.x(zzf.zzb().c(), new zzcc(application, str, j, null, null), dVar);
    }

    public static final Task zzh(Application application, String str, long j) {
        return zzax.zza(E.c(zzf.zza(), new zzch(application, str, j, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object zzi(String str, Application application, Function2 function2, d dVar) throws RecaptchaException {
        zzcn zzcnVar;
        zzdf zzdfVar;
        if (dVar instanceof zzcn) {
            zzcnVar = (zzcn) dVar;
            int i7 = zzcnVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcnVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzcnVar = new zzcn(this, dVar);
            }
        } else {
            zzcnVar = new zzcn(this, dVar);
        }
        Object objInvoke = zzcnVar.zza;
        Object obj = j6.a.f14648a;
        int i8 = zzcnVar.zzc;
        if (i8 == 0) {
            p003a.a.p0(objInvoke);
            zzbv zzbvVar = new zzbv("https://www.recaptcha.net/recaptcha/api3");
            zzbo zzboVar = zzf;
            String string = UUID.randomUUID().toString();
            zzdc zzdcVar = new zzdc(str, zzc, string, application, new zzdk(application, new zzdm(zzbvVar.zzc()), zzboVar.zza()), null);
            zzdcVar.zzc(string);
            zzdf zzdfVarZzf = zzdcVar.zzf(6);
            try {
                zzcnVar.zzd = zzdfVarZzf;
                zzcnVar.zzc = 1;
                objInvoke = function2.invoke(zzdcVar, zzcnVar);
                if (objInvoke == obj) {
                    return obj;
                }
                zzdfVar = zzdfVarZzf;
            } catch (zzbj e7) {
                e = e7;
                zzdfVar = zzdfVarZzf;
                zzdfVar.zzb(e);
                throw e.zzc();
            } catch (Exception e8) {
                e = e8;
                zzdfVar = zzdfVarZzf;
                zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e.getMessage());
                zzdfVar.zzb(zzbjVar);
                throw zzbjVar.zzc();
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzdfVar = zzcnVar.zzd;
            try {
                p003a.a.p0(objInvoke);
            } catch (zzbj e9) {
                e = e9;
                zzdfVar.zzb(e);
                throw e.zzc();
            } catch (Exception e10) {
                e = e10;
                zzbj zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zza, e.getMessage());
                zzdfVar.zzb(zzbjVar2);
                throw zzbjVar2.zzc();
            }
        }
        zzdfVar.zza();
        return objInvoke;
    }

    private final void zzj(String str) throws zzbj {
        try {
            zzpj zzpjVarZzj = zzpj.zzj(zzhz.zzh().zzj(str));
            int i7 = zzbb.zza;
            ((zzeb) D.C(zzci.zza).getValue()).zza(zzpjVarZzj);
        } catch (Exception e7) {
            throw new zzbj(zzbh.zzl, zzbg.zzao, e7.getMessage());
        }
    }

    private final boolean zzk(Application application) {
        int i7 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:32:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0222  */
    /* JADX WARN: Code duplicated, block: B:41:0x0244 A[LOOP:0: B:39:0x023e->B:41:0x0244, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x025e  */
    /* JADX WARN: Code duplicated, block: B:47:0x027c  */
    /* JADX WARN: Code duplicated, block: B:49:0x027e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x027e, please report this as an issue */
    public final Object zzl(Application application, String str, long j, zzdc zzdcVar, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, d dVar) throws Throwable {
        zzcf zzcfVar;
        zzbl zzblVar;
        String str2;
        zzco zzcoVar;
        zzdc zzdcVar2;
        zzbv zzbvVar2;
        zzdq zzdqVar2;
        Object obj;
        double d7;
        WebView webView2;
        zzbo zzboVar2;
        zzbl zzblVar2;
        double d8;
        zzdc zzdcVar3;
        Application application2;
        String str3;
        zzbv zzbvVar3;
        zzbo zzboVar3;
        zzpq zzpqVar;
        Application application3;
        String str4;
        zzdc zzdcVar4;
        CancellationException cancellationException;
        Object objZzc;
        String str5;
        Application application4;
        zzdc zzdcVar5;
        Throwable thA;
        InterfaceC0118e0 interfaceC0118e0;
        i iVarC;
        InterfaceC0118e0 interfaceC0118e1;
        List listK0;
        b children;
        Iterator it;
        Application application5 = application;
        if (dVar instanceof zzcf) {
            zzcfVar = (zzcf) dVar;
            int i7 = zzcfVar.zzk;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcfVar.zzk = i7 - Integer.MIN_VALUE;
            } else {
                zzcfVar = new zzcf(this, dVar);
            }
        } else {
            zzcfVar = new zzcf(this, dVar);
        }
        zzcf zzcfVar2 = zzcfVar;
        Object obj2 = zzcfVar2.zzi;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzcfVar2.zzk;
        if (i8 == 0) {
            p003a.a.p0(obj2);
            double d9 = j;
            zzblVar = new zzbl(application5);
            zzcfVar2.zza = this;
            zzcfVar2.zzb = application5;
            str2 = str;
            zzcfVar2.zzc = str2;
            zzcfVar2.zzd = zzdcVar;
            zzcfVar2.zze = zzbvVar;
            zzcfVar2.zzf = null;
            zzcfVar2.zzg = zzdqVar;
            zzcfVar2.zzm = zzboVar;
            zzcfVar2.zzl = zzblVar;
            double d10 = d9 * 0.4d;
            zzcfVar2.zzh = d10;
            zzcfVar2.zzk = 1;
            Object objX = E.x(zzboVar.zza().c(), new zzck((long) (d9 * 0.6d), application, str, zzdcVar, zzblVar, zzdqVar, zzbvVar, null), zzcfVar2);
            if (objX != aVar) {
                zzcoVar = this;
                zzdcVar2 = zzdcVar;
                zzbvVar2 = zzbvVar;
                zzdqVar2 = zzdqVar;
                obj = objX;
                d7 = d10;
                webView2 = null;
                zzboVar2 = zzboVar;
            }
            return aVar;
        }
        if (i8 == 1) {
            double d11 = zzcfVar2.zzh;
            zzbl zzblVar3 = zzcfVar2.zzl;
            zzbo zzboVar4 = zzcfVar2.zzm;
            zzdq zzdqVar3 = (zzdq) zzcfVar2.zzg;
            WebView webView3 = (WebView) zzcfVar2.zzf;
            zzbv zzbvVar4 = (zzbv) zzcfVar2.zze;
            zzdcVar2 = (zzdc) zzcfVar2.zzd;
            String str6 = (String) zzcfVar2.zzc;
            Application application6 = (Application) zzcfVar2.zzb;
            zzco zzcoVar2 = (zzco) zzcfVar2.zza;
            p003a.a.p0(obj2);
            zzdqVar2 = zzdqVar3;
            zzbvVar2 = zzbvVar4;
            d7 = d11;
            webView2 = webView3;
            obj = obj2;
            zzboVar2 = zzboVar4;
            zzblVar = zzblVar3;
            zzcoVar = zzcoVar2;
            str2 = str6;
            application5 = application6;
        } else {
            if (i8 == 2) {
                double d12 = zzcfVar2.zzh;
                zzpq zzpqVar2 = (zzpq) zzcfVar2.zzg;
                zzbl zzblVar4 = (zzbl) zzcfVar2.zzf;
                zzbo zzboVar5 = (zzbo) zzcfVar2.zze;
                zzbv zzbvVar5 = (zzbv) zzcfVar2.zzd;
                zzdc zzdcVar6 = (zzdc) zzcfVar2.zzc;
                String str7 = (String) zzcfVar2.zzb;
                application2 = (Application) zzcfVar2.zza;
                p003a.a.p0(obj2);
                zzboVar3 = zzboVar5;
                zzbvVar3 = zzbvVar5;
                zzdcVar3 = zzdcVar6;
                zzblVar2 = zzblVar4;
                str3 = str7;
                zzpqVar = zzpqVar2;
                d8 = d12;
                application3 = application2;
                str4 = str3;
                zzdcVar4 = zzdcVar3;
                zzx zzxVar = new zzx(zzblVar2, application2, zzdcVar3.zza(), zzboVar3, null, 16, null);
                zzl zzlVar = zze;
                zzlVar.zze(zzxVar, (zzgv) obj2);
                zzlVar.zza = zzdcVar4.zza();
                zzcfVar2.zza = application3;
                zzcfVar2.zzb = str4;
                zzcfVar2.zzc = zzdcVar4;
                zzcfVar2.zzd = zzbvVar3;
                zzcfVar2.zze = zzboVar3;
                zzcfVar2.zzf = zzpqVar;
                cancellationException = null;
                zzcfVar2.zzg = null;
                zzcfVar2.zzk = 3;
                objZzc = zzlVar.zzc((long) d8, zzpqVar, zzcfVar2);
                if (objZzc != aVar) {
                    str5 = str4;
                    application4 = application3;
                    zzdcVar5 = zzdcVar4;
                }
                return aVar;
            }
            if (i8 != 3) {
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) zzcfVar2.zza;
                p003a.a.p0(obj2);
                throw th;
            }
            zzpqVar = (zzpq) zzcfVar2.zzf;
            zzbo zzboVar6 = (zzbo) zzcfVar2.zze;
            zzbv zzbvVar6 = (zzbv) zzcfVar2.zzd;
            zzdcVar5 = (zzdc) zzcfVar2.zzc;
            str5 = (String) zzcfVar2.zzb;
            application4 = (Application) zzcfVar2.zza;
            p003a.a.p0(obj2);
            zzboVar3 = zzboVar6;
            zzbvVar3 = zzbvVar6;
            objZzc = ((f) obj2).f13009a;
            cancellationException = null;
        }
        thA = f.a(objZzc);
        if (thA == null) {
            return new zzcx(application4, zze, str5, zzboVar3, zzbvVar3, zzpqVar, zzdcVar5, new zzbl(application4), new zzds());
        }
        i iVarC2 = zzboVar3.zzd().c();
        B b7 = B.f1775b;
        interfaceC0118e0 = (InterfaceC0118e0) iVarC2.get(b7);
        if (interfaceC0118e0 != null && (children = interfaceC0118e0.getChildren()) != null) {
            it = children.iterator();
            while (it.hasNext()) {
                ((InterfaceC0118e0) it.next()).cancel(cancellationException);
            }
        }
        iVarC = zzboVar3.zzd().c();
        interfaceC0118e1 = (InterfaceC0118e0) iVarC.get(b7);
        if (interfaceC0118e1 != null) {
            throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVarC).toString());
        }
        listK0 = B6.d.K0(interfaceC0118e1.getChildren());
        zzcfVar2.zza = thA;
        zzcfVar2.zzb = cancellationException;
        zzcfVar2.zzc = cancellationException;
        zzcfVar2.zzd = cancellationException;
        zzcfVar2.zze = cancellationException;
        zzcfVar2.zzf = cancellationException;
        zzcfVar2.zzk = 4;
        if (E.n(listK0, zzcfVar2) != aVar) {
            throw thA;
        }
        return aVar;
        zzpq zzpqVar3 = (zzpq) obj;
        zzcoVar.zzj(zzpqVar3.zzM());
        zzdc zzdcVarZza = zzdcVar2.zza();
        zzcfVar2.zza = application5;
        zzcfVar2.zzb = str2;
        zzcfVar2.zzc = zzdcVar2;
        zzcfVar2.zzd = zzbvVar2;
        zzcfVar2.zze = zzboVar2;
        zzcfVar2.zzf = zzblVar;
        zzcfVar2.zzg = zzpqVar3;
        zzcfVar2.zzm = null;
        zzcfVar2.zzl = null;
        zzcfVar2.zzh = d7;
        zzcfVar2.zzk = 2;
        double d13 = d7;
        Object objX2 = E.x(zzboVar2.zzb().c(), new zzcg(webView2, application5, zzbvVar2, zzdcVarZza, zzboVar2, zzdqVar2, null), zzcfVar2);
        if (objX2 != aVar) {
            zzblVar2 = zzblVar;
            d8 = d13;
            zzdcVar3 = zzdcVar2;
            application2 = application5;
            str3 = str2;
            zzbvVar3 = zzbvVar2;
            zzboVar3 = zzboVar2;
            obj2 = objX2;
            zzpqVar = zzpqVar3;
            application3 = application2;
            str4 = str3;
            zzdcVar4 = zzdcVar3;
            zzx zzxVar2 = new zzx(zzblVar2, application2, zzdcVar3.zza(), zzboVar3, null, 16, null);
            zzl zzlVar2 = zze;
            zzlVar2.zze(zzxVar2, (zzgv) obj2);
            zzlVar2.zza = zzdcVar4.zza();
            zzcfVar2.zza = application3;
            zzcfVar2.zzb = str4;
            zzcfVar2.zzc = zzdcVar4;
            zzcfVar2.zzd = zzbvVar3;
            zzcfVar2.zze = zzboVar3;
            zzcfVar2.zzf = zzpqVar;
            cancellationException = null;
            zzcfVar2.zzg = null;
            zzcfVar2.zzk = 3;
            objZzc = zzlVar2.zzc((long) d8, zzpqVar, zzcfVar2);
            if (objZzc != aVar) {
                str5 = str4;
                application4 = application3;
                zzdcVar5 = zzdcVar4;
                thA = f.a(objZzc);
                if (thA == null) {
                    return new zzcx(application4, zze, str5, zzboVar3, zzbvVar3, zzpqVar, zzdcVar5, new zzbl(application4), new zzds());
                }
                i iVarC3 = zzboVar3.zzd().c();
                B b8 = B.f1775b;
                interfaceC0118e0 = (InterfaceC0118e0) iVarC3.get(b8);
                if (interfaceC0118e0 != null) {
                    it = children.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0118e0) it.next()).cancel(cancellationException);
                    }
                }
                iVarC = zzboVar3.zzd().c();
                interfaceC0118e1 = (InterfaceC0118e0) iVarC.get(b8);
                if (interfaceC0118e1 != null) {
                    throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVarC).toString());
                }
                listK0 = B6.d.K0(interfaceC0118e1.getChildren());
                zzcfVar2.zza = thA;
                zzcfVar2.zzb = cancellationException;
                zzcfVar2.zzc = cancellationException;
                zzcfVar2.zzd = cancellationException;
                zzcfVar2.zze = cancellationException;
                zzcfVar2.zzf = cancellationException;
                zzcfVar2.zzk = 4;
                if (E.n(listK0, zzcfVar2) != aVar) {
                    throw thA;
                }
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    public final Object zzm(Application application, String str, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, zzdc zzdcVar, d dVar) throws Throwable {
        zzcm zzcmVar;
        zzco zzcoVar;
        ?? r13 = application;
        if (dVar instanceof zzcm) {
            zzcmVar = (zzcm) dVar;
            int i7 = zzcmVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcmVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzcmVar = new zzcm(this, dVar);
            }
        } else {
            zzcmVar = new zzcm(this, dVar);
        }
        zzcm zzcmVar2 = zzcmVar;
        Object objZzl = zzcmVar2.zzb;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzcmVar2.zzd;
        try {
            if (i8 == 0) {
                p003a.a.p0(objZzl);
                try {
                    zzdq zzdqVar2 = new zzdq(new zzbs(r13), new zzdo());
                    zzcmVar2.zze = this;
                    zzcmVar2.zza = r13;
                    zzcmVar2.zzd = 1;
                    objZzl = zzl(application, str, j, zzdcVar, zzbvVar, null, zzdqVar2, zzboVar, zzcmVar2);
                    if (objZzl == aVar) {
                        return aVar;
                    }
                    zzcoVar = this;
                    r13 = r13;
                    zzcx zzcxVar = (zzcx) objZzl;
                    zzb = zzcxVar;
                    return zzcxVar;
                } catch (zzbj e7) {
                    e = e7;
                    zzcoVar = this;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = zzcmVar2.zza;
                zzcoVar = zzcmVar2.zze;
                try {
                    p003a.a.p0(objZzl);
                    r13 = obj;
                    try {
                        zzcx zzcxVar2 = (zzcx) objZzl;
                        zzb = zzcxVar2;
                        return zzcxVar2;
                    } catch (zzbj e8) {
                        e = e8;
                    }
                } catch (zzbj e9) {
                    e = e9;
                    r13 = obj;
                }
            }
            zzbh zzbhVarZzb = e.zzb();
            zzbh zzbhVar = zzbh.zzc;
            if (!h.a(zzbhVarZzb, zzbhVar) || zzcoVar.zzk((Application) r13)) {
                throw e;
            }
            throw new zzbj(zzbhVar, zzbg.zzap, null);
        } catch (RecaptchaException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzb, zzbg.zza, e11.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [M6.a] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [M6.a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [M6.a] */
    public final Object zze(Application application, String str, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, d dVar) throws Throwable {
        zzcd zzcdVar;
        Application application2;
        long j3;
        Object obj;
        String str2;
        zzbv zzbvVar2;
        zzbo zzboVar2;
        ?? r7;
        if (dVar instanceof zzcd) {
            zzcdVar = (zzcd) dVar;
            int i7 = zzcdVar.zzf;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcdVar.zzf = i7 - Integer.MIN_VALUE;
            } else {
                zzcdVar = new zzcd(this, dVar);
            }
        } else {
            zzcdVar = new zzcd(this, dVar);
        }
        Object objZzi = zzcdVar.zzd;
        j6.a aVar = j6.a.f14648a;
        int i8 = zzcdVar.zzf;
        try {
            if (i8 == 0) {
                p003a.a.p0(objZzi);
                a aVar2 = zzd;
                application2 = application;
                zzcdVar.zza = application2;
                zzcdVar.zzg = str;
                zzcdVar.zzh = zzbvVar;
                zzcdVar.zzi = zzboVar;
                zzcdVar.zzb = aVar2;
                j3 = j;
                zzcdVar.zzc = j3;
                zzcdVar.zzf = 1;
                if (aVar2.a(zzcdVar) != aVar) {
                    obj = aVar2;
                    str2 = str;
                    zzbvVar2 = zzbvVar;
                    zzboVar2 = zzboVar;
                }
                return aVar;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r7 = (a) zzcdVar.zza;
                try {
                    p003a.a.p0(objZzi);
                    r7 = r7;
                    zzcx zzcxVar = (zzcx) objZzi;
                    r7.b(null);
                    return zzcxVar;
                } catch (Throwable th) {
                    th = th;
                    r7.b(null);
                    throw th;
                }
            }
            long j7 = zzcdVar.zzc;
            Object obj2 = zzcdVar.zzb;
            zzbo zzboVar3 = zzcdVar.zzi;
            zzbv zzbvVar3 = zzcdVar.zzh;
            String str3 = zzcdVar.zzg;
            Application application3 = (Application) zzcdVar.zza;
            p003a.a.p0(objZzi);
            zzboVar2 = zzboVar3;
            zzbvVar2 = zzbvVar3;
            str2 = str3;
            obj = obj2;
            application2 = application3;
            j3 = j7;
            zzco zzcoVar = zza;
            zzce zzceVar = new zzce(str2, application2, j3, zzbvVar2, null, null, zzboVar2, null);
            zzcdVar.zza = obj;
            zzcdVar.zzg = null;
            zzcdVar.zzh = null;
            zzcdVar.zzi = null;
            zzcdVar.zzb = null;
            zzcdVar.zzf = 2;
            objZzi = zzcoVar.zzi(str2, application2, zzceVar, zzcdVar);
            if (objZzi != aVar) {
                r7 = obj;
                zzcx zzcxVar2 = (zzcx) objZzi;
                r7.b(null);
                return zzcxVar2;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            r7 = obj;
            r7.b(null);
            throw th;
        }
    }
}
