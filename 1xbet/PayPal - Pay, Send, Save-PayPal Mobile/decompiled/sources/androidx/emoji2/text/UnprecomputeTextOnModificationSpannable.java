package androidx.emoji2.text;

/* loaded from: classes7.dex */
class UnprecomputeTextOnModificationSpannable implements android.text.Spannable {
    android.text.Spannable Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges = false;

    UnprecomputeTextOnModificationSpannable(android.text.Spannable spannable) {
        this.Camera2StreamConfigurationMap = spannable;
    }

    UnprecomputeTextOnModificationSpannable(java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap = new android.text.SpannableString(charSequence);
    }

    private void getHighSpeedVideoFpsRanges() {
        android.text.Spannable spannable = this.Camera2StreamConfigurationMap;
        if (!this.getHighSpeedVideoFpsRanges) {
            if ((android.os.Build.VERSION.SDK_INT < 28 ? new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector() : new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector_28()).getHighResolutionOutputSizeshNQ4ISI(spannable)) {
                this.Camera2StreamConfigurationMap = new android.text.SpannableString(spannable);
            }
        }
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        getHighSpeedVideoFpsRanges();
        this.Camera2StreamConfigurationMap.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        getHighSpeedVideoFpsRanges();
        this.Camera2StreamConfigurationMap.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, java.lang.Class<T> cls) {
        return (T[]) this.Camera2StreamConfigurationMap.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        return this.Camera2StreamConfigurationMap.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        return this.Camera2StreamConfigurationMap.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        return this.Camera2StreamConfigurationMap.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        return this.Camera2StreamConfigurationMap.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.Camera2StreamConfigurationMap.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.Camera2StreamConfigurationMap.charAt(i);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return this.Camera2StreamConfigurationMap.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.Camera2StreamConfigurationMap.toString();
    }

    @Override // java.lang.CharSequence
    public java.util.stream.IntStream chars() {
        return androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    @Override // java.lang.CharSequence
    public java.util.stream.IntStream codePoints() {
        return androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap);
    }

    static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
        }

        static java.util.stream.IntStream getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence) {
            return charSequence.codePoints();
        }

        static java.util.stream.IntStream getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            return charSequence.chars();
        }
    }

    static class PrecomputedTextDetector {
        PrecomputedTextDetector() {
        }

        boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.PrecomputedTextCompat;
        }
    }

    static class PrecomputedTextDetector_28 extends androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector {
        PrecomputedTextDetector_28() {
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            return (charSequence instanceof android.text.PrecomputedText) || (charSequence instanceof androidx.core.text.PrecomputedTextCompat);
        }
    }
}
