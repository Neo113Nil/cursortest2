package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1115v;
import kotlinx.coroutines.K;
import kotlinx.coroutines.S;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.d;

/* loaded from: classes4.dex */
public final class zzan {
    public InterfaceC1115v zza;
    private final K zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final a zzg = d.a();

    public zzan(Context context, K k, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = k;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Continuation continuation) throws Exception {
        zzag zzagVar;
        int i;
        if (continuation instanceof zzag) {
            zzagVar = (zzag) continuation;
            int i2 = zzagVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzagVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzagVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                S zza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
                zzagVar.zzc = 1;
                Object await = zza.await(zzagVar);
                return await == coroutine_suspended ? coroutine_suspended : await;
            }
        }
        zzagVar = new zzag(this, continuation);
        Object obj2 = zzagVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzagVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, Continuation continuation) throws Exception {
        zzah zzahVar;
        int i;
        if (continuation instanceof zzah) {
            zzahVar = (zzah) continuation;
            int i2 = zzahVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzahVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzahVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC1115v zzf = zzf();
                    zzahVar.zzd = str;
                    zzahVar.zzc = 1;
                    obj = zzf.await(zzahVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzahVar.zzd;
                    ResultKt.throwOnFailure(obj);
                }
                S zza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzahVar.zzd = null;
                zzahVar.zzc = 2;
                obj = zza.await(zzahVar);
            }
        }
        zzahVar = new zzah(this, continuation);
        Object obj2 = zzahVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzahVar.zzc;
        if (i != 0) {
        }
        S zza2 = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        obj2 = zza2.await(zzahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r2.zze(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, Continuation continuation) throws Exception {
        zzaf zzafVar;
        int i;
        zzan zzanVar;
        if (continuation instanceof zzaf) {
            zzafVar = (zzaf) continuation;
            int i2 = zzafVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzafVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzafVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        zzafVar.zzd = this;
                        zzafVar.zze = str;
                        zzafVar.zzc = 1;
                        obj = zzj(str, zzafVar);
                        if (obj != coroutine_suspended) {
                            zzanVar = this;
                        }
                    } catch (Exception unused) {
                        zzanVar = this;
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused2) {
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return (String) obj;
                    }
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    ResultKt.throwOnFailure(obj);
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    obj = zzanVar.zzj(str, zzafVar);
                }
                return (String) obj;
            }
        }
        zzafVar = new zzaf(this, continuation);
        Object obj2 = zzafVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzafVar.zzc;
        if (i != 0) {
        }
        return (String) obj2;
    }

    public final Object zzd(long j, Continuation continuation) {
        this.zzf = j;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:19:0x0052, B:21:0x005c, B:24:0x0064), top: B:18:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[Catch: all -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:19:0x0052, B:21:0x005c, B:24:0x0064), top: B:18:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Continuation continuation) {
        zzak zzakVar;
        int i;
        a aVar;
        zzan zzanVar;
        try {
            if (continuation instanceof zzak) {
                zzakVar = (zzak) continuation;
                int i2 = zzakVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzakVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzakVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzakVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = this.zzg;
                        zzakVar.zze = this;
                        zzakVar.zza = aVar;
                        zzakVar.zzd = 1;
                        if (aVar.d(zzakVar) != coroutine_suspended) {
                            zzanVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    aVar = (a) zzakVar.zza;
                    zzanVar = zzakVar.zze;
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
                        return Unit.INSTANCE;
                    }
                    zzanVar.zze = zzao.zzb;
                    Unit unit = Unit.INSTANCE;
                    aVar.c(null);
                    zzek zzekVar = zzanVar.zzc;
                    zzekVar.zzc(zzekVar.zzd());
                    zzekVar.zzb(2);
                    zzen zzf = zzekVar.zzf(38);
                    zzanVar.zza = C1119x.a();
                    C1082i.c(zzanVar.zzb, null, null, new zzam(zzanVar, zzf, null), 3);
                    zzakVar.zze = null;
                    zzakVar.zza = null;
                    zzakVar.zzd = 2;
                    if (!zzanVar.zzh) {
                        new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                        zzanVar.zzh = true;
                    }
                }
            }
            if (Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
            }
        } finally {
            aVar.c(null);
        }
        zzakVar = new zzak(this, continuation);
        Object obj2 = zzakVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzakVar.zzd;
        if (i != 0) {
        }
    }

    public final InterfaceC1115v zzf() {
        InterfaceC1115v interfaceC1115v = this.zza;
        if (interfaceC1115v != null) {
            return interfaceC1115v;
        }
        return null;
    }
}
