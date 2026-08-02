package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/runtime/tooling/ParseException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "p0", "<init>", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParseException extends java.lang.Exception {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    public ParseException(java.lang.String str) {
        super(str);
        this.getHighSpeedVideoSizes = str;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.getHighSpeedVideoSizes;
    }
}
