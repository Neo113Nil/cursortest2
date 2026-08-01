package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class R3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C4066s3 f6817a;
    public C3582b0 b;
    public Y9 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ X3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(X3 x3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
