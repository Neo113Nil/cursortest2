package com.moloco.sdk.internal.bidtoken;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.internal.bidtoken.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6935a = 0;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.bidtoken.VersionPrefixedJWTokenParser$invoke$2", f = "VersionPrefixedJWTokenParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.bidtoken.a, com.moloco.sdk.internal.m>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6936a;
        public final /* synthetic */ java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.bidtoken.c.a> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.bidtoken.a, com.moloco.sdk.internal.m>> continuation) {
            return ((com.moloco.sdk.internal.bidtoken.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.bidtoken.c.a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6936a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                byte[] decode = android.util.Base64.decode((java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) kotlin.text.StringsKt.split$default((java.lang.CharSequence) this.b, new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON}, false, 0, 6, (java.lang.Object) null).get(1), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).get(1), 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.internal.bidtoken.a(new org.json.JSONObject(kotlin.text.StringsKt.decodeToString(decode)).getLong(com.facebook.AuthenticationTokenClaims.JSON_KEY_EXP)));
            } catch (java.lang.Exception e) {
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m(e.toString(), -1));
            }
        }
    }

    @Override // com.moloco.sdk.internal.bidtoken.b
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.bidtoken.a, com.moloco.sdk.internal.m>> continuation) {
        kotlin.coroutines.CoroutineContext coroutineContext;
        coroutineContext = com.moloco.sdk.internal.bidtoken.d.f6937a;
        return kotlinx.coroutines.BuildersKt.withContext(coroutineContext, new com.moloco.sdk.internal.bidtoken.c.a(str, null), continuation);
    }
}
