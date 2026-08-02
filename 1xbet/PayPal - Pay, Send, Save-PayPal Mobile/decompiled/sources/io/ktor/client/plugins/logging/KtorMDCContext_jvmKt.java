package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "MDCContext", "()Lkotlin/coroutines/CoroutineContext$Element;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KtorMDCContext_jvmKt {
    @io.ktor.utils.io.InternalAPI
    public static final kotlin.coroutines.CoroutineContext.Element MDCContext() {
        return new kotlinx.coroutines.slf4j.MDCContext(null, 1, null);
    }
}
