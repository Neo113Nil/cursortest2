package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.to, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4115to extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7401a;
    public int b;
    public final /* synthetic */ C4144uo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4115to(C4144uo c4144uo, Continuation continuation) {
        super(continuation);
        this.c = c4144uo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7401a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
