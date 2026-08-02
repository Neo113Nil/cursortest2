package io.ktor.http.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "Lio/ktor/http/HttpStatusCode;", "p0", "<init>", "(Ljava/lang/String;ILio/ktor/http/HttpStatusCode;)V", "statusCode", "Lio/ktor/http/HttpStatusCode;", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, "NOT_MODIFIED", "PRECONDITION_FAILED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VersionCheckResult {
    private static final /* synthetic */ io.ktor.http.content.VersionCheckResult[] Camera2StreamConfigurationMap;
    public static final io.ktor.http.content.VersionCheckResult NOT_MODIFIED;
    public static final io.ktor.http.content.VersionCheckResult OK;
    public static final io.ktor.http.content.VersionCheckResult PRECONDITION_FAILED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final io.ktor.http.HttpStatusCode statusCode;

    private VersionCheckResult(java.lang.String str, int i, io.ktor.http.HttpStatusCode httpStatusCode) {
        this.statusCode = httpStatusCode;
    }

    public final io.ktor.http.HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    static {
        io.ktor.http.content.VersionCheckResult versionCheckResult = new io.ktor.http.content.VersionCheckResult(com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, 0, io.ktor.http.HttpStatusCode.INSTANCE.getOK());
        OK = versionCheckResult;
        io.ktor.http.content.VersionCheckResult versionCheckResult2 = new io.ktor.http.content.VersionCheckResult("NOT_MODIFIED", 1, io.ktor.http.HttpStatusCode.INSTANCE.getNotModified());
        NOT_MODIFIED = versionCheckResult2;
        io.ktor.http.content.VersionCheckResult versionCheckResult3 = new io.ktor.http.content.VersionCheckResult("PRECONDITION_FAILED", 2, io.ktor.http.HttpStatusCode.INSTANCE.getPreconditionFailed());
        PRECONDITION_FAILED = versionCheckResult3;
        io.ktor.http.content.VersionCheckResult[] versionCheckResultArr = {versionCheckResult, versionCheckResult2, versionCheckResult3};
        Camera2StreamConfigurationMap = versionCheckResultArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(versionCheckResultArr);
    }

    public static io.ktor.http.content.VersionCheckResult valueOf(java.lang.String str) {
        return (io.ktor.http.content.VersionCheckResult) java.lang.Enum.valueOf(io.ktor.http.content.VersionCheckResult.class, str);
    }

    public static io.ktor.http.content.VersionCheckResult[] values() {
        return (io.ktor.http.content.VersionCheckResult[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.http.content.VersionCheckResult> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
