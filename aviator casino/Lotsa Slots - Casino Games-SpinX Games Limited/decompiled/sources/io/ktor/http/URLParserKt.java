package io.ktor.http;

/* compiled from: URLParser.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a+\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/http/URLBuilder;", "", "urlString", "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "takeFromUnsafe", "", "startIndex", "endIndex", "slashCount", "", "parseFile", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;III)V", "parseMailto", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;II)V", "parseQuery", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;II)I", "parseFragment", "fillHost", "findScheme", "(Ljava/lang/String;II)I", "", "char", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "(Ljava/lang/String;IIC)I", "indexOfColonInHostPort", "", "isLetter", "(C)Z", "", "ROOT_PATH", "Ljava/util/List;", "getROOT_PATH", "()Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class URLParserKt {
    private static final java.util.List<java.lang.String> ROOT_PATH = kotlin.collections.CollectionsKt.listOf("");

    public static final java.util.List<java.lang.String> getROOT_PATH() {
        return ROOT_PATH;
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, java.lang.String urlString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (kotlin.text.StringsKt.isBlank(urlString)) {
            return uRLBuilder;
        }
        try {
            return takeFromUnsafe(uRLBuilder, urlString);
        } catch (java.lang.Throwable th) {
            throw new io.ktor.http.URLParserException(urlString, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final io.ktor.http.URLBuilder takeFromUnsafe(io.ktor.http.URLBuilder uRLBuilder, java.lang.String urlString) {
        int i;
        int findScheme;
        int i2;
        java.util.List<java.lang.String> emptyList;
        java.util.List<java.lang.String> emptyList2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        java.lang.String str = urlString;
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!kotlin.text.CharsKt.isWhitespace(str.charAt(i4))) {
                break;
            }
            i4++;
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                if (!kotlin.text.CharsKt.isWhitespace(str.charAt(length2))) {
                    i = length2;
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length2 = i5;
            }
            int i6 = i + 1;
            findScheme = findScheme(urlString, i4, i6);
            if (findScheme > 0) {
                java.lang.String substring = urlString.substring(i4, i4 + findScheme);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.createOrDefault(substring));
                i4 += findScheme + 1;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "data")) {
                java.lang.String substring2 = urlString.substring(i4, i6);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                uRLBuilder.setHost(substring2);
                return uRLBuilder;
            }
            int count = count(urlString, i4, i6, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            int i7 = i4 + count;
            if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "file")) {
                parseFile(uRLBuilder, urlString, i7, i6, count);
                return uRLBuilder;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "mailto")) {
                if (count != 0) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                parseMailto(uRLBuilder, urlString, i7, i6);
                return uRLBuilder;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "about")) {
                if (count != 0) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                java.lang.String substring3 = urlString.substring(i7, i6);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                uRLBuilder.setHost(substring3);
                return uRLBuilder;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "tel")) {
                if (count != 0) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                java.lang.String substring4 = urlString.substring(i7, i6);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                uRLBuilder.setHost(substring4);
                return uRLBuilder;
            }
            if (count >= 2) {
                int i8 = i7;
                while (true) {
                    i3 = i8;
                    i2 = count;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.text.StringsKt.indexOfAny$default((java.lang.CharSequence) str, io.ktor.util.CharsetKt.toCharArray("@/\\?#"), i8, false, 4, (java.lang.Object) null));
                    if (valueOf.intValue() <= 0) {
                        valueOf = null;
                    }
                    i7 = valueOf != null ? valueOf.intValue() : i6;
                    if (i7 >= i6 || urlString.charAt(i7) != '@') {
                        break;
                    }
                    int indexOfColonInHostPort = indexOfColonInHostPort(urlString, i3, i7);
                    if (indexOfColonInHostPort != -1) {
                        java.lang.String substring5 = urlString.substring(i3, indexOfColonInHostPort);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                        uRLBuilder.setEncodedUser(substring5);
                        java.lang.String substring6 = urlString.substring(indexOfColonInHostPort + 1, i7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                        uRLBuilder.setEncodedPassword(substring6);
                    } else {
                        java.lang.String substring7 = urlString.substring(i3, i7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                        uRLBuilder.setEncodedUser(substring7);
                    }
                    i8 = i7 + 1;
                    count = i2;
                }
                fillHost(uRLBuilder, urlString, i3, i7);
            } else {
                i2 = count;
            }
            int i9 = i7;
            if (i9 >= i6) {
                uRLBuilder.setEncodedPathSegments(urlString.charAt(i) == '/' ? ROOT_PATH : kotlin.collections.CollectionsKt.emptyList());
                return uRLBuilder;
            }
            if (i2 == 0) {
                emptyList = kotlin.collections.CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1);
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            uRLBuilder.setEncodedPathSegments(emptyList);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(kotlin.text.StringsKt.indexOfAny$default((java.lang.CharSequence) str, io.ktor.util.CharsetKt.toCharArray("?#"), i9, false, 4, (java.lang.Object) null));
            java.lang.Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
            int intValue = num != null ? num.intValue() : i6;
            if (intValue > i9) {
                java.lang.String substring8 = urlString.substring(i9, intValue);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring8, "substring(...)");
                java.util.List<java.lang.String> emptyList3 = (uRLBuilder.getEncodedPathSegments().size() == 1 && ((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) uRLBuilder.getEncodedPathSegments())).length() == 0) ? kotlin.collections.CollectionsKt.emptyList() : uRLBuilder.getEncodedPathSegments();
                java.util.List<java.lang.String> split$default = kotlin.jvm.internal.Intrinsics.areEqual(substring8, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) ? ROOT_PATH : kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring8, new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null);
                if (i2 == 1) {
                    emptyList2 = ROOT_PATH;
                } else {
                    emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                }
                uRLBuilder.setEncodedPathSegments(kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList3, (java.lang.Iterable) kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList2, (java.lang.Iterable) split$default)));
                i9 = intValue;
            }
            if (i9 < i6 && urlString.charAt(i9) == '?') {
                i9 = parseQuery(uRLBuilder, urlString, i9, i6);
            }
            parseFragment(uRLBuilder, urlString, i9, i6);
            return uRLBuilder;
        }
        i = -1;
        int i62 = i + 1;
        findScheme = findScheme(urlString, i4, i62);
        if (findScheme > 0) {
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "data")) {
        }
    }

    private static final void parseFile(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, int i, int i2, int i3) {
        if (i3 == 1) {
            uRLBuilder.setHost("");
            java.lang.String substring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, substring);
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                uRLBuilder.setHost("");
                java.lang.StringBuilder sb = new java.lang.StringBuilder(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
                java.lang.String substring2 = str.substring(i, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                sb.append(substring2);
                io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, sb.toString());
                return;
            }
            throw new java.lang.IllegalArgumentException("Invalid file url: " + str);
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.io.files.FileSystemKt.UnixPathSeparator, i, false, 4, (java.lang.Object) null);
        if (indexOf$default == -1 || indexOf$default == i2) {
            java.lang.String substring3 = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            uRLBuilder.setHost(substring3);
        } else {
            java.lang.String substring4 = str.substring(i, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            uRLBuilder.setHost(substring4);
            java.lang.String substring5 = str.substring(indexOf$default, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
            io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, substring5);
        }
    }

    private static final void parseMailto(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, int i, int i2) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "@", i, false, 4, (java.lang.Object) null);
        if (indexOf$default == -1) {
            throw new java.lang.IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        java.lang.String substring = str.substring(i, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setUser(io.ktor.http.CodecsKt.decodeURLPart$default(substring, 0, 0, null, 7, null));
        java.lang.String substring2 = str.substring(indexOf$default + 1, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        uRLBuilder.setHost(substring2);
    }

    private static final int parseQuery(final io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            uRLBuilder.setTrailingQuery(true);
            return i2;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '#', i3, false, 4, (java.lang.Object) null));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        java.lang.String substring = str.substring(i3, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        io.ktor.http.QueryKt.parseQueryString$default(substring, 0, 0, false, 6, null).forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.URLParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit parseQuery$lambda$5;
                parseQuery$lambda$5 = io.ktor.http.URLParserKt.parseQuery$lambda$5(io.ktor.http.URLBuilder.this, (java.lang.String) obj, (java.util.List) obj2);
                return parseQuery$lambda$5;
            }
        });
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit parseQuery$lambda$5(io.ktor.http.URLBuilder uRLBuilder, java.lang.String key, java.util.List values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        uRLBuilder.getEncodedParameters().appendAll(key, values);
        return kotlin.Unit.INSTANCE;
    }

    private static final void parseFragment(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, int i, int i2) {
        if (i >= i2 || str.charAt(i) != '#') {
            return;
        }
        java.lang.String substring = str.substring(i + 1, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setEncodedFragment(substring);
    }

    private static final void fillHost(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, int i, int i2) {
        int i3;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(indexOfColonInHostPort(str, i, i2));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i2;
        java.lang.String substring = str.substring(i, intValue);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setHost(substring);
        int i4 = intValue + 1;
        if (i4 < i2) {
            java.lang.String substring2 = str.substring(i4, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            i3 = java.lang.Integer.parseInt(substring2);
        } else {
            i3 = 0;
        }
        uRLBuilder.setPort(i3);
    }

    private static final int findScheme(java.lang.String str, int i, int i2) {
        int i3;
        int i4;
        char charAt = str.charAt(i);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i3 = i;
            i4 = i3;
        } else {
            i3 = i;
            i4 = -1;
        }
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 != ':') {
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i4 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i4 = i3;
                }
                i3++;
            } else {
                if (i4 == -1) {
                    return i3 - i;
                }
                throw new java.lang.IllegalArgumentException("Illegal character in scheme at position " + i4);
            }
        }
        return -1;
    }

    private static final int count(java.lang.String str, int i, int i2, char c) {
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 >= i2 || str.charAt(i4) != c) {
                break;
            }
            i3++;
        }
        return i3;
    }

    private static final int indexOfColonInHostPort(java.lang.String str, int i, int i2) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '[') {
                    z = true;
                } else if (charAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static final boolean isLetter(char c) {
        char lowerCase = java.lang.Character.toLowerCase(c);
        return 'a' <= lowerCase && lowerCase < '{';
    }
}
