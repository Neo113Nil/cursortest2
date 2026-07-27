package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class O7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f6758a;
    public /* synthetic */ Object b;
    public final /* synthetic */ P7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(P7 p7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = p7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
