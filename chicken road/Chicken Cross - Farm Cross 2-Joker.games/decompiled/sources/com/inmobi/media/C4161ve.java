package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4161ve extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7437a;
    public int b;
    public final /* synthetic */ C4188we c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4161ve(C4188we c4188we, Continuation continuation) {
        super(continuation);
        this.c = c4188we;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7437a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
