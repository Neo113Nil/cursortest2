package com.inmobi.media;

/* renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2559l9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5313a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ android.content.ContentValues c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2559l9(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = contentValues;
        this.d = str2;
        this.e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2559l9 c2559l9 = new com.inmobi.media.C2559l9(this.b, this.c, this.d, this.e, continuation);
        c2559l9.f5313a = obj;
        return c2559l9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2559l9) create((com.inmobi.media.C2613n9) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = ((com.inmobi.media.C2613n9) this.f5313a).c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.Boxing.boxInt(sQLiteDatabase.updateWithOnConflict(this.b, this.c, this.d, this.e, 4));
        }
        return kotlin.Unit.INSTANCE;
    }
}
