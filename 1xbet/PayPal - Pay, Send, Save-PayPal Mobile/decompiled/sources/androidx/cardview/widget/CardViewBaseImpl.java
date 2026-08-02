package androidx.cardview.widget;

/* loaded from: classes6.dex */
class CardViewBaseImpl implements androidx.cardview.widget.CardViewImpl {
    final android.graphics.RectF getHighSpeedVideoSizes = new android.graphics.RectF();

    @Override // androidx.cardview.widget.CardViewImpl
    public void getOutputMinFrameDuration(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
    }

    CardViewBaseImpl() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRanges() {
        androidx.cardview.widget.RoundRectDrawableWithShadow.getHighSpeedVideoSizes = new androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewBaseImpl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void getHighSpeedVideoSizes(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint) {
                float f2 = f * 2.0f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = rectF.height();
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    androidx.cardview.widget.CardViewBaseImpl.this.getHighSpeedVideoSizes.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.getHighSpeedVideoSizes, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.getHighSpeedVideoSizes, 180.0f, 90.0f, true, paint);
                    canvas.translate((height - f2) - 1.0f, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.getHighSpeedVideoSizes, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.getHighSpeedVideoSizes, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoSizes(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        androidx.cardview.widget.RoundRectDrawableWithShadow Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, colorStateList, f, f2, f3);
        Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI = cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap.invalidateSelf();
        cardViewDelegate.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
        getInputFormats(cardViewDelegate);
    }

    private androidx.cardview.widget.RoundRectDrawableWithShadow Camera2StreamConfigurationMap(android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        return new androidx.cardview.widget.RoundRectDrawableWithShadow(context.getResources(), colorStateList, f, f2, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getInputFormats(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        android.graphics.Rect rect = new android.graphics.Rect();
        getHighSpeedVideoSizesFor(cardViewDelegate).getPadding(rect);
        cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI((int) java.lang.Math.ceil(getHighSpeedVideoFpsRanges(cardViewDelegate)), (int) java.lang.Math.ceil(getHighResolutionOutputSizeshNQ4ISI(cardViewDelegate)));
        cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getOutputFormats(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        highSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI = cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI();
        highSpeedVideoSizesFor.invalidateSelf();
        getInputFormats(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRangesFor(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.res.ColorStateList colorStateList) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        highSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(colorStateList);
        highSpeedVideoSizesFor.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public android.content.res.ColorStateList getHighSpeedVideoSizes(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRanges(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (highSpeedVideoSizesFor.getHighSpeedVideoFpsRanges != f2) {
                highSpeedVideoSizesFor.getHighSpeedVideoFpsRanges = f2;
                highSpeedVideoSizesFor.Camera2StreamConfigurationMap = true;
                highSpeedVideoSizesFor.invalidateSelf();
            }
            getInputFormats(cardViewDelegate);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getInputSizeshNQ4ISI(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void Camera2StreamConfigurationMap(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        highSpeedVideoSizesFor.getHighSpeedVideoSizes(f, highSpeedVideoSizesFor.getOutputMinFrameDuration);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float Camera2StreamConfigurationMap(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).getInputSizeshNQ4ISI;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoSizes(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        highSpeedVideoSizesFor.getHighSpeedVideoSizes(highSpeedVideoSizesFor.getInputSizeshNQ4ISI, f);
        getInputFormats(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getHighSpeedVideoFpsRangesFor(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).getOutputMinFrameDuration;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getHighSpeedVideoFpsRanges(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        float f = highSpeedVideoSizesFor.getOutputMinFrameDuration;
        return (java.lang.Math.max(f, highSpeedVideoSizesFor.getHighSpeedVideoFpsRanges + highSpeedVideoSizesFor.getInputFormats + (f / 2.0f)) * 2.0f) + ((highSpeedVideoSizesFor.getOutputMinFrameDuration + highSpeedVideoSizesFor.getInputFormats) * 2.0f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getHighResolutionOutputSizeshNQ4ISI(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        androidx.cardview.widget.RoundRectDrawableWithShadow highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        float f = highSpeedVideoSizesFor.getOutputMinFrameDuration;
        return (java.lang.Math.max(f, highSpeedVideoSizesFor.getHighSpeedVideoFpsRanges + highSpeedVideoSizesFor.getInputFormats + ((f * 1.5f) / 2.0f)) * 2.0f) + (((highSpeedVideoSizesFor.getOutputMinFrameDuration * 1.5f) + highSpeedVideoSizesFor.getInputFormats) * 2.0f);
    }

    private androidx.cardview.widget.RoundRectDrawableWithShadow getHighSpeedVideoSizesFor(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return (androidx.cardview.widget.RoundRectDrawableWithShadow) cardViewDelegate.Camera2StreamConfigurationMap();
    }
}
