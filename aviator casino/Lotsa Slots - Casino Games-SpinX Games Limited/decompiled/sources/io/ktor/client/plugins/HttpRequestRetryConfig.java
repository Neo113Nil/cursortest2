package io.ktor.client.plugins;

/* compiled from: HttpRequestRetry.kt */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J,\u0010\u000b\u001a\u00020\u00042\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001cJE\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00132,\u0010\n\u001a(\u0012\u0004\u0012\u00020\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b$\u0010%J+\u0010(\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J?\u0010.\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/J1\u00101\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000400\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b1\u0010\fJ\u0017\u00102\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b2\u00103R?\u00104\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R?\u0010:\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R9\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020#0\u0006¢\u0006\u0002\b\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b$\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\fR>\u00101\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000400\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010=\u001a\u0004\bA\u0010?\"\u0004\bB\u0010\fR0\u0010\u0014\u001a!\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\u0002\b\t8F¢\u0006\u0006\u001a\u0004\bC\u00107R0\u0010\u0017\u001a!\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\u0002\b\t8F¢\u0006\u0006\u001a\u0004\bD\u00107RR\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\t2\u001d\u0010E\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bF\u0010?R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u001c¨\u0006K"}, d2 = {"Lio/ktor/client/plugins/HttpRequestRetryConfig;", "", "<init>", "()V", "", "noRetry", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ExtensionFunctionType;", "block", "modifyRequest", "(Lkotlin/jvm/functions/Function2;)V", "", "maxRetries", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRetryShouldRetryContext;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "", "retryIf", "(ILkotlin/jvm/functions/Function3;)V", "", "retryOnExceptionIf", "retryOnTimeout", "retryOnException", "(IZ)V", "retryOnServerErrors", "(I)V", "retryOnExceptionOrServerErrors", "respectRetryAfterHeader", "Lio/ktor/client/plugins/HttpRetryDelayContext;", "Lkotlin/ParameterName;", "name", "retry", "", "delayMillis", "(ZLkotlin/jvm/functions/Function2;)V", "millis", "randomizationMs", "constantDelay", "(JJZ)V", "", "base", "baseDelayMs", "maxDelayMs", "exponentialDelay", "(DJJJZ)V", "Lkotlin/coroutines/Continuation;", "delay", "randomMs", "(J)J", "shouldRetry", "Lkotlin/jvm/functions/Function3;", "getShouldRetry$ktor_client_core", "()Lkotlin/jvm/functions/Function3;", "setShouldRetry$ktor_client_core", "(Lkotlin/jvm/functions/Function3;)V", "shouldRetryOnException", "getShouldRetryOnException$ktor_client_core", "setShouldRetryOnException$ktor_client_core", "Lkotlin/jvm/functions/Function2;", "getDelayMillis$ktor_client_core", "()Lkotlin/jvm/functions/Function2;", "setDelayMillis$ktor_client_core", "getDelay$ktor_client_core", "setDelay$ktor_client_core", "getRetryIf", "getRetryOnExceptionIf", "value", "getModifyRequest", "I", "getMaxRetries", "()I", "setMaxRetries", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestRetryConfig {
    public kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> delayMillis;
    private int maxRetries;
    public kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> shouldRetry;
    public kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> shouldRetryOnException;
    private kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> delay = new io.ktor.client.plugins.HttpRequestRetryConfig$delay$1(null);
    private kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryModifyRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> modifyRequest = new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit modifyRequest$lambda$0;
            modifyRequest$lambda$0 = io.ktor.client.plugins.HttpRequestRetryConfig.modifyRequest$lambda$0((io.ktor.client.plugins.HttpRetryModifyRequestContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2);
            return modifyRequest$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean noRetry$lambda$1(io.ktor.client.plugins.HttpRetryShouldRetryContext httpRetryShouldRetryContext, io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryShouldRetryContext, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean noRetry$lambda$2(io.ktor.client.plugins.HttpRetryShouldRetryContext httpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryShouldRetryContext, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "<unused var>");
        return false;
    }

    public HttpRequestRetryConfig() {
        retryOnExceptionOrServerErrors(3);
        exponentialDelay$default(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public final kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> getShouldRetry$ktor_client_core() {
        kotlin.jvm.functions.Function3 function3 = this.shouldRetry;
        if (function3 != null) {
            return function3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("shouldRetry");
        return null;
    }

    public final void setShouldRetry$ktor_client_core(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.shouldRetry = function3;
    }

    public final kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> getShouldRetryOnException$ktor_client_core() {
        kotlin.jvm.functions.Function3 function3 = this.shouldRetryOnException;
        if (function3 != null) {
            return function3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("shouldRetryOnException");
        return null;
    }

    public final void setShouldRetryOnException$ktor_client_core(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.shouldRetryOnException = function3;
    }

    public final kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> getDelayMillis$ktor_client_core() {
        kotlin.jvm.functions.Function2 function2 = this.delayMillis;
        if (function2 != null) {
            return function2;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("delayMillis");
        return null;
    }

    public final void setDelayMillis$ktor_client_core(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.delayMillis = function2;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getDelay$ktor_client_core() {
        return this.delay;
    }

    public final void setDelay$ktor_client_core(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.delay = function2;
    }

    public final kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> getRetryIf() {
        if (this.shouldRetry != null) {
            return getShouldRetry$ktor_client_core();
        }
        return null;
    }

    public final kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> getRetryOnExceptionIf() {
        if (this.shouldRetryOnException != null) {
            return getShouldRetryOnException$ktor_client_core();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit modifyRequest$lambda$0(io.ktor.client.plugins.HttpRetryModifyRequestContext httpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryModifyRequestContext, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> getModifyRequest() {
        return this.modifyRequest;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final void setMaxRetries(int i) {
        this.maxRetries = i;
    }

    public final void noRetry() {
        this.maxRetries = 0;
        setShouldRetry$ktor_client_core(new kotlin.jvm.functions.Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                boolean noRetry$lambda$1;
                noRetry$lambda$1 = io.ktor.client.plugins.HttpRequestRetryConfig.noRetry$lambda$1((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequest) obj2, (io.ktor.client.statement.HttpResponse) obj3);
                return java.lang.Boolean.valueOf(noRetry$lambda$1);
            }
        });
        setShouldRetryOnException$ktor_client_core(new kotlin.jvm.functions.Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                boolean noRetry$lambda$2;
                noRetry$lambda$2 = io.ktor.client.plugins.HttpRequestRetryConfig.noRetry$lambda$2((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2, (java.lang.Throwable) obj3);
                return java.lang.Boolean.valueOf(noRetry$lambda$2);
            }
        });
    }

    public final void modifyRequest(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryModifyRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.modifyRequest = block;
    }

    public static /* synthetic */ void retryIf$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, int i, kotlin.jvm.functions.Function3 function3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        httpRequestRetryConfig.retryIf(i, function3);
    }

    public final void retryIf(int maxRetries, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (maxRetries != -1) {
            this.maxRetries = maxRetries;
        }
        setShouldRetry$ktor_client_core(block);
    }

    public static /* synthetic */ void retryOnExceptionIf$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, int i, kotlin.jvm.functions.Function3 function3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        httpRequestRetryConfig.retryOnExceptionIf(i, function3);
    }

    public final void retryOnExceptionIf(int maxRetries, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (maxRetries != -1) {
            this.maxRetries = maxRetries;
        }
        setShouldRetryOnException$ktor_client_core(block);
    }

    public static /* synthetic */ void retryOnException$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        httpRequestRetryConfig.retryOnException(i, z);
    }

    public final void retryOnException(int maxRetries, final boolean retryOnTimeout) {
        retryOnExceptionIf(maxRetries, new kotlin.jvm.functions.Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                boolean retryOnException$lambda$3;
                retryOnException$lambda$3 = io.ktor.client.plugins.HttpRequestRetryConfig.retryOnException$lambda$3(retryOnTimeout, (io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2, (java.lang.Throwable) obj3);
                return java.lang.Boolean.valueOf(retryOnException$lambda$3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryOnException$lambda$3(boolean z, io.ktor.client.plugins.HttpRetryShouldRetryContext retryOnExceptionIf, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable cause) {
        boolean isTimeoutException;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryOnExceptionIf, "$this$retryOnExceptionIf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        isTimeoutException = io.ktor.client.plugins.HttpRequestRetryKt.isTimeoutException(cause);
        return isTimeoutException ? z : !(cause instanceof java.util.concurrent.CancellationException);
    }

    public static /* synthetic */ void retryOnServerErrors$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        httpRequestRetryConfig.retryOnServerErrors(i);
    }

    public final void retryOnServerErrors(int maxRetries) {
        retryIf(maxRetries, new kotlin.jvm.functions.Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                boolean retryOnServerErrors$lambda$5;
                retryOnServerErrors$lambda$5 = io.ktor.client.plugins.HttpRequestRetryConfig.retryOnServerErrors$lambda$5((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequest) obj2, (io.ktor.client.statement.HttpResponse) obj3);
                return java.lang.Boolean.valueOf(retryOnServerErrors$lambda$5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryOnServerErrors$lambda$5(io.ktor.client.plugins.HttpRetryShouldRetryContext retryIf, io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryIf, "$this$retryIf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        int value = response.getStatus().getValue();
        return 500 <= value && value < 600;
    }

    public static /* synthetic */ void retryOnExceptionOrServerErrors$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        httpRequestRetryConfig.retryOnExceptionOrServerErrors(i);
    }

    public final void retryOnExceptionOrServerErrors(int maxRetries) {
        retryOnServerErrors(maxRetries);
        retryOnException$default(this, maxRetries, false, 2, null);
    }

    public static /* synthetic */ void delayMillis$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        httpRequestRetryConfig.delayMillis(z, function2);
    }

    public final void delayMillis(final boolean respectRetryAfterHeader, final kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        setDelayMillis$ktor_client_core(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                long delayMillis$lambda$6;
                delayMillis$lambda$6 = io.ktor.client.plugins.HttpRequestRetryConfig.delayMillis$lambda$6(respectRetryAfterHeader, block, (io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue());
                return java.lang.Long.valueOf(delayMillis$lambda$6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long delayMillis$lambda$6(boolean z, kotlin.jvm.functions.Function2 function2, io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext, int i) {
        io.ktor.http.Headers headers;
        java.lang.String str;
        java.lang.Long longOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryDelayContext, "<this>");
        if (z) {
            io.ktor.client.statement.HttpResponse response = httpRetryDelayContext.getResponse();
            java.lang.Long valueOf = (response == null || (headers = response.getHeaders()) == null || (str = headers.get(io.ktor.http.HttpHeaders.INSTANCE.getRetryAfter())) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str)) == null) ? null : java.lang.Long.valueOf(longOrNull.longValue() * 1000);
            return java.lang.Math.max(((java.lang.Number) function2.invoke(httpRetryDelayContext, java.lang.Integer.valueOf(i))).longValue(), valueOf != null ? valueOf.longValue() : 0L);
        }
        return ((java.lang.Number) function2.invoke(httpRetryDelayContext, java.lang.Integer.valueOf(i))).longValue();
    }

    public static /* synthetic */ void constantDelay$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, long j, long j2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        httpRequestRetryConfig.constantDelay(j, j2, z);
    }

    public final void constantDelay(final long millis, final long randomizationMs, boolean respectRetryAfterHeader) {
        if (millis <= 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (randomizationMs < 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        delayMillis(respectRetryAfterHeader, new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                long constantDelay$lambda$7;
                constantDelay$lambda$7 = io.ktor.client.plugins.HttpRequestRetryConfig.constantDelay$lambda$7(millis, this, randomizationMs, (io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue());
                return java.lang.Long.valueOf(constantDelay$lambda$7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constantDelay$lambda$7(long j, io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, long j2, io.ktor.client.plugins.HttpRetryDelayContext delayMillis, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return j + httpRequestRetryConfig.randomMs(j2);
    }

    public static /* synthetic */ void exponentialDelay$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, double d, long j, long j2, long j3, boolean z, int i, java.lang.Object obj) {
        httpRequestRetryConfig.exponentialDelay((i & 1) != 0 ? 2.0d : d, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? 60000L : j2, (i & 8) == 0 ? j3 : 1000L, (i & 16) != 0 ? true : z);
    }

    public final void exponentialDelay(final double base, final long baseDelayMs, final long maxDelayMs, final long randomizationMs, boolean respectRetryAfterHeader) {
        if (base <= 0.0d) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (baseDelayMs <= 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (maxDelayMs <= 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (randomizationMs < 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        delayMillis(respectRetryAfterHeader, new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                long exponentialDelay$lambda$8;
                exponentialDelay$lambda$8 = io.ktor.client.plugins.HttpRequestRetryConfig.exponentialDelay$lambda$8(base, baseDelayMs, maxDelayMs, this, randomizationMs, (io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue());
                return java.lang.Long.valueOf(exponentialDelay$lambda$8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long exponentialDelay$lambda$8(double d, long j, long j2, io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, long j3, io.ktor.client.plugins.HttpRetryDelayContext delayMillis, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return java.lang.Math.min((long) (java.lang.Math.pow(d, i - 1) * j), j2) + httpRequestRetryConfig.randomMs(j3);
    }

    public final void delay(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.delay = block;
    }

    private final long randomMs(long randomizationMs) {
        if (randomizationMs == 0) {
            return 0L;
        }
        return kotlin.random.Random.INSTANCE.nextLong(randomizationMs);
    }
}
