package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class q extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6792a;
    public final /* synthetic */ java.lang.String b;

    /* renamed from: $r8$lambda$8wwaXibD46B9Jw-IS5q8JvToSaM, reason: not valid java name */
    public static /* synthetic */ void m23213$r8$lambda$8wwaXibD46B9JwIS5q8JvToSaM(java.lang.String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(financial.atomic.muppet.Page page, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6792a = page;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.q(this.f6792a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.q(this.f6792a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        java.lang.String getInputFormats;
        java.lang.String getInputFormats2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        int hashCode = CompletableDeferred$default.hashCode();
        java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(hashCode);
        map = this.f6792a.get_deferrables();
        map.put(boxInt, CompletableDeferred$default);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(async () => { return (");
        sb.append(this.b);
        sb.append(") })()\n                .then(result => ");
        getInputFormats = this.f6792a.getGetInputFormats();
        sb.append(getInputFormats);
        sb.append(".result(");
        sb.append(hashCode);
        sb.append(", JSON.stringify(result)))\n                .catch(e => { console.error('[Muppet] evaluate error:', e); ");
        getInputFormats2 = this.f6792a.getGetInputFormats();
        sb.append(getInputFormats2);
        sb.append(".result(");
        sb.append(hashCode);
        sb.append(", null) })\n            ");
        financial.atomic.muppet.Page.access$get_wv(this.f6792a).evaluateJavascript(kotlin.text.StringsKt.trimIndent(sb.toString()), new android.webkit.ValueCallback() { // from class: financial.atomic.muppet.a.q$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj2) {
                financial.atomic.muppet.a.q.m23213$r8$lambda$8wwaXibD46B9JwIS5q8JvToSaM((java.lang.String) obj2);
            }
        });
        return CompletableDeferred$default;
    }
}
