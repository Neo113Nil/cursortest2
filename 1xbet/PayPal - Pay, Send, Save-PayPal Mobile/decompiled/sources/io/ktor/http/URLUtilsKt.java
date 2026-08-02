package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a&\u0010\f\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012\u001a\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0016\u001a/\u0010\u001d\u001a\u00020\t*\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001d\u001a\u00020\t*\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010!\u001a+\u0010&\u001a\u00020\t*\u00060\"j\u0002`#2\b\u0010$\u001a\u0004\u0018\u00010\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b&\u0010'\"\u0015\u0010*\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0015\u0010,\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b+\u0010)\"\u0015\u0010.\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b-\u0010)\"\u0015\u0010/\u001a\u00020\u001b*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0015\u00101\u001a\u00020\u001b*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u00100\"\u0015\u0010/\u001a\u00020\u001b*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b/\u00102\"\u0015\u00101\u001a\u00020\u001b*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b1\u00102"}, d2 = {"", "urlString", "Lio/ktor/http/Url;", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, "(Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder;", "builder", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/Url;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "buildUrl", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/http/Url;", "parseUrl", "URLBuilder", "(Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "url", "(Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "takeFrom", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "encodedPath", "encodedQuery", "", "trailingQuery", "appendUrlFullPath", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Z)V", "Lio/ktor/http/ParametersBuilder;", "encodedQueryParameters", "(Ljava/lang/Appendable;Ljava/lang/String;Lio/ktor/http/ParametersBuilder;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "encodedUser", "encodedPassword", "appendUserAndPassword", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "getFullPath", "(Lio/ktor/http/Url;)Ljava/lang/String;", "fullPath", "getHostWithPort", "hostWithPort", "getHostWithPortIfSpecified", "hostWithPortIfSpecified", "isAbsolutePath", "(Lio/ktor/http/Url;)Z", "isRelativePath", "(Lio/ktor/http/URLBuilder;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class URLUtilsKt {
    public static final io.ktor.http.Url Url(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return URLBuilder(str).build();
    }

    public static final io.ktor.http.Url Url(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uRLBuilder).build();
    }

    public static final io.ktor.http.Url buildUrl(kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.http.URLBuilder uRLBuilder = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        function1.invoke(uRLBuilder);
        return uRLBuilder.build();
    }

    public static final io.ktor.http.Url parseUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            io.ktor.http.URLBuilder URLBuilder = URLBuilder(str);
            if (URLBuilder.getHost().length() <= 0) {
                URLBuilder = null;
            }
            if (URLBuilder != null) {
                return URLBuilder.build();
            }
        } catch (io.ktor.http.URLParserException unused) {
        }
        return null;
    }

    public static final io.ktor.http.URLBuilder URLBuilder(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return io.ktor.http.URLParserKt.takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), str);
    }

    public static final io.ktor.http.URLBuilder URLBuilder(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final io.ktor.http.URLBuilder URLBuilder(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uRLBuilder);
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, io.ktor.http.URLBuilder uRLBuilder2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder2, "");
        uRLBuilder.setProtocolOrNull(uRLBuilder2.getProtocolOrNull());
        uRLBuilder.setHost(uRLBuilder2.getHost());
        uRLBuilder.setPort(uRLBuilder2.getPort());
        uRLBuilder.setEncodedPathSegments(uRLBuilder2.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(uRLBuilder2.getEncodedUser());
        uRLBuilder.setEncodedPassword(uRLBuilder2.getEncodedPassword());
        io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        io.ktor.util.StringValuesKt.appendAll(ParametersBuilder$default, uRLBuilder2.getEncodedParameters());
        uRLBuilder.setEncodedParameters(ParametersBuilder$default);
        uRLBuilder.setEncodedFragment(uRLBuilder2.getEncodedFragment());
        uRLBuilder.setTrailingQuery(uRLBuilder2.getTrailingQuery());
        return uRLBuilder;
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        ParametersBuilder$default.appendAll(io.ktor.http.QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(ParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final java.lang.String getFullPath(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendUrlFullPath(sb, url.getEncodedPath(), url.getEncodedQuery(), url.getTrailingQuery());
        return sb.toString();
    }

    public static final java.lang.String getHostWithPort(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(url.getHost());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(url.getPort());
        return sb.toString();
    }

    public static final java.lang.String getHostWithPortIfSpecified(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        int specifiedPort = url.getSpecifiedPort();
        if (specifiedPort == 0 || specifiedPort == url.getProtocol().getDefaultPort()) {
            return url.getHost();
        }
        return getHostWithPort(url);
    }

    public static final void appendUrlFullPath(java.lang.Appendable appendable, java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str;
        if (!kotlin.text.StringsKt.isBlank(str3) && !kotlin.text.StringsKt.startsWith$default(str, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
            appendable.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        }
        appendable.append(str3);
        java.lang.String str4 = str2;
        if (str4.length() > 0 || z) {
            appendable.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
        appendable.append(str4);
    }

    public static final void appendUrlFullPath(java.lang.Appendable appendable, java.lang.String str, io.ktor.http.ParametersBuilder parametersBuilder, boolean z) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parametersBuilder, "");
        java.lang.String str2 = str;
        if (!kotlin.text.StringsKt.isBlank(str2) && !kotlin.text.StringsKt.startsWith$default(str, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
            appendable.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        }
        appendable.append(str2);
        if (!parametersBuilder.isEmpty() || z) {
            appendable.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries = parametersBuilder.entries();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.isEmpty()) {
                arrayList = kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(str3, null));
            } else {
                java.util.List list2 = list;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(kotlin.TuplesKt.to(str3, (java.lang.String) it2.next()));
                }
                arrayList = arrayList3;
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList);
        }
        kotlin.collections.CollectionsKt.joinTo(arrayList2, appendable, (r14 & 2) != 0 ? ", " : "&", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.URLUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.http.URLUtilsKt.$r8$lambda$lTz1vUntNtFyMPSxxuJoV_LI_g8((kotlin.Pair) obj);
            }
        });
    }

    public static final boolean isAbsolutePath(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) url.getRawSegments()), "");
    }

    public static final boolean isRelativePath(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return !isAbsolutePath(url);
    }

    public static final boolean isAbsolutePath(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) uRLBuilder.getPathSegments()), "");
    }

    public static final boolean isRelativePath(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        return !isAbsolutePath(uRLBuilder);
    }

    public static final void appendUserAndPassword(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(str2);
        }
        sb.append("@");
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$lTz1vUntNtFyMPSxxuJoV_LI_g8(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (pair.getSecond() == null) {
            return str;
        }
        java.lang.String valueOf = java.lang.String.valueOf(pair.getSecond());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('=');
        sb.append(valueOf);
        return sb.toString();
    }
}
