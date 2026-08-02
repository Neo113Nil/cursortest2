package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class TextDrawableHelper {
    private com.google.android.material.resources.TextAppearance textAppearance;
    private float textHeight;
    private float textWidth;
    private final android.text.TextPaint textPaint = new android.text.TextPaint(1);
    private final com.google.android.material.resources.TextAppearanceFontCallback fontCallback = new com.google.android.material.resources.TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(android.graphics.Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            com.google.android.material.internal.TextDrawableHelper.this.textSizeDirty = true;
            com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate textDrawableDelegate = (com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate) com.google.android.material.internal.TextDrawableHelper.this.delegate.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            com.google.android.material.internal.TextDrawableHelper.this.textSizeDirty = true;
            com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate textDrawableDelegate = (com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate) com.google.android.material.internal.TextDrawableHelper.this.delegate.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }
    };
    private boolean textSizeDirty = true;
    private java.lang.ref.WeakReference<com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate> delegate = new java.lang.ref.WeakReference<>(null);

    public interface TextDrawableDelegate {
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    public void setDelegate(com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate textDrawableDelegate) {
        this.delegate = new java.lang.ref.WeakReference<>(textDrawableDelegate);
    }

    public android.text.TextPaint getTextPaint() {
        return this.textPaint;
    }

    public void setTextWidthDirty(boolean z) {
        this.textSizeDirty = z;
    }

    public boolean isTextWidthDirty() {
        return this.textSizeDirty;
    }

    public void setTextSizeDirty(boolean z) {
        this.textSizeDirty = z;
    }

    private void refreshTextDimens(java.lang.String str) {
        this.textWidth = calculateTextWidth(str);
        this.textHeight = calculateTextHeight(str);
        this.textSizeDirty = false;
    }

    public float getTextWidth(java.lang.String str) {
        if (!this.textSizeDirty) {
            return this.textWidth;
        }
        refreshTextDimens(str);
        return this.textWidth;
    }

    private float calculateTextWidth(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float getTextHeight(java.lang.String str) {
        if (!this.textSizeDirty) {
            return this.textHeight;
        }
        refreshTextDimens(str);
        return this.textHeight;
    }

    private float calculateTextHeight(java.lang.String str) {
        if (str == null) {
            return 0.0f;
        }
        return java.lang.Math.abs(this.textPaint.getFontMetrics().ascent);
    }

    public com.google.android.material.resources.TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public void setTextAppearance(com.google.android.material.resources.TextAppearance textAppearance, android.content.Context context) {
        if (this.textAppearance != textAppearance) {
            this.textAppearance = textAppearance;
            if (textAppearance != null) {
                textAppearance.updateMeasureState(context, this.textPaint, this.fontCallback);
                com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate textDrawableDelegate = this.delegate.get();
                if (textDrawableDelegate != null) {
                    this.textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
                this.textSizeDirty = true;
            }
            com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate textDrawableDelegate2 = this.delegate.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void updateTextPaintDrawState(android.content.Context context) {
        this.textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
    }
}
