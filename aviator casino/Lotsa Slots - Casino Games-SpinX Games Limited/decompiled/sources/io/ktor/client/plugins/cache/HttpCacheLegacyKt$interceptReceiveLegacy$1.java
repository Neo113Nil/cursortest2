package io.ktor.client.plugins.cache;

/* compiled from: HttpCacheLegacy.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {0}, l = {61, 62, 82}, m = "interceptReceiveLegacy", n = {"$this$interceptReceiveLegacy"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class HttpCacheLegacyKt$interceptReceiveLegacy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    HttpCacheLegacyKt$interceptReceiveLegacy$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptReceiveLegacy(null, null, null, null, this);
    }
}
