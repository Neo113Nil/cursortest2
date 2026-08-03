package io.ktor.client.engine;

/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\u001aW\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080H¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\" \u0010\u0018\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", com.ironsource.X3.i.W, "value", "", "block", "mergeHeaders", "(Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "callContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "callJob", "attachToUserJob", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "needUserAgent", "()Z", "KTOR_DEFAULT_USER_AGENT", "Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT", "()Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT$annotations", "()V", "", "DATE_HEADERS", "Ljava/util/Set;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UtilsKt {
    private static final java.util.Set<java.lang.String> DATE_HEADERS = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{io.ktor.http.HttpHeaders.INSTANCE.getDate(), io.ktor.http.HttpHeaders.INSTANCE.getExpires(), io.ktor.http.HttpHeaders.INSTANCE.getLastModified(), io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), io.ktor.http.HttpHeaders.INSTANCE.getIfUnmodifiedSince()});
    private static final java.lang.String KTOR_DEFAULT_USER_AGENT = "ktor-client";

    public static /* synthetic */ void getKTOR_DEFAULT_USER_AGENT$annotations() {
    }

    public static final java.lang.String getKTOR_DEFAULT_USER_AGENT() {
        return KTOR_DEFAULT_USER_AGENT;
    }

    public static final void mergeHeaders(final io.ktor.http.Headers requestHeaders, final io.ktor.http.content.OutgoingContent content, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> block) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.utils.HeadersKt.buildHeaders(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit mergeHeaders$lambda$0;
                mergeHeaders$lambda$0 = io.ktor.client.engine.UtilsKt.mergeHeaders$lambda$0(io.ktor.http.Headers.this, content, (io.ktor.http.HeadersBuilder) obj);
                return mergeHeaders$lambda$0;
            }
        }).forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.engine.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit mergeHeaders$lambda$2;
                mergeHeaders$lambda$2 = io.ktor.client.engine.UtilsKt.mergeHeaders$lambda$2(kotlin.jvm.functions.Function2.this, (java.lang.String) obj, (java.util.List) obj2);
                return mergeHeaders$lambda$2;
            }
        });
        if (requestHeaders.get(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent()) == null && content.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent()) == null && needUserAgent()) {
            block.invoke(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent(), KTOR_DEFAULT_USER_AGENT);
        }
        io.ktor.http.ContentType contentType = content.getContentType();
        if ((contentType == null || (str = contentType.toString()) == null) && (str = content.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType())) == null) {
            str = requestHeaders.get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        }
        java.lang.Long contentLength = content.getContentLength();
        if ((contentLength == null || (str2 = contentLength.toString()) == null) && (str2 = content.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) == null) {
            str2 = requestHeaders.get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        }
        if (str != null) {
            block.invoke(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), str);
        }
        if (str2 != null) {
            block.invoke(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit mergeHeaders$lambda$0(io.ktor.http.Headers headers, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.http.HeadersBuilder buildHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
        buildHeaders.appendAll(headers);
        buildHeaders.appendAll(outgoingContent.getHeaders());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit mergeHeaders$lambda$2(kotlin.jvm.functions.Function2 function2, java.lang.String key, java.util.List values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), key) && !kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), key)) {
            if (!DATE_HEADERS.contains(key)) {
                function2.invoke(key, kotlin.collections.CollectionsKt.joinToString$default(values, kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), key) ? "; " : ",", null, null, 0, null, null, 62, null));
            } else {
                java.util.Iterator it = values.iterator();
                while (it.hasNext()) {
                    function2.invoke(key, (java.lang.String) it.next());
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object callContext(kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> continuation) {
        kotlin.coroutines.CoroutineContext.Element element = continuation.get$context().get(io.ktor.client.engine.KtorCallContextElement.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        return ((io.ktor.client.engine.KtorCallContextElement) element).getCallContext();
    }

    public static final java.lang.Object attachToUserJob(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) continuation.get$context().get(kotlinx.coroutines.Job.INSTANCE);
        if (job2 == null) {
            return kotlin.Unit.INSTANCE;
        }
        job.invokeOnCompletion(new io.ktor.client.engine.UtilsKt$attachToUserJob$2(kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1(job), 2, null)));
        return kotlin.Unit.INSTANCE;
    }

    private static final java.lang.Object attachToUserJob$$forInline(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    private static final boolean needUserAgent() {
        return !io.ktor.util.PlatformUtils.INSTANCE.getIS_BROWSER();
    }
}
