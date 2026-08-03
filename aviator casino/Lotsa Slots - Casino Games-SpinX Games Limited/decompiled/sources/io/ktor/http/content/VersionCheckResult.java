package io.ktor.http.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Versions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "Lio/ktor/http/HttpStatusCode;", "statusCode", "<init>", "(Ljava/lang/String;ILio/ktor/http/HttpStatusCode;)V", "Lio/ktor/http/HttpStatusCode;", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "OK", "NOT_MODIFIED", "PRECONDITION_FAILED", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VersionCheckResult {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.http.content.VersionCheckResult[] $VALUES;
    private final io.ktor.http.HttpStatusCode statusCode;
    public static final io.ktor.http.content.VersionCheckResult OK = new io.ktor.http.content.VersionCheckResult("OK", 0, io.ktor.http.HttpStatusCode.INSTANCE.getOK());
    public static final io.ktor.http.content.VersionCheckResult NOT_MODIFIED = new io.ktor.http.content.VersionCheckResult("NOT_MODIFIED", 1, io.ktor.http.HttpStatusCode.INSTANCE.getNotModified());
    public static final io.ktor.http.content.VersionCheckResult PRECONDITION_FAILED = new io.ktor.http.content.VersionCheckResult("PRECONDITION_FAILED", 2, io.ktor.http.HttpStatusCode.INSTANCE.getPreconditionFailed());

    private static final /* synthetic */ io.ktor.http.content.VersionCheckResult[] $values() {
        return new io.ktor.http.content.VersionCheckResult[]{OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.content.VersionCheckResult> getEntries() {
        return $ENTRIES;
    }

    private VersionCheckResult(java.lang.String str, int i, io.ktor.http.HttpStatusCode httpStatusCode) {
        this.statusCode = httpStatusCode;
    }

    public final io.ktor.http.HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    static {
        io.ktor.http.content.VersionCheckResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static io.ktor.http.content.VersionCheckResult valueOf(java.lang.String str) {
        return (io.ktor.http.content.VersionCheckResult) java.lang.Enum.valueOf(io.ktor.http.content.VersionCheckResult.class, str);
    }

    public static io.ktor.http.content.VersionCheckResult[] values() {
        return (io.ktor.http.content.VersionCheckResult[]) $VALUES.clone();
    }
}
