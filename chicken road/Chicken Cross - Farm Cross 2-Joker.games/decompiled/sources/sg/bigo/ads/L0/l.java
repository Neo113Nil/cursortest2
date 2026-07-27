package sg.bigo.ads.L0;

import android.graphics.Canvas;
import android.graphics.Paint;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* loaded from: classes3.dex */
public final class l extends k {
    public final /* synthetic */ PrivacyCheckBox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PrivacyCheckBox privacyCheckBox) {
        super(privacyCheckBox);
        this.b = privacyCheckBox;
    }

    @Override // sg.bigo.ads.L0.k
    public final void a(Canvas canvas) {
        Paint paint;
        int i;
        PrivacyCheckBox privacyCheckBox = this.b;
        if (privacyCheckBox.f) {
            privacyCheckBox.d.setStyle(Paint.Style.FILL);
        } else {
            privacyCheckBox.d.setStyle(Paint.Style.STROKE);
        }
        PrivacyCheckBox privacyCheckBox2 = this.f12410a;
        if (privacyCheckBox2.f) {
            paint = privacyCheckBox2.d;
            i = privacyCheckBox2.g;
        } else {
            paint = privacyCheckBox2.d;
            i = privacyCheckBox2.h;
        }
        paint.setColor(i);
        PrivacyCheckBox privacyCheckBox3 = this.f12410a;
        canvas.drawCircle(0.0f, 0.0f, privacyCheckBox3.c, privacyCheckBox3.d);
    }

    @Override // sg.bigo.ads.L0.k
    public final void b(Canvas canvas) {
        PrivacyCheckBox privacyCheckBox = this.b;
        if (privacyCheckBox.f) {
            privacyCheckBox.d.setXfermode(privacyCheckBox.k);
            super.b(canvas);
            this.b.d.setXfermode(null);
        }
    }
}
