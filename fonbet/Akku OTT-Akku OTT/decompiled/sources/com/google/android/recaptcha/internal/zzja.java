package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1115v;
import kotlinx.coroutines.V0;

/* loaded from: classes4.dex */
public final class zzja extends zze {
    public InterfaceC1115v zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final Lazy zzk;
    private final Lazy zzl;
    private final Lazy zzm;
    private final Lazy zzn;
    private final Lazy zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i = zzav.zza;
        this.zzk = LazyKt.lazy(zzis.zza);
        this.zzl = LazyKt.lazy(zzit.zza);
        this.zzm = LazyKt.lazy(zziu.zza);
        this.zzn = LazyKt.lazy(zziv.zza);
        this.zzo = LazyKt.lazy(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsc zzscVar, Continuation continuation) {
        zzim zzimVar;
        int i;
        zzbd e;
        zzja zzjaVar;
        if (continuation instanceof zzim) {
            zzimVar = (zzim) continuation;
            int i2 = zzimVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzimVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzimVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        zzff zzffVar = (zzff) this.zzn.getValue();
                        zzek zzekVar = this.zzj;
                        zzimVar.zzd = this;
                        zzimVar.zzc = 1;
                        obj = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzjaVar = this;
                    } catch (zzbd e2) {
                        e = e2;
                        zzjaVar = this;
                        zzjaVar.zzA().s(e);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzjaVar = zzimVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e3) {
                        e = e3;
                        zzjaVar.zzA().s(e);
                        return Unit.INSTANCE;
                    }
                }
                C1082i.c(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) obj, null), 3);
                return Unit.INSTANCE;
            }
        }
        zzimVar = new zzim(this, continuation);
        Object obj2 = zzimVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzimVar.zzc;
        if (i != 0) {
        }
        C1082i.c(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) obj2, null), 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:28|29))(4:30|31|32|(1:34)(1:35))|13|14|15|16))|39|6|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r2 = r9;
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, Continuation continuation) {
        zzio zzioVar;
        int i;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzen zzenVar;
        if (continuation instanceof zzio) {
            zzioVar = (zzio) continuation;
            int i2 = zzioVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzioVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzioVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.zzp = this.zzj.zzf(26);
                    try {
                        String zza = ((zzbr) this.zzl.getValue()).zza();
                        zzioVar.zzd = this;
                        zzioVar.zze = str;
                        zzioVar.zzf = zza;
                        zzioVar.zzc = 1;
                        Object zzw = zzw(zzioVar);
                        if (zzw == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        str3 = zza;
                        obj = zzw;
                        zzjaVar2 = this;
                    } catch (Exception e) {
                        exc = e;
                        zzjaVar = this;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                            zzenVar.zzb(zzbdVar);
                        }
                        zzjaVar.zzp = null;
                        zzjaVar.zzA().s(zzbdVar);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = zzioVar.zzf;
                    String str5 = zzioVar.zze;
                    zzjaVar = zzioVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str3 = str4;
                        str2 = str5;
                        zzjaVar2 = zzjaVar;
                    } catch (Exception e2) {
                        exc = e2;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                        }
                        zzjaVar.zzp = null;
                        zzjaVar.zzA().s(zzbdVar2);
                        return Unit.INSTANCE;
                    }
                }
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
                return Unit.INSTANCE;
            }
        }
        zzioVar = new zzio(this, continuation);
        Object obj2 = zzioVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzioVar.zzc;
        if (i != 0) {
        }
        ((WebView) obj2).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, Continuation continuation) {
        zzix zzixVar;
        Object obj;
        int i;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (continuation instanceof zzix) {
            zzixVar = (zzix) continuation;
            int i2 = zzixVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i2 - Integer.MIN_VALUE;
                obj = zzixVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzixVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzcb zzcbVar = this.zzg;
                    zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
                    zzixVar.zzd = this;
                    zzixVar.zze = str;
                    zzixVar.zzc = 1;
                    obj = zzcbVar.zzb(zzjeVarArr, zzixVar);
                    if (obj != coroutine_suspended) {
                        zzjaVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzixVar.zze;
                    zzjaVar2 = zzixVar.zzd;
                    ResultKt.throwOnFailure(obj);
                    zzjaVar2.zza = C1119x.a();
                    zzek zzekVar = zzjaVar2.zzj;
                    zzekVar.zzc(str);
                    C1082i.c(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3);
                    return Unit.INSTANCE;
                }
                str = zzixVar.zze;
                zzjaVar = zzixVar.zzd;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                zzcb zzcbVar2 = zzjaVar.zzg;
                zzje zzjeVar = zzje.zzb;
                zzixVar.zzd = zzjaVar;
                zzixVar.zze = str;
                zzixVar.zzc = 2;
                if (zzcbVar2.zzc(zzjeVar, zzixVar) != coroutine_suspended) {
                    zzjaVar2 = zzjaVar;
                    zzjaVar2.zza = C1119x.a();
                    zzek zzekVar2 = zzjaVar2.zzj;
                    zzekVar2.zzc(str);
                    C1082i.c(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        zzixVar = new zzix(this, continuation);
        obj = zzixVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzixVar.zzc;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC1115v zzA() {
        InterfaceC1115v interfaceC1115v = this.zza;
        if (interfaceC1115v != null) {
            return interfaceC1115v;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(CollectionsKt.toLongArray(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, Continuation continuation) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (r12.await(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        if (r12 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        if (r12 != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, Continuation continuation) {
        zzip zzipVar;
        Object obj;
        ?? r2;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        zzja zzjaVar4;
        try {
            if (continuation instanceof zzip) {
                zzipVar = (zzip) continuation;
                int i = zzipVar.zzc;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzipVar.zzc = i - Integer.MIN_VALUE;
                    obj = zzipVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzipVar.zzc;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzcb zzcbVar = this.zzg;
                        zzje zzjeVar = zzje.zzd;
                        zzipVar.zzd = this;
                        zzipVar.zze = str;
                        zzipVar.zzc = 1;
                        obj = zzcbVar.zza(zzjeVar, zzipVar);
                        if (obj != coroutine_suspended) {
                            zzjaVar2 = this;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        str = zzipVar.zze;
                        zzja zzjaVar5 = zzipVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        zzjaVar2 = zzjaVar5;
                    } else if (r2 == 2) {
                        str = zzipVar.zze;
                        zzja zzjaVar6 = zzipVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        zzjaVar3 = zzjaVar6;
                        zzjaVar4 = zzjaVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            zzipVar.zzd = zzjaVar3;
                            zzipVar.zze = str;
                            zzipVar.zzc = 3;
                            Object zzG = zzjaVar3.zzG(str, zzipVar);
                            zzjaVar4 = zzjaVar3;
                        }
                        InterfaceC1115v zzA = zzjaVar4.zzA();
                        zzipVar.zzd = zzjaVar4;
                        zzipVar.zze = str;
                        zzipVar.zzc = 4;
                        r2 = zzjaVar4;
                    } else {
                        if (r2 != 3) {
                            if (r2 != 4) {
                                if (r2 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str = zzipVar.zze;
                                zzjaVar = zzipVar.zzd;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    zzsi zzsiVar = (zzsi) obj;
                                    zzsh zzf = zzsi.zzf();
                                    zzf.zze(str);
                                    zzsl zzf2 = zzsm.zzf();
                                    zzf2.zze(zzsiVar.zzl());
                                    zzf.zzq(zzf2);
                                    zzsj zzf3 = zzsk.zzf();
                                    zzf3.zze(zzsiVar.zzj());
                                    zzf3.zzf(zzsiVar.zzM());
                                    zzf.zzr(zzf3);
                                    Result.Companion companion = Result.INSTANCE;
                                    return Result.m1716constructorimpl(zzf.zzk());
                                } catch (Exception e) {
                                    e = e;
                                    zzbd zza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                                    InterfaceC1115v interfaceC1115v = (InterfaceC1115v) zzjaVar.zze.remove(str);
                                    if (interfaceC1115v != null) {
                                        Boxing.boxBoolean(interfaceC1115v.s(zza));
                                    }
                                    Result.Companion companion2 = Result.INSTANCE;
                                    return Result.m1716constructorimpl(ResultKt.createFailure(zza));
                                }
                            }
                            str = zzipVar.zze;
                            zzja zzjaVar7 = zzipVar.zzd;
                            ResultKt.throwOnFailure(obj);
                            r2 = zzjaVar7;
                            C1117w a = C1119x.a();
                            r2.zze.put(str, a);
                            zztp zzf4 = zztq.zzf();
                            zzf4.zze(str);
                            byte[] zzd = ((zztq) zzf4.zzk()).zzd();
                            C1082i.c(r2.zzq.zzb(), null, null, new zziq(r2, zzkh.zzh().zzi(zzd, 0, zzd.length), null), 3);
                            zzipVar.zzd = r2;
                            zzipVar.zze = str;
                            zzipVar.zzc = 5;
                            obj = a.await(zzipVar);
                            if (obj != coroutine_suspended) {
                                zzjaVar = r2;
                                zzsi zzsiVar2 = (zzsi) obj;
                                zzsh zzf5 = zzsi.zzf();
                                zzf5.zze(str);
                                zzsl zzf22 = zzsm.zzf();
                                zzf22.zze(zzsiVar2.zzl());
                                zzf5.zzq(zzf22);
                                zzsj zzf32 = zzsk.zzf();
                                zzf32.zze(zzsiVar2.zzj());
                                zzf32.zzf(zzsiVar2.zzM());
                                zzf5.zzr(zzf32);
                                Result.Companion companion3 = Result.INSTANCE;
                                return Result.m1716constructorimpl(zzf5.zzk());
                            }
                            return coroutine_suspended;
                        }
                        str = zzipVar.zze;
                        zzja zzjaVar8 = zzipVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        zzjaVar4 = zzjaVar8;
                        InterfaceC1115v zzA2 = zzjaVar4.zzA();
                        zzipVar.zzd = zzjaVar4;
                        zzipVar.zze = str;
                        zzipVar.zzc = 4;
                        r2 = zzjaVar4;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzav, null);
                        Result.Companion companion4 = Result.INSTANCE;
                        return Result.m1716constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    zzcb zzcbVar2 = zzjaVar2.zzg;
                    zzje zzjeVar2 = zzje.zzc;
                    zzipVar.zzd = zzjaVar2;
                    zzipVar.zze = str;
                    zzipVar.zzc = 2;
                    obj = zzcbVar2.zza(zzjeVar2, zzipVar);
                    zzjaVar3 = zzjaVar2;
                }
            }
            if (r2 != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Exception e2) {
            e = e2;
            zzjaVar = r2;
        }
        zzipVar = new zzip(this, continuation);
        obj = zzipVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzipVar.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, Continuation continuation) {
        if (Intrinsics.areEqual(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzsc zzscVar, Continuation continuation) {
        zzir zzirVar;
        int i;
        if (continuation instanceof zzir) {
            zzirVar = (zzir) continuation;
            int i2 = zzirVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzirVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzirVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m1716constructorimpl(ResultKt.createFailure(new zzbd(zzbb.zzb, zzba.zzav, null)));
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m1716constructorimpl(Unit.INSTANCE);
                }
                ResultKt.throwOnFailure(obj);
                if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
                    this.zzf = zzscVar;
                    String zzd = this.zzc.zzd();
                    zzirVar.zzc = 2;
                } else {
                    zzcb zzcbVar = this.zzg;
                    zzje zzjeVar = zzje.zzd;
                    zzirVar.zzc = 1;
                }
                return coroutine_suspended;
            }
        }
        zzirVar = new zzir(this, continuation);
        Object obj2 = zzirVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzirVar.zzc;
        if (i == 0) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, Continuation continuation) {
        exc.getMessage();
        InterfaceC1115v interfaceC1115v = (InterfaceC1115v) this.zze.remove(str);
        if (interfaceC1115v != null) {
            Boxing.boxBoolean(interfaceC1115v.s(exc));
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, Continuation continuation) {
        return ((exc instanceof V0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(Continuation continuation) {
        zzjd zzjdVar = (zzjd) this.zzk.getValue();
        Application zzD = zzD();
        return C1082i.f(new zzjc(zzjdVar, zzD, null), this.zzq.zzb().getCoroutineContext(), continuation);
    }

    public final Object zzx(Continuation continuation) {
        Object f = C1082i.f(new zzil(this, null), this.zzq.zzb().getCoroutineContext(), continuation);
        return f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? f : Unit.INSTANCE;
    }
}
