package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Em extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fm f4691a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Em(com.inmobi.media.Fm fm, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4691a = fm;
    }

    public static final void a(com.inmobi.media.Fm fm, android.view.View view) {
        com.inmobi.media.T4.a(fm.d, fm.b, com.inmobi.media.C2416fm.f5206a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Em(this.f4691a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Em(this.f4691a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        final com.inmobi.media.Fm fm = this.f4691a;
        android.view.ViewGroup viewGroup = fm.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.Em$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.inmobi.media.Em.a(com.inmobi.media.Fm.this, view);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
