package androidx.media3.common.text;

/* loaded from: classes7.dex */
final class CustomSpanBundler {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    public static java.util.ArrayList<android.os.Bundle> getHighSpeedVideoFpsRangesFor(android.text.Spanned spanned) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
        for (androidx.media3.common.text.RubySpan rubySpan : (androidx.media3.common.text.RubySpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.RubySpan.class)) {
            arrayList.add(getHighSpeedVideoFpsRangesFor(spanned, rubySpan, 1, rubySpan.toBundle()));
        }
        for (androidx.media3.common.text.TextEmphasisSpan textEmphasisSpan : (androidx.media3.common.text.TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.TextEmphasisSpan.class)) {
            arrayList.add(getHighSpeedVideoFpsRangesFor(spanned, textEmphasisSpan, 2, textEmphasisSpan.toBundle()));
        }
        for (androidx.media3.common.text.HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (androidx.media3.common.text.HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.HorizontalTextInVerticalContextSpan.class)) {
            arrayList.add(getHighSpeedVideoFpsRangesFor(spanned, horizontalTextInVerticalContextSpan, 3, null));
        }
        for (androidx.media3.common.text.VoiceSpan voiceSpan : (androidx.media3.common.text.VoiceSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.VoiceSpan.class)) {
            arrayList.add(getHighSpeedVideoFpsRangesFor(spanned, voiceSpan, 4, voiceSpan.toBundle()));
        }
        return arrayList;
    }

    public static void Camera2StreamConfigurationMap(android.os.Bundle bundle, android.text.Spannable spannable) {
        int i = bundle.getInt(getHighSpeedVideoFpsRangesFor);
        int i2 = bundle.getInt(getHighResolutionOutputSizeshNQ4ISI);
        int i3 = bundle.getInt(getHighSpeedVideoSizes);
        int i4 = bundle.getInt(getHighSpeedVideoFpsRanges, -1);
        android.os.Bundle bundle2 = bundle.getBundle(Camera2StreamConfigurationMap);
        if (i4 == 1) {
            spannable.setSpan(androidx.media3.common.text.RubySpan.fromBundle((android.os.Bundle) com.google.common.base.Preconditions.checkNotNull(bundle2)), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            spannable.setSpan(androidx.media3.common.text.TextEmphasisSpan.fromBundle((android.os.Bundle) com.google.common.base.Preconditions.checkNotNull(bundle2)), i, i2, i3);
        } else if (i4 == 3) {
            spannable.setSpan(new androidx.media3.common.text.HorizontalTextInVerticalContextSpan(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            spannable.setSpan(androidx.media3.common.text.VoiceSpan.fromBundle((android.os.Bundle) com.google.common.base.Preconditions.checkNotNull(bundle2)), i, i2, i3);
        }
    }

    private static android.os.Bundle getHighSpeedVideoFpsRangesFor(android.text.Spanned spanned, java.lang.Object obj, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(getHighSpeedVideoFpsRangesFor, spanned.getSpanStart(obj));
        bundle2.putInt(getHighResolutionOutputSizeshNQ4ISI, spanned.getSpanEnd(obj));
        bundle2.putInt(getHighSpeedVideoSizes, spanned.getSpanFlags(obj));
        bundle2.putInt(getHighSpeedVideoFpsRanges, i);
        if (bundle != null) {
            bundle2.putBundle(Camera2StreamConfigurationMap, bundle);
        }
        return bundle2;
    }

    private CustomSpanBundler() {
    }
}
