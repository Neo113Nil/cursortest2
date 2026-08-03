package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4720a;
    public final /* synthetic */ com.inmobi.media.R7 b;
    public final /* synthetic */ java.util.ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(com.inmobi.media.R7 r7, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = r7;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.G7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.G7(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4720a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.R7 r7 = this.b;
            if (!r7.f.get()) {
                r7.f.set(true);
                if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    r7.p.addListener(r7.B);
                } else {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7.c, null, null, new com.inmobi.media.C2849w7(null, r7), 3, null);
                }
            }
            this.b.u = java.lang.System.currentTimeMillis();
            com.inmobi.media.R7 r72 = this.b;
            androidx.media3.exoplayer.ExoPlayer exoPlayer = r72.p;
            java.util.ArrayList arrayList = this.c;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = r72.b;
            com.inmobi.media.L2 l2 = r72.w;
            boolean isCache = r72.f4933a.getIsCache();
            this.f4720a = 1;
            obj = com.inmobi.media.AbstractC2364dn.a(exoPlayer, arrayList, interfaceC2772t9, l2, isCache, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.b.a((com.inmobi.media.AbstractC2480i8) obj);
        return kotlin.Unit.INSTANCE;
    }
}
