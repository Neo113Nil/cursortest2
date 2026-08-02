package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u0015\u00107\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b-\u00106"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataOkHttpUploader;", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lokhttp3/Call$Factory;", "callFactory", "", "sdkVersion", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "androidInfoProvider", "Lcom/datadog/android/internal/profiler/ExecutionTimer;", "executionTimer", "<init>", "(Lcom/datadog/android/api/net/RequestFactory;Lcom/datadog/android/api/InternalLogger;Lokhttp3/Call$Factory;Ljava/lang/String;Lcom/datadog/android/core/internal/system/AndroidInfoProvider;Lcom/datadog/android/internal/profiler/ExecutionTimer;)V", "Lcom/datadog/android/api/context/DatadogContext;", "context", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "", "batchMeta", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "upload", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/util/List;[BLcom/datadog/android/core/internal/persistence/BatchId;)Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "getAndroidInfoProvider", "()Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Call$Factory;", "getCallFactory", "()Lokhttp3/Call$Factory;", "Lcom/datadog/android/internal/profiler/ExecutionTimer;", "getExecutionTimer", "()Lcom/datadog/android/internal/profiler/ExecutionTimer;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/core/internal/persistence/BatchId;", "Lcom/datadog/android/api/net/RequestFactory;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "Ljava/lang/String;", "getSdkVersion", "()Ljava/lang/String;", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataOkHttpUploader implements com.datadog.android.core.internal.data.upload.DataUploader {
    public static final java.lang.String HEADER_USER_AGENT = "User-Agent";
    public static final int HTTP_ACCEPTED = 202;
    public static final int HTTP_BAD_GATEWAY = 502;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_CLIENT_TIMEOUT = 408;
    public static final int HTTP_ENTITY_TOO_LARGE = 413;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_GATEWAY_TIMEOUT = 504;
    public static final int HTTP_INSUFFICIENT_STORAGE = 507;
    public static final int HTTP_INTERNAL_ERROR = 500;
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final int HTTP_UNAVAILABLE = 503;
    public static final java.lang.String SYSTEM_UA = "http.agent";
    public static final java.lang.String WARNING_USER_AGENT_HEADER_RESERVED = "Ignoring provided User-Agent header, because it is reserved.";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile int getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.core.internal.system.AndroidInfoProvider androidInfoProvider;
    private final okhttp3.Call.Factory callFactory;
    private final com.datadog.android.internal.profiler.ExecutionTimer executionTimer;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile com.datadog.android.core.internal.data.upload.UploadStatus getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;
    private volatile com.datadog.android.core.internal.persistence.BatchId getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final com.datadog.android.api.net.RequestFactory requestFactory;
    private final java.lang.String sdkVersion;

    public DataOkHttpUploader(com.datadog.android.api.net.RequestFactory requestFactory, com.datadog.android.api.InternalLogger internalLogger, okhttp3.Call.Factory factory, java.lang.String str, com.datadog.android.core.internal.system.AndroidInfoProvider androidInfoProvider, com.datadog.android.internal.profiler.ExecutionTimer executionTimer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidInfoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionTimer, "");
        this.requestFactory = requestFactory;
        this.internalLogger = internalLogger;
        this.callFactory = factory;
        this.sdkVersion = str;
        this.androidInfoProvider = androidInfoProvider;
        this.executionTimer = executionTimer;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$userAgent$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String access$sanitizeHeaderValue = com.datadog.android.core.internal.data.upload.DataOkHttpUploader.access$sanitizeHeaderValue(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.this, java.lang.System.getProperty(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.SYSTEM_UA));
                com.datadog.android.core.internal.data.upload.DataOkHttpUploader dataOkHttpUploader = com.datadog.android.core.internal.data.upload.DataOkHttpUploader.this;
                if (kotlin.text.StringsKt.isBlank(access$sanitizeHeaderValue)) {
                    java.lang.String sdkVersion = dataOkHttpUploader.getSdkVersion();
                    java.lang.String osVersion = dataOkHttpUploader.getAndroidInfoProvider().getOsVersion();
                    java.lang.String deviceModel = dataOkHttpUploader.getAndroidInfoProvider().getDeviceModel();
                    java.lang.String deviceBuildId = dataOkHttpUploader.getAndroidInfoProvider().getDeviceBuildId();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Datadog/");
                    sb.append(sdkVersion);
                    sb.append(" (Linux; U; Android ");
                    sb.append(osVersion);
                    sb.append("; ");
                    sb.append(deviceModel);
                    sb.append(" Build/");
                    sb.append(deviceBuildId);
                    sb.append(")");
                    access$sanitizeHeaderValue = sb.toString();
                }
                return access$sanitizeHeaderValue;
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ java.lang.String access$sanitizeHeaderValue(com.datadog.android.core.internal.data.upload.DataOkHttpUploader dataOkHttpUploader, java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            java.lang.String str3 = str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = str3.length();
            for (int i = 0; i < length; i++) {
                char charAt = str3.charAt(i);
                if (charAt == '\t' || (' ' <= charAt && charAt < 127)) {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public final com.datadog.android.api.net.RequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final okhttp3.Call.Factory getCallFactory() {
        return this.callFactory;
    }

    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    public final com.datadog.android.core.internal.system.AndroidInfoProvider getAndroidInfoProvider() {
        return this.androidInfoProvider;
    }

    public final com.datadog.android.internal.profiler.ExecutionTimer getExecutionTimer() {
        return this.executionTimer;
    }

    public static final /* synthetic */ com.datadog.android.core.internal.data.upload.UploadStatus access$executeUploadRequest(com.datadog.android.core.internal.data.upload.DataOkHttpUploader dataOkHttpUploader, final com.datadog.android.api.net.Request request) {
        java.lang.Object obj;
        int i;
        java.util.Iterator<T> it = request.getHeaders().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals((java.lang.String) ((java.util.Map.Entry) obj).getKey(), "DD-API-KEY", true)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.String str = entry != null ? (java.lang.String) entry.getValue() : null;
        if (str != null) {
            java.lang.String str2 = str;
            if (str2.length() != 0) {
                for (0; i < str2.length(); i + 1) {
                    char charAt = str2.charAt(i);
                    i = (charAt == '\t' || (' ' <= charAt && charAt < 127)) ? i + 1 : 0;
                }
            }
            return new com.datadog.android.core.internal.data.upload.UploadStatus.InvalidTokenError(0);
        }
        okhttp3.Request.Builder post = new okhttp3.Request.Builder().url(request.getUrl()).post(okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, request.getBody(), request.getContentType() != null ? okhttp3.MediaType.INSTANCE.parse(request.getContentType()) : null, 0, 0, 6, (java.lang.Object) null));
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : request.getHeaders().entrySet()) {
            java.lang.String key = entry2.getKey();
            java.lang.String value = entry2.getValue();
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = key.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "user-agent")) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(dataOkHttpUploader.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$buildOkHttpRequest$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.core.internal.data.upload.DataOkHttpUploader.WARNING_USER_AGENT_HEADER_RESERVED;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            } else {
                post.addHeader(key, value);
            }
        }
        post.addHeader("User-Agent", (java.lang.String) dataOkHttpUploader.getHighSpeedVideoSizes.getValue());
        okhttp3.Request build = post.build();
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentThread, "");
        android.net.TrafficStats.setThreadStatsTag((int) com.datadog.android.internal.utils.ThreadExtKt.safeGetThreadId(currentThread));
        okhttp3.Response execute = dataOkHttpUploader.callFactory.newCall(build).execute();
        execute.close();
        final int code = execute.code();
        if (code == 202) {
            return new com.datadog.android.core.internal.data.upload.UploadStatus.Success(code);
        }
        if (code != 403) {
            if (code != 408) {
                if (code != 413) {
                    if (code != 429) {
                        if (code != 500 && code != 507) {
                            if (code != 400) {
                                if (code != 401) {
                                    switch (code) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(dataOkHttpUploader.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$responseCodeToUploadStatus$1
                                                @Override // kotlin.jvm.functions.Function0
                                                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                                                public final java.lang.String invoke() {
                                                    int i2 = code;
                                                    java.lang.String description = request.getDescription();
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected status code ");
                                                    sb.append(i2);
                                                    sb.append(" on upload request: ");
                                                    sb.append(description);
                                                    return sb.toString();
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }
                                            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                                            return new com.datadog.android.core.internal.data.upload.UploadStatus.UnknownHttpError(code);
                                    }
                                }
                            }
                        }
                        return new com.datadog.android.core.internal.data.upload.UploadStatus.HttpServerError(code);
                    }
                }
                return new com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientError(code);
            }
            return new com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientRateLimiting(code);
        }
        return new com.datadog.android.core.internal.data.upload.UploadStatus.InvalidTokenError(code);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:12:0x0036, B:14:0x003e), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    @Override // com.datadog.android.core.internal.data.upload.DataUploader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.datadog.android.core.internal.data.upload.UploadStatus upload(final com.datadog.android.api.context.DatadogContext context, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batch, byte[] batchMeta, com.datadog.android.core.internal.persistence.BatchId batchId) {
        java.lang.Integer num;
        final com.datadog.android.api.net.Request create;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batch, "");
        try {
            if (batchId != null && this.getHighSpeedVideoFpsRangesFor != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, batchId)) {
                this.getHighResolutionOutputSizeshNQ4ISI++;
                com.datadog.android.core.internal.data.upload.UploadStatus uploadStatus = this.getHighSpeedVideoFpsRanges;
                if (uploadStatus != null) {
                    num = java.lang.Integer.valueOf(uploadStatus.getCode());
                    this.getHighSpeedVideoFpsRangesFor = batchId;
                    com.datadog.android.api.net.RequestExecutionContext requestExecutionContext = new com.datadog.android.api.net.RequestExecutionContext(this.getHighResolutionOutputSizeshNQ4ISI, num);
                    create = this.requestFactory.create(context, requestExecutionContext, batch, batchMeta);
                    if (create != null) {
                        return new com.datadog.android.core.internal.data.upload.UploadStatus.RequestCreationError(null);
                    }
                    com.datadog.android.core.internal.data.upload.UploadStatus uploadStatus2 = (com.datadog.android.core.internal.data.upload.UploadStatus) this.executionTimer.measure(new kotlin.jvm.functions.Function0<com.datadog.android.core.internal.data.upload.UploadStatus>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final com.datadog.android.core.internal.data.upload.UploadStatus invoke() {
                            try {
                                return com.datadog.android.core.internal.data.upload.DataOkHttpUploader.access$executeUploadRequest(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.this, create);
                            } catch (java.net.UnknownHostException e) {
                                com.datadog.android.api.InternalLogger internalLogger = com.datadog.android.core.internal.data.upload.DataOkHttpUploader.this.getInternalLogger();
                                com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.ERROR;
                                com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.USER;
                                final com.datadog.android.api.context.DatadogContext datadogContext = context;
                                java.net.UnknownHostException unknownHostException = e;
                                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, level, target, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$1.1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                                    public final java.lang.String invoke() {
                                        com.datadog.android.DatadogSite site = com.datadog.android.api.context.DatadogContext.this.getSite();
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find host for site ");
                                        sb.append(site);
                                        sb.append("; we will retry later.");
                                        return sb.toString();
                                    }

                                    {
                                        super(0);
                                    }
                                }, (java.lang.Throwable) unknownHostException, false, (java.util.Map) null, 48, (java.lang.Object) null);
                                return new com.datadog.android.core.internal.data.upload.UploadStatus.DNSError(unknownHostException);
                            } catch (java.io.IOException e2) {
                                java.io.IOException iOException = e2;
                                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.this.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$1.2
                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                    public final java.lang.String invoke() {
                                        return "Unable to execute the request; we will retry later.";
                                    }
                                }, (java.lang.Throwable) iOException, false, (java.util.Map) null, 48, (java.lang.Object) null);
                                return new com.datadog.android.core.internal.data.upload.UploadStatus.NetworkError(iOException);
                            } catch (java.lang.Throwable th) {
                                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.this.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$1.3
                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                                    public final java.lang.String invoke() {
                                        return "Unable to execute the request; we will retry later.";
                                    }
                                }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
                                return new com.datadog.android.core.internal.data.upload.UploadStatus.UnknownException(th);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    });
                    uploadStatus2.logStatus(create.getDescription(), create.getBody().length, this.internalLogger, requestExecutionContext.getAttemptNumber(), create.getId());
                    this.getHighSpeedVideoFpsRanges = uploadStatus2;
                    return uploadStatus2;
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            }
            create = this.requestFactory.create(context, requestExecutionContext, batch, batchMeta);
            if (create != null) {
            }
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$request$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to create the request, probably due to bad data format. The batch will be dropped.";
                }
            }, (java.lang.Throwable) exc, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return new com.datadog.android.core.internal.data.upload.UploadStatus.RequestCreationError(exc);
        }
        num = null;
        this.getHighSpeedVideoFpsRangesFor = batchId;
        com.datadog.android.api.net.RequestExecutionContext requestExecutionContext2 = new com.datadog.android.api.net.RequestExecutionContext(this.getHighResolutionOutputSizeshNQ4ISI, num);
    }
}
