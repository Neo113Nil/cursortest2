package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003KLMBu\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\"H\u0002J*\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\u0006\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010,H\u0016J\u001d\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001eH\u0001¢\u0006\u0002\b6J\u0010\u00107\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u000208H\u0002J\u001d\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b;J\u0018\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u0002082\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010=\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\"H\u0002J\b\u0010@\u001a\u00020\u0018H\u0007J\u001c\u0010A\u001a\u00020\u00182\b\u0010B\u001a\u0004\u0018\u00010C2\b\u00102\u001a\u0004\u0018\u00010,H\u0016JN\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020$2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\u0006\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010H\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020JH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl;", "Lcom/zettle/sdk/core/log/HealthMonitor;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lcom/zettle/sdk/commons/util/Log$Strategy;", "Lcom/zettle/sdk/core/Monitor;", "networkModule", "Lcom/zettle/sdk/core/network/NetworkModule;", "logsWriter", "Lcom/zettle/sdk/io/RoundFileWriter;", "flagWriter", "Lcom/zettle/sdk/io/FileWriter;", "logsDir", "Ljava/io/File;", "appInfo", "Lcom/zettle/sdk/meta/AppInfo;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lcom/zettle/sdk/meta/Platform;", "executor", "Ljava/util/concurrent/ExecutorService;", "createFileWriter", "Lkotlin/Function1;", "upload", "Lkotlin/Function2;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "", "eventsLoop", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "(Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/io/RoundFileWriter;Lcom/zettle/sdk/io/FileWriter;Ljava/io/File;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/Platform;Ljava/util/concurrent/ExecutorService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "state", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State;", "action", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action;", "createNewCopy", "", "tag", "", "deleteOldFiles", "maxLogs", "", "handleException", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "isMarkedToCopy", "log", "priority", "Lcom/zettle/sdk/commons/util/Log$Priority;", "message", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "mutate", "old", "new", "mutate$core_publicRelease", "onStartReport", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State$Ready;", "reduce", "current", "reduce$core_publicRelease", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State$Reporting;", "report", "setCopyFlag", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "uncaughtException", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "Ljava/lang/Thread;", "writeLog", "time", "", "threadName", "wait", "unit", "Ljava/util/concurrent/TimeUnit;", "Action", "State", "UploadCallback", "core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HealthMonitorImpl implements com.zettle.sdk.core.log.HealthMonitor, java.lang.Thread.UncaughtExceptionHandler, com.zettle.sdk.commons.util.Log.Strategy, com.zettle.sdk.core.Monitor {
    private final com.zettle.sdk.io.FileWriter Camera2StreamConfigurationMap;
    private final com.zettle.sdk.commons.thread.EventsLoop getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<java.io.File, com.zettle.sdk.io.FileWriter> getHighSpeedVideoSizes;
    private final com.zettle.sdk.meta.Platform getHighSpeedVideoSizesFor;
    private final com.zettle.sdk.core.network.NetworkModule getInputFormats;
    private final com.zettle.sdk.io.RoundFileWriter getInputSizeshNQ4ISI;
    private final java.io.File getOutputFormats;
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.core.log.HealthMonitorImpl.State> getOutputMinFrameDuration;
    private final kotlin.jvm.functions.Function2<java.io.File, com.zettle.sdk.commons.network.NetworkClient.Callback, kotlin.Unit> getOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthMonitorImpl(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.io.RoundFileWriter roundFileWriter, com.zettle.sdk.io.FileWriter fileWriter, java.io.File file, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform, java.util.concurrent.ExecutorService executorService, kotlin.jvm.functions.Function1<? super java.io.File, ? extends com.zettle.sdk.io.FileWriter> function1, kotlin.jvm.functions.Function2<? super java.io.File, ? super com.zettle.sdk.commons.network.NetworkClient.Callback, kotlin.Unit> function2, com.zettle.sdk.commons.thread.EventsLoop eventsLoop) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roundFileWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        this.getInputFormats = networkModule;
        this.getInputSizeshNQ4ISI = roundFileWriter;
        this.Camera2StreamConfigurationMap = fileWriter;
        this.getOutputFormats = file;
        this.getHighSpeedVideoFpsRanges = appInfo;
        this.getHighSpeedVideoSizesFor = platform;
        this.getHighSpeedVideoFpsRangesFor = executorService;
        this.getHighSpeedVideoSizes = function1;
        this.getOutputSizeshNQ4ISI = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = eventsLoop;
        this.getOutputMinFrameDuration = com.zettle.sdk.commons.state.MutableState.INSTANCE.create(new com.zettle.sdk.core.log.HealthMonitorImpl.State.Ready(), new com.zettle.sdk.core.log.HealthMonitorImpl$state$1(this));
    }

    public /* synthetic */ HealthMonitorImpl(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.io.RoundFileWriter roundFileWriter, com.zettle.sdk.io.FileWriter fileWriter, java.io.File file, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform, java.util.concurrent.ExecutorService executorService, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(networkModule, roundFileWriter, fileWriter, file, appInfo, platform, executorService, function1, function2, (i & 512) != 0 ? com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.getBackground() : eventsLoop);
    }

    @Override // com.zettle.sdk.core.log.HealthMonitor
    public final void report(final java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: com.zettle.sdk.core.log.HealthMonitorImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.core.log.HealthMonitorImpl.$r8$lambda$FAatxE1h3450R4sN0YDgiWHLrHk(com.zettle.sdk.core.log.HealthMonitorImpl.this, tag);
            }
        });
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable throwable) {
        if (thread == null || throwable == null) {
            return;
        }
        java.lang.String name2 = thread.getName();
        long timeSinceBootInNanos = this.getHighSpeedVideoSizesFor.getClock().getTimeSinceBootInNanos();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (Camera2StreamConfigurationMap(this, timeSinceBootInNanos, name2, com.zettle.sdk.commons.util.Log.Priority.ERROR, "FATAL", "-----beginning of the crash", throwable, 3L, null, 128)) {
            Camera2StreamConfigurationMap(true);
        }
    }

    @Override // com.zettle.sdk.core.Monitor
    public final void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) context.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        if (coroutineName == null || (str = coroutineName.getName()) == null) {
            str = "Unknown";
        }
        if (Camera2StreamConfigurationMap(this, this.getHighSpeedVideoSizesFor.getClock().getTimeSinceBootInNanos(), str, com.zettle.sdk.commons.util.Log.Priority.ERROR, "FATAL", "-----beginning of the crash", exception, 3L, null, 128)) {
            Camera2StreamConfigurationMap(true);
        }
    }

    @Override // com.zettle.sdk.commons.util.Log.Strategy
    public final void log(com.zettle.sdk.commons.util.Log.Priority priority, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.String name2 = java.lang.Thread.currentThread().getName();
        long timeSinceBootInNanos = this.getHighSpeedVideoSizesFor.getClock().getTimeSinceBootInNanos();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        Camera2StreamConfigurationMap(this, timeSinceBootInNanos, name2, priority, tag, message, throwable, 0L, null, 192);
        if (throwable == null || !(throwable instanceof com.zettle.sdk.core.HealthMonitorException)) {
            return;
        }
        report(((com.zettle.sdk.core.HealthMonitorException) throwable).getTag());
    }

    private static /* synthetic */ boolean Camera2StreamConfigurationMap(com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl, long j, java.lang.String str, com.zettle.sdk.commons.util.Log.Priority priority, java.lang.String str2, java.lang.String str3, java.lang.Throwable th, long j2, java.util.concurrent.TimeUnit timeUnit, int i) {
        return healthMonitorImpl.getHighSpeedVideoSizes(j, str, priority, str2, str3, th, (i & 64) != 0 ? 0L : j2, (i & 128) != 0 ? java.util.concurrent.TimeUnit.SECONDS : timeUnit);
    }

    private final boolean getHighSpeedVideoSizes(final long j, final java.lang.String str, final com.zettle.sdk.commons.util.Log.Priority priority, final java.lang.String str2, final java.lang.String str3, final java.lang.Throwable th, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Object m23436constructorimpl;
        java.util.concurrent.Future submit = this.getHighSpeedVideoFpsRangesFor.submit(new java.util.concurrent.Callable() { // from class: com.zettle.sdk.core.log.HealthMonitorImpl$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Boolean highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.zettle.sdk.core.log.HealthMonitorImpl.getHighSpeedVideoFpsRanges(th, j, str, priority, str2, str3, this);
                return highSpeedVideoFpsRanges;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(submit, "");
        if (j2 <= 0) {
            return true;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((java.lang.Boolean) submit.get(j2, timeUnit));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = java.lang.Boolean.FALSE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(m23436constructorimpl, "");
        return ((java.lang.Boolean) m23436constructorimpl).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Boolean getHighSpeedVideoFpsRanges(java.lang.Throwable th, long j, java.lang.String str, com.zettle.sdk.commons.util.Log.Priority priority, java.lang.String str2, java.lang.String str3, com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl) {
        java.lang.String stackTraceString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthMonitorImpl, "");
        for (int i = 0; i < 3; i++) {
            if (th != null) {
                try {
                    stackTraceString = android.util.Log.getStackTraceString(th);
                } catch (java.io.IOException unused) {
                }
            }
            stackTraceString = "";
            java.lang.String access$toSymbol = com.zettle.sdk.core.log.HealthMonitorKt.access$toSymbol(priority);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            sb.append(" [");
            sb.append(str);
            sb.append("] ");
            sb.append(access$toSymbol);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(str2);
            sb.append(": ");
            sb.append(str3);
            sb.append(" ");
            sb.append(stackTraceString);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            healthMonitorImpl.getInputSizeshNQ4ISI.push(sb.toString());
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }

    private final boolean getHighSpeedVideoSizes() {
        try {
            if (this.Camera2StreamConfigurationMap.getLength() >= 1) {
                this.Camera2StreamConfigurationMap.seek(0L);
                if (this.Camera2StreamConfigurationMap.readByte() == 1) {
                    return true;
                }
            }
            return false;
        } catch (java.io.IOException e) {
            com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to read copy flag", e);
            return false;
        }
    }

    private final void Camera2StreamConfigurationMap(boolean z) {
        try {
            this.Camera2StreamConfigurationMap.seek(0L);
            this.Camera2StreamConfigurationMap.write(z ? (byte) 1 : (byte) 0);
        } catch (java.io.IOException e) {
            com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to write copy flag", e);
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            if (!this.getOutputFormats.exists()) {
                this.getOutputFormats.mkdirs();
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.lang.String sdkVersion = this.getHighSpeedVideoFpsRanges.getSdkVersion();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkVersion=");
            sb.append(sdkVersion);
            java.lang.Appendable append = stringBuffer.append((java.lang.CharSequence) sb.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append, "");
            java.lang.Appendable append2 = append.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append2, "");
            java.lang.String appId = this.getHighSpeedVideoFpsRanges.getAppId();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PackageName=");
            sb2.append(appId);
            java.lang.Appendable append3 = append2.append(sb2.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append3, "");
            java.lang.Appendable append4 = append3.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append4, "");
            java.lang.String versionCode = this.getHighSpeedVideoSizesFor.getInfo().getVersionCode();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ApiLevel=");
            sb3.append(versionCode);
            java.lang.Appendable append5 = append4.append(sb3.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append5, "");
            java.lang.Appendable append6 = append5.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append6, "");
            java.lang.String deviceLocale = this.getHighSpeedVideoSizesFor.getInfo().getDeviceLocale();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("DeviceLocale=");
            sb4.append(deviceLocale);
            java.lang.Appendable append7 = append6.append(sb4.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append7, "");
            java.lang.Appendable append8 = append7.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append8, "");
            java.lang.String deviceModel = this.getHighSpeedVideoSizesFor.getInfo().getDeviceModel();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("DeviceModel=");
            sb5.append(deviceModel);
            java.lang.Appendable append9 = append8.append(sb5.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append9, "");
            java.lang.Appendable append10 = append9.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append10, "");
            java.lang.String deviceName = this.getHighSpeedVideoSizesFor.getInfo().getDeviceName();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DeviceName=");
            sb6.append(deviceName);
            java.lang.Appendable append11 = append10.append(sb6.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append11, "");
            java.lang.Appendable append12 = append11.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append12, "");
            java.lang.Appendable append13 = append12.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append13, "");
            java.lang.String obj = append13.toString();
            java.io.File file = this.getOutputFormats;
            long currentWallTime = this.getHighSpeedVideoSizesFor.getClock().getCurrentWallTime();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(currentWallTime);
            sb7.append("-");
            sb7.append(str);
            sb7.append(".log");
            java.io.File file2 = new java.io.File(file, sb7.toString());
            com.zettle.sdk.io.FileWriter invoke = this.getHighSpeedVideoSizes.invoke(file2);
            try {
                byte[] bytes = obj.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                invoke.write(bytes, 0, bytes.length);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(invoke, null);
                this.getInputSizeshNQ4ISI.copy(file2);
                return true;
            } finally {
            }
        } catch (java.io.IOException e) {
            com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to create new log file", e);
            return false;
        }
    }

    public final com.zettle.sdk.core.log.HealthMonitorImpl.State reduce$core_publicRelease(com.zettle.sdk.core.log.HealthMonitorImpl.State current, com.zettle.sdk.core.log.HealthMonitorImpl.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(current instanceof com.zettle.sdk.core.log.HealthMonitorImpl.State.Ready)) {
            if (!(current instanceof com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting reporting = (com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting) current;
            if (action instanceof com.zettle.sdk.core.log.HealthMonitorImpl.Action.StartReport) {
                return reporting;
            }
            if (!(action instanceof com.zettle.sdk.core.log.HealthMonitorImpl.Action.Done)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (((com.zettle.sdk.core.log.HealthMonitorImpl.Action.Done) action).getFile() == reporting.getFile()) {
                return getHighResolutionOutputSizeshNQ4ISI(new com.zettle.sdk.core.log.HealthMonitorImpl.State.Ready());
            }
            return reporting;
        }
        com.zettle.sdk.core.log.HealthMonitorImpl.State.Ready ready = (com.zettle.sdk.core.log.HealthMonitorImpl.State.Ready) current;
        if (action instanceof com.zettle.sdk.core.log.HealthMonitorImpl.Action.StartReport) {
            return getHighResolutionOutputSizeshNQ4ISI(ready);
        }
        if (action instanceof com.zettle.sdk.core.log.HealthMonitorImpl.Action.Done) {
            return ready;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final com.zettle.sdk.core.log.HealthMonitorImpl.State getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.core.log.HealthMonitorImpl.State.Ready ready) {
        java.io.File[] Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = com.zettle.sdk.core.log.HealthMonitorKt.Camera2StreamConfigurationMap(this.getOutputFormats);
        java.io.File file = (java.io.File) kotlin.collections.ArraysKt.firstOrNull(Camera2StreamConfigurationMap);
        if (file != null && !kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats.getConnection(), com.zettle.sdk.core.network.Connection.Disconnected.INSTANCE)) {
            return new com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting(file);
        }
        return ready;
    }

    public final void mutate$core_publicRelease(com.zettle.sdk.core.log.HealthMonitorImpl.State old, com.zettle.sdk.core.log.HealthMonitorImpl.State r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(old, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
        if (r4 instanceof com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting) {
            if ((old instanceof com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting) && ((com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting) old).getFile() == ((com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting) r4).getFile()) {
                return;
            }
            com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting reporting = (com.zettle.sdk.core.log.HealthMonitorImpl.State.Reporting) r4;
            this.getOutputSizeshNQ4ISI.invoke(reporting.getFile(), new com.zettle.sdk.core.log.HealthMonitorImpl.UploadCallback(this, reporting.getFile()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$UploadCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Ljava/io/File;", "p0", "<init>", "(Lcom/zettle/sdk/core/log/HealthMonitorImpl;Ljava/io/File;)V", "Ljava/io/IOException;", "", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "Camera2StreamConfigurationMap", "Ljava/io/File;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class UploadCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.io.File getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.zettle.sdk.core.log.HealthMonitorImpl getHighSpeedVideoFpsRangesFor;

        public UploadCallback(com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl, java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            this.getHighSpeedVideoFpsRangesFor = healthMonitorImpl;
            this.getHighSpeedVideoFpsRangesFor = file;
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onFailure(java.io.IOException p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to upload record", p0);
            com.zettle.sdk.core.log.HealthMonitorImpl.access$action(this.getHighSpeedVideoFpsRangesFor, new com.zettle.sdk.core.log.HealthMonitorImpl.Action.Done(this.getHighSpeedVideoFpsRangesFor));
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE), "Log file uploaded ".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getName())), null, 2, null);
            com.zettle.sdk.core.log.HealthMonitorKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
            com.zettle.sdk.core.log.HealthMonitorImpl.access$action(this.getHighSpeedVideoFpsRangesFor, new com.zettle.sdk.core.log.HealthMonitorImpl.Action.Done(this.getHighSpeedVideoFpsRangesFor));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action;", "", "<init>", "()V", "Done", "StartReport", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action$Done;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action$StartReport;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action$StartReport;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StartReport extends com.zettle.sdk.core.log.HealthMonitorImpl.Action {
            public static final com.zettle.sdk.core.log.HealthMonitorImpl.Action.StartReport INSTANCE = new com.zettle.sdk.core.log.HealthMonitorImpl.Action.StartReport();

            private StartReport() {
                super(null);
            }

            public final java.lang.String toString() {
                return "StartReport";
            }
        }

        private Action() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action$Done;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$Action;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "Ljava/io/File;", "getFile", "()Ljava/io/File;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Done extends com.zettle.sdk.core.log.HealthMonitorImpl.Action {
            private final java.io.File file;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Done(java.io.File file) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                this.file = file;
            }

            public final java.io.File getFile() {
                return this.file;
            }

            public final java.lang.String toString() {
                return "Done";
            }
        }

        public /* synthetic */ Action(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$State;", "", "<init>", "()V", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Reporting", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State$Ready;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State$Reporting;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$State$Ready;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Ready extends com.zettle.sdk.core.log.HealthMonitorImpl.State {
            public Ready() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitorImpl$State$Reporting;", "Lcom/zettle/sdk/core/log/HealthMonitorImpl$State;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "Ljava/io/File;", "getFile", "()Ljava/io/File;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Reporting extends com.zettle.sdk.core.log.HealthMonitorImpl.State {
            private final java.io.File file;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reporting(java.io.File file) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                this.file = file;
            }

            public final java.io.File getFile() {
                return this.file;
            }

            public final java.lang.String toString() {
                return "Reporting";
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$FAatxE1h3450R4sN0YDgiWHLrHk(com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthMonitorImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (healthMonitorImpl.getHighResolutionOutputSizeshNQ4ISI(str)) {
            healthMonitorImpl.getHighSpeedVideoFpsRangesFor.execute(new com.zettle.sdk.core.log.HealthMonitorImpl$$ExternalSyntheticLambda1(healthMonitorImpl, com.zettle.sdk.core.log.HealthMonitorImpl.Action.StartReport.INSTANCE));
        }
    }

    public static /* synthetic */ void $r8$lambda$SpDIhyuTODULn7JqRkk2jUsJC_E(final com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl, final com.zettle.sdk.core.log.HealthMonitorImpl.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthMonitorImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        healthMonitorImpl.getOutputMinFrameDuration.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.log.HealthMonitorImpl.State, com.zettle.sdk.core.log.HealthMonitorImpl.State>() { // from class: com.zettle.sdk.core.log.HealthMonitorImpl$action$1$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.core.log.HealthMonitorImpl.State invoke(com.zettle.sdk.core.log.HealthMonitorImpl.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                com.zettle.sdk.core.log.HealthMonitorImpl.State reduce$core_publicRelease = com.zettle.sdk.core.log.HealthMonitorImpl.this.reduce$core_publicRelease(state, action);
                com.zettle.sdk.core.log.HealthMonitorImpl.Action action2 = action;
                com.zettle.sdk.commons.util.Log healthMonitor = com.zettle.sdk.core.log.HealthMonitorKt.getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("State: ");
                sb.append(state);
                sb.append(" -> ");
                sb.append(reduce$core_publicRelease);
                sb.append(" Action: ");
                sb.append(action2);
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(healthMonitor, sb.toString(), null, 2, null);
                return reduce$core_publicRelease;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final /* synthetic */ void access$action(com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl, com.zettle.sdk.core.log.HealthMonitorImpl.Action action) {
        healthMonitorImpl.getHighSpeedVideoFpsRangesFor.execute(new com.zettle.sdk.core.log.HealthMonitorImpl$$ExternalSyntheticLambda1(healthMonitorImpl, action));
    }

    public final void start() {
        java.io.File[] Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = com.zettle.sdk.core.log.HealthMonitorKt.Camera2StreamConfigurationMap(this.getOutputFormats);
        if (Camera2StreamConfigurationMap.length > 10) {
            java.util.Iterator it = kotlin.collections.ArraysKt.take(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap.length - 10).iterator();
            while (it.hasNext()) {
                com.zettle.sdk.core.log.HealthMonitorKt.getHighResolutionOutputSizeshNQ4ISI((java.io.File) it.next());
            }
        }
        if (getHighSpeedVideoSizes() && getHighResolutionOutputSizeshNQ4ISI("Crash")) {
            Camera2StreamConfigurationMap(false);
        }
    }
}
