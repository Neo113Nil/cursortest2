package io.ktor.http;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Cookie.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/CookieEncoding;", "", "<init>", "(Ljava/lang/String;I)V", "RAW", "DQUOTES", "URI_ENCODING", "BASE64_ENCODING", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CookieEncoding {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.http.CookieEncoding[] $VALUES;
    public static final io.ktor.http.CookieEncoding RAW = new io.ktor.http.CookieEncoding("RAW", 0);
    public static final io.ktor.http.CookieEncoding DQUOTES = new io.ktor.http.CookieEncoding("DQUOTES", 1);
    public static final io.ktor.http.CookieEncoding URI_ENCODING = new io.ktor.http.CookieEncoding("URI_ENCODING", 2);
    public static final io.ktor.http.CookieEncoding BASE64_ENCODING = new io.ktor.http.CookieEncoding("BASE64_ENCODING", 3);

    private static final /* synthetic */ io.ktor.http.CookieEncoding[] $values() {
        return new io.ktor.http.CookieEncoding[]{RAW, DQUOTES, URI_ENCODING, BASE64_ENCODING};
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.CookieEncoding> getEntries() {
        return $ENTRIES;
    }

    private CookieEncoding(java.lang.String str, int i) {
    }

    static {
        io.ktor.http.CookieEncoding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static io.ktor.http.CookieEncoding valueOf(java.lang.String str) {
        return (io.ktor.http.CookieEncoding) java.lang.Enum.valueOf(io.ktor.http.CookieEncoding.class, str);
    }

    public static io.ktor.http.CookieEncoding[] values() {
        return (io.ktor.http.CookieEncoding[]) $VALUES.clone();
    }
}
