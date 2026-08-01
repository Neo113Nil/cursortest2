package sg.bigo.ads.L0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.RadioButton;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class p extends RadioButton {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f12412a;
    public final Path b;
    public final RectF c;

    public p(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f12412a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.b = new Path();
        this.c = new RectF();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.c.set(0.0f, 0.0f, width, height);
        float a2 = AbstractC4963u.a(getContext(), 4);
        this.b.addRoundRect(this.c, a2, a2, Path.Direction.CW);
        canvas.clipPath(this.b);
        super.onDraw(canvas);
        if (isChecked()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.f12412a.setColor(-16736769);
            this.f12412a.setStyle(Paint.Style.FILL);
            canvas.translate(width, height * 0.581f);
            canvas.rotate(51.0f);
            canvas.drawRect(this.c, this.f12412a);
            int width2 = canvas.getWidth();
            int height2 = canvas.getHeight();
            this.f12412a.setStyle(Paint.Style.STROKE);
            this.f12412a.setStrokeWidth(AbstractC4963u.a(getContext(), 1));
            this.f12412a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            canvas.save();
            float f = height2;
            canvas.translate(width2 * 0.018f, 0.378f * f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo((-0.094f) * f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, f * (-0.188f));
            canvas.drawPath(path, this.f12412a);
            canvas.restore();
            this.f12412a.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        }
    }
}
