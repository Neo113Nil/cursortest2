package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.jp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3832jp implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f7189a;

    public C3832jp(MutableStateFlow mutableStateFlow) {
        this.f7189a = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f7189a.collect(new C3804ip(flowCollector), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
