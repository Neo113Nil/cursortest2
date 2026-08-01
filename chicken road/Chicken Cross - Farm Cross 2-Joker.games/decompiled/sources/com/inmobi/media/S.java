package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class S extends FunctionReferenceImpl implements Function0 {
    public S(Object obj) {
        super(0, obj, V.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        V v = (V) this.receiver;
        v.getClass();
        v.n = AbstractC3914mk.d.get();
        Wc wc = (Wc) P6.e.getValue();
        P runnable = v.m;
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.postAtFrontOfQueue(runnable);
        return Unit.INSTANCE;
    }
}
