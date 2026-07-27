package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class S6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f6843a;
    public /* synthetic */ Object b;
    public final /* synthetic */ V6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S6(V6 v6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = v6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return V6.a(this.c, this);
    }
}
