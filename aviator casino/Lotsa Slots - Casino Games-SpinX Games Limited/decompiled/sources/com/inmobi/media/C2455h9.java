package com.inmobi.media;

/* renamed from: com.inmobi.media.h9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2455h9 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.functions.Function1 f5237a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2613n9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2455h9(com.inmobi.media.C2613n9 c2613n9, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = c2613n9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((kotlin.jvm.functions.Function1) null, this);
    }
}
