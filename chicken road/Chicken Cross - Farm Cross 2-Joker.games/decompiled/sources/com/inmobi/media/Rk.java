package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes6.dex */
public abstract class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6832a;
    public final Mutex b;

    public Rk(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f6832a = coroutineScope;
        this.b = MutexKt.Mutex$default(false, 1, null);
    }

    public abstract Ok a();

    public abstract void a(Ok ok);

    public final void a(Ok newState, Ok callerState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(callerState, "callerState");
        BuildersKt__Builders_commonKt.launch$default(this.f6832a, null, null, new Pk(this, newState, callerState, null), 3, null);
    }

    public final void b(Ok ok, Ok ok2) {
        if (Intrinsics.areEqual(a(), ok2) && !Intrinsics.areEqual(a(), ok)) {
            Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
            String str = "[AdFlow] StateChange: " + a().getClass().getSimpleName() + " -> " + ok.getClass().getSimpleName();
            a().c();
            a(ok);
            a().a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.inmobi.media.Ok] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Vd vd, Ok ok, ContinuationImpl continuationImpl) {
        Qk qk;
        int i;
        Mutex mutex;
        try {
            if (continuationImpl instanceof Qk) {
                qk = (Qk) continuationImpl;
                int i2 = qk.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qk.f = i2 - Integer.MIN_VALUE;
                    Object obj = qk.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = qk.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.b;
                        qk.f6808a = vd;
                        qk.b = ok;
                        qk.c = mutex;
                        qk.f = 1;
                        if (mutex.lock(null, qk) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = qk.c;
                        ok = qk.b;
                        ?? r0 = qk.f6808a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        vd = r0;
                    }
                    b(vd, ok);
                    return Unit.INSTANCE;
                }
            }
            b(vd, ok);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        qk = new Qk(this, continuationImpl);
        Object obj2 = qk.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qk.f;
        if (i != 0) {
        }
    }
}
