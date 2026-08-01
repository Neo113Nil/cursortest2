package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Ke implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Te f6672a;

    public Ke(CoroutineScope coroutineScope, Te te) {
        this.f6672a = te;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new Qe(this.f6672a, null), continuation);
        if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            withContext = Unit.INSTANCE;
        }
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
