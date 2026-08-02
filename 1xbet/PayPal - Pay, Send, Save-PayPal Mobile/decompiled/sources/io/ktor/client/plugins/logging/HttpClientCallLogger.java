package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u00060\u0015j\u0002`\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00060\u0015j\u0002`\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Lio/ktor/client/plugins/logging/HttpClientCallLogger;", "", "Lio/ktor/client/plugins/logging/Logger;", "logger", "<init>", "(Lio/ktor/client/plugins/logging/Logger;)V", "", "message", "", "logRequest", "(Ljava/lang/String;)V", "logResponseHeader", "logResponseException", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logResponseBody", "closeRequestLog", "()V", "closeResponseLog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/client/plugins/logging/Logger;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/StringBuilder;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "getOutputFormats", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpClientCallLogger {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.client.plugins.logging.HttpClientCallLogger.class, "requestLogged");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.client.plugins.logging.HttpClientCallLogger.class, "responseLogged");

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.StringBuilder getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableJob getHighResolutionOutputSizeshNQ4ISI;
    private final io.ktor.client.plugins.logging.Logger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.StringBuilder getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableJob Camera2StreamConfigurationMap;
    private volatile /* synthetic */ int requestLogged;
    private volatile /* synthetic */ int responseLogged;

    public HttpClientCallLogger(io.ktor.client.plugins.logging.Logger logger) {
        kotlinx.coroutines.CompletableJob Job$default;
        kotlinx.coroutines.CompletableJob Job$default2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighSpeedVideoFpsRangesFor = logger;
        this.getHighSpeedVideoSizes = new java.lang.StringBuilder();
        this.getHighSpeedVideoFpsRanges = new java.lang.StringBuilder();
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.getHighResolutionOutputSizeshNQ4ISI = Job$default;
        Job$default2 = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.Camera2StreamConfigurationMap = Job$default2;
        this.requestLogged = 0;
        this.responseLogged = 0;
    }

    public final void logRequest(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.StringBuilder sb = this.getHighSpeedVideoSizes;
        sb.append(kotlin.text.StringsKt.trim(message).toString());
        sb.append('\n');
    }

    public final void logResponseHeader(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.StringBuilder sb = this.getHighSpeedVideoFpsRanges;
        sb.append(kotlin.text.StringsKt.trim(message).toString());
        sb.append('\n');
        this.Camera2StreamConfigurationMap.complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object logResponseException(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1 httpClientCallLogger$logResponseException$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1) {
            httpClientCallLogger$logResponseException$1 = (io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1) continuation;
            if ((httpClientCallLogger$logResponseException$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                httpClientCallLogger$logResponseException$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = httpClientCallLogger$logResponseException$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClientCallLogger$logResponseException$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableJob completableJob = this.getHighResolutionOutputSizeshNQ4ISI;
                    httpClientCallLogger$logResponseException$1.getHighSpeedVideoSizes = str;
                    httpClientCallLogger$logResponseException$1.Camera2StreamConfigurationMap = 1;
                    if (completableJob.join(httpClientCallLogger$logResponseException$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) httpClientCallLogger$logResponseException$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRangesFor.log(kotlin.text.StringsKt.trim(str).toString());
                return kotlin.Unit.INSTANCE;
            }
        }
        httpClientCallLogger$logResponseException$1 = new io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1(this, continuation);
        java.lang.Object obj2 = httpClientCallLogger$logResponseException$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClientCallLogger$logResponseException$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        this.getHighSpeedVideoFpsRangesFor.log(kotlin.text.StringsKt.trim(str).toString());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object logResponseBody(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1 httpClientCallLogger$logResponseBody$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1) {
            httpClientCallLogger$logResponseBody$1 = (io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1) continuation;
            if ((httpClientCallLogger$logResponseBody$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                httpClientCallLogger$logResponseBody$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = httpClientCallLogger$logResponseBody$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClientCallLogger$logResponseBody$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableJob completableJob = this.Camera2StreamConfigurationMap;
                    httpClientCallLogger$logResponseBody$1.Camera2StreamConfigurationMap = str;
                    httpClientCallLogger$logResponseBody$1.getHighSpeedVideoFpsRanges = 1;
                    if (completableJob.join(httpClientCallLogger$logResponseBody$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) httpClientCallLogger$logResponseBody$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRanges.append(str);
                return kotlin.Unit.INSTANCE;
            }
        }
        httpClientCallLogger$logResponseBody$1 = new io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1(this, continuation);
        java.lang.Object obj2 = httpClientCallLogger$logResponseBody$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClientCallLogger$logResponseBody$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        this.getHighSpeedVideoFpsRanges.append(str);
        return kotlin.Unit.INSTANCE;
    }

    public final void closeRequestLog() {
        if (Camera2StreamConfigurationMap.compareAndSet(this, 0, 1)) {
            try {
                java.lang.String obj = kotlin.text.StringsKt.trim(this.getHighSpeedVideoSizes).toString();
                if (obj.length() > 0) {
                    this.getHighSpeedVideoFpsRangesFor.log(obj);
                }
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI.complete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object closeResponseLog(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1 httpClientCallLogger$closeResponseLog$1;
        int i;
        java.lang.String obj;
        if (continuation instanceof io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1) {
            httpClientCallLogger$closeResponseLog$1 = (io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1) continuation;
            if ((httpClientCallLogger$closeResponseLog$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                httpClientCallLogger$closeResponseLog$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = httpClientCallLogger$closeResponseLog$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClientCallLogger$closeResponseLog$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (!getHighSpeedVideoSizes.compareAndSet(this, 0, 1)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.CompletableJob completableJob = this.getHighResolutionOutputSizeshNQ4ISI;
                    httpClientCallLogger$closeResponseLog$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (completableJob.join(httpClientCallLogger$closeResponseLog$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                obj = kotlin.text.StringsKt.trim(this.getHighSpeedVideoFpsRanges).toString();
                if (obj.length() > 0) {
                    this.getHighSpeedVideoFpsRangesFor.log(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpClientCallLogger$closeResponseLog$1 = new io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1(this, continuation);
        java.lang.Object obj22 = httpClientCallLogger$closeResponseLog$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClientCallLogger$closeResponseLog$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        obj = kotlin.text.StringsKt.trim(this.getHighSpeedVideoFpsRanges).toString();
        if (obj.length() > 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
