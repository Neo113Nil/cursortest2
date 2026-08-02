package okhttp3;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lokhttp3/MediaType;", "", "", "mediaType", "type", "subtype", "", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "defaultValue", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "name", "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "-deprecated_type", "()Ljava/lang/String;", "-deprecated_subtype", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getMediaType$okhttp", "getHighSpeedVideoSizes", "[Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.MediaType.Companion INSTANCE = new okhttp3.MediaType.Companion(null);
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String[] getHighSpeedVideoFpsRanges;
    private final java.lang.String mediaType;
    private final java.lang.String subtype;
    private final java.lang.String type;

    public MediaType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.getHighSpeedVideoFpsRanges = strArr;
    }

    /* renamed from: getMediaType$okhttp, reason: from getter */
    public final java.lang.String getMediaType() {
        return this.mediaType;
    }

    public final java.lang.String type() {
        return this.type;
    }

    public final java.lang.String subtype() {
        return this.subtype;
    }

    public static /* synthetic */ java.nio.charset.Charset charset$default(okhttp3.MediaType mediaType, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public final java.nio.charset.Charset charset(java.nio.charset.Charset defaultValue) {
        java.lang.String parameter = parameter(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset);
        if (parameter == null) {
            return defaultValue;
        }
        try {
            return java.nio.charset.Charset.forName(parameter);
        } catch (java.lang.IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public final java.lang.String parameter(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        int i = 0;
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(0, this.getHighSpeedVideoFpsRanges.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!kotlin.text.StringsKt.equals(this.getHighSpeedVideoFpsRanges[i], name2, true)) {
            if (i == progressionLastElement) {
                return null;
            }
            i += 2;
        }
        return this.getHighSpeedVideoFpsRanges[i + 1];
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "subtype", imports = {}))
    /* renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final java.lang.String getSubtype() {
        return this.subtype;
    }

    public final java.lang.String toString() {
        return this.mediaType;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.MediaType) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.MediaType) other).mediaType, this.mediaType);
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "get", "(Ljava/lang/String;)Lokhttp3/MediaType;", "parse", "mediaType", "-deprecated_get", "-deprecated_parse", "Lkotlin/text/Regex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.MediaType get(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.String str2 = str;
            kotlin.text.MatchResult matchAt = okhttp3.MediaType.getHighResolutionOutputSizeshNQ4ISI.matchAt(str2, 0);
            if (matchAt == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No subtype found for: \"");
                sb.append(str);
                sb.append('\"');
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            java.lang.String lowerCase = matchAt.getGroupValues().get(1).toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = matchAt.getGroupValues().get(2).toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int last = matchAt.getRange().getLast();
            while (true) {
                int i = last + 1;
                if (i < str.length()) {
                    kotlin.text.MatchResult matchAt2 = okhttp3.MediaType.getHighSpeedVideoFpsRanges.matchAt(str2, i);
                    if (matchAt2 == null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Parameter is not formatted correctly: \"");
                        java.lang.String substring = str.substring(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                    }
                    kotlin.text.MatchGroup matchGroup = matchAt2.getGetInputFormats().get(1);
                    java.lang.String value = matchGroup != null ? matchGroup.getValue() : null;
                    if (value == null) {
                        last = matchAt2.getRange().getLast();
                    } else {
                        kotlin.text.MatchGroup matchGroup2 = matchAt2.getGetInputFormats().get(2);
                        java.lang.String value2 = matchGroup2 != null ? matchGroup2.getValue() : null;
                        if (value2 == null) {
                            kotlin.text.MatchGroup matchGroup3 = matchAt2.getGetInputFormats().get(3);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(matchGroup3);
                            value2 = matchGroup3.getValue();
                        } else {
                            java.lang.String str3 = value2;
                            if (kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str3, '\'', false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str3, '\'', false, 2, (java.lang.Object) null) && value2.length() > 2) {
                                value2 = value2.substring(1, value2.length() - 1);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "");
                            }
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        arrayList2.add(value);
                        arrayList2.add(value2);
                        last = matchAt2.getRange().getLast();
                    }
                } else {
                    return new okhttp3.MediaType(str, lowerCase, lowerCase2, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
                }
            }
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.MediaType parse(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            try {
                return get(str);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.MediaType m24352deprecated_get(java.lang.String mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
            return get(mediaType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.MediaType m24353deprecated_parse(java.lang.String mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
            return parse(mediaType);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.nio.charset.Charset charset() {
        return charset$default(this, null, 1, null);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.MediaType parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.MediaType get(java.lang.String str) {
        return INSTANCE.get(str);
    }
}
