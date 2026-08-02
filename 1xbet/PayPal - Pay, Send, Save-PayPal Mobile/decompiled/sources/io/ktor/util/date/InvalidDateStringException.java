package io.ktor.util.date;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/util/date/InvalidDateStringException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "at", "pattern", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InvalidDateStringException extends java.lang.IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidDateStringException(java.lang.String str, int i, java.lang.String str2) {
        super(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse date string: \"");
        sb.append(str);
        sb.append("\" at index ");
        sb.append(i);
        sb.append(". Pattern: \"");
        sb.append(str2);
        sb.append('\"');
    }
}
