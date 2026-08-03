package com.inmobi.media;

/* renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2375e9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2613n9 f5174a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375e9(com.inmobi.media.C2613n9 c2613n9, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f5174a = c2613n9;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2375e9(this.f5174a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2375e9(this.f5174a, this.b, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.f5174a.d;
        int i = 0;
        if (sQLiteDatabase == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxInt(0);
        }
        try {
            i = (int) android.database.DatabaseUtils.longForQuery(sQLiteDatabase, this.b, null);
        } catch (android.database.sqlite.SQLiteException e) {
            e.getMessage();
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
    }
}
