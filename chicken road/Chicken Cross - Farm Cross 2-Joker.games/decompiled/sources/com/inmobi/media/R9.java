package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class R9 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f6823a;
    public int b;
    public final /* synthetic */ S9 c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public R9(S9 s9, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.c = s9;
        this.d = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new R9(this.c, this.d, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new R9(this.c, this.d, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: SQLiteException -> 0x0084, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0084, blocks: (B:22:0x007a, B:24:0x0080), top: B:21:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: SQLiteException -> 0x00a3, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x00a3, blocks: (B:32:0x0099, B:34:0x009f), top: B:31:0x0099 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S9 s9 = this.c;
            sQLiteDatabase = s9.c;
            if (sQLiteDatabase == null) {
                return null;
            }
            ?? r5 = this.d;
            if (s9.b.c == 2) {
                sQLiteDatabase.beginTransactionNonExclusive();
            } else {
                sQLiteDatabase.beginTransaction();
            }
            try {
                this.f6823a = sQLiteDatabase;
                this.b = 1;
                if (r5.invoke(s9, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (SQLiteException e) {
                e = e;
                sQLiteDatabase2 = sQLiteDatabase;
                String str = "SQLiteException during transaction: " + e.getMessage();
                if (sQLiteDatabase2.inTransaction()) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase.inTransaction()) {
                }
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sQLiteDatabase2 = this.f6823a;
            try {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (SQLiteException e2) {
                    e = e2;
                    String str2 = "SQLiteException during transaction: " + e.getMessage();
                    try {
                        if (sQLiteDatabase2.inTransaction()) {
                            sQLiteDatabase2.endTransaction();
                        }
                    } catch (SQLiteException e3) {
                        String str3 = "SQLiteException during endTransaction: " + e3.getMessage();
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabase2;
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (SQLiteException e4) {
                    String str4 = "SQLiteException during endTransaction: " + e4.getMessage();
                }
                throw th;
            }
        }
        sQLiteDatabase2.setTransactionSuccessful();
        try {
            if (sQLiteDatabase2.inTransaction()) {
                sQLiteDatabase2.endTransaction();
            }
        } catch (SQLiteException e5) {
            String str5 = "SQLiteException during endTransaction: " + e5.getMessage();
        }
        return Unit.INSTANCE;
    }
}
