package com.inmobi.media;

/* renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2879xb {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.sync.Mutex[] f5548a;
    public final java.util.LinkedHashMap b;

    public C2879xb() {
        kotlinx.coroutines.sync.Mutex[] mutexArr = new kotlinx.coroutines.sync.Mutex[16];
        for (int i = 0; i < 16; i++) {
            mutexArr[i] = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        }
        this.f5548a = mutexArr;
        this.b = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r11.lock(null, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:26:0x0070, B:28:0x0078), top: B:25:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v9, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.inmobi.media.yo yoVar, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2827vb c2827vb;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.inmobi.media.yo yoVar2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object obj;
        java.lang.String str2;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2827vb) {
                c2827vb = (com.inmobi.media.C2827vb) continuationImpl;
                int i2 = c2827vb.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2827vb.f = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj2 = c2827vb.d;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2827vb.f;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        mutex = this.f5548a[kotlin.UByte$$ExternalSyntheticBackport0.m(str != null ? str.hashCode() : 0, 16)];
                        c2827vb.f5507a = str;
                        c2827vb.b = yoVar;
                        c2827vb.c = mutex;
                        c2827vb.f = 1;
                        yoVar2 = yoVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) c2827vb.b;
                            str2 = c2827vb.f5507a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                this.b.put(str2, obj2);
                                obj = obj2;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return obj;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = c2827vb.c;
                        ?? r10 = (kotlin.jvm.functions.Function1) c2827vb.b;
                        java.lang.String str3 = c2827vb.f5507a;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        mutex = mutex3;
                        str = str3;
                        yoVar2 = r10;
                    }
                    obj = this.b.get(str);
                    if (obj == null) {
                        c2827vb.f5507a = str;
                        c2827vb.b = mutex;
                        c2827vb.c = null;
                        c2827vb.f = 2;
                        java.lang.Object invoke = yoVar2.invoke(c2827vb);
                        if (invoke != coroutine_suspended) {
                            str2 = str;
                            mutex2 = mutex;
                            obj2 = invoke;
                            this.b.put(str2, obj2);
                            obj = obj2;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    mutex.unlock(null);
                    return obj;
                }
            }
            obj = this.b.get(str);
            if (obj == null) {
            }
            mutex.unlock(null);
            return obj;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        c2827vb = new com.inmobi.media.C2827vb(this, continuationImpl);
        java.lang.Object obj22 = c2827vb.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2827vb.f;
        if (i != 0) {
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2853wb c2853wb;
        int i;
        java.lang.String str2;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2853wb) {
                c2853wb = (com.inmobi.media.C2853wb) continuationImpl;
                int i2 = c2853wb.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2853wb.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2853wb.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2853wb.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f5548a[kotlin.UByte$$ExternalSyntheticBackport0.m(str != null ? str.hashCode() : 0, 16)];
                        c2853wb.f5526a = str;
                        c2853wb.b = mutex2;
                        c2853wb.e = 1;
                        if (mutex2.lock(null, c2853wb) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c2853wb.b;
                        str2 = c2853wb.f5526a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.b.remove(str2);
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            this.b.remove(str2);
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c2853wb = new com.inmobi.media.C2853wb(this, continuationImpl);
        java.lang.Object obj2 = c2853wb.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2853wb.e;
        if (i != 0) {
        }
    }
}
