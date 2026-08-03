package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ej extends com.inmobi.media.X3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4688a;
    public final com.inmobi.media.C2799u9 b;
    public final java.lang.String c;

    public Ej(android.content.Context context, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f4688a = context;
        this.b = c2799u9;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.c = "Static-Companion-" + uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r13, r14, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Ej ej, java.lang.String str, com.inmobi.media.Tj tj, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Bj bj;
        int i;
        ej.getClass();
        if (continuationImpl instanceof com.inmobi.media.Bj) {
            bj = (com.inmobi.media.Bj) continuationImpl;
            int i2 = bj.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bj.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bj.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bj.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                    com.inmobi.media.Dj dj = new com.inmobi.media.Dj(ej, null);
                    bj.f4627a = str;
                    bj.b = tj;
                    bj.e = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(main, dj, bj);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    tj = bj.b;
                    str = bj.f4627a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                com.inmobi.media.Cj cj = new com.inmobi.media.Cj(tj, ej, str, (android.graphics.Bitmap.Config) obj, null);
                bj.f4627a = null;
                bj.b = null;
                bj.e = 2;
            }
        }
        bj = new com.inmobi.media.Bj(ej, continuationImpl);
        java.lang.Object obj2 = bj.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bj.e;
        if (i != 0) {
        }
        kotlinx.coroutines.CoroutineDispatcher io22 = kotlinx.coroutines.Dispatchers.getIO();
        com.inmobi.media.Cj cj2 = new com.inmobi.media.Cj(tj, ej, str, (android.graphics.Bitmap.Config) obj2, null);
        bj.f4627a = null;
        bj.b = null;
        bj.e = 2;
    }

    public final java.lang.Object a(com.inmobi.media.Ii ii, com.inmobi.media.N3 n3) {
        if (android.webkit.URLUtil.isNetworkUrl(ii.f4767a)) {
            return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Aj(this, ii, null), n3);
        }
        throw new com.inmobi.media.C2535kc("Companion Invalid Resource Error");
    }
}
