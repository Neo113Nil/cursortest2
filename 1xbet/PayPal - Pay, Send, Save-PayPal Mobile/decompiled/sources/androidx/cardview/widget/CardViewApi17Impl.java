package androidx.cardview.widget;

/* loaded from: classes6.dex */
class CardViewApi17Impl extends androidx.cardview.widget.CardViewBaseImpl {
    CardViewApi17Impl() {
    }

    @Override // androidx.cardview.widget.CardViewBaseImpl, androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRanges() {
        androidx.cardview.widget.RoundRectDrawableWithShadow.getHighSpeedVideoSizes = new androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewApi17Impl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void getHighSpeedVideoSizes(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
