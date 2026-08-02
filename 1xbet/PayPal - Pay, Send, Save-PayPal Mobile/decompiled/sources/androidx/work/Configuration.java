package androidx.work;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 V2\u00020\u0001:\u0003WXVB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\"\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\"\u00104\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\u001c\u00107\u001a\u0004\u0018\u0001068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020;8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8GX\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u001a\u0010G\u001a\u00020@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR\u001a\u0010I\u001a\u00020@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR\u001a\u0010K\u001a\u00020@8GX\u0087\u0004¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010DR\u001a\u0010M\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010\bR\u0014\u0010P\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u001a\u0010R\u001a\u00020Q8GX\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U"}, d2 = {"Landroidx/work/Configuration;", "", "Landroidx/work/Configuration$Builder;", "builder", "<init>", "(Landroidx/work/Configuration$Builder;)V", "", "isMarkingJobsAsImportantWhileForeground", "()Z", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "taskExecutor", "getTaskExecutor", "Landroidx/work/Clock;", "clock", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "Landroidx/work/WorkerFactory;", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler", "()Landroidx/work/RunnableScheduler;", "Landroidx/core/util/Consumer;", "", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "schedulingExceptionHandler", "getSchedulingExceptionHandler", "Landroidx/work/WorkerExceptionInfo;", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler", "workerExecutionExceptionHandler", "getWorkerExecutionExceptionHandler", "", "defaultProcessName", "Ljava/lang/String;", "getDefaultProcessName", "()Ljava/lang/String;", "", "remoteSessionTimeoutMillis", "J", "getRemoteSessionTimeoutMillis", "()J", "", "minimumLoggingLevel", com.visa.cbp.getEncExpo.warmup, "getMinimumLoggingLevel", "()I", "minJobSchedulerId", "getMinJobSchedulerId", "maxJobSchedulerId", "getMaxJobSchedulerId", "contentUriTriggerWorkersLimit", "getContentUriTriggerWorkersLimit", "maxSchedulerLimit", "getMaxSchedulerLimit", "isUsingDefaultTaskExecutor", "Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/work/Tracer;", "tracer", "Landroidx/work/Tracer;", "getTracer", "()Landroidx/work/Tracer;", "Companion", "Builder", "Provider"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final androidx.work.Clock clock;
    private final int contentUriTriggerWorkersLimit;
    private final java.lang.String defaultProcessName;
    private final java.util.concurrent.Executor executor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.core.util.Consumer<java.lang.Throwable> initializationExceptionHandler;
    private final androidx.work.InputMergerFactory inputMergerFactory;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;
    private final long remoteSessionTimeoutMillis;
    private final androidx.work.RunnableScheduler runnableScheduler;
    private final androidx.core.util.Consumer<java.lang.Throwable> schedulingExceptionHandler;
    private final java.util.concurrent.Executor taskExecutor;
    private final androidx.work.Tracer tracer;
    private final kotlin.coroutines.CoroutineContext workerCoroutineContext;
    private final androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerExecutionExceptionHandler;
    private final androidx.work.WorkerFactory workerFactory;
    private final androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerInitializationExceptionHandler;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "workManagerConfiguration"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Provider {
        androidx.work.Configuration getWorkManagerConfiguration();
    }

    public Configuration(androidx.work.Configuration.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlinx.coroutines.CoroutineDispatcher workerContext = builder.getWorkerContext();
        java.util.concurrent.Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? androidx.work.ConfigurationKt.access$asExecutor(workerContext) : null;
            if (executor == null) {
                executor = androidx.work.ConfigurationKt.access$createDefaultExecutor(false);
            }
        }
        this.executor = executor;
        this.workerCoroutineContext = workerContext == null ? builder.getExecutor() != null ? kotlinx.coroutines.ExecutorsKt.from(executor) : kotlinx.coroutines.Dispatchers.getDefault() : workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        java.util.concurrent.Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? androidx.work.ConfigurationKt.access$createDefaultExecutor(true) : taskExecutor;
        androidx.work.SystemClock clock = builder.getClock();
        this.clock = clock == null ? new androidx.work.SystemClock() : clock;
        androidx.work.DefaultWorkerFactory workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? androidx.work.DefaultWorkerFactory.INSTANCE : workerFactory;
        androidx.work.NoOpInputMergerFactory inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? androidx.work.NoOpInputMergerFactory.INSTANCE : inputMergerFactory;
        androidx.work.impl.DefaultRunnableScheduler runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new androidx.work.impl.DefaultRunnableScheduler() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.workerInitializationExceptionHandler = builder.getWorkerInitializationExceptionHandler$work_runtime_release();
        this.workerExecutionExceptionHandler = builder.getWorkerExecutionExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.remoteSessionTimeoutMillis = builder.getRemoteSessionTimeoutMillis();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getMarkJobsAsImportantWhileForeground();
        androidx.work.Tracer tracer = builder.getTracer();
        this.tracer = tracer == null ? androidx.work.ConfigurationKt.access$createDefaultTracer() : tracer;
    }

    public final java.util.concurrent.Executor getExecutor() {
        return this.executor;
    }

    public final kotlin.coroutines.CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final java.util.concurrent.Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    public final androidx.work.Clock getClock() {
        return this.clock;
    }

    public final androidx.work.WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    public final androidx.work.InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final androidx.work.RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final androidx.core.util.Consumer<java.lang.Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    public final androidx.core.util.Consumer<java.lang.Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    public final androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> getWorkerInitializationExceptionHandler() {
        return this.workerInitializationExceptionHandler;
    }

    public final androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> getWorkerExecutionExceptionHandler() {
        return this.workerExecutionExceptionHandler;
    }

    public final java.lang.String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    public final long getRemoteSessionTimeoutMillis() {
        return this.remoteSessionTimeoutMillis;
    }

    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* renamed from: isUsingDefaultTaskExecutor, reason: from getter */
    public final boolean getIsUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    /* renamed from: isMarkingJobsAsImportantWhileForeground, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.work.Tracer getTracer() {
        return this.tracer;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bX\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b&\u0010$J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b(\u0010$J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b3\u00101J\u001b\u00106\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u0002040-¢\u0006\u0004\b6\u00101J\u001b\u00107\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u0002040-¢\u0006\u0004\b7\u00101J\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u0004¢\u0006\u0004\bH\u0010IR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010O\u001a\u0004\u0018\u00010\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\b\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\f\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010J\u001a\u0004\b_\u0010L\"\u0004\b`\u0010NR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010*\u001a\u0004\u0018\u00010)8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010k\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b2\u0010l\u001a\u0004\bq\u0010n\"\u0004\br\u0010pR*\u0010s\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010-8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bs\u0010l\u001a\u0004\bt\u0010n\"\u0004\bu\u0010pR*\u0010v\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010-8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bv\u0010l\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR$\u0010y\u001a\u0004\u0018\u0001088\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010\u007f\u001a\u00020<8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010'\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b'\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u001e\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b\u001e\u0010\u0085\u0001\u001a\u0006\b\u008a\u0001\u0010\u0087\u0001\"\u0006\b\u008b\u0001\u0010\u0089\u0001R'\u0010\u001f\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010\u0085\u0001\u001a\u0006\b\u008c\u0001\u0010\u0087\u0001\"\u0006\b\u008d\u0001\u0010\u0089\u0001R'\u0010\"\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b\"\u0010\u0085\u0001\u001a\u0006\b\u008e\u0001\u0010\u0087\u0001\"\u0006\b\u008f\u0001\u0010\u0089\u0001R'\u0010%\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b%\u0010\u0085\u0001\u001a\u0006\b\u0090\u0001\u0010\u0087\u0001\"\u0006\b\u0091\u0001\u0010\u0089\u0001R)\u0010\u0092\u0001\u001a\u00020@8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010E\u001a\u0004\u0018\u00010D8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bE\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "<init>", "()V", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "(Landroidx/work/Configuration;)V", "Landroidx/work/WorkerFactory;", "workerFactory", "setWorkerFactory", "(Landroidx/work/WorkerFactory;)Landroidx/work/Configuration$Builder;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "setInputMergerFactory", "(Landroidx/work/InputMergerFactory;)Landroidx/work/Configuration$Builder;", "Ljava/util/concurrent/Executor;", "executor", "setExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/work/Configuration$Builder;", "Lkotlin/coroutines/CoroutineContext;", "context", "setWorkerCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/work/Configuration$Builder;", "taskExecutor", "setTaskExecutor", "Landroidx/work/Clock;", "clock", "setClock", "(Landroidx/work/Clock;)Landroidx/work/Configuration$Builder;", "", "minJobSchedulerId", "maxJobSchedulerId", "setJobSchedulerJobIdRange", "(II)Landroidx/work/Configuration$Builder;", "maxSchedulerLimit", "setMaxSchedulerLimit", "(I)Landroidx/work/Configuration$Builder;", "contentUriTriggerWorkersLimit", "setContentUriTriggerWorkersLimit", "loggingLevel", "setMinimumLoggingLevel", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "setRunnableScheduler", "(Landroidx/work/RunnableScheduler;)Landroidx/work/Configuration$Builder;", "Landroidx/core/util/Consumer;", "", "exceptionHandler", "setInitializationExceptionHandler", "(Landroidx/core/util/Consumer;)Landroidx/work/Configuration$Builder;", "schedulingExceptionHandler", "setSchedulingExceptionHandler", "Landroidx/work/WorkerExceptionInfo;", "workerExceptionHandler", "setWorkerInitializationExceptionHandler", "setWorkerExecutionExceptionHandler", "", "processName", "setDefaultProcessName", "(Ljava/lang/String;)Landroidx/work/Configuration$Builder;", "", "timeoutMillis", "setRemoteSessionTimeoutMillis", "(J)Landroidx/work/Configuration$Builder;", "", "markAsImportant", "setMarkingJobsAsImportantWhileForeground", "(Z)Landroidx/work/Configuration$Builder;", "Landroidx/work/Tracer;", "tracer", "setTracer", "(Landroidx/work/Tracer;)Landroidx/work/Configuration$Builder;", "build", "()Landroidx/work/Configuration;", "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "workerContext", "Lkotlin/coroutines/CoroutineContext;", "getWorkerContext$work_runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "Landroidx/work/Clock;", "getClock$work_runtime_release", "()Landroidx/work/Clock;", "setClock$work_runtime_release", "(Landroidx/work/Clock;)V", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler$work_runtime_release", "()Landroidx/work/RunnableScheduler;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/RunnableScheduler;)V", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "getWorkerInitializationExceptionHandler$work_runtime_release", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "getWorkerExecutionExceptionHandler$work_runtime_release", "setWorkerExecutionExceptionHandler$work_runtime_release", "defaultProcessName", "Ljava/lang/String;", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "remoteSessionTimeoutMillis", "J", "getRemoteSessionTimeoutMillis$work_runtime_release", "()J", "setRemoteSessionTimeoutMillis$work_runtime_release", "(J)V", com.visa.cbp.getEncExpo.warmup, "getLoggingLevel$work_runtime_release", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", "getContentUriTriggerWorkersLimit$work_runtime_release", "setContentUriTriggerWorkersLimit$work_runtime_release", "markJobsAsImportantWhileForeground", "Z", "getMarkJobsAsImportantWhileForeground$work_runtime_release", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "Landroidx/work/Tracer;", "getTracer$work_runtime_release", "()Landroidx/work/Tracer;", "setTracer$work_runtime_release", "(Landroidx/work/Tracer;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private androidx.work.Clock clock;
        private int contentUriTriggerWorkersLimit;
        private java.lang.String defaultProcessName;
        private java.util.concurrent.Executor executor;
        private androidx.core.util.Consumer<java.lang.Throwable> initializationExceptionHandler;
        private androidx.work.InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private boolean markJobsAsImportantWhileForeground;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;
        private long remoteSessionTimeoutMillis;
        private androidx.work.RunnableScheduler runnableScheduler;
        private androidx.core.util.Consumer<java.lang.Throwable> schedulingExceptionHandler;
        private java.util.concurrent.Executor taskExecutor;
        private androidx.work.Tracer tracer;
        private kotlin.coroutines.CoroutineContext workerContext;
        private androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerExecutionExceptionHandler;
        private androidx.work.WorkerFactory workerFactory;
        private androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerInitializationExceptionHandler;

        /* renamed from: getExecutor$work_runtime_release, reason: from getter */
        public final java.util.concurrent.Executor getExecutor() {
            return this.executor;
        }

        public final void setExecutor$work_runtime_release(java.util.concurrent.Executor executor) {
            this.executor = executor;
        }

        /* renamed from: getWorkerContext$work_runtime_release, reason: from getter */
        public final kotlin.coroutines.CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        public final void setWorkerContext$work_runtime_release(kotlin.coroutines.CoroutineContext coroutineContext) {
            this.workerContext = coroutineContext;
        }

        /* renamed from: getWorkerFactory$work_runtime_release, reason: from getter */
        public final androidx.work.WorkerFactory getWorkerFactory() {
            return this.workerFactory;
        }

        public final void setWorkerFactory$work_runtime_release(androidx.work.WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        /* renamed from: getInputMergerFactory$work_runtime_release, reason: from getter */
        public final androidx.work.InputMergerFactory getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        public final void setInputMergerFactory$work_runtime_release(androidx.work.InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        /* renamed from: getTaskExecutor$work_runtime_release, reason: from getter */
        public final java.util.concurrent.Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        public final void setTaskExecutor$work_runtime_release(java.util.concurrent.Executor executor) {
            this.taskExecutor = executor;
        }

        /* renamed from: getClock$work_runtime_release, reason: from getter */
        public final androidx.work.Clock getClock() {
            return this.clock;
        }

        public final void setClock$work_runtime_release(androidx.work.Clock clock) {
            this.clock = clock;
        }

        /* renamed from: getRunnableScheduler$work_runtime_release, reason: from getter */
        public final androidx.work.RunnableScheduler getRunnableScheduler() {
            return this.runnableScheduler;
        }

        public final void setRunnableScheduler$work_runtime_release(androidx.work.RunnableScheduler runnableScheduler) {
            this.runnableScheduler = runnableScheduler;
        }

        public final androidx.core.util.Consumer<java.lang.Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(androidx.core.util.Consumer<java.lang.Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        public final androidx.core.util.Consumer<java.lang.Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(androidx.core.util.Consumer<java.lang.Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        public final androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> getWorkerInitializationExceptionHandler$work_runtime_release() {
            return this.workerInitializationExceptionHandler;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime_release(androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> consumer) {
            this.workerInitializationExceptionHandler = consumer;
        }

        public final androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> getWorkerExecutionExceptionHandler$work_runtime_release() {
            return this.workerExecutionExceptionHandler;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime_release(androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> consumer) {
            this.workerExecutionExceptionHandler = consumer;
        }

        /* renamed from: getDefaultProcessName$work_runtime_release, reason: from getter */
        public final java.lang.String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        public final void setDefaultProcessName$work_runtime_release(java.lang.String str) {
            this.defaultProcessName = str;
        }

        /* renamed from: getRemoteSessionTimeoutMillis$work_runtime_release, reason: from getter */
        public final long getRemoteSessionTimeoutMillis() {
            return this.remoteSessionTimeoutMillis;
        }

        public final void setRemoteSessionTimeoutMillis$work_runtime_release(long j) {
            this.remoteSessionTimeoutMillis = j;
        }

        /* renamed from: getLoggingLevel$work_runtime_release, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        public final void setLoggingLevel$work_runtime_release(int i) {
            this.loggingLevel = i;
        }

        /* renamed from: getMinJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i) {
            this.minJobSchedulerId = i;
        }

        /* renamed from: getMaxJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i) {
            this.maxJobSchedulerId = i;
        }

        /* renamed from: getMaxSchedulerLimit$work_runtime_release, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i) {
            this.maxSchedulerLimit = i;
        }

        /* renamed from: getContentUriTriggerWorkersLimit$work_runtime_release, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i) {
            this.contentUriTriggerWorkersLimit = i;
        }

        /* renamed from: getMarkJobsAsImportantWhileForeground$work_runtime_release, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime_release(boolean z) {
            this.markJobsAsImportantWhileForeground = z;
        }

        /* renamed from: getTracer$work_runtime_release, reason: from getter */
        public final androidx.work.Tracer getTracer() {
            return this.tracer;
        }

        public final void setTracer$work_runtime_release(androidx.work.Tracer tracer) {
            this.tracer = tracer;
        }

        public Builder() {
            this.remoteSessionTimeoutMillis = androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS;
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
        }

        public Builder(androidx.work.Configuration configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            this.remoteSessionTimeoutMillis = androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS;
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = 8;
            this.markJobsAsImportantWhileForeground = true;
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.workerInitializationExceptionHandler = configuration.getWorkerInitializationExceptionHandler();
            this.workerExecutionExceptionHandler = configuration.getWorkerExecutionExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
            this.remoteSessionTimeoutMillis = configuration.getRemoteSessionTimeoutMillis();
            this.contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
            this.markJobsAsImportantWhileForeground = configuration.getHighResolutionOutputSizeshNQ4ISI;
            this.tracer = configuration.getTracer();
        }

        public final androidx.work.Configuration.Builder setWorkerFactory(androidx.work.WorkerFactory workerFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerFactory, "");
            this.workerFactory = workerFactory;
            return this;
        }

        public final androidx.work.Configuration.Builder setInputMergerFactory(androidx.work.InputMergerFactory inputMergerFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMergerFactory, "");
            this.inputMergerFactory = inputMergerFactory;
            return this;
        }

        public final androidx.work.Configuration.Builder setExecutor(java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            this.executor = executor;
            return this;
        }

        public final androidx.work.Configuration.Builder setWorkerCoroutineContext(kotlin.coroutines.CoroutineContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.workerContext = context;
            return this;
        }

        public final androidx.work.Configuration.Builder setTaskExecutor(java.util.concurrent.Executor taskExecutor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
            this.taskExecutor = taskExecutor;
            return this;
        }

        public final androidx.work.Configuration.Builder setClock(androidx.work.Clock clock) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
            this.clock = clock;
            return this;
        }

        public final androidx.work.Configuration.Builder setJobSchedulerJobIdRange(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                throw new java.lang.IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.".toString());
            }
            this.minJobSchedulerId = minJobSchedulerId;
            this.maxJobSchedulerId = maxJobSchedulerId;
            return this;
        }

        public final androidx.work.Configuration.Builder setMaxSchedulerLimit(int maxSchedulerLimit) {
            if (maxSchedulerLimit < 20) {
                throw new java.lang.IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.".toString());
            }
            this.maxSchedulerLimit = java.lang.Math.min(maxSchedulerLimit, 50);
            return this;
        }

        public final androidx.work.Configuration.Builder setContentUriTriggerWorkersLimit(int contentUriTriggerWorkersLimit) {
            this.contentUriTriggerWorkersLimit = java.lang.Math.max(contentUriTriggerWorkersLimit, 0);
            return this;
        }

        public final androidx.work.Configuration.Builder setMinimumLoggingLevel(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public final androidx.work.Configuration.Builder setRunnableScheduler(androidx.work.RunnableScheduler runnableScheduler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnableScheduler, "");
            this.runnableScheduler = runnableScheduler;
            return this;
        }

        public final androidx.work.Configuration.Builder setInitializationExceptionHandler(androidx.core.util.Consumer<java.lang.Throwable> exceptionHandler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exceptionHandler, "");
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        public final androidx.work.Configuration.Builder setSchedulingExceptionHandler(androidx.core.util.Consumer<java.lang.Throwable> schedulingExceptionHandler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "");
            this.schedulingExceptionHandler = schedulingExceptionHandler;
            return this;
        }

        public final androidx.work.Configuration.Builder setWorkerInitializationExceptionHandler(androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerExceptionHandler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerExceptionHandler, "");
            this.workerInitializationExceptionHandler = workerExceptionHandler;
            return this;
        }

        public final androidx.work.Configuration.Builder setWorkerExecutionExceptionHandler(androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerExceptionHandler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerExceptionHandler, "");
            this.workerExecutionExceptionHandler = workerExceptionHandler;
            return this;
        }

        public final androidx.work.Configuration.Builder setDefaultProcessName(java.lang.String processName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "");
            this.defaultProcessName = processName;
            return this;
        }

        public final androidx.work.Configuration.Builder setRemoteSessionTimeoutMillis(long timeoutMillis) {
            if (timeoutMillis < 0) {
                throw new java.lang.IllegalArgumentException("The remote session timeout must not be negative.".toString());
            }
            this.remoteSessionTimeoutMillis = kotlin.ranges.RangesKt.coerceAtMost(timeoutMillis, androidx.work.multiprocess.RemoteWorkManager.MAX_SESSION_TIMEOUT_MILLIS);
            return this;
        }

        public final androidx.work.Configuration.Builder setMarkingJobsAsImportantWhileForeground(boolean markAsImportant) {
            this.markJobsAsImportantWhileForeground = markAsImportant;
            return this;
        }

        public final androidx.work.Configuration.Builder setTracer(androidx.work.Tracer tracer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
            this.tracer = tracer;
            return this;
        }

        public final androidx.work.Configuration build() {
            return new androidx.work.Configuration(this);
        }
    }
}
