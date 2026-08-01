package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Dn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f6518a;
    public Kf b;
    public /* synthetic */ Object c;
    public final /* synthetic */ En d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dn(En en, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = en;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
