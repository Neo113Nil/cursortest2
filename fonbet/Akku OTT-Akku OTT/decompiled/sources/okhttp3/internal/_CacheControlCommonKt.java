package okhttp3.internal;

import androidx.collection.SieveCacheKt;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\f\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000e\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0002¨\u0006\u0016"}, d2 = {"commonToString", "", "Lokhttp3/CacheControl;", "commonClampToInt", "", "", "commonForceNetwork", "Lokhttp3/CacheControl$Companion;", "commonForceCache", "commonBuild", "Lokhttp3/CacheControl$Builder;", "commonNoCache", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "commonParse", "headers", "Lokhttp3/Headers;", "indexOfElement", "characters", SpellCheckPlugin.START_INDEX_KEY, "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _CacheControlCommonKt {
    public static final CacheControl commonBuild(CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return new CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final int commonClampToInt(long j) {
        if (j > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final CacheControl commonForceCache(CacheControl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        CacheControl.Builder onlyIfCached = new CacheControl.Builder().onlyIfCached();
        Duration.Companion companion2 = Duration.INSTANCE;
        return onlyIfCached.m3228maxStaleLRDsOJo(DurationKt.toDuration(Integer.MAX_VALUE, DurationUnit.SECONDS)).build();
    }

    public static final CacheControl commonForceNetwork(CacheControl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new CacheControl.Builder().noCache().build();
    }

    public static final CacheControl.Builder commonImmutable(CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setImmutable$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoCache(CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setNoCache$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoStore(CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setNoStore$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoTransform(CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonOnlyIfCached(CacheControl.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CacheControl commonParse(CacheControl.Companion companion, Headers headers) {
        boolean equals;
        boolean equals2;
        int i;
        CharSequence trim;
        int i2;
        int i3;
        String str;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        boolean equals7;
        boolean equals8;
        boolean equals9;
        boolean equals10;
        boolean equals11;
        boolean equals12;
        boolean equals13;
        boolean equals14;
        CharSequence trim2;
        int indexOf$default;
        Headers headers2 = headers;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(headers2, "headers");
        int size = headers2.size();
        int i4 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < size) {
            String name = headers2.name(i4);
            String value = headers2.value(i4);
            equals = StringsKt__StringsJVMKt.equals(name, RtspHeaders.CACHE_CONTROL, true);
            if (!equals) {
                equals2 = StringsKt__StringsJVMKt.equals(name, "Pragma", true);
                if (!equals2) {
                    i4++;
                    headers2 = headers;
                    size = size;
                }
            } else if (str2 == null) {
                str2 = value;
                i = 0;
                while (i < value.length()) {
                    int indexOfElement = indexOfElement(value, "=,;", i);
                    String substring = value.substring(i, indexOfElement);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    trim = StringsKt__StringsKt.trim((CharSequence) substring);
                    String obj = trim.toString();
                    if (indexOfElement != value.length()) {
                        i2 = size;
                        if (value.charAt(indexOfElement) != ',' && value.charAt(indexOfElement) != ';') {
                            int indexOfNonWhitespace = _UtilCommonKt.indexOfNonWhitespace(value, indexOfElement + 1);
                            if (indexOfNonWhitespace >= value.length() || value.charAt(indexOfNonWhitespace) != '\"') {
                                i3 = indexOfElement(value, ",;", indexOfNonWhitespace);
                                String substring2 = value.substring(indexOfNonWhitespace, i3);
                                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                trim2 = StringsKt__StringsKt.trim((CharSequence) substring2);
                                str = trim2.toString();
                            } else {
                                int i9 = indexOfNonWhitespace + 1;
                                indexOf$default = StringsKt__StringsKt.indexOf$default(value, Typography.quote, i9, false, 4, (Object) null);
                                str = value.substring(i9, indexOf$default);
                                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                                i3 = indexOf$default + 1;
                            }
                            equals3 = StringsKt__StringsJVMKt.equals("no-cache", obj, true);
                            if (equals3) {
                                equals4 = StringsKt__StringsJVMKt.equals("no-store", obj, true);
                                if (equals4) {
                                    i = i3;
                                    z3 = true;
                                } else {
                                    equals5 = StringsKt__StringsJVMKt.equals("max-age", obj, true);
                                    if (equals5) {
                                        i5 = _UtilCommonKt.toNonNegativeInt(str, -1);
                                    } else {
                                        equals6 = StringsKt__StringsJVMKt.equals("s-maxage", obj, true);
                                        if (equals6) {
                                            i6 = _UtilCommonKt.toNonNegativeInt(str, -1);
                                        } else {
                                            equals7 = StringsKt__StringsJVMKt.equals("private", obj, true);
                                            if (equals7) {
                                                i = i3;
                                                z4 = true;
                                            } else {
                                                equals8 = StringsKt__StringsJVMKt.equals("public", obj, true);
                                                if (equals8) {
                                                    i = i3;
                                                    z5 = true;
                                                } else {
                                                    equals9 = StringsKt__StringsJVMKt.equals("must-revalidate", obj, true);
                                                    if (equals9) {
                                                        i = i3;
                                                        z6 = true;
                                                    } else {
                                                        equals10 = StringsKt__StringsJVMKt.equals("max-stale", obj, true);
                                                        if (equals10) {
                                                            i7 = _UtilCommonKt.toNonNegativeInt(str, Integer.MAX_VALUE);
                                                        } else {
                                                            equals11 = StringsKt__StringsJVMKt.equals("min-fresh", obj, true);
                                                            if (equals11) {
                                                                i8 = _UtilCommonKt.toNonNegativeInt(str, -1);
                                                            } else {
                                                                equals12 = StringsKt__StringsJVMKt.equals("only-if-cached", obj, true);
                                                                if (equals12) {
                                                                    i = i3;
                                                                    z7 = true;
                                                                } else {
                                                                    equals13 = StringsKt__StringsJVMKt.equals("no-transform", obj, true);
                                                                    if (equals13) {
                                                                        i = i3;
                                                                        z8 = true;
                                                                    } else {
                                                                        equals14 = StringsKt__StringsJVMKt.equals("immutable", obj, true);
                                                                        if (equals14) {
                                                                            i = i3;
                                                                            z9 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i3;
                                }
                            } else {
                                i = i3;
                                z2 = true;
                            }
                            size = i2;
                        }
                    } else {
                        i2 = size;
                    }
                    i3 = indexOfElement + 1;
                    str = null;
                    equals3 = StringsKt__StringsJVMKt.equals("no-cache", obj, true);
                    if (equals3) {
                    }
                    size = i2;
                }
                i4++;
                headers2 = headers;
                size = size;
            }
            z = false;
            i = 0;
            while (i < value.length()) {
            }
            i4++;
            headers2 = headers;
            size = size;
        }
        return new CacheControl(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
    }

    public static final String commonToString(CacheControl cacheControl) {
        Intrinsics.checkNotNullParameter(cacheControl, "<this>");
        String headerValue = cacheControl.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb = new StringBuilder();
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
        Intrinsics.checkNotNullExpressionValue(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        cacheControl.setHeaderValue$okhttp(sb2);
        return sb2;
    }

    private static final int indexOfElement(String str, String str2, int i) {
        boolean contains$default;
        int length = str.length();
        while (i < length) {
            contains$default = StringsKt__StringsKt.contains$default(str2, str.charAt(i), false, 2, (Object) null);
            if (contains$default) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfElement$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOfElement(str, str2, i);
    }
}
