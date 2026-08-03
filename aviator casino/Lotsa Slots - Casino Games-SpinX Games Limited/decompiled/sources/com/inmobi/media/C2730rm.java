package com.inmobi.media;

/* renamed from: com.inmobi.media.rm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2730rm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fm f5432a;
    public final /* synthetic */ android.widget.FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2730rm(com.inmobi.media.Fm fm, android.widget.FrameLayout frameLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5432a = fm;
        this.b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2730rm(this.f5432a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2730rm(this.f5432a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2799u9 c2799u9 = this.f5432a.e;
        if (c2799u9 != null) {
            c2799u9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        com.inmobi.media.Mn.a(this.f5432a.j);
        this.b.addView(this.f5432a.j);
        return kotlin.Unit.INSTANCE;
    }
}
