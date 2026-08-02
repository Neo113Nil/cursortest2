package io.ktor.http.auth;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b\"\u0014\u0010\u0013\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d\"\u0014\u0010\u0017\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d"}, d2 = {"", "headerValue", "Lio/ktor/http/auth/HttpAuthHeader;", "parseAuthorizationHeader", "(Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader;", "", "parseAuthorizationHeaders", "(Ljava/lang/String;)Ljava/util/List;", "", "p0", "p1", "", "p2", "p3", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Lio/ktor/http/auth/HttpAuthHeader;ILjava/lang/String;)Ljava/lang/Integer;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;ILjava/util/Map;)I", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;I)I", "", "", "Camera2StreamConfigurationMap", "(C)Z", "", "getHighSpeedVideoSizes", "Ljava/util/Set;", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpAuthHeaderKt {
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Set<java.lang.Character> getHighSpeedVideoFpsRanges;
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<java.lang.Character> getHighSpeedVideoSizes;

    static {
        java.lang.Character valueOf = java.lang.Character.valueOf(kotlin.text.Typography.dollar);
        java.lang.Character valueOf2 = java.lang.Character.valueOf(kotlin.text.Typography.amp);
        java.lang.Character valueOf3 = java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'!', '#', valueOf, '%', valueOf2, '\'', '*', '+', '-', valueOf3, java.lang.Character.valueOf(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString), '_', '`', '|', '~'});
        getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'-', valueOf3, '_', '~', '+', java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator)});
        getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("[a-zA-Z0-9\\-._~+/]+=*");
        getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("\\\\.");
    }

    public static final java.util.List<io.ktor.http.auth.HttpAuthHeader> parseAuthorizationHeaders(java.lang.String str) {
        java.lang.Integer highSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i != -1) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            int i2 = i;
            while (i2 < str.length() && Camera2StreamConfigurationMap(str.charAt(i2))) {
                i2++;
            }
            java.lang.String substring = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(i, i2));
            if (kotlin.text.StringsKt.isBlank(substring)) {
                throw new io.ktor.http.parsing.ParseException("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
            }
            while (i2 < str.length() && str.charAt(i2) == ' ') {
                i2++;
            }
            java.lang.Integer highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(arrayList, new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, kotlin.collections.CollectionsKt.emptyList(), (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), i2, str);
            if (highSpeedVideoFpsRanges2 != null) {
                i = highSpeedVideoFpsRanges2.intValue();
            } else {
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, i2);
                java.lang.String obj = kotlin.text.StringsKt.trim(kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(i2, highSpeedVideoFpsRangesFor))).toString();
                if (obj.length() <= 0 || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(arrayList, new io.ktor.http.auth.HttpAuthHeader.Single(substring, obj), highSpeedVideoFpsRangesFor, str)) == null) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, i2, linkedHashMap);
                    arrayList.add(new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, linkedHashMap, (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    i = highResolutionOutputSizeshNQ4ISI;
                } else {
                    i = highSpeedVideoFpsRanges.intValue();
                }
            }
        }
        return arrayList;
    }

    private static final java.lang.Integer getHighSpeedVideoFpsRanges(java.util.List<io.ktor.http.auth.HttpAuthHeader> list, io.ktor.http.auth.HttpAuthHeader httpAuthHeader, int i, java.lang.String str) {
        if (i != str.length() && str.charAt(i) != ',') {
            return null;
        }
        list.add(httpAuthHeader);
        if (i == str.length()) {
            return -1;
        }
        if (str.charAt(i) == ',') {
            return java.lang.Integer.valueOf(i + 1);
        }
        throw new java.lang.IllegalStateException("".toString());
    }

    private static final int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.util.Map<java.lang.String, java.lang.String> map) {
        int i2;
        while (i > 0 && i < str.length()) {
            int i3 = i;
            while (i3 < str.length() && str.charAt(i3) == ' ') {
                i3++;
            }
            int i4 = i3;
            while (i4 < str.length() && Camera2StreamConfigurationMap(str.charAt(i4))) {
                i4++;
            }
            java.lang.String substring = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(i3, i4));
            while (i4 < str.length() && str.charAt(i4) == ' ') {
                i4++;
            }
            if (i4 == str.length() || str.charAt(i4) != '=') {
                i2 = i;
            } else {
                do {
                    i4++;
                    if (i4 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i4) == ' ');
                boolean z = false;
                if (str.charAt(i4) == '\"') {
                    i4++;
                    i2 = i4;
                    boolean z2 = false;
                    while (i2 < str.length() && (str.charAt(i2) != '\"' || z2)) {
                        z2 = !z2 && str.charAt(i2) == '\\';
                        i2++;
                    }
                    if (i2 == str.length()) {
                        throw new io.ktor.http.parsing.ParseException("Expected closing quote'\"' in parameter", null, 2, null);
                    }
                    z = true;
                } else {
                    i2 = i4;
                    while (i2 < str.length() && str.charAt(i2) != ' ' && str.charAt(i2) != ',') {
                        i2++;
                    }
                }
                java.lang.String substring2 = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(i4, i2));
                if (z) {
                    substring2 = getHighSpeedVideoFpsRangesFor.replace(substring2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.auth.HttpAuthHeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return io.ktor.http.auth.HttpAuthHeaderKt.$r8$lambda$M9CZ9pSVZy59A8Gmi6XLOv730ic((kotlin.text.MatchResult) obj);
                        }
                    });
                }
                map.put(substring, substring2);
                if (z) {
                    i2++;
                }
            }
            if (i2 == i) {
                break;
            }
            while (i2 < str.length() && str.charAt(i2) == ' ') {
                i2++;
            }
            if (i2 == str.length()) {
                i = -1;
            } else {
                if (str.charAt(i2) != ',') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected delimiter , at position ");
                    sb.append(i2);
                    throw new io.ktor.http.parsing.ParseException(sb.toString(), null, 2, null);
                }
                do {
                    i2++;
                    if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == ' ');
                i = i2;
            }
        }
        return i;
    }

    private static final boolean Camera2StreamConfigurationMap(char c) {
        if ('a' > c || c >= '{') {
            return ('A' <= c && c < '[') || io.ktor.http.CookieUtilsKt.isDigit(c) || getHighSpeedVideoSizes.contains(java.lang.Character.valueOf(c));
        }
        return true;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$M9CZ9pSVZy59A8Gmi6XLOv730ic(kotlin.text.MatchResult matchResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "");
        return kotlin.text.StringsKt.takeLast(matchResult.getValue(), 1);
    }

    private static final int getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
        char charAt;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        while (i < str.length() && (('a' <= (charAt = str.charAt(i)) && charAt < '{') || (('A' <= charAt && charAt < '[') || io.ktor.http.CookieUtilsKt.isDigit(charAt) || getHighSpeedVideoFpsRanges.contains(java.lang.Character.valueOf(charAt))))) {
            i++;
        }
        while (i < str.length() && str.charAt(i) == '=') {
            i++;
        }
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    public static final io.ktor.http.auth.HttpAuthHeader parseAuthorizationHeader(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        int i2 = i;
        while (i2 < str.length() && Camera2StreamConfigurationMap(str.charAt(i2))) {
            i2++;
        }
        java.lang.String substring = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(i, i2));
        while (i2 < str.length() && str.charAt(i2) == ' ') {
            i2++;
        }
        if (kotlin.text.StringsKt.isBlank(substring)) {
            return null;
        }
        if (str.length() == i2) {
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, kotlin.collections.CollectionsKt.emptyList(), (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, i2);
        java.lang.String obj = kotlin.text.StringsKt.trim(kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(i2, highSpeedVideoFpsRangesFor))).toString();
        if (obj.length() > 0 && highSpeedVideoFpsRangesFor == str.length()) {
            return new io.ktor.http.auth.HttpAuthHeader.Single(substring, obj);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (getHighResolutionOutputSizeshNQ4ISI(str, i2, linkedHashMap) == -1) {
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, linkedHashMap, (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        throw new io.ktor.http.parsing.ParseException("Function parseAuthorizationHeader can parse only one header", null, 2, null);
    }
}
