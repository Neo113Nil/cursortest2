package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3670e4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7079a;
    public int b;

    public C3670e4(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7079a = obj;
        this.b |= Integer.MIN_VALUE;
        return AbstractC3727g4.a((Oi) null, (Function1) null, this);
    }
}
