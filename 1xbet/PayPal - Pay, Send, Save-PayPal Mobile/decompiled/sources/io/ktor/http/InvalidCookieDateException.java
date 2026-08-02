package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InvalidCookieDateException extends java.lang.IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidCookieDateException(java.lang.String str, java.lang.String str2) {
        super(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse date string: \"");
        sb.append(str);
        sb.append("\". Reason: \"");
        sb.append(str2);
        sb.append('\"');
    }
}
