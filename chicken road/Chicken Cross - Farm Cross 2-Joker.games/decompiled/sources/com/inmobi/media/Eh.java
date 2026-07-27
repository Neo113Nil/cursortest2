package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Eh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6538a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Gh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eh(Gh gh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = gh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((Vg) null, 0, this);
    }
}
