package io.ktor.http.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lio/ktor/http/auth/HeaderValueEncoding;", "", "<init>", "(Ljava/lang/String;I)V", "QUOTED_WHEN_REQUIRED", "QUOTED_ALWAYS", "URI_ENCODE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HeaderValueEncoding {
    public static final io.ktor.http.auth.HeaderValueEncoding QUOTED_ALWAYS;
    public static final io.ktor.http.auth.HeaderValueEncoding QUOTED_WHEN_REQUIRED;
    public static final io.ktor.http.auth.HeaderValueEncoding URI_ENCODE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ io.ktor.http.auth.HeaderValueEncoding[] getHighSpeedVideoSizes;

    private HeaderValueEncoding(java.lang.String str, int i) {
    }

    static {
        io.ktor.http.auth.HeaderValueEncoding headerValueEncoding = new io.ktor.http.auth.HeaderValueEncoding("QUOTED_WHEN_REQUIRED", 0);
        QUOTED_WHEN_REQUIRED = headerValueEncoding;
        io.ktor.http.auth.HeaderValueEncoding headerValueEncoding2 = new io.ktor.http.auth.HeaderValueEncoding("QUOTED_ALWAYS", 1);
        QUOTED_ALWAYS = headerValueEncoding2;
        io.ktor.http.auth.HeaderValueEncoding headerValueEncoding3 = new io.ktor.http.auth.HeaderValueEncoding("URI_ENCODE", 2);
        URI_ENCODE = headerValueEncoding3;
        io.ktor.http.auth.HeaderValueEncoding[] headerValueEncodingArr = {headerValueEncoding, headerValueEncoding2, headerValueEncoding3};
        getHighSpeedVideoSizes = headerValueEncodingArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(headerValueEncodingArr);
    }

    public static io.ktor.http.auth.HeaderValueEncoding valueOf(java.lang.String str) {
        return (io.ktor.http.auth.HeaderValueEncoding) java.lang.Enum.valueOf(io.ktor.http.auth.HeaderValueEncoding.class, str);
    }

    public static io.ktor.http.auth.HeaderValueEncoding[] values() {
        return (io.ktor.http.auth.HeaderValueEncoding[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.auth.HeaderValueEncoding> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
