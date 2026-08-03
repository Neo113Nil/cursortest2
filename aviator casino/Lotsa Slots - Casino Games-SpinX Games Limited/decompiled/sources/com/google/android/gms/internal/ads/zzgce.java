package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgce implements com.google.android.gms.internal.ads.zzgau {
    private final kotlinx.coroutines.CoroutineScope zza;
    private final com.google.android.gms.internal.ads.zzgsm zzb;
    private final kotlinx.coroutines.sync.Mutex zzc;
    private final kotlinx.coroutines.sync.Mutex zzd;
    private final kotlinx.coroutines.sync.Mutex zze;
    private boolean zzf;
    private com.google.android.gms.internal.ads.zzgas zzg;
    private boolean zzh;
    private final androidx.datastore.core.DataStore zzi;
    private final com.google.android.gms.internal.ads.zzdww zzj;

    public zzgce(androidx.datastore.core.DataStore adQualityDataStore, com.google.android.gms.internal.ads.zzgbg coroutineScopeProvider, com.google.android.gms.internal.ads.zzdww dataPinger, com.google.android.gms.internal.ads.zzgbd clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new com.google.android.gms.internal.ads.zzgsm();
        this.zzc = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.zzd = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.zze = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
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
    public final java.lang.Object zzA(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbm zzgbmVar;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        java.lang.Object updateData;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbm) {
                zzgbmVar = (com.google.android.gms.internal.ads.zzgbm) continuation;
                int i2 = zzgbmVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbmVar.zzd = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbmVar.zzb;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbmVar.zzd;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgbmVar.zza = mutex;
                        zzgbmVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) zzgbmVar.zza;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) zzgbmVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    androidx.datastore.core.DataStore dataStore = this.zzi;
                    com.google.android.gms.internal.ads.zzgbn zzgbnVar = new com.google.android.gms.internal.ads.zzgbn(null);
                    zzgbmVar.zza = mutex;
                    zzgbmVar.zzd = 2;
                    updateData = dataStore.updateData(zzgbnVar, zzgbmVar);
                    if (updateData != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = updateData;
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            androidx.datastore.core.DataStore dataStore2 = this.zzi;
            com.google.android.gms.internal.ads.zzgbn zzgbnVar2 = new com.google.android.gms.internal.ads.zzgbn(null);
            zzgbmVar.zza = mutex;
            zzgbmVar.zzd = 2;
            updateData = dataStore2.updateData(zzgbnVar2, zzgbmVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        zzgbmVar = new com.google.android.gms.internal.ads.zzgbm(this, continuation);
        java.lang.Object obj2 = zzgbmVar.zzb;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbmVar.zzd;
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
    public final java.lang.Object zzB(long j, kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbl zzgblVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.google.android.gms.internal.ads.zzgas zzgasVar;
        com.google.android.gms.internal.ads.zzgas zzgasVar2;
        com.google.android.gms.internal.ads.zzgas zzgasVar3;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbl) {
                zzgblVar = (com.google.android.gms.internal.ads.zzgbl) continuation;
                int i2 = zzgblVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgblVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgblVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgblVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.zzc;
                        zzgblVar.zzb = mutex2;
                        zzgblVar.zza = j;
                        zzgblVar.zze = 1;
                        if (mutex2.lock(null, zzgblVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgblVar.zza;
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgblVar.zzb;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    zzgasVar = this.zzg;
                    if (zzgasVar == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgasVar = null;
                    }
                    zzgasVar2 = this.zzg;
                    if (zzgasVar2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgasVar2 = null;
                    }
                    long zzi = j - zzgasVar2.zzi();
                    zzgasVar3 = this.zzg;
                    if (zzgasVar3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgasVar3 = null;
                    }
                    zzgasVar.zzb(zzi - zzgasVar3.zzg());
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            zzgasVar = this.zzg;
            if (zzgasVar == null) {
            }
            zzgasVar2 = this.zzg;
            if (zzgasVar2 == null) {
            }
            long zzi2 = j - zzgasVar2.zzi();
            zzgasVar3 = this.zzg;
            if (zzgasVar3 == null) {
            }
            zzgasVar.zzb(zzi2 - zzgasVar3.zzg());
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgblVar = new com.google.android.gms.internal.ads.zzgbl(this, continuation);
        java.lang.Object obj2 = zzgblVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgblVar.zze;
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
    public final java.lang.Object zzC(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbq zzgbqVar;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.google.android.gms.internal.ads.zzgas zzgasVar;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.google.android.gms.internal.ads.zzgat zzgatVar;
        kotlinx.coroutines.sync.Mutex mutex3;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbq) {
                zzgbqVar = (com.google.android.gms.internal.ads.zzgbq) continuation;
                int i2 = zzgbqVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbqVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbqVar.zzc;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbqVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgbqVar.zza = mutex;
                        zzgbqVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (kotlinx.coroutines.sync.Mutex) zzgbqVar.zza;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    mutex3.unlock(null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) zzgbqVar.zzb;
                            zzgatVar = (com.google.android.gms.internal.ads.zzgat) zzgbqVar.zza;
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                androidx.datastore.core.DataStore dataStore = this.zzi;
                                com.google.android.gms.internal.ads.zzgbr zzgbrVar = new com.google.android.gms.internal.ads.zzgbr(zzgatVar, null);
                                zzgbqVar.zza = mutex2;
                                zzgbqVar.zzb = null;
                                zzgbqVar.zze = 3;
                                obj = dataStore.updateData(zzgbrVar, zzgbqVar);
                                if (obj != coroutine_suspended) {
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    return kotlin.Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex3 = mutex2;
                                throw th;
                            }
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgbqVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    zzgasVar = this.zzg;
                    if (zzgasVar == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgasVar = null;
                    }
                    com.google.android.gms.internal.ads.zzgat zzgatVar2 = (com.google.android.gms.internal.ads.zzgat) zzgasVar.zzbu();
                    mutex.unlock(null);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzgatVar2);
                    mutex2 = this.zze;
                    zzgbqVar.zza = zzgatVar2;
                    zzgbqVar.zzb = mutex2;
                    zzgbqVar.zze = 2;
                    if (mutex2.lock(null, zzgbqVar) != coroutine_suspended) {
                        zzgatVar = zzgatVar2;
                        androidx.datastore.core.DataStore dataStore2 = this.zzi;
                        com.google.android.gms.internal.ads.zzgbr zzgbrVar2 = new com.google.android.gms.internal.ads.zzgbr(zzgatVar, null);
                        zzgbqVar.zza = mutex2;
                        zzgbqVar.zzb = null;
                        zzgbqVar.zze = 3;
                        obj = dataStore2.updateData(zzgbrVar2, zzgbqVar);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzgasVar = this.zzg;
            if (zzgasVar == null) {
            }
            com.google.android.gms.internal.ads.zzgat zzgatVar22 = (com.google.android.gms.internal.ads.zzgat) zzgasVar.zzbu();
            mutex.unlock(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzgatVar22);
            mutex2 = this.zze;
            zzgbqVar.zza = zzgatVar22;
            zzgbqVar.zzb = mutex2;
            zzgbqVar.zze = 2;
            if (mutex2.lock(null, zzgbqVar) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
            mutex.unlock(null);
        }
        zzgbqVar = new com.google.android.gms.internal.ads.zzgbq(this, continuation);
        java.lang.Object obj2 = zzgbqVar.zzc;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbqVar.zze;
        if (i != 0) {
        }
    }

    private static final boolean zzD(com.google.android.gms.internal.ads.zzgat zzgatVar) {
        boolean z;
        java.util.List zzk = zzgatVar.zzk();
        java.lang.Long l = zzk != null ? (java.lang.Long) kotlin.collections.CollectionsKt.lastOrNull(zzk) : null;
        boolean z2 = zzgatVar.zzl() > zzgatVar.zzm() && !zzgatVar.zzd();
        if (l != null) {
            if (zzgatVar.zzi() - l.longValue() > 5000) {
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
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgce] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object zzs(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbz zzgbzVar;
        ?? r2;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbz) {
                zzgbzVar = (com.google.android.gms.internal.ads.zzgbz) continuation;
                int i = zzgbzVar.zzd;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzgbzVar.zzd = i - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbzVar.zzb;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzgbzVar.zzd;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.zze;
                        zzgbzVar.zza = mutex2;
                        zzgbzVar.zzd = 1;
                        if (mutex2.lock(null, zzgbzVar) != coroutine_suspended) {
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) zzgbzVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) zzgbzVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r2 = mutex4;
                        com.google.android.gms.internal.ads.zzgax zzgaxVar = (com.google.android.gms.internal.ads.zzgax) obj;
                        if (zzgaxVar == null || zzgaxVar.zza() == 0) {
                            return kotlin.Unit.INSTANCE;
                        }
                        for (java.util.Map.Entry entry : zzgaxVar.zzb().entrySet()) {
                            com.google.android.gms.internal.ads.zzidy zzcc = ((com.google.android.gms.internal.ads.zzgat) entry.getValue()).zzcc();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                            com.google.android.gms.internal.ads.zzgas zzgasVar = (com.google.android.gms.internal.ads.zzgas) zzcc;
                            java.lang.Object value = entry.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            if (zzD((com.google.android.gms.internal.ads.zzgat) value)) {
                                zzgasVar.zzf(true);
                            }
                            com.google.android.gms.internal.ads.zzdww zzdwwVar = this.zzj;
                            com.google.android.gms.internal.ads.zziee zzbu = zzgasVar.zzbu();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
                            zzdwwVar.zza((com.google.android.gms.internal.ads.zzgat) zzbu);
                        }
                        zzgbzVar.zza = null;
                        zzgbzVar.zzd = 3;
                    }
                    kotlinx.coroutines.flow.Flow data = this.zzi.getData();
                    zzgbzVar.zza = mutex;
                    zzgbzVar.zzd = 2;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(data, zzgbzVar);
                    r2 = mutex;
                }
            }
            if (r2 != 0) {
            }
            kotlinx.coroutines.flow.Flow data2 = this.zzi.getData();
            zzgbzVar.zza = mutex;
            zzgbzVar.zzd = 2;
            obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(data2, zzgbzVar);
            r2 = mutex;
        } finally {
            r2.unlock(null);
        }
        zzgbzVar = new com.google.android.gms.internal.ads.zzgbz(this, continuation);
        java.lang.Object obj2 = zzgbzVar.zzb;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzgbzVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object zzt(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbt zzgbtVar;
        int i;
        java.lang.String str2;
        kotlinx.coroutines.sync.Mutex mutex;
        long j;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbt) {
                zzgbtVar = (com.google.android.gms.internal.ads.zzgbt) continuation;
                int i2 = zzgbtVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbtVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbtVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbtVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.zzc;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        zzgbtVar.zzf = str;
                        zzgbtVar.zza = mutex2;
                        zzgbtVar.zzb = currentTimeMillis;
                        zzgbtVar.zze = 1;
                        if (mutex2.lock(null, zzgbtVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgbtVar.zzb;
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgbtVar.zza;
                        str2 = zzgbtVar.zzf;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (!this.zzf) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.zzf = true;
                    com.google.android.gms.internal.ads.zzidy zzcc = com.google.android.gms.internal.ads.zzgat.zzp().zzcc();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                    com.google.android.gms.internal.ads.zzgas zzgasVar = (com.google.android.gms.internal.ads.zzgas) zzcc;
                    this.zzg = zzgasVar;
                    if (zzgasVar == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgasVar = null;
                    }
                    zzgasVar.zza(str2);
                    zzgasVar.zzj(j);
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (!this.zzf) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgbtVar = new com.google.android.gms.internal.ads.zzgbt(this, continuation);
        java.lang.Object obj2 = zzgbtVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbtVar.zze;
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
    public final java.lang.Object zzu(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbp zzgbpVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        long j;
        com.google.android.gms.internal.ads.zzgas zzgasVar;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbp) {
                zzgbpVar = (com.google.android.gms.internal.ads.zzgbp) continuation;
                int i2 = zzgbpVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbpVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbpVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbpVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgbpVar.zza = mutex;
                        zzgbpVar.zze = 1;
                    } else if (i == 1) {
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgbpVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        j = zzgbpVar.zzb;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) zzgbpVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            zzgasVar = this.zzg;
                            if (zzgasVar == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzgasVar = null;
                            }
                            zzgasVar.zzo(j);
                            mutex.unlock(null);
                            zzgbpVar.zza = null;
                            zzgbpVar.zze = 3;
                        } finally {
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        zzgbpVar.zze = 4;
                    }
                    if (!this.zzh) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.zzh = true;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    zzgbpVar.zza = mutex2;
                    zzgbpVar.zzb = currentTimeMillis;
                    zzgbpVar.zze = 2;
                    if (mutex2.lock(null, zzgbpVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgasVar = this.zzg;
                        if (zzgasVar == null) {
                        }
                        zzgasVar.zzo(j);
                        mutex.unlock(null);
                        zzgbpVar.zza = null;
                        zzgbpVar.zze = 3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.zzh) {
            }
        } finally {
        }
        zzgbpVar = new com.google.android.gms.internal.ads.zzgbp(this, continuation);
        java.lang.Object obj2 = zzgbpVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbpVar.zze;
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
    public final java.lang.Object zzv(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgcd zzgcdVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        long j;
        com.google.android.gms.internal.ads.zzgas zzgasVar;
        com.google.android.gms.internal.ads.zzgas zzgasVar2;
        com.google.android.gms.internal.ads.zzgas zzgasVar3;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgcd) {
                zzgcdVar = (com.google.android.gms.internal.ads.zzgcd) continuation;
                int i2 = zzgcdVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcdVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgcdVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcdVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgcdVar.zza = mutex;
                        zzgcdVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = zzgcdVar.zzb;
                            mutex2 = (kotlinx.coroutines.sync.Mutex) zzgcdVar.zza;
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                zzgasVar = this.zzg;
                                if (zzgasVar == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar = null;
                                }
                                if (zzgasVar.zzr() > 0) {
                                    com.google.android.gms.internal.ads.zzgas zzgasVar4 = this.zzg;
                                    if (zzgasVar4 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgasVar4 = null;
                                    }
                                    java.util.List zzq = zzgasVar4.zzq();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzq, "getAdClickTimestampsMsList(...)");
                                    java.lang.Object last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) zzq);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                                    long longValue = j - ((java.lang.Number) last).longValue();
                                    com.google.android.gms.internal.ads.zzgas zzgasVar5 = this.zzg;
                                    if (zzgasVar5 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgasVar5 = null;
                                    }
                                    zzgasVar5.zzt();
                                    if (longValue < 5000) {
                                        com.google.android.gms.internal.ads.zzgas zzgasVar6 = this.zzg;
                                        if (zzgasVar6 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                            zzgasVar6 = null;
                                        }
                                        zzgasVar6.zzd(zzgasVar6.zzc() + 1);
                                    }
                                }
                                zzgasVar2 = this.zzg;
                                if (zzgasVar2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar2 = null;
                                }
                                if (zzgasVar2.zzn() > 0) {
                                    com.google.android.gms.internal.ads.zzgas zzgasVar7 = this.zzg;
                                    if (zzgasVar7 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgasVar7 = null;
                                    }
                                    java.util.List zzm = zzgasVar7.zzm();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    java.lang.Object last2 = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) zzm);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(last2, "last(...)");
                                    long longValue2 = j - ((java.lang.Number) last2).longValue();
                                    com.google.android.gms.internal.ads.zzgas zzgasVar8 = this.zzg;
                                    if (zzgasVar8 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgasVar8 = null;
                                    }
                                    zzgasVar8.zzh(zzgasVar8.zzg() + longValue2);
                                }
                                zzgasVar3 = this.zzg;
                                if (zzgasVar3 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar3 = null;
                                }
                                zzgasVar3.zzp(j);
                                mutex2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } finally {
                            }
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgcdVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzh) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.zzh = false;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex2.unlock(null);
                    kotlinx.coroutines.sync.Mutex mutex3 = this.zzc;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    zzgcdVar.zza = mutex3;
                    zzgcdVar.zzb = currentTimeMillis;
                    zzgcdVar.zze = 2;
                    if (mutex3.lock(null, zzgcdVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        j = currentTimeMillis;
                        zzgasVar = this.zzg;
                        if (zzgasVar == null) {
                        }
                        if (zzgasVar.zzr() > 0) {
                        }
                        zzgasVar2 = this.zzg;
                        if (zzgasVar2 == null) {
                        }
                        if (zzgasVar2.zzn() > 0) {
                        }
                        zzgasVar3 = this.zzg;
                        if (zzgasVar3 == null) {
                        }
                        zzgasVar3.zzp(j);
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzh) {
            }
        } finally {
        }
        zzgcdVar = new com.google.android.gms.internal.ads.zzgcd(this, continuation);
        java.lang.Object obj2 = zzgcdVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcdVar.zze;
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
    public final java.lang.Object zzw(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbx zzgbxVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        long j;
        com.google.android.gms.internal.ads.zzgas zzgasVar;
        com.google.android.gms.internal.ads.zzgas zzgasVar2;
        com.google.android.gms.internal.ads.zzgas zzgasVar3;
        com.google.android.gms.internal.ads.zzgas zzgasVar4;
        com.google.android.gms.internal.ads.zzgas zzgasVar5;
        com.google.android.gms.internal.ads.zzgat zzgatVar;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbx) {
                zzgbxVar = (com.google.android.gms.internal.ads.zzgbx) continuation;
                int i2 = zzgbxVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbxVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbxVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbxVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgbxVar.zza = mutex;
                        zzgbxVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    return kotlin.Unit.INSTANCE;
                                }
                                zzgatVar = (com.google.android.gms.internal.ads.zzgat) zzgbxVar.zza;
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgatVar)) {
                                    java.lang.String zza = zzgatVar.zza();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgbxVar.zza = null;
                                    zzgbxVar.zze = 4;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            j = zzgbxVar.zzb;
                            mutex2 = (kotlinx.coroutines.sync.Mutex) zzgbxVar.zza;
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                zzgasVar = this.zzg;
                                if (zzgasVar == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar = null;
                                }
                                zzgasVar2 = this.zzg;
                                if (zzgasVar2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar2 = null;
                                }
                                long zzi = j - zzgasVar2.zzi();
                                zzgasVar3 = this.zzg;
                                if (zzgasVar3 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar3 = null;
                                }
                                zzgasVar.zzb(zzi - zzgasVar3.zzg());
                                zzgasVar4 = this.zzg;
                                if (zzgasVar4 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar4 = null;
                                }
                                zzgasVar4.zzl(j);
                                zzgasVar5 = this.zzg;
                                if (zzgasVar5 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar5 = null;
                                }
                                com.google.android.gms.internal.ads.zzgat zzgatVar2 = (com.google.android.gms.internal.ads.zzgat) zzgasVar5.zzbu();
                                mutex.unlock(null);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(zzgatVar2);
                                zzgbxVar.zza = zzgatVar2;
                                zzgbxVar.zze = 3;
                                if (zzC(zzgbxVar) != coroutine_suspended) {
                                    zzgatVar = zzgatVar2;
                                    if (this.zzj.zza(zzgatVar)) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgbxVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.zzf = false;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    zzgbxVar.zza = mutex2;
                    zzgbxVar.zzb = currentTimeMillis;
                    zzgbxVar.zze = 2;
                    if (mutex2.lock(null, zzgbxVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgasVar = this.zzg;
                        if (zzgasVar == null) {
                        }
                        zzgasVar2 = this.zzg;
                        if (zzgasVar2 == null) {
                        }
                        long zzi2 = j - zzgasVar2.zzi();
                        zzgasVar3 = this.zzg;
                        if (zzgasVar3 == null) {
                        }
                        zzgasVar.zzb(zzi2 - zzgasVar3.zzg());
                        zzgasVar4 = this.zzg;
                        if (zzgasVar4 == null) {
                        }
                        zzgasVar4.zzl(j);
                        zzgasVar5 = this.zzg;
                        if (zzgasVar5 == null) {
                        }
                        com.google.android.gms.internal.ads.zzgat zzgatVar22 = (com.google.android.gms.internal.ads.zzgat) zzgasVar5.zzbu();
                        mutex.unlock(null);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzgatVar22);
                        zzgbxVar.zza = zzgatVar22;
                        zzgbxVar.zze = 3;
                        if (zzC(zzgbxVar) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzf) {
            }
        } finally {
        }
        zzgbxVar = new com.google.android.gms.internal.ads.zzgbx(this, continuation);
        java.lang.Object obj2 = zzgbxVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbxVar.zze;
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
    public final java.lang.Object zzx(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgcb zzgcbVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        long currentTimeMillis;
        com.google.android.gms.internal.ads.zzgat zzgatVar;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgcb) {
                zzgcbVar = (com.google.android.gms.internal.ads.zzgcb) continuation;
                int i2 = zzgcbVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgcbVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgcbVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgcbVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgcbVar.zza = mutex;
                        zzgcbVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    return kotlin.Unit.INSTANCE;
                                }
                                zzgatVar = (com.google.android.gms.internal.ads.zzgat) zzgcbVar.zza;
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgatVar)) {
                                    java.lang.String zza = zzgatVar.zza();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgcbVar.zza = null;
                                    zzgcbVar.zze = 4;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            currentTimeMillis = zzgcbVar.zzb;
                            mutex2 = (kotlinx.coroutines.sync.Mutex) zzgcbVar.zza;
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                com.google.android.gms.internal.ads.zzgas zzgasVar = this.zzg;
                                if (zzgasVar == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar = null;
                                }
                                com.google.android.gms.internal.ads.zzgas zzgasVar2 = this.zzg;
                                if (zzgasVar2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar2 = null;
                                }
                                long zzi = currentTimeMillis - zzgasVar2.zzi();
                                com.google.android.gms.internal.ads.zzgas zzgasVar3 = this.zzg;
                                if (zzgasVar3 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar3 = null;
                                }
                                zzgasVar.zzb(zzi - zzgasVar3.zzg());
                                com.google.android.gms.internal.ads.zzgas zzgasVar4 = this.zzg;
                                if (zzgasVar4 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar4 = null;
                                }
                                zzgasVar4.zzk(currentTimeMillis);
                                com.google.android.gms.internal.ads.zzgas zzgasVar5 = this.zzg;
                                if (zzgasVar5 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar5 = null;
                                }
                                zzgasVar5.zze(true);
                                com.google.android.gms.internal.ads.zzgas zzgasVar6 = this.zzg;
                                if (zzgasVar6 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgasVar6 = null;
                                }
                                com.google.android.gms.internal.ads.zzgat zzgatVar2 = (com.google.android.gms.internal.ads.zzgat) zzgasVar6.zzbu();
                                mutex2.unlock(null);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(zzgatVar2);
                                zzgcbVar.zza = zzgatVar2;
                                zzgcbVar.zze = 3;
                                if (zzC(zzgcbVar) != coroutine_suspended) {
                                    zzgatVar = zzgatVar2;
                                    if (this.zzj.zza(zzgatVar)) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgcbVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.zzf = false;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex2.unlock(null);
                    mutex2 = this.zzc;
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    zzgcbVar.zza = mutex2;
                    zzgcbVar.zzb = currentTimeMillis;
                    zzgcbVar.zze = 2;
                }
            }
            if (this.zzf) {
            }
        } finally {
        }
        zzgcbVar = new com.google.android.gms.internal.ads.zzgcb(this, continuation);
        java.lang.Object obj2 = zzgcbVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgcbVar.zze;
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
    public final java.lang.Object zzy(kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbv zzgbvVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        long j;
        com.google.android.gms.internal.ads.zzgas zzgasVar;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbv) {
                zzgbvVar = (com.google.android.gms.internal.ads.zzgbv) continuation;
                int i2 = zzgbvVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbvVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbvVar.zzc;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbvVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.zzc;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        zzgbvVar.zzb = mutex2;
                        zzgbvVar.zza = currentTimeMillis;
                        zzgbvVar.zze = 1;
                        if (mutex2.lock(null, zzgbvVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgbvVar.zza;
                        mutex = (kotlinx.coroutines.sync.Mutex) zzgbvVar.zzb;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    zzgasVar = this.zzg;
                    if (zzgasVar == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgasVar = null;
                    }
                    zzgasVar.zzs(j);
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            zzgasVar = this.zzg;
            if (zzgasVar == null) {
            }
            zzgasVar.zzs(j);
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgbvVar = new com.google.android.gms.internal.ads.zzgbv(this, continuation);
        java.lang.Object obj2 = zzgbvVar.zzc;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbvVar.zze;
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
    public final java.lang.Object zzz(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.google.android.gms.internal.ads.zzgbj zzgbjVar;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object updateData;
        try {
            if (continuation instanceof com.google.android.gms.internal.ads.zzgbj) {
                zzgbjVar = (com.google.android.gms.internal.ads.zzgbj) continuation;
                int i2 = zzgbjVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbjVar.zze = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = zzgbjVar.zzc;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbjVar.zze;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgbjVar.zza = str;
                        zzgbjVar.zzb = mutex;
                        zzgbjVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) zzgbjVar.zza;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) zzgbjVar.zzb;
                        java.lang.String str2 = (java.lang.String) zzgbjVar.zza;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    androidx.datastore.core.DataStore dataStore = this.zzi;
                    com.google.android.gms.internal.ads.zzgbk zzgbkVar = new com.google.android.gms.internal.ads.zzgbk(str, null);
                    zzgbjVar.zza = mutex;
                    zzgbjVar.zzb = null;
                    zzgbjVar.zze = 2;
                    updateData = dataStore.updateData(zzgbkVar, zzgbjVar);
                    if (updateData != coroutine_suspended) {
                        kotlinx.coroutines.sync.Mutex mutex4 = mutex;
                        obj = updateData;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            androidx.datastore.core.DataStore dataStore2 = this.zzi;
            com.google.android.gms.internal.ads.zzgbk zzgbkVar2 = new com.google.android.gms.internal.ads.zzgbk(str, null);
            zzgbjVar.zza = mutex;
            zzgbjVar.zzb = null;
            zzgbjVar.zze = 2;
            updateData = dataStore2.updateData(zzgbkVar2, zzgbjVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.sync.Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        zzgbjVar = new com.google.android.gms.internal.ads.zzgbj(this, continuation);
        java.lang.Object obj2 = zzgbjVar.zzc;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbjVar.zze;
        if (i != 0) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zza() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new com.google.android.gms.internal.ads.zzgby(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzb(java.lang.String gwsQueryId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        com.google.android.gms.internal.ads.zzgsp.zza(this.zza, this.zzb, new com.google.android.gms.internal.ads.zzgbs(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzc() {
        com.google.android.gms.internal.ads.zzgsp.zza(this.zza, this.zzb, new com.google.android.gms.internal.ads.zzgbo(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzd() {
        com.google.android.gms.internal.ads.zzgsp.zza(this.zza, this.zzb, new com.google.android.gms.internal.ads.zzgcc(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zze() {
        com.google.android.gms.internal.ads.zzgsp.zza(this.zza, this.zzb, new com.google.android.gms.internal.ads.zzgbw(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzf() {
        com.google.android.gms.internal.ads.zzgsp.zza(this.zza, this.zzb, new com.google.android.gms.internal.ads.zzgca(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzg() {
        com.google.android.gms.internal.ads.zzgsp.zza(this.zza, this.zzb, new com.google.android.gms.internal.ads.zzgbu(this, null));
    }
}
