package io.ktor.http.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeaderValueEncoding.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/auth/HeaderValueEncoding;", "", "<init>", "(Ljava/lang/String;I)V", "QUOTED_WHEN_REQUIRED", "QUOTED_ALWAYS", "URI_ENCODE", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderValueEncoding {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.http.auth.HeaderValueEncoding[] $VALUES;
    public static final io.ktor.http.auth.HeaderValueEncoding QUOTED_WHEN_REQUIRED = new io.ktor.http.auth.HeaderValueEncoding("QUOTED_WHEN_REQUIRED", 0);
    public static final io.ktor.http.auth.HeaderValueEncoding QUOTED_ALWAYS = new io.ktor.http.auth.HeaderValueEncoding("QUOTED_ALWAYS", 1);
    public static final io.ktor.http.auth.HeaderValueEncoding URI_ENCODE = new io.ktor.http.auth.HeaderValueEncoding("URI_ENCODE", 2);

    private static final /* synthetic */ io.ktor.http.auth.HeaderValueEncoding[] $values() {
        return new io.ktor.http.auth.HeaderValueEncoding[]{QUOTED_WHEN_REQUIRED, QUOTED_ALWAYS, URI_ENCODE};
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.auth.HeaderValueEncoding> getEntries() {
        return $ENTRIES;
    }

    private HeaderValueEncoding(java.lang.String str, int i) {
    }

    static {
        io.ktor.http.auth.HeaderValueEncoding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static io.ktor.http.auth.HeaderValueEncoding valueOf(java.lang.String str) {
        return (io.ktor.http.auth.HeaderValueEncoding) java.lang.Enum.valueOf(io.ktor.http.auth.HeaderValueEncoding.class, str);
    }

    public static io.ktor.http.auth.HeaderValueEncoding[] values() {
        return (io.ktor.http.auth.HeaderValueEncoding[]) $VALUES.clone();
    }
}
