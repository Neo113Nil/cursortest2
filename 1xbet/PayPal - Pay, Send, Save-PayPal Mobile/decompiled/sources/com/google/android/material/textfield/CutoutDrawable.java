package com.google.android.material.textfield;

/* loaded from: classes8.dex */
class CutoutDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
    com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState drawableState;

    static com.google.android.material.textfield.CutoutDrawable create(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new com.google.android.material.shape.ShapeAppearanceModel();
        }
        return create(new com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState(shapeAppearanceModel, new android.graphics.RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.material.textfield.CutoutDrawable create(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState cutoutDrawableState) {
        return new com.google.android.material.textfield.CutoutDrawable.ImplApi18(cutoutDrawableState);
    }

    private CutoutDrawable(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState cutoutDrawableState) {
        super(cutoutDrawableState);
        this.drawableState = cutoutDrawableState;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        this.drawableState = new com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState(this.drawableState);
        return this;
    }

    boolean hasCutout() {
        return !this.drawableState.cutoutBounds.isEmpty();
    }

    void setCutout(float f, float f2, float f3, float f4) {
        if (f == this.drawableState.cutoutBounds.left && f2 == this.drawableState.cutoutBounds.top && f3 == this.drawableState.cutoutBounds.right && f4 == this.drawableState.cutoutBounds.bottom) {
            return;
        }
        this.drawableState.cutoutBounds.set(f, f2, f3, f4);
        invalidateSelf();
    }

    void setCutout(android.graphics.RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    static class ImplApi18 extends com.google.android.material.textfield.CutoutDrawable {
        ImplApi18(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(android.graphics.Canvas canvas) {
            if (this.drawableState.cutoutBounds.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.drawableState.cutoutBounds);
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    static class ImplApi14 extends com.google.android.material.textfield.CutoutDrawable {
        private android.graphics.Paint cutoutPaint;
        private int savedLayer;

        ImplApi14(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            preDraw(canvas);
            super.draw(canvas);
            postDraw(canvas);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(android.graphics.Canvas canvas) {
            super.drawStrokeShape(canvas);
            canvas.drawRect(this.drawableState.cutoutBounds, getCutoutPaint());
        }

        private android.graphics.Paint getCutoutPaint() {
            if (this.cutoutPaint == null) {
                android.graphics.Paint paint = new android.graphics.Paint(1);
                this.cutoutPaint = paint;
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                this.cutoutPaint.setColor(-1);
                this.cutoutPaint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
            }
            return this.cutoutPaint;
        }

        private void preDraw(android.graphics.Canvas canvas) {
            android.graphics.drawable.Drawable.Callback callback = getCallback();
            if (useHardwareLayer(callback)) {
                android.view.View view = (android.view.View) callback;
                if (view.getLayerType() != 2) {
                    view.setLayerType(2, null);
                    return;
                }
                return;
            }
            saveCanvasLayer(canvas);
        }

        private void saveCanvasLayer(android.graphics.Canvas canvas) {
            this.savedLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        private void postDraw(android.graphics.Canvas canvas) {
            if (useHardwareLayer(getCallback())) {
                return;
            }
            canvas.restoreToCount(this.savedLayer);
        }

        private boolean useHardwareLayer(android.graphics.drawable.Drawable.Callback callback) {
            return callback instanceof android.view.View;
        }
    }

    static final class CutoutDrawableState extends com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState {
        private final android.graphics.RectF cutoutBounds;

        private CutoutDrawableState(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, android.graphics.RectF rectF) {
            super(shapeAppearanceModel, null);
            this.cutoutBounds = rectF;
        }

        private CutoutDrawableState(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.cutoutBounds = cutoutDrawableState.cutoutBounds;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable() {
            com.google.android.material.textfield.CutoutDrawable create = com.google.android.material.textfield.CutoutDrawable.create(this);
            create.invalidateSelf();
            return create;
        }
    }
}
