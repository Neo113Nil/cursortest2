package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class VerticalTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12715a;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        this.f12715a = true;
        int gravity = getGravity();
        if (Gravity.isVertical(gravity) && (gravity & 112) == 80) {
            setGravity((gravity & 7) | 48);
            z = false;
        }
        this.f12715a = z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.f12715a) {
            canvas.translate(getWidth(), 0.0f);
            f = 90.0f;
        } else {
            canvas.translate(0.0f, getHeight());
            f = -90.0f;
        }
        canvas.rotate(f);
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
