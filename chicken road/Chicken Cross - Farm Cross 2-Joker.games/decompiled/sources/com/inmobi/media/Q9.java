package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Q9 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6798a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ContentValues c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9(String str, ContentValues contentValues, String str2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = contentValues;
        this.d = str2;
        this.e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Q9 q9 = new Q9(this.b, this.c, this.d, this.e, continuation);
        q9.f6798a = obj;
        return q9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q9) create((S9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = ((S9) this.f6798a).c;
        if (sQLiteDatabase != null) {
            Boxing.boxInt(sQLiteDatabase.updateWithOnConflict(this.b, this.c, this.d, this.e, 4));
        }
        return Unit.INSTANCE;
    }
}
