package io.ktor.client.engine;

/* compiled from: HttpClientEngine.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"$\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "nested", com.helpshift.proactive.InAppViewConstants.CONFIG, "(Lio/ktor/client/engine/HttpClientEngineFactory;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/Job;", "parentJob", "Lkotlin/coroutines/CoroutineContext;", "createCallContext", "(Lio/ktor/client/engine/HttpClientEngine;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestData;", "request", "validateHeaders", "(Lio/ktor/client/request/HttpRequestData;)V", "Lkotlinx/coroutines/CoroutineName;", "CALL_COROUTINE", "Lkotlinx/coroutines/CoroutineName;", "getCALL_COROUTINE", "()Lkotlinx/coroutines/CoroutineName;", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClientConfig;", "CLIENT_CONFIG", "Lio/ktor/util/AttributeKey;", "getCLIENT_CONFIG", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientEngineKt {
    private static final kotlinx.coroutines.CoroutineName CALL_COROUTINE = new kotlinx.coroutines.CoroutineName("call-context");
    private static final io.ktor.util.AttributeKey<io.ktor.client.HttpClientConfig<?>> CLIENT_CONFIG;

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.HttpClientConfig.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.HttpClientConfig.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR());
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        CLIENT_CONFIG = new io.ktor.util.AttributeKey<>("client-config", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public static final kotlinx.coroutines.CoroutineName getCALL_COROUTINE() {
        return CALL_COROUTINE;
    }

    public static final io.ktor.util.AttributeKey<io.ktor.client.HttpClientConfig<?>> getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    public static final <T extends io.ktor.client.engine.HttpClientEngineConfig> io.ktor.client.engine.HttpClientEngineFactory<T> config(io.ktor.client.engine.HttpClientEngineFactory<? extends T> httpClientEngineFactory, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> nested) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineFactory, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nested, "nested");
        return new io.ktor.client.engine.HttpClientEngineKt$config$1(httpClientEngineFactory, nested);
    }

    public static final java.lang.Object createCallContext(io.ktor.client.engine.HttpClientEngine httpClientEngine, kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> continuation) {
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job(job);
        kotlin.coroutines.CoroutineContext plus = httpClientEngine.getCoroutineContext().plus(Job).plus(CALL_COROUTINE);
        kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) continuation.get$context().get(kotlinx.coroutines.Job.INSTANCE);
        if (job2 != null) {
            kotlinx.coroutines.CompletableJob completableJob = Job;
            completableJob.invokeOnCompletion(new io.ktor.client.engine.UtilsKt$attachToUserJob$2(kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1(completableJob), 2, null)));
        }
        return plus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateHeaders(io.ktor.client.request.HttpRequestData httpRequestData) {
        java.util.Set<java.lang.String> names = httpRequestData.getHeaders().names();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : names) {
            if (io.ktor.http.HttpHeaders.INSTANCE.getUnsafeHeadersList().contains((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            throw new io.ktor.http.UnsafeHeaderException(arrayList2.toString());
        }
    }
}
