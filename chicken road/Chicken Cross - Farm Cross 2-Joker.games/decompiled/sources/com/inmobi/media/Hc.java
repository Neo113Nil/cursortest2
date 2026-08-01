package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Hc extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f6601a;
    public C4019qc b;
    public C4019qc c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Jc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hc(Jc jc, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = jc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
