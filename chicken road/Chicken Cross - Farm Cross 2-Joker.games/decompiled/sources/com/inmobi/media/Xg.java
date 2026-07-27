package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Xg extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6951a;
    public final /* synthetic */ Zg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xg(Zg zg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = zg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6951a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
