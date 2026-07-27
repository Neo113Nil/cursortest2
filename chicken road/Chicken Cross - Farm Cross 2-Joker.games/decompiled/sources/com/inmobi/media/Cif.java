package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.if, reason: invalid class name */
/* loaded from: classes6.dex */
public final class Cif extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7162a;
    public final /* synthetic */ C4135uf b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(C4135uf c4135uf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4135uf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7162a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
