package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/parsing/ParseException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParseException extends java.lang.IllegalArgumentException {
    private final java.lang.Throwable cause;
    private final java.lang.String message;

    public /* synthetic */ ParseException(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.cause = th;
    }
}
