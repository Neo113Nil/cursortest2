package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3991pc {

    /* renamed from: a, reason: collision with root package name */
    public final Mutex[] f7303a;
    public final LinkedHashMap b;

    public C3991pc() {
        Mutex[] mutexArr = new Mutex[16];
        for (int i = 0; i < 16; i++) {
            mutexArr[i] = MutexKt.Mutex$default(false, 1, null);
        }
        this.f7303a = mutexArr;
        this.b = new LinkedHashMap();
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
    public final Object a(String str, vq vqVar, ContinuationImpl continuationImpl) {
        C3934nc c3934nc;
        int i;
        Mutex mutex;
        vq vqVar2;
        Mutex mutex2;
        Object obj;
        String str2;
        try {
            if (continuationImpl instanceof C3934nc) {
                c3934nc = (C3934nc) continuationImpl;
                int i2 = c3934nc.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3934nc.f = i2 - Integer.MIN_VALUE;
                    Object obj2 = c3934nc.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3934nc.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.f7303a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                        c3934nc.f7264a = str;
                        c3934nc.b = vqVar;
                        c3934nc.c = mutex;
                        c3934nc.f = 1;
                        vqVar2 = vqVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) c3934nc.b;
                            str2 = c3934nc.f7264a;
                            try {
                                ResultKt.throwOnFailure(obj2);
                                this.b.put(str2, obj2);
                                obj = obj2;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = c3934nc.c;
                        ?? r10 = (Function1) c3934nc.b;
                        String str3 = c3934nc.f7264a;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex3;
                        str = str3;
                        vqVar2 = r10;
                    }
                    obj = this.b.get(str);
                    if (obj == null) {
                        c3934nc.f7264a = str;
                        c3934nc.b = mutex;
                        c3934nc.c = null;
                        c3934nc.f = 2;
                        Object invoke = vqVar2.invoke(c3934nc);
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
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        c3934nc = new C3934nc(this, continuationImpl);
        Object obj22 = c3934nc.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3934nc.f;
        if (i != 0) {
        }
    }

    public final String toString() {
        String str = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C3963oc c3963oc;
        int i;
        String str2;
        Mutex mutex;
        try {
            if (continuationImpl instanceof C3963oc) {
                c3963oc = (C3963oc) continuationImpl;
                int i2 = c3963oc.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3963oc.e = i2 - Integer.MIN_VALUE;
                    Object obj = c3963oc.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3963oc.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.f7303a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                        c3963oc.f7285a = str;
                        c3963oc.b = mutex2;
                        c3963oc.e = 1;
                        if (mutex2.lock(null, c3963oc) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c3963oc.b;
                        str2 = c3963oc.f7285a;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.b.remove(str2);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            this.b.remove(str2);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c3963oc = new C3963oc(this, continuationImpl);
        Object obj2 = c3963oc.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3963oc.e;
        if (i != 0) {
        }
    }
}
