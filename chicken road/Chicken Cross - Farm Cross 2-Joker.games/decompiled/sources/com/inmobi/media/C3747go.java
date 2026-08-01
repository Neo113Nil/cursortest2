package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.go, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3747go extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Cn f7130a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3831jo c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3747go(C3831jo c3831jo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3831jo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
