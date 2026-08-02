package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\t\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/util/StringValuesBuilder;", "", "name", "Lio/ktor/http/HeaderValueWithParameters;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "append", "(Lio/ktor/util/StringValuesBuilder;Ljava/lang/String;Lio/ktor/http/HeaderValueWithParameters;)V", "escapeIfNeeded", "(Ljava/lang/String;)Ljava/lang/String;", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Z", "getHighResolutionOutputSizeshNQ4ISI", "quote", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HeaderValueWithParametersKt {
    private static final java.util.Set<java.lang.Character> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'(', ')', java.lang.Character.valueOf(kotlin.text.Typography.less), java.lang.Character.valueOf(kotlin.text.Typography.greater), '@', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), ';', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), '\\', '\"', java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST), '?', '=', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ), ' ', '\t', '\n', '\r'});

    public static final void append(io.ktor.util.StringValuesBuilder stringValuesBuilder, java.lang.String str, io.ktor.http.HeaderValueWithParameters headerValueWithParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValueWithParameters, "");
        stringValuesBuilder.append(str, headerValueWithParameters.toString());
    }

    public static final java.lang.String escapeIfNeeded(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoFpsRanges(str) ? quote(str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str.length() == 0) {
            return true;
        }
        if (getHighResolutionOutputSizeshNQ4ISI(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (getHighSpeedVideoFpsRangesFor.contains(java.lang.Character.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str.length() < 2) {
            return false;
        }
        java.lang.String str2 = str;
        if (kotlin.text.StringsKt.first(str2) != '\"' || kotlin.text.StringsKt.last(str2) != '\"') {
            return false;
        }
        int i = 1;
        do {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '\"', i, false, 4, (java.lang.Object) null);
            if (indexOf$default == kotlin.text.StringsKt.getLastIndex(str2)) {
                break;
            }
            int i2 = 0;
            for (int i3 = indexOf$default - 1; str.charAt(i3) == '\\'; i3--) {
                i2++;
            }
            if (i2 % 2 == 0) {
                return false;
            }
            i = indexOf$default + 1;
        } while (i < str.length());
        return true;
    }

    public static final java.lang.String quote(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\"");
        return sb.toString();
    }
}
