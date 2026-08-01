package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.hp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3777hp extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7153a;
    public int b;
    public final /* synthetic */ C3804ip c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3777hp(C3804ip c3804ip, Continuation continuation) {
        super(continuation);
        this.c = c3804ip;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7153a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
