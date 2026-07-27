package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes6.dex */
public final class S9 {

    /* renamed from: a, reason: collision with root package name */
    public final C3817ja f6846a;
    public final L5 b;
    public SQLiteDatabase c;
    public SQLiteDatabase d;
    public CoroutineDispatcher e;

    public S9(C3817ja sqLiteOpenHelper, L5 databaseConfig) {
        Intrinsics.checkNotNullParameter(sqLiteOpenHelper, "sqLiteOpenHelper");
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.f6846a = sqLiteOpenHelper;
        this.b = databaseConfig;
    }

    public final Object a(String str, ContentValues contentValues, int i, ContinuationImpl continuationImpl) {
        Object a2 = a(new R9(this, new P9(str, contentValues, i, null), null), continuationImpl);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static Object a(S9 s9, String str, ContentValues contentValues, String str2, String[] strArr, ContinuationImpl continuationImpl, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        String[] strArr2 = (i & 8) != 0 ? null : strArr;
        s9.getClass();
        Object a2 = s9.a(new R9(s9, new Q9(str, contentValues, str3, strArr2, null), null), continuationImpl);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object a(S9 s9, String str, String str2, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return s9.a(str, str2, (String[]) null, continuationImpl);
    }

    public final Object a(String str, String str2, String[] strArr, ContinuationImpl continuationImpl) {
        Object a2 = a(new R9(this, new K9(str, str2, strArr, null), null), continuationImpl);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object a2 = a(new R9(this, new L9(str, null), null), continuationImpl);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
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
    public final Object a(Function1 function1, Continuation continuation) {
        M9 m9;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof M9) {
            m9 = (M9) continuation;
            int i2 = m9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m9.d = i2 - Integer.MIN_VALUE;
                obj = m9.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = m9.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.e;
                    if (coroutineDispatcher != null) {
                        N9 n9 = new N9(function1, null);
                        m9.f6712a = function1;
                        m9.d = 1;
                        obj = BuildersKt.withContext(coroutineDispatcher, n9, m9);
                    }
                    m9.f6712a = null;
                    m9.d = 2;
                    Object invoke = function1.invoke(m9);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                function1 = m9.f6712a;
                ResultKt.throwOnFailure(obj);
                if (obj != null) {
                    return obj;
                }
                m9.f6712a = null;
                m9.d = 2;
                Object invoke2 = function1.invoke(m9);
                if (invoke2 == coroutine_suspended) {
                }
            }
        }
        m9 = new M9(this, continuation);
        obj = m9.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = m9.d;
        if (i != 0) {
        }
        if (obj != null) {
        }
        m9.f6712a = null;
        m9.d = 2;
        Object invoke22 = function1.invoke(m9);
        if (invoke22 == coroutine_suspended) {
        }
    }
}
