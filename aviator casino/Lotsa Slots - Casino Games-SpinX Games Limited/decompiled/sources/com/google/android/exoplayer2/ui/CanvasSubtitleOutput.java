package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class CanvasSubtitleOutput extends android.view.View implements com.google.android.exoplayer2.ui.SubtitleView.Output {
    private float bottomPaddingFraction;
    private java.util.List<com.google.android.exoplayer2.text.Cue> cues;
    private final java.util.List<com.google.android.exoplayer2.ui.SubtitlePainter> painters;
    private com.google.android.exoplayer2.ui.CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(android.content.Context context) {
        this(context, null);
    }

    public CanvasSubtitleOutput(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new java.util.ArrayList();
        this.cues = java.util.Collections.emptyList();
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(java.util.List<com.google.android.exoplayer2.text.Cue> list, com.google.android.exoplayer2.ui.CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f;
        this.textSizeType = i;
        this.bottomPaddingFraction = f2;
        while (this.painters.size() < list.size()) {
            this.painters.add(new com.google.android.exoplayer2.ui.SubtitlePainter(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.List<com.google.android.exoplayer2.text.Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float resolveTextSize = com.google.android.exoplayer2.ui.SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i);
        if (resolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            com.google.android.exoplayer2.text.Cue cue = list.get(i2);
            if (cue.verticalType != Integer.MIN_VALUE) {
                cue = repositionVerticalCue(cue);
            }
            com.google.android.exoplayer2.text.Cue cue2 = cue;
            int i3 = paddingBottom;
            this.painters.get(i2).draw(cue2, this.style, resolveTextSize, com.google.android.exoplayer2.ui.SubtitleViewUtils.resolveTextSize(cue2.textSizeType, cue2.textSize, height, i), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    private static com.google.android.exoplayer2.text.Cue repositionVerticalCue(com.google.android.exoplayer2.text.Cue cue) {
        com.google.android.exoplayer2.text.Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i = cue.lineAnchor;
        if (i == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }
}
