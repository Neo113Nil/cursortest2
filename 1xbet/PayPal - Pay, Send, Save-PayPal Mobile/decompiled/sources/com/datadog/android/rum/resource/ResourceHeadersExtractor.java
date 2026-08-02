package com.datadog.android.rum.resource;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B%\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/resource/ResourceHeadersExtractor;", "", "", "", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "Lcom/datadog/android/api/InternalLogger;", "p2", "Camera2StreamConfigurationMap", "(Ljava/util/Map;Ljava/util/List;Lcom/datadog/android/api/InternalLogger;)Ljava/util/Map;", "headers", "internalLogger", "extractRequestHeaders$dd_sdk_android_rum_release", "(Ljava/util/Map;Lcom/datadog/android/api/InternalLogger;)Ljava/util/Map;", "extractResponseHeaders$dd_sdk_android_rum_release", "requestHeaders", "Ljava/util/List;", "getRequestHeaders$dd_sdk_android_rum_release", "()Ljava/util/List;", "responseHeaders", "getResponseHeaders$dd_sdk_android_rum_release", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourceHeadersExtractor {
    public static final int HEADER_SIZE_LIMIT_BYTES = 2048;
    public static final int MAX_HEADERS_COUNT = 100;
    public static final int MAX_HEADER_VALUE_BYTES = 128;
    public static final java.lang.String NO_HEADERS_WARNING = "ResourceHeadersExtractor was built with no headers to capture. Did you mean to use includeDefaults = true or call captureHeaders()?";
    public static final java.lang.String SENSITIVE_HEADER_WARNING = "The following headers were requested but match the security pattern and will not be captured: %s. See ResourceHeadersExtractor.SECURITY_PATTERN for details.";
    private final java.util.List<java.lang.String> requestHeaders;
    private final java.util.List<java.lang.String> responseHeaders;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.resource.ResourceHeadersExtractor.Companion INSTANCE = new com.datadog.android.rum.resource.ResourceHeadersExtractor.Companion(null);
    private static final java.util.List<java.lang.String> DEFAULT_REQUEST_HEADERS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cache-control", "content-type"});
    private static final java.util.List<java.lang.String> DEFAULT_RESPONSE_HEADERS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cache-control", "etag", "age", "expires", "content-type", "content-encoding", "vary", "content-length", "server-timing", "x-cache"});
    private static final kotlin.text.Regex SECURITY_PATTERN = new kotlin.text.Regex("(token|cookie|secret|authorization|password|credential|bearer|(api|secret|access|app).?key|forwarded|real.?ip|connecting.?ip|client.?ip)", kotlin.text.RegexOption.IGNORE_CASE);

    private ResourceHeadersExtractor(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.requestHeaders = list;
        this.responseHeaders = list2;
    }

    public final java.util.List<java.lang.String> getRequestHeaders$dd_sdk_android_rum_release() {
        return this.requestHeaders;
    }

    public final java.util.List<java.lang.String> getResponseHeaders$dd_sdk_android_rum_release() {
        return this.responseHeaders;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/resource/ResourceHeadersExtractor$Builder;", "", "", "includeDefaults", "<init>", "(Z)V", "Lcom/datadog/android/rum/resource/ResourceHeadersExtractor;", "build", "()Lcom/datadog/android/rum/resource/ResourceHeadersExtractor;", "", "", "headers", "captureHeaders", "([Ljava/lang/String;)Lcom/datadog/android/rum/resource/ResourceHeadersExtractor$Builder;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
        private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoFpsRangesFor;

        public Builder(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        }

        public /* synthetic */ Builder(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final com.datadog.android.rum.resource.ResourceHeadersExtractor.Builder captureHeaders(java.lang.String... headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            java.util.List<java.lang.String> list = this.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList(headers.length);
            for (java.lang.String str : headers) {
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                arrayList.add(lowerCase);
            }
            list.addAll(arrayList);
            return this;
        }

        public final com.datadog.android.rum.resource.ResourceHeadersExtractor build() {
            java.util.List distinct;
            java.util.List distinct2;
            java.util.List<java.lang.String> list = this.getHighSpeedVideoFpsRanges;
            kotlin.text.Regex security_pattern = com.datadog.android.rum.resource.ResourceHeadersExtractor.INSTANCE.getSECURITY_PATTERN();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (security_pattern.containsMatchIn((java.lang.CharSequence) obj)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
            final java.util.List list2 = (java.util.List) pair.component1();
            java.util.List list3 = (java.util.List) pair.component2();
            if (!list2.isEmpty()) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.resource.ResourceHeadersExtractor$Builder$build$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.resource.ResourceHeadersExtractor.SENSITIVE_HEADER_WARNING, java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.collections.CollectionsKt.joinToString$default(list2, ", ", null, null, 0, null, null, 62, null)}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                distinct = kotlin.collections.CollectionsKt.distinct(kotlin.collections.CollectionsKt.plus((java.util.Collection) com.datadog.android.rum.resource.ResourceHeadersExtractor.INSTANCE.getDEFAULT_REQUEST_HEADERS(), (java.lang.Iterable) list3));
            } else {
                distinct = kotlin.collections.CollectionsKt.distinct(list3);
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                distinct2 = kotlin.collections.CollectionsKt.distinct(kotlin.collections.CollectionsKt.plus((java.util.Collection) com.datadog.android.rum.resource.ResourceHeadersExtractor.INSTANCE.getDEFAULT_RESPONSE_HEADERS(), (java.lang.Iterable) list3));
            } else {
                distinct2 = kotlin.collections.CollectionsKt.distinct(list3);
            }
            if (distinct.isEmpty() && distinct2.isEmpty()) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.resource.ResourceHeadersExtractor$Builder$build$3
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.resource.ResourceHeadersExtractor.NO_HEADERS_WARNING;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            return new com.datadog.android.rum.resource.ResourceHeadersExtractor(distinct, distinct2, null);
        }

        public Builder() {
            this(false, 1, null);
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> extractRequestHeaders$dd_sdk_android_rum_release(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return Camera2StreamConfigurationMap(headers, this.requestHeaders, internalLogger);
    }

    public final java.util.Map<java.lang.String, java.lang.String> extractResponseHeaders$dd_sdk_android_rum_release(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return Camera2StreamConfigurationMap(headers, this.responseHeaders, internalLogger);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/resource/ResourceHeadersExtractor$Companion;", "", "<init>", "()V", "", "", "DEFAULT_REQUEST_HEADERS", "Ljava/util/List;", "getDEFAULT_REQUEST_HEADERS", "()Ljava/util/List;", "DEFAULT_RESPONSE_HEADERS", "getDEFAULT_RESPONSE_HEADERS", "", "HEADER_SIZE_LIMIT_BYTES", com.visa.cbp.getEncExpo.warmup, "MAX_HEADERS_COUNT", "MAX_HEADER_VALUE_BYTES", "NO_HEADERS_WARNING", "Ljava/lang/String;", "Lkotlin/text/Regex;", "SECURITY_PATTERN", "Lkotlin/text/Regex;", "getSECURITY_PATTERN", "()Lkotlin/text/Regex;", "SENSITIVE_HEADER_WARNING"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<java.lang.String> getDEFAULT_REQUEST_HEADERS() {
            return com.datadog.android.rum.resource.ResourceHeadersExtractor.DEFAULT_REQUEST_HEADERS;
        }

        public final java.util.List<java.lang.String> getDEFAULT_RESPONSE_HEADERS() {
            return com.datadog.android.rum.resource.ResourceHeadersExtractor.DEFAULT_RESPONSE_HEADERS;
        }

        public final kotlin.text.Regex getSECURITY_PATTERN() {
            return com.datadog.android.rum.resource.ResourceHeadersExtractor.SECURITY_PATTERN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> p0, java.util.List<java.lang.String> p1, com.datadog.android.api.InternalLogger p2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(p0.size()));
        java.util.Iterator<T> it = p0.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        int i = 0;
        for (final java.lang.String str2 : p1) {
            if (linkedHashMap2.size() >= 100) {
                break;
            }
            java.util.List list = (java.util.List) linkedHashMap.get(str2);
            if (list != null) {
                kotlin.Pair truncateToUtf8ByteSize$default = com.datadog.android.rum.internal.utils.StringExtKt.truncateToUtf8ByteSize$default(kotlin.collections.CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null), 128, null, 2, null);
                java.lang.String str3 = (java.lang.String) truncateToUtf8ByteSize$default.component1();
                int length = str2.length() + 1 + ((java.lang.Number) truncateToUtf8ByteSize$default.component2()).intValue() + i;
                if (length > 2048) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(p2, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.resource.ResourceHeadersExtractor$extractHeaders$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String str4 = str2;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping header '");
                            sb.append(str4);
                            sb.append("': adding it would exceed the 2048 byte limit.");
                            return sb.toString();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                } else {
                    linkedHashMap2.put(str2, str3);
                    i = length;
                }
            }
        }
        return linkedHashMap2;
    }

    public /* synthetic */ ResourceHeadersExtractor(java.util.List list, java.util.List list2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2);
    }
}
