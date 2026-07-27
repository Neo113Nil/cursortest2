package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class J2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2 f6639a;

    public J2(CoroutineScope coroutineScope, P2 p2) {
        this.f6639a = p2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.f6639a.getClass();
        String str = "Window Lifecycle Observer Callback " + booleanValue;
        this.f6639a.e.set(booleanValue);
        P2 p2 = this.f6639a;
        if (p2.e.get()) {
            Oh oh = p2.c().f6790a;
            oh.f.set(false);
            oh.a();
        } else {
            Oh oh2 = p2.c().f6790a;
            oh2.b.setValue(EnumC3580aq.f7019a);
            oh2.f.set(true);
            AbstractC3787i7.a(oh2.e);
            oh2.e = null;
        }
        P2 p22 = this.f6639a;
        if (p22.e.get()) {
            p22.g.a();
        } else {
            p22.g.b();
        }
        return Unit.INSTANCE;
    }
}
