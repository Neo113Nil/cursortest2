package com.inmobi.media;

/* renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C2427g7 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.SuspendFunction {
    public C2427g7(java.lang.Object obj) {
        super(2, obj, com.inmobi.media.C2690q7.class, "handleResultInternal", "handleResultInternal(Lcom/inmobi/media/pingsv2/executor/PingExecutor$PingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object a2 = ((com.inmobi.media.C2690q7) this.receiver).b.a((com.inmobi.media.C2409fg) obj, (kotlin.coroutines.Continuation) obj2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
