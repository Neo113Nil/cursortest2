package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public final class SubtitleView extends android.widget.FrameLayout {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private java.util.List<com.google.android.exoplayer2.text.Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private android.view.View innerSubtitleView;
    private com.google.android.exoplayer2.ui.SubtitleView.Output output;
    private com.google.android.exoplayer2.ui.CaptionStyleCompat style;
    private int viewType;

    interface Output {
        void update(java.util.List<com.google.android.exoplayer2.text.Cue> list, com.google.android.exoplayer2.ui.CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(android.content.Context context) {
        this(context, null);
    }

    public SubtitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cues = java.util.Collections.emptyList();
        this.style = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT;
        this.defaultTextSizeType = 0;
        this.defaultTextSize = 0.0533f;
        this.bottomPaddingFraction = 0.08f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        com.google.android.exoplayer2.ui.CanvasSubtitleOutput canvasSubtitleOutput = new com.google.android.exoplayer2.ui.CanvasSubtitleOutput(context);
        this.output = canvasSubtitleOutput;
        this.innerSubtitleView = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.viewType = 1;
    }

    public void setCues(java.util.List<com.google.android.exoplayer2.text.Cue> list) {
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        this.cues = list;
        updateOutput();
    }

    public void setViewType(int i) {
        if (this.viewType == i) {
            return;
        }
        if (i == 1) {
            setView(new com.google.android.exoplayer2.ui.CanvasSubtitleOutput(getContext()));
        } else if (i == 2) {
            setView(new com.google.android.exoplayer2.ui.WebViewSubtitleOutput(getContext()));
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        this.viewType = i;
    }

    private <T extends android.view.View & com.google.android.exoplayer2.ui.SubtitleView.Output> void setView(T t) {
        removeView(this.innerSubtitleView);
        android.view.View view = this.innerSubtitleView;
        if (view instanceof com.google.android.exoplayer2.ui.WebViewSubtitleOutput) {
            ((com.google.android.exoplayer2.ui.WebViewSubtitleOutput) view).destroy();
        }
        this.innerSubtitleView = t;
        this.output = t;
        addView(t);
    }

    public void setFixedTextSize(int i, float f) {
        android.content.res.Resources resources;
        android.content.Context context = getContext();
        if (context == null) {
            resources = android.content.res.Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        setTextSize(2, android.util.TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public void setFractionalTextSize(float f, boolean z) {
        setTextSize(z ? 1 : 0, f);
    }

    private void setTextSize(int i, float f) {
        this.defaultTextSizeType = i;
        this.defaultTextSize = f;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.applyEmbeddedStyles = z;
        updateOutput();
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.applyEmbeddedFontSizes = z;
        updateOutput();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setStyle(com.google.android.exoplayer2.ui.CaptionStyleCompat captionStyleCompat) {
        this.style = captionStyleCompat;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f) {
        this.bottomPaddingFraction = f;
        updateOutput();
    }

    private float getUserCaptionFontScale() {
        android.view.accessibility.CaptioningManager captioningManager;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 19 || isInEditMode() || (captioningManager = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private com.google.android.exoplayer2.ui.CaptionStyleCompat getUserCaptionStyle() {
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 19 || isInEditMode()) {
            return com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT;
        }
        android.view.accessibility.CaptioningManager captioningManager = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return com.google.android.exoplayer2.ui.CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
        }
        return com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT;
    }

    private void updateOutput() {
        this.output.update(getCuesWithStylingPreferencesApplied(), this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    private java.util.List<com.google.android.exoplayer2.text.Cue> getCuesWithStylingPreferencesApplied() {
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            return this.cues;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.cues.size());
        for (int i = 0; i < this.cues.size(); i++) {
            arrayList.add(removeEmbeddedStyling(this.cues.get(i)));
        }
        return arrayList;
    }

    private com.google.android.exoplayer2.text.Cue removeEmbeddedStyling(com.google.android.exoplayer2.text.Cue cue) {
        com.google.android.exoplayer2.text.Cue.Builder buildUpon = cue.buildUpon();
        if (!this.applyEmbeddedStyles) {
            com.google.android.exoplayer2.ui.SubtitleViewUtils.removeAllEmbeddedStyling(buildUpon);
        } else if (!this.applyEmbeddedFontSizes) {
            com.google.android.exoplayer2.ui.SubtitleViewUtils.removeEmbeddedFontSizes(buildUpon);
        }
        return buildUpon.build();
    }
}
