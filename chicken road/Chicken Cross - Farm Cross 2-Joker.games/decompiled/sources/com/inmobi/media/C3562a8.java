package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.a8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3562a8 implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f7006a;

    public C3562a8(MutableSharedFlow mutableSharedFlow) {
        this.f7006a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f7006a.collect(new Z7(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
