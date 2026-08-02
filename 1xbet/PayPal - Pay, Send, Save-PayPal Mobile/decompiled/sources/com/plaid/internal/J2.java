package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.redirect.LinkRedirectActivityViewModel$redirectToLink$1", f = "LinkRedirectActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class J2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.LinkRedirectActivity f5817a;
    public final /* synthetic */ com.plaid.internal.D6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(com.plaid.internal.LinkRedirectActivity linkRedirectActivity, com.plaid.internal.D6 d6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5817a = linkRedirectActivity;
        this.b = d6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.J2(this.f5817a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.J2(this.f5817a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Launching LinkActivity", true);
        com.plaid.internal.LinkRedirectActivity linkRedirectActivity = this.f5817a;
        int i = com.plaid.internal.link.LinkActivity.e;
        com.plaid.internal.D6 d6 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkRedirectActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d6, "");
        android.content.Intent intent = new android.content.Intent(linkRedirectActivity, (java.lang.Class<?>) com.plaid.internal.link.LinkActivity.class);
        intent.setFlags(603979776);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d6, "");
        if (d6 instanceof com.plaid.internal.D6.a) {
            intent.putExtra("link_oauth_redirect", true);
            intent.putExtra("link_oauth_received_redirect_uri", ((com.plaid.internal.D6.a) d6).f5770a);
        } else if (d6 instanceof com.plaid.internal.D6.b) {
            intent.putExtra("link_out_of_process_complete_redirect", true);
            intent.putExtra("link_out_of_process_complete_redirect_uri", ((com.plaid.internal.D6.b) d6).f5771a);
        } else if (d6 instanceof com.plaid.internal.D6.d) {
            intent.putExtra("redirect_error", true);
            intent.putExtra("redirect_error_exception", ((com.plaid.internal.D6.d) d6).f5772a);
        } else if (d6 instanceof com.plaid.internal.D6.e) {
            intent.putExtra("link_resume_redirect", true);
        }
        linkRedirectActivity.startActivity(intent);
        return kotlin.Unit.INSTANCE;
    }
}
