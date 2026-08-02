package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\u000b"}, d2 = {"Lkotlinx/datetime/DateTimeFormatException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "", "cause", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateTimeFormatException extends java.lang.IllegalArgumentException {
    public DateTimeFormatException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeFormatException(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeFormatException(java.lang.Throwable th) {
        super(th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeFormatException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
    }
}
