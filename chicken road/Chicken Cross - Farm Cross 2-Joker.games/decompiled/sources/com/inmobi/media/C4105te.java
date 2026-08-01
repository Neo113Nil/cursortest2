package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4105te implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ De f7394a;

    public C4105te(CoroutineScope coroutineScope, De de) {
        this.f7394a = de;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3595bd abstractC3595bd = (AbstractC3595bd) obj;
        AbstractC3724g1 abstractC3724g1 = this.f7394a.d;
        Intrinsics.checkNotNull(abstractC3595bd, "null cannot be cast to non-null type com.inmobi.media.ads.common.models.VideoEvent");
        abstractC3724g1.a((AbstractC3691eo) abstractC3595bd);
        return Unit.INSTANCE;
    }
}
