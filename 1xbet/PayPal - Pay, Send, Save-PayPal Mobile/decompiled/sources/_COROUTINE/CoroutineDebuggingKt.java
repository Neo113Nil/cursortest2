package _COROUTINE;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ARTIFICIAL_FRAME_PACKAGE_NAME", "Ljava/lang/String;", "getARTIFICIAL_FRAME_PACKAGE_NAME", "()Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoroutineDebuggingKt {
    private static final java.lang.String ARTIFICIAL_FRAME_PACKAGE_NAME = "_COROUTINE";

    public static final java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME() {
        return ARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public static final /* synthetic */ java.lang.StackTraceElement access$artificialFrame(java.lang.Throwable th, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = th.getStackTrace()[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(ARTIFICIAL_FRAME_PACKAGE_NAME);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(str);
        return new java.lang.StackTraceElement(sb.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
