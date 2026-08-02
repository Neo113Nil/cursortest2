package com.datadog.trace.api;

/* loaded from: classes3.dex */
public class Config {
    public static final java.lang.String PREFIX = "dd.";
    private final boolean AMEXKernel;
    private final java.lang.Integer AMEXKernelCallback;
    private final boolean AMEXKernelJNI;
    private final boolean AMEXKernelProvider;
    private final boolean AMEXKernela;
    private final boolean ActivityFlags;
    private final int ActivityViewModelLazyKt;
    private final boolean ActivityViewModelLazyKtviewModels1;
    private final java.lang.Double ActivityViewModelLazyKtviewModels2;
    private final java.util.Map<java.lang.String, java.lang.String> ActivityViewModelLazyKtviewModels3;
    private final boolean ActivityViewModelLazyKtviewModels4;
    private final int ActivityViewModelLazyKtviewModelsfactoryPromise1;
    private final boolean ActivityViewModelLazyKtviewModelsfactoryPromise2;
    private final boolean Api26Impl;
    private final boolean ArtificialStackFrames;
    private final boolean BerTlvEncoder;
    private final boolean CoroutineDebuggingKt;
    private final boolean IAuthTabCallback;
    private final java.util.Map<java.lang.String, java.lang.String> IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final java.lang.String IAuthTabCallbackStubProxy;
    private final boolean ICustomTabsCallback;
    private final java.lang.String ICustomTabsCallbackDefault;
    private final int ICustomTabsCallbackStub;
    private final boolean ICustomTabsCallbackStubProxy;
    private final java.lang.String ICustomTabsService;
    private final java.lang.String ICustomTabsServiceDefault;
    private final java.lang.String ICustomTabsServiceStub;
    private final float ICustomTabsServiceStubProxy;
    private final java.lang.String ICustomTabsService_Parcel;
    private final java.util.Map<java.lang.String, java.lang.String> IEngagementSignalsCallback;
    private final java.util.Map<java.lang.String, java.lang.String> IEngagementSignalsCallbackDefault;
    private final java.lang.String IEngagementSignalsCallbackStub;
    private final java.lang.String IEngagementSignalsCallbackStubProxy;
    private final boolean INotificationSideChannel;
    private final boolean INotificationSideChannelDefault;
    private final java.lang.Integer INotificationSideChannelStub;
    private final java.lang.Integer INotificationSideChannelStubProxy;
    private final boolean IPostMessageService;
    private final boolean IPostMessageServiceDefault;
    private final int IPostMessageServiceStub;
    private final boolean IPostMessageServiceStubProxy;
    private final long IResultReceiver;
    private final java.util.List<java.lang.String> IResultReceiver2;
    private final boolean IResultReceiver2Default;
    private final boolean IResultReceiver2Stub;
    private final boolean IResultReceiver2StubProxy;
    private final float IResultReceiverDefault;
    private final boolean IResultReceiverStub;
    private final java.lang.String IResultReceiverStubProxy;
    private final java.util.Map<java.lang.String, java.lang.String> ITrustedWebActivityCallback;
    private final boolean ITrustedWebActivityCallbackDefault;
    private final boolean ITrustedWebActivityCallbackStub;
    private final int ITrustedWebActivityCallbackStubProxy;
    private final java.lang.String ITrustedWebActivityService;
    private final java.util.Map<java.lang.String, java.lang.String> ITrustedWebActivityServiceDefault;
    private final int ITrustedWebActivityServiceStub;
    private final java.lang.String ITrustedWebActivityServiceStubProxy;
    private final boolean IconCompatParcelizer;
    private final java.util.Map<java.lang.String, java.lang.String> RemoteActionCompatParcelizer;
    private final boolean ResultReceiver;
    private final boolean ResultReceiver1;
    private final boolean ResultReceiverMyResultReceiver;
    private final java.util.Set<com.datadog.trace.api.TracePropagationStyle> ResultReceiverMyRunnable;
    private final boolean TransactionOutcomeDecoder;
    private final boolean TransactionOutcomeDecoderExternalSyntheticLambda0;
    private final boolean TransactionOutcomeDecoderExternalSyntheticLambda1;
    private final int TransactionOutcomeDecoderExternalSyntheticLambda2;
    private final java.util.Set<java.lang.String> TransactionOutcomeDecoderExternalSyntheticLambda3;
    private final boolean TransactionOutcomeDecoderExternalSyntheticLambda4;
    private final boolean TransactionOutcomeDecoderExternalSyntheticLambda5;
    private final java.util.Set<java.lang.String> TransactionOutcomeDecoderExternalSyntheticLambda6;
    private final java.util.Set<java.lang.String> TransactionOutcomeDecoderExternalSyntheticLambda7;
    private final boolean TransactionOutcomeDecodera;
    private final java.lang.String _BOUNDARY;
    private final int _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<java.lang.String> f2924a;
    private final boolean accessartificialFrame;
    private final com.datadog.trace.api.InstrumenterConfig aid;
    private final boolean apply;
    private final java.lang.String areNotificationsEnabled;
    private final boolean asBinder;
    private final java.util.Map<java.lang.String, java.lang.String> asInterface;
    private final boolean b;
    private final java.util.Set<java.lang.String> c;
    private final boolean cancel;
    private final long cancelAll;
    private final boolean cancelNotification;
    private final boolean coroutineBoundary;
    private final boolean coroutineCreation;
    private final boolean d;
    private final boolean decode;
    private final float describeContents;
    private final boolean encode;
    private final java.util.BitSet exchange;
    private final java.lang.String extraCallback;
    private final int extraCallbackWithResult;
    private final java.lang.String extraCommand;
    private final boolean free;
    private final java.util.BitSet freeTransaction;
    private final java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final boolean getActiveNotifications;
    private final int getFrameTimeMillis;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final int getInterfaceVersion;
    private final java.lang.String getOutputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    private final boolean getOutputMinFrameDurationlomOqCM;
    private final java.util.Map<java.lang.String, java.lang.String> getOutputSizes;
    private final boolean getOutputSizeshNQ4ISI;
    private final boolean getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;
    private java.lang.String getProgress;
    private final boolean getSmallIconBitmap;
    private final java.lang.String getSmallIconId;
    private final java.lang.String getSwipeEdge;
    private final float getValidOutputFormatsForInputhNQ4ISI;
    private final java.util.BitSet init;
    private final java.lang.String invoke;
    private final int isEngagementSignalsApiAvailable;
    private final com.datadog.trace.bootstrap.config.provider.ConfigProvider isOutputSupportedFor;
    private final java.util.Map<java.lang.String, java.lang.String> isOutputSupportedForhNQ4ISI;
    private final boolean kernelID;
    private java.lang.String kernelVersion;
    private final java.util.BitSet l;
    private final java.util.Map<java.lang.String, java.lang.String> mayLaunchUrl;
    private final boolean newAuthTabSession;
    private final boolean newContext;
    private final java.lang.String newSession;
    private final int newSessionWithExtras;
    private final java.util.Set<java.lang.String> notify;
    private final boolean notifyNotificationWithChannel;
    private final boolean onActivityLayout;
    private final int onActivityResized;
    private final long onExtraCallback;
    private final java.lang.String onExtraCallbackWithResult;
    private final boolean onGreatestScrollPercentageIncreased;
    private final int onMessageChannelReady;
    private final boolean onMinimized;
    private final java.util.Set<java.lang.String> onNavigationEvent;
    private final boolean onPostMessage;
    private final boolean onReceiveResult;
    private final int onRelationshipValidationResult;
    private final boolean onSessionEnded;
    private final boolean onTransact;
    private final java.lang.String onUnminimized;
    private final boolean onVerticalScrollEvent;
    private final boolean onWarmupCompleted;
    private final boolean postMessage;

