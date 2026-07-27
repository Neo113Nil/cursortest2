package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Wf extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f6933a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3682eg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wf(C3682eg c3682eg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3682eg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
