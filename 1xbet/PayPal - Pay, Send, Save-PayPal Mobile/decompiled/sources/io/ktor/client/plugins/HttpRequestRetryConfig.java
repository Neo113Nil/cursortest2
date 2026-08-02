package io.ktor.client.plugins;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J,\u0010\u000b\u001a\u00020\u00042\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001cJ;\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00132\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u001f\u0012\t\u0012\u00070\r¢\u0006\u0002\b \u0012\u0004\u0012\u00020!0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'J?\u0010,\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J1\u0010/\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040.\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b/\u0010\fR?\u00100\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R?\u00106\u001a\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0002\b\t8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R9\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0\u0006¢\u0006\u0002\b\t8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\"\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\fR>\u0010/\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040.\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b/\u00109\u001a\u0004\b=\u0010;\"\u0004\b>\u0010\fR0\u0010\u0014\u001a!\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\u0002\b\t8G¢\u0006\u0006\u001a\u0004\b?\u00103R0\u0010\u0017\u001a!\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\u0002\b\t8G¢\u0006\u0006\u001a\u0004\b@\u00103RM\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\t2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bB\u0010;R\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001c"}, d2 = {"Lio/ktor/client/plugins/HttpRequestRetryConfig;", "", "<init>", "()V", "", "noRetry", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ExtensionFunctionType;", "block", "modifyRequest", "(Lkotlin/jvm/functions/Function2;)V", "", "maxRetries", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRetryShouldRetryContext;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "", "retryIf", "(ILkotlin/jvm/functions/Function3;)V", "", "retryOnExceptionIf", "retryOnTimeout", "retryOnException", "(IZ)V", "retryOnServerErrors", "(I)V", "retryOnExceptionOrServerErrors", "respectRetryAfterHeader", "Lio/ktor/client/plugins/HttpRetryDelayContext;", "Lkotlin/ParameterName;", "", "delayMillis", "(ZLkotlin/jvm/functions/Function2;)V", "millis", "randomizationMs", "constantDelay", "(JJZ)V", "", "base", "baseDelayMs", "maxDelayMs", "exponentialDelay", "(DJJJZ)V", "Lkotlin/coroutines/Continuation;", "delay", "shouldRetry", "Lkotlin/jvm/functions/Function3;", "getShouldRetry$ktor_client_core", "()Lkotlin/jvm/functions/Function3;", "setShouldRetry$ktor_client_core", "(Lkotlin/jvm/functions/Function3;)V", "shouldRetryOnException", "getShouldRetryOnException$ktor_client_core", "setShouldRetryOnException$ktor_client_core", "Lkotlin/jvm/functions/Function2;", "getDelayMillis$ktor_client_core", "()Lkotlin/jvm/functions/Function2;", "setDelayMillis$ktor_client_core", "getDelay$ktor_client_core", "setDelay$ktor_client_core", "getRetryIf", "getRetryOnExceptionIf", "p0", "getModifyRequest", com.visa.cbp.getEncExpo.warmup, "getMaxRetries", "()I", "setMaxRetries"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpRequestRetryConfig {
    public kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> delayMillis;
    private int maxRetries;
    public kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> shouldRetry;
    public kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> shouldRetryOnException;
    private kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> delay = new io.ktor.client.plugins.HttpRequestRetryConfig$delay$1(null);
    private kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryModifyRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> modifyRequest = new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return io.ktor.client.plugins.HttpRequestRetryConfig.m23255$r8$lambda$tIDFBK2cEc0esrreKakKnFik3k((io.ktor.client.plugins.HttpRetryModifyRequestContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2);
        }
    };

    public HttpRequestRetryConfig() {
        retryOnExceptionOrServerErrors(3);
        exponentialDelay$default(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public final kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> getShouldRetry$ktor_client_core() {
        kotlin.jvm.functions.Function3 function3 = this.shouldRetry;
        if (function3 != null) {
            return function3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setShouldRetry$ktor_client_core(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        this.shouldRetry = function3;
    }

    public final kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> getShouldRetryOnException$ktor_client_core() {
        kotlin.jvm.functions.Function3 function3 = this.shouldRetryOnException;
        if (function3 != null) {
            return function3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setShouldRetryOnException$ktor_client_core(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        this.shouldRetryOnException = function3;
    }

    public final kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> getDelayMillis$ktor_client_core() {
        kotlin.jvm.functions.Function2 function2 = this.delayMillis;
        if (function2 != null) {
            return function2;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setDelayMillis$ktor_client_core(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.delayMillis = function2;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getDelay$ktor_client_core() {
        return this.delay;
    }

    public final void setDelay$ktor_client_core(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
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
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.$r8$lambda$rwEjD7lCnMvcnVjhB9VPEx4FUxg((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequest) obj2, (io.ktor.client.statement.HttpResponse) obj3));
            }
        });
        setShouldRetryOnException$ktor_client_core(new kotlin.jvm.functions.Function3() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.$r8$lambda$y6vQSD1DItx_eOUP78geBhshpco((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2, (java.lang.Throwable) obj3));
            }
        });
    }

    public final void modifyRequest(kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryModifyRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.modifyRequest = block;
    }

    public static /* synthetic */ void retryIf$default(io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, int i, kotlin.jvm.functions.Function3 function3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        httpRequestRetryConfig.retryIf(i, function3);
    }

    public final void retryIf(int maxRetries, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
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
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.$r8$lambda$0mrNQhf11j4LNa5e2_7XCtd8MLA(retryOnTimeout, (io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2, (java.lang.Throwable) obj3));
            }
        });
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
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.$r8$lambda$H6KfsCKfjuoA39OvKhgWXz9xo30((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequest) obj2, (io.ktor.client.statement.HttpResponse) obj3));
            }
        });
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        setDelayMillis$ktor_client_core(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.HttpRequestRetryConfig$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.m23254$r8$lambda$lacASDXIoz5jEcC5ygD8WGg2qQ(respectRetryAfterHeader, block, (io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue()));
            }
        });
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
                return java.lang.Long.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.$r8$lambda$8eeLbvHPGf5Qo8Gw3yk3q4CLaog(millis, this, randomizationMs, (io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue()));
            }
        });
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
                return java.lang.Long.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.m23253$r8$lambda$eXZQrRZkEApFpSK08ohaHi6B6s(base, baseDelayMs, maxDelayMs, this, randomizationMs, (io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue()));
            }
        });
    }

    public final void delay(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.delay = block;
    }

    public static /* synthetic */ boolean $r8$lambda$0mrNQhf11j4LNa5e2_7XCtd8MLA(boolean z, io.ktor.client.plugins.HttpRetryShouldRetryContext httpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryShouldRetryContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        return io.ktor.client.plugins.HttpRequestRetryKt.access$isTimeoutException(th) ? z : !(th instanceof java.util.concurrent.CancellationException);
    }

    public static /* synthetic */ long $r8$lambda$8eeLbvHPGf5Qo8Gw3yk3q4CLaog(long j, io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, long j2, io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryDelayContext, "");
        return j + (j2 != 0 ? kotlin.random.Random.INSTANCE.nextLong(j2) : 0L);
    }

    public static /* synthetic */ boolean $r8$lambda$H6KfsCKfjuoA39OvKhgWXz9xo30(io.ktor.client.plugins.HttpRetryShouldRetryContext httpRetryShouldRetryContext, io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryShouldRetryContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        int value = httpResponse.getStatus().getValue();
        return 500 <= value && value < 600;
    }

    /* renamed from: $r8$lambda$eXZQrRZkEApFpSK08-ohaHi6B6s, reason: not valid java name */
    public static /* synthetic */ long m23253$r8$lambda$eXZQrRZkEApFpSK08ohaHi6B6s(double d, long j, long j2, io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig, long j3, io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryDelayContext, "");
        return java.lang.Math.min((long) (java.lang.Math.pow(d, i - 1) * j), j2) + (j3 != 0 ? kotlin.random.Random.INSTANCE.nextLong(j3) : 0L);
    }

    /* renamed from: $r8$lambda$l-acASDXIoz5jEcC5ygD8WGg2qQ, reason: not valid java name */
    public static /* synthetic */ long m23254$r8$lambda$lacASDXIoz5jEcC5ygD8WGg2qQ(boolean z, kotlin.jvm.functions.Function2 function2, io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext, int i) {
        io.ktor.http.Headers headers;
        java.lang.String str;
        java.lang.Long longOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryDelayContext, "");
        if (!z) {
            return ((java.lang.Number) function2.invoke(httpRetryDelayContext, java.lang.Integer.valueOf(i))).longValue();
        }
        io.ktor.client.statement.HttpResponse response = httpRetryDelayContext.getResponse();
        java.lang.Long valueOf = (response == null || (headers = response.getHeaders()) == null || (str = headers.get(io.ktor.http.HttpHeaders.INSTANCE.getRetryAfter())) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str)) == null) ? null : java.lang.Long.valueOf(longOrNull.longValue() * 1000);
        return java.lang.Math.max(((java.lang.Number) function2.invoke(httpRetryDelayContext, java.lang.Integer.valueOf(i))).longValue(), valueOf != null ? valueOf.longValue() : 0L);
    }

    public static /* synthetic */ boolean $r8$lambda$rwEjD7lCnMvcnVjhB9VPEx4FUxg(io.ktor.client.plugins.HttpRetryShouldRetryContext httpRetryShouldRetryContext, io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryShouldRetryContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        return false;
    }

    /* renamed from: $r8$lambda$tIDFBK2cEc0esrreKakKnF-ik3k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23255$r8$lambda$tIDFBK2cEc0esrreKakKnFik3k(io.ktor.client.plugins.HttpRetryModifyRequestContext httpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryModifyRequestContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$y6vQSD1DItx_eOUP78geBhshpco(io.ktor.client.plugins.HttpRetryShouldRetryContext httpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRetryShouldRetryContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        return false;
    }
}
