package io.ktor.client.engine;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpHeaders;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: HttpClientEngine.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"$\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "nested", "config", "(Lio/ktor/client/engine/HttpClientEngineFactory;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/Job;", "parentJob", "Lkotlin/coroutines/CoroutineContext;", "createCallContext", "(Lio/ktor/client/engine/HttpClientEngine;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestData;", "request", "validateHeaders", "(Lio/ktor/client/request/HttpRequestData;)V", "Lkotlinx/coroutines/CoroutineName;", "CALL_COROUTINE", "Lkotlinx/coroutines/CoroutineName;", "getCALL_COROUTINE", "()Lkotlinx/coroutines/CoroutineName;", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClientConfig;", "CLIENT_CONFIG", "Lio/ktor/util/AttributeKey;", "getCLIENT_CONFIG", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpClientEngineKt {
    private static final CoroutineName CALL_COROUTINE = new CoroutineName("call-context");
    private static final AttributeKey<HttpClientConfig<?>> CLIENT_CONFIG;

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpClientConfig.class);
        try {
            kType = Reflection.typeOf(HttpClientConfig.class, KTypeProjection.INSTANCE.getSTAR());
        } catch (Throwable unused) {
            kType = null;
        }
        CLIENT_CONFIG = new AttributeKey<>("client-config", new TypeInfo(orCreateKotlinClass, kType));
    }

    public static final CoroutineName getCALL_COROUTINE() {
        return CALL_COROUTINE;
    }

    public static final AttributeKey<HttpClientConfig<?>> getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    public static final <T extends HttpClientEngineConfig> HttpClientEngineFactory<T> config(HttpClientEngineFactory<? extends T> httpClientEngineFactory, Function1<? super T, Unit> nested) {
        Intrinsics.checkNotNullParameter(httpClientEngineFactory, "<this>");
        Intrinsics.checkNotNullParameter(nested, "nested");
        return new HttpClientEngineKt$config$1(httpClientEngineFactory, nested);
    }

    public static final Object createCallContext(HttpClientEngine httpClientEngine, Job job, Continuation<? super CoroutineContext> continuation) {
        CompletableJob Job = JobKt.Job(job);
        CoroutineContext plus = httpClientEngine.getCoroutineContext().plus(Job).plus(CALL_COROUTINE);
        Job job2 = (Job) continuation.get$context().get(Job.INSTANCE);
        if (job2 != null) {
            CompletableJob completableJob = Job;
            completableJob.invokeOnCompletion(new UtilsKt$attachToUserJob$2(Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new UtilsKt$attachToUserJob$cleanupHandler$1(completableJob), 2, null)));
        }
        return plus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateHeaders(HttpRequestData httpRequestData) {
        Set<String> names = httpRequestData.getHeaders().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : names) {
            if (HttpHeaders.INSTANCE.getUnsafeHeadersList().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            throw new UnsafeHeaderException(arrayList2.toString());
        }
    }
}
