package com.inmobi.media;

/* renamed from: com.inmobi.media.zh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2935zh {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.sync.Mutex f5593a = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    public java.lang.ref.WeakReference b = new java.lang.ref.WeakReference(null);
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2885xh c2885xh;
        int i;
        kotlin.coroutines.CoroutineContext coroutineContext;
        if (continuationImpl instanceof com.inmobi.media.C2885xh) {
            c2885xh = (com.inmobi.media.C2885xh) continuationImpl;
            int i2 = c2885xh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2885xh.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2885xh.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2885xh.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext context = c2885xh.getContext();
                    java.lang.System.out.println(c2885xh.getContext());
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.b.get(), context)) {
                        this.c++;
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.sync.Mutex mutex = this.f5593a;
                    c2885xh.f5553a = context;
                    c2885xh.d = 1;
                    if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(mutex, null, c2885xh, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineContext = context;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineContext = c2885xh.f5553a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.b = new java.lang.ref.WeakReference(coroutineContext);
                this.c = 1;
                return kotlin.Unit.INSTANCE;
            }
        }
        c2885xh = new com.inmobi.media.C2885xh(this, continuationImpl);
        java.lang.Object obj2 = c2885xh.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2885xh.d;
        if (i != 0) {
        }
        this.b = new java.lang.ref.WeakReference(coroutineContext);
        this.c = 1;
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.Unit a(com.inmobi.media.C2910yh c2910yh) {
        kotlin.coroutines.CoroutineContext context = c2910yh.getContext();
        java.lang.System.out.println(c2910yh.getContext());
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b.get(), context)) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b = new java.lang.ref.WeakReference(null);
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.f5593a, null, 1, null);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(3:20|21|(1:24)(1:23)))(1:26))(1:30)|27|28))|36|6|7|(0)(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r0.f5572a = r8;
        r0.d = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.I3 i3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2910yh c2910yh;
        int i;
        com.inmobi.media.I3 i32;
        if (continuationImpl instanceof com.inmobi.media.C2910yh) {
            c2910yh = (com.inmobi.media.C2910yh) continuationImpl;
            int i2 = c2910yh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2910yh.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2910yh.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2910yh.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c2910yh.f5572a = i3;
                    c2910yh.d = 1;
                    i32 = i3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            c2910yh.f5572a = obj;
                            c2910yh.d = 3;
                            return a(c2910yh) == coroutine_suspended ? coroutine_suspended : obj;
                        }
                        if (i == 3) {
                            java.lang.Object obj2 = c2910yh.f5572a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj2;
                        }
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th = (java.lang.Throwable) c2910yh.f5572a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    ?? r8 = (kotlin.jvm.functions.Function1) c2910yh.f5572a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i32 = r8;
                }
                c2910yh.f5572a = null;
                c2910yh.d = 2;
                obj = i32.invoke(c2910yh);
            }
        }
        c2910yh = new com.inmobi.media.C2910yh(this, continuationImpl);
        java.lang.Object obj3 = c2910yh.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2910yh.d;
        if (i != 0) {
        }
        c2910yh.f5572a = null;
        c2910yh.d = 2;
        obj3 = i32.invoke(c2910yh);
    }
}
