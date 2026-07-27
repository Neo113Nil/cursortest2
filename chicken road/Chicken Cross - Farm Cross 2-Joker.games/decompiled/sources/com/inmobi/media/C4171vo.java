package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.vo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4171vo implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f7444a;

    public C4171vo(Flow flow) {
        this.f7444a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f7444a.collect(new C4144uo(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
