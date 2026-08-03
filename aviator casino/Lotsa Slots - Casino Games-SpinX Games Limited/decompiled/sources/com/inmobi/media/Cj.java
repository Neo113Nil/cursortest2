package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Cj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4645a;
    public final /* synthetic */ com.inmobi.media.Tj b;
    public final /* synthetic */ com.inmobi.media.Ej c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ android.graphics.Bitmap.Config e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(com.inmobi.media.Tj tj, com.inmobi.media.Ej ej, java.lang.String str, android.graphics.Bitmap.Config config, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = tj;
        this.c = ej;
        this.d = str;
        this.e = config;
    }

    public static final void a(com.inmobi.media.Tj tj, android.graphics.Bitmap bitmap) {
        tj.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Cj cj = new com.inmobi.media.Cj(this.b, this.c, this.d, this.e, continuation);
        cj.f4645a = obj;
        return cj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Cj) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        com.inmobi.media.C2799u9 c2799u9;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Ej ej = this.c;
        java.lang.String str = this.d;
        android.graphics.Bitmap.Config config = this.e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(com.inmobi.media.Yf.b(ej.f4688a).load(str).tag(ej.c).transform(new com.inmobi.media.Tf(config)).get());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.inmobi.media.Ej ej2 = this.c;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null && (c2799u9 = ej2.b) != null) {
            c2799u9.b("StaticCompanionLoader", "Companion Load Exception: " + m10801exceptionOrNullimpl.getMessage());
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        final android.graphics.Bitmap bitmap = (android.graphics.Bitmap) m10798constructorimpl;
        if (bitmap == null) {
            throw new com.inmobi.media.C2535kc("Companion Load Error");
        }
        final com.inmobi.media.Tj tj = this.b;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(tj.post(new java.lang.Runnable() { // from class: com.inmobi.media.Cj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Cj.a(com.inmobi.media.Tj.this, bitmap);
            }
        }));
    }
}
