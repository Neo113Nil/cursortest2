package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4035r0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7339a;
    public final /* synthetic */ C4091t0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4035r0(C4091t0 c4091t0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4091t0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7339a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