    @java.lang.Deprecated
    private final java.lang.String prefetch;
    private final int prefetchWithMultipleUrls;
    private final com.datadog.trace.api.IdGenerationStrategy provide;
    private final java.lang.Integer read;
    private final boolean receiveFile;
    private final java.lang.String release;
    private final java.util.Map<java.lang.String, java.lang.String> requestGoOnline;
    private final boolean requestPINEntry;
    private final boolean requestPostMessageChannel;
    private final java.util.Set<java.lang.String> requestPostMessageChannelWithExtras;
    private final boolean resetTransaction;
    private final java.util.Map<java.lang.String, java.lang.String> rsaCipher;
    private final float send;
    private final java.util.Set<java.lang.String> setEngagementSignalsCallback;
    private final int setPipParamsSourceRectHint;
    private final boolean setup;
    private final boolean sha1;
    private final boolean start;
    private final java.util.Set<java.lang.String> startTransaction;
    private final java.lang.String toString;
    private final boolean unwrapAs;
    private final boolean updateUI;
    private final boolean updateVisuals;
    private final boolean validateRelationship;
    private final boolean valueOf;
    private final boolean values;
    private final boolean version;
    private final java.util.Set<com.datadog.trace.api.TracePropagationStyle> viewModels;
    private final java.util.Map<java.lang.String, java.lang.String> viewModelsdefault;
    private final long warmup;
    private final boolean write;
    private final java.lang.String writeToParcel;
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRanges = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.api.Config.class);
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap = java.util.regex.Pattern.compile(io.ktor.sse.ServerSentEventKt.COLON);
    private static final com.datadog.trace.api.Config getHighSpeedVideoSizes = new com.datadog.trace.api.Config(com.datadog.trace.bootstrap.config.provider.ConfigProvider.getInstance(), com.datadog.trace.api.InstrumenterConfig.get());

    public boolean isCiVisibilityEnabled() {
        return false;
    }

    static class RuntimeIdHolder {
        static final java.lang.String getHighSpeedVideoSizes = java.util.UUID.randomUUID().toString();

        RuntimeIdHolder() {
        }
    }

    static class HostNameHolder {
        static final java.lang.String Camera2StreamConfigurationMap = com.datadog.trace.api.Config.getHighSpeedVideoFpsRangesFor();

        HostNameHolder() {
        }
    }

    private Config() {
        this(com.datadog.trace.bootstrap.config.provider.ConfigProvider.createDefault());
    }

    private Config(com.datadog.trace.bootstrap.config.provider.ConfigProvider configProvider) {
        this(configProvider, new com.datadog.trace.api.InstrumenterConfig(configProvider));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Config(com.datadog.trace.bootstrap.config.provider.ConfigProvider configProvider, com.datadog.trace.api.InstrumenterConfig instrumenterConfig) {
        java.lang.String str;
        int port;
        boolean z;
        int i;
        int parseInt;
        java.util.Set<com.datadog.trace.api.TracePropagationStyle> Camera2StreamConfigurationMap2;
        java.util.Set<com.datadog.trace.api.TracePropagationStyle> Camera2StreamConfigurationMap3;
        float f;
        float f2;
        java.lang.String string;
        java.lang.String string2;
        boolean z2;
        long j;
        this.cancelAll = java.lang.System.currentTimeMillis();
        this.isOutputSupportedFor = configProvider;
        this.aid = instrumenterConfig;
        this.toString = configProvider.getConfigFileStatus();
        this.IPostMessageServiceDefault = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.RUNTIME_ID_ENABLED, true, new java.lang.String[0]);
        this.IEngagementSignalsCallbackStubProxy = java.lang.System.getProperty("java.version", "unknown");
        this.areNotificationsEnabled = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.SITE, "datadoghq.com", new java.lang.String[0]);
        java.lang.String string3 = configProvider.getString("service", null, "service.name");
        if (string3 == null) {
            this.cancelNotification = false;
            this.ITrustedWebActivityService = configProvider.getString("service", com.datadog.trace.api.ConfigDefaults.DEFAULT_SERVICE_NAME, "service.name");
        } else {
            this.cancelNotification = true;
            this.ITrustedWebActivityService = string3;
        }
        this.IEngagementSignalsCallbackStub = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_ROOT_CONTEXT_SERVICE_NAME, com.datadog.trace.api.ConfigDefaults.DEFAULT_SERVLET_ROOT_CONTEXT_SERVICE_NAME, new java.lang.String[0]);
        this.decode = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.INTEGRATION_SYNAPSE_LEGACY_OPERATION_NAME, false, new java.lang.String[0]);
        this.getSwipeEdge = configProvider.getString(com.datadog.trace.api.config.TracerConfig.WRITER_TYPE, com.datadog.trace.api.ConfigDefaults.DEFAULT_AGENT_WRITER_TYPE, new java.lang.String[0]);
        this.BerTlvEncoder = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.WRITER_BAGGAGE_INJECT, true, new java.lang.String[0]);
        boolean z3 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SECURE_RANDOM, false, new java.lang.String[0]);
        this.ITrustedWebActivityCallbackStub = z3;
        this.AMEXKernel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.ELASTICSEARCH_BODY_ENABLED, false, new java.lang.String[0]);
        this.d = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.ELASTICSEARCH_PARAMS_ENABLED, true, new java.lang.String[0]);
        this.b = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.ELASTICSEARCH_BODY_AND_PARAMS_ENABLED, false, new java.lang.String[0]);
        java.lang.String string4 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.ID_GENERATION_STRATEGY);
        boolean z4 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_128_BIT_TRACEID_GENERATION_ENABLED, true, new java.lang.String[0]);
        this.IResultReceiver2Stub = z4;
        string4 = z3 ? "SECURE_RANDOM" : string4;
        string4 = string4 == null ? "RANDOM" : string4;
        com.datadog.trace.api.IdGenerationStrategy fromName = com.datadog.trace.api.IdGenerationStrategy.fromName(string4, z4);
        if (fromName == null) {
            getHighSpeedVideoFpsRanges.warn("*** you are trying to use an unknown id generation strategy {} - falling back to RANDOM", string4);
            fromName = com.datadog.trace.api.IdGenerationStrategy.fromName("RANDOM", z4);
            string4 = "RANDOM";
        }
        if (!string4.equals("RANDOM") && !string4.equals("SECURE_RANDOM")) {
            getHighSpeedVideoFpsRanges.warn("*** you are using an unsupported id generation strategy {} - this can impact correctness of traces", string4);
        }
        this.provide = fromName;
        java.lang.String string5 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_URL);
        if (string5 != null) {
            try {
                java.net.URI uri = new java.net.URI(string5);
                str = uri.getHost();
                try {
                    port = uri.getPort();
                } catch (java.net.URISyntaxException e) {
                    e = e;
                    getHighSpeedVideoFpsRanges.warn("{} not configured correctly: {}. Ignoring", com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_URL, e.getMessage());
                    port = -1;
                    if (str == null) {
                    }
                    if (port < 0) {
                    }
                    if (str == null) {
                    }
                    if (port < 0) {
                    }
                    if (z) {
                    }
                    java.lang.String string6 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.AGENT_NAMED_PIPE);
                    this.getOutputMinFrameDuration = string6;
                    this.getHighSpeedVideoFpsRangesFor = str != null && port < 0 && string6 == null;
                    this.getHighSpeedVideoSizesFor = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.AGENT_TIMEOUT, 10, new java.lang.String[0]);
                    this.onNavigationEvent = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getSpacedList(com.datadog.trace.api.config.TracerConfig.PROXY_NO_PROXY));
                    this.onActivityLayout = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PRIORITY_SAMPLING, true, new java.lang.String[0]);
                    this.IAuthTabCallbackStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.PRIORITY_SAMPLING_FORCE, com.datadog.trace.api.ConfigDefaults.getInputFormats, new java.lang.String[0]);
                    this.ResultReceiverMyResultReceiver = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_RESOLVER_ENABLED, true, new java.lang.String[0]);
                    this.ITrustedWebActivityCallback = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.SERVICE_MAPPING);
                    java.util.HashMap hashMap = new java.util.HashMap(configProvider.getMergedMap(com.datadog.trace.api.config.GeneralConfig.GLOBAL_TAGS));
                    hashMap.putAll(configProvider.getMergedMap("tags"));
                    java.lang.String[] strArr = {"env", "version"};
                    java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
                    while (i < 2) {
                    }
                    this.RemoteActionCompatParcelizer = java.util.Collections.unmodifiableMap(hashMap2);
                    this.ITrustedWebActivityServiceDefault = configProvider.getMergedMap("trace.span.tags");
                    this.extraCallback = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.PRIMARY_TAG);
                    if (isEnabled(false, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, ".legacy.parsing.enabled")) {
                    }
                    this.onGreatestScrollPercentageIncreased = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS_COMMA_ALLOWED, true, new java.lang.String[0]);
                    this.getOutputSizes = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.BAGGAGE_MAPPING);
                    java.lang.String string7 = this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_SPAN_ATTRIBUTE_SCHEMA, "v0", new java.lang.String[0]);
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("^v?(0|[1-9]\\d*)$").matcher(string7);
                    if (matcher.matches()) {
                    }
                    if (parseInt >= 0) {
                    }
                    getHighSpeedVideoFpsRanges.warn("Invalid attribute schema version {} invalid or out of range [v{}, v{}]. Defaulting to v{}", string7, 0, 1, 0);
                    parseInt = 0;
                    this.ITrustedWebActivityServiceStub = parseInt;
                    this.IAuthTabCallbackStub = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_DEFAULTS_ENABLED, false, new java.lang.String[0]);
                    this.asInterface = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_COMPONENT_OVERRIDES);
                    this.onSessionEnded = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_REMOVE_INTEGRATION_SERVICE_NAMES_ENABLED, false, new java.lang.String[0]);
                    this.IAuthTabCallbackDefault = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_MAPPING);
                    this.rsaCipher = configProvider.getOrderedMap(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_SERVER_PATH_RESOURCE_NAME_MAPPING);
                    this.requestGoOnline = configProvider.getOrderedMap(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_CLIENT_PATH_RESOURCE_NAME_MAPPING);
                    this.sha1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_RESOURCE_REMOVE_TRAILING_SLASH, false, new java.lang.String[0]);
                    this.freeTransaction = configProvider.getIntegerRange(com.datadog.trace.api.config.TracerConfig.HTTP_SERVER_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizes);
                    this.l = configProvider.getIntegerRange(com.datadog.trace.api.config.TracerConfig.HTTP_CLIENT_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoFpsRangesFor);
                    this.newContext = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_TAG_QUERY_STRING, true, new java.lang.String[0]);
                    this.AMEXKernelProvider = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_RAW_QUERY_STRING, true, new java.lang.String[0]);
                    this.start = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_RAW_RESOURCE, false, new java.lang.String[0]);
                    this.free = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_DECODED_RESOURCE_PRESERVE_SPACES, true, new java.lang.String[0]);
                    this.setup = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_ROUTE_BASED_NAMING, true, new java.lang.String[0]);
                    this.AMEXKernelJNI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_TAG_QUERY_STRING, false, new java.lang.String[0]);
                    this.requestPINEntry = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_TAG_HEADERS, true, new java.lang.String[0]);
                    this.updateUI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_HOST_SPLIT_BY_DOMAIN, false, new java.lang.String[0]);
                    this.coroutineCreation = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_INSTANCE, false, new java.lang.String[0]);
                    this.CoroutineDebuggingKt = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_INSTANCE_TYPE_SUFFIX, false, new java.lang.String[0]);
                    this.coroutineBoundary = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_HOST, false, new java.lang.String[0]);
                    this.getHighResolutionOutputSizeshNQ4ISI = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_DBM_PROPAGATION_MODE_MODE, "disabled", new java.lang.String[0]);
                    this.notify = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TracerConfig.SPLIT_BY_TAGS));
                    this.cancel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SPRING_DATA_REPOSITORY_INTERFACE_RESOURCE_NAME, true, new java.lang.String[0]);
                    this.IPostMessageServiceStub = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.SCOPE_DEPTH_LIMIT, 100, new java.lang.String[0]);
                    this.IPostMessageServiceStubProxy = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SCOPE_STRICT_MODE, false, new java.lang.String[0]);
                    this.ITrustedWebActivityCallbackDefault = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SCOPE_INHERIT_ASYNC_PROPAGATION, true, new java.lang.String[0]);
                    this.ITrustedWebActivityCallbackStubProxy = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.SCOPE_ITERATION_KEEP_ALIVE, 30, new java.lang.String[0]);
                    this.getInterfaceVersion = !configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PARTIAL_FLUSH_ENABLED, true, new java.lang.String[0]) ? 0 : configProvider.getInteger("trace.partial.flush.min.spans", 1000, new java.lang.String[0]);
                    this.ActivityViewModelLazyKtviewModels1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_STRICT_WRITES_ENABLED, false, new java.lang.String[0]);
                    this.values = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PROPAGATION_EXTRACT_LOG_HEADER_NAMES_ENABLED, false, new java.lang.String[0]);
                    this.ActivityFlags = isEnabled(true, com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, ".b3.padding.enabled");
                    java.util.Set<com.datadog.trace.api.TracePropagationStyle> Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
                        @Override // com.datadog.android.trace.internal.compat.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
                        }
                    });
                    Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
                        @Override // com.datadog.android.trace.internal.compat.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
                        }
                    });
                    Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
                        @Override // com.datadog.android.trace.internal.compat.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
                        }
                    });
                    if (Camera2StreamConfigurationMap2.isEmpty()) {
                    }
                    if (!Camera2StreamConfigurationMap3.isEmpty()) {
                    }
                    this.viewModels = Camera2StreamConfigurationMap2.isEmpty() ? com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizesFor : Camera2StreamConfigurationMap2;
                    this.ResultReceiverMyRunnable = Camera2StreamConfigurationMap4.isEmpty() ? com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizesFor : Camera2StreamConfigurationMap4;
                    this.ResultReceiver = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_EXTRACT_FIRST, false, new java.lang.String[0]);
                    this.getOutputStallDurationlomOqCM = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.CLOCK_SYNC_PERIOD, 30, new java.lang.String[0]);
                    this.valueOf = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.LOGS_INJECTION_ENABLED, true, new java.lang.String[0]);
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_NAMED_PIPE);
                    this._CREATION = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_START_DELAY, 15, new java.lang.String[0]);
                    this.INotificationSideChannelStub = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_QUEUE_SIZE);
                    this.read = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_SOCKET_BUFFER);
                    this.INotificationSideChannelStubProxy = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_SOCKET_TIMEOUT);
                    boolean z5 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.RUNTIME_METRICS_ENABLED, true, new java.lang.String[0]);
                    this.IPostMessageService = z5;
                    this.AMEXKernela = !z5 && configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_ENABLED, true, new java.lang.String[0]);
                    this.release = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_STATSD_HOST);
                    this.AMEXKernelCallback = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_STATSD_PORT);
                    this.asBinder = !z5 && configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.PERF_METRICS_ENABLED, false, new java.lang.String[0]);
                    this.Api26Impl = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_ENABLED, false, new java.lang.String[0]);
                    this.ActivityViewModelLazyKtviewModels4 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_BUFFERING_ENABLED, false, new java.lang.String[0]);
                    this.ActivityViewModelLazyKtviewModelsfactoryPromise1 = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_MAX_AGGREGATES, 2048, new java.lang.String[0]);
                    this.setPipParamsSourceRectHint = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_MAX_PENDING, 2048, new java.lang.String[0]);
                    this.onVerticalScrollEvent = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_REPORT_HOSTNAME, false, new java.lang.String[0]);
                    this.IResultReceiver2Default = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.ENABLE_TRACE_AGENT_V05, false, new java.lang.String[0]);
                    this.IResultReceiver2StubProxy = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_ANALYTICS_ENABLED, false, new java.lang.String[0]);
                    java.lang.String string8 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_CLIENT_IP_HEADER);
                    this.writeToParcel = string8 != null ? string8.toLowerCase(java.util.Locale.ROOT) : string8;
                    this.onReceiveResult = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_CLIENT_IP_RESOLVER_ENABLED, true, new java.lang.String[0]);
                    this.ResultReceiver1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_GIT_METADATA_ENABLED, true, new java.lang.String[0]);
                    this.ActivityViewModelLazyKtviewModels3 = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_SERVICE_RULES);
                    this.viewModelsdefault = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_OPERATION_RULES);
                    this.invoke = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES);
                    this.ActivityViewModelLazyKtviewModels2 = configProvider.getDouble("trace.sample.rate");
                    this.ActivityViewModelLazyKt = configProvider.getInteger("trace.rate.limit", 100, new java.lang.String[0]);
                    this.ITrustedWebActivityServiceStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES);
                    this.getSmallIconId = configProvider.getString(com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES_FILE);
                    this.onMinimized = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_ENABLED, instrumenterConfig.isProfilingEnabled(), new java.lang.String[0]);
                    this.ICustomTabsCallback = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_AGENTLESS, false, new java.lang.String[0]);
                    this.TransactionOutcomeDecoderExternalSyntheticLambda0 = isDatadogProfilerEnablementOverridden() && configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DATADOG_PROFILER_ENABLED, isDatadogProfilerSafeInCurrentEnvironment(), new java.lang.String[0]);
                    this.prefetch = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_URL);
                    this.mayLaunchUrl = configProvider.getMergedMap(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TAGS);
                    this.isEngagementSignalsApiAvailable = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_START_DELAY, 10, new java.lang.String[0]);
                    this.newAuthTabSession = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_START_FORCE_FIRST, false, new java.lang.String[0]);
                    this.prefetchWithMultipleUrls = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_PERIOD, 60, new java.lang.String[0]);
                    this.extraCommand = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TEMPLATE_OVERRIDE_FILE);
                    this.newSessionWithExtras = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_TIMEOUT, 30, new java.lang.String[0]);
                    this.newSession = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_COMPRESSION, "on", new java.lang.String[0]);
                    this.ICustomTabsCallbackDefault = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_HOST);
                    this.ICustomTabsCallbackStub = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT, com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT_DEFAULT, new java.lang.String[0]);
                    this.onUnminimized = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_USERNAME);
                    this.ICustomTabsService = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PASSWORD);
                    this.onRelationshipValidationResult = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_SAMPLE_LIMIT, 10000, new java.lang.String[0]);
                    this.extraCallbackWithResult = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DIRECT_ALLOCATION_SAMPLE_LIMIT, 2000, new java.lang.String[0]);
                    this.onActivityResized = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_HISTOGRAM_TOP_ITEMS, 50, new java.lang.String[0]);
                    this.onMessageChannelReady = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_HISTOGRAM_MAX_COLLECTION_SIZE, 10000, new java.lang.String[0]);
                    this.onPostMessage = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCLUDE_AGENT_THREADS, true, new java.lang.String[0]);
                    this.ICustomTabsCallbackStubProxy = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_RECORD_MESSAGE, true, new java.lang.String[0]);
                    this.receiveFile = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_SUMMARY_ON_413, false, new java.lang.String[0]);
                    this.unwrapAs = configProvider.getBoolean(com.datadog.trace.api.config.CrashTrackingConfig.CRASH_TRACKING_AGENTLESS, false, new java.lang.String[0]);
                    this.isOutputSupportedForhNQ4ISI = configProvider.getMergedMap(com.datadog.trace.api.config.CrashTrackingConfig.CRASH_TRACKING_TAGS);
                    f = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_HEARTBEAT_INTERVAL, 60.0f);
                    if (f >= 0.1d) {
                    }
                    getHighSpeedVideoFpsRanges.warn("Invalid Telemetry heartbeat interval: {}. The value must be in range 0.1-3600", java.lang.Float.valueOf(f));
                    f = 60.0f;
                    this.IResultReceiverDefault = f;
                    this.IResultReceiver = configProvider.getLong(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_EXTENDED_HEARTBEAT_INTERVAL, 86400L, new java.lang.String[0]);
                    f2 = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_METRICS_INTERVAL, 10.0f);
                    if (f2 >= 0.1d) {
                    }
                    getHighSpeedVideoFpsRanges.warn("Invalid Telemetry metrics interval: {}. The value must be in range 0.1-3600", java.lang.Float.valueOf(f2));
                    f2 = 10.0f;
                    this.send = f2;
                    this.IconCompatParcelizer = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_METRICS_ENABLED, true, new java.lang.String[0]);
                    this.TransactionOutcomeDecoderExternalSyntheticLambda1 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_DEPENDENCY_COLLECTION_ENABLED, true, new java.lang.String[0]);
                    this.TransactionOutcomeDecoder = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_LOG_COLLECTION_ENABLED, false, new java.lang.String[0]);
                    this.getOutputMinFrameDurationlomOqCM = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.CLIENT_IP_ENABLED, false, new java.lang.String[0]);
                    this.requestPostMessageChannel = configProvider.getBoolean(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_ENABLED, true, new java.lang.String[0]);
                    this.validateRelationship = configProvider.getBoolean(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_INTEGRITY_CHECK_ENABLED, false, new java.lang.String[0]);
                    this.ICustomTabsServiceStub = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_URL);
                    this.ICustomTabsServiceStubProxy = configProvider.getFloat(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_POLL_INTERVAL_SECONDS, 5.0f);
                    this.warmup = configProvider.getInteger(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_MAX_PAYLOAD_SIZE, 5120, new java.lang.String[0]) * 1024;
                    this.ICustomTabsService_Parcel = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_TARGETS_KEY_ID, "5c4ece41241a1bb513f6e3e5df74ab7d5183dfffbd71bfd43127920d880569fd", new java.lang.String[0]);
                    this.ICustomTabsServiceDefault = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_TARGETS_KEY, "e3f1f98c9da02a93bb547f448b472d727e14b22455235796fe49863856252508", new java.lang.String[0]);
                    this.getOutputStallDuration = isPropagationEnabled(true, "aws", "aws-sdk");
                    this.INotificationSideChannelDefault = isPropagationEnabled(true, "sqs");
                    this.IAuthTabCallback = isPropagationEnabled(true, "kafka", "kafka.client");
                    this.TransactionOutcomeDecoderExternalSyntheticLambda7 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.KAFKA_CLIENT_PROPAGATION_DISABLED_TOPICS));
                    this.TransactionOutcomeDecoderExternalSyntheticLambda4 = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.KAFKA_CLIENT_BASE64_DECODING_ENABLED, false, new java.lang.String[0]);
                    this.TransactionOutcomeDecoderExternalSyntheticLambda5 = isPropagationEnabled(true, "jms");
                    this.TransactionOutcomeDecoderExternalSyntheticLambda6 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_PROPAGATION_DISABLED_TOPICS));
                    this.TransactionOutcomeDecoderExternalSyntheticLambda3 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_PROPAGATION_DISABLED_QUEUES));
                    this.TransactionOutcomeDecoderExternalSyntheticLambda2 = configProvider.getInteger(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_UNACKNOWLEDGED_MAX_AGE, 3600, new java.lang.String[0]);
                    this.updateVisuals = isPropagationEnabled(true, "rabbit", "rabbitmq");
                    this.requestPostMessageChannelWithExtras = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_PROPAGATION_DISABLED_QUEUES));
                    this.setEngagementSignalsCallback = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_PROPAGATION_DISABLED_EXCHANGES));
                    this.postMessage = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_INCLUDE_ROUTINGKEY_IN_RESOURCE, true, new java.lang.String[0]);
                    this.onWarmupCompleted = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.MESSAGE_BROKER_SPLIT_BY_DESTINATION, false, new java.lang.String[0]);
                    this.c = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_IGNORED_INBOUND_METHODS));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_IGNORED_OUTBOUND_METHODS));
                    if (com.datadog.trace.api.InstrumenterConfig.get().isIntegrationEnabled(java.util.Collections.singleton("google-pubsub"), true)) {
                    }
                    this.startTransaction = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(arrayList);
                    this.resetTransaction = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_SERVER_TRIM_PACKAGE_RESOURCE, false, new java.lang.String[0]);
                    this.exchange = configProvider.getIntegerRange(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_SERVER_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoFpsRanges);
                    this.init = configProvider.getIntegerRange(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_CLIENT_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighResolutionOutputSizeshNQ4ISI);
                    this.kernelID = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HYSTRIX_TAGS_ENABLED, false, new java.lang.String[0]);
                    this.version = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HYSTRIX_MEASURED_ENABLED, false, new java.lang.String[0]);
                    this.encode = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.IGNITE_CACHE_INCLUDE_KEYS, false, new java.lang.String[0]);
                    this.onExtraCallbackWithResult = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.OBFUSCATION_QUERY_STRING_REGEXP, null, "obfuscation.query.string.regexp");
                    this.onTransact = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.PLAY_REPORT_HTTP_STATUS, false, new java.lang.String[0]);
                    this.getActiveNotifications = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_PRINCIPAL_ENABLED, false, new java.lang.String[0]);
                    this.getFrameTimeMillis = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.TRACE_X_DATADOG_TAGS_MAX_LENGTH, 512, new java.lang.String[0]);
                    this.getSmallIconBitmap = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_ASYNC_TIMEOUT_ERROR, true, new java.lang.String[0]);
                    boolean z6 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACE_DEBUG, false, new java.lang.String[0]);
                    this.accessartificialFrame = z6;
                    this.ActivityViewModelLazyKtviewModelsfactoryPromise2 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACE_TRIAGE, z6, new java.lang.String[0]);
                    this.INotificationSideChannel = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.STARTUP_LOGS_ENABLED, true, new java.lang.String[0]);
                    this.ArtificialStackFrames = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_ENABLED, false, new java.lang.String[0]);
                    this.getValidOutputFormatsForInputhNQ4ISI = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_BUCKET_DURATION_SECONDS, 10.0f);
                    this.getOutputSizeshNQ4ISI = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.AZURE_APP_SERVICES, false, new java.lang.String[0]);
                    this.IResultReceiverStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_PATH);
                    string = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_ARGS);
                    if (string == null) {
                    }
                    this._BOUNDARY = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_PATH);
                    string2 = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_ARGS);
                    if (string2 == null) {
                    }
                    z2 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_LONG_RUNNING_ENABLED, false, new java.lang.String[0]);
                    long j2 = 300;
                    j = configProvider.getLong(com.datadog.trace.api.config.TracerConfig.TRACE_LONG_RUNNING_FLUSH_INTERVAL, 300L, new java.lang.String[0]);
                    if (z2) {
                    }
                    j2 = j;
                    this.TransactionOutcomeDecodera = z2;
                    this.onExtraCallback = j2;
                    this.notifyNotificationWithChannel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SPARK_TASK_HISTOGRAM_ENABLED, true, new java.lang.String[0]);
                    this.apply = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.JAX_RS_EXCEPTION_AS_ERROR_ENABLED, true, new java.lang.String[0]);
                    this.describeContents = configProvider.getFloat(com.datadog.trace.api.config.TracerConfig.TRACE_FLUSH_INTERVAL, 1.0f);
                    this.write = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_DEBUG_REQUESTS_ENABLED, false, new java.lang.String[0]);
                    this.IResultReceiverStub = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TIMELINE_EVENTS_ENABLED, false, new java.lang.String[0]);
                    getHighSpeedVideoFpsRanges.debug("New instance: {}", this);
                }
            } catch (java.net.URISyntaxException e2) {
                e = e2;
                str = null;
            }
            if (str == null) {
                str = configProvider.getString(com.datadog.trace.api.config.TracerConfig.AGENT_HOST);
                z = true;
            } else {
                z = false;
            }
            if (port < 0) {
                port = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_PORT, -1, com.datadog.trace.api.config.TracerConfig.AGENT_PORT_LEGACY);
                z = true;
            }
            if (str == null) {
                this.getInputSizeshNQ4ISI = com.datadog.trace.api.ConfigDefaults.DEFAULT_AGENT_HOST;
            } else {
                this.getInputSizeshNQ4ISI = str;
            }
            if (port < 0) {
                this.getInputFormats = com.datadog.trace.api.ConfigDefaults.DEFAULT_TRACE_AGENT_PORT;
            } else {
                this.getInputFormats = port;
            }
            if (z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("http://");
                sb.append(this.getInputSizeshNQ4ISI);
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                sb.append(this.getInputFormats);
                this.getOutputFormats = sb.toString();
            } else {
                this.getOutputFormats = string5;
            }
            java.lang.String string62 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.AGENT_NAMED_PIPE);
            this.getOutputMinFrameDuration = string62;
            this.getHighSpeedVideoFpsRangesFor = str != null && port < 0 && string62 == null;
            this.getHighSpeedVideoSizesFor = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.AGENT_TIMEOUT, 10, new java.lang.String[0]);
            this.onNavigationEvent = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getSpacedList(com.datadog.trace.api.config.TracerConfig.PROXY_NO_PROXY));
            this.onActivityLayout = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PRIORITY_SAMPLING, true, new java.lang.String[0]);
            this.IAuthTabCallbackStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.PRIORITY_SAMPLING_FORCE, com.datadog.trace.api.ConfigDefaults.getInputFormats, new java.lang.String[0]);
            this.ResultReceiverMyResultReceiver = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_RESOLVER_ENABLED, true, new java.lang.String[0]);
            this.ITrustedWebActivityCallback = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.SERVICE_MAPPING);
            java.util.HashMap hashMap3 = new java.util.HashMap(configProvider.getMergedMap(com.datadog.trace.api.config.GeneralConfig.GLOBAL_TAGS));
            hashMap3.putAll(configProvider.getMergedMap("tags"));
            java.lang.String[] strArr2 = {"env", "version"};
            java.util.HashMap hashMap22 = new java.util.HashMap(hashMap3);
            for (i = 0; i < 2; i++) {
                java.lang.String str2 = strArr2[i];
                java.lang.String string9 = this.isOutputSupportedFor.getString(str2);
                if (string9 != null) {
                    hashMap22.put(str2, string9);
                }
            }
            this.RemoteActionCompatParcelizer = java.util.Collections.unmodifiableMap(hashMap22);
            this.ITrustedWebActivityServiceDefault = configProvider.getMergedMap("trace.span.tags");
            this.extraCallback = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.PRIMARY_TAG);
            if (isEnabled(false, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, ".legacy.parsing.enabled")) {
                this.IEngagementSignalsCallback = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.HEADER_TAGS);
                this.IEngagementSignalsCallbackDefault = java.util.Collections.emptyMap();
                if (configProvider.isSet(com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS)) {
                    Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, ".legacy.parsing.enabled");
                }
                if (configProvider.isSet(com.datadog.trace.api.config.TracerConfig.RESPONSE_HEADER_TAGS)) {
                    Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.RESPONSE_HEADER_TAGS, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, ".legacy.parsing.enabled");
                }
            } else {
                this.IEngagementSignalsCallback = configProvider.getMergedMapWithOptionalMappings("http.request.headers.", true, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS);
                this.IEngagementSignalsCallbackDefault = configProvider.getMergedMapWithOptionalMappings("http.response.headers.", true, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, com.datadog.trace.api.config.TracerConfig.RESPONSE_HEADER_TAGS);
            }
            this.onGreatestScrollPercentageIncreased = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS_COMMA_ALLOWED, true, new java.lang.String[0]);
            this.getOutputSizes = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.BAGGAGE_MAPPING);
            java.lang.String string72 = this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_SPAN_ATTRIBUTE_SCHEMA, "v0", new java.lang.String[0]);
            java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("^v?(0|[1-9]\\d*)$").matcher(string72);
            parseInt = matcher2.matches() ? java.lang.Integer.parseInt(matcher2.group(1)) : -1;
            if (parseInt >= 0 || parseInt > 1) {
                getHighSpeedVideoFpsRanges.warn("Invalid attribute schema version {} invalid or out of range [v{}, v{}]. Defaulting to v{}", string72, 0, 1, 0);
                parseInt = 0;
            }
            this.ITrustedWebActivityServiceStub = parseInt;
            this.IAuthTabCallbackStub = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_DEFAULTS_ENABLED, false, new java.lang.String[0]);
            this.asInterface = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_COMPONENT_OVERRIDES);
            this.onSessionEnded = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_REMOVE_INTEGRATION_SERVICE_NAMES_ENABLED, false, new java.lang.String[0]);
            this.IAuthTabCallbackDefault = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_MAPPING);
            this.rsaCipher = configProvider.getOrderedMap(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_SERVER_PATH_RESOURCE_NAME_MAPPING);
            this.requestGoOnline = configProvider.getOrderedMap(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_CLIENT_PATH_RESOURCE_NAME_MAPPING);
            this.sha1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_RESOURCE_REMOVE_TRAILING_SLASH, false, new java.lang.String[0]);
            this.freeTransaction = configProvider.getIntegerRange(com.datadog.trace.api.config.TracerConfig.HTTP_SERVER_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizes);
            this.l = configProvider.getIntegerRange(com.datadog.trace.api.config.TracerConfig.HTTP_CLIENT_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoFpsRangesFor);
            this.newContext = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_TAG_QUERY_STRING, true, new java.lang.String[0]);
            this.AMEXKernelProvider = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_RAW_QUERY_STRING, true, new java.lang.String[0]);
            this.start = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_RAW_RESOURCE, false, new java.lang.String[0]);
            this.free = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_DECODED_RESOURCE_PRESERVE_SPACES, true, new java.lang.String[0]);
            this.setup = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_ROUTE_BASED_NAMING, true, new java.lang.String[0]);
            this.AMEXKernelJNI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_TAG_QUERY_STRING, false, new java.lang.String[0]);
            this.requestPINEntry = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_TAG_HEADERS, true, new java.lang.String[0]);
            this.updateUI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_HOST_SPLIT_BY_DOMAIN, false, new java.lang.String[0]);
            this.coroutineCreation = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_INSTANCE, false, new java.lang.String[0]);
            this.CoroutineDebuggingKt = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_INSTANCE_TYPE_SUFFIX, false, new java.lang.String[0]);
            this.coroutineBoundary = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_HOST, false, new java.lang.String[0]);
            this.getHighResolutionOutputSizeshNQ4ISI = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_DBM_PROPAGATION_MODE_MODE, "disabled", new java.lang.String[0]);
            this.notify = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TracerConfig.SPLIT_BY_TAGS));
            this.cancel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SPRING_DATA_REPOSITORY_INTERFACE_RESOURCE_NAME, true, new java.lang.String[0]);
            this.IPostMessageServiceStub = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.SCOPE_DEPTH_LIMIT, 100, new java.lang.String[0]);
            this.IPostMessageServiceStubProxy = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SCOPE_STRICT_MODE, false, new java.lang.String[0]);
            this.ITrustedWebActivityCallbackDefault = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SCOPE_INHERIT_ASYNC_PROPAGATION, true, new java.lang.String[0]);
            this.ITrustedWebActivityCallbackStubProxy = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.SCOPE_ITERATION_KEEP_ALIVE, 30, new java.lang.String[0]);
            this.getInterfaceVersion = !configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PARTIAL_FLUSH_ENABLED, true, new java.lang.String[0]) ? 0 : configProvider.getInteger("trace.partial.flush.min.spans", 1000, new java.lang.String[0]);
            this.ActivityViewModelLazyKtviewModels1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_STRICT_WRITES_ENABLED, false, new java.lang.String[0]);
            this.values = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PROPAGATION_EXTRACT_LOG_HEADER_NAMES_ENABLED, false, new java.lang.String[0]);
            this.ActivityFlags = isEnabled(true, com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, ".b3.padding.enabled");
            java.util.Set<com.datadog.trace.api.TracePropagationStyle> Camera2StreamConfigurationMap42 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
                @Override // com.datadog.android.trace.internal.compat.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
                }
            });
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
                @Override // com.datadog.android.trace.internal.compat.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
                }
            });
            Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
                @Override // com.datadog.android.trace.internal.compat.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
                }
            });
            if (Camera2StreamConfigurationMap2.isEmpty()) {
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap42;
            } else if (!Camera2StreamConfigurationMap42.isEmpty()) {
                getHighSpeedVideoSizes(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, Camera2StreamConfigurationMap2);
            }
            if (!Camera2StreamConfigurationMap3.isEmpty()) {
                if (!Camera2StreamConfigurationMap42.isEmpty()) {
                    getHighSpeedVideoSizes(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, Camera2StreamConfigurationMap3);
                }
                Camera2StreamConfigurationMap42 = Camera2StreamConfigurationMap3;
            }
            this.viewModels = Camera2StreamConfigurationMap2.isEmpty() ? com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizesFor : Camera2StreamConfigurationMap2;
            this.ResultReceiverMyRunnable = Camera2StreamConfigurationMap42.isEmpty() ? com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizesFor : Camera2StreamConfigurationMap42;
            this.ResultReceiver = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_EXTRACT_FIRST, false, new java.lang.String[0]);
            this.getOutputStallDurationlomOqCM = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.CLOCK_SYNC_PERIOD, 30, new java.lang.String[0]);
            this.valueOf = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.LOGS_INJECTION_ENABLED, true, new java.lang.String[0]);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_NAMED_PIPE);
            this._CREATION = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_START_DELAY, 15, new java.lang.String[0]);
            this.INotificationSideChannelStub = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_QUEUE_SIZE);
            this.read = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_SOCKET_BUFFER);
            this.INotificationSideChannelStubProxy = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_SOCKET_TIMEOUT);
            boolean z52 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.RUNTIME_METRICS_ENABLED, true, new java.lang.String[0]);
            this.IPostMessageService = z52;
            this.AMEXKernela = !z52 && configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_ENABLED, true, new java.lang.String[0]);
            this.release = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_STATSD_HOST);
            this.AMEXKernelCallback = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_STATSD_PORT);
            this.asBinder = !z52 && configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.PERF_METRICS_ENABLED, false, new java.lang.String[0]);
            this.Api26Impl = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_ENABLED, false, new java.lang.String[0]);
            this.ActivityViewModelLazyKtviewModels4 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_BUFFERING_ENABLED, false, new java.lang.String[0]);
            this.ActivityViewModelLazyKtviewModelsfactoryPromise1 = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_MAX_AGGREGATES, 2048, new java.lang.String[0]);
            this.setPipParamsSourceRectHint = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_MAX_PENDING, 2048, new java.lang.String[0]);
            this.onVerticalScrollEvent = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_REPORT_HOSTNAME, false, new java.lang.String[0]);
            this.IResultReceiver2Default = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.ENABLE_TRACE_AGENT_V05, false, new java.lang.String[0]);
            this.IResultReceiver2StubProxy = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_ANALYTICS_ENABLED, false, new java.lang.String[0]);
            java.lang.String string82 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_CLIENT_IP_HEADER);
            this.writeToParcel = string82 != null ? string82.toLowerCase(java.util.Locale.ROOT) : string82;
            this.onReceiveResult = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_CLIENT_IP_RESOLVER_ENABLED, true, new java.lang.String[0]);
            this.ResultReceiver1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_GIT_METADATA_ENABLED, true, new java.lang.String[0]);
            this.ActivityViewModelLazyKtviewModels3 = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_SERVICE_RULES);
            this.viewModelsdefault = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_OPERATION_RULES);
            this.invoke = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES);
            this.ActivityViewModelLazyKtviewModels2 = configProvider.getDouble("trace.sample.rate");
            this.ActivityViewModelLazyKt = configProvider.getInteger("trace.rate.limit", 100, new java.lang.String[0]);
            this.ITrustedWebActivityServiceStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES);
            this.getSmallIconId = configProvider.getString(com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES_FILE);
            this.onMinimized = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_ENABLED, instrumenterConfig.isProfilingEnabled(), new java.lang.String[0]);
            this.ICustomTabsCallback = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_AGENTLESS, false, new java.lang.String[0]);
            this.TransactionOutcomeDecoderExternalSyntheticLambda0 = isDatadogProfilerEnablementOverridden() && configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DATADOG_PROFILER_ENABLED, isDatadogProfilerSafeInCurrentEnvironment(), new java.lang.String[0]);
            this.prefetch = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_URL);
            this.mayLaunchUrl = configProvider.getMergedMap(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TAGS);
            this.isEngagementSignalsApiAvailable = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_START_DELAY, 10, new java.lang.String[0]);
            this.newAuthTabSession = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_START_FORCE_FIRST, false, new java.lang.String[0]);
            this.prefetchWithMultipleUrls = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_PERIOD, 60, new java.lang.String[0]);
            this.extraCommand = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TEMPLATE_OVERRIDE_FILE);
            this.newSessionWithExtras = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_TIMEOUT, 30, new java.lang.String[0]);
            this.newSession = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_COMPRESSION, "on", new java.lang.String[0]);
            this.ICustomTabsCallbackDefault = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_HOST);
            this.ICustomTabsCallbackStub = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT, com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT_DEFAULT, new java.lang.String[0]);
            this.onUnminimized = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_USERNAME);
            this.ICustomTabsService = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PASSWORD);
            this.onRelationshipValidationResult = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_SAMPLE_LIMIT, 10000, new java.lang.String[0]);
            this.extraCallbackWithResult = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DIRECT_ALLOCATION_SAMPLE_LIMIT, 2000, new java.lang.String[0]);
            this.onActivityResized = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_HISTOGRAM_TOP_ITEMS, 50, new java.lang.String[0]);
            this.onMessageChannelReady = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_HISTOGRAM_MAX_COLLECTION_SIZE, 10000, new java.lang.String[0]);
            this.onPostMessage = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCLUDE_AGENT_THREADS, true, new java.lang.String[0]);
            this.ICustomTabsCallbackStubProxy = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_RECORD_MESSAGE, true, new java.lang.String[0]);
            this.receiveFile = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_SUMMARY_ON_413, false, new java.lang.String[0]);
            this.unwrapAs = configProvider.getBoolean(com.datadog.trace.api.config.CrashTrackingConfig.CRASH_TRACKING_AGENTLESS, false, new java.lang.String[0]);
            this.isOutputSupportedForhNQ4ISI = configProvider.getMergedMap(com.datadog.trace.api.config.CrashTrackingConfig.CRASH_TRACKING_TAGS);
            f = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_HEARTBEAT_INTERVAL, 60.0f);
            if (f >= 0.1d || f > 3600.0f) {
                getHighSpeedVideoFpsRanges.warn("Invalid Telemetry heartbeat interval: {}. The value must be in range 0.1-3600", java.lang.Float.valueOf(f));
                f = 60.0f;
            }
            this.IResultReceiverDefault = f;
            this.IResultReceiver = configProvider.getLong(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_EXTENDED_HEARTBEAT_INTERVAL, 86400L, new java.lang.String[0]);
            f2 = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_METRICS_INTERVAL, 10.0f);
            if (f2 >= 0.1d || f2 > 3600.0f) {
                getHighSpeedVideoFpsRanges.warn("Invalid Telemetry metrics interval: {}. The value must be in range 0.1-3600", java.lang.Float.valueOf(f2));
                f2 = 10.0f;
            }
            this.send = f2;
            this.IconCompatParcelizer = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_METRICS_ENABLED, true, new java.lang.String[0]);
            this.TransactionOutcomeDecoderExternalSyntheticLambda1 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_DEPENDENCY_COLLECTION_ENABLED, true, new java.lang.String[0]);
            this.TransactionOutcomeDecoder = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_LOG_COLLECTION_ENABLED, false, new java.lang.String[0]);
            this.getOutputMinFrameDurationlomOqCM = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.CLIENT_IP_ENABLED, false, new java.lang.String[0]);
            this.requestPostMessageChannel = configProvider.getBoolean(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_ENABLED, true, new java.lang.String[0]);
            this.validateRelationship = configProvider.getBoolean(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_INTEGRITY_CHECK_ENABLED, false, new java.lang.String[0]);
            this.ICustomTabsServiceStub = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_URL);
            this.ICustomTabsServiceStubProxy = configProvider.getFloat(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_POLL_INTERVAL_SECONDS, 5.0f);
            this.warmup = configProvider.getInteger(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_MAX_PAYLOAD_SIZE, 5120, new java.lang.String[0]) * 1024;
            this.ICustomTabsService_Parcel = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_TARGETS_KEY_ID, "5c4ece41241a1bb513f6e3e5df74ab7d5183dfffbd71bfd43127920d880569fd", new java.lang.String[0]);
            this.ICustomTabsServiceDefault = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_TARGETS_KEY, "e3f1f98c9da02a93bb547f448b472d727e14b22455235796fe49863856252508", new java.lang.String[0]);
            this.getOutputStallDuration = isPropagationEnabled(true, "aws", "aws-sdk");
            this.INotificationSideChannelDefault = isPropagationEnabled(true, "sqs");
            this.IAuthTabCallback = isPropagationEnabled(true, "kafka", "kafka.client");
            this.TransactionOutcomeDecoderExternalSyntheticLambda7 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.KAFKA_CLIENT_PROPAGATION_DISABLED_TOPICS));
            this.TransactionOutcomeDecoderExternalSyntheticLambda4 = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.KAFKA_CLIENT_BASE64_DECODING_ENABLED, false, new java.lang.String[0]);
            this.TransactionOutcomeDecoderExternalSyntheticLambda5 = isPropagationEnabled(true, "jms");
            this.TransactionOutcomeDecoderExternalSyntheticLambda6 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_PROPAGATION_DISABLED_TOPICS));
            this.TransactionOutcomeDecoderExternalSyntheticLambda3 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_PROPAGATION_DISABLED_QUEUES));
            this.TransactionOutcomeDecoderExternalSyntheticLambda2 = configProvider.getInteger(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_UNACKNOWLEDGED_MAX_AGE, 3600, new java.lang.String[0]);
            this.updateVisuals = isPropagationEnabled(true, "rabbit", "rabbitmq");
            this.requestPostMessageChannelWithExtras = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_PROPAGATION_DISABLED_QUEUES));
            this.setEngagementSignalsCallback = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_PROPAGATION_DISABLED_EXCHANGES));
            this.postMessage = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_INCLUDE_ROUTINGKEY_IN_RESOURCE, true, new java.lang.String[0]);
            this.onWarmupCompleted = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.MESSAGE_BROKER_SPLIT_BY_DESTINATION, false, new java.lang.String[0]);
            this.c = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_IGNORED_INBOUND_METHODS));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_IGNORED_OUTBOUND_METHODS));
            if (com.datadog.trace.api.InstrumenterConfig.get().isIntegrationEnabled(java.util.Collections.singleton("google-pubsub"), true)) {
                arrayList2.addAll(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GOOGLE_PUBSUB_IGNORED_GRPC_METHODS, java.util.Arrays.asList("google.pubsub.v1.Subscriber/ModifyAckDeadline", "google.pubsub.v1.Subscriber/Acknowledge", "google.pubsub.v1.Subscriber/Pull", "google.pubsub.v1.Subscriber/StreamingPull", "google.pubsub.v1.Publisher/Publish")));
            }
            this.startTransaction = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(arrayList2);
            this.resetTransaction = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_SERVER_TRIM_PACKAGE_RESOURCE, false, new java.lang.String[0]);
            this.exchange = configProvider.getIntegerRange(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_SERVER_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoFpsRanges);
            this.init = configProvider.getIntegerRange(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_CLIENT_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighResolutionOutputSizeshNQ4ISI);
            this.kernelID = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HYSTRIX_TAGS_ENABLED, false, new java.lang.String[0]);
            this.version = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HYSTRIX_MEASURED_ENABLED, false, new java.lang.String[0]);
            this.encode = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.IGNITE_CACHE_INCLUDE_KEYS, false, new java.lang.String[0]);
            this.onExtraCallbackWithResult = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.OBFUSCATION_QUERY_STRING_REGEXP, null, "obfuscation.query.string.regexp");
            this.onTransact = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.PLAY_REPORT_HTTP_STATUS, false, new java.lang.String[0]);
            this.getActiveNotifications = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_PRINCIPAL_ENABLED, false, new java.lang.String[0]);
            this.getFrameTimeMillis = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.TRACE_X_DATADOG_TAGS_MAX_LENGTH, 512, new java.lang.String[0]);
            this.getSmallIconBitmap = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_ASYNC_TIMEOUT_ERROR, true, new java.lang.String[0]);
            boolean z62 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACE_DEBUG, false, new java.lang.String[0]);
            this.accessartificialFrame = z62;
            this.ActivityViewModelLazyKtviewModelsfactoryPromise2 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACE_TRIAGE, z62, new java.lang.String[0]);
            this.INotificationSideChannel = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.STARTUP_LOGS_ENABLED, true, new java.lang.String[0]);
            this.ArtificialStackFrames = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_ENABLED, false, new java.lang.String[0]);
            this.getValidOutputFormatsForInputhNQ4ISI = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_BUCKET_DURATION_SECONDS, 10.0f);
            this.getOutputSizeshNQ4ISI = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.AZURE_APP_SERVICES, false, new java.lang.String[0]);
            this.IResultReceiverStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_PATH);
            string = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_ARGS);
            if (string == null) {
                this.IResultReceiver2 = java.util.Collections.emptyList();
            } else {
                this.IResultReceiver2 = java.util.Collections.unmodifiableList(new java.util.ArrayList(getHighSpeedVideoFpsRanges(string)));
            }
            this._BOUNDARY = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_PATH);
            string2 = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_ARGS);
            if (string2 == null) {
                this.f2924a = java.util.Collections.emptyList();
            } else {
                this.f2924a = java.util.Collections.unmodifiableList(new java.util.ArrayList(getHighSpeedVideoFpsRanges(string2)));
            }
            z2 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_LONG_RUNNING_ENABLED, false, new java.lang.String[0]);
            long j22 = 300;
            j = configProvider.getLong(com.datadog.trace.api.config.TracerConfig.TRACE_LONG_RUNNING_FLUSH_INTERVAL, 300L, new java.lang.String[0]);
            if (z2 || (j >= 20 && j <= 450)) {
                j22 = j;
            } else {
                getHighSpeedVideoFpsRanges.warn("Provided long running trace flush interval of {} seconds. It should be between 20 seconds and 7.5 minutes.Setting the flush interval to the default value of {} seconds .", java.lang.Long.valueOf(j), 300L);
            }
            this.TransactionOutcomeDecodera = z2;
            this.onExtraCallback = j22;
            this.notifyNotificationWithChannel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SPARK_TASK_HISTOGRAM_ENABLED, true, new java.lang.String[0]);
            this.apply = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.JAX_RS_EXCEPTION_AS_ERROR_ENABLED, true, new java.lang.String[0]);
            this.describeContents = configProvider.getFloat(com.datadog.trace.api.config.TracerConfig.TRACE_FLUSH_INTERVAL, 1.0f);
            this.write = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_DEBUG_REQUESTS_ENABLED, false, new java.lang.String[0]);
            this.IResultReceiverStub = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TIMELINE_EVENTS_ENABLED, false, new java.lang.String[0]);
            getHighSpeedVideoFpsRanges.debug("New instance: {}", this);
        }
        str = null;
        port = -1;
        if (str == null) {
        }
        if (port < 0) {
        }
        if (str == null) {
        }
        if (port < 0) {
        }
        if (z) {
        }
        java.lang.String string622 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.AGENT_NAMED_PIPE);
        this.getOutputMinFrameDuration = string622;
        this.getHighSpeedVideoFpsRangesFor = str != null && port < 0 && string622 == null;
        this.getHighSpeedVideoSizesFor = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.AGENT_TIMEOUT, 10, new java.lang.String[0]);
        this.onNavigationEvent = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getSpacedList(com.datadog.trace.api.config.TracerConfig.PROXY_NO_PROXY));
        this.onActivityLayout = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PRIORITY_SAMPLING, true, new java.lang.String[0]);
        this.IAuthTabCallbackStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.PRIORITY_SAMPLING_FORCE, com.datadog.trace.api.ConfigDefaults.getInputFormats, new java.lang.String[0]);
        this.ResultReceiverMyResultReceiver = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_RESOLVER_ENABLED, true, new java.lang.String[0]);
        this.ITrustedWebActivityCallback = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.SERVICE_MAPPING);
        java.util.HashMap hashMap32 = new java.util.HashMap(configProvider.getMergedMap(com.datadog.trace.api.config.GeneralConfig.GLOBAL_TAGS));
        hashMap32.putAll(configProvider.getMergedMap("tags"));
        java.lang.String[] strArr22 = {"env", "version"};
        java.util.HashMap hashMap222 = new java.util.HashMap(hashMap32);
        while (i < 2) {
        }
        this.RemoteActionCompatParcelizer = java.util.Collections.unmodifiableMap(hashMap222);
        this.ITrustedWebActivityServiceDefault = configProvider.getMergedMap("trace.span.tags");
        this.extraCallback = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.PRIMARY_TAG);
        if (isEnabled(false, com.datadog.trace.api.config.TracerConfig.HEADER_TAGS, ".legacy.parsing.enabled")) {
        }
        this.onGreatestScrollPercentageIncreased = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS_COMMA_ALLOWED, true, new java.lang.String[0]);
        this.getOutputSizes = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.BAGGAGE_MAPPING);
        java.lang.String string722 = this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_SPAN_ATTRIBUTE_SCHEMA, "v0", new java.lang.String[0]);
        java.util.regex.Matcher matcher22 = java.util.regex.Pattern.compile("^v?(0|[1-9]\\d*)$").matcher(string722);
        if (matcher22.matches()) {
        }
        if (parseInt >= 0) {
        }
        getHighSpeedVideoFpsRanges.warn("Invalid attribute schema version {} invalid or out of range [v{}, v{}]. Defaulting to v{}", string722, 0, 1, 0);
        parseInt = 0;
        this.ITrustedWebActivityServiceStub = parseInt;
        this.IAuthTabCallbackStub = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_DEFAULTS_ENABLED, false, new java.lang.String[0]);
        this.asInterface = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_COMPONENT_OVERRIDES);
        this.onSessionEnded = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_REMOVE_INTEGRATION_SERVICE_NAMES_ENABLED, false, new java.lang.String[0]);
        this.IAuthTabCallbackDefault = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_PEER_SERVICE_MAPPING);
        this.rsaCipher = configProvider.getOrderedMap(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_SERVER_PATH_RESOURCE_NAME_MAPPING);
        this.requestGoOnline = configProvider.getOrderedMap(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_CLIENT_PATH_RESOURCE_NAME_MAPPING);
        this.sha1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_HTTP_RESOURCE_REMOVE_TRAILING_SLASH, false, new java.lang.String[0]);
        this.freeTransaction = configProvider.getIntegerRange(com.datadog.trace.api.config.TracerConfig.HTTP_SERVER_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizes);
        this.l = configProvider.getIntegerRange(com.datadog.trace.api.config.TracerConfig.HTTP_CLIENT_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoFpsRangesFor);
        this.newContext = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_TAG_QUERY_STRING, true, new java.lang.String[0]);
        this.AMEXKernelProvider = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_RAW_QUERY_STRING, true, new java.lang.String[0]);
        this.start = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_RAW_RESOURCE, false, new java.lang.String[0]);
        this.free = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_DECODED_RESOURCE_PRESERVE_SPACES, true, new java.lang.String[0]);
        this.setup = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_SERVER_ROUTE_BASED_NAMING, true, new java.lang.String[0]);
        this.AMEXKernelJNI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_TAG_QUERY_STRING, false, new java.lang.String[0]);
        this.requestPINEntry = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_TAG_HEADERS, true, new java.lang.String[0]);
        this.updateUI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_CLIENT_HOST_SPLIT_BY_DOMAIN, false, new java.lang.String[0]);
        this.coroutineCreation = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_INSTANCE, false, new java.lang.String[0]);
        this.CoroutineDebuggingKt = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_INSTANCE_TYPE_SUFFIX, false, new java.lang.String[0]);
        this.coroutineBoundary = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_CLIENT_HOST_SPLIT_BY_HOST, false, new java.lang.String[0]);
        this.getHighResolutionOutputSizeshNQ4ISI = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.DB_DBM_PROPAGATION_MODE_MODE, "disabled", new java.lang.String[0]);
        this.notify = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TracerConfig.SPLIT_BY_TAGS));
        this.cancel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SPRING_DATA_REPOSITORY_INTERFACE_RESOURCE_NAME, true, new java.lang.String[0]);
        this.IPostMessageServiceStub = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.SCOPE_DEPTH_LIMIT, 100, new java.lang.String[0]);
        this.IPostMessageServiceStubProxy = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SCOPE_STRICT_MODE, false, new java.lang.String[0]);
        this.ITrustedWebActivityCallbackDefault = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.SCOPE_INHERIT_ASYNC_PROPAGATION, true, new java.lang.String[0]);
        this.ITrustedWebActivityCallbackStubProxy = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.SCOPE_ITERATION_KEEP_ALIVE, 30, new java.lang.String[0]);
        this.getInterfaceVersion = !configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PARTIAL_FLUSH_ENABLED, true, new java.lang.String[0]) ? 0 : configProvider.getInteger("trace.partial.flush.min.spans", 1000, new java.lang.String[0]);
        this.ActivityViewModelLazyKtviewModels1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_STRICT_WRITES_ENABLED, false, new java.lang.String[0]);
        this.values = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.PROPAGATION_EXTRACT_LOG_HEADER_NAMES_ENABLED, false, new java.lang.String[0]);
        this.ActivityFlags = isEnabled(true, com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, ".b3.padding.enabled");
        java.util.Set<com.datadog.trace.api.TracePropagationStyle> Camera2StreamConfigurationMap422 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
            @Override // com.datadog.android.trace.internal.compat.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
            }
        });
        Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_EXTRACT, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
            @Override // com.datadog.android.trace.internal.compat.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
            }
        });
        Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor.getString(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_STYLE_INJECT, "", new java.lang.String[0]), false), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Config$$ExternalSyntheticLambda0
            @Override // com.datadog.android.trace.internal.compat.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.datadog.trace.api.TracePropagationStyle.valueOfDisplayName((java.lang.String) obj);
            }
        });
        if (Camera2StreamConfigurationMap2.isEmpty()) {
        }
        if (!Camera2StreamConfigurationMap3.isEmpty()) {
        }
        this.viewModels = Camera2StreamConfigurationMap2.isEmpty() ? com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizesFor : Camera2StreamConfigurationMap2;
        this.ResultReceiverMyRunnable = Camera2StreamConfigurationMap422.isEmpty() ? com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoSizesFor : Camera2StreamConfigurationMap422;
        this.ResultReceiver = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_PROPAGATION_EXTRACT_FIRST, false, new java.lang.String[0]);
        this.getOutputStallDurationlomOqCM = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.CLOCK_SYNC_PERIOD, 30, new java.lang.String[0]);
        this.valueOf = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.LOGS_INJECTION_ENABLED, true, new java.lang.String[0]);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_NAMED_PIPE);
        this._CREATION = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_START_DELAY, 15, new java.lang.String[0]);
        this.INotificationSideChannelStub = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_QUEUE_SIZE);
        this.read = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_SOCKET_BUFFER);
        this.INotificationSideChannelStubProxy = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.STATSD_CLIENT_SOCKET_TIMEOUT);
        boolean z522 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.RUNTIME_METRICS_ENABLED, true, new java.lang.String[0]);
        this.IPostMessageService = z522;
        this.AMEXKernela = !z522 && configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_ENABLED, true, new java.lang.String[0]);
        this.release = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_STATSD_HOST);
        this.AMEXKernelCallback = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.HEALTH_METRICS_STATSD_PORT);
        this.asBinder = !z522 && configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.PERF_METRICS_ENABLED, false, new java.lang.String[0]);
        this.Api26Impl = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_ENABLED, false, new java.lang.String[0]);
        this.ActivityViewModelLazyKtviewModels4 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_BUFFERING_ENABLED, false, new java.lang.String[0]);
        this.ActivityViewModelLazyKtviewModelsfactoryPromise1 = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_MAX_AGGREGATES, 2048, new java.lang.String[0]);
        this.setPipParamsSourceRectHint = configProvider.getInteger(com.datadog.trace.api.config.GeneralConfig.TRACER_METRICS_MAX_PENDING, 2048, new java.lang.String[0]);
        this.onVerticalScrollEvent = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_REPORT_HOSTNAME, false, new java.lang.String[0]);
        this.IResultReceiver2Default = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.ENABLE_TRACE_AGENT_V05, false, new java.lang.String[0]);
        this.IResultReceiver2StubProxy = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_ANALYTICS_ENABLED, false, new java.lang.String[0]);
        java.lang.String string822 = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_CLIENT_IP_HEADER);
        this.writeToParcel = string822 != null ? string822.toLowerCase(java.util.Locale.ROOT) : string822;
        this.onReceiveResult = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_CLIENT_IP_RESOLVER_ENABLED, true, new java.lang.String[0]);
        this.ResultReceiver1 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_GIT_METADATA_ENABLED, true, new java.lang.String[0]);
        this.ActivityViewModelLazyKtviewModels3 = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_SERVICE_RULES);
        this.viewModelsdefault = configProvider.getMergedMap(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_OPERATION_RULES);
        this.invoke = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES);
        this.ActivityViewModelLazyKtviewModels2 = configProvider.getDouble("trace.sample.rate");
        this.ActivityViewModelLazyKt = configProvider.getInteger("trace.rate.limit", 100, new java.lang.String[0]);
        this.ITrustedWebActivityServiceStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES);
        this.getSmallIconId = configProvider.getString(com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES_FILE);
        this.onMinimized = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_ENABLED, instrumenterConfig.isProfilingEnabled(), new java.lang.String[0]);
        this.ICustomTabsCallback = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_AGENTLESS, false, new java.lang.String[0]);
        this.TransactionOutcomeDecoderExternalSyntheticLambda0 = isDatadogProfilerEnablementOverridden() && configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DATADOG_PROFILER_ENABLED, isDatadogProfilerSafeInCurrentEnvironment(), new java.lang.String[0]);
        this.prefetch = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_URL);
        this.mayLaunchUrl = configProvider.getMergedMap(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TAGS);
        this.isEngagementSignalsApiAvailable = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_START_DELAY, 10, new java.lang.String[0]);
        this.newAuthTabSession = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_START_FORCE_FIRST, false, new java.lang.String[0]);
        this.prefetchWithMultipleUrls = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_PERIOD, 60, new java.lang.String[0]);
        this.extraCommand = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TEMPLATE_OVERRIDE_FILE);
        this.newSessionWithExtras = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_TIMEOUT, 30, new java.lang.String[0]);
        this.newSession = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_COMPRESSION, "on", new java.lang.String[0]);
        this.ICustomTabsCallbackDefault = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_HOST);
        this.ICustomTabsCallbackStub = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT, com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT_DEFAULT, new java.lang.String[0]);
        this.onUnminimized = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_USERNAME);
        this.ICustomTabsService = configProvider.getString(com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PASSWORD);
        this.onRelationshipValidationResult = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_SAMPLE_LIMIT, 10000, new java.lang.String[0]);
        this.extraCallbackWithResult = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DIRECT_ALLOCATION_SAMPLE_LIMIT, 2000, new java.lang.String[0]);
        this.onActivityResized = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_HISTOGRAM_TOP_ITEMS, 50, new java.lang.String[0]);
        this.onMessageChannelReady = configProvider.getInteger(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_HISTOGRAM_MAX_COLLECTION_SIZE, 10000, new java.lang.String[0]);
        this.onPostMessage = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCLUDE_AGENT_THREADS, true, new java.lang.String[0]);
        this.ICustomTabsCallbackStubProxy = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_EXCEPTION_RECORD_MESSAGE, true, new java.lang.String[0]);
        this.receiveFile = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_UPLOAD_SUMMARY_ON_413, false, new java.lang.String[0]);
        this.unwrapAs = configProvider.getBoolean(com.datadog.trace.api.config.CrashTrackingConfig.CRASH_TRACKING_AGENTLESS, false, new java.lang.String[0]);
        this.isOutputSupportedForhNQ4ISI = configProvider.getMergedMap(com.datadog.trace.api.config.CrashTrackingConfig.CRASH_TRACKING_TAGS);
        f = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_HEARTBEAT_INTERVAL, 60.0f);
        if (f >= 0.1d) {
        }
        getHighSpeedVideoFpsRanges.warn("Invalid Telemetry heartbeat interval: {}. The value must be in range 0.1-3600", java.lang.Float.valueOf(f));
        f = 60.0f;
        this.IResultReceiverDefault = f;
        this.IResultReceiver = configProvider.getLong(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_EXTENDED_HEARTBEAT_INTERVAL, 86400L, new java.lang.String[0]);
        f2 = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_METRICS_INTERVAL, 10.0f);
        if (f2 >= 0.1d) {
        }
        getHighSpeedVideoFpsRanges.warn("Invalid Telemetry metrics interval: {}. The value must be in range 0.1-3600", java.lang.Float.valueOf(f2));
        f2 = 10.0f;
        this.send = f2;
        this.IconCompatParcelizer = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_METRICS_ENABLED, true, new java.lang.String[0]);
        this.TransactionOutcomeDecoderExternalSyntheticLambda1 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_DEPENDENCY_COLLECTION_ENABLED, true, new java.lang.String[0]);
        this.TransactionOutcomeDecoder = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_LOG_COLLECTION_ENABLED, false, new java.lang.String[0]);
        this.getOutputMinFrameDurationlomOqCM = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.CLIENT_IP_ENABLED, false, new java.lang.String[0]);
        this.requestPostMessageChannel = configProvider.getBoolean(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_ENABLED, true, new java.lang.String[0]);
        this.validateRelationship = configProvider.getBoolean(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_INTEGRITY_CHECK_ENABLED, false, new java.lang.String[0]);
        this.ICustomTabsServiceStub = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_URL);
        this.ICustomTabsServiceStubProxy = configProvider.getFloat(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_POLL_INTERVAL_SECONDS, 5.0f);
        this.warmup = configProvider.getInteger(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_MAX_PAYLOAD_SIZE, 5120, new java.lang.String[0]) * 1024;
        this.ICustomTabsService_Parcel = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_TARGETS_KEY_ID, "5c4ece41241a1bb513f6e3e5df74ab7d5183dfffbd71bfd43127920d880569fd", new java.lang.String[0]);
        this.ICustomTabsServiceDefault = configProvider.getString(com.datadog.trace.api.config.RemoteConfigConfig.REMOTE_CONFIG_TARGETS_KEY, "e3f1f98c9da02a93bb547f448b472d727e14b22455235796fe49863856252508", new java.lang.String[0]);
        this.getOutputStallDuration = isPropagationEnabled(true, "aws", "aws-sdk");
        this.INotificationSideChannelDefault = isPropagationEnabled(true, "sqs");
        this.IAuthTabCallback = isPropagationEnabled(true, "kafka", "kafka.client");
        this.TransactionOutcomeDecoderExternalSyntheticLambda7 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.KAFKA_CLIENT_PROPAGATION_DISABLED_TOPICS));
        this.TransactionOutcomeDecoderExternalSyntheticLambda4 = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.KAFKA_CLIENT_BASE64_DECODING_ENABLED, false, new java.lang.String[0]);
        this.TransactionOutcomeDecoderExternalSyntheticLambda5 = isPropagationEnabled(true, "jms");
        this.TransactionOutcomeDecoderExternalSyntheticLambda6 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_PROPAGATION_DISABLED_TOPICS));
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_PROPAGATION_DISABLED_QUEUES));
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = configProvider.getInteger(com.datadog.trace.api.config.TraceInstrumentationConfig.JMS_UNACKNOWLEDGED_MAX_AGE, 3600, new java.lang.String[0]);
        this.updateVisuals = isPropagationEnabled(true, "rabbit", "rabbitmq");
        this.requestPostMessageChannelWithExtras = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_PROPAGATION_DISABLED_QUEUES));
        this.setEngagementSignalsCallback = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_PROPAGATION_DISABLED_EXCHANGES));
        this.postMessage = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RABBIT_INCLUDE_ROUTINGKEY_IN_RESOURCE, true, new java.lang.String[0]);
        this.onWarmupCompleted = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.MESSAGE_BROKER_SPLIT_BY_DESTINATION, false, new java.lang.String[0]);
        this.c = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_IGNORED_INBOUND_METHODS));
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        arrayList22.addAll(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_IGNORED_OUTBOUND_METHODS));
        if (com.datadog.trace.api.InstrumenterConfig.get().isIntegrationEnabled(java.util.Collections.singleton("google-pubsub"), true)) {
        }
        this.startTransaction = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(arrayList22);
        this.resetTransaction = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_SERVER_TRIM_PACKAGE_RESOURCE, false, new java.lang.String[0]);
        this.exchange = configProvider.getIntegerRange(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_SERVER_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighSpeedVideoFpsRanges);
        this.init = configProvider.getIntegerRange(com.datadog.trace.api.config.TraceInstrumentationConfig.GRPC_CLIENT_ERROR_STATUSES, com.datadog.trace.api.ConfigDefaults.getHighResolutionOutputSizeshNQ4ISI);
        this.kernelID = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HYSTRIX_TAGS_ENABLED, false, new java.lang.String[0]);
        this.version = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.HYSTRIX_MEASURED_ENABLED, false, new java.lang.String[0]);
        this.encode = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.IGNITE_CACHE_INCLUDE_KEYS, false, new java.lang.String[0]);
        this.onExtraCallbackWithResult = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.OBFUSCATION_QUERY_STRING_REGEXP, null, "obfuscation.query.string.regexp");
        this.onTransact = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.PLAY_REPORT_HTTP_STATUS, false, new java.lang.String[0]);
        this.getActiveNotifications = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_PRINCIPAL_ENABLED, false, new java.lang.String[0]);
        this.getFrameTimeMillis = configProvider.getInteger(com.datadog.trace.api.config.TracerConfig.TRACE_X_DATADOG_TAGS_MAX_LENGTH, 512, new java.lang.String[0]);
        this.getSmallIconBitmap = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERVLET_ASYNC_TIMEOUT_ERROR, true, new java.lang.String[0]);
        boolean z622 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACE_DEBUG, false, new java.lang.String[0]);
        this.accessartificialFrame = z622;
        this.ActivityViewModelLazyKtviewModelsfactoryPromise2 = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TRACE_TRIAGE, z622, new java.lang.String[0]);
        this.INotificationSideChannel = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.STARTUP_LOGS_ENABLED, true, new java.lang.String[0]);
        this.ArtificialStackFrames = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_ENABLED, false, new java.lang.String[0]);
        this.getValidOutputFormatsForInputhNQ4ISI = configProvider.getFloat(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_BUCKET_DURATION_SECONDS, 10.0f);
        this.getOutputSizeshNQ4ISI = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.AZURE_APP_SERVICES, false, new java.lang.String[0]);
        this.IResultReceiverStubProxy = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_PATH);
        string = configProvider.getString(com.datadog.trace.api.config.TracerConfig.TRACE_AGENT_ARGS);
        if (string == null) {
        }
        this._BOUNDARY = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_PATH);
        string2 = configProvider.getString(com.datadog.trace.api.config.GeneralConfig.DOGSTATSD_ARGS);
        if (string2 == null) {
        }
        z2 = configProvider.getBoolean(com.datadog.trace.api.config.TracerConfig.TRACE_LONG_RUNNING_ENABLED, false, new java.lang.String[0]);
        long j222 = 300;
        j = configProvider.getLong(com.datadog.trace.api.config.TracerConfig.TRACE_LONG_RUNNING_FLUSH_INTERVAL, 300L, new java.lang.String[0]);
        if (z2) {
        }
        j222 = j;
        this.TransactionOutcomeDecodera = z2;
        this.onExtraCallback = j222;
        this.notifyNotificationWithChannel = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SPARK_TASK_HISTOGRAM_ENABLED, true, new java.lang.String[0]);
        this.apply = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.JAX_RS_EXCEPTION_AS_ERROR_ENABLED, true, new java.lang.String[0]);
        this.describeContents = configProvider.getFloat(com.datadog.trace.api.config.TracerConfig.TRACE_FLUSH_INTERVAL, 1.0f);
        this.write = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_DEBUG_REQUESTS_ENABLED, false, new java.lang.String[0]);
        this.IResultReceiverStub = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_TIMELINE_EVENTS_ENABLED, false, new java.lang.String[0]);
        getHighSpeedVideoFpsRanges.debug("New instance: {}", this);
    }

    public java.lang.String getRuntimeId() {
        return this.IPostMessageServiceDefault ? com.datadog.trace.api.Config.RuntimeIdHolder.getHighSpeedVideoSizes : "";
    }

    public java.lang.Long getProcessId() {
        return java.lang.Long.valueOf(com.datadog.trace.util.PidHelper.getPidAsLong());
    }

    public java.lang.String getSite() {
        return this.areNotificationsEnabled;
    }

    public java.lang.String getHostName() {
        return com.datadog.trace.api.Config.HostNameHolder.Camera2StreamConfigurationMap;
    }

    public java.lang.String getServiceName() {
        return this.ITrustedWebActivityService;
    }

    public boolean isServiceNameSetByUser() {
        return this.cancelNotification;
    }

    public java.lang.String getRootContextServiceName() {
        return this.IEngagementSignalsCallbackStub;
    }

    public boolean isLongRunningTraceEnabled() {
        return this.TransactionOutcomeDecodera;
    }

    public long getLongRunningTraceFlushInterval() {
        return this.onExtraCallback;
    }

    public boolean isInjectBaggageAsTagsEnabled() {
        return this.BerTlvEncoder;
    }

    public boolean isPrioritySamplingEnabled() {
        return this.onActivityLayout;
    }

    public java.lang.String getPrioritySamplingForce() {
        return this.IAuthTabCallbackStubProxy;
    }

    public int getSpanAttributeSchemaVersion() {
        return this.ITrustedWebActivityServiceStub;
    }

    public boolean isPeerServiceDefaultsEnabled() {
        return this.IAuthTabCallbackStub;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPeerServiceComponentOverrides() {
        return this.asInterface;
    }

    public boolean isRemoveIntegrationServiceNamesEnabled() {
        return this.onSessionEnded;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPeerServiceMapping() {
        return this.IAuthTabCallbackDefault;
    }

    public java.util.Map<java.lang.String, java.lang.String> getServiceMapping() {
        return this.ITrustedWebActivityCallback;
    }

    public java.util.Map<java.lang.String, java.lang.String> getRequestHeaderTags() {
        return this.IEngagementSignalsCallback;
    }

    public java.util.Map<java.lang.String, java.lang.String> getResponseHeaderTags() {
        return this.IEngagementSignalsCallbackDefault;
    }

    public boolean isRequestHeaderTagsCommaAllowed() {
        return this.onGreatestScrollPercentageIncreased;
    }

    public java.util.Map<java.lang.String, java.lang.String> getBaggageMapping() {
        return this.getOutputSizes;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHttpServerPathResourceNameMapping() {
        return this.rsaCipher;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHttpClientPathResourceNameMapping() {
        return this.requestGoOnline;
    }

    public boolean getHttpResourceRemoveTrailingSlash() {
        return this.sha1;
    }

    public boolean isHttpServerDecodedResourcePreserveSpaces() {
        return this.free;
    }

    public java.util.Set<java.lang.String> getSplitByTags() {
        return this.notify;
    }

    public int getScopeDepthLimit() {
        return this.IPostMessageServiceStub;
    }

    public boolean isScopeStrictMode() {
        return this.IPostMessageServiceStubProxy;
    }

    public boolean isScopeInheritAsyncPropagation() {
        return this.ITrustedWebActivityCallbackDefault;
    }

    public int getScopeIterationKeepAlive() {
        return this.ITrustedWebActivityCallbackStubProxy;
    }

    public int getPartialFlushMinSpans() {
        return this.getInterfaceVersion;
    }

    public boolean isTraceStrictWritesEnabled() {
        return this.ActivityViewModelLazyKtviewModels1;
    }

    public boolean isLogExtractHeaderNames() {
        return this.values;
    }

    public boolean isTracePropagationStyleB3PaddingEnabled() {
        return this.ActivityFlags;
    }

    public java.util.Set<com.datadog.trace.api.TracePropagationStyle> getTracePropagationStylesToExtract() {
        return this.viewModels;
    }

    public java.util.Set<com.datadog.trace.api.TracePropagationStyle> getTracePropagationStylesToInject() {
        return this.ResultReceiverMyRunnable;
    }

    public boolean isTracePropagationExtractFirst() {
        return this.ResultReceiver;
    }

    public int getClockSyncPeriod() {
        return this.getOutputStallDurationlomOqCM;
    }

    public boolean isRuntimeMetricsEnabled() {
        return this.IPostMessageService;
    }

    public boolean isHealthMetricsEnabled() {
        return this.AMEXKernela;
    }

    public boolean isLogsInjectionEnabled() {
        return this.valueOf;
    }

    public java.lang.String getTraceClientIpHeader() {
        return this.writeToParcel;
    }

    public boolean isTraceClientIpResolverEnabled() {
        return this.onReceiveResult;
    }

    public java.util.Map<java.lang.String, java.lang.String> getTraceSamplingServiceRules() {
        return this.ActivityViewModelLazyKtviewModels3;
    }

    public java.util.Map<java.lang.String, java.lang.String> getTraceSamplingOperationRules() {
        return this.viewModelsdefault;
    }

    public java.lang.String getTraceSamplingRules() {
        return this.invoke;
    }

    public java.lang.Double getTraceSampleRate() {
        return this.ActivityViewModelLazyKtviewModels2;
    }

    public int getTraceRateLimit() {
        return this.ActivityViewModelLazyKt;
    }

    public java.lang.String getSpanSamplingRules() {
        return this.ITrustedWebActivityServiceStubProxy;
    }

    public java.lang.String getSpanSamplingRulesFile() {
        return this.getSmallIconId;
    }

    public boolean isProfilingEnabled() {
        return this.onMinimized && this.aid.isProfilingEnabled();
    }

    public static boolean isDatadogProfilerEnablementOverridden() {
        return com.datadog.trace.api.Platform.isJavaVersion(18) || com.datadog.trace.api.Platform.isJavaVersion(16) || com.datadog.trace.api.Platform.isJavaVersion(15) || com.datadog.trace.api.Platform.isJavaVersion(14) || com.datadog.trace.api.Platform.isJavaVersion(13) || com.datadog.trace.api.Platform.isJavaVersion(12) || com.datadog.trace.api.Platform.isJavaVersion(10) || com.datadog.trace.api.Platform.isJavaVersion(9);
    }

    public static boolean isDatadogProfilerSafeInCurrentEnvironment() {
        boolean z = false;
        if (!com.datadog.trace.api.Platform.isJ9() && com.datadog.trace.api.Platform.isJavaVersion(8)) {
            java.lang.String property = java.lang.System.getProperty("os.arch");
            if ("aarch64".equalsIgnoreCase(property) || "arm64".equalsIgnoreCase(property)) {
                return false;
            }
        }
        if (com.datadog.trace.api.Platform.isGraalVM()) {
            return false;
        }
        boolean z2 = com.datadog.trace.api.Platform.isJ9() || !com.datadog.trace.api.Platform.isJavaVersion(18) || com.datadog.trace.api.Platform.isJavaVersionAtLeast(17, 0, 5) || (com.datadog.trace.api.Platform.isJavaVersion(11) && com.datadog.trace.api.Platform.isJavaVersionAtLeast(11, 0, 17)) || (com.datadog.trace.api.Platform.isJavaVersion(8) && com.datadog.trace.api.Platform.isJavaVersionAtLeast(8, 0, 352));
        if (!z2) {
            return z2;
        }
        if (!com.datadog.trace.api.Platform.isJ9()) {
            return true;
        }
        if ((!com.datadog.trace.api.Platform.isJavaVersion(11) || !com.datadog.trace.api.Platform.isJavaVersionAtLeast(11, 0, 18)) && (!com.datadog.trace.api.Platform.isJavaVersion(17) || !com.datadog.trace.api.Platform.isJavaVersionAtLeast(17, 0, 6))) {
            z = true;
        }
        return true & z;
    }

    public boolean isClientIpEnabled() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public boolean isAwsPropagationEnabled() {
        return this.getOutputStallDuration;
    }

    public java.lang.String getObfuscationQueryRegexp() {
        return this.onExtraCallbackWithResult;
    }

    public int getxDatadogTagsMaxLength() {
        return this.getFrameTimeMillis;
    }

    public boolean isDebugEnabled() {
        return this.accessartificialFrame;
    }

    public boolean isDataStreamsEnabled() {
        return this.ArtificialStackFrames;
    }

    public com.datadog.trace.api.IdGenerationStrategy getIdGenerationStrategy() {
        return this.provide;
    }

    public java.lang.String getPrimaryTag() {
        return this.extraCallback;
    }

    public java.lang.String getEnv() {
        if (this.kernelVersion == null) {
            java.lang.String str = getMergedSpanTags().get("env");
            this.kernelVersion = str;
            if (str == null) {
                this.kernelVersion = "";
            }
        }
        return this.kernelVersion;
    }

    public java.lang.String getVersion() {
        if (this.getProgress == null) {
            java.lang.String str = getMergedSpanTags().get("version");
            this.getProgress = str;
            if (str == null) {
                this.getProgress = "";
            }
        }
        return this.getProgress;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMergedSpanTags() {
        java.util.HashMap hashMap = new java.util.HashMap(getGlobalTags().size() + this.ITrustedWebActivityServiceDefault.size() + 1, 1.0f);
        hashMap.putAll(getGlobalTags());
        hashMap.putAll(this.ITrustedWebActivityServiceDefault);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public java.util.Map<java.lang.String, java.lang.String> getGlobalTags() {
        return this.RemoteActionCompatParcelizer;
    }

    public boolean isJmxFetchIntegrationEnabled(java.lang.Iterable<java.lang.String> iterable, boolean z) {
        return this.isOutputSupportedFor.isEnabled(iterable, "jmxfetch.", ".enabled", z);
    }

    public boolean isRuleEnabled(java.lang.String str, boolean z) {
        com.datadog.trace.bootstrap.config.provider.ConfigProvider configProvider = this.isOutputSupportedFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("trace.");
        sb.append(str);
        sb.append(".enabled");
        boolean z2 = configProvider.getBoolean(sb.toString(), z, new java.lang.String[0]);
        com.datadog.trace.bootstrap.config.provider.ConfigProvider configProvider2 = this.isOutputSupportedFor;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("trace.");
        sb2.append(str.toLowerCase(java.util.Locale.ROOT));
        sb2.append(".enabled");
        boolean z3 = configProvider2.getBoolean(sb2.toString(), z, new java.lang.String[0]);
        return z ? z2 && z3 : z2 || z3;
    }

    @java.lang.Deprecated
    public static boolean jmxFetchIntegrationEnabled(java.util.SortedSet<java.lang.String> sortedSet, boolean z) {
        return get().isJmxFetchIntegrationEnabled(sortedSet, z);
    }

    public boolean isEndToEndDurationEnabled(boolean z, java.lang.String... strArr) {
        return this.isOutputSupportedFor.isEnabled(java.util.Arrays.asList(strArr), "", ".e2e.duration.enabled", z);
    }

    public boolean isPropagationEnabled(boolean z, java.lang.String... strArr) {
        return this.isOutputSupportedFor.isEnabled(java.util.Arrays.asList(strArr), "", ".propagation.enabled", z);
    }

    public boolean isEnabled(boolean z, java.lang.String str, java.lang.String str2) {
        return this.isOutputSupportedFor.isEnabled(java.util.Collections.singletonList(str), "", str2, z);
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        getHighSpeedVideoFpsRanges.warn("Setting {} ignored since {}{} is enabled.", PREFIX.concat(java.lang.String.valueOf(str)), PREFIX.concat(java.lang.String.valueOf(str2)), str3);
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        getHighSpeedVideoFpsRanges.warn("Setting {} is overridden by setting {} with value {}.", PREFIX.concat(java.lang.String.valueOf(str)), PREFIX.concat(java.lang.String.valueOf(str2)), obj);
    }

    public boolean isTraceAnalyticsIntegrationEnabled(java.util.SortedSet<java.lang.String> sortedSet, boolean z) {
        return this.isOutputSupportedFor.isEnabled(sortedSet, "", ".analytics.enabled", z);
    }

    public boolean isSamplingMechanismValidationDisabled() {
        return this.isOutputSupportedFor.getBoolean(com.datadog.trace.api.config.TracerConfig.SAMPLING_MECHANISM_VALIDATION_DISABLED, false, new java.lang.String[0]);
    }

    public boolean isV2CompatibilityEnabled() {
        return this.isOutputSupportedFor.getBoolean("v2.compatibility.enabled", false, new java.lang.String[0]);
    }

    @java.lang.Deprecated
    public static boolean traceAnalyticsIntegrationEnabled(java.util.SortedSet<java.lang.String> sortedSet, boolean z) {
        return get().isTraceAnalyticsIntegrationEnabled(sortedSet, z);
    }

    private static java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI(str, true);
    }

    private static java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean z) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == ',' || (z && java.lang.Character.isWhitespace(charAt))) {
                if ((i - i2) - 1 > 0) {
                    linkedHashSet.add(str.substring(i2, i));
                }
                i2 = i + 1;
            }
            i++;
        }
        if ((i - i2) - 1 > 0) {
            linkedHashSet.add(str.substring(i2));
        }
        return java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    private static <T> java.util.Set<T> Camera2StreamConfigurationMap(java.lang.String str, java.util.Set<java.lang.String> set, com.datadog.android.trace.internal.compat.function.Function<java.lang.String, T> function) {
        if (set.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str2 : set) {
            try {
                linkedHashSet.add(function.apply(str2));
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRanges.warn("Cannot recognize config string value {} for setting {}", str2, PREFIX.concat(java.lang.String.valueOf(str)));
            }
        }
        return java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public static com.datadog.trace.api.Config get() {
        return getHighSpeedVideoSizes;
    }

    @java.lang.Deprecated
    public static com.datadog.trace.api.Config get(java.util.Properties properties) {
        if (properties == null || properties.isEmpty()) {
            return getHighSpeedVideoSizes;
        }
        return new com.datadog.trace.api.Config(com.datadog.trace.bootstrap.config.provider.ConfigProvider.withPropertiesOverride(properties));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Config{instrumenterConfig=");
        sb.append(this.aid);
        sb.append(", runtimeId='");
        sb.append(getRuntimeId());
        sb.append("', runtimeVersion='");
        sb.append(this.IEngagementSignalsCallbackStubProxy);
        sb.append(", site='");
        sb.append(this.areNotificationsEnabled);
        sb.append("', hostName='");
        sb.append(getHostName());
        sb.append("', serviceName='");
        sb.append(this.ITrustedWebActivityService);
        sb.append("', serviceNameSetByUser=");
        sb.append(this.cancelNotification);
        sb.append(", rootContextServiceName=");
        sb.append(this.IEngagementSignalsCallbackStub);
        sb.append(", integrationSynapseLegacyOperationName=");
        sb.append(this.decode);
        sb.append(", writerType='");
        sb.append(this.getSwipeEdge);
        sb.append("', agentConfiguredUsingDefault=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", agentUrl='");
        sb.append(this.getOutputFormats);
        sb.append("', agentHost='");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append("', agentPort=");
        sb.append(this.getInputFormats);
        sb.append("', agentTimeout=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", noProxyHosts=");
        sb.append(this.onNavigationEvent);
        sb.append(", prioritySamplingEnabled=");
        sb.append(this.onActivityLayout);
        sb.append(", prioritySamplingForce='");
        sb.append(this.IAuthTabCallbackStubProxy);
        sb.append("', traceResolverEnabled=");
        sb.append(this.ResultReceiverMyResultReceiver);
        sb.append(", serviceMapping=");
        sb.append(this.ITrustedWebActivityCallback);
        sb.append(", tags=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", spanTags=");
        sb.append(this.ITrustedWebActivityServiceDefault);
        sb.append(", requestHeaderTags=");
        sb.append(this.IEngagementSignalsCallback);
        sb.append(", responseHeaderTags=");
        sb.append(this.IEngagementSignalsCallbackDefault);
        sb.append(", baggageMapping=");
        sb.append(this.getOutputSizes);
        sb.append(", httpServerErrorStatuses=");
        sb.append(this.freeTransaction);
        sb.append(", httpClientErrorStatuses=");
        sb.append(this.l);
        sb.append(", httpServerTagQueryString=");
        sb.append(this.newContext);
        sb.append(", httpServerRawQueryString=");
        sb.append(this.AMEXKernelProvider);
        sb.append(", httpServerRawResource=");
        sb.append(this.start);
        sb.append(", httpServerRouteBasedNaming=");
        sb.append(this.setup);
        sb.append(", httpServerPathResourceNameMapping=");
        sb.append(this.rsaCipher);
        sb.append(", httpClientPathResourceNameMapping=");
        sb.append(this.requestGoOnline);
        sb.append(", httpClientTagQueryString=");
        sb.append(this.AMEXKernelJNI);
        sb.append(", httpClientSplitByDomain=");
        sb.append(this.updateUI);
        sb.append(", httpResourceRemoveTrailingSlash");
        sb.append(this.sha1);
        sb.append(", dbClientSplitByInstance=");
        sb.append(this.coroutineCreation);
        sb.append(", dbClientSplitByInstanceTypeSuffix=");
        sb.append(this.CoroutineDebuggingKt);
        sb.append(", dbClientSplitByHost=");
        sb.append(this.coroutineBoundary);
        sb.append(", DBMPropagationMode=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", splitByTags=");
        sb.append(this.notify);
        sb.append(", scopeDepthLimit=");
        sb.append(this.IPostMessageServiceStub);
        sb.append(", scopeStrictMode=");
        sb.append(this.IPostMessageServiceStubProxy);
        sb.append(", scopeInheritAsyncPropagation=");
        sb.append(this.ITrustedWebActivityCallbackDefault);
        sb.append(", scopeIterationKeepAlive=");
        sb.append(this.ITrustedWebActivityCallbackStubProxy);
        sb.append(", partialFlushMinSpans=");
        sb.append(this.getInterfaceVersion);
        sb.append(", traceStrictWritesEnabled=");
        sb.append(this.ActivityViewModelLazyKtviewModels1);
        sb.append(", tracePropagationStylesToExtract=");
        sb.append(this.viewModels);
        sb.append(", tracePropagationStylesToInject=");
        sb.append(this.ResultReceiverMyRunnable);
        sb.append(", tracePropagationExtractFirst=");
        sb.append(this.ResultReceiver);
        sb.append(", clockSyncPeriod=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", healthMetricsEnabled=");
        sb.append(this.AMEXKernela);
        sb.append(", healthMetricsStatsdHost='");
        sb.append(this.release);
        sb.append("', healthMetricsStatsdPort=");
        sb.append(this.AMEXKernelCallback);
        sb.append(", perfMetricsEnabled=");
        sb.append(this.asBinder);
        sb.append(", tracerMetricsEnabled=");
        sb.append(this.Api26Impl);
        sb.append(", tracerMetricsBufferingEnabled=");
        sb.append(this.ActivityViewModelLazyKtviewModels4);
        sb.append(", tracerMetricsMaxAggregates=");
        sb.append(this.ActivityViewModelLazyKtviewModelsfactoryPromise1);
        sb.append(", tracerMetricsMaxPending=");
        sb.append(this.setPipParamsSourceRectHint);
        sb.append(", reportHostName=");
        sb.append(this.onVerticalScrollEvent);
        sb.append(", traceAnalyticsEnabled=");
        sb.append(this.IResultReceiver2StubProxy);
        sb.append(", traceSamplingServiceRules=");
        sb.append(this.ActivityViewModelLazyKtviewModels3);
        sb.append(", traceSamplingOperationRules=");
        sb.append(this.viewModelsdefault);
        sb.append(", traceSamplingJsonRules=");
        sb.append(this.invoke);
        sb.append(", traceSampleRate=");
        sb.append(this.ActivityViewModelLazyKtviewModels2);
        sb.append(", traceRateLimit=");
        sb.append(this.ActivityViewModelLazyKt);
        sb.append(", spanSamplingRules=");
        sb.append(this.ITrustedWebActivityServiceStubProxy);
        sb.append(", spanSamplingRulesFile=");
        sb.append(this.getSmallIconId);
        sb.append(", profilingAgentless=");
        sb.append(this.ICustomTabsCallback);
        sb.append(", profilingUrl='");
        sb.append(this.prefetch);
        sb.append("', profilingTags=");
        sb.append(this.mayLaunchUrl);
        sb.append(", profilingStartDelay=");
        sb.append(this.isEngagementSignalsApiAvailable);
        sb.append(", profilingStartForceFirst=");
        sb.append(this.newAuthTabSession);
        sb.append(", profilingUploadPeriod=");
        sb.append(this.prefetchWithMultipleUrls);
        sb.append(", profilingTemplateOverrideFile='");
        sb.append(this.extraCommand);
        sb.append("', profilingUploadTimeout=");
        sb.append(this.newSessionWithExtras);
        sb.append(", profilingUploadCompression='");
        sb.append(this.newSession);
        sb.append("', profilingProxyHost='");
        sb.append(this.ICustomTabsCallbackDefault);
        sb.append("', profilingProxyPort=");
        sb.append(this.ICustomTabsCallbackStub);
        sb.append(", profilingProxyUsername='");
        sb.append(this.onUnminimized);
        sb.append("', profilingProxyPassword=");
        sb.append(this.ICustomTabsService == null ? "null" : "****");
        sb.append(", profilingExceptionSampleLimit=");
        sb.append(this.onRelationshipValidationResult);
        sb.append(", profilingExceptionHistogramTopItems=");
        sb.append(this.onActivityResized);
        sb.append(", profilingExceptionHistogramMaxCollectionSize=");
        sb.append(this.onMessageChannelReady);
        sb.append(", profilingExcludeAgentThreads=");
        sb.append(this.onPostMessage);
        sb.append(", crashTrackingTags=");
        sb.append(this.isOutputSupportedForhNQ4ISI);
        sb.append(", crashTrackingAgentless=");
        sb.append(this.unwrapAs);
        sb.append(", remoteConfigEnabled=");
        sb.append(this.requestPostMessageChannel);
        sb.append(", remoteConfigUrl=");
        sb.append(this.ICustomTabsServiceStub);
        sb.append(", remoteConfigPollIntervalSeconds=");
        sb.append(this.ICustomTabsServiceStubProxy);
        sb.append(", remoteConfigMaxPayloadSize=");
        sb.append(this.warmup);
        sb.append(", remoteConfigIntegrityCheckEnabled=");
        sb.append(this.validateRelationship);
        sb.append(", awsPropagationEnabled=");
        sb.append(this.getOutputStallDuration);
        sb.append(", sqsPropagationEnabled=");
        sb.append(this.INotificationSideChannelDefault);
        sb.append(", kafkaClientPropagationEnabled=");
        sb.append(this.IAuthTabCallback);
        sb.append(", kafkaClientPropagationDisabledTopics=");
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda7);
        sb.append(", kafkaClientBase64DecodingEnabled=");
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda4);
        sb.append(", jmsPropagationEnabled=");
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda5);
        sb.append(", jmsPropagationDisabledTopics=");
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda6);
        sb.append(", jmsPropagationDisabledQueues=");
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda3);
        sb.append(", rabbitPropagationEnabled=");
        sb.append(this.updateVisuals);
        sb.append(", rabbitPropagationDisabledQueues=");
        sb.append(this.requestPostMessageChannelWithExtras);
        sb.append(", rabbitPropagationDisabledExchanges=");
        sb.append(this.setEngagementSignalsCallback);
        sb.append(", messageBrokerSplitByDestination=");
        sb.append(this.onWarmupCompleted);
        sb.append(", hystrixTagsEnabled=");
        sb.append(this.kernelID);
        sb.append(", hystrixMeasuredEnabled=");
        sb.append(this.version);
        sb.append(", igniteCacheIncludeKeys=");
        sb.append(this.encode);
        sb.append(", servletPrincipalEnabled=");
        sb.append(this.getActiveNotifications);
        sb.append(", servletAsyncTimeoutError=");
        sb.append(this.getSmallIconBitmap);
        sb.append(", datadogTagsLimit=");
        sb.append(this.getFrameTimeMillis);
        sb.append(", traceAgentV05Enabled=");
        sb.append(this.IResultReceiver2Default);
        sb.append(", debugEnabled=");
        sb.append(this.accessartificialFrame);
        sb.append(", triageEnabled=");
        sb.append(this.ActivityViewModelLazyKtviewModelsfactoryPromise2);
        sb.append(", startLogsEnabled=");
        sb.append(this.INotificationSideChannel);
        sb.append(", configFile='");
        sb.append(this.toString);
        sb.append("', idGenerationStrategy=");
        sb.append(this.provide);
        sb.append(", trace128bitTraceIdGenerationEnabled=");
        sb.append(this.IResultReceiver2Stub);
        sb.append(", grpcIgnoredInboundMethods=");
        sb.append(this.c);
        sb.append(", grpcIgnoredOutboundMethods=");
        sb.append(this.startTransaction);
        sb.append(", grpcServerErrorStatuses=");
        sb.append(this.exchange);
        sb.append(", grpcClientErrorStatuses=");
        sb.append(this.init);
        sb.append(", clientIpEnabled=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(", longRunningTraceEnabled=");
        sb.append(this.TransactionOutcomeDecodera);
        sb.append(", longRunningTraceFlushInterval=");
        sb.append(this.onExtraCallback);
        sb.append(", elasticsearchBodyEnabled=");
        sb.append(this.AMEXKernel);
        sb.append(", elasticsearchParamsEnabled=");
        sb.append(this.d);
        sb.append(", elasticsearchBodyAndParamsEnabled=");
        sb.append(this.b);
        sb.append(", traceFlushInterval=");
        sb.append(this.describeContents);
        sb.append(", injectBaggageAsTagsEnabled=");
        sb.append(this.BerTlvEncoder);
        sb.append(", logsInjectionEnabled=");
        sb.append(this.valueOf);
        sb.append(", sparkTaskHistogramEnabled=");
        sb.append(this.notifyNotificationWithChannel);
        sb.append(", jaxRsExceptionAsErrorsEnabled=");
        sb.append(this.apply);
        sb.append(", peerServiceDefaultsEnabled=");
        sb.append(this.IAuthTabCallbackStub);
        sb.append(", peerServiceComponentOverrides=");
        sb.append(this.asInterface);
        sb.append(", removeIntegrationServiceNamesEnabled=");
        sb.append(this.onSessionEnded);
        sb.append(", spanAttributeSchemaVersion=");
        sb.append(this.ITrustedWebActivityServiceStub);
        sb.append(", telemetryDebugRequestsEnabled=");
        sb.append(this.write);
        sb.append(", telemetryMetricsEnabled=");
        sb.append(this.IconCompatParcelizer);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor() {
        java.lang.String str = java.lang.System.getenv("HOSTNAME");
        if (str != null) {
            com.datadog.trace.api.ConfigCollector.get().put("HOSTNAME", str, com.datadog.trace.api.ConfigOrigin.ENV);
        }
        if (str != null && !str.isEmpty()) {
            getHighSpeedVideoFpsRanges.debug("Determined hostname from environment variable");
            return str.trim();
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("hostname").getInputStream()));
            try {
                str = bufferedReader.readLine();
                bufferedReader.close();
            } finally {
            }
        } catch (java.lang.Throwable unused) {
        }
        if (str != null && !str.isEmpty()) {
            getHighSpeedVideoFpsRanges.debug("Determined hostname from hostname command");
            return str.trim();
        }
        try {
            return java.net.InetAddress.getLocalHost().getHostName();
        } catch (java.net.UnknownHostException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.Map<java.lang.String, java.lang.Object> getLocalRootSpanTags() {
        java.lang.String str;
        java.lang.String str2;
        int indexOf;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String property;
        java.lang.String hostName;
        java.util.Map singletonMap = java.util.Collections.singletonMap(com.datadog.trace.api.DDTags.RUNTIME_ID_TAG, getRuntimeId());
        java.util.HashMap hashMap = new java.util.HashMap(singletonMap.size() + 2);
        hashMap.putAll(singletonMap);
        hashMap.put(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, com.datadog.trace.api.DDTags.LANGUAGE_TAG_VALUE);
        hashMap.put(com.datadog.trace.api.DDTags.SCHEMA_VERSION_TAG_KEY, java.lang.Integer.valueOf(com.datadog.trace.api.naming.SpanNaming.instance().version()));
        hashMap.put(com.datadog.trace.api.DDTags.PROFILING_ENABLED, java.lang.Integer.valueOf(isProfilingEnabled() ? 1 : 0));
        if (this.onVerticalScrollEvent && (hostName = getHostName()) != null && !hostName.isEmpty()) {
            hashMap.put("_dd.hostname", hostName);
        }
        if (this.getOutputSizeshNQ4ISI) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.lang.String str8 = java.lang.System.getenv("WEBSITE_SITE_NAME");
            if (str8 != null) {
                com.datadog.trace.api.ConfigCollector.get().put("WEBSITE_SITE_NAME", str8, com.datadog.trace.api.ConfigOrigin.ENV);
            }
            if (str8 != null) {
                hashMap2.put("aas.site.name", str8);
            }
            java.lang.String str9 = java.lang.System.getenv("FUNCTIONS_WORKER_RUNTIME");
            if (str9 != null) {
                com.datadog.trace.api.ConfigCollector.get().put("FUNCTIONS_WORKER_RUNTIME", str9, com.datadog.trace.api.ConfigOrigin.ENV);
            }
            if (str9 == null) {
                java.lang.String str10 = java.lang.System.getenv("FUNCTIONS_EXTENSIONS_VERSION");
                if (str10 != null) {
                    com.datadog.trace.api.ConfigCollector.get().put("FUNCTIONS_EXTENSIONS_VERSION", str10, com.datadog.trace.api.ConfigOrigin.ENV);
                }
                if (str10 == null) {
                    hashMap2.put("aas.site.kind", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE);
                    hashMap2.put("aas.site.type", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE);
                    str = java.lang.System.getenv("WEBSITE_RESOURCE_GROUP");
                    if (str != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("WEBSITE_RESOURCE_GROUP", str, com.datadog.trace.api.ConfigOrigin.ENV);
                    }
                    if (str != null) {
                        hashMap2.put("aas.resource.group", str);
                    }
                    str2 = java.lang.System.getenv("WEBSITE_OWNER_NAME");
                    if (str2 != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("WEBSITE_OWNER_NAME", str2, com.datadog.trace.api.ConfigOrigin.ENV);
                    }
                    indexOf = str2 != null ? -1 : str2.indexOf("+");
                    if (indexOf <= 0) {
                        str3 = str2.substring(0, indexOf);
                        hashMap2.put("aas.subscription.id", str3);
                    } else {
                        str3 = null;
                    }
                    if (str3 == null && str8 != null && str != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("/subscriptions/");
                        sb.append(str3);
                        sb.append("/resourcegroups/");
                        sb.append(str);
                        sb.append("/providers/microsoft.web/sites/");
                        sb.append(str8);
                        hashMap2.put("aas.resource.id", sb.toString().toLowerCase(java.util.Locale.ROOT));
                    } else {
                        getHighSpeedVideoFpsRanges.warn("Unable to generate resource id subscription id: {}, site name: {}, resource group {}", str3, str8, str);
                    }
                    str4 = java.lang.System.getenv("WEBSITE_INSTANCE_ID");
                    if (str4 != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("WEBSITE_INSTANCE_ID", str4, com.datadog.trace.api.ConfigOrigin.ENV);
                    }
                    if (str4 == null) {
                        str4 = "unknown";
                    }
                    hashMap2.put("aas.environment.instance_id", str4);
                    str5 = java.lang.System.getenv("COMPUTERNAME");
                    if (str5 != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("COMPUTERNAME", str5, com.datadog.trace.api.ConfigOrigin.ENV);
                    }
                    if (str5 == null) {
                        str5 = "unknown";
                    }
                    hashMap2.put("aas.environment.instance_name", str5);
                    str6 = java.lang.System.getenv("WEBSITE_OS");
                    if (str6 != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("WEBSITE_OS", str6, com.datadog.trace.api.ConfigOrigin.ENV);
                    }
                    if (str6 == null) {
                        str6 = "unknown";
                    }
                    hashMap2.put("aas.environment.os", str6);
                    str7 = java.lang.System.getenv("DD_AAS_JAVA_EXTENSION_VERSION");
                    if (str7 != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("DD_AAS_JAVA_EXTENSION_VERSION", str7, com.datadog.trace.api.ConfigOrigin.ENV);
                    }
                    if (str7 == null) {
                        str7 = "unknown";
                    }
                    hashMap2.put("aas.environment.extension_version", str7);
                    property = java.lang.System.getProperty("java.vm.name", "unknown");
                    if (property != null) {
                        com.datadog.trace.api.ConfigCollector.get().put("java.vm.name", property, com.datadog.trace.api.ConfigOrigin.JVM_PROP);
                    }
                    hashMap2.put("aas.environment.runtime", property);
                    hashMap.putAll(hashMap2);
                }
            }
            hashMap2.put("aas.site.kind", "functionapp");
            hashMap2.put("aas.site.type", "function");
            str = java.lang.System.getenv("WEBSITE_RESOURCE_GROUP");
            if (str != null) {
            }
            if (str != null) {
            }
            str2 = java.lang.System.getenv("WEBSITE_OWNER_NAME");
            if (str2 != null) {
            }
            if (str2 != null) {
            }
            if (indexOf <= 0) {
            }
            if (str3 == null) {
            }
            getHighSpeedVideoFpsRanges.warn("Unable to generate resource id subscription id: {}, site name: {}, resource group {}", str3, str8, str);
            str4 = java.lang.System.getenv("WEBSITE_INSTANCE_ID");
            if (str4 != null) {
            }
            if (str4 == null) {
            }
            hashMap2.put("aas.environment.instance_id", str4);
            str5 = java.lang.System.getenv("COMPUTERNAME");
            if (str5 != null) {
            }
            if (str5 == null) {
            }
            hashMap2.put("aas.environment.instance_name", str5);
            str6 = java.lang.System.getenv("WEBSITE_OS");
            if (str6 != null) {
            }
            if (str6 == null) {
            }
            hashMap2.put("aas.environment.os", str6);
            str7 = java.lang.System.getenv("DD_AAS_JAVA_EXTENSION_VERSION");
            if (str7 != null) {
            }
            if (str7 == null) {
            }
            hashMap2.put("aas.environment.extension_version", str7);
            property = java.lang.System.getProperty("java.vm.name", "unknown");
            if (property != null) {
            }
            hashMap2.put("aas.environment.runtime", property);
            hashMap.putAll(hashMap2);
        }
        hashMap.putAll(java.util.Collections.singletonMap(com.datadog.trace.api.DDTags.PID_TAG, getProcessId()));
        return java.util.Collections.unmodifiableMap(hashMap);
    }
}
