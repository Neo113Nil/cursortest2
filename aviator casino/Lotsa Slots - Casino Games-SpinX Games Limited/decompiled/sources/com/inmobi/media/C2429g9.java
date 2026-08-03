package com.inmobi.media;

/* renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2429g9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5215a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2429g9(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2429g9 c2429g9 = new com.inmobi.media.C2429g9(this.b, continuation);
        c2429g9.f5215a = obj;
        return c2429g9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2429g9 c2429g9 = new com.inmobi.media.C2429g9(this.b, (kotlin.coroutines.Continuation) obj2);
        c2429g9.f5215a = (com.inmobi.media.C2613n9) obj;
        return c2429g9.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = ((com.inmobi.media.C2613n9) this.f5215a).c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.b);
        }
        return kotlin.Unit.INSTANCE;
    }
}
