package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010!\u001a\u001b\u0010&\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010!\u001a\u001d\u0010)\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0000*\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\u0003*\u000202H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\u00020\u00002\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\"\u00020\u0003H\u0000¢\u0006\u0004\b6\u00107\u001a\u001f\u00109\u001a\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000308H\u0000¢\u0006\u0004\b9\u0010:"}, d2 = {"Lokhttp3/Headers;", "", "index", "", "commonName", "(Lokhttp3/Headers;I)Ljava/lang/String;", "commonValue", "name", "", "commonValues", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "", "Lkotlin/Pair;", "commonIterator", "(Lokhttp3/Headers;)Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "commonNewBuilder", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "", "other", "", "commonEquals", "(Lokhttp3/Headers;Ljava/lang/Object;)Z", "commonHashCode", "(Lokhttp3/Headers;)I", "commonToString", "(Lokhttp3/Headers;)Ljava/lang/String;", "", "namesAndValues", "commonHeadersGet", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "commonAdd", "(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "headers", "commonAddAll", "(Lokhttp3/Headers$Builder;Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "commonAddLenient", "commonRemoveAll", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "commonSet", "commonGet", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Ljava/lang/String;", "commonBuild", "(Lokhttp3/Headers$Builder;)Lokhttp3/Headers;", "", "headersCheckName", "(Ljava/lang/String;)V", "headersCheckValue", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Camera2StreamConfigurationMap", "(C)Ljava/lang/String;", "inputNamesAndValues", "commonHeadersOf", "([Ljava/lang/String;)Lokhttp3/Headers;", "", "commonToHeaders", "(Ljava/util/Map;)Lokhttp3/Headers;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _HeadersCommonKt {
    public static final java.lang.String commonName(okhttp3.Headers headers, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        java.lang.String str = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(headers.getNamesAndValues(), i * 2);
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("name[");
        sb.append(i);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static final java.lang.String commonValue(okhttp3.Headers headers, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        java.lang.String str = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(headers.getNamesAndValues(), (i * 2) + 1);
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("value[");
        sb.append(i);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static final java.util.List<java.lang.String> commonValues(okhttp3.Headers headers, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int size = headers.size();
        java.util.List<java.lang.String> list = null;
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (kotlin.text.StringsKt.equals(str, headers.name(i), true)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(2);
                }
                arrayList.add(headers.value(i));
            }
        }
        if (arrayList != null) {
            list = java.util.Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        }
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public static final java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> commonIterator(okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        int size = headers.size();
        kotlin.Pair[] pairArr = new kotlin.Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = kotlin.TuplesKt.to(headers.name(i), headers.value(i));
        }
        return kotlin.jvm.internal.ArrayIteratorKt.iterator(pairArr);
    }

    public static final okhttp3.Headers.Builder commonNewBuilder(okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        kotlin.collections.CollectionsKt.addAll(builder.getNamesAndValues$okhttp(), headers.getNamesAndValues());
        return builder;
    }

    public static final boolean commonEquals(okhttp3.Headers headers, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return (obj instanceof okhttp3.Headers) && java.util.Arrays.equals(headers.getNamesAndValues(), ((okhttp3.Headers) obj).getNamesAndValues());
    }

    public static final int commonHashCode(okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return java.util.Arrays.hashCode(headers.getNamesAndValues());
    }

    public static final java.lang.String commonToString(okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            java.lang.String name2 = headers.name(i);
            java.lang.String value = headers.value(i);
            sb.append(name2);
            sb.append(": ");
            if (okhttp3.internal._UtilCommonKt.isSensitiveHeader(name2)) {
                value = "██";
            }
            sb.append(value);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    public static final java.lang.String commonHeadersGet(java.lang.String[] strArr, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = strArr.length - 2;
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement > length) {
            return null;
        }
        while (!kotlin.text.StringsKt.equals(str, strArr[length], true)) {
            if (length == progressionLastElement) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public static final okhttp3.Headers.Builder commonAdd(okhttp3.Headers.Builder builder, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        headersCheckName(str);
        headersCheckValue(str2, str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final okhttp3.Headers.Builder commonAddAll(okhttp3.Headers.Builder builder, okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            commonAddLenient(builder, headers.name(i), headers.value(i));
        }
        return builder;
    }

    public static final okhttp3.Headers.Builder commonAddLenient(okhttp3.Headers.Builder builder, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        builder.getNamesAndValues$okhttp().add(str);
        builder.getNamesAndValues$okhttp().add(kotlin.text.StringsKt.trim(str2).toString());
        return builder;
    }

    public static final okhttp3.Headers.Builder commonRemoveAll(okhttp3.Headers.Builder builder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        while (i < builder.getNamesAndValues$okhttp().size()) {
            if (kotlin.text.StringsKt.equals(str, builder.getNamesAndValues$okhttp().get(i), true)) {
                builder.getNamesAndValues$okhttp().remove(i);
                builder.getNamesAndValues$okhttp().remove(i);
                i -= 2;
            }
            i += 2;
        }
        return builder;
    }

    public static final okhttp3.Headers.Builder commonSet(okhttp3.Headers.Builder builder, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        headersCheckName(str);
        headersCheckValue(str2, str);
        builder.removeAll(str);
        commonAddLenient(builder, str, str2);
        return builder;
    }

    public static final java.lang.String commonGet(okhttp3.Headers.Builder builder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
        if (progressionLastElement > size) {
            return null;
        }
        while (!kotlin.text.StringsKt.equals(str, builder.getNamesAndValues$okhttp().get(size), true)) {
            if (size == progressionLastElement) {
                return null;
            }
            size -= 2;
        }
        return builder.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final okhttp3.Headers commonBuild(okhttp3.Headers.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        return new okhttp3.Headers((java.lang.String[]) builder.getNamesAndValues$okhttp().toArray(new java.lang.String[0]));
    }

    public static final void headersCheckName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        if (str2.length() <= 0) {
            throw new java.lang.IllegalArgumentException("name is empty".toString());
        }
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected char 0x");
                sb.append(Camera2StreamConfigurationMap(charAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void headersCheckValue(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected char 0x");
                sb.append(Camera2StreamConfigurationMap(charAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(okhttp3.internal._UtilCommonKt.isSensitiveHeader(str2) ? "" : ": ".concat(java.lang.String.valueOf(str)));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(char c) {
        java.lang.String num = java.lang.Integer.toString(c, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        return num.length() < 2 ? "0".concat(java.lang.String.valueOf(num)) : num;
    }

    public static final okhttp3.Headers commonHeadersOf(java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        if (strArr.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Expected alternating header names and values".toString());
        }
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                throw new java.lang.IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i2] = kotlin.text.StringsKt.trim(strArr[i2]).toString();
        }
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(0, strArr2.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                java.lang.String str = strArr2[i];
                java.lang.String str2 = strArr2[i + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        return new okhttp3.Headers(strArr2);
    }

    public static final okhttp3.Headers commonToHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.lang.String[] strArr = new java.lang.String[map.size() * 2];
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.String obj = kotlin.text.StringsKt.trim(key).toString();
            java.lang.String obj2 = kotlin.text.StringsKt.trim(value).toString();
            headersCheckName(obj);
            headersCheckValue(obj2, obj);
            strArr[i] = obj;
            strArr[i + 1] = obj2;
            i += 2;
        }
        return new okhttp3.Headers(strArr);
    }
}
