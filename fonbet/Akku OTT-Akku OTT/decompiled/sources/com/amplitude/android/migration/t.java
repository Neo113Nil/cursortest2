package com.amplitude.android.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class t extends FunctionReferenceImpl implements Function1<Long, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long longValue = l.longValue();
        g gVar = (g) this.receiver;
        synchronized (gVar) {
            if (gVar.d >= 4) {
                gVar.y(longValue, "identify_interceptor");
            }
        }
        return Unit.INSTANCE;
    }
}
