package com.inmobi.media;

/* renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2506j9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2613n9 f5275a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2506j9(com.inmobi.media.C2613n9 c2613n9, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f5275a = c2613n9;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2506j9(this.f5275a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2506j9(this.f5275a, this.b, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.f5275a.d;
        if (sQLiteDatabase == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(this.b, null);
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        android.database.DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (rawQuery.moveToNext());
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(rawQuery, null);
                return arrayList;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return arrayList;
        }
    }
}
