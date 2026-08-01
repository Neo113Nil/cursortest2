package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4094t3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7386a;
    public final /* synthetic */ C4177w3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4094t3(C4177w3 c4177w3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4177w3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7386a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, 0, this);
    }
}
