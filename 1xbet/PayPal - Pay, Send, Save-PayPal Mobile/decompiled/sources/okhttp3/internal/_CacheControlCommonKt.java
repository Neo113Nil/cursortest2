package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0013\u0010\u0014\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001b\u0010\u0017\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokhttp3/CacheControl;", "", "commonToString", "(Lokhttp3/CacheControl;)Ljava/lang/String;", "", "", "commonClampToInt", "(J)I", "Lokhttp3/CacheControl$Companion;", "commonForceNetwork", "(Lokhttp3/CacheControl$Companion;)Lokhttp3/CacheControl;", "commonForceCache", "Lokhttp3/CacheControl$Builder;", "commonBuild", "(Lokhttp3/CacheControl$Builder;)Lokhttp3/CacheControl;", "commonNoCache", "(Lokhttp3/CacheControl$Builder;)Lokhttp3/CacheControl$Builder;", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "Lokhttp3/Headers;", "headers", "commonParse", "(Lokhttp3/CacheControl$Companion;Lokhttp3/Headers;)Lokhttp3/CacheControl;", "p0", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;I)I"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _CacheControlCommonKt {
    public static final int commonClampToInt(long j) {
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final java.lang.String commonToString(okhttp3.CacheControl cacheControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheControl, "");
        java.lang.String headerValue = cacheControl.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (cacheControl.noCache()) {
            sb.append("no-cache, ");
        }
        if (cacheControl.noStore()) {
            sb.append("no-store, ");
        }
        if (cacheControl.maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(cacheControl.maxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(cacheControl.sMaxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.getIsPrivate()) {
            sb.append("private, ");
        }
        if (cacheControl.getIsPublic()) {
            sb.append("public, ");
        }
        if (cacheControl.mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (cacheControl.maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(cacheControl.maxStaleSeconds());
            sb.append(", ");
        }
        if (cacheControl.minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(cacheControl.minFreshSeconds());
            sb.append(", ");
        }
        if (cacheControl.onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (cacheControl.noTransform()) {
            sb.append("no-transform, ");
        }
        if (cacheControl.immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.delete(sb.length() - 2, sb.length()), "");
        java.lang.String obj = sb.toString();
        cacheControl.setHeaderValue$okhttp(obj);
        return obj;
    }

    public static final okhttp3.CacheControl commonForceNetwork(okhttp3.CacheControl.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return new okhttp3.CacheControl.Builder().noCache().build();
    }

    public static final okhttp3.CacheControl commonForceCache(okhttp3.CacheControl.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        okhttp3.CacheControl.Builder onlyIfCached = new okhttp3.CacheControl.Builder().onlyIfCached();
        kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
        return onlyIfCached.m24295maxStaleLRDsOJo(kotlin.time.DurationKt.toDuration(Integer.MAX_VALUE, kotlin.time.DurationUnit.SECONDS)).build();
    }

    public static final okhttp3.CacheControl commonBuild(okhttp3.CacheControl.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        return new okhttp3.CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final okhttp3.CacheControl.Builder commonNoCache(okhttp3.CacheControl.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setNoCache$okhttp(true);
        return builder;
    }

    public static final okhttp3.CacheControl.Builder commonNoStore(okhttp3.CacheControl.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setNoStore$okhttp(true);
        return builder;
    }

    public static final okhttp3.CacheControl.Builder commonOnlyIfCached(okhttp3.CacheControl.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    public static final okhttp3.CacheControl.Builder commonNoTransform(okhttp3.CacheControl.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    public static final okhttp3.CacheControl.Builder commonImmutable(okhttp3.CacheControl.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setImmutable$okhttp(true);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final okhttp3.CacheControl commonParse(okhttp3.CacheControl.Companion companion, okhttp3.Headers headers) {
        int i;
        int i2;
        java.lang.String str;
        okhttp3.Headers headers2 = headers;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers2, "");
        int size = headers.size();
        boolean z = true;
        boolean z2 = true;
        int i3 = 0;
        java.lang.String str2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i3 < size) {
            java.lang.String name2 = headers2.name(i3);
            java.lang.String value = headers2.value(i3);
            if (kotlin.text.StringsKt.equals(name2, "Cache-Control", z)) {
                if (str2 == null) {
                    str2 = value;
                    for (i = 0; i < value.length(); i = i2) {
                        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(value, "=,;", i);
                        java.lang.String substring = value.substring(i, Camera2StreamConfigurationMap);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        java.lang.String obj = kotlin.text.StringsKt.trim(substring).toString();
                        if (Camera2StreamConfigurationMap == value.length() || value.charAt(Camera2StreamConfigurationMap) == ',' || value.charAt(Camera2StreamConfigurationMap) == ';') {
                            i2 = Camera2StreamConfigurationMap + 1;
                            str = null;
                        } else {
                            int indexOfNonWhitespace = okhttp3.internal._UtilCommonKt.indexOfNonWhitespace(value, Camera2StreamConfigurationMap + 1);
                            if (indexOfNonWhitespace < value.length() && value.charAt(indexOfNonWhitespace) == '\"') {
                                int i8 = indexOfNonWhitespace + 1;
                                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) value, '\"', i8, false, 4, (java.lang.Object) null);
                                str = value.substring(i8, indexOf$default);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                                i2 = indexOf$default + 1;
                            } else {
                                i2 = Camera2StreamConfigurationMap(value, ",;", indexOfNonWhitespace);
                                java.lang.String substring2 = value.substring(indexOfNonWhitespace, i2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                                str = kotlin.text.StringsKt.trim(substring2).toString();
                            }
                        }
                        if (kotlin.text.StringsKt.equals("no-cache", obj, true)) {
                            z3 = true;
                        } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.NO_STORE, obj, true)) {
                            z4 = true;
                        } else {
                            if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MAX_AGE, obj, true)) {
                                i4 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(str, -1);
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.S_MAX_AGE, obj, true)) {
                                i5 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(str, -1);
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.PRIVATE, obj, true)) {
                                z5 = true;
                            } else if (kotlin.text.StringsKt.equals("public", obj, true)) {
                                z6 = true;
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MUST_REVALIDATE, obj, true)) {
                                z7 = true;
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MAX_STALE, obj, true)) {
                                i6 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(str, Integer.MAX_VALUE);
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.MIN_FRESH, obj, true)) {
                                i7 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(str, -1);
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.ONLY_IF_CACHED, obj, true)) {
                                z8 = true;
                            } else if (kotlin.text.StringsKt.equals(io.ktor.client.utils.CacheControl.NO_TRANSFORM, obj, true)) {
                                z9 = true;
                            } else if (kotlin.text.StringsKt.equals("immutable", obj, true)) {
                                z10 = true;
                            }
                            z = true;
                        }
                        z = true;
                    }
                    i3++;
                    z = z;
                    headers2 = headers;
                }
            } else if (!kotlin.text.StringsKt.equals(name2, com.google.common.net.HttpHeaders.PRAGMA, z)) {
                i3++;
                z = z;
                headers2 = headers;
            }
            z2 = false;
            while (i < value.length()) {
            }
            i3++;
            z = z;
            headers2 = headers;
        }
        return new okhttp3.CacheControl(z3, z4, i4, i5, z5, z6, z7, i6, i7, z8, z9, z10, !z2 ? null : str2);
    }

    private static final int Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, str.charAt(i), false, 2, (java.lang.Object) null)) {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
