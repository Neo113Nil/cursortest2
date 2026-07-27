package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4215xe implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f7478a;

    public C4215xe(MutableSharedFlow mutableSharedFlow) {
        this.f7478a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f7478a.collect(new C4188we(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
