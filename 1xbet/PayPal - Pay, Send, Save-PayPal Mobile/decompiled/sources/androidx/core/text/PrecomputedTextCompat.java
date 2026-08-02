package androidx.core.text;

/* loaded from: classes3.dex */
public class PrecomputedTextCompat implements android.text.Spannable {
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static java.util.concurrent.Executor getHighSpeedVideoSizes;
    private final android.text.Spannable Camera2StreamConfigurationMap;
    private final int[] getHighSpeedVideoFpsRanges;
    private final androidx.core.text.PrecomputedTextCompat.Params getHighSpeedVideoFpsRangesFor;
    private final android.text.PrecomputedText getOutputMinFrameDuration;

    public static final class Params {
        private final android.text.TextPaint Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final android.text.TextDirectionHeuristic getHighSpeedVideoFpsRanges;
        final android.text.PrecomputedText.Params getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        public static class Builder {
            private final android.text.TextPaint getHighResolutionOutputSizeshNQ4ISI;
            private int Camera2StreamConfigurationMap = 1;
            private int getHighSpeedVideoSizes = 1;
            private android.text.TextDirectionHeuristic getHighSpeedVideoFpsRangesFor = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public Builder(android.text.TextPaint textPaint) {
                this.getHighResolutionOutputSizeshNQ4ISI = textPaint;
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setBreakStrategy(int i) {
                this.Camera2StreamConfigurationMap = i;
                return this;
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setHyphenationFrequency(int i) {
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setTextDirection(android.text.TextDirectionHeuristic textDirectionHeuristic) {
                this.getHighSpeedVideoFpsRangesFor = textDirectionHeuristic;
                return this;
            }

            public androidx.core.text.PrecomputedTextCompat.Params build() {
                return new androidx.core.text.PrecomputedTextCompat.Params(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            }
        }

        Params(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.getHighSpeedVideoFpsRangesFor = new android.text.PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            this.Camera2StreamConfigurationMap = textPaint;
            this.getHighSpeedVideoFpsRanges = textDirectionHeuristic;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = i2;
        }

        public Params(android.text.PrecomputedText.Params params) {
            this.Camera2StreamConfigurationMap = params.getTextPaint();
            this.getHighSpeedVideoFpsRanges = params.getTextDirection();
            this.getHighResolutionOutputSizeshNQ4ISI = params.getBreakStrategy();
            this.getHighSpeedVideoSizes = params.getHyphenationFrequency();
            this.getHighSpeedVideoFpsRangesFor = android.os.Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public final android.text.TextPaint getTextPaint() {
            return this.Camera2StreamConfigurationMap;
        }

        public final android.text.TextDirectionHeuristic getTextDirection() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getBreakStrategy() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getHyphenationFrequency() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean equalsWithoutTextDirection(androidx.core.text.PrecomputedTextCompat.Params params) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == params.getBreakStrategy() && this.getHighSpeedVideoSizes == params.getHyphenationFrequency() && this.Camera2StreamConfigurationMap.getTextSize() == params.getTextPaint().getTextSize() && this.Camera2StreamConfigurationMap.getTextScaleX() == params.getTextPaint().getTextScaleX() && this.Camera2StreamConfigurationMap.getTextSkewX() == params.getTextPaint().getTextSkewX() && this.Camera2StreamConfigurationMap.getLetterSpacing() == params.getTextPaint().getLetterSpacing() && android.text.TextUtils.equals(this.Camera2StreamConfigurationMap.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) && this.Camera2StreamConfigurationMap.getFlags() == params.getTextPaint().getFlags() && this.Camera2StreamConfigurationMap.getTextLocales().equals(params.getTextPaint().getTextLocales())) {
                return this.Camera2StreamConfigurationMap.getTypeface() == null ? params.getTextPaint().getTypeface() == null : this.Camera2StreamConfigurationMap.getTypeface().equals(params.getTextPaint().getTypeface());
            }
            return false;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.core.text.PrecomputedTextCompat.Params)) {
                return false;
            }
            androidx.core.text.PrecomputedTextCompat.Params params = (androidx.core.text.PrecomputedTextCompat.Params) obj;
            return equalsWithoutTextDirection(params) && this.getHighSpeedVideoFpsRanges == params.getTextDirection();
        }

        public final int hashCode() {
            float textSize = this.Camera2StreamConfigurationMap.getTextSize();
            float textScaleX = this.Camera2StreamConfigurationMap.getTextScaleX();
            float textSkewX = this.Camera2StreamConfigurationMap.getTextSkewX();
            float letterSpacing = this.Camera2StreamConfigurationMap.getLetterSpacing();
            int flags = this.Camera2StreamConfigurationMap.getFlags();
            android.os.LocaleList textLocales = this.Camera2StreamConfigurationMap.getTextLocales();
            android.graphics.Typeface typeface = this.Camera2StreamConfigurationMap.getTypeface();
            boolean isElegantTextHeight = this.Camera2StreamConfigurationMap.isElegantTextHeight();
            return androidx.core.util.ObjectsCompat.hash(java.lang.Float.valueOf(textSize), java.lang.Float.valueOf(textScaleX), java.lang.Float.valueOf(textSkewX), java.lang.Float.valueOf(letterSpacing), java.lang.Integer.valueOf(flags), textLocales, typeface, java.lang.Boolean.valueOf(isElegantTextHeight), this.getHighSpeedVideoFpsRanges, java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("textSize=");
            sb2.append(this.Camera2StreamConfigurationMap.getTextSize());
            sb.append(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(", textScaleX=");
            sb3.append(this.Camera2StreamConfigurationMap.getTextScaleX());
            sb.append(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(", textSkewX=");
            sb4.append(this.Camera2StreamConfigurationMap.getTextSkewX());
            sb.append(sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(", letterSpacing=");
            sb5.append(this.Camera2StreamConfigurationMap.getLetterSpacing());
            sb.append(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", elegantTextHeight=");
            sb6.append(this.Camera2StreamConfigurationMap.isElegantTextHeight());
            sb.append(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(", textLocale=");
            sb7.append(this.Camera2StreamConfigurationMap.getTextLocales());
            sb.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(", typeface=");
            sb8.append(this.Camera2StreamConfigurationMap.getTypeface());
            sb.append(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(", variationSettings=");
            sb9.append(this.Camera2StreamConfigurationMap.getFontVariationSettings());
            sb.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(", textDir=");
            sb10.append(this.getHighSpeedVideoFpsRanges);
            sb.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder(", breakStrategy=");
            sb11.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder(", hyphenationFrequency=");
            sb12.append(this.getHighSpeedVideoSizes);
            sb.append(sb12.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    public static androidx.core.text.PrecomputedTextCompat create(java.lang.CharSequence charSequence, androidx.core.text.PrecomputedTextCompat.Params params) {
        androidx.core.util.Preconditions.checkNotNull(charSequence);
        androidx.core.util.Preconditions.checkNotNull(params);
        try {
            android.os.Trace.beginSection("PrecomputedText");
            if (android.os.Build.VERSION.SDK_INT >= 29 && params.getHighSpeedVideoFpsRangesFor != null) {
                return new androidx.core.text.PrecomputedTextCompat(android.text.PrecomputedText.create(charSequence, params.getHighSpeedVideoFpsRangesFor), params);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = android.text.TextUtils.indexOf(charSequence, '\n', i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(java.lang.Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
            }
            android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(params.getBreakStrategy()).setHyphenationFrequency(params.getHyphenationFrequency()).setTextDirection(params.getTextDirection()).build();
            return new androidx.core.text.PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            android.os.Trace.endSection();
        }
    }

    private PrecomputedTextCompat(java.lang.CharSequence charSequence, androidx.core.text.PrecomputedTextCompat.Params params, int[] iArr) {
        this.Camera2StreamConfigurationMap = new android.text.SpannableString(charSequence);
        this.getHighSpeedVideoFpsRangesFor = params;
        this.getHighSpeedVideoFpsRanges = iArr;
        this.getOutputMinFrameDuration = null;
    }

    private PrecomputedTextCompat(android.text.PrecomputedText precomputedText, androidx.core.text.PrecomputedTextCompat.Params params) {
        this.Camera2StreamConfigurationMap = androidx.core.text.PrecomputedTextCompat.Api28Impl.bY_(precomputedText);
        this.getHighSpeedVideoFpsRangesFor = params;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputMinFrameDuration = android.os.Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public android.text.PrecomputedText getPrecomputedText() {
        android.text.Spannable spannable = this.Camera2StreamConfigurationMap;
        if (spannable instanceof android.text.PrecomputedText) {
            return (android.text.PrecomputedText) spannable;
        }
        return null;
    }

    public androidx.core.text.PrecomputedTextCompat.Params getParams() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getParagraphCount() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.getOutputMinFrameDuration.getParagraphCount();
        }
        return this.getHighSpeedVideoFpsRanges.length;
    }

    public int getParagraphStart(int i) {
        androidx.core.util.Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.getOutputMinFrameDuration.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.getHighSpeedVideoFpsRanges[i - 1];
    }

    public int getParagraphEnd(int i) {
        androidx.core.util.Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.getOutputMinFrameDuration.getParagraphEnd(i);
        }
        return this.getHighSpeedVideoFpsRanges[i];
    }

    /* loaded from: classes7.dex */
    static class PrecomputedTextFutureTask extends java.util.concurrent.FutureTask<androidx.core.text.PrecomputedTextCompat> {

        static class PrecomputedTextCallback implements java.util.concurrent.Callable<androidx.core.text.PrecomputedTextCompat> {
            private java.lang.CharSequence Camera2StreamConfigurationMap;
            private androidx.core.text.PrecomputedTextCompat.Params getHighSpeedVideoFpsRanges;

            PrecomputedTextCallback(androidx.core.text.PrecomputedTextCompat.Params params, java.lang.CharSequence charSequence) {
                this.getHighSpeedVideoFpsRanges = params;
                this.Camera2StreamConfigurationMap = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                return androidx.core.text.PrecomputedTextCompat.create(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
            }
        }

        PrecomputedTextFutureTask(androidx.core.text.PrecomputedTextCompat.Params params, java.lang.CharSequence charSequence) {
            super(new androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback(params, charSequence));
        }
    }

    public static java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> getTextFuture(java.lang.CharSequence charSequence, androidx.core.text.PrecomputedTextCompat.Params params, java.util.concurrent.Executor executor) {
        androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask precomputedTextFutureTask = new androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask(params, charSequence);
        if (executor == null) {
            synchronized (getHighResolutionOutputSizeshNQ4ISI) {
                if (getHighSpeedVideoSizes == null) {
                    getHighSpeedVideoSizes = java.util.concurrent.Executors.newFixedThreadPool(1);
                }
                executor = getHighSpeedVideoSizes;
            }
        }
        executor.execute(precomputedTextFutureTask);
        return precomputedTextFutureTask;
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (obj instanceof android.text.style.MetricAffectingSpan) {
            throw new java.lang.IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.getOutputMinFrameDuration.setSpan(obj, i, i2, i3);
        } else {
            this.Camera2StreamConfigurationMap.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        if (obj instanceof android.text.style.MetricAffectingSpan) {
            throw new java.lang.IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.getOutputMinFrameDuration.removeSpan(obj);
        } else {
            this.Camera2StreamConfigurationMap.removeSpan(obj);
        }
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.getOutputMinFrameDuration.getSpans(i, i2, cls);
        }
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

    /* loaded from: classes7.dex */
    static class Api28Impl {
        static android.text.Spannable bY_(android.text.PrecomputedText precomputedText) {
            return precomputedText;
        }

        private Api28Impl() {
        }
    }
}
