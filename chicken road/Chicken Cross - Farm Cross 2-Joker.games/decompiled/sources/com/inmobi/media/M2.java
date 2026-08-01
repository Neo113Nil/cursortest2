package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class M2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f6708a;
    public /* synthetic */ Object b;
    public final /* synthetic */ P2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(P2 p2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = p2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return P2.b(this.c, this);
    }
}
