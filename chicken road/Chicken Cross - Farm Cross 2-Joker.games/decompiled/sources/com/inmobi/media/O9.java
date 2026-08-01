package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class O9 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S9 f6759a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9(S9 s9, String str, Continuation continuation) {
        super(1, continuation);
        this.f6759a = s9;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new O9(this.f6759a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new O9(this.f6759a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = this.f6759a.d;
        if (sQLiteDatabase == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(this.b, null);
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (rawQuery.moveToNext());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rawQuery, null);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
