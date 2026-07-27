package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3587b5 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7024a;
    public final /* synthetic */ C3644d5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3587b5(C3644d5 c3644d5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3644d5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7024a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
