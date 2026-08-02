package com.datadog.android.okhttp;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001GB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\fJ\u001f\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ!\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u00105R\u0016\u00107\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00108R\u0016\u0010:\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u00106\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u00104\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00108R\u0016\u0010;\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00108R\u0016\u0010<\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010=\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0016\u0010?\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010>\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u00108R\u0016\u0010F\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u00108"}, d2 = {"Lcom/datadog/android/okhttp/DatadogEventListener;", "Lokhttp3/EventListener;", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lcom/datadog/android/rum/resource/ResourceId;", "key", "<init>", "(Lcom/datadog/android/api/SdkCore;Lcom/datadog/android/rum/resource/ResourceId;)V", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "callEnd", "(Lokhttp3/Call;)V", "Ljava/io/IOException;", "ioe", "callFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "callStart", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "", "domainName", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "", "byteCount", "responseBodyEnd", "(Lokhttp3/Call;J)V", "responseBodyStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseHeadersStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "secureConnectStart", "getHighSpeedVideoFpsRangesFor", "()V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getInputFormats", "getInputSizeshNQ4ISI", "getOutputFormats", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/resource/ResourceId;", "getKey$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/rum/resource/ResourceId;", "Lcom/datadog/android/api/SdkCore;", "getSdkCore$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/api/SdkCore;", "getOutputStallDurationlomOqCM", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogEventListener extends okhttp3.EventListener {
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private long getOutputMinFrameDuration;
    private long getInputFormats;
    private long getInputSizeshNQ4ISI;
    private long getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getHighSpeedVideoSizesFor;
    private long getOutputStallDurationlomOqCM;
    private final com.datadog.android.rum.resource.ResourceId key;
    private final com.datadog.android.api.SdkCore sdkCore;

    /* renamed from: getSdkCore$dd_sdk_android_okhttp_release, reason: from getter */
    public final com.datadog.android.api.SdkCore getSdkCore() {
        return this.sdkCore;
    }

    /* renamed from: getKey$dd_sdk_android_okhttp_release, reason: from getter */
    public final com.datadog.android.rum.resource.ResourceId getKey() {
        return this.key;
    }

    public DatadogEventListener(com.datadog.android.api.SdkCore sdkCore, com.datadog.android.rum.resource.ResourceId resourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        this.sdkCore = sdkCore;
        this.key = resourceId;
    }

    @Override // okhttp3.EventListener
    public final void callStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.callStart(call);
        getHighResolutionOutputSizeshNQ4ISI();
        this.Camera2StreamConfigurationMap = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(okhttp3.Call call, java.lang.String domainName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "");
        super.dnsStart(call, domainName);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getInputSizeshNQ4ISI = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(okhttp3.Call call, java.lang.String domainName, java.util.List<? extends java.net.InetAddress> inetAddressList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetAddressList, "");
        super.dnsEnd(call, domainName, inetAddressList);
        this.getInputFormats = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void connectStart(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        super.connectStart(call, inetSocketAddress, proxy);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoFpsRangesFor = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        this.getHighResolutionOutputSizeshNQ4ISI = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.secureConnectStart(call);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getOutputStallDurationlomOqCM = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(okhttp3.Call call, okhttp3.Handshake handshake) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.secureConnectEnd(call, handshake);
        this.getOutputMinFrameDuration = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.responseHeadersStart(call);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizesFor = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        super.responseHeadersEnd(call, response);
        this.getOutputFormats = this.sdkCore.getTime().getDeviceTimeNs();
        if (response.code() >= 400) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.responseBodyStart(call);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.responseBodyEnd(call, byteCount);
        this.getHighSpeedVideoFpsRanges = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public final void callEnd(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        super.callEnd(call);
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // okhttp3.EventListener
    public final void callFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
        super.callFailed(call, ioe);
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(this.sdkCore);
        com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.waitForResourceTiming(this.key);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/okhttp/DatadogEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "", "sdkInstanceName", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;", "Lcom/datadog/android/core/SdkReference;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/SdkReference;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory implements okhttp3.EventListener.Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.okhttp.DatadogEventListener.Factory.Companion INSTANCE = new com.datadog.android.okhttp.DatadogEventListener.Factory.Companion(null);
        private static final okhttp3.EventListener NO_OP_EVENT_LISTENER = new okhttp3.EventListener() { // from class: com.datadog.android.okhttp.DatadogEventListener$Factory$Companion$NO_OP_EVENT_LISTENER$1
        };

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.datadog.android.core.SdkReference getHighSpeedVideoSizes;

        public Factory(java.lang.String str) {
            this.getHighSpeedVideoSizes = new com.datadog.android.core.SdkReference(str, null, 2, null);
        }

        public /* synthetic */ Factory(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // okhttp3.EventListener.Factory
        public final okhttp3.EventListener create(final okhttp3.Call call) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
            com.datadog.android.rum.resource.ResourceId buildResourceId = com.datadog.android.okhttp.internal.OkHttpRequestInfoKt.buildResourceId(call.getGetHighSpeedVideoSizes(), false);
            com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoSizes.get();
            if (sdkCore != null) {
                return new com.datadog.android.okhttp.DatadogEventListener(sdkCore, buildResourceId);
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.okhttp.DatadogEventListener$Factory$create$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    okhttp3.HttpUrl url = okhttp3.Call.this.getGetHighSpeedVideoSizes().url();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No SDK instance is available, skipping tracking timing information of request with url ");
                    sb.append(url);
                    sb.append(".");
                    return sb.toString();
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return NO_OP_EVENT_LISTENER;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/okhttp/DatadogEventListener$Factory$Companion;", "", "<init>", "()V", "Lokhttp3/EventListener;", "NO_OP_EVENT_LISTENER", "Lokhttp3/EventListener;", "getNO_OP_EVENT_LISTENER", "()Lokhttp3/EventListener;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final okhttp3.EventListener getNO_OP_EVENT_LISTENER() {
                return com.datadog.android.okhttp.DatadogEventListener.Factory.NO_OP_EVENT_LISTENER;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        kotlin.Pair pair;
        kotlin.Pair pair2;
        long j;
        kotlin.Pair pair3;
        long j2;
        kotlin.Pair pair4;
        kotlin.Pair pair5;
        long j3 = this.getInputSizeshNQ4ISI;
        if (j3 == 0) {
            pair = kotlin.TuplesKt.to(0L, 0L);
        } else {
            pair = kotlin.TuplesKt.to(java.lang.Long.valueOf(j3 - this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getInputFormats - this.getInputSizeshNQ4ISI));
        }
        long longValue = ((java.lang.Number) pair.component1()).longValue();
        long longValue2 = ((java.lang.Number) pair.component2()).longValue();
        long j4 = this.getHighSpeedVideoFpsRangesFor;
        if (j4 == 0) {
            pair2 = kotlin.TuplesKt.to(0L, 0L);
        } else {
            pair2 = kotlin.TuplesKt.to(java.lang.Long.valueOf(j4 - this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI - this.getHighSpeedVideoFpsRangesFor));
        }
        long longValue3 = ((java.lang.Number) pair2.component1()).longValue();
        long longValue4 = ((java.lang.Number) pair2.component2()).longValue();
        long j5 = this.getOutputStallDurationlomOqCM;
        if (j5 == 0) {
            pair3 = kotlin.TuplesKt.to(0L, 0L);
            j = longValue4;
        } else {
            j = longValue4;
            pair3 = kotlin.TuplesKt.to(java.lang.Long.valueOf(j5 - this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getOutputMinFrameDuration - this.getOutputStallDurationlomOqCM));
        }
        long longValue5 = ((java.lang.Number) pair3.component1()).longValue();
        long longValue6 = ((java.lang.Number) pair3.component2()).longValue();
        long j6 = this.getHighSpeedVideoSizesFor;
        if (j6 == 0) {
            pair4 = kotlin.TuplesKt.to(0L, 0L);
            j2 = longValue5;
        } else {
            j2 = longValue5;
            pair4 = kotlin.TuplesKt.to(java.lang.Long.valueOf(j6 - this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getOutputFormats - this.getHighSpeedVideoSizesFor));
        }
        long longValue7 = ((java.lang.Number) pair4.component1()).longValue();
        long longValue8 = ((java.lang.Number) pair4.component2()).longValue();
        long j7 = this.getHighSpeedVideoSizes;
        if (j7 == 0) {
            pair5 = kotlin.TuplesKt.to(0L, 0L);
        } else {
            pair5 = kotlin.TuplesKt.to(java.lang.Long.valueOf(j7 - this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges - this.getHighSpeedVideoSizes));
        }
        com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming = new com.datadog.android.rum.internal.domain.event.ResourceTiming(longValue, longValue2, longValue3, j, j2, longValue6, longValue7, longValue8, ((java.lang.Number) pair5.component1()).longValue(), ((java.lang.Number) pair5.component2()).longValue());
        com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(this.sdkCore);
        com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.addResourceTiming(this.key, resourceTiming);
        }
    }
}
