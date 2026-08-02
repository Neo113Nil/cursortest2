package com.google.android.recaptcha.internal;

import B6.b;
import B6.d;
import D6.B;
import D6.E;
import D6.InterfaceC0118e0;
import M6.a;
import M6.e;
import Y4.D;
import a.AbstractC0603a;
import android.app.Application;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import f6.C1113f;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import t6.h;

/* loaded from: classes.dex */
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

    public static final /* synthetic */ zzcx zza(zzco zzcoVar, String str) {
        zzcx zzcxVar = zzb;
        if (zzcxVar == null) {
            return null;
        }
        if (h.a(zzcxVar.zze(), str)) {
            return zzcxVar;
        }
        throw new zzbj(zzbh.zzd, zzbg.zzan, null);
    }

    public static final Object zzg(Application application, String str, long j, zzdq zzdqVar, InterfaceC1287d interfaceC1287d) {
        return E.x(zzf.zzb().c(), new zzcc(application, str, j, null, null), interfaceC1287d);
    }

    public static final Task zzh(Application application, String str, long j) {
        return zzax.zza(E.c(zzf.zza(), new zzch(application, str, j, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(String str, Application application, Function2 function2, InterfaceC1287d interfaceC1287d) {
        zzcn zzcnVar;
        int i7;
        zzdf zzdfVar;
        if (interfaceC1287d instanceof zzcn) {
            zzcnVar = (zzcn) interfaceC1287d;
            int i8 = zzcnVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcnVar.zzc = i8 - Integer.MIN_VALUE;
                Object obj = zzcnVar.zza;
                Object obj2 = j6.a.f14642a;
                i7 = zzcnVar.zzc;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzbv zzbvVar = new zzbv("https://www.recaptcha.net/recaptcha/api3");
                    zzbo zzboVar = zzf;
                    String uuid = UUID.randomUUID().toString();
                    zzdc zzdcVar = new zzdc(str, zzc, uuid, application, new zzdk(application, new zzdm(zzbvVar.zzc()), zzboVar.zza()), null);
                    zzdcVar.zzc(uuid);
                    zzdf zzf2 = zzdcVar.zzf(6);
                    try {
                        zzcnVar.zzd = zzf2;
                        zzcnVar.zzc = 1;
                        obj = function2.invoke(zzdcVar, zzcnVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        zzdfVar = zzf2;
                    } catch (zzbj e7) {
                        e = e7;
                        zzdfVar = zzf2;
                        zzdfVar.zzb(e);
                        throw e.zzc();
                    } catch (Exception e8) {
                        e = e8;
                        zzdfVar = zzf2;
                        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e.getMessage());
                        zzdfVar.zzb(zzbjVar);
                        throw zzbjVar.zzc();
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzdfVar = zzcnVar.zzd;
                    try {
                        AbstractC0603a.p0(obj);
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
                return obj;
            }
        }
        zzcnVar = new zzcn(this, interfaceC1287d);
        Object obj3 = zzcnVar.zza;
        Object obj22 = j6.a.f14642a;
        i7 = zzcnVar.zzc;
        if (i7 != 0) {
        }
        zzdfVar.zza();
        return obj3;
    }

    private final void zzj(String str) {
        try {
            zzpj zzj = zzpj.zzj(zzhz.zzh().zzj(str));
            int i7 = zzbb.zza;
            ((zzeb) D.C(zzci.zza).getValue()).zza(zzj);
        } catch (Exception e7) {
            throw new zzbj(zzbh.zzl, zzbg.zzao, e7.getMessage());
        }
    }

    private final boolean zzk(Application application) {
        int i7 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Application application, String str, long j, zzdc zzdcVar, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, InterfaceC1287d interfaceC1287d) {
        zzcf zzcfVar;
        j6.a aVar;
        int i7;
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
        Object x4;
        zzbl zzblVar2;
        double d8;
        zzdc zzdcVar3;
        Application application2;
        String str3;
        zzbv zzbvVar3;
        zzbo zzboVar3;
        zzpq zzpqVar;
        CancellationException cancellationException;
        Object zzc2;
        String str4;
        Application application3;
        zzdc zzdcVar4;
        Throwable a2;
        b children;
        Application application4 = application;
        if (interfaceC1287d instanceof zzcf) {
            zzcfVar = (zzcf) interfaceC1287d;
            int i8 = zzcfVar.zzk;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcfVar.zzk = i8 - Integer.MIN_VALUE;
                zzcf zzcfVar2 = zzcfVar;
                Object obj2 = zzcfVar2.zzi;
                aVar = j6.a.f14642a;
                i7 = zzcfVar2.zzk;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj2);
                    double d9 = j;
                    zzblVar = new zzbl(application4);
                    zzcfVar2.zza = this;
                    zzcfVar2.zzb = application4;
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
                    Object x7 = E.x(zzboVar.zza().c(), new zzck((long) (d9 * 0.6d), application, str, zzdcVar, zzblVar, zzdqVar, zzbvVar, null), zzcfVar2);
                    if (x7 != aVar) {
                        zzcoVar = this;
                        zzdcVar2 = zzdcVar;
                        zzbvVar2 = zzbvVar;
                        zzdqVar2 = zzdqVar;
                        obj = x7;
                        d7 = d10;
                        webView2 = null;
                        zzboVar2 = zzboVar;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        double d11 = zzcfVar2.zzh;
                        zzpq zzpqVar2 = (zzpq) zzcfVar2.zzg;
                        zzbl zzblVar3 = (zzbl) zzcfVar2.zzf;
                        zzbo zzboVar4 = (zzbo) zzcfVar2.zze;
                        zzbv zzbvVar4 = (zzbv) zzcfVar2.zzd;
                        zzdc zzdcVar5 = (zzdc) zzcfVar2.zzc;
                        String str5 = (String) zzcfVar2.zzb;
                        application2 = (Application) zzcfVar2.zza;
                        AbstractC0603a.p0(obj2);
                        zzboVar3 = zzboVar4;
                        zzbvVar3 = zzbvVar4;
                        zzdcVar3 = zzdcVar5;
                        zzblVar2 = zzblVar3;
                        str3 = str5;
                        zzpqVar = zzpqVar2;
                        d8 = d11;
                        Application application5 = application2;
                        String str6 = str3;
                        zzdc zzdcVar6 = zzdcVar3;
                        zzx zzxVar = new zzx(zzblVar2, application2, zzdcVar3.zza(), zzboVar3, null, 16, null);
                        zzl zzlVar = zze;
                        zzlVar.zze(zzxVar, (zzgv) obj2);
                        zzlVar.zza = zzdcVar6.zza();
                        zzcfVar2.zza = application5;
                        zzcfVar2.zzb = str6;
                        zzcfVar2.zzc = zzdcVar6;
                        zzcfVar2.zzd = zzbvVar3;
                        zzcfVar2.zze = zzboVar3;
                        zzcfVar2.zzf = zzpqVar;
                        cancellationException = null;
                        zzcfVar2.zzg = null;
                        zzcfVar2.zzk = 3;
                        zzc2 = zzlVar.zzc((long) d8, zzpqVar, zzcfVar2);
                        if (zzc2 != aVar) {
                            str4 = str6;
                            application3 = application5;
                            zzdcVar4 = zzdcVar6;
                            a2 = C1113f.a(zzc2);
                            if (a2 != null) {
                            }
                        }
                        return aVar;
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) zzcfVar2.zza;
                        AbstractC0603a.p0(obj2);
                        throw th;
                    }
                    zzpqVar = (zzpq) zzcfVar2.zzf;
                    zzbo zzboVar5 = (zzbo) zzcfVar2.zze;
                    zzbv zzbvVar5 = (zzbv) zzcfVar2.zzd;
                    zzdcVar4 = (zzdc) zzcfVar2.zzc;
                    str4 = (String) zzcfVar2.zzb;
                    application3 = (Application) zzcfVar2.zza;
                    AbstractC0603a.p0(obj2);
                    zzboVar3 = zzboVar5;
                    zzbvVar3 = zzbvVar5;
                    zzc2 = ((C1113f) obj2).f13003a;
                    cancellationException = null;
                    a2 = C1113f.a(zzc2);
                    if (a2 != null) {
                        return new zzcx(application3, zze, str4, zzboVar3, zzbvVar3, zzpqVar, zzdcVar4, new zzbl(application3), new zzds());
                    }
                    InterfaceC1292i c3 = zzboVar3.zzd().c();
                    B b7 = B.f1775b;
                    InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c3.get(b7);
                    if (interfaceC0118e0 != null && (children = interfaceC0118e0.getChildren()) != null) {
                        Iterator it = children.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0118e0) it.next()).cancel(cancellationException);
                        }
                    }
                    InterfaceC1292i c4 = zzboVar3.zzd().c();
                    InterfaceC0118e0 interfaceC0118e02 = (InterfaceC0118e0) c4.get(b7);
                    if (interfaceC0118e02 == null) {
                        throw new IllegalStateException(("Current context doesn't contain Job in it: " + c4).toString());
                    }
                    List K02 = d.K0(interfaceC0118e02.getChildren());
                    zzcfVar2.zza = a2;
                    zzcfVar2.zzb = cancellationException;
                    zzcfVar2.zzc = cancellationException;
                    zzcfVar2.zzd = cancellationException;
                    zzcfVar2.zze = cancellationException;
                    zzcfVar2.zzf = cancellationException;
                    zzcfVar2.zzk = 4;
                    if (E.n(K02, zzcfVar2) != aVar) {
                        throw a2;
                    }
                    return aVar;
                }
                double d12 = zzcfVar2.zzh;
                zzbl zzblVar4 = zzcfVar2.zzl;
                zzbo zzboVar6 = zzcfVar2.zzm;
                zzdq zzdqVar3 = (zzdq) zzcfVar2.zzg;
                WebView webView3 = (WebView) zzcfVar2.zzf;
                zzbv zzbvVar6 = (zzbv) zzcfVar2.zze;
                zzdcVar2 = (zzdc) zzcfVar2.zzd;
                String str7 = (String) zzcfVar2.zzc;
                Application application6 = (Application) zzcfVar2.zzb;
                zzco zzcoVar2 = (zzco) zzcfVar2.zza;
                AbstractC0603a.p0(obj2);
                zzdqVar2 = zzdqVar3;
                zzbvVar2 = zzbvVar6;
                d7 = d12;
                webView2 = webView3;
                obj = obj2;
                zzboVar2 = zzboVar6;
                zzblVar = zzblVar4;
                zzcoVar = zzcoVar2;
                str2 = str7;
                application4 = application6;
                zzpq zzpqVar3 = (zzpq) obj;
                zzcoVar.zzj(zzpqVar3.zzM());
                zzdc zza2 = zzdcVar2.zza();
                zzcfVar2.zza = application4;
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
                x4 = E.x(zzboVar2.zzb().c(), new zzcg(webView2, application4, zzbvVar2, zza2, zzboVar2, zzdqVar2, null), zzcfVar2);
                if (x4 != aVar) {
                    zzblVar2 = zzblVar;
                    d8 = d13;
                    zzdcVar3 = zzdcVar2;
                    application2 = application4;
                    str3 = str2;
                    zzbvVar3 = zzbvVar2;
                    zzboVar3 = zzboVar2;
                    obj2 = x4;
                    zzpqVar = zzpqVar3;
                    Application application52 = application2;
                    String str62 = str3;
                    zzdc zzdcVar62 = zzdcVar3;
                    zzx zzxVar2 = new zzx(zzblVar2, application2, zzdcVar3.zza(), zzboVar3, null, 16, null);
                    zzl zzlVar2 = zze;
                    zzlVar2.zze(zzxVar2, (zzgv) obj2);
                    zzlVar2.zza = zzdcVar62.zza();
                    zzcfVar2.zza = application52;
                    zzcfVar2.zzb = str62;
                    zzcfVar2.zzc = zzdcVar62;
                    zzcfVar2.zzd = zzbvVar3;
                    zzcfVar2.zze = zzboVar3;
                    zzcfVar2.zzf = zzpqVar;
                    cancellationException = null;
                    zzcfVar2.zzg = null;
                    zzcfVar2.zzk = 3;
                    zzc2 = zzlVar2.zzc((long) d8, zzpqVar, zzcfVar2);
                    if (zzc2 != aVar) {
                    }
                }
                return aVar;
            }
        }
        zzcfVar = new zzcf(this, interfaceC1287d);
        zzcf zzcfVar22 = zzcfVar;
        Object obj22 = zzcfVar22.zzi;
        aVar = j6.a.f14642a;
        i7 = zzcfVar22.zzk;
        if (i7 != 0) {
        }
        zzpq zzpqVar32 = (zzpq) obj;
        zzcoVar.zzj(zzpqVar32.zzM());
        zzdc zza22 = zzdcVar2.zza();
        zzcfVar22.zza = application4;
        zzcfVar22.zzb = str2;
        zzcfVar22.zzc = zzdcVar2;
        zzcfVar22.zzd = zzbvVar2;
        zzcfVar22.zze = zzboVar2;
        zzcfVar22.zzf = zzblVar;
        zzcfVar22.zzg = zzpqVar32;
        zzcfVar22.zzm = null;
        zzcfVar22.zzl = null;
        zzcfVar22.zzh = d7;
        zzcfVar22.zzk = 2;
        double d132 = d7;
        x4 = E.x(zzboVar2.zzb().c(), new zzcg(webView2, application4, zzbvVar2, zza22, zzboVar2, zzdqVar2, null), zzcfVar22);
        if (x4 != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(Application application, String str, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, zzdc zzdcVar, InterfaceC1287d interfaceC1287d) {
        zzcm zzcmVar;
        int i7;
        zzco zzcoVar;
        zzbh zzb2;
        zzbh zzbhVar;
        Application application2 = application;
        try {
            try {
                if (interfaceC1287d instanceof zzcm) {
                    zzcmVar = (zzcm) interfaceC1287d;
                    int i8 = zzcmVar.zzd;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        zzcmVar.zzd = i8 - Integer.MIN_VALUE;
                        zzcm zzcmVar2 = zzcmVar;
                        Object obj = zzcmVar2.zzb;
                        j6.a aVar = j6.a.f14642a;
                        i7 = zzcmVar2.zzd;
                        if (i7 != 0) {
                            AbstractC0603a.p0(obj);
                            try {
                                zzdq zzdqVar2 = new zzdq(new zzbs(application2), new zzdo());
                                zzcmVar2.zze = this;
                                zzcmVar2.zza = application2;
                                zzcmVar2.zzd = 1;
                                obj = zzl(application, str, j, zzdcVar, zzbvVar, null, zzdqVar2, zzboVar, zzcmVar2);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                zzcoVar = this;
                            } catch (zzbj e7) {
                                e = e7;
                                zzcoVar = this;
                                zzb2 = e.zzb();
                                zzbhVar = zzbh.zzc;
                                if (h.a(zzb2, zzbhVar) || zzcoVar.zzk(application2)) {
                                    throw e;
                                }
                                throw new zzbj(zzbhVar, zzbg.zzap, null);
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = zzcmVar2.zza;
                            zzcoVar = zzcmVar2.zze;
                            try {
                                AbstractC0603a.p0(obj);
                                application2 = obj2;
                            } catch (zzbj e8) {
                                e = e8;
                                application2 = obj2;
                                zzb2 = e.zzb();
                                zzbhVar = zzbh.zzc;
                                if (h.a(zzb2, zzbhVar)) {
                                }
                                throw e;
                            }
                        }
                        zzcx zzcxVar = (zzcx) obj;
                        zzb = zzcxVar;
                        return zzcxVar;
                    }
                }
                zzcx zzcxVar2 = (zzcx) obj;
                zzb = zzcxVar2;
                return zzcxVar2;
            } catch (zzbj e9) {
                e = e9;
                zzb2 = e.zzb();
                zzbhVar = zzbh.zzc;
                if (h.a(zzb2, zzbhVar)) {
                }
                throw e;
            }
            if (i7 != 0) {
            }
        } catch (RecaptchaException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzb, zzbg.zza, e11.getMessage());
        }
        zzcmVar = new zzcm(this, interfaceC1287d);
        zzcm zzcmVar22 = zzcmVar;
        Object obj3 = zzcmVar22.zzb;
        j6.a aVar2 = j6.a.f14642a;
        i7 = zzcmVar22.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Application application, String str, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, InterfaceC1287d interfaceC1287d) {
        zzcd zzcdVar;
        Object obj;
        j6.a aVar;
        int i7;
        Application application2;
        long j3;
        a aVar2;
        String str2;
        zzbv zzbvVar2;
        zzbo zzboVar2;
        a aVar3;
        try {
            if (interfaceC1287d instanceof zzcd) {
                zzcdVar = (zzcd) interfaceC1287d;
                int i8 = zzcdVar.zzf;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    zzcdVar.zzf = i8 - Integer.MIN_VALUE;
                    obj = zzcdVar.zzd;
                    aVar = j6.a.f14642a;
                    i7 = zzcdVar.zzf;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        a aVar4 = zzd;
                        application2 = application;
                        zzcdVar.zza = application2;
                        zzcdVar.zzg = str;
                        zzcdVar.zzh = zzbvVar;
                        zzcdVar.zzi = zzboVar;
                        zzcdVar.zzb = aVar4;
                        j3 = j;
                        zzcdVar.zzc = j3;
                        zzcdVar.zzf = 1;
                        if (aVar4.a(zzcdVar) != aVar) {
                            aVar2 = aVar4;
                            str2 = str;
                            zzbvVar2 = zzbvVar;
                            zzboVar2 = zzboVar;
                        }
                        return aVar;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar3 = (a) zzcdVar.zza;
                        try {
                            AbstractC0603a.p0(obj);
                            zzcx zzcxVar = (zzcx) obj;
                            aVar3.b(null);
                            return zzcxVar;
                        } catch (Throwable th) {
                            th = th;
                            aVar3.b(null);
                            throw th;
                        }
                    }
                    long j7 = zzcdVar.zzc;
                    Object obj2 = zzcdVar.zzb;
                    zzbo zzboVar3 = zzcdVar.zzi;
                    zzbv zzbvVar3 = zzcdVar.zzh;
                    String str3 = zzcdVar.zzg;
                    Application application3 = (Application) zzcdVar.zza;
                    AbstractC0603a.p0(obj);
                    zzboVar2 = zzboVar3;
                    zzbvVar2 = zzbvVar3;
                    str2 = str3;
                    aVar2 = obj2;
                    application2 = application3;
                    j3 = j7;
                    zzco zzcoVar = zza;
                    zzce zzceVar = new zzce(str2, application2, j3, zzbvVar2, null, null, zzboVar2, null);
                    zzcdVar.zza = aVar2;
                    zzcdVar.zzg = null;
                    zzcdVar.zzh = null;
                    zzcdVar.zzi = null;
                    zzcdVar.zzb = null;
                    zzcdVar.zzf = 2;
                    obj = zzcoVar.zzi(str2, application2, zzceVar, zzcdVar);
                    if (obj != aVar) {
                        aVar3 = aVar2;
                        zzcx zzcxVar2 = (zzcx) obj;
                        aVar3.b(null);
                        return zzcxVar2;
                    }
                    return aVar;
                }
            }
            zzco zzcoVar2 = zza;
            zzce zzceVar2 = new zzce(str2, application2, j3, zzbvVar2, null, null, zzboVar2, null);
            zzcdVar.zza = aVar2;
            zzcdVar.zzg = null;
            zzcdVar.zzh = null;
            zzcdVar.zzi = null;
            zzcdVar.zzb = null;
            zzcdVar.zzf = 2;
            obj = zzcoVar2.zzi(str2, application2, zzceVar2, zzcdVar);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            aVar3 = aVar2;
            aVar3.b(null);
            throw th;
        }
        zzcdVar = new zzcd(this, interfaceC1287d);
        obj = zzcdVar.zzd;
        aVar = j6.a.f14642a;
        i7 = zzcdVar.zzf;
        if (i7 != 0) {
        }
    }
}
