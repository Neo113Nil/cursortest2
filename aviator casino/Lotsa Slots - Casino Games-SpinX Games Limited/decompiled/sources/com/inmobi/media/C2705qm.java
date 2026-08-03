package com.inmobi.media;

/* renamed from: com.inmobi.media.qm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2705qm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fm f5412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2705qm(com.inmobi.media.Fm fm, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5412a = fm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2705qm(this.f5412a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2705qm(this.f5412a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.view.ViewGroup viewGroup = this.f5412a.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
