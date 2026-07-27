package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgdh implements zzgbx {
    private final CoroutineScope zza;
    private final zzgtm zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private final Mutex zze;
    private boolean zzf;
    private zzgbv zzg;
    private boolean zzh;
    private final DataStore zzi;
    private final zzdxu zzj;

    public zzgdh(DataStore adQualityDataStore, zzgcj coroutineScopeProvider, zzdxu dataPinger, zzgcg clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgtm();
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zze = MutexKt.Mutex$default(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.lock(null, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzA(Continuation continuation) {
        zzgcp zzgcpVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object updateData;
        try {
            if (continuation instanceof zzgcp) {
                zzgcpVar = (zzgcp) continuation;
                int i2 = zzgcpVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcpVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcpVar.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcpVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgcpVar.zza = mutex;
                        zzgcpVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzgcpVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzgcpVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    DataStore dataStore = this.zzi;
                    zzgcq zzgcqVar = new zzgcq(null);
                    zzgcpVar.zza = mutex;
                    zzgcpVar.zzd = 2;
                    updateData = dataStore.updateData(zzgcqVar, zzgcpVar);
                    if (updateData != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = updateData;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzi;
            zzgcq zzgcqVar2 = new zzgcq(null);
            zzgcpVar.zza = mutex;
            zzgcpVar.zzd = 2;
            updateData = dataStore2.updateData(zzgcqVar2, zzgcpVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        zzgcpVar = new zzgcp(this, continuation);
        Object obj2 = zzgcpVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcpVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzB(long j, Continuation continuation) {
        zzgco zzgcoVar;
        int i;
        Mutex mutex;
        zzgbv zzgbvVar;
        zzgbv zzgbvVar2;
        zzgbv zzgbvVar3;
        try {
            if (continuation instanceof zzgco) {
                zzgcoVar = (zzgco) continuation;
                int i2 = zzgcoVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcoVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcoVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcoVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        zzgcoVar.zzb = mutex2;
                        zzgcoVar.zza = j;
                        zzgcoVar.zze = 1;
                        if (mutex2.lock(null, zzgcoVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgcoVar.zza;
                        mutex = (Mutex) zzgcoVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgbvVar = this.zzg;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbvVar2 = this.zzg;
                    if (zzgbvVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar2 = null;
                    }
                    long zzi = j - zzgbvVar2.zzi();
                    zzgbvVar3 = this.zzg;
                    if (zzgbvVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar3 = null;
                    }
                    zzgbvVar.zzb(zzi - zzgbvVar3.zzg());
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzgbvVar = this.zzg;
            if (zzgbvVar == null) {
            }
            zzgbvVar2 = this.zzg;
            if (zzgbvVar2 == null) {
            }
            long zzi2 = j - zzgbvVar2.zzi();
            zzgbvVar3 = this.zzg;
            if (zzgbvVar3 == null) {
            }
            zzgbvVar.zzb(zzi2 - zzgbvVar3.zzg());
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgcoVar = new zzgco(this, continuation);
        Object obj2 = zzgcoVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcoVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
    
        if (r2.lock(null, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:35:0x0062, B:37:0x0066, B:38:0x006c), top: B:34:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzC(Continuation continuation) {
        zzgct zzgctVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        zzgbv zzgbvVar;
        Mutex mutex2;
        zzgbw zzgbwVar;
        Mutex mutex3;
        try {
            if (continuation instanceof zzgct) {
                zzgctVar = (zzgct) continuation;
                int i2 = zzgctVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgctVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgctVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgctVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgctVar.zza = mutex;
                        zzgctVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (Mutex) zzgctVar.zza;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            mutex2 = (Mutex) zzgctVar.zzb;
                            zzgbwVar = (zzgbw) zzgctVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                DataStore dataStore = this.zzi;
                                zzgcu zzgcuVar = new zzgcu(zzgbwVar, null);
                                zzgctVar.zza = mutex2;
                                zzgctVar.zzb = null;
                                zzgctVar.zze = 3;
                                obj = dataStore.updateData(zzgcuVar, zzgctVar);
                                if (obj != coroutine_suspended) {
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex3 = mutex2;
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzgctVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgbvVar = this.zzg;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbw zzgbwVar2 = (zzgbw) zzgbvVar.zzbu();
                    mutex.unlock(null);
                    Intrinsics.checkNotNull(zzgbwVar2);
                    mutex2 = this.zze;
                    zzgctVar.zza = zzgbwVar2;
                    zzgctVar.zzb = mutex2;
                    zzgctVar.zze = 2;
                    if (mutex2.lock(null, zzgctVar) != coroutine_suspended) {
                        zzgbwVar = zzgbwVar2;
                        DataStore dataStore2 = this.zzi;
                        zzgcu zzgcuVar2 = new zzgcu(zzgbwVar, null);
                        zzgctVar.zza = mutex2;
                        zzgctVar.zzb = null;
                        zzgctVar.zze = 3;
                        obj = dataStore2.updateData(zzgcuVar2, zzgctVar);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzgbvVar = this.zzg;
            if (zzgbvVar == null) {
            }
            zzgbw zzgbwVar22 = (zzgbw) zzgbvVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzgbwVar22);
            mutex2 = this.zze;
            zzgctVar.zza = zzgbwVar22;
            zzgctVar.zzb = mutex2;
            zzgctVar.zze = 2;
            if (mutex2.lock(null, zzgctVar) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
            mutex.unlock(null);
        }
        zzgctVar = new zzgct(this, continuation);
        Object obj2 = zzgctVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgctVar.zze;
        if (i != 0) {
        }
    }

    private static final boolean zzD(zzgbw zzgbwVar) {
        boolean z;
        List zzk = zzgbwVar.zzk();
        Long l = zzk != null ? (Long) CollectionsKt.lastOrNull(zzk) : null;
        boolean z2 = zzgbwVar.zzl() > zzgbwVar.zzm() && !zzgbwVar.zzd();
        if (l != null) {
            if (zzgbwVar.zzi() - l.longValue() > 5000) {
                z = true;
                return !z2 || z;
            }
        }
        z = false;
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgdh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzs(Continuation continuation) {
        zzgdc zzgdcVar;
        ?? r2;
        Mutex mutex;
        try {
            if (continuation instanceof zzgdc) {
                zzgdcVar = (zzgdc) continuation;
                int i = zzgdcVar.zzd;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzgdcVar.zzd = i - Integer.MIN_VALUE;
                    Object obj = zzgdcVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzgdcVar.zzd;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zze;
                        zzgdcVar.zza = mutex2;
                        zzgdcVar.zzd = 1;
                        if (mutex2.lock(null, zzgdcVar) != coroutine_suspended) {
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        Mutex mutex3 = (Mutex) zzgdcVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        Mutex mutex4 = (Mutex) zzgdcVar.zza;
                        ResultKt.throwOnFailure(obj);
                        r2 = mutex4;
                        zzgca zzgcaVar = (zzgca) obj;
                        if (zzgcaVar == null || zzgcaVar.zza() == 0) {
                            return Unit.INSTANCE;
                        }
                        for (Map.Entry entry : zzgcaVar.zzb().entrySet()) {
                            zzifg zzcc = ((zzgbw) entry.getValue()).zzcc();
                            Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                            zzgbv zzgbvVar = (zzgbv) zzcc;
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            if (zzD((zzgbw) value)) {
                                zzgbvVar.zzf(true);
                            }
                            zzdxu zzdxuVar = this.zzj;
                            zzifm zzbu = zzgbvVar.zzbu();
                            Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
                            zzdxuVar.zza((zzgbw) zzbu);
                        }
                        zzgdcVar.zza = null;
                        zzgdcVar.zzd = 3;
                    }
                    Flow data = this.zzi.getData();
                    zzgdcVar.zza = mutex;
                    zzgdcVar.zzd = 2;
                    obj = FlowKt.firstOrNull(data, zzgdcVar);
                    r2 = mutex;
                }
            }
            if (r2 != 0) {
            }
            Flow data2 = this.zzi.getData();
            zzgdcVar.zza = mutex;
            zzgdcVar.zzd = 2;
            obj = FlowKt.firstOrNull(data2, zzgdcVar);
            r2 = mutex;
        } finally {
            r2.unlock(null);
        }
        zzgdcVar = new zzgdc(this, continuation);
        Object obj2 = zzgdcVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzgdcVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzt(String str, Continuation continuation) {
        zzgcw zzgcwVar;
        int i;
        String str2;
        Mutex mutex;
        long j;
        try {
            if (continuation instanceof zzgcw) {
                zzgcwVar = (zzgcw) continuation;
                int i2 = zzgcwVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcwVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcwVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcwVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzgcwVar.zzf = str;
                        zzgcwVar.zza = mutex2;
                        zzgcwVar.zzb = currentTimeMillis;
                        zzgcwVar.zze = 1;
                        if (mutex2.lock(null, zzgcwVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgcwVar.zzb;
                        mutex = (Mutex) zzgcwVar.zza;
                        str2 = zzgcwVar.zzf;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = true;
                    zzifg zzcc = zzgbw.zzp().zzcc();
                    Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                    zzgbv zzgbvVar = (zzgbv) zzcc;
                    this.zzg = zzgbvVar;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbvVar.zza(str2);
                    zzgbvVar.zzj(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (!this.zzf) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgcwVar = new zzgcw(this, continuation);
        Object obj2 = zzgcwVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcwVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (zzC(r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (zzB(r5, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005f, code lost:
    
        if (r2.lock(null, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:24:0x0085, B:26:0x0089, B:27:0x008f), top: B:23:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x0061, B:38:0x0065, B:41:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x0061, B:38:0x0065, B:41:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(Continuation continuation) {
        zzgcs zzgcsVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbv zzgbvVar;
        try {
            if (continuation instanceof zzgcs) {
                zzgcsVar = (zzgcs) continuation;
                int i2 = zzgcsVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcsVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcsVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcsVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgcsVar.zza = mutex;
                        zzgcsVar.zze = 1;
                    } else if (i == 1) {
                        mutex = (Mutex) zzgcsVar.zza;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        j = zzgcsVar.zzb;
                        mutex2 = (Mutex) zzgcsVar.zza;
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzgbvVar = this.zzg;
                            if (zzgbvVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzgbvVar = null;
                            }
                            zzgbvVar.zzo(j);
                            mutex.unlock(null);
                            zzgcsVar.zza = null;
                            zzgcsVar.zze = 3;
                        } finally {
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        zzgcsVar.zze = 4;
                    }
                    if (!this.zzh) {
                        return Unit.INSTANCE;
                    }
                    this.zzh = true;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgcsVar.zza = mutex2;
                    zzgcsVar.zzb = currentTimeMillis;
                    zzgcsVar.zze = 2;
                    if (mutex2.lock(null, zzgcsVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgbvVar = this.zzg;
                        if (zzgbvVar == null) {
                        }
                        zzgbvVar.zzo(j);
                        mutex.unlock(null);
                        zzgcsVar.zza = null;
                        zzgcsVar.zze = 3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.zzh) {
            }
        } finally {
        }
        zzgcsVar = new zzgcs(this, continuation);
        Object obj2 = zzgcsVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcsVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0050, code lost:
    
        if (r2.lock(null, r0) != r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #1 {all -> 0x011f, blocks: (B:58:0x0052, B:60:0x0056, B:64:0x005d), top: B:57:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(Continuation continuation) {
        zzgdg zzgdgVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbv zzgbvVar;
        zzgbv zzgbvVar2;
        zzgbv zzgbvVar3;
        try {
            if (continuation instanceof zzgdg) {
                zzgdgVar = (zzgdg) continuation;
                int i2 = zzgdgVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgdgVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgdgVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgdgVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgdgVar.zza = mutex;
                        zzgdgVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = zzgdgVar.zzb;
                            mutex2 = (Mutex) zzgdgVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgbvVar = this.zzg;
                                if (zzgbvVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar = null;
                                }
                                if (zzgbvVar.zzr() > 0) {
                                    zzgbv zzgbvVar4 = this.zzg;
                                    if (zzgbvVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar4 = null;
                                    }
                                    List zzq = zzgbvVar4.zzq();
                                    Intrinsics.checkNotNullExpressionValue(zzq, "getAdClickTimestampsMsList(...)");
                                    Object last = CollectionsKt.last((List<? extends Object>) zzq);
                                    Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                                    long longValue = j - ((Number) last).longValue();
                                    zzgbv zzgbvVar5 = this.zzg;
                                    if (zzgbvVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar5 = null;
                                    }
                                    zzgbvVar5.zzt();
                                    if (longValue < 5000) {
                                        zzgbv zzgbvVar6 = this.zzg;
                                        if (zzgbvVar6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                            zzgbvVar6 = null;
                                        }
                                        zzgbvVar6.zzd(zzgbvVar6.zzc() + 1);
                                    }
                                }
                                zzgbvVar2 = this.zzg;
                                if (zzgbvVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar2 = null;
                                }
                                if (zzgbvVar2.zzn() > 0) {
                                    zzgbv zzgbvVar7 = this.zzg;
                                    if (zzgbvVar7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar7 = null;
                                    }
                                    List zzm = zzgbvVar7.zzm();
                                    Intrinsics.checkNotNullExpressionValue(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    Object last2 = CollectionsKt.last((List<? extends Object>) zzm);
                                    Intrinsics.checkNotNullExpressionValue(last2, "last(...)");
                                    long longValue2 = j - ((Number) last2).longValue();
                                    zzgbv zzgbvVar8 = this.zzg;
                                    if (zzgbvVar8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgbvVar8 = null;
                                    }
                                    zzgbvVar8.zzh(zzgbvVar8.zzg() + longValue2);
                                }
                                zzgbvVar3 = this.zzg;
                                if (zzgbvVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar3 = null;
                                }
                                zzgbvVar3.zzp(j);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgdgVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzh) {
                        return Unit.INSTANCE;
                    }
                    this.zzh = false;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    Mutex mutex3 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgdgVar.zza = mutex3;
                    zzgdgVar.zzb = currentTimeMillis;
                    zzgdgVar.zze = 2;
                    if (mutex3.lock(null, zzgdgVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        j = currentTimeMillis;
                        zzgbvVar = this.zzg;
                        if (zzgbvVar == null) {
                        }
                        if (zzgbvVar.zzr() > 0) {
                        }
                        zzgbvVar2 = this.zzg;
                        if (zzgbvVar2 == null) {
                        }
                        if (zzgbvVar2.zzn() > 0) {
                        }
                        zzgbvVar3 = this.zzg;
                        if (zzgbvVar3 == null) {
                        }
                        zzgbvVar3.zzp(j);
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzh) {
            }
        } finally {
        }
        zzgdgVar = new zzgdg(this, continuation);
        Object obj2 = zzgdgVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgdgVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f6, code lost:
    
        if (zzz(r14, r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:52:0x0066, B:54:0x006a, B:58:0x0071), top: B:51:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzw(Continuation continuation) {
        zzgda zzgdaVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgbv zzgbvVar;
        zzgbv zzgbvVar2;
        zzgbv zzgbvVar3;
        zzgbv zzgbvVar4;
        zzgbv zzgbvVar5;
        zzgbw zzgbwVar;
        try {
            if (continuation instanceof zzgda) {
                zzgdaVar = (zzgda) continuation;
                int i2 = zzgdaVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgdaVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgdaVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgdaVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgdaVar.zza = mutex;
                        zzgdaVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzgbwVar = (zzgbw) zzgdaVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgbwVar)) {
                                    String zza = zzgbwVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgdaVar.zza = null;
                                    zzgdaVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            j = zzgdaVar.zzb;
                            mutex2 = (Mutex) zzgdaVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgbvVar = this.zzg;
                                if (zzgbvVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar = null;
                                }
                                zzgbvVar2 = this.zzg;
                                if (zzgbvVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar2 = null;
                                }
                                long zzi = j - zzgbvVar2.zzi();
                                zzgbvVar3 = this.zzg;
                                if (zzgbvVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar3 = null;
                                }
                                zzgbvVar.zzb(zzi - zzgbvVar3.zzg());
                                zzgbvVar4 = this.zzg;
                                if (zzgbvVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar4 = null;
                                }
                                zzgbvVar4.zzl(j);
                                zzgbvVar5 = this.zzg;
                                if (zzgbvVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar5 = null;
                                }
                                zzgbw zzgbwVar2 = (zzgbw) zzgbvVar5.zzbu();
                                mutex.unlock(null);
                                Intrinsics.checkNotNull(zzgbwVar2);
                                zzgdaVar.zza = zzgbwVar2;
                                zzgdaVar.zze = 3;
                                if (zzC(zzgdaVar) != coroutine_suspended) {
                                    zzgbwVar = zzgbwVar2;
                                    if (this.zzj.zza(zzgbwVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgdaVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = false;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgdaVar.zza = mutex2;
                    zzgdaVar.zzb = currentTimeMillis;
                    zzgdaVar.zze = 2;
                    if (mutex2.lock(null, zzgdaVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgbvVar = this.zzg;
                        if (zzgbvVar == null) {
                        }
                        zzgbvVar2 = this.zzg;
                        if (zzgbvVar2 == null) {
                        }
                        long zzi2 = j - zzgbvVar2.zzi();
                        zzgbvVar3 = this.zzg;
                        if (zzgbvVar3 == null) {
                        }
                        zzgbvVar.zzb(zzi2 - zzgbvVar3.zzg());
                        zzgbvVar4 = this.zzg;
                        if (zzgbvVar4 == null) {
                        }
                        zzgbvVar4.zzl(j);
                        zzgbvVar5 = this.zzg;
                        if (zzgbvVar5 == null) {
                        }
                        zzgbw zzgbwVar22 = (zzgbw) zzgbvVar5.zzbu();
                        mutex.unlock(null);
                        Intrinsics.checkNotNull(zzgbwVar22);
                        zzgdaVar.zza = zzgbwVar22;
                        zzgdaVar.zze = 3;
                        if (zzC(zzgdaVar) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzf) {
            }
        } finally {
        }
        zzgdaVar = new zzgda(this, continuation);
        Object obj2 = zzgdaVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgdaVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (zzz(r15, r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0088, code lost:
    
        if (r2.lock(null, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #1 {all -> 0x010b, blocks: (B:55:0x0066, B:57:0x006a, B:61:0x0071), top: B:54:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzx(Continuation continuation) {
        zzgde zzgdeVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long currentTimeMillis;
        zzgbw zzgbwVar;
        try {
            if (continuation instanceof zzgde) {
                zzgdeVar = (zzgde) continuation;
                int i2 = zzgdeVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgdeVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgdeVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgdeVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgdeVar.zza = mutex;
                        zzgdeVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzgbwVar = (zzgbw) zzgdeVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgbwVar)) {
                                    String zza = zzgbwVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgdeVar.zza = null;
                                    zzgdeVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            currentTimeMillis = zzgdeVar.zzb;
                            mutex2 = (Mutex) zzgdeVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgbv zzgbvVar = this.zzg;
                                if (zzgbvVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar = null;
                                }
                                zzgbv zzgbvVar2 = this.zzg;
                                if (zzgbvVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar2 = null;
                                }
                                long zzi = currentTimeMillis - zzgbvVar2.zzi();
                                zzgbv zzgbvVar3 = this.zzg;
                                if (zzgbvVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar3 = null;
                                }
                                zzgbvVar.zzb(zzi - zzgbvVar3.zzg());
                                zzgbv zzgbvVar4 = this.zzg;
                                if (zzgbvVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar4 = null;
                                }
                                zzgbvVar4.zzk(currentTimeMillis);
                                zzgbv zzgbvVar5 = this.zzg;
                                if (zzgbvVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar5 = null;
                                }
                                zzgbvVar5.zze(true);
                                zzgbv zzgbvVar6 = this.zzg;
                                if (zzgbvVar6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgbvVar6 = null;
                                }
                                zzgbw zzgbwVar2 = (zzgbw) zzgbvVar6.zzbu();
                                mutex2.unlock(null);
                                Intrinsics.checkNotNull(zzgbwVar2);
                                zzgdeVar.zza = zzgbwVar2;
                                zzgdeVar.zze = 3;
                                if (zzC(zzgdeVar) != coroutine_suspended) {
                                    zzgbwVar = zzgbwVar2;
                                    if (this.zzj.zza(zzgbwVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgdeVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = false;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    mutex2 = this.zzc;
                    currentTimeMillis = System.currentTimeMillis();
                    zzgdeVar.zza = mutex2;
                    zzgdeVar.zzb = currentTimeMillis;
                    zzgdeVar.zze = 2;
                }
            }
            if (this.zzf) {
            }
        } finally {
        }
        zzgdeVar = new zzgde(this, continuation);
        Object obj2 = zzgdeVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgdeVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x0059), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzy(Continuation continuation) {
        zzgcy zzgcyVar;
        int i;
        Mutex mutex;
        long j;
        zzgbv zzgbvVar;
        try {
            if (continuation instanceof zzgcy) {
                zzgcyVar = (zzgcy) continuation;
                int i2 = zzgcyVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcyVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcyVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcyVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzgcyVar.zzb = mutex2;
                        zzgcyVar.zza = currentTimeMillis;
                        zzgcyVar.zze = 1;
                        if (mutex2.lock(null, zzgcyVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgcyVar.zza;
                        mutex = (Mutex) zzgcyVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgbvVar = this.zzg;
                    if (zzgbvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgbvVar = null;
                    }
                    zzgbvVar.zzs(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzgbvVar = this.zzg;
            if (zzgbvVar == null) {
            }
            zzgbvVar.zzs(j);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgcyVar = new zzgcy(this, continuation);
        Object obj2 = zzgcyVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcyVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r9.lock(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzz(String str, Continuation continuation) {
        zzgcm zzgcmVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object updateData;
        try {
            if (continuation instanceof zzgcm) {
                zzgcmVar = (zzgcm) continuation;
                int i2 = zzgcmVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcmVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgcmVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcmVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgcmVar.zza = str;
                        zzgcmVar.zzb = mutex;
                        zzgcmVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzgcmVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzgcmVar.zzb;
                        String str2 = (String) zzgcmVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    DataStore dataStore = this.zzi;
                    zzgcn zzgcnVar = new zzgcn(str, null);
                    zzgcmVar.zza = mutex;
                    zzgcmVar.zzb = null;
                    zzgcmVar.zze = 2;
                    updateData = dataStore.updateData(zzgcnVar, zzgcmVar);
                    if (updateData != coroutine_suspended) {
                        Mutex mutex4 = mutex;
                        obj = updateData;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzi;
            zzgcn zzgcnVar2 = new zzgcn(str, null);
            zzgcmVar.zza = mutex;
            zzgcmVar.zzb = null;
            zzgcmVar.zze = 2;
            updateData = dataStore2.updateData(zzgcnVar2, zzgcmVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        zzgcmVar = new zzgcm(this, continuation);
        Object obj2 = zzgcmVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcmVar.zze;
        if (i != 0) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgdb(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        zzgtp.zza(this.zza, this.zzb, new zzgcv(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzc() {
        zzgtp.zza(this.zza, this.zzb, new zzgcr(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzd() {
        zzgtp.zza(this.zza, this.zzb, new zzgdf(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zze() {
        zzgtp.zza(this.zza, this.zzb, new zzgcz(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzf() {
        zzgtp.zza(this.zza, this.zzb, new zzgdd(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzg() {
        zzgtp.zza(this.zza, this.zzb, new zzgcx(this, null));
    }
}
