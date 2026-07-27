package sg.bigo.ads.L0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrivacyCheckBox f12410a;

    public k(PrivacyCheckBox privacyCheckBox) {
        this.f12410a = privacyCheckBox;
    }

    public abstract void a(Canvas canvas);

    public void b(Canvas canvas) {
        Paint paint;
        int i;
        PrivacyCheckBox privacyCheckBox = this.f12410a;
        if (privacyCheckBox.f) {
            paint = privacyCheckBox.d;
            i = privacyCheckBox.i;
        } else {
            paint = privacyCheckBox.d;
            i = privacyCheckBox.j;
        }
        paint.setColor(i);
        this.f12410a.d.setStyle(Paint.Style.STROKE);
        canvas.save();
        float f = this.f12410a.c;
        canvas.translate(-(f / 8.0f), f / 3.0f);
        canvas.rotate(-45.0f);
        Path path = new Path();
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.f12410a.e, 0.0f);
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (-this.f12410a.e) / 2.0f);
        canvas.drawPath(path, this.f12410a.d);
        canvas.restore();
    }
}
