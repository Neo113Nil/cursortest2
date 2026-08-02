package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 )2\u00020\u0001:\u0002*)BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u0011\u0010(\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b'\u0010\u0019"}, d2 = {"Lcom/izettle/android/net/HttpUrl;", "", "", "p0", "p1", "", "p2", "", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/izettle/android/net/HttpUrl$Builder;", "newBuilder", "()Lcom/izettle/android/net/HttpUrl$Builder;", com.datadog.android.log.LogAttributes.HOST, "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "pathSegments", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "port", com.visa.cbp.getEncExpo.warmup, "getPort", "queryParams", "Ljava/util/Map;", "getQueryParams", "()Ljava/util/Map;", "scheme", "getScheme", "getUrl", "url", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HttpUrl {
    private final java.lang.String host;
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.Map<java.lang.String, java.lang.String> queryParams;
    private final java.lang.String scheme;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.net.HttpUrl.Companion INSTANCE = new com.izettle.android.net.HttpUrl.Companion(null);
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex(":[0-9]+");
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("[^=]+=[^=]+");

    private HttpUrl(java.lang.String str, java.lang.String str2, int i, java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map) {
        this.scheme = str;
        this.host = str2;
        this.port = i;
        this.pathSegments = list;
        this.queryParams = map;
    }

    public final java.lang.String getScheme() {
        return this.scheme;
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    public final int getPort() {
        return this.port;
    }

    public final java.util.List<java.lang.String> getPathSegments() {
        return this.pathSegments;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getQueryParams() {
        return this.queryParams;
    }

    public final java.lang.String getUrl() {
        java.lang.String str = this.scheme;
        java.lang.String str2 = this.host;
        int i = this.port;
        java.lang.String concat = i == 80 ? "" : io.ktor.sse.ServerSentEventKt.COLON.concat(java.lang.String.valueOf(i));
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(this.pathSegments, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, null, 0, null, null, 60, null);
        java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(this.queryParams.entrySet(), "&", this.queryParams.isEmpty() ? "" : com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, null, 0, null, new kotlin.jvm.functions.Function1<java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.String>, java.lang.CharSequence>() { // from class: com.izettle.android.net.HttpUrl$queryString$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence invoke(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                java.lang.String urlEncode = com.izettle.android.net.ExtensionsKt.urlEncode(key);
                java.lang.String urlEncode2 = com.izettle.android.net.ExtensionsKt.urlEncode(value);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(urlEncode);
                sb.append("=");
                sb.append(urlEncode2);
                return sb.toString();
            }
        }, 28, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("://");
        sb.append(str2);
        sb.append(concat);
        sb.append(joinToString$default);
        sb.append(joinToString$default2);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.izettle.android.net.HttpUrl httpUrl = (com.izettle.android.net.HttpUrl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, httpUrl.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(this.host, httpUrl.host) && this.port == httpUrl.port && kotlin.jvm.internal.Intrinsics.areEqual(this.pathSegments, httpUrl.pathSegments) && kotlin.jvm.internal.Intrinsics.areEqual(this.queryParams, httpUrl.queryParams);
    }

    public final int hashCode() {
        java.lang.String str = this.scheme;
        java.lang.String str2 = this.host;
        int i = this.port;
        return java.util.Objects.hash(str, str2, java.lang.Integer.valueOf(i), this.pathSegments, this.queryParams);
    }

    public final com.izettle.android.net.HttpUrl.Builder newBuilder() {
        return new com.izettle.android.net.HttpUrl.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000e\"\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0'j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001d"}, d2 = {"Lcom/izettle/android/net/HttpUrl$Builder;", "", "Lcom/izettle/android/net/HttpUrl;", "httpUrl", "<init>", "(Lcom/izettle/android/net/HttpUrl;)V", "()V", "build", "()Lcom/izettle/android/net/HttpUrl;", "", com.datadog.android.log.LogAttributes.HOST, "(Ljava/lang/String;)Lcom/izettle/android/net/HttpUrl$Builder;", "url", "parse$net", "", "pathSegments", "([Ljava/lang/String;)Lcom/izettle/android/net/HttpUrl$Builder;", "", "port", "(I)Lcom/izettle/android/net/HttpUrl$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "queryParam", "(Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/net/HttpUrl$Builder;", "scheme", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Camera2StreamConfigurationMap", "Ljava/lang/Integer;", "getPort", "()Ljava/lang/Integer;", "setPort", "(Ljava/lang/Integer;)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "getHighSpeedVideoFpsRanges", "Ljava/util/LinkedHashMap;", "getHighSpeedVideoFpsRangesFor", "getScheme", "setScheme"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.LinkedHashMap<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
        private java.lang.String host;
        private java.lang.Integer port;
        private java.lang.String scheme;

        public Builder() {
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap<>();
        }

        public final java.lang.String getScheme() {
            return this.scheme;
        }

        public final void setScheme(java.lang.String str) {
            this.scheme = str;
        }

        public final java.lang.Integer getPort() {
            return this.port;
        }

        public final void setPort(java.lang.Integer num) {
            this.port = num;
        }

        public final java.lang.String getHost() {
            return this.host;
        }

        public final void setHost(java.lang.String str) {
            this.host = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.izettle.android.net.HttpUrl httpUrl) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
            this.scheme = httpUrl.getScheme();
            this.port = java.lang.Integer.valueOf(httpUrl.getPort());
            this.host = httpUrl.getHost();
            this.getHighSpeedVideoFpsRangesFor.putAll(httpUrl.getQueryParams());
            this.Camera2StreamConfigurationMap.addAll(httpUrl.getPathSegments());
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.izettle.android.net.HttpUrl.Builder parse$net(java.lang.String url) {
            java.lang.String str;
            kotlin.ranges.IntRange range;
            java.lang.Integer num;
            java.lang.String value;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            java.lang.String obj = kotlin.text.StringsKt.trim(url).toString();
            if (kotlin.text.StringsKt.regionMatches(obj, 0, "http:", 0, 5, true)) {
                str = "http";
            } else {
                if (!kotlin.text.StringsKt.regionMatches(obj, 0, "https:", 0, 6, true)) {
                    throw new java.lang.IllegalArgumentException("Expected url to contain http: or https:");
                }
                str = "https";
            }
            this.scheme = str;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            java.lang.String substring = obj.substring(str.length() + 1, obj.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            if (!kotlin.text.StringsKt.regionMatches(substring, 0, "//", 0, 2, true)) {
                throw new java.lang.IllegalArgumentException("Expected // after scheme");
            }
            java.lang.String substring2 = substring.substring(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.lang.String str2 = substring2;
            java.lang.String str3 = null;
            if (kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str2, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
                throw new java.lang.IllegalArgumentException("Unexpected / encountered");
            }
            int length = str2.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (str2.charAt(i) == '/') {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = substring2.length();
            }
            java.lang.String substring3 = substring2.substring(0, i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
            this.host = substring3;
            if (substring3 != null) {
                kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(com.izettle.android.net.HttpUrl.Camera2StreamConfigurationMap, substring3, 0, 2, null);
                if (find$default != null && (value = find$default.getValue()) != null) {
                    java.lang.String substring4 = value.substring(1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "");
                    if (substring4 != null) {
                        num = java.lang.Integer.valueOf(java.lang.Integer.parseInt(substring4));
                        if (num != null) {
                            this.port = java.lang.Integer.valueOf(num.intValue());
                        }
                    }
                }
                num = null;
                if (num != null) {
                }
            }
            if (this.host != null && this.port != null) {
                kotlin.text.Regex regex = com.izettle.android.net.HttpUrl.Camera2StreamConfigurationMap;
                java.lang.String str4 = this.host;
                kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
                kotlin.text.MatchResult find$default2 = kotlin.text.Regex.find$default(regex, str4, 0, 2, null);
                if (find$default2 != null && (range = find$default2.getRange()) != null) {
                    int first = range.getFirst();
                    java.lang.String str5 = this.host;
                    if (str5 != null) {
                        str3 = str5.substring(0, first);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                    }
                    this.host = str3;
                }
            }
            java.lang.String substring5 = substring2.substring(i, substring2.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "");
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring5, new java.lang.String[]{com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() > 1) {
                substring5 = (java.lang.String) split$default.get(0);
                for (java.lang.String str6 : kotlin.text.StringsKt.split$default((java.lang.CharSequence) split$default.get(1), new java.lang.String[]{"&"}, false, 0, 6, (java.lang.Object) null)) {
                    java.lang.String str7 = str6;
                    if (!com.izettle.android.net.HttpUrl.getHighResolutionOutputSizeshNQ4ISI.matches(str7)) {
                        throw new java.lang.IllegalArgumentException("Invalid query parameter ".concat(java.lang.String.valueOf(str6)));
                    }
                    java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str7, new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
                    queryParam((java.lang.String) split$default2.get(0), (java.lang.String) split$default2.get(1));
                }
            }
            java.util.List split$default3 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring5, new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : split$default3) {
                if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(kotlin.text.StringsKt.trim((java.lang.String) it.next(), kotlinx.io.files.FileSystemKt.UnixPathSeparator));
            }
            this.Camera2StreamConfigurationMap.addAll(arrayList3);
            return this;
        }

        public final com.izettle.android.net.HttpUrl.Builder host(java.lang.String host) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
            this.host = host;
            return this;
        }

        public final com.izettle.android.net.HttpUrl.Builder port(int port) {
            this.port = java.lang.Integer.valueOf(port);
            return this;
        }

        public final com.izettle.android.net.HttpUrl.Builder scheme(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
            this.scheme = scheme;
            return this;
        }

        public final com.izettle.android.net.HttpUrl.Builder pathSegments(java.lang.String... pathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "");
            kotlin.collections.CollectionsKt.addAll(this.Camera2StreamConfigurationMap, pathSegments);
            return this;
        }

        public final com.izettle.android.net.HttpUrl.Builder queryParam(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighSpeedVideoFpsRangesFor.put(name2, value);
            return this;
        }

        public final com.izettle.android.net.HttpUrl build() {
            java.lang.String str = this.scheme;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("scheme may not be null".toString());
            }
            java.lang.String str2 = this.host;
            if (str2 == null) {
                throw new java.lang.IllegalArgumentException("host may not be null".toString());
            }
            java.lang.Integer num = this.port;
            return new com.izettle.android.net.HttpUrl(str, str2, num != null ? num.intValue() : 80, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/izettle/android/net/HttpUrl$Companion;", "", "<init>", "()V", "Lcom/izettle/android/net/HttpUrl$Builder;", "builder", "()Lcom/izettle/android/net/HttpUrl$Builder;", "", "url", "Lcom/izettle/android/net/HttpUrl;", "parse", "(Ljava/lang/String;)Lcom/izettle/android/net/HttpUrl;", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.izettle.android.net.HttpUrl.Builder builder() {
            return new com.izettle.android.net.HttpUrl.Builder();
        }

        public final com.izettle.android.net.HttpUrl parse(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.izettle.android.net.HttpUrl.Builder().parse$net(url).build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HttpUrl(java.lang.String str, java.lang.String str2, int i, java.util.List list, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, list, map);
    }
}
