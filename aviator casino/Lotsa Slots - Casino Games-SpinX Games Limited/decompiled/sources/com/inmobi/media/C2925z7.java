package com.inmobi.media;

/* renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2925z7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5585a;
    public int b;
    public final /* synthetic */ com.inmobi.media.A7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2925z7(com.inmobi.media.A7 a7, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = a7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5585a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
