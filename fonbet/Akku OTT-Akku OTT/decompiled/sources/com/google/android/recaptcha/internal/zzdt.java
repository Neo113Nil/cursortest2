package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.base.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.C1054f;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.X0;

/* loaded from: classes4.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final Lazy zzd;
    private final Lazy zze;
    private final Lazy zzf;
    private final Lazy zzg;
    private final Lazy zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = LazyKt.lazy(zzdm.zza);
        this.zze = LazyKt.lazy(zzdn.zza);
        this.zzf = LazyKt.lazy(zzdo.zza);
        this.zzg = LazyKt.lazy(zzdp.zza);
        this.zzh = LazyKt.lazy(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j, Continuation continuation) {
        zzdj zzdjVar;
        int i;
        Object zzc;
        zzdt zzdtVar;
        Throwable m1719exceptionOrNullimpl;
        Sequence<InterfaceC1120x0> children;
        if (continuation instanceof zzdj) {
            zzdjVar = (zzdj) continuation;
            int i2 = zzdjVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i2 - Integer.MIN_VALUE;
                zzdj zzdjVar2 = zzdjVar;
                Object obj = zzdjVar2.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzdjVar2.zzd;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzy(zzscVar.zzO());
                    Iterator it = zzw().iterator();
                    while (it.hasNext()) {
                        this.zzc.zzf((zze) it.next());
                    }
                    zzl zzlVar = this.zzc;
                    zzek zzekVar = this.zzb;
                    zzdjVar2.zza = this;
                    zzdjVar2.zzd = 1;
                    zzc = zzlVar.zzc(j, zzscVar, zzekVar, zzdjVar2);
                    if (zzc != coroutine_suspended) {
                        zzdtVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) zzdjVar2.zza;
                    ResultKt.throwOnFailure(obj);
                    throw th;
                }
                zzdtVar = (zzdt) zzdjVar2.zza;
                ResultKt.throwOnFailure(obj);
                zzc = ((Result) obj).getValue();
                m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(zzc);
                if (m1719exceptionOrNullimpl != null) {
                    return Unit.INSTANCE;
                }
                InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) zzdtVar.zzi.zzd().getCoroutineContext().get(InterfaceC1120x0.a.a);
                if (interfaceC1120x0 != null && (children = interfaceC1120x0.getChildren()) != null) {
                    Iterator<InterfaceC1120x0> it2 = children.iterator();
                    while (it2.hasNext()) {
                        it2.next().cancel((CancellationException) null);
                    }
                }
                List list = SequencesKt.toList(r.e(zzdtVar.zzi.zzd().getCoroutineContext()).getChildren());
                zzdjVar2.zza = m1719exceptionOrNullimpl;
                zzdjVar2.zzd = 2;
                if (C1054f.a(list, zzdjVar2) != coroutine_suspended) {
                    throw m1719exceptionOrNullimpl;
                }
                return coroutine_suspended;
            }
        }
        zzdjVar = new zzdj(this, continuation);
        zzdj zzdjVar22 = zzdjVar;
        Object obj2 = zzdjVar22.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdjVar22.zzd;
        if (i != 0) {
        }
        m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(zzc);
        if (m1719exceptionOrNullimpl != null) {
        }
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.toList(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) LazyKt.lazy(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j, Continuation continuation) {
        zzdd zzddVar;
        int i;
        Exception e;
        zzen zzenVar;
        V0 e2;
        zzbd e3;
        if (continuation instanceof zzdd) {
            zzddVar = (zzdd) continuation;
            int i2 = zzddVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzddVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzddVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzen zzf = zzu(str).zzf(27);
                    try {
                        zzl zzlVar = this.zzc;
                        zzddVar.zzd = zzf;
                        zzddVar.zzc = 1;
                        Object zzb = zzlVar.zzb(str, j, zzddVar);
                        if (zzb == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = zzb;
                        zzenVar = zzf;
                    } catch (zzbd e4) {
                        e3 = e4;
                        zzenVar = zzf;
                        zzenVar.zzb(e3);
                        throw e3;
                    } catch (V0 e5) {
                        e2 = e5;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar;
                    } catch (Exception e6) {
                        e = e6;
                        zzenVar = zzf;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzddVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e7) {
                        e3 = e7;
                        zzenVar.zzb(e3);
                        throw e3;
                    } catch (V0 e8) {
                        e2 = e8;
                        zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
                        zzenVar.zzb(zzbdVar3);
                        throw zzbdVar3;
                    } catch (Exception e9) {
                        e = e9;
                        zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                        zzenVar.zzb(zzbdVar22);
                        throw zzbdVar22;
                    }
                }
                zzsi zzsiVar = (zzsi) obj;
                zzenVar.zza();
                return zzsiVar;
            }
        }
        zzddVar = new zzdd(this, continuation);
        Object obj2 = zzddVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzddVar.zzc;
        if (i != 0) {
        }
        zzsi zzsiVar2 = (zzsi) obj2;
        zzenVar.zza();
        return zzsiVar2;
    }

    public final Object zzm(zzsp zzspVar, String str, long j, Continuation continuation) {
        return C1082i.f(new zzdg(this, str, j, zzspVar, null), this.zzi.zza().getCoroutineContext(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsc zzscVar, long j, Continuation continuation) {
        zzdk zzdkVar;
        int i;
        try {
            if (continuation instanceof zzdk) {
                zzdkVar = (zzdk) continuation;
                int i2 = zzdkVar.zzc;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzdkVar.zzc = i2 - Integer.MIN_VALUE;
                    Object obj = zzdkVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzdkVar.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzdl zzdlVar = new zzdl(this, zzscVar, j, null);
                        zzdkVar.zzc = 1;
                        if (X0.b(j, zzdlVar, zzdkVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (zzbd e) {
            throw e;
        } catch (V0 e2) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e3.getMessage());
        }
        zzdkVar = new zzdk(this, continuation);
        Object obj2 = zzdkVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdkVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j, Continuation continuation) {
        zzdr zzdrVar;
        int i;
        Exception e;
        zzen zzenVar;
        zzdt zzdtVar;
        V0 e2;
        zzbd e3;
        if (continuation instanceof zzdr) {
            zzdrVar = (zzdr) continuation;
            int i2 = zzdrVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzdrVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzdrVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzen zzf = this.zzb.zzf(22);
                    try {
                        zzds zzdsVar = new zzds(this, zzf, null);
                        zzdrVar.zzd = this;
                        zzdrVar.zze = zzf;
                        zzdrVar.zzc = 1;
                        Object b = X0.b(j, zzdsVar, zzdrVar);
                        if (b == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = b;
                        zzenVar = zzf;
                        zzdtVar = this;
                    } catch (zzbd e4) {
                        e3 = e4;
                        zzenVar = zzf;
                        zzdtVar = this;
                        if (Intrinsics.areEqual(e3.zzb(), zzbb.zzc)) {
                        }
                        zzenVar.zzb(e3);
                        throw e3;
                    } catch (V0 e5) {
                        e2 = e5;
                        zzenVar = zzf;
                        zzdtVar = this;
                        zzbd zzs = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                        zzenVar.zzb(zzs);
                        throw zzs;
                    } catch (Exception e6) {
                        e = e6;
                        zzenVar = zzf;
                        zzdtVar = this;
                        zzbd zzs2 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                        zzenVar.zzb(zzs2);
                        throw zzs2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzdrVar.zze;
                    zzdtVar = zzdrVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e7) {
                        e3 = e7;
                        if (Intrinsics.areEqual(e3.zzb(), zzbb.zzc)) {
                            e3 = zzdtVar.zzs(e3, e3);
                        }
                        zzenVar.zzb(e3);
                        throw e3;
                    } catch (V0 e8) {
                        e2 = e8;
                        zzbd zzs3 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                        zzenVar.zzb(zzs3);
                        throw zzs3;
                    } catch (Exception e9) {
                        e = e9;
                        zzbd zzs22 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                        zzenVar.zzb(zzs22);
                        throw zzs22;
                    }
                }
                return (zzsc) obj;
            }
        }
        zzdrVar = new zzdr(this, continuation);
        Object obj2 = zzdrVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdrVar.zzc;
        if (i != 0) {
        }
        return (zzsc) obj2;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        int collectionSizeOrDefault;
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zzk, 10);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
            for (zzst zzstVar : zzk) {
                Pair pair = TuplesKt.to(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e) {
            zzf.zzb(e);
        } catch (Exception e2) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
