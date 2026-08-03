package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Nj f4748a;
    public final /* synthetic */ android.widget.FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hj(com.inmobi.media.Nj nj, android.widget.FrameLayout frameLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4748a = nj;
        this.b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Hj(this.f4748a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Hj(this.f4748a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2799u9 c2799u9 = this.f4748a.e;
        if (c2799u9 != null) {
            c2799u9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        com.inmobi.media.Mn.a(this.f4748a.g);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b.addView(this.f4748a.g, layoutParams);
        return kotlin.Unit.INSTANCE;
    }
}
