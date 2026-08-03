package io.ktor.http;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Ranges.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/RangeUnits;", "", "", "unitToken", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUnitToken", "()Ljava/lang/String;", "Bytes", "None", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RangeUnits {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.http.RangeUnits[] $VALUES;
    public static final io.ktor.http.RangeUnits Bytes = new io.ktor.http.RangeUnits("Bytes", 0, "bytes");
    public static final io.ktor.http.RangeUnits None = new io.ktor.http.RangeUnits("None", 1, "none");
    private final java.lang.String unitToken;

    private static final /* synthetic */ io.ktor.http.RangeUnits[] $values() {
        return new io.ktor.http.RangeUnits[]{Bytes, None};
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.RangeUnits> getEntries() {
        return $ENTRIES;
    }

    private RangeUnits(java.lang.String str, int i, java.lang.String str2) {
        this.unitToken = str2;
    }

    public final java.lang.String getUnitToken() {
        return this.unitToken;
    }

    static {
        io.ktor.http.RangeUnits[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static io.ktor.http.RangeUnits valueOf(java.lang.String str) {
        return (io.ktor.http.RangeUnits) java.lang.Enum.valueOf(io.ktor.http.RangeUnits.class, str);
    }

    public static io.ktor.http.RangeUnits[] values() {
        return (io.ktor.http.RangeUnits[]) $VALUES.clone();
    }
}
