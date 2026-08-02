package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B¥\u0001\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0012\b\u0002\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%Bq\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b$\u00104J\u001d\u00108\u001a\u0002072\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0013H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u0002072\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0013H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000207H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u000207H\u0016¢\u0006\u0004\b>\u0010<J\u000f\u0010?\u001a\u000207H\u0016¢\u0006\u0004\b?\u0010<J\u000f\u0010@\u001a\u000207H\u0016¢\u0006\u0004\b@\u0010<R\u0014\u0010C\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010A\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010D\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010JR\u0014\u0010M\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010QR\u0014\u0010N\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010SR\u0014\u0010K\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010TR\u0014\u0010U\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/SessionReplayRecorder;", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;", "Lcom/datadog/android/sessionreplay/internal/recorder/Recorder;", "Landroid/app/Application;", "appContext", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "resourcesWriter", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "rumContextProvider", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "recordWriter", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "", "Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "mappers", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "customOptionSelectorDetectors", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "customDrawableMappers", "Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;", "windowInspector", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/sessionreplay/internal/resources/ResourceDataStoreManager;", "resourceDataStoreManager", "", "dynamicOptimizationEnabled", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "internalCallback", "<init>", "(Landroid/app/Application;Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;Lcom/datadog/android/internal/time/TimeProvider;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/sessionreplay/internal/resources/ResourceDataStoreManager;ZLcom/datadog/android/sessionreplay/SessionReplayInternalCallback;)V", "Lcom/datadog/android/sessionreplay/internal/recorder/WindowCallbackInterceptor;", "windowCallbackInterceptor", "Lcom/datadog/android/sessionreplay/internal/LifecycleCallback;", "sessionReplayLifecycleCallback", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "viewOnDrawInterceptor", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "recordedDataQueueHandler", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourceResolver;", "resourceResolver", "Landroid/os/Handler;", "uiHandler", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "(Landroid/app/Application;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Ljava/util/List;Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;Lcom/datadog/android/sessionreplay/internal/recorder/WindowCallbackInterceptor;Lcom/datadog/android/sessionreplay/internal/LifecycleCallback;Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourceResolver;Landroid/os/Handler;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/view/Window;", "windows", "", "onWindowsAdded", "(Ljava/util/List;)V", "onWindowsRemoved", "registerCallbacks", "()V", "resumeRecorders", "stopProcessingRecords", "stopRecorders", "unregisterCallbacks", "getHighSpeedVideoFpsRanges", "Landroid/app/Application;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "getInputFormats", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourceResolver;", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/sessionreplay/internal/LifecycleCallback;", "getOutputFormats", "Z", "getInputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "Landroid/os/Handler;", "getOutputMinFrameDurationlomOqCM", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "getOutputSizes", "Lcom/datadog/android/sessionreplay/internal/recorder/WindowCallbackInterceptor;", "getOutputStallDurationlomOqCM", "Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;", "getOutputStallDuration"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayRecorder implements com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback, com.datadog.android.sessionreplay.internal.recorder.Recorder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.app.Application Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.ImagePrivacy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.LifecycleCallback getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.os.Handler getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;
    private final com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.WindowCallbackInterceptor getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.WindowInspector getOutputStallDuration;

    public /* synthetic */ SessionReplayRecorder(android.app.Application application, com.datadog.android.sessionreplay.internal.storage.ResourcesWriter resourcesWriter, com.datadog.android.sessionreplay.internal.utils.RumContextProvider rumContextProvider, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.sessionreplay.internal.storage.RecordWriter recordWriter, com.datadog.android.internal.time.TimeProvider timeProvider, java.util.List list, java.util.List list2, java.util.List list3, com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager, boolean z, com.datadog.android.sessionreplay.SessionReplayInternalCallback sessionReplayInternalCallback, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(application, resourcesWriter, rumContextProvider, textAndInputPrivacy, imagePrivacy, touchPrivacyManager, recordWriter, timeProvider, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, list3, (i & 2048) != 0 ? com.datadog.android.sessionreplay.internal.recorder.WindowInspector.INSTANCE : windowInspector, featureSdkCore, resourceDataStoreManager, z, sessionReplayInternalCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionReplayRecorder(android.app.Application application, com.datadog.android.sessionreplay.internal.storage.ResourcesWriter resourcesWriter, com.datadog.android.sessionreplay.internal.utils.RumContextProvider rumContextProvider, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.sessionreplay.internal.storage.RecordWriter recordWriter, com.datadog.android.internal.time.TimeProvider timeProvider, java.util.List<? extends com.datadog.android.sessionreplay.MapperTypeWrapper<?>> list, java.util.List<? extends com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list2, java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> list3, com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager, boolean z, com.datadog.android.sessionreplay.SessionReplayInternalCallback sessionReplayInternalCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourcesWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInspector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceDataStoreManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayInternalCallback, "");
        com.datadog.android.api.InternalLogger internalLogger = featureSdkCore.getInternalLogger();
        com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler rumContextDataHandler = new com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler(rumContextProvider, timeProvider, internalLogger);
        com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor recordedDataProcessor = new com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor(resourceDataStoreManager, resourcesWriter, recordWriter, new com.datadog.android.sessionreplay.internal.processor.MutationResolver(internalLogger), timeProvider, null, 32, null);
        this.Camera2StreamConfigurationMap = application;
        this.getHighSpeedVideoSizesFor = textAndInputPrivacy;
        this.getHighSpeedVideoFpsRanges = imagePrivacy;
        this.getHighSpeedVideoSizes = list2;
        this.getOutputStallDuration = windowInspector;
        com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler = new com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler(recordedDataProcessor, rumContextDataHandler, internalLogger, featureSdkCore.createSingleThreadExecutorService("sr-event-processing"), new java.util.concurrent.ConcurrentLinkedQueue(), timeProvider, 0.0f, null, 192, null);
        this.getHighSpeedVideoFpsRangesFor = recordedDataQueueHandler;
        com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver defaultViewIdentifierResolver = com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver.INSTANCE;
        com.datadog.android.sessionreplay.utils.DefaultColorStringFormatter defaultColorStringFormatter = com.datadog.android.sessionreplay.utils.DefaultColorStringFormatter.INSTANCE;
        com.datadog.android.sessionreplay.utils.DefaultViewBoundsResolver defaultViewBoundsResolver = com.datadog.android.sessionreplay.utils.DefaultViewBoundsResolver.INSTANCE;
        com.datadog.android.sessionreplay.internal.recorder.mapper.ViewWireframeMapper viewWireframeMapper = new com.datadog.android.sessionreplay.internal.recorder.mapper.ViewWireframeMapper(defaultViewIdentifierResolver, defaultColorStringFormatter, defaultViewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper.INSTANCE.getDefault(list3));
        com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager bitmapCachesManager = new com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager(new com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache(null, null, null, 7, null), new com.datadog.android.sessionreplay.internal.recorder.resources.BitmapPool(null, null, null, null, null, null, 63, null), internalLogger);
        com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver resourceResolver = new com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver(application, bitmapCachesManager, new com.datadog.android.sessionreplay.internal.utils.PathUtils(internalLogger, bitmapCachesManager, null, null, null, 28, null), null, new com.datadog.android.sessionreplay.internal.utils.DrawableUtils(internalLogger, bitmapCachesManager, featureSdkCore.createSingleThreadExecutorService("drawables"), null, null, 24, null), new com.datadog.android.sessionreplay.internal.recorder.resources.WebPImageCompression(internalLogger, null, 2, null), internalLogger, new com.datadog.android.sessionreplay.internal.recorder.resources.MD5HashGenerator(internalLogger), recordedDataQueueHandler, null, null, null, 3592, null);
        this.getOutputMinFrameDuration = resourceResolver;
        com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor viewOnDrawInterceptor = new com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor(internalLogger, touchPrivacyManager, new com.datadog.android.sessionreplay.internal.recorder.DefaultOnDrawListenerProducer(new com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer(new com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper(internalLogger, resourceResolver, defaultViewIdentifierResolver, new com.datadog.android.sessionreplay.internal.recorder.ViewUtilsInternal(), new com.datadog.android.sessionreplay.internal.recorder.resources.ImageTypeResolver()), new com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal(list, viewWireframeMapper, new com.datadog.android.sessionreplay.internal.recorder.mapper.HiddenViewMapper(defaultViewIdentifierResolver, defaultViewBoundsResolver), new com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper(viewWireframeMapper, defaultViewIdentifierResolver), new com.datadog.android.sessionreplay.internal.recorder.ViewUtilsInternal(), internalLogger), new com.datadog.android.sessionreplay.internal.recorder.ComposedOptionSelectorDetector(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.datadog.android.sessionreplay.internal.recorder.DefaultOptionSelectorDetector>) list2, new com.datadog.android.sessionreplay.internal.recorder.DefaultOptionSelectorDetector())), touchPrivacyManager, internalLogger), recordedDataQueueHandler, featureSdkCore, z));
        this.getOutputMinFrameDurationlomOqCM = viewOnDrawInterceptor;
        this.getOutputStallDurationlomOqCM = new com.datadog.android.sessionreplay.internal.recorder.WindowCallbackInterceptor(recordedDataQueueHandler, viewOnDrawInterceptor, timeProvider, rumContextProvider, internalLogger, imagePrivacy, textAndInputPrivacy, touchPrivacyManager);
        com.datadog.android.sessionreplay.internal.SessionReplayLifecycleCallback sessionReplayLifecycleCallback = new com.datadog.android.sessionreplay.internal.SessionReplayLifecycleCallback(this);
        this.getOutputFormats = sessionReplayLifecycleCallback;
        android.app.Activity currentActivity = sessionReplayInternalCallback.getCurrentActivity();
        if (currentActivity != null) {
            com.datadog.android.sessionreplay.internal.SessionReplayLifecycleCallback sessionReplayLifecycleCallback2 = sessionReplayLifecycleCallback;
            sessionReplayLifecycleCallback2.setCurrentWindow(currentActivity);
            sessionReplayLifecycleCallback2.registerFragmentLifecycleCallbacks(currentActivity);
        }
        sessionReplayInternalCallback.setResourceQueue(new com.datadog.android.sessionreplay.internal.processor.ResourceQueueImpl(recordedDataQueueHandler));
        this.getInputFormats = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    public /* synthetic */ SessionReplayRecorder(android.app.Application application, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, java.util.List list, com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector, com.datadog.android.sessionreplay.internal.recorder.WindowCallbackInterceptor windowCallbackInterceptor, com.datadog.android.sessionreplay.internal.LifecycleCallback lifecycleCallback, com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor viewOnDrawInterceptor, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver resourceResolver, android.os.Handler handler, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(application, textAndInputPrivacy, imagePrivacy, list, (i & 16) != 0 ? com.datadog.android.sessionreplay.internal.recorder.WindowInspector.INSTANCE : windowInspector, windowCallbackInterceptor, lifecycleCallback, viewOnDrawInterceptor, recordedDataQueueHandler, resourceResolver, handler, internalLogger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionReplayRecorder(android.app.Application application, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, java.util.List<? extends com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list, com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector, com.datadog.android.sessionreplay.internal.recorder.WindowCallbackInterceptor windowCallbackInterceptor, com.datadog.android.sessionreplay.internal.LifecycleCallback lifecycleCallback, com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor viewOnDrawInterceptor, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver resourceResolver, android.os.Handler handler, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInspector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowCallbackInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewOnDrawInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = application;
        this.getHighSpeedVideoSizesFor = textAndInputPrivacy;
        this.getHighSpeedVideoFpsRanges = imagePrivacy;
        this.getHighSpeedVideoSizes = list;
        this.getOutputStallDuration = windowInspector;
        this.getHighSpeedVideoFpsRangesFor = recordedDataQueueHandler;
        this.getOutputMinFrameDurationlomOqCM = viewOnDrawInterceptor;
        this.getOutputStallDurationlomOqCM = windowCallbackInterceptor;
        this.getOutputFormats = lifecycleCallback;
        this.getOutputMinFrameDuration = resourceResolver;
        this.getInputFormats = handler;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.Recorder
    public final void stopProcessingRecords() {
        this.getHighSpeedVideoFpsRangesFor.clearAndStopProcessingQueue();
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.Recorder
    public final void registerCallbacks() {
        this.Camera2StreamConfigurationMap.registerActivityLifecycleCallbacks(this.getOutputFormats);
        this.getOutputMinFrameDuration.registerCallbacks$dd_sdk_android_session_replay_release();
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.Recorder
    public final void unregisterCallbacks() {
        this.Camera2StreamConfigurationMap.unregisterActivityLifecycleCallbacks(this.getOutputFormats);
        this.getOutputMinFrameDuration.unregisterCallbacks$dd_sdk_android_session_replay_release();
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.Recorder
    public final void resumeRecorders() {
        this.getInputFormats.post(new java.lang.Runnable() { // from class: com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder.m10026$r8$lambda$GltJEayKSGeoyE2UqKdypDhksM(com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder.this);
            }
        });
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.Recorder
    public final void stopRecorders() {
        this.getInputFormats.post(new java.lang.Runnable() { // from class: com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder.m10025$r8$lambda$Ach9D147HUjed0CbcgOlzC76Q(com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder.this);
            }
        });
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback
    public final void onWindowsAdded(java.util.List<? extends android.view.Window> windows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windows, "");
        if (this.getInputSizeshNQ4ISI) {
            java.util.List<? extends android.view.View> globalWindowViews$default = com.datadog.android.sessionreplay.internal.recorder.WindowInspector.getGlobalWindowViews$default(this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, null, 2, null);
            this.getOutputStallDurationlomOqCM.intercept(windows, this.Camera2StreamConfigurationMap);
            this.getOutputMinFrameDurationlomOqCM.intercept(globalWindowViews$default, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback
    public final void onWindowsRemoved(java.util.List<? extends android.view.Window> windows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windows, "");
        if (this.getInputSizeshNQ4ISI) {
            java.util.List<? extends android.view.View> globalWindowViews$default = com.datadog.android.sessionreplay.internal.recorder.WindowInspector.getGlobalWindowViews$default(this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, null, 2, null);
            this.getOutputStallDurationlomOqCM.stopIntercepting(windows);
            this.getOutputMinFrameDurationlomOqCM.intercept(globalWindowViews$default, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges);
        }
    }

    /* renamed from: $r8$lambda$Ach9D147HU-jed0C-bcgOlzC76Q, reason: not valid java name */
    public static /* synthetic */ void m10025$r8$lambda$Ach9D147HUjed0CbcgOlzC76Q(com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder sessionReplayRecorder) {
        sessionReplayRecorder.getOutputMinFrameDurationlomOqCM.stopIntercepting();
        sessionReplayRecorder.getOutputStallDurationlomOqCM.stopIntercepting();
        sessionReplayRecorder.getInputSizeshNQ4ISI = false;
    }

    /* renamed from: $r8$lambda$G-ltJEayKSGeoyE2UqKdypDhksM, reason: not valid java name */
    public static /* synthetic */ void m10026$r8$lambda$GltJEayKSGeoyE2UqKdypDhksM(com.datadog.android.sessionreplay.internal.recorder.SessionReplayRecorder sessionReplayRecorder) {
        sessionReplayRecorder.getInputSizeshNQ4ISI = true;
        java.util.List<android.view.Window> currentWindows = sessionReplayRecorder.getOutputFormats.getCurrentWindows();
        java.util.List<? extends android.view.View> globalWindowViews$default = com.datadog.android.sessionreplay.internal.recorder.WindowInspector.getGlobalWindowViews$default(sessionReplayRecorder.getOutputStallDuration, sessionReplayRecorder.getHighResolutionOutputSizeshNQ4ISI, null, 2, null);
        sessionReplayRecorder.getOutputStallDurationlomOqCM.intercept(currentWindows, sessionReplayRecorder.Camera2StreamConfigurationMap);
        sessionReplayRecorder.getOutputMinFrameDurationlomOqCM.intercept(globalWindowViews$default, sessionReplayRecorder.getHighSpeedVideoSizesFor, sessionReplayRecorder.getHighSpeedVideoFpsRanges);
    }
}
