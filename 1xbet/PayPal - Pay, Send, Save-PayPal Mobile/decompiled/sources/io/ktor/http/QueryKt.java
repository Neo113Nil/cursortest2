package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "query", "", "startIndex", "limit", "", "decode", "Lio/ktor/http/Parameters;", "parseQueryString", "(Ljava/lang/String;IIZ)Lio/ktor/http/Parameters;", "Lio/ktor/http/ParametersBuilder;", "p0", "p1", "p2", "p3", "p4", "", "getHighSpeedVideoSizes", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/String;IIIZ)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class QueryKt {
    public static /* synthetic */ io.ktor.http.Parameters parseQueryString$default(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1000;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        return parseQueryString(str, i, i2, z);
    }

    public static final io.ktor.http.Parameters parseQueryString(java.lang.String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        if (i > kotlin.text.StringsKt.getLastIndex(str2)) {
            return io.ktor.http.Parameters.INSTANCE.getEmpty();
        }
        io.ktor.http.Parameters.Companion companion = io.ktor.http.Parameters.INSTANCE;
        int i5 = 0;
        io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        int lastIndex = kotlin.text.StringsKt.getLastIndex(str2);
        if (i <= lastIndex) {
            i3 = i;
            i4 = -1;
            while (i5 != i2) {
                char charAt = str.charAt(i);
                if (charAt == '&') {
                    getHighSpeedVideoSizes(ParametersBuilder$default, str, i3, i4, i, z);
                    i5++;
                    i4 = -1;
                    i3 = i + 1;
                } else if (charAt == '=' && i4 == -1) {
                    i4 = i;
                }
                if (i != lastIndex) {
                    i++;
                }
            }
            return ParametersBuilder$default.build();
        }
        i3 = i;
        i4 = -1;
        if (i5 != i2) {
            getHighSpeedVideoSizes(ParametersBuilder$default, str, i3, i4, str.length(), z);
        }
        return ParametersBuilder$default.build();
    }

    private static final void getHighSpeedVideoSizes(io.ktor.http.ParametersBuilder parametersBuilder, java.lang.String str, int i, int i2, int i3, boolean z) {
        java.lang.String substring;
        java.lang.String substring2;
        java.lang.String substring3;
        if (i2 == -1) {
            java.lang.String str2 = str;
            int i4 = i;
            while (i4 < i3 && kotlin.text.CharsKt.isWhitespace(str2.charAt(i4))) {
                i4++;
            }
            int i5 = i3;
            while (i5 > i4 && kotlin.text.CharsKt.isWhitespace(str2.charAt(i5 - 1))) {
                i5--;
            }
            if (i5 > i4) {
                if (z) {
                    substring3 = io.ktor.http.CodecsKt.decodeURLQueryComponent$default(str, i4, i5, false, null, 12, null);
                } else {
                    substring3 = str.substring(i4, i5);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
                }
                parametersBuilder.appendAll(substring3, kotlin.collections.CollectionsKt.emptyList());
                return;
            }
            return;
        }
        java.lang.String str3 = str;
        int i6 = i;
        while (i6 < i2 && kotlin.text.CharsKt.isWhitespace(str3.charAt(i6))) {
            i6++;
        }
        int i7 = i2;
        while (i7 > i6 && kotlin.text.CharsKt.isWhitespace(str3.charAt(i7 - 1))) {
            i7--;
        }
        if (i7 > i6) {
            if (z) {
                substring = io.ktor.http.CodecsKt.decodeURLQueryComponent$default(str, i6, i7, false, null, 12, null);
            } else {
                substring = str.substring(i6, i7);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            }
            int i8 = i2 + 1;
            while (i8 < i3 && kotlin.text.CharsKt.isWhitespace(str3.charAt(i8))) {
                i8++;
            }
            int i9 = i3;
            while (i9 > i8 && kotlin.text.CharsKt.isWhitespace(str3.charAt(i9 - 1))) {
                i9--;
            }
            if (z) {
                substring2 = io.ktor.http.CodecsKt.decodeURLQueryComponent$default(str, i8, i9, true, null, 8, null);
            } else {
                substring2 = str.substring(i8, i9);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            }
            parametersBuilder.append(substring, substring2);
        }
    }
}
