package com.inmobi.media;

/* renamed from: com.inmobi.media.al, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2282al {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2282al f5108a = new com.inmobi.media.C2282al();
    public static final com.inmobi.media.C2935zh b = new com.inmobi.media.C2935zh();
    public static final java.util.LinkedHashSet c = new java.util.LinkedHashSet();
    public static kotlinx.coroutines.Deferred d;
    public static com.inmobi.media.C2362dl e;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (a((kotlin.coroutines.Continuation) r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (com.inmobi.media.J3.a(r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Wk wk;
        int i;
        if (continuationImpl instanceof com.inmobi.media.Wk) {
            wk = (com.inmobi.media.Wk) continuationImpl;
            int i2 = wk.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wk.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = wk.f5036a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wk.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2935zh c2935zh = b;
                    com.inmobi.media.Xk xk = new com.inmobi.media.Xk(null);
                    wk.c = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                wk.c = 2;
            }
        }
        wk = new com.inmobi.media.Wk(this, continuationImpl);
        java.lang.Object obj2 = wk.f5036a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wk.c;
        if (i != 0) {
        }
        wk.c = 2;
    }

    public static java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        com.inmobi.media.core.config.models.SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        java.lang.Object a2 = com.inmobi.media.J3.a(b, new com.inmobi.media.Yk(unifiedIdServiceConfig, null), continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public static java.lang.Object a(com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface, kotlin.coroutines.Continuation continuation) {
        if (inMobiUnifiedIdInterface != null) {
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(c.add(inMobiUnifiedIdInterface));
        }
        if (b.b.get() != null) {
            java.util.Objects.toString(inMobiUnifiedIdInterface);
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object a2 = a(continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
