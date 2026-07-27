package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Wk extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f6936a;
    public C3972ol b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Zk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wk(Zk zk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = zk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return Zk.a(this.d, null, null, this);
    }
}
