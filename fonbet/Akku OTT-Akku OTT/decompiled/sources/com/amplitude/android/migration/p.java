package com.amplitude.android.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements Function1<Long, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long longValue = l.longValue();
        g gVar = (g) this.receiver;
        synchronized (gVar) {
            gVar.y(longValue, "events");
        }
        return Unit.INSTANCE;
    }
}
