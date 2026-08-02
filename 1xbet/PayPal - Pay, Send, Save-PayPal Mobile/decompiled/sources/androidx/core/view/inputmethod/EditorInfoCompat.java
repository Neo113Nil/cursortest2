package androidx.core.view.inputmethod;

/* loaded from: classes3.dex */
public final class EditorInfoCompat {
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    private static final java.lang.String[] getHighSpeedVideoSizes = new java.lang.String[0];

    private static boolean getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = i & my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void setContentMimeTypes(android.view.inputmethod.EditorInfo editorInfo, java.lang.String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static java.lang.String[] getContentMimeTypes(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : getHighSpeedVideoSizes;
    }

    public static void setStylusHandwritingEnabled(android.view.inputmethod.EditorInfo editorInfo, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            androidx.core.view.inputmethod.EditorInfoCompat.Api35Impl.getHighResolutionOutputSizeshNQ4ISI(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static boolean isStylusHandwritingEnabled(android.view.inputmethod.EditorInfo editorInfo) {
        if (editorInfo.extras != null && editorInfo.extras.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED")) {
            return editorInfo.extras.getBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED");
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api35Impl.Camera2StreamConfigurationMap(editorInfo);
        }
        return false;
    }

    public static void setInitialSurroundingText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i) {
        int i2;
        int i3;
        androidx.core.util.Preconditions.checkNotNull(charSequence);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(editorInfo, charSequence, i);
            return;
        }
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i2 = editorInfo.initialSelEnd;
        } else {
            i2 = editorInfo.initialSelStart;
        }
        int i4 = i2 - i;
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i3 = editorInfo.initialSelStart;
        } else {
            i3 = editorInfo.initialSelEnd;
        }
        int i5 = i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            getHighSpeedVideoSizes(editorInfo, null, 0, 0);
            return;
        }
        if (getHighSpeedVideoFpsRangesFor(editorInfo.inputType)) {
            getHighSpeedVideoSizes(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            getHighSpeedVideoSizes(editorInfo, charSequence, i4, i5);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(editorInfo, charSequence, i4, i5);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i, int i2) {
        java.lang.CharSequence subSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = java.lang.Math.min(charSequence.length() - i2, i5 - java.lang.Math.min(i, (int) (i5 * 0.8d)));
        int min2 = java.lang.Math.min(i, i5 - min);
        int i6 = i - min2;
        if (getHighSpeedVideoSizes(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (getHighSpeedVideoSizes(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        if (i4 != i3) {
            subSequence = android.text.TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, min2 + i4 + min + i6);
        }
        getHighSpeedVideoSizes(editorInfo, subSequence, min2, i4 + min2);
    }

    public static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
        java.lang.CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.Camera2StreamConfigurationMap(editorInfo, i, i2);
        }
        if (editorInfo.extras == null || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int min = java.lang.Math.min(i, i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3 - min, i3);
        }
        return android.text.TextUtils.substring(charSequence, i3 - min, i3);
    }

    public static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo editorInfo, int i) {
        java.lang.CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getHighSpeedVideoFpsRanges(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = java.lang.Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = java.lang.Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int i3 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != max - min || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        if ((i & 1) != 0) {
            return charSequence.subSequence(i2, i3);
        }
        return android.text.TextUtils.substring(charSequence, i2, i3);
    }

    public static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
        java.lang.CharSequence charSequence;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getHighSpeedVideoFpsRanges(editorInfo, i, i2);
        }
        if (editorInfo.extras == null || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int min = java.lang.Math.min(i, charSequence.length() - i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3, min + i3);
        }
        return android.text.TextUtils.substring(charSequence, i3, min + i3);
    }

    private static boolean getHighSpeedVideoSizes(java.lang.CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return java.lang.Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return java.lang.Character.isHighSurrogate(charSequence.charAt(i));
    }

    private static void getHighSpeedVideoSizes(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    @java.lang.Deprecated
    public EditorInfoCompat() {
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }

        static java.lang.CharSequence Camera2StreamConfigurationMap(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        static java.lang.CharSequence getHighSpeedVideoFpsRanges(android.view.inputmethod.EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        static java.lang.CharSequence getHighSpeedVideoFpsRanges(android.view.inputmethod.EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }
    }

    /* loaded from: classes7.dex */
    static class Api35Impl {
        private Api35Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.view.inputmethod.EditorInfo editorInfo, boolean z) {
            editorInfo.setStylusHandwritingEnabled(z);
        }

        static boolean Camera2StreamConfigurationMap(android.view.inputmethod.EditorInfo editorInfo) {
            return editorInfo.isStylusHandwritingEnabled();
        }
    }
}
