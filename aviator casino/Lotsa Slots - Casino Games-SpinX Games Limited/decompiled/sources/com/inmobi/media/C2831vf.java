package com.inmobi.media;

/* renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2831vf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f5510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2831vf(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5510a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2831vf(this.f5510a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2831vf(this.f5510a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2883xf c2883xf = com.inmobi.media.C2883xf.f5551a;
        android.content.Context context = this.f5510a;
        com.inmobi.media.Af af = com.inmobi.media.C2883xf.c;
        if (af == null) {
            af = new com.inmobi.media.Af(context);
            com.inmobi.media.C2883xf.c = af;
        }
        java.lang.String a2 = af.f4602a.a("omid_js_string");
        if (a2 != null) {
            return a2;
        }
        android.content.Context context2 = this.f5510a;
        int i = com.inmobi.ads.R.raw.inmobi_omid_js;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "<this>");
        try {
            java.io.InputStream openRawResource = context2.getResources().openRawResource(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(openRawResource, kotlin.text.Charsets.UTF_8);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                return readText;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
