package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0018\u0010\u0003\u001a\u0006*\u00020\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u00020\u0006*\u00060\u0004j\u0002`\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/util/logging/Logger;", "getHighSpeedVideoSizes", "Ljava/util/logging/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/AssertionError;", "Lkotlin/getOutputSizes;", "", "isAndroidGetsocknameError", "(Ljava/lang/AssertionError;)Z"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _JavaIoKt {
    private static final java.util.logging.Logger getHighSpeedVideoSizes = java.util.logging.Logger.getLogger("okio.Okio");

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError assertionError) {
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "getsockname failed", false, 2, (java.lang.Object) null)) ? false : true;
    }
}
