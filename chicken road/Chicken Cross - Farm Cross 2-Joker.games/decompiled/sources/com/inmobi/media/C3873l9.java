package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3873l9 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7220a;
    public final /* synthetic */ C3931n9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3873l9(C3931n9 c3931n9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3931n9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7220a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
