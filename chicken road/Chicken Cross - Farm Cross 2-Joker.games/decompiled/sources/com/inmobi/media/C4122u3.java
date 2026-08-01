package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4122u3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7408a;
    public final /* synthetic */ C4177w3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4122u3(C4177w3 c4177w3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4177w3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7408a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
