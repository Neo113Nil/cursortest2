package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/getHighSpeedVideoSizes;", "locale", "Landroidx/compose/ui/text/style/TextDirection;", "resolveTextDirectionForKeyboardTypePhone", "(Ljava/util/Locale;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(java.util.Locale locale) {
        byte highResolutionOutputSizeshNQ4ISI;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.DigitDirectionalityApi28.INSTANCE.getHighSpeedVideoFpsRangesFor(locale);
        } else {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.DigitDirectionalityApi24.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(locale);
        }
        if (highResolutionOutputSizeshNQ4ISI == 1 || highResolutionOutputSizeshNQ4ISI == 2) {
            return androidx.compose.ui.text.style.TextDirection.INSTANCE.m8464getRtls_7Xco();
        }
        return androidx.compose.ui.text.style.TextDirection.INSTANCE.m8463getLtrs_7Xco();
    }
}
