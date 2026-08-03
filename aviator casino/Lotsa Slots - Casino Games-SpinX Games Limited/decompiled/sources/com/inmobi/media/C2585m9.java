package com.inmobi.media;

/* renamed from: com.inmobi.media.m9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2585m9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public android.database.sqlite.SQLiteDatabase f5331a;
    public int b;
    public final /* synthetic */ com.inmobi.media.C2613n9 c;
    public final /* synthetic */ kotlin.coroutines.jvm.internal.SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2585m9(com.inmobi.media.C2613n9 c2613n9, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.c = c2613n9;
        this.d = (kotlin.coroutines.jvm.internal.SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2585m9(this.c, this.d, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2585m9(this.c, this.d, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[Catch: SQLiteException -> 0x0065, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0065, blocks: (B:23:0x005b, B:25:0x0061), top: B:22:0x005b }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2613n9 c2613n9 = this.c;
                sQLiteDatabase = c2613n9.c;
                if (sQLiteDatabase == 0) {
                    return null;
                }
                ?? r3 = this.d;
                if (c2613n9.b.c == 2) {
                    sQLiteDatabase.beginTransactionNonExclusive();
                } else {
                    sQLiteDatabase.beginTransaction();
                }
                try {
                    this.f5331a = sQLiteDatabase;
                    this.b = 1;
                    if (r3.invoke(c2613n9, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sQLiteDatabase2 = sQLiteDatabase;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    sQLiteDatabase2 = sQLiteDatabase;
                    e.getMessage();
                    if (sQLiteDatabase2.inTransaction()) {
                    }
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (android.database.sqlite.SQLiteException e2) {
                        e2.getMessage();
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sQLiteDatabase2 = this.f5331a;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (android.database.sqlite.SQLiteException e3) {
                    e = e3;
                    e.getMessage();
                    try {
                        if (sQLiteDatabase2.inTransaction()) {
                            sQLiteDatabase2.endTransaction();
                        }
                    } catch (android.database.sqlite.SQLiteException e4) {
                        e4.getMessage();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            sQLiteDatabase2.setTransactionSuccessful();
            try {
                if (sQLiteDatabase2.inTransaction()) {
                    sQLiteDatabase2.endTransaction();
                }
            } catch (android.database.sqlite.SQLiteException e5) {
                e5.getMessage();
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteDatabase = coroutine_suspended;
        }
    }
}
