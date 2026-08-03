package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class HttpUtil {
    private static final java.lang.String TAG = "HttpUtil";
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_START_AND_END = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_SIZE = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static java.lang.String buildRangeRequestHeader(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long getDocumentSize(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (matcher.matches()) {
            return java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long getContentLength(java.lang.String str, java.lang.String str2) {
        long parseLong;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                parseLong = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                androidx.media3.common.util.Log.e(TAG, "Unexpected Content-Length [" + str + com.ironsource.X3.j.e);
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                return parseLong;
            }
            java.util.regex.Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
            if (!matcher.matches()) {
                return parseLong;
            }
            try {
                long parseLong2 = (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))) - java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)))) + 1;
                if (parseLong < 0) {
                    return parseLong2;
                }
                if (parseLong == parseLong2) {
                    return parseLong;
                }
                androidx.media3.common.util.Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + com.ironsource.X3.j.e);
                return java.lang.Math.max(parseLong, parseLong2);
            } catch (java.lang.NumberFormatException unused2) {
                androidx.media3.common.util.Log.e(TAG, "Unexpected Content-Range [" + str2 + com.ironsource.X3.j.e);
                return parseLong;
            }
        }
        parseLong = -1;
        if (!android.text.TextUtils.isEmpty(str2)) {
        }
    }
}
