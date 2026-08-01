package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Sa extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Qa f6847a;
    public Mf b;
    public C3733ga c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Ta g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(Ta ta, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = ta;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, null, this);
    }
}
