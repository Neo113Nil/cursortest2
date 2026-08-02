package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/http/URLBuilder;", "", "urlString", "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "takeFromUnsafe", "", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;II)I", "", "ROOT_PATH", "Ljava/util/List;", "getROOT_PATH", "()Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class URLParserKt {
    private static final java.util.List<java.lang.String> ROOT_PATH = kotlin.collections.CollectionsKt.listOf("");

    public static final java.util.List<java.lang.String> getROOT_PATH() {
        return ROOT_PATH;
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            return uRLBuilder;
        }
        try {
            return takeFromUnsafe(uRLBuilder, str);
        } catch (java.lang.Throwable th) {
            throw new io.ktor.http.URLParserException(str, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final io.ktor.http.URLBuilder takeFromUnsafe(final io.ktor.http.URLBuilder uRLBuilder, java.lang.String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String str2;
        int i6;
        java.util.List<java.lang.String> emptyList;
        java.util.List<java.lang.String> emptyList2;
        int i7;
        int intValue;
        int i8;
        char c;
        char c2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str3 = str;
        int length = str3.length();
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            }
            if (!kotlin.text.CharsKt.isWhitespace(str3.charAt(i9))) {
                break;
            }
            i9++;
        }
        int length2 = str3.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i10 = length2 - 1;
                if (!kotlin.text.CharsKt.isWhitespace(str3.charAt(length2))) {
                    i = length2;
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length2 = i10;
            }
        }
        i = -1;
        int i11 = i + 1;
        char charAt = str.charAt(i9);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i2 = i9;
            i3 = i2;
        } else {
            i2 = i9;
            i3 = -1;
        }
        while (i2 < i11) {
            char charAt2 = str.charAt(i2);
            if (charAt2 != ':') {
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i3 != -1 || ('a' <= charAt2 && charAt2 < '{')) {
                    c = 'A';
                    c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                } else {
                    c = 'A';
                    c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                    if (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')) {
                        i3 = i2;
                    }
                }
                i2++;
            } else {
                if (i3 == -1) {
                    i4 = i2 - i9;
                    if (i4 > 0) {
                        java.lang.String substring = str.substring(i9, i9 + i4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.createOrDefault(substring));
                        i9 += i4 + 1;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        java.lang.String substring2 = str.substring(i9, i11);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                        uRLBuilder.setHost(substring2);
                        return uRLBuilder;
                    }
                    int i12 = 0;
                    while (true) {
                        i5 = i9 + i12;
                        if (i5 >= i11 || str.charAt(i5) != '/') {
                            break;
                        }
                        i12++;
                    }
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "file");
                    java.lang.String str4 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
                    if (areEqual) {
                        if (i12 == 1) {
                            uRLBuilder.setHost("");
                            java.lang.String substring3 = str.substring(i5, i11);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
                            io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, substring3);
                        } else if (i12 == 2) {
                            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, kotlinx.io.files.FileSystemKt.UnixPathSeparator, i5, false, 4, (java.lang.Object) null);
                            if (indexOf$default == -1 || indexOf$default == i11) {
                                java.lang.String substring4 = str.substring(i5, i11);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "");
                                uRLBuilder.setHost(substring4);
                            } else {
                                java.lang.String substring5 = str.substring(i5, indexOf$default);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "");
                                uRLBuilder.setHost(substring5);
                                java.lang.String substring6 = str.substring(indexOf$default, i11);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring6, "");
                                io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, substring6);
                            }
                        } else if (i12 == 3) {
                            uRLBuilder.setHost("");
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                            java.lang.String substring7 = str.substring(i5, i11);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring7, "");
                            sb.append(substring7);
                            io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, sb.toString());
                        } else {
                            throw new java.lang.IllegalArgumentException("Invalid file url: ".concat(java.lang.String.valueOf(str)));
                        }
                        return uRLBuilder;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "mailto")) {
                        if (i12 != 0) {
                            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                        }
                        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, "@", i5, false, 4, (java.lang.Object) null);
                        if (indexOf$default2 == -1) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid mailto url: ");
                            sb2.append(str);
                            sb2.append(", it should contain '@'.");
                            throw new java.lang.IllegalArgumentException(sb2.toString());
                        }
                        java.lang.String substring8 = str.substring(i5, indexOf$default2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring8, "");
                        uRLBuilder.setUser(io.ktor.http.CodecsKt.decodeURLPart$default(substring8, 0, 0, null, 7, null));
                        java.lang.String substring9 = str.substring(indexOf$default2 + 1, i11);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring9, "");
                        uRLBuilder.setHost(substring9);
                        return uRLBuilder;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "about")) {
                        if (i12 != 0) {
                            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                        }
                        java.lang.String substring10 = str.substring(i5, i11);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring10, "");
                        uRLBuilder.setHost(substring10);
                        return uRLBuilder;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "tel")) {
                        if (i12 != 0) {
                            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                        }
                        java.lang.String substring11 = str.substring(i5, i11);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring11, "");
                        uRLBuilder.setHost(substring11);
                        return uRLBuilder;
                    }
                    if (i12 >= 2) {
                        int i13 = i5;
                        while (true) {
                            str2 = str4;
                            i7 = i13;
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.text.StringsKt.indexOfAny$default((java.lang.CharSequence) str3, io.ktor.util.CharsetKt.toCharArray("@/\\?#"), i13, false, 4, (java.lang.Object) null));
                            if (valueOf.intValue() <= 0) {
                                valueOf = null;
                            }
                            intValue = valueOf != null ? valueOf.intValue() : i11;
                            if (intValue >= i11 || str.charAt(intValue) != '@') {
                                break;
                            }
                            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, i7, intValue);
                            if (highResolutionOutputSizeshNQ4ISI != -1) {
                                java.lang.String substring12 = str.substring(i7, highResolutionOutputSizeshNQ4ISI);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring12, "");
                                uRLBuilder.setEncodedUser(substring12);
                                java.lang.String substring13 = str.substring(highResolutionOutputSizeshNQ4ISI + 1, intValue);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring13, "");
                                uRLBuilder.setEncodedPassword(substring13);
                            } else {
                                java.lang.String substring14 = str.substring(i7, intValue);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring14, "");
                                uRLBuilder.setEncodedUser(substring14);
                            }
                            i13 = intValue + 1;
                            str4 = str2;
                        }
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getHighResolutionOutputSizeshNQ4ISI(str, i7, intValue));
                        if (valueOf2.intValue() <= 0) {
                            valueOf2 = null;
                        }
                        int intValue2 = valueOf2 != null ? valueOf2.intValue() : intValue;
                        java.lang.String substring15 = str.substring(i7, intValue2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring15, "");
                        uRLBuilder.setHost(substring15);
                        int i14 = intValue2 + 1;
                        if (i14 < intValue) {
                            java.lang.String substring16 = str.substring(i14, intValue);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring16, "");
                            i8 = java.lang.Integer.parseInt(substring16);
                        } else {
                            i8 = 0;
                        }
                        uRLBuilder.setPort(i8);
                        i6 = intValue;
                    } else {
                        str2 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
                        i6 = i5;
                    }
                    if (i6 >= i11) {
                        uRLBuilder.setEncodedPathSegments(str.charAt(i) == '/' ? ROOT_PATH : kotlin.collections.CollectionsKt.emptyList());
                        return uRLBuilder;
                    }
                    if (i12 == 0) {
                        emptyList = kotlin.collections.CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1);
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    uRLBuilder.setEncodedPathSegments(emptyList);
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(kotlin.text.StringsKt.indexOfAny$default((java.lang.CharSequence) str3, io.ktor.util.CharsetKt.toCharArray("?#"), i6, false, 4, (java.lang.Object) null));
                    if (valueOf3.intValue() <= 0) {
                        valueOf3 = null;
                    }
                    int intValue3 = valueOf3 != null ? valueOf3.intValue() : i11;
                    if (intValue3 > i6) {
                        java.lang.String substring17 = str.substring(i6, intValue3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring17, "");
                        java.util.List<java.lang.String> emptyList3 = (uRLBuilder.getEncodedPathSegments().size() == 1 && ((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) uRLBuilder.getEncodedPathSegments())).length() == 0) ? kotlin.collections.CollectionsKt.emptyList() : uRLBuilder.getEncodedPathSegments();
                        java.util.List<java.lang.String> split$default = kotlin.jvm.internal.Intrinsics.areEqual(substring17, str2) ? ROOT_PATH : kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring17, new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null);
                        if (i12 == 1) {
                            emptyList2 = ROOT_PATH;
                        } else {
                            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        uRLBuilder.setEncodedPathSegments(kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList3, (java.lang.Iterable) kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList2, (java.lang.Iterable) split$default)));
                        i6 = intValue3;
                    }
                    if (i6 < i11 && str.charAt(i6) == '?') {
                        int i15 = i6 + 1;
                        if (i15 == i11) {
                            uRLBuilder.setTrailingQuery(true);
                            i6 = i11;
                        } else {
                            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, '#', i15, false, 4, (java.lang.Object) null));
                            java.lang.Integer num = valueOf4.intValue() > 0 ? valueOf4 : null;
                            int intValue4 = num != null ? num.intValue() : i11;
                            java.lang.String substring18 = str.substring(i15, intValue4);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring18, "");
                            io.ktor.http.QueryKt.parseQueryString$default(substring18, 0, 0, false, 6, null).forEach(new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.URLParserKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return io.ktor.http.URLParserKt.$r8$lambda$KiT66SoEI78GkF2MzH0uHEnRDos(io.ktor.http.URLBuilder.this, (java.lang.String) obj, (java.util.List) obj2);
                                }
                            });
                            i6 = intValue4;
                        }
                    }
                    if (i6 < i11 && str.charAt(i6) == '#') {
                        java.lang.String substring19 = str.substring(i6 + 1, i11);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring19, "");
                        uRLBuilder.setEncodedFragment(substring19);
                    }
                    return uRLBuilder;
                }
                throw new java.lang.IllegalArgumentException("Illegal character in scheme at position ".concat(java.lang.String.valueOf(i3)));
            }
        }
        i4 = -1;
        if (i4 > 0) {
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
        }
    }

    private static final int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2) {
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$KiT66SoEI78GkF2MzH0uHEnRDos(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        uRLBuilder.getEncodedParameters().appendAll(str, list);
        return kotlin.Unit.INSTANCE;
    }
}
