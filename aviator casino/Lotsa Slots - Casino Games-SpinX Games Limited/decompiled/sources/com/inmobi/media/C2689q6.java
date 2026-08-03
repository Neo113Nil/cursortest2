package com.inmobi.media;

/* renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2689q6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5406a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.inmobi.media.Te c;
    public final /* synthetic */ int d;
    public final /* synthetic */ com.inmobi.media.C2478i6 e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ com.inmobi.media.Rk i;
    public final /* synthetic */ com.inmobi.media.C2662p6 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2689q6(long j, com.inmobi.media.Te te, int i, com.inmobi.media.C2478i6 c2478i6, java.lang.String str, int i2, long j2, com.inmobi.media.Rk rk, com.inmobi.media.C2662p6 c2662p6, boolean z, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = te;
        this.d = i;
        this.e = c2478i6;
        this.f = str;
        this.g = i2;
        this.h = j2;
        this.i = rk;
        this.j = c2662p6;
        this.k = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2689q6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2689q6) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0043, code lost:
    
        if (r14 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5406a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j = this.b * 1000;
            this.f5406a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
                kotlin.Lazy lazy = com.inmobi.media.AbstractC2714r6.f5420a;
                if (com.inmobi.media.AbstractC2889xl.a(ve)) {
                    com.inmobi.media.C2662p6 c2662p6 = this.j;
                    com.inmobi.media.C2478i6 eventPayload = this.e;
                    c2662p6.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
                    java.lang.String TAG = c2662p6.e;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2582m6(c2662p6, eventPayload, null), 1, null);
                    c2662p6.a(java.lang.System.currentTimeMillis());
                    if (c2662p6.d != null) {
                        java.util.ArrayList eventIds = eventPayload.f5254a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                        java.lang.Integer num = com.inmobi.media.AbstractC2757sk.c;
                        if (num != null && eventIds.contains(java.lang.Integer.valueOf(num.intValue()))) {
                            com.inmobi.media.AbstractC2757sk.b = 0;
                            com.inmobi.media.La la = com.inmobi.media.AbstractC2757sk.f5450a;
                            if (la != null) {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                                la.a(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, 0, false);
                            }
                            com.inmobi.media.AbstractC2757sk.c = null;
                        }
                    }
                    c2662p6.f.set(false);
                } else if (this.d > 1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("r6", "access$getTAG$p(...)");
                    ve.c();
                    ve.e();
                    com.inmobi.media.AbstractC2714r6.a(this.e, this.f, this.g, this.d - 1, this.h, this.i, this.j, this.k);
                } else {
                    com.inmobi.media.C2662p6 c2662p62 = this.j;
                    com.inmobi.media.C2478i6 eventPayload2 = this.e;
                    c2662p62.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPayload2, "eventPayload");
                    java.lang.String TAG2 = c2662p62.e;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2556l6(eventPayload2, true, c2662p62, null), 1, null);
                    c2662p62.a(java.lang.System.currentTimeMillis());
                    if (c2662p62.d != null) {
                        java.util.ArrayList eventIds2 = eventPayload2.f5254a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventIds2, "eventIds");
                        java.lang.Integer num2 = com.inmobi.media.AbstractC2757sk.c;
                        if (num2 != null && eventIds2.contains(java.lang.Integer.valueOf(num2.intValue()))) {
                            com.inmobi.media.AbstractC2757sk.c = null;
                        }
                    }
                    c2662p62.f.set(false);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.g.getValue();
        com.inmobi.media.Te te = this.c;
        this.f5406a = 2;
        obj = b9.f4618a.a(te, this);
    }
}
