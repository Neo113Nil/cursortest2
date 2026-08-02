package com.paypal.oslo.core.telemetry.logger;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/logger/LoggerInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LoggerInitializer implements androidx.startup.Initializer<kotlin.Unit> {
    public static final int $stable = 0;
    private static final com.paypal.oslo.core.telemetry.logger.LoggerInitializer.Companion Companion = new com.paypal.oslo.core.telemetry.logger.LoggerInitializer.Companion(null);
    private static final kotlin.Lazy<com.paypal.android.logger.LogHandlerChain> getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.logger.LoggerInitializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.telemetry.logger.LoggerInitializer.$r8$lambda$2buxwhBvgcWbbzAOpC9R9ckrqy8();
        }
    });
    private static final kotlin.Lazy<com.paypal.android.logger.LogHandlerChain> getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.logger.LoggerInitializer$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.telemetry.logger.LoggerInitializer.$r8$lambda$I9ss1NThEsAY28mSiHSo7OzK52A();
        }
    });

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0015\u0010\b\u001a\u00020\u00048CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/telemetry/logger/LoggerInitializer$Companion;", "", "<init>", "()V", "Lcom/paypal/android/logger/LogHandlerChain;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.paypal.android.logger.LogHandlerChain getHighSpeedVideoFpsRanges() {
            return (com.paypal.android.logger.LogHandlerChain) com.paypal.oslo.core.telemetry.logger.LoggerInitializer.getHighSpeedVideoFpsRangesFor.getValue();
        }

        public static final /* synthetic */ com.paypal.android.logger.LogHandlerChain getHighResolutionOutputSizeshNQ4ISI() {
            return (com.paypal.android.logger.LogHandlerChain) com.paypal.oslo.core.telemetry.logger.LoggerInitializer.getHighSpeedVideoSizes.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.isRunningFromTestProcess(context)) {
            return;
        }
        final com.paypal.android.logger.LogHandlerChain highSpeedVideoFpsRanges = com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.isDebugBuildType(context) ? com.paypal.oslo.core.telemetry.logger.LoggerInitializer.Companion.getHighSpeedVideoFpsRanges() : com.paypal.oslo.core.telemetry.logger.LoggerInitializer.Companion.getHighResolutionOutputSizeshNQ4ISI();
        com.paypal.android.logger.Logging.INSTANCE.install(new com.paypal.oslo.core.telemetry.logger.LogPIISanitizationHandler(highSpeedVideoFpsRanges, new com.paypal.android.logger.LogHandler() { // from class: com.paypal.oslo.core.telemetry.logger.LoggerInitializer$create$1
            @Override // com.paypal.android.logger.LogHandler
            public final void handle(com.paypal.android.logger.Log log) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
                com.paypal.android.logger.LogHandlerChain.this.handle(log);
            }
        }));
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.class);
    }

    public static /* synthetic */ com.paypal.android.logger.LogHandlerChain $r8$lambda$2buxwhBvgcWbbzAOpC9R9ckrqy8() {
        com.paypal.android.logger.LogHandlerChain add = new com.paypal.android.logger.LogHandlerChain().add(new com.paypal.android.logger.handlers.LogcatLogHandler(false));
        com.paypal.android.logger.datadog.DatadogRumCustomActionLogHandler datadogRumCustomActionLogHandler = new com.paypal.android.logger.datadog.DatadogRumCustomActionLogHandler(null, 1, null);
        return add.add(new com.paypal.android.logger.handlers.LevelRouterLogHandler(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.android.logger.LogLevel.INFO, kotlin.collections.CollectionsKt.listOf(datadogRumCustomActionLogHandler)), kotlin.TuplesKt.to(com.paypal.android.logger.LogLevel.WARN, kotlin.collections.CollectionsKt.listOf(datadogRumCustomActionLogHandler)), kotlin.TuplesKt.to(com.paypal.android.logger.LogLevel.ERROR, kotlin.collections.CollectionsKt.listOf(new com.paypal.android.logger.datadog.DatadogRumErrorLogHandler(null, 1, null))))));
    }

    public static /* synthetic */ com.paypal.android.logger.LogHandlerChain $r8$lambda$I9ss1NThEsAY28mSiHSo7OzK52A() {
        com.paypal.android.logger.LogHandlerChain logHandlerChain = new com.paypal.android.logger.LogHandlerChain();
        com.paypal.android.logger.datadog.DatadogRumCustomActionLogHandler datadogRumCustomActionLogHandler = new com.paypal.android.logger.datadog.DatadogRumCustomActionLogHandler(null, 1, null);
        return logHandlerChain.add(new com.paypal.android.logger.handlers.LevelRouterLogHandler(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.android.logger.LogLevel.INFO, kotlin.collections.CollectionsKt.listOf(datadogRumCustomActionLogHandler)), kotlin.TuplesKt.to(com.paypal.android.logger.LogLevel.WARN, kotlin.collections.CollectionsKt.listOf(datadogRumCustomActionLogHandler)), kotlin.TuplesKt.to(com.paypal.android.logger.LogLevel.ERROR, kotlin.collections.CollectionsKt.listOf(new com.paypal.android.logger.datadog.DatadogRumErrorLogHandler(null, 1, null))))));
    }
}
