package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\b\u0010\u000b\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\r0\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0015j\b\u0012\u0004\u0012\u00020\u000e`\u00160\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u001a\u001a+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "", "Lio/ktor/http/HeaderValue;", "parseAndSortHeader", "(Ljava/lang/String;)Ljava/util/List;", "parseAndSortContentTypeHeader", "text", "parseHeaderValue", "", "parametersOnly", "(Ljava/lang/String;Z)Ljava/util/List;", "", "Lkotlin/Pair;", "Lio/ktor/http/HeaderValueParam;", "toHeaderParamsList", "(Ljava/lang/Iterable;)Ljava/util/List;", "p0", "", "p1", "Lkotlin/Lazy;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "p2", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;ILkotlin/Lazy;)I", "(Ljava/lang/String;I)Lkotlin/Pair;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;I)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpHeaderValueParserKt {
    public static final java.util.List<io.ktor.http.HeaderValue> parseAndSortHeader(java.lang.String str) {
        return kotlin.collections.CollectionsKt.sortedWith(parseHeaderValue(str), new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortHeader$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t2).getQuality()), java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t).getQuality()));
            }
        });
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseAndSortContentTypeHeader(java.lang.String str) {
        java.util.List<io.ktor.http.HeaderValue> parseHeaderValue = parseHeaderValue(str);
        final java.util.Comparator comparator = new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t2).getQuality()), java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t).getQuality()));
            }
        };
        final java.util.Comparator comparator2 = new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                io.ktor.http.ContentType parse = io.ktor.http.ContentType.INSTANCE.parse(((io.ktor.http.HeaderValue) t).getValue());
                int i = kotlin.jvm.internal.Intrinsics.areEqual(parse.getContentType(), "*") ? 2 : 0;
                if (kotlin.jvm.internal.Intrinsics.areEqual(parse.getContentSubtype(), "*")) {
                    i++;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                io.ktor.http.ContentType parse2 = io.ktor.http.ContentType.INSTANCE.parse(((io.ktor.http.HeaderValue) t2).getValue());
                int i2 = kotlin.jvm.internal.Intrinsics.areEqual(parse2.getContentType(), "*") ? 2 : 0;
                if (kotlin.jvm.internal.Intrinsics.areEqual(parse2.getContentSubtype(), "*")) {
                    i2++;
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(i2));
            }
        };
        return kotlin.collections.CollectionsKt.sortedWith(parseHeaderValue, new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator2.compare(t, t2);
                return compare != 0 ? compare : kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((io.ktor.http.HeaderValue) t2).getParams().size()), java.lang.Integer.valueOf(((io.ktor.http.HeaderValue) t).getParams().size()));
            }
        });
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseHeaderValue(java.lang.String str) {
        return parseHeaderValue(str, false);
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseHeaderValue(java.lang.String str, boolean z) {
        if (str == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.HttpHeaderValueParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.http.HttpHeaderValueParserKt.$r8$lambda$ZoIOcAMQn7vgqvjfNE_34sLBj9k();
            }
        });
        int i = 0;
        while (true) {
            java.lang.String str2 = str;
            if (i > kotlin.text.StringsKt.getLastIndex(str2)) {
                break;
            }
            kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.HttpHeaderValueParserKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return io.ktor.http.HttpHeaderValueParserKt.m23352$r8$lambda$jPc5M9tumPDUAYzMzRtpsKVX2A();
                }
            });
            java.lang.Integer valueOf = z ? java.lang.Integer.valueOf(i) : null;
            int i2 = i;
            while (true) {
                if (i2 <= kotlin.text.StringsKt.getLastIndex(str2)) {
                    char charAt = str.charAt(i2);
                    if (charAt == ',') {
                        java.util.ArrayList arrayList = (java.util.ArrayList) lazy.getValue();
                        java.lang.String substring = str.substring(i, valueOf != null ? valueOf.intValue() : i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        arrayList.add(new io.ktor.http.HeaderValue(kotlin.text.StringsKt.trim(substring).toString(), lazy2.isInitialized() ? (java.util.List) lazy2.getValue() : kotlin.collections.CollectionsKt.emptyList()));
                        i2++;
                    } else if (charAt == ';') {
                        if (valueOf == null) {
                            valueOf = java.lang.Integer.valueOf(i2);
                        }
                        i2 = getHighSpeedVideoFpsRanges(str, i2 + 1, lazy2);
                    } else {
                        i2 = z ? getHighSpeedVideoFpsRanges(str, i2, lazy2) : i2 + 1;
                    }
                } else {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) lazy.getValue();
                    java.lang.String substring2 = str.substring(i, valueOf != null ? valueOf.intValue() : i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                    arrayList2.add(new io.ktor.http.HeaderValue(kotlin.text.StringsKt.trim(substring2).toString(), lazy2.isInitialized() ? (java.util.List) lazy2.getValue() : kotlin.collections.CollectionsKt.emptyList()));
                }
            }
            i = i2;
        }
        return lazy.isInitialized() ? (java.util.List) lazy.getValue() : kotlin.collections.CollectionsKt.emptyList();
    }

    private static final int getHighSpeedVideoFpsRanges(java.lang.String str, int i, kotlin.Lazy<? extends java.util.ArrayList<io.ktor.http.HeaderValueParam>> lazy) {
        int i2 = i;
        while (i2 <= kotlin.text.StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i2);
            if (charAt == ',' || charAt == ';') {
                getHighResolutionOutputSizeshNQ4ISI(lazy, str, i, i2, "");
                return i2;
            }
            if (charAt == '=') {
                kotlin.Pair<java.lang.Integer, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, i2 + 1);
                int intValue = highSpeedVideoFpsRanges.component1().intValue();
                getHighResolutionOutputSizeshNQ4ISI(lazy, str, i, i2, highSpeedVideoFpsRanges.component2());
                return intValue;
            }
            i2++;
        }
        getHighResolutionOutputSizeshNQ4ISI(lazy, str, i, i2, "");
        return i2;
    }

    private static final kotlin.Pair<java.lang.Integer, java.lang.String> getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
        if (str.length() == i) {
            return kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), "");
        }
        if (str.charAt(i) == '\"') {
            return getHighSpeedVideoSizes(str, i + 1);
        }
        int i2 = i;
        while (i2 <= kotlin.text.StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i2);
            if (charAt == ',' || charAt == ';') {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
                java.lang.String substring = str.substring(i, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                return kotlin.TuplesKt.to(valueOf, kotlin.text.StringsKt.trim(substring).toString());
            }
            i2++;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i2);
        java.lang.String substring2 = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        return kotlin.TuplesKt.to(valueOf2, kotlin.text.StringsKt.trim(substring2).toString());
    }

    private static final kotlin.Pair<java.lang.Integer, java.lang.String> getHighSpeedVideoSizes(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            if (i <= kotlin.text.StringsKt.getLastIndex(str)) {
                char charAt = str.charAt(i);
                if (charAt == '\"' && getHighSpeedVideoFpsRangesFor(str, i)) {
                    return kotlin.TuplesKt.to(java.lang.Integer.valueOf(i + 1), sb.toString());
                }
                if (charAt == '\\' && i < kotlin.text.StringsKt.getLastIndex(r1) - 2) {
                    sb.append(str.charAt(i + 1));
                    i += 2;
                } else {
                    sb.append(charAt);
                    i++;
                }
            } else {
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), "\"".concat(java.lang.String.valueOf(obj)));
            }
        }
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
        int i2 = i + 1;
        while (i2 < str.length() && str.charAt(i2) == ' ') {
            i2++;
        }
        return i2 == str.length() || str.charAt(i2) == ';' || str.charAt(i2) == ',';
    }

    public static final java.util.List<io.ktor.http.HeaderValueParam> toHeaderParamsList(java.lang.Iterable<kotlin.Pair<java.lang.String, java.lang.String>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : iterable) {
            arrayList.add(new io.ktor.http.HeaderValueParam(pair.getFirst(), pair.getSecond()));
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList $r8$lambda$ZoIOcAMQn7vgqvjfNE_34sLBj9k() {
        return new java.util.ArrayList();
    }

    /* renamed from: $r8$lambda$jPc5M9-tumPDUAYzMzRtpsKVX2A, reason: not valid java name */
    public static /* synthetic */ java.util.ArrayList m23352$r8$lambda$jPc5M9tumPDUAYzMzRtpsKVX2A() {
        return new java.util.ArrayList();
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(kotlin.Lazy<? extends java.util.ArrayList<io.ktor.http.HeaderValueParam>> lazy, java.lang.String str, int i, int i2, java.lang.String str2) {
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(substring).toString();
        if (obj.length() == 0) {
            return;
        }
        lazy.getValue().add(new io.ktor.http.HeaderValueParam(obj, str2));
    }
}
