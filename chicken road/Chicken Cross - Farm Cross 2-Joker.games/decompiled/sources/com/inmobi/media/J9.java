package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class J9 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S9 f6646a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(S9 s9, String str, Continuation continuation) {
        super(1, continuation);
        this.f6646a = s9;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new J9(this.f6646a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new J9(this.f6646a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = this.f6646a.d;
        int i = 0;
        if (sQLiteDatabase == null) {
            return Boxing.boxInt(0);
        }
        try {
            i = (int) DatabaseUtils.longForQuery(sQLiteDatabase, this.b, null);
        } catch (SQLiteException e) {
            String str = "SQLiteException during count query: " + e.getMessage();
        }
        return Boxing.boxInt(i);
    }
}
