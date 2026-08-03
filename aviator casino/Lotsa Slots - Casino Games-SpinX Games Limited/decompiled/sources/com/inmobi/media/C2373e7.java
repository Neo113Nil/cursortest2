package com.inmobi.media;

/* renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2373e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2373e7 f5172a = new com.inmobi.media.C2373e7();
    public static com.inmobi.unifiedId.InMobiUserDataModel b;
    public static final kotlinx.coroutines.sync.Mutex c;

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("e7", "getSimpleName(...)");
        c = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2348d7 c2348d7;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2348d7) {
                c2348d7 = (com.inmobi.media.C2348d7) continuationImpl;
                int i2 = c2348d7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2348d7.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2348d7.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2348d7.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = c;
                        c2348d7.f5155a = inMobiUserDataModel;
                        c2348d7.b = mutex;
                        c2348d7.d = 1;
                        if (mutex.lock(null, c2348d7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = c2348d7.b;
                        com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel2 = c2348d7.f5155a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        inMobiUserDataModel = inMobiUserDataModel2;
                    }
                    java.util.Objects.toString(b);
                    java.util.Objects.toString(inMobiUserDataModel);
                    b = inMobiUserDataModel;
                    return kotlin.Unit.INSTANCE;
                }
            }
            java.util.Objects.toString(b);
            java.util.Objects.toString(inMobiUserDataModel);
            b = inMobiUserDataModel;
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c2348d7 = new com.inmobi.media.C2348d7(continuationImpl);
        java.lang.Object obj2 = c2348d7.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2348d7.d;
        if (i != 0) {
        }
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(b);
    }
}
