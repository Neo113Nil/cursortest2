package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class G6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Nm f6575a;
    public D6 b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ M6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(M6 m6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = m6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return M6.a(this.i, false, (ContinuationImpl) this);
    }
}
