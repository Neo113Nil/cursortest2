package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Q6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f6795a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ V6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(V6 v6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = v6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
