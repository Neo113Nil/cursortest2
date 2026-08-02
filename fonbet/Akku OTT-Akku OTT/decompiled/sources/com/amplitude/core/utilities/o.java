package com.amplitude.core.utilities;

import com.amplitude.core.platform.f;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.W;

/* loaded from: classes3.dex */
public final class o {
    public static final a Companion = new a();
    public final int a;
    public final int b;
    public final double c;
    public final AtomicInteger d;

    public static final class a {
    }

    public o(int i, int i2) {
        this.a = (i2 & 1) != 0 ? 5 : i;
        this.b = 1000;
        this.c = 2.0d;
        this.d = new AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f.b bVar, ContinuationImpl continuationImpl) {
        p pVar;
        int i;
        o oVar;
        if (continuationImpl instanceof p) {
            pVar = (p) continuationImpl;
            int i2 = pVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.e = i2 - Integer.MIN_VALUE;
                Object obj = pVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.d.get() >= this.a) {
                        bVar.invoke(Boxing.boxBoolean(false));
                        return Unit.INSTANCE;
                    }
                    long pow = (long) (Math.pow(this.c, r12.get()) * this.b);
                    pVar.a = this;
                    pVar.b = bVar;
                    pVar.e = 1;
                    if (W.b(pow, pVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = pVar.b;
                    oVar = pVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                bVar.invoke(Boxing.boxBoolean(true));
                oVar.d.incrementAndGet();
                return Unit.INSTANCE;
            }
        }
        pVar = new p(this, continuationImpl);
        Object obj2 = pVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pVar.e;
        if (i != 0) {
        }
        bVar.invoke(Boxing.boxBoolean(true));
        oVar.d.incrementAndGet();
        return Unit.INSTANCE;
    }
}
