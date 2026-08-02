package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\b*\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\t\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lokio/Buffer;", "", "getHighSpeedVideoFpsRanges", "(Lokio/Buffer;)Z", "Camera2StreamConfigurationMap", "(Lokio/Buffer;)Ljava/lang/String;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_BODY_UI, "Lokio/ByteString;", "getHighResolutionOutputSizeshNQ4ISI", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final okio.ByteString getHighResolutionOutputSizeshNQ4ISI = okio.ByteString.INSTANCE.encodeUtf8("\"\\");
    private static final okio.ByteString getHighSpeedVideoSizes = okio.ByteString.INSTANCE.encodeUtf8("\t ,=");

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0150, code lost:
    
        r7 = r9;
        r9 = r11;
        r4.add(new okhttp3.Challenge(r7, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<okhttp3.Challenge> parseChallenges(okhttp3.Headers headers, java.lang.String str) {
        java.lang.String Camera2StreamConfigurationMap;
        int skipAll;
        java.lang.String str2;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = 1;
            if (kotlin.text.StringsKt.equals(str, headers.name(i2), true)) {
                okio.Buffer writeUtf8 = new okio.Buffer().writeUtf8(headers.value(i2));
                while (true) {
                    java.lang.String str3 = null;
                    java.lang.String str4 = null;
                    while (true) {
                        if (str4 == null) {
                            try {
                                getHighSpeedVideoFpsRanges(writeUtf8);
                                str4 = Camera2StreamConfigurationMap(writeUtf8);
                                if (str4 == null) {
                                    break;
                                }
                            } catch (java.io.EOFException e) {
                                okhttp3.internal.platform.Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                            }
                        }
                        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(writeUtf8);
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(writeUtf8);
                        if (Camera2StreamConfigurationMap == null) {
                            if (writeUtf8.exhausted()) {
                                arrayList.add(new okhttp3.Challenge(str4, (java.util.Map<java.lang.String, java.lang.String>) kotlin.collections.MapsKt.emptyMap()));
                            }
                        } else {
                            byte b = kotlin.io.encoding.Base64.padSymbol;
                            skipAll = okhttp3.internal._UtilCommonKt.skipAll(writeUtf8, kotlin.io.encoding.Base64.padSymbol);
                            boolean highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(writeUtf8);
                            if (highSpeedVideoFpsRanges || (!highSpeedVideoFpsRanges2 && !writeUtf8.exhausted())) {
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                int skipAll2 = skipAll + okhttp3.internal._UtilCommonKt.skipAll(writeUtf8, kotlin.io.encoding.Base64.padSymbol);
                                while (true) {
                                    if (Camera2StreamConfigurationMap == null) {
                                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(writeUtf8);
                                        if (getHighSpeedVideoFpsRanges(writeUtf8)) {
                                            break;
                                        }
                                        skipAll2 = okhttp3.internal._UtilCommonKt.skipAll(writeUtf8, b);
                                    }
                                    if (skipAll2 == 0) {
                                        break;
                                    }
                                    if (skipAll2 <= i3 && !getHighSpeedVideoFpsRanges(writeUtf8)) {
                                        if (writeUtf8.exhausted() || writeUtf8.getByte(0L) != 34) {
                                            str2 = str4;
                                            i = skipAll2;
                                            str3 = Camera2StreamConfigurationMap(writeUtf8);
                                        } else {
                                            if (writeUtf8.readByte() != 34) {
                                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                                            }
                                            okio.Buffer buffer = new okio.Buffer();
                                            while (true) {
                                                i = skipAll2;
                                                long indexOfElement = writeUtf8.indexOfElement(getHighResolutionOutputSizeshNQ4ISI);
                                                if (indexOfElement == -1) {
                                                    break;
                                                }
                                                if (writeUtf8.getByte(indexOfElement) == 34) {
                                                    buffer.write(writeUtf8, indexOfElement);
                                                    writeUtf8.readByte();
                                                    str3 = buffer.readUtf8();
                                                    break;
                                                }
                                                str2 = str4;
                                                if (writeUtf8.size() == indexOfElement + 1) {
                                                    str3 = null;
                                                    break;
                                                }
                                                buffer.write(writeUtf8, indexOfElement);
                                                writeUtf8.readByte();
                                                buffer.write(writeUtf8, 1L);
                                                str4 = str2;
                                                skipAll2 = i;
                                                str3 = null;
                                            }
                                            str2 = str4;
                                        }
                                        if (str3 != null && ((java.lang.String) linkedHashMap.put(Camera2StreamConfigurationMap, str3)) == null && (getHighSpeedVideoFpsRanges(writeUtf8) || writeUtf8.exhausted())) {
                                            str4 = str2;
                                            skipAll2 = i;
                                            i3 = 1;
                                            str3 = null;
                                            Camera2StreamConfigurationMap = null;
                                            b = kotlin.io.encoding.Base64.padSymbol;
                                        }
                                    }
                                }
                            }
                        }
                        i3 = 1;
                        str3 = null;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(Camera2StreamConfigurationMap);
                    sb.append(kotlin.text.StringsKt.repeat("=", skipAll));
                    java.util.Map singletonMap = java.util.Collections.singletonMap(str3, sb.toString());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonMap, "");
                    arrayList.add(new okhttp3.Challenge(str4, (java.util.Map<java.lang.String, java.lang.String>) singletonMap));
                }
            }
        }
        return arrayList;
    }

    private static final boolean getHighSpeedVideoFpsRanges(okio.Buffer buffer) {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte b = buffer.getByte(0L);
            if (b != 44) {
                if (b != 32 && b != 9) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final java.lang.String Camera2StreamConfigurationMap(okio.Buffer buffer) {
        long indexOfElement = buffer.indexOfElement(getHighSpeedVideoSizes);
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        if (indexOfElement != 0) {
            return buffer.readUtf8(indexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(okhttp3.CookieJar cookieJar, okhttp3.HttpUrl httpUrl, okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        if (cookieJar != okhttp3.CookieJar.NO_COOKIES) {
            java.util.List<okhttp3.Cookie> parseAll = okhttp3.Cookie.INSTANCE.parseAll(httpUrl, headers);
            if (parseAll.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(httpUrl, parseAll);
        }
    }

    public static final boolean promisesBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(response.request().method(), com.datadog.android.internal.network.HttpSpec.Method.HEAD)) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && okhttp3.internal._UtilJvmKt.headersContentLength(response) == -1 && !kotlin.text.StringsKt.equals("chunked", okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) ? false : true;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @kotlin.ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return promisesBody(response);
    }
}
