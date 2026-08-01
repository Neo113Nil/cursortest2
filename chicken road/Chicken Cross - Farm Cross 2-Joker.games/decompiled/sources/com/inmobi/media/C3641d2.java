package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3641d2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7060a;
    public final /* synthetic */ C3697f2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3641d2(C3697f2 c3697f2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3697f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7060a = obj;
        this.c |= Integer.MIN_VALUE;
        return C3697f2.a(this.b, null, null, this);
    }
}
