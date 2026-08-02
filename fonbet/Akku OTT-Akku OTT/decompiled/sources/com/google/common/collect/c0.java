package com.google.common.collect;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.AbstractC1083i0;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.internal.C1089f;

/* loaded from: classes4.dex */
public final class c0 {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(android.support.v4.media.a.a(i2, "at index "));
            }
        }
    }

    public static final Object b(ContinuationImpl continuationImpl) {
        Object obj;
        CoroutineContext coroutineContext = continuationImpl.get$context();
        com.google.common.base.r.d(coroutineContext);
        Continuation intercepted = IntrinsicsKt.intercepted(continuationImpl);
        C1089f c1089f = intercepted instanceof C1089f ? (C1089f) intercepted : null;
        if (c1089f == null) {
            obj = Unit.INSTANCE;
        } else {
            kotlinx.coroutines.I i = c1089f.d;
            if (i.isDispatchNeeded(coroutineContext)) {
                c1089f.f = Unit.INSTANCE;
                c1089f.c = 1;
                i.dispatchYield(coroutineContext, c1089f);
            } else {
                c1 c1Var = new c1();
                CoroutineContext plus = coroutineContext.plus(c1Var);
                Unit unit = Unit.INSTANCE;
                c1089f.f = unit;
                c1089f.c = 1;
                i.dispatchYield(plus, c1089f);
                if (c1Var.a) {
                    AbstractC1083i0 a = U0.a();
                    ArrayDeque<kotlinx.coroutines.Z<?>> arrayDeque = a.c;
                    if (!(arrayDeque != null ? arrayDeque.isEmpty() : true)) {
                        if (a.a >= 4294967296L) {
                            c1089f.f = unit;
                            c1089f.c = 1;
                            a.X(c1089f);
                            obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        } else {
                            a.Y(true);
                            try {
                                c1089f.run();
                                do {
                                } while (a.a0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }
}
