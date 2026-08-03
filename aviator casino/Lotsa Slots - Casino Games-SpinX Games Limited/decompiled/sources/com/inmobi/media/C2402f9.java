package com.inmobi.media;

/* renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2402f9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5196a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402f9(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2402f9 c2402f9 = new com.inmobi.media.C2402f9(this.b, this.c, this.d, continuation);
        c2402f9.f5196a = obj;
        return c2402f9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2402f9) create((com.inmobi.media.C2613n9) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = ((com.inmobi.media.C2613n9) this.f5196a).c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.Boxing.boxInt(sQLiteDatabase.delete(this.b, this.c, this.d));
        }
        return kotlin.Unit.INSTANCE;
    }
}
