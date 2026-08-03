package com.inmobi.media;

/* renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2839vn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5517a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2865wn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2839vn(com.inmobi.media.C2865wn c2865wn, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = c2865wn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2839vn c2839vn = new com.inmobi.media.C2839vn(this.c, continuation);
        c2839vn.b = obj;
        return c2839vn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2839vn c2839vn = new com.inmobi.media.C2839vn(this.c, (kotlin.coroutines.Continuation) obj2);
        c2839vn.b = (kotlinx.coroutines.CoroutineScope) obj;
        return c2839vn.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (com.inmobi.media.C2865wn.a(r7, r6) == r0) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0051 -> B:6:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5517a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
        } else if (i == 1) {
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.IllegalStateException e) {
                e.toString();
            }
            long j = this.c.c;
            this.b = coroutineScope;
            this.f5517a = 2;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            return kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.C2865wn c2865wn = this.c;
        this.b = coroutineScope;
        this.f5517a = 1;
    }
}
