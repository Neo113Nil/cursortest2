package coil3;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001aS\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0000*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u0012\u001a\u00020\u001b*\u0004\u0018\u00010\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001c"}, d2 = {"", "scheme", "authority", "path", "query", "fragment", "separator", "Lcoil3/Uri;", "Uri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcoil3/Uri;", "toUri", "(Ljava/lang/String;Ljava/lang/String;)Lcoil3/Uri;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcoil3/Uri;", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;[B)Ljava/lang/String;", "", "getPathSegments", "(Lcoil3/Uri;)Ljava/util/List;", "pathSegments", "getFilePath", "(Lcoil3/Uri;)Ljava/lang/String;", "filePath", "", "(Ljava/lang/String;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UriKt {
    public static /* synthetic */ coil3.Uri Uri$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = okio.Path.DIRECTORY_SEPARATOR;
        }
        return Uri(str, str2, str3, str4, str5, str6);
    }

    public static final coil3.Uri Uri(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new java.lang.IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.".toString());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        }
        if (str2 != null) {
            sb.append("//");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new coil3.Uri(sb.toString(), str6, str, str2, str3, str4, str5);
    }

    public static final java.util.List<java.lang.String> getPathSegments(coil3.Uri uri) {
        java.lang.String path = uri.getPath();
        if (path == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = -1;
        while (i < path.length()) {
            int i2 = i + 1;
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) path, kotlinx.io.files.FileSystemKt.UnixPathSeparator, i2, false, 4, (java.lang.Object) null);
            if (indexOf$default == -1) {
                indexOf$default = path.length();
            }
            java.lang.String substring = path.substring(i2, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = indexOf$default;
        }
        return arrayList;
    }

    public static final java.lang.String getFilePath(coil3.Uri uri) {
        java.util.List<java.lang.String> pathSegments = getPathSegments(uri);
        if (pathSegments.isEmpty()) {
            return null;
        }
        java.lang.String path = uri.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNull(path);
        return kotlin.collections.CollectionsKt.joinToString$default(pathSegments, uri.getSeparator(), kotlin.text.StringsKt.startsWith$default(path, uri.getSeparator(), false, 2, (java.lang.Object) null) ? uri.getSeparator() : "", null, 0, null, null, 60, null);
    }

    public static /* synthetic */ coil3.Uri toUri$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = okio.Path.DIRECTORY_SEPARATOR;
        }
        return toUri(str, str2);
    }

    public static final coil3.Uri toUri(java.lang.String str, java.lang.String str2) {
        return getHighResolutionOutputSizeshNQ4ISI(!kotlin.jvm.internal.Intrinsics.areEqual(str2, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? kotlin.text.StringsKt.replace$default(str, str2, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 4, (java.lang.Object) null) : str, str, str2);
    }

    private static final coil3.Uri getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        boolean z = true;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (i6 < str.length()) {
            char charAt = str.charAt(i6);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i3 == -1 && i == -1) {
                            i3 = i6 + 1;
                        }
                    } else if (z && i3 == -1 && i == -1) {
                        int i7 = i6 + 2;
                        if (i7 < str2.length() && str2.charAt(i6 + 1) == '/' && str2.charAt(i7) == '/') {
                            i4 = i6 + 3;
                            z = false;
                            i5 = i6;
                            i6 = i7;
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, str2)) {
                            i2 = i6 + 1;
                            i5 = i6;
                            i6 = i2;
                            i4 = i6;
                        }
                    }
                } else if (i2 == -1 && i3 == -1 && i == -1) {
                    i2 = i4 == -1 ? 0 : i6;
                    z = false;
                }
            } else if (i == -1) {
                i = i6 + 1;
            }
            i6++;
        }
        int min = java.lang.Math.min(i == -1 ? Integer.MAX_VALUE : i - 1, str.length());
        int min2 = java.lang.Math.min(i3 == -1 ? Integer.MAX_VALUE : i3 - 1, min);
        if (i4 != -1) {
            str5 = str.substring(0, i5);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
            str4 = str.substring(i4, java.lang.Math.min(i2 != -1 ? i2 : Integer.MAX_VALUE, min2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
        } else {
            str4 = null;
            str5 = null;
        }
        if (i2 != -1) {
            str6 = str.substring(i2, min2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
        } else {
            str6 = null;
        }
        if (i3 != -1) {
            str7 = str.substring(i3, min);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
        } else {
            str7 = null;
        }
        if (i != -1) {
            str8 = str.substring(i, str.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "");
        } else {
            str8 = null;
        }
        byte[] bArr = new byte[java.lang.Math.max(0, java.lang.Math.max(getHighSpeedVideoFpsRanges(str5), java.lang.Math.max(getHighSpeedVideoFpsRanges(str4), java.lang.Math.max(getHighSpeedVideoFpsRanges(str6), java.lang.Math.max(getHighSpeedVideoFpsRanges(str7), getHighSpeedVideoFpsRanges(str8))))) - 2)];
        return new coil3.Uri(str, str3, str5 != null ? getHighSpeedVideoFpsRanges(str5, bArr) : null, str4 != null ? getHighSpeedVideoFpsRanges(str4, bArr) : null, str6 != null ? getHighSpeedVideoFpsRanges(str6, bArr) : null, str7 != null ? getHighSpeedVideoFpsRanges(str7, bArr) : null, str8 != null ? getHighSpeedVideoFpsRanges(str8, bArr) : null);
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, byte[] bArr) {
        int length = str.length();
        int i = 0;
        int max = java.lang.Math.max(0, length - 2);
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return kotlin.text.StringsKt.decodeToString$default(bArr, 0, i2, false, 5, null);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    java.lang.String substring = str.substring(i + 1, i3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    bArr[i2] = (byte) java.lang.Integer.parseInt(substring, kotlin.text.CharsKt.checkRadix(16));
                    i2++;
                    i = i3;
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    private static final int getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static final coil3.Uri toUri(java.lang.String str) {
        return toUri$default(str, null, 1, null);
    }
}
