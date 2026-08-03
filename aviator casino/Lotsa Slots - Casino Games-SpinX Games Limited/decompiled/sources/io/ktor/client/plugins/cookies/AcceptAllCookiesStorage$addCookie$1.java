package io.ktor.client.plugins.cookies;

/* compiled from: AcceptAllCookiesStorage.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {79}, m = "addCookie", n = {com.ironsource.mediationsdk.utils.IronSourceConstants.REQUEST_URL, "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class AcceptAllCookiesStorage$addCookie$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.plugins.cookies.AcceptAllCookiesStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcceptAllCookiesStorage$addCookie$1(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage acceptAllCookiesStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1> continuation) {
        super(continuation);
        this.this$0 = acceptAllCookiesStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addCookie(null, null, this);
    }
}
