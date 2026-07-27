package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class W7 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f6926a;

    public W7(CoroutineScope coroutineScope, C4043r8 c4043r8) {
        this.f6926a = c4043r8;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        C4043r8 c4043r8 = this.f6926a;
        c4043r8.x.a();
        c4043r8.j.set(Kh.f);
        return Unit.INSTANCE;
    }
}
