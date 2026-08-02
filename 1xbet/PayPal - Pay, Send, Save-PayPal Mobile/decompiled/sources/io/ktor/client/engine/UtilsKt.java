package io.ktor.client.engine;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0080H¢\u0006\u0004\b\u0010\u0010\u0011\" \u0010\u0012\u001a\u00020\u00058\u0007X\u0086D¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "", "block", "mergeHeaders", "(Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "callContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "callJob", "attachToUserJob", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KTOR_DEFAULT_USER_AGENT", "Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT", "()Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT$annotations", "()V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtilsKt {
    private static final java.lang.String KTOR_DEFAULT_USER_AGENT = "ktor-client";
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{io.ktor.http.HttpHeaders.INSTANCE.getDate(), io.ktor.http.HttpHeaders.INSTANCE.getExpires(), io.ktor.http.HttpHeaders.INSTANCE.getLastModified(), io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), io.ktor.http.HttpHeaders.INSTANCE.getIfUnmodifiedSince()});

    public static /* synthetic */ void getKTOR_DEFAULT_USER_AGENT$annotations() {
    }

    public static final java.lang.String getKTOR_DEFAULT_USER_AGENT() {
        return KTOR_DEFAULT_USER_AGENT;
    }

    public static final void mergeHeaders(final io.ktor.http.Headers headers, final io.ktor.http.content.OutgoingContent outgoingContent, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        io.ktor.client.utils.HeadersKt.buildHeaders(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.UtilsKt.$r8$lambda$sRuPTU1qnhEK71AvJT3gnKWmluM(io.ktor.http.Headers.this, outgoingContent, (io.ktor.http.HeadersBuilder) obj);
            }
        }).forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.engine.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return io.ktor.client.engine.UtilsKt.$r8$lambda$6FWKUOZYtdPuvU4iegGG7ORX7ys(kotlin.jvm.functions.Function2.this, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
        if (headers.get(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent()) == null && outgoingContent.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent()) == null && (!io.ktor.util.PlatformUtils.INSTANCE.getIS_BROWSER())) {
            function2.invoke(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent(), KTOR_DEFAULT_USER_AGENT);
        }
        io.ktor.http.ContentType contentType = outgoingContent.getContentType();
        if ((contentType == null || (str = contentType.toString()) == null) && (str = outgoingContent.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType())) == null) {
            str = headers.get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        }
        java.lang.Long contentLength = outgoingContent.getContentLength();
        if ((contentLength == null || (str2 = contentLength.toString()) == null) && (str2 = outgoingContent.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) == null) {
            str2 = headers.get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        }
        if (str != null) {
            function2.invoke(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), str);
        }
        if (str2 != null) {
            function2.invoke(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), str2);
        }
    }

    public static final java.lang.Object callContext(kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> continuation) {
        kotlin.coroutines.CoroutineContext.Element element = continuation.getGetHighSpeedVideoSizes().get(io.ktor.client.engine.KtorCallContextElement.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        return ((io.ktor.client.engine.KtorCallContextElement) element).getCallContext();
    }

    public static final java.lang.Object attachToUserJob(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) continuation.getGetHighSpeedVideoSizes().get(kotlinx.coroutines.Job.INSTANCE);
        if (job2 == null) {
            return kotlin.Unit.INSTANCE;
        }
        job.invokeOnCompletion(new io.ktor.client.engine.UtilsKt$attachToUserJob$2(kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1(job), 2, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6FWKUOZYtdPuvU4iegGG7ORX7ys(kotlin.jvm.functions.Function2 function2, java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), str) && !kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), str)) {
            if (getHighSpeedVideoFpsRangesFor.contains(str)) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    function2.invoke(str, (java.lang.String) it.next());
                }
            } else {
                function2.invoke(str, kotlin.collections.CollectionsKt.joinToString$default(list, kotlin.jvm.internal.Intrinsics.areEqual(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), str) ? "; " : ",", null, null, 0, null, null, 62, null));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sRuPTU1qnhEK71AvJT3gnKWmluM(io.ktor.http.Headers headers, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.http.HeadersBuilder headersBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "");
        headersBuilder.appendAll(headers);
        headersBuilder.appendAll(outgoingContent.getHeaders());
        return kotlin.Unit.INSTANCE;
    }
}
