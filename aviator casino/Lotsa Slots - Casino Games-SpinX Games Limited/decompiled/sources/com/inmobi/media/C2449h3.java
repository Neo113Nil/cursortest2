package com.inmobi.media;

/* renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2449h3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5231a;
    public final /* synthetic */ com.inmobi.media.V2 b;
    public final /* synthetic */ com.inmobi.media.HandlerC2526k3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2449h3(com.inmobi.media.V2 v2, com.inmobi.media.HandlerC2526k3 handlerC2526k3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = v2;
        this.c = handlerC2526k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2449h3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2449h3(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5231a;
        int i2 = 2;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Z2 z2 = (com.inmobi.media.Z2) com.inmobi.media.A3.b.getValue();
            int i3 = this.b.f5007a;
            this.f5231a = 1;
            java.lang.Object a2 = z2.f5077a.a(com.ironsource.Y3.d, "id=?", new java.lang.String[]{java.lang.String.valueOf(i3)}, this);
            if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 1;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.c.sendMessage(obtain));
                }
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                com.inmobi.media.A3.g.set(false);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.A3.f.remove(this.b);
        if (!com.inmobi.media.A3.f.isEmpty()) {
            com.inmobi.media.HandlerC2526k3 handlerC2526k3 = this.c;
            com.inmobi.media.V2 v2 = (com.inmobi.media.V2) com.inmobi.media.A3.f.get(0);
            int i4 = com.inmobi.media.HandlerC2526k3.f5285a;
            android.os.Message obtain2 = android.os.Message.obtain();
            if (v2 != null && v2.e) {
                i2 = 3;
            }
            obtain2.what = i2;
            obtain2.obj = v2;
            handlerC2526k3.sendMessage(obtain2);
            return kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.Z2 z22 = (com.inmobi.media.Z2) com.inmobi.media.A3.b.getValue();
        this.f5231a = 2;
        obj = z22.a(this);
    }
}
