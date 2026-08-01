package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Fb extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ca f6554a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Kb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb(Kb kb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = kb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return Kb.a(this.c, null, this);
    }
}
