package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.ro, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4059ro implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bo f7359a;

    public C4059ro(CoroutineScope coroutineScope, Bo bo) {
        this.f7359a = bo;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3595bd abstractC3595bd = (AbstractC3595bd) obj;
        Z9 z9 = this.f7359a.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "observeCompanionAdEvents - received companion event: " + abstractC3595bd);
        }
        Object emit = this.f7359a.d.emit(abstractC3595bd, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
