package com.google.android.recaptcha.internal;

import android.app.Application;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.b;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.d;

/* loaded from: classes4.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final a zzb = d.a();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i = 1;
        this.zze = new zzl(null, i, 0 == true ? 1 : 0);
        int i2 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(0 == true ? 1 : 0, i, 0 == true ? 1 : 0)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i3 = 0; i3 < 13; i3++) {
            zzaw zzawVar = zzawVarArr[i3];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) {
        if (j < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (ContextCompat.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return Intrinsics.areEqual(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation, int i, Object obj) throws V0, b, RecaptchaException {
        if ((i & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzcvVar.zzg(str, j, null, zzbiVar2, zzchVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i, Function2 function2, Continuation continuation) {
        zzcu zzcuVar;
        int i2;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        if (continuation instanceof zzcu) {
            zzcuVar = (zzcu) continuation;
            int i3 = zzcuVar.zzc;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i3 - Integer.MIN_VALUE;
                Object obj = zzcuVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = zzcuVar.zzc;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzek zzk = zzk(str, this.zzf, i);
                    zzen zzf = zzk.zzf(6);
                    try {
                        zzcuVar.zzd = zzf;
                        zzcuVar.zzc = 1;
                        obj = function2.invoke(zzk, zzcuVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzenVar = zzf;
                    } catch (zzbd e3) {
                        e2 = e3;
                        zzenVar = zzf;
                        zzenVar.zzb(e2);
                        throw e2.zzc();
                    } catch (Exception e4) {
                        e = e4;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar.zzc();
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzcuVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e5) {
                        e2 = e5;
                        zzenVar.zzb(e2);
                        throw e2.zzc();
                    } catch (Exception e6) {
                        e = e6;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2.zzc();
                    }
                }
                zzenVar.zza();
                return obj;
            }
        }
        zzcuVar = new zzcu(this, continuation);
        Object obj2 = zzcuVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = zzcuVar.zzc;
        if (i2 != 0) {
        }
        zzenVar.zza();
        return obj2;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String uuid = UUID.randomUUID().toString();
        int i2 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) LazyKt.lazy(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x00bc, TryCatch #1 {all -> 0x00bc, blocks: (B:25:0x0084, B:28:0x0099, B:33:0x008e), top: B:24:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation) throws V0, b, RecaptchaException {
        zzcs zzcsVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j2;
        zzcv zzcvVar;
        String str2;
        a aVar;
        a aVar2;
        try {
            if (continuation instanceof zzcs) {
                zzcsVar = (zzcs) continuation;
                int i2 = zzcsVar.zzg;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzcsVar.zzg = i2 - Integer.MIN_VALUE;
                    obj = zzcsVar.zze;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzcsVar.zzg;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        a aVar3 = this.zzb;
                        zzcsVar.zza = this;
                        zzcsVar.zzh = str;
                        zzcsVar.zzb = null;
                        zzcsVar.zzj = zzbiVar;
                        zzcsVar.zzi = zzchVar;
                        zzcsVar.zzc = aVar3;
                        zzcsVar.zzd = j;
                        zzcsVar.zzg = 1;
                        if (aVar3.d(zzcsVar) != coroutine_suspended) {
                            zzbiVar2 = zzbiVar;
                            zzchVar2 = zzchVar;
                            j2 = j;
                            zzcvVar = this;
                            str2 = str;
                            aVar = aVar3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (a) zzcsVar.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                            zzdc zzdcVar = (zzdc) obj;
                            aVar2.c(null);
                            return zzdcVar;
                        } catch (Throwable th) {
                            th = th;
                            aVar2.c(null);
                            throw th;
                        }
                    }
                    long j3 = zzcsVar.zzd;
                    a aVar4 = (a) zzcsVar.zzc;
                    zzch zzchVar3 = zzcsVar.zzi;
                    zzbi zzbiVar3 = zzcsVar.zzj;
                    String str3 = zzcsVar.zzh;
                    zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
                    ResultKt.throwOnFailure(obj);
                    zzchVar2 = zzchVar3;
                    zzbiVar2 = zzbiVar3;
                    str2 = str3;
                    zzcvVar = zzcvVar2;
                    j2 = j3;
                    aVar = aVar4;
                    int i3 = !Intrinsics.areEqual(zzchVar2, zzch.zza) ? 3 : Intrinsics.areEqual(zzchVar2, zzch.zzb) ? 4 : 2;
                    zzct zzctVar = new zzct(zzcvVar, str2, j2, null, zzbiVar2, zzchVar2, null);
                    zzcsVar.zza = aVar;
                    zzcsVar.zzh = null;
                    zzcsVar.zzb = null;
                    zzcsVar.zzj = null;
                    zzcsVar.zzi = null;
                    zzcsVar.zzc = null;
                    zzcsVar.zzg = 2;
                    obj = zzcvVar.zzj(str2, i3, zzctVar, zzcsVar);
                    if (obj != coroutine_suspended) {
                        aVar2 = aVar;
                        zzdc zzdcVar2 = (zzdc) obj;
                        aVar2.c(null);
                        return zzdcVar2;
                    }
                    return coroutine_suspended;
                }
            }
            if (!Intrinsics.areEqual(zzchVar2, zzch.zza)) {
            }
            zzct zzctVar2 = new zzct(zzcvVar, str2, j2, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = aVar;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            obj = zzcvVar.zzj(str2, i3, zzctVar2, zzcsVar);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.c(null);
            throw th;
        }
        zzcsVar = new zzcs(this, continuation);
        obj = zzcsVar.zze;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcsVar.zzg;
        if (i != 0) {
        }
    }
}
