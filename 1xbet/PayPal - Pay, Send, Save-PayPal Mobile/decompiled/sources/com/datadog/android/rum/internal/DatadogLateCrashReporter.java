package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'"}, d2 = {"Lcom/datadog/android/rum/internal/DatadogLateCrashReporter;", "Lcom/datadog/android/rum/internal/LateCrashReporter;", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lcom/google/gson/JsonObject;", "", "rumEventDeserializer", "Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;", "androidTraceParser", "<init>", "(Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;)V", "Landroid/app/ApplicationExitInfo;", "anrExitInfo", "lastRumViewEventJson", "Lcom/datadog/android/api/storage/DataWriter;", "rumWriter", "", "handleAnrCrash", "(Landroid/app/ApplicationExitInfo;Lcom/google/gson/JsonObject;Lcom/datadog/android/api/storage/DataWriter;)V", "", "event", "handleNdkCrashEvent", "(Ljava/util/Map;Lcom/datadog/android/api/storage/DataWriter;)V", "p0", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "dL_", "(Landroid/app/ApplicationExitInfo;)Ljava/util/List;", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType$Companion;", "", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/InternalSdkCore;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogLateCrashReporter implements com.datadog.android.rum.internal.LateCrashReporter {
    public static final java.lang.String INFO_RUM_FEATURE_NOT_REGISTERED = "RUM feature is not registered, won't report NDK crash info as RUM error.";
    public static final java.lang.String MISSING_ANR_TRACE = "Last known exit reason has no trace information attached, cannot report fatal ANR.";
    public static final java.lang.String NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS = "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
    public static final java.lang.String OPEN_ANR_TRACE_ERROR = "Cannot open trace for the last known exit reason.";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.Deserializer<com.google.gson.JsonObject, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.anr.AndroidTraceParser getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.DatadogLateCrashReporter.Companion INSTANCE = new com.datadog.android.rum.internal.DatadogLateCrashReporter.Companion(null);
    private static final long VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD = java.util.concurrent.TimeUnit.HOURS.toMillis(4);

    public DatadogLateCrashReporter(com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.core.internal.persistence.Deserializer<com.google.gson.JsonObject, java.lang.Object> deserializer, com.datadog.android.rum.internal.anr.AndroidTraceParser androidTraceParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidTraceParser, "");
        this.getHighSpeedVideoFpsRangesFor = internalSdkCore;
        this.Camera2StreamConfigurationMap = deserializer;
        this.getHighSpeedVideoFpsRanges = androidTraceParser;
    }

    public /* synthetic */ DatadogLateCrashReporter(com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.domain.event.RumEventDeserializer rumEventDeserializer, com.datadog.android.rum.internal.anr.AndroidTraceParser androidTraceParser, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalSdkCore, (i & 2) != 0 ? new com.datadog.android.rum.internal.domain.event.RumEventDeserializer(internalSdkCore.getInternalLogger()) : rumEventDeserializer, (i & 4) != 0 ? new com.datadog.android.rum.internal.anr.AndroidTraceParser(internalSdkCore.getInternalLogger()) : androidTraceParser);
    }

    @Override // com.datadog.android.rum.internal.LateCrashReporter
    public final void handleNdkCrashEvent(java.util.Map<?, ?> event, final com.datadog.android.api.storage.DataWriter<java.lang.Object> rumWriter) {
        final com.datadog.android.rum.model.ViewEvent viewEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumWriter, "");
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoFpsRangesFor.getFeature("rum");
        if (feature == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        java.lang.Object obj = event.get("sourceType");
        final java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = event.get("timestamp");
        final java.lang.Long l = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        java.lang.Object obj3 = event.get("timeSinceAppStartMs");
        final java.lang.Long l2 = obj3 instanceof java.lang.Long ? (java.lang.Long) obj3 : null;
        java.lang.Object obj4 = event.get("signalName");
        final java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.Object obj5 = event.get("stacktrace");
        final java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.Object obj6 = event.get("message");
        final java.lang.String str4 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        java.lang.Object obj7 = event.get("lastViewEvent");
        com.google.gson.JsonObject jsonObject = obj7 instanceof com.google.gson.JsonObject ? (com.google.gson.JsonObject) obj7 : null;
        if (jsonObject != null) {
            java.lang.Object deserialize = this.Camera2StreamConfigurationMap.deserialize(jsonObject);
            if (deserialize instanceof com.datadog.android.rum.model.ViewEvent) {
                viewEvent = (com.datadog.android.rum.model.ViewEvent) deserialize;
                if (l != null || str2 == null || str3 == null || str4 == null || viewEvent == null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.DatadogLateCrashReporter.NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                } else {
                    com.datadog.android.api.feature.FeatureScope.DefaultImpls.withWriteContext$default(feature, null, new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                            getHighResolutionOutputSizeshNQ4ISI(datadogContext, function1);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                            com.datadog.android.rum.model.ErrorEvent.SourceType highSpeedVideoFpsRanges;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                            com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter = com.datadog.android.rum.internal.DatadogLateCrashReporter.this;
                            com.datadog.android.rum.model.ErrorEvent.SourceType.Companion companion = com.datadog.android.rum.model.ErrorEvent.SourceType.INSTANCE;
                            highSpeedVideoFpsRanges = datadogLateCrashReporter.getHighSpeedVideoFpsRanges(str);
                            final com.datadog.android.rum.model.ErrorEvent access$resolveErrorEventFromViewEvent = com.datadog.android.rum.internal.DatadogLateCrashReporter.access$resolveErrorEventFromViewEvent(datadogLateCrashReporter, datadogContext, highSpeedVideoFpsRanges, com.datadog.android.rum.model.ErrorEvent.Category.EXCEPTION, str4, l.longValue(), l2, str3, str2, null, viewEvent);
                            final com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter = rumWriter;
                            final com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter2 = com.datadog.android.rum.internal.DatadogLateCrashReporter.this;
                            final com.datadog.android.rum.model.ViewEvent viewEvent2 = viewEvent;
                            function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$3.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                                    getHighSpeedVideoFpsRangesFor(eventBatchWriter);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                                    dataWriter.write(eventBatchWriter, access$resolveErrorEventFromViewEvent, com.datadog.android.api.storage.EventType.CRASH);
                                    if (com.datadog.android.rum.internal.DatadogLateCrashReporter.access$isWithinSessionAvailability(datadogLateCrashReporter2, viewEvent2)) {
                                        dataWriter.write(eventBatchWriter, com.datadog.android.rum.internal.DatadogLateCrashReporter.access$updateViewEvent(datadogLateCrashReporter2, viewEvent2), com.datadog.android.api.storage.EventType.CRASH);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            });
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 1, null);
                    return;
                }
            }
        }
        viewEvent = null;
        if (l != null) {
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.rum.internal.DatadogLateCrashReporter.NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS;
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    @Override // com.datadog.android.rum.internal.LateCrashReporter
    public final void handleAnrCrash(final android.app.ApplicationExitInfo anrExitInfo, com.google.gson.JsonObject lastRumViewEventJson, final com.datadog.android.api.storage.DataWriter<java.lang.Object> rumWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anrExitInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastRumViewEventJson, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumWriter, "");
        java.lang.Object deserialize = this.Camera2StreamConfigurationMap.deserialize(lastRumViewEventJson);
        final com.datadog.android.rum.model.ViewEvent viewEvent = deserialize instanceof com.datadog.android.rum.model.ViewEvent ? (com.datadog.android.rum.model.ViewEvent) deserialize : null;
        if (viewEvent != null) {
            if (anrExitInfo.getTimestamp() > viewEvent.getDate()) {
                com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoFpsRangesFor.getFeature("rum");
                if (feature == null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                } else {
                    feature.withWriteContext(kotlin.collections.SetsKt.setOf("rum"), new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                            getHighSpeedVideoSizes(datadogContext, function1);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoSizes(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                            com.datadog.android.core.InternalSdkCore internalSdkCore;
                            java.util.List dL_;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                            if (kotlin.jvm.internal.Intrinsics.areEqual(com.datadog.android.rum.model.ViewEvent.this.getSession().getId(), com.datadog.android.rum.internal.DatadogLateCrashReporter.access$getRumSessionId(this, datadogContext))) {
                                return;
                            }
                            internalSdkCore = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.Long lastFatalAnrSent = internalSdkCore.getLastFatalAnrSent();
                            long timestamp = anrExitInfo.getTimestamp();
                            if (lastFatalAnrSent == null || timestamp != lastFatalAnrSent.longValue()) {
                                dL_ = this.dL_(anrExitInfo);
                                if (dL_.isEmpty()) {
                                    return;
                                }
                                com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter = this;
                                com.datadog.android.rum.model.ErrorEvent.SourceType sourceType = com.datadog.android.rum.model.ErrorEvent.SourceType.ANDROID;
                                com.datadog.android.rum.model.ErrorEvent.Category category = com.datadog.android.rum.model.ErrorEvent.Category.ANR;
                                long timestamp2 = anrExitInfo.getTimestamp();
                                com.datadog.android.core.feature.event.ThreadDump access$getMainThread = com.datadog.android.rum.internal.DatadogLateCrashReporter.access$getMainThread(this, dL_);
                                java.lang.String stack = access$getMainThread != null ? access$getMainThread.getStack() : null;
                                java.lang.String str = stack == null ? "" : stack;
                                java.lang.String canonicalName = com.datadog.android.rum.internal.anr.ANRException.class.getCanonicalName();
                                final com.datadog.android.rum.model.ErrorEvent access$resolveErrorEventFromViewEvent = com.datadog.android.rum.internal.DatadogLateCrashReporter.access$resolveErrorEventFromViewEvent(datadogLateCrashReporter, datadogContext, sourceType, category, com.datadog.android.rum.internal.anr.ANRDetectorRunnable.ANR_MESSAGE, timestamp2, null, str, canonicalName == null ? "" : canonicalName, dL_, com.datadog.android.rum.model.ViewEvent.this);
                                final com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter2 = this;
                                final android.app.ApplicationExitInfo applicationExitInfo = anrExitInfo;
                                final com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter = rumWriter;
                                final com.datadog.android.rum.model.ViewEvent viewEvent2 = com.datadog.android.rum.model.ViewEvent.this;
                                function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$2.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                                        getHighResolutionOutputSizeshNQ4ISI(eventBatchWriter);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                                        com.datadog.android.core.InternalSdkCore internalSdkCore2;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                                        internalSdkCore2 = com.datadog.android.rum.internal.DatadogLateCrashReporter.this.getHighSpeedVideoFpsRangesFor;
                                        internalSdkCore2.writeLastFatalAnrSent(applicationExitInfo.getTimestamp());
                                        dataWriter.write(eventBatchWriter, access$resolveErrorEventFromViewEvent, com.datadog.android.api.storage.EventType.CRASH);
                                        if (com.datadog.android.rum.internal.DatadogLateCrashReporter.access$isWithinSessionAvailability(com.datadog.android.rum.internal.DatadogLateCrashReporter.this, viewEvent2)) {
                                            dataWriter.write(eventBatchWriter, com.datadog.android.rum.internal.DatadogLateCrashReporter.access$updateViewEvent(com.datadog.android.rum.internal.DatadogLateCrashReporter.this, viewEvent2), com.datadog.android.api.storage.EventType.CRASH);
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<com.datadog.android.core.feature.event.ThreadDump> dL_(android.app.ApplicationExitInfo p0) {
        try {
            java.io.InputStream traceInputStream = p0.getTraceInputStream();
            if (traceInputStream == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$readThreadsDump$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.DatadogLateCrashReporter.MISSING_ANR_TRACE;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return kotlin.collections.CollectionsKt.emptyList();
            }
            return this.getHighSpeedVideoFpsRanges.parse$dd_sdk_android_rum_release(traceInputStream);
        } catch (java.io.IOException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$readThreadsDump$traceInputStream$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.DatadogLateCrashReporter.OPEN_ANR_TRACE_ERROR;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.datadog.android.rum.model.ErrorEvent.SourceType getHighSpeedVideoFpsRanges(final java.lang.String p0) {
        if (p0 != null) {
            try {
                return com.datadog.android.rum.model.ErrorEvent.SourceType.INSTANCE.fromJson(p0);
            } catch (java.util.NoSuchElementException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$tryFromSource$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Error parsing source type from NDK crash event: ".concat(java.lang.String.valueOf(p0));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                return com.datadog.android.rum.model.ErrorEvent.SourceType.NDK;
            }
        }
        return com.datadog.android.rum.model.ErrorEvent.SourceType.NDK;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/DatadogLateCrashReporter$Companion;", "", "<init>", "()V", "", "INFO_RUM_FEATURE_NOT_REGISTERED", "Ljava/lang/String;", "MISSING_ANR_TRACE", "NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS", "OPEN_ANR_TRACE_ERROR", "", "VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD", "J", "getVIEW_EVENT_AVAILABILITY_TIME_THRESHOLD$dd_sdk_android_rum_release", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getVIEW_EVENT_AVAILABILITY_TIME_THRESHOLD$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.DatadogLateCrashReporter.VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ com.datadog.android.core.feature.event.ThreadDump access$getMainThread(com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter, java.util.List list) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.datadog.android.core.feature.event.ThreadDump) obj).getName(), "main")) {
                break;
            }
        }
        return (com.datadog.android.core.feature.event.ThreadDump) obj;
    }

    public static final /* synthetic */ java.lang.String access$getRumSessionId(com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter, com.datadog.android.api.context.DatadogContext datadogContext) {
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("rum");
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.Object obj = map.get("session_id");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public static final /* synthetic */ boolean access$isWithinSessionAvailability(com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter, com.datadog.android.rum.model.ViewEvent viewEvent) {
        return datadogLateCrashReporter.getHighSpeedVideoFpsRangesFor.getTimeProvider().getDeviceTimestampMillis() - viewEvent.getDate() < VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ com.datadog.android.rum.model.ErrorEvent access$resolveErrorEventFromViewEvent(com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter, com.datadog.android.api.context.DatadogContext datadogContext, com.datadog.android.rum.model.ErrorEvent.SourceType sourceType, com.datadog.android.rum.model.ErrorEvent.Category category, java.lang.String str, long j, java.lang.Long l, java.lang.String str2, java.lang.String str3, java.util.List list, com.datadog.android.rum.model.ViewEvent viewEvent) {
        com.datadog.android.rum.model.ErrorEvent.Connectivity connectivity;
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        boolean z;
        com.datadog.android.rum.model.ErrorEvent.Usr usr;
        java.util.ArrayList arrayList;
        java.lang.Number sessionSampleRate;
        com.google.gson.JsonElement json;
        java.lang.String asString;
        java.util.ArrayList arrayList2;
        com.datadog.android.rum.model.ViewEvent.Connectivity connectivity2 = viewEvent.getConnectivity();
        if (connectivity2 != null) {
            com.datadog.android.rum.model.ErrorEvent.Status valueOf = com.datadog.android.rum.model.ErrorEvent.Status.valueOf(connectivity2.getStatus().name());
            java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> interfaces = connectivity2.getInterfaces();
            if (interfaces != null) {
                java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> list2 = interfaces;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(com.datadog.android.rum.model.ErrorEvent.Interface.valueOf(((com.datadog.android.rum.model.ViewEvent.Interface) it.next()).name()));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            com.datadog.android.rum.model.ViewEvent.Cellular cellular = connectivity2.getCellular();
            java.lang.String technology = cellular != null ? cellular.getTechnology() : null;
            com.datadog.android.rum.model.ViewEvent.Cellular cellular2 = connectivity2.getCellular();
            connectivity = new com.datadog.android.rum.model.ErrorEvent.Connectivity(valueOf, arrayList2, null, new com.datadog.android.rum.model.ErrorEvent.Cellular(technology, cellular2 != null ? cellular2.getCarrierName() : null), 4, null);
        } else {
            connectivity = null;
        }
        com.datadog.android.rum.model.ViewEvent.Context context = viewEvent.getContext();
        if (context == null || (linkedHashMap = context.getAdditionalProperties()) == null) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        com.datadog.android.rum.model.ViewEvent.Usr usr2 = viewEvent.getUsr();
        if (usr2 == null || (linkedHashMap2 = usr2.getAdditionalProperties()) == null) {
            linkedHashMap2 = new java.util.LinkedHashMap();
        }
        java.util.Map<java.lang.String, java.lang.Object> map = linkedHashMap2;
        com.datadog.android.rum.model.ViewEvent.Usr usr3 = viewEvent.getUsr();
        if ((usr3 != null ? usr3.getId() : null) == null) {
            if ((usr3 != null ? usr3.getAnonymousId() : null) == null) {
                if ((usr3 != null ? usr3.getName() : null) == null) {
                    if ((usr3 != null ? usr3.getEmail() : null) == null && map.isEmpty()) {
                        z = false;
                        com.datadog.android.rum.model.ViewEvent.Account account = viewEvent.getAccount();
                        com.datadog.android.api.context.DeviceInfo deviceInfo = datadogContext.getDeviceInfo();
                        long serverTimeOffsetMs = datadogContext.getTime().getServerTimeOffsetMs();
                        java.lang.String appBuildId = datadogContext.getAppBuildId();
                        com.datadog.android.rum.model.ErrorEvent.Application application = new com.datadog.android.rum.model.ErrorEvent.Application(viewEvent.getApplication().getId(), null, 2, null);
                        java.lang.String service = viewEvent.getService();
                        com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(viewEvent.getSession().getId(), com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER, null, 4, null);
                        com.datadog.android.rum.model.ViewEvent.ViewEventSource source = viewEvent.getSource();
                        com.datadog.android.rum.model.ErrorEvent.ErrorEventSource tryFromSource = (source != null || (json = source.toJson()) == null || (asString = json.getAsString()) == null) ? null : com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE, asString, datadogLateCrashReporter.getHighSpeedVideoFpsRangesFor.getInternalLogger());
                        com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(viewEvent.getView().getId(), viewEvent.getView().getReferrer(), viewEvent.getView().getUrl(), viewEvent.getView().getName(), null, 16, null);
                        if (z) {
                            usr = null;
                        } else {
                            usr = new com.datadog.android.rum.model.ErrorEvent.Usr(usr3 != null ? usr3.getId() : null, usr3 != null ? usr3.getName() : null, usr3 != null ? usr3.getEmail() : null, usr3 != null ? usr3.getAnonymousId() : null, map);
                        }
                        com.datadog.android.rum.model.ErrorEvent.Account account2 = account == null ? new com.datadog.android.rum.model.ErrorEvent.Account(account.getId(), account.getName(), account.getAdditionalProperties()) : null;
                        com.datadog.android.rum.model.ErrorEvent.Os os = new com.datadog.android.rum.model.ErrorEvent.Os(deviceInfo.getOsName(), deviceInfo.getOsVersion(), null, deviceInfo.getOsMajorVersion(), 4, null);
                        com.datadog.android.rum.model.ErrorEvent.Device device = new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(deviceInfo.getDeviceType()), deviceInfo.getDeviceName(), deviceInfo.getDeviceModel(), deviceInfo.getDeviceBrand(), deviceInfo.getArchitecture(), null, null, null, null, null, null, java.lang.Integer.valueOf(deviceInfo.getLogicalCpuCount()), deviceInfo.getTotalRam(), deviceInfo.isLowRam(), 2016, null);
                        com.datadog.android.rum.model.ErrorEvent.DdSession ddSession = new com.datadog.android.rum.model.ErrorEvent.DdSession(null, null, 3, null);
                        com.datadog.android.rum.model.ViewEvent.Configuration configuration = viewEvent.getDd().getConfiguration();
                        com.datadog.android.rum.model.ErrorEvent.Dd dd = new com.datadog.android.rum.model.ErrorEvent.Dd(ddSession, new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf((configuration != null || (sessionSampleRate = configuration.getSessionSampleRate()) == null) ? 0.0f : sessionSampleRate.floatValue()), null, null, null, 14, null), null, null, 12, null);
                        com.datadog.android.rum.model.ErrorEvent.Context context2 = new com.datadog.android.rum.model.ErrorEvent.Context(linkedHashMap);
                        java.lang.String obj = java.util.UUID.randomUUID().toString();
                        com.datadog.android.rum.model.ErrorEvent.ErrorSource errorSource = com.datadog.android.rum.model.ErrorEvent.ErrorSource.SOURCE;
                        if (list == null) {
                            java.util.List<com.datadog.android.core.feature.event.ThreadDump> list3 = list;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            for (com.datadog.android.core.feature.event.ThreadDump threadDump : list3) {
                                arrayList4.add(new com.datadog.android.rum.model.ErrorEvent.Thread(threadDump.getName(), threadDump.getCrashed(), threadDump.getStack(), threadDump.getState()));
                            }
                            arrayList = arrayList4;
                        } else {
                            arrayList = null;
                        }
                        com.datadog.android.rum.model.ErrorEvent.Error error = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str, errorSource, str2, null, java.lang.Boolean.TRUE, null, str3, category, null, null, sourceType, null, arrayList, null, null, null, null, l, 251472, null);
                        java.lang.String version = viewEvent.getVersion();
                        com.datadog.android.rum.model.ViewEvent.Context featureFlags = viewEvent.getFeatureFlags();
                        return new com.datadog.android.rum.model.ErrorEvent(j + serverTimeOffsetMs, application, service, version, null, appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(datadogContext), errorEventSession, tryFromSource, errorEventView, usr, account2, connectivity, null, null, null, os, device, dd, context2, null, null, error, null, featureFlags != null ? new com.datadog.android.rum.model.ErrorEvent.Context(featureFlags.getAdditionalProperties()) : null, 11591696, null);
                    }
                }
            }
        }
        z = true;
        com.datadog.android.rum.model.ViewEvent.Account account3 = viewEvent.getAccount();
        com.datadog.android.api.context.DeviceInfo deviceInfo2 = datadogContext.getDeviceInfo();
        long serverTimeOffsetMs2 = datadogContext.getTime().getServerTimeOffsetMs();
        java.lang.String appBuildId2 = datadogContext.getAppBuildId();
        com.datadog.android.rum.model.ErrorEvent.Application application2 = new com.datadog.android.rum.model.ErrorEvent.Application(viewEvent.getApplication().getId(), null, 2, null);
        java.lang.String service2 = viewEvent.getService();
        com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession2 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(viewEvent.getSession().getId(), com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER, null, 4, null);
        com.datadog.android.rum.model.ViewEvent.ViewEventSource source2 = viewEvent.getSource();
        if (source2 != null) {
        }
        com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView2 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(viewEvent.getView().getId(), viewEvent.getView().getReferrer(), viewEvent.getView().getUrl(), viewEvent.getView().getName(), null, 16, null);
        if (z) {
        }
        if (account3 == null) {
        }
        com.datadog.android.rum.model.ErrorEvent.Os os2 = new com.datadog.android.rum.model.ErrorEvent.Os(deviceInfo2.getOsName(), deviceInfo2.getOsVersion(), null, deviceInfo2.getOsMajorVersion(), 4, null);
        com.datadog.android.rum.model.ErrorEvent.Device device2 = new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(deviceInfo2.getDeviceType()), deviceInfo2.getDeviceName(), deviceInfo2.getDeviceModel(), deviceInfo2.getDeviceBrand(), deviceInfo2.getArchitecture(), null, null, null, null, null, null, java.lang.Integer.valueOf(deviceInfo2.getLogicalCpuCount()), deviceInfo2.getTotalRam(), deviceInfo2.isLowRam(), 2016, null);
        com.datadog.android.rum.model.ErrorEvent.DdSession ddSession2 = new com.datadog.android.rum.model.ErrorEvent.DdSession(null, null, 3, null);
        com.datadog.android.rum.model.ViewEvent.Configuration configuration2 = viewEvent.getDd().getConfiguration();
        com.datadog.android.rum.model.ErrorEvent.Dd dd2 = new com.datadog.android.rum.model.ErrorEvent.Dd(ddSession2, new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf((configuration2 != null || (sessionSampleRate = configuration2.getSessionSampleRate()) == null) ? 0.0f : sessionSampleRate.floatValue()), null, null, null, 14, null), null, null, 12, null);
        com.datadog.android.rum.model.ErrorEvent.Context context22 = new com.datadog.android.rum.model.ErrorEvent.Context(linkedHashMap);
        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
        com.datadog.android.rum.model.ErrorEvent.ErrorSource errorSource2 = com.datadog.android.rum.model.ErrorEvent.ErrorSource.SOURCE;
        if (list == null) {
        }
        com.datadog.android.rum.model.ErrorEvent.Error error2 = new com.datadog.android.rum.model.ErrorEvent.Error(obj2, str, errorSource2, str2, null, java.lang.Boolean.TRUE, null, str3, category, null, null, sourceType, null, arrayList, null, null, null, null, l, 251472, null);
        java.lang.String version2 = viewEvent.getVersion();
        com.datadog.android.rum.model.ViewEvent.Context featureFlags2 = viewEvent.getFeatureFlags();
        return new com.datadog.android.rum.model.ErrorEvent(j + serverTimeOffsetMs2, application2, service2, version2, null, appBuildId2, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(datadogContext), errorEventSession2, tryFromSource, errorEventView2, usr, account2, connectivity, null, null, null, os2, device2, dd2, context22, null, null, error2, null, featureFlags2 != null ? new com.datadog.android.rum.model.ErrorEvent.Context(featureFlags2.getAdditionalProperties()) : null, 11591696, null);
    }

    public static final /* synthetic */ com.datadog.android.rum.model.ViewEvent access$updateViewEvent(com.datadog.android.rum.internal.DatadogLateCrashReporter datadogLateCrashReporter, com.datadog.android.rum.model.ViewEvent viewEvent) {
        com.datadog.android.rum.model.ViewEvent.Crash crash;
        com.datadog.android.rum.model.ViewEvent.ViewEventView copy;
        com.datadog.android.rum.model.ViewEvent.Dd copy2;
        com.datadog.android.rum.model.ViewEvent copy3;
        com.datadog.android.rum.model.ViewEvent.Crash crash2 = viewEvent.getView().getCrash();
        if (crash2 == null || (crash = crash2.copy(crash2.getCount() + 1)) == null) {
            crash = new com.datadog.android.rum.model.ViewEvent.Crash(1L);
        }
        copy = r3.copy((r74 & 1) != 0 ? r3.id : null, (r74 & 2) != 0 ? r3.referrer : null, (r74 & 4) != 0 ? r3.url : null, (r74 & 8) != 0 ? r3.name : null, (r74 & 16) != 0 ? r3.loadingTime : null, (r74 & 32) != 0 ? r3.networkSettledTime : null, (r74 & 64) != 0 ? r3.interactionToNextViewTime : null, (r74 & 128) != 0 ? r3.loadingType : null, (r74 & 256) != 0 ? r3.timeSpent : 0L, (r74 & 512) != 0 ? r3.firstContentfulPaint : null, (r74 & 1024) != 0 ? r3.largestContentfulPaint : null, (r74 & 2048) != 0 ? r3.largestContentfulPaintTargetSelector : null, (r74 & 4096) != 0 ? r3.firstInputDelay : null, (r74 & 8192) != 0 ? r3.firstInputTime : null, (r74 & 16384) != 0 ? r3.firstInputTargetSelector : null, (r74 & 32768) != 0 ? r3.interactionToNextPaint : null, (r74 & 65536) != 0 ? r3.interactionToNextPaintTime : null, (r74 & 131072) != 0 ? r3.interactionToNextPaintTargetSelector : null, (r74 & 262144) != 0 ? r3.cumulativeLayoutShift : null, (r74 & 524288) != 0 ? r3.cumulativeLayoutShiftTime : null, (r74 & 1048576) != 0 ? r3.cumulativeLayoutShiftTargetSelector : null, (r74 & 2097152) != 0 ? r3.domComplete : null, (r74 & 4194304) != 0 ? r3.domContentLoaded : null, (r74 & 8388608) != 0 ? r3.domInteractive : null, (r74 & 16777216) != 0 ? r3.loadEvent : null, (r74 & 33554432) != 0 ? r3.firstByte : null, (r74 & 67108864) != 0 ? r3.customTimings : null, (r74 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.isActive : java.lang.Boolean.FALSE, (r74 & 268435456) != 0 ? r3.isSlowRendered : null, (r74 & 536870912) != 0 ? r3.action : null, (r74 & 1073741824) != 0 ? r3.error : null, (r74 & Integer.MIN_VALUE) != 0 ? r3.crash : crash, (r75 & 1) != 0 ? r3.longTask : null, (r75 & 2) != 0 ? r3.frozenFrame : null, (r75 & 4) != 0 ? r3.slowFrames : null, (r75 & 8) != 0 ? r3.resource : null, (r75 & 16) != 0 ? r3.frustration : null, (r75 & 32) != 0 ? r3.inForegroundPeriods : null, (r75 & 64) != 0 ? r3.memoryAverage : null, (r75 & 128) != 0 ? r3.memoryMax : null, (r75 & 256) != 0 ? r3.cpuTicksCount : null, (r75 & 512) != 0 ? r3.cpuTicksPerSecond : null, (r75 & 1024) != 0 ? r3.refreshRateAverage : null, (r75 & 2048) != 0 ? r3.refreshRateMin : null, (r75 & 4096) != 0 ? r3.slowFramesRate : null, (r75 & 8192) != 0 ? r3.freezeRate : null, (r75 & 16384) != 0 ? r3.flutterBuildTime : null, (r75 & 32768) != 0 ? r3.flutterRasterTime : null, (r75 & 65536) != 0 ? r3.jsRefreshRate : null, (r75 & 131072) != 0 ? r3.performance : null, (r75 & 262144) != 0 ? viewEvent.getView().accessibility : null);
        copy2 = r3.copy((r22 & 1) != 0 ? r3.session : null, (r22 & 2) != 0 ? r3.configuration : null, (r22 & 4) != 0 ? r3.browserSdkVersion : null, (r22 & 8) != 0 ? r3.sdkName : null, (r22 & 16) != 0 ? r3.documentVersion : 1 + viewEvent.getDd().getDocumentVersion(), (r22 & 32) != 0 ? r3.pageStates : null, (r22 & 64) != 0 ? r3.replayStats : null, (r22 & 128) != 0 ? r3.cls : null, (r22 & 256) != 0 ? viewEvent.getDd().profiling : null);
        copy3 = viewEvent.copy((r42 & 1) != 0 ? viewEvent.date : 0L, (r42 & 2) != 0 ? viewEvent.application : null, (r42 & 4) != 0 ? viewEvent.service : null, (r42 & 8) != 0 ? viewEvent.version : null, (r42 & 16) != 0 ? viewEvent.buildVersion : null, (r42 & 32) != 0 ? viewEvent.buildId : null, (r42 & 64) != 0 ? viewEvent.ddtags : null, (r42 & 128) != 0 ? viewEvent.session : null, (r42 & 256) != 0 ? viewEvent.source : null, (r42 & 512) != 0 ? viewEvent.view : copy, (r42 & 1024) != 0 ? viewEvent.usr : null, (r42 & 2048) != 0 ? viewEvent.account : null, (r42 & 4096) != 0 ? viewEvent.connectivity : null, (r42 & 8192) != 0 ? viewEvent.display : null, (r42 & 16384) != 0 ? viewEvent.synthetics : null, (r42 & 32768) != 0 ? viewEvent.ciTest : null, (r42 & 65536) != 0 ? viewEvent.os : null, (r42 & 131072) != 0 ? viewEvent.device : null, (r42 & 262144) != 0 ? viewEvent.dd : copy2, (r42 & 524288) != 0 ? viewEvent.context : null, (r42 & 1048576) != 0 ? viewEvent.container : null, (r42 & 2097152) != 0 ? viewEvent.featureFlags : null, (r42 & 4194304) != 0 ? viewEvent.privacy : null);
        return copy3;
    }
}
