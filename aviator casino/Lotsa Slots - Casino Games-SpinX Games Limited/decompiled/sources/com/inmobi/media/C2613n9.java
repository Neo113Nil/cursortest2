package com.inmobi.media;

/* renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2613n9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.E9 f5354a;
    public final com.inmobi.media.C2635o5 b;
    public android.database.sqlite.SQLiteDatabase c;
    public android.database.sqlite.SQLiteDatabase d;
    public kotlinx.coroutines.CoroutineDispatcher e;

    public C2613n9(com.inmobi.media.E9 sqLiteOpenHelper, com.inmobi.media.C2635o5 databaseConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteOpenHelper, "sqLiteOpenHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.f5354a = sqLiteOpenHelper;
        this.b = databaseConfig;
    }

    public final java.lang.Object a(java.lang.String str, android.content.ContentValues contentValues, int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = a(new com.inmobi.media.C2585m9(this, new com.inmobi.media.C2532k9(str, contentValues, i, null), null), continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public static java.lang.Object a(com.inmobi.media.C2613n9 c2613n9, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl, int i) {
        java.lang.String str3 = (i & 4) != 0 ? null : str2;
        java.lang.String[] strArr2 = (i & 8) != 0 ? null : strArr;
        c2613n9.getClass();
        java.lang.Object a2 = c2613n9.a(new com.inmobi.media.C2585m9(c2613n9, new com.inmobi.media.C2559l9(str, contentValues, str3, strArr2, null), null), continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object a(com.inmobi.media.C2613n9 c2613n9, java.lang.String str, java.lang.String str2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c2613n9.a(str, str2, (java.lang.String[]) null, continuationImpl);
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a2 = a(new com.inmobi.media.C2585m9(this, new com.inmobi.media.C2402f9(str, str2, strArr, null), null), continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object a2 = a(new com.inmobi.media.C2585m9(this, new com.inmobi.media.C2429g9(str, null), null), continuationImpl);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2455h9 c2455h9;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        if (continuation instanceof com.inmobi.media.C2455h9) {
            c2455h9 = (com.inmobi.media.C2455h9) continuation;
            int i2 = c2455h9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2455h9.d = i2 - Integer.MIN_VALUE;
                obj = c2455h9.b;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2455h9.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.e;
                    if (coroutineDispatcher != null) {
                        com.inmobi.media.C2481i9 c2481i9 = new com.inmobi.media.C2481i9(function1, null);
                        c2455h9.f5237a = function1;
                        c2455h9.d = 1;
                        obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, c2481i9, c2455h9);
                    }
                    c2455h9.f5237a = null;
                    c2455h9.d = 2;
                    java.lang.Object invoke = function1.invoke(c2455h9);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                function1 = c2455h9.f5237a;
                kotlin.ResultKt.throwOnFailure(obj);
                if (obj != null) {
                    return obj;
                }
                c2455h9.f5237a = null;
                c2455h9.d = 2;
                java.lang.Object invoke2 = function1.invoke(c2455h9);
                if (invoke2 == coroutine_suspended) {
                }
            }
        }
        c2455h9 = new com.inmobi.media.C2455h9(this, continuation);
        obj = c2455h9.b;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2455h9.d;
        if (i != 0) {
        }
        if (obj != null) {
        }
        c2455h9.f5237a = null;
        c2455h9.d = 2;
        java.lang.Object invoke22 = function1.invoke(c2455h9);
        if (invoke22 == coroutine_suspended) {
        }
    }
}
