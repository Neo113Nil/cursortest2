package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/DigitDirectionalityApi28;", "", "<init>", "()V", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/getHighSpeedVideoSizes;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/Locale;)B"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DigitDirectionalityApi28 {
    public static final androidx.compose.foundation.text.input.internal.DigitDirectionalityApi28 INSTANCE = new androidx.compose.foundation.text.input.internal.DigitDirectionalityApi28();

    private DigitDirectionalityApi28() {
    }

    public final byte getHighSpeedVideoFpsRangesFor(java.util.Locale p0) {
        return java.lang.Character.getDirectionality(androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.codePointAt(android.icu.text.DecimalFormatSymbols.getInstance(p0).getDigitStrings()[0], 0));
    }
}
