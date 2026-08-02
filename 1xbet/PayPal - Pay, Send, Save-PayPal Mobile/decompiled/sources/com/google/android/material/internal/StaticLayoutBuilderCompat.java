package com.google.android.material.internal;

/* loaded from: classes8.dex */
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 1;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final java.lang.String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final java.lang.String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final java.lang.String TEXT_DIR_CLASS_LTR = "LTR";
    private static final java.lang.String TEXT_DIR_CLASS_RTL = "RTL";
    private static java.lang.reflect.Constructor<android.text.StaticLayout> constructor;
    private static boolean initialized;
    private static java.lang.Object textDirection;
    private int end;
    private boolean isRtl;
    private final android.text.TextPaint paint;
    private java.lang.CharSequence source;
    private com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;
    private int start = 0;
    private android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
    private int maxLines = Integer.MAX_VALUE;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
    private boolean includePad = true;
    private android.text.TextUtils.TruncateAt ellipsize = null;

    private StaticLayoutBuilderCompat(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i;
        this.end = charSequence.length();
    }

    public static com.google.android.material.internal.StaticLayoutBuilderCompat obtain(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        return new com.google.android.material.internal.StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setAlignment(android.text.Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setIncludePad(boolean z) {
        this.includePad = z;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setStart(int i) {
        this.start = i;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setEnd(int i) {
        this.end = i;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setMaxLines(int i) {
        this.maxLines = i;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setLineSpacing(float f, float f2) {
        this.lineSpacingAdd = f;
        this.lineSpacingMultiplier = f2;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setHyphenationFrequency(int i) {
        this.hyphenationFrequency = i;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
        return this;
    }

    public final android.text.StaticLayout build() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        if (this.source == null) {
            this.source = "";
        }
        int max = java.lang.Math.max(0, this.width);
        java.lang.CharSequence charSequence = this.source;
        if (this.maxLines == 1) {
            charSequence = android.text.TextUtils.ellipsize(charSequence, this.paint, max, this.ellipsize);
        }
        this.end = java.lang.Math.min(charSequence.length(), this.end);
        if (this.isRtl && this.maxLines == 1) {
            this.alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, this.start, this.end, this.paint, max);
        obtain.setAlignment(this.alignment);
        obtain.setIncludePad(this.includePad);
        if (this.isRtl) {
            textDirectionHeuristic = android.text.TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        android.text.TextUtils.TruncateAt truncateAt = this.ellipsize;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.maxLines);
        float f = this.lineSpacingAdd;
        if (f != 0.0f || this.lineSpacingMultiplier != 1.0f) {
            obtain.setLineSpacing(f, this.lineSpacingMultiplier);
        }
        if (this.maxLines > 1) {
            obtain.setHyphenationFrequency(this.hyphenationFrequency);
        }
        com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(obtain);
        }
        return obtain.build();
    }

    private void createConstructorWithReflection() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
        if (initialized) {
            return;
        }
        try {
            textDirection = this.isRtl ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
            java.lang.reflect.Constructor<android.text.StaticLayout> declaredConstructor = android.text.StaticLayout.class.getDeclaredConstructor(java.lang.CharSequence.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.text.TextPaint.class, java.lang.Integer.TYPE, android.text.Layout.Alignment.class, android.text.TextDirectionHeuristic.class, java.lang.Float.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE, android.text.TextUtils.TruncateAt.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (java.lang.Exception e) {
            throw new com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException(e);
        }
    }

    public final com.google.android.material.internal.StaticLayoutBuilderCompat setIsRtl(boolean z) {
        this.isRtl = z;
        return this;
    }

    static class StaticLayoutBuilderCompatException extends java.lang.Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        StaticLayoutBuilderCompatException(java.lang.Throwable th) {
            super(r0.toString(), th);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error thrown initializing StaticLayout ");
            sb.append(th.getMessage());
        }
    }
}
