package sg.bigo.ads.L0;

import android.graphics.Canvas;
import android.graphics.Paint;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* loaded from: classes3.dex */
public final class m extends k {
    public final /* synthetic */ PrivacyCheckBox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PrivacyCheckBox privacyCheckBox) {
        super(privacyCheckBox);
        this.b = privacyCheckBox;
    }

    @Override // sg.bigo.ads.L0.k
    public final void a(Canvas canvas) {
        Paint paint;
        int i;
        this.b.d.setStyle(Paint.Style.FILL);
        PrivacyCheckBox privacyCheckBox = this.f12410a;
        if (privacyCheckBox.f) {
            paint = privacyCheckBox.d;
            i = privacyCheckBox.g;
        } else {
            paint = privacyCheckBox.d;
            i = privacyCheckBox.h;
        }
        paint.setColor(i);
        PrivacyCheckBox privacyCheckBox2 = this.f12410a;
        canvas.drawCircle(0.0f, 0.0f, privacyCheckBox2.c, privacyCheckBox2.d);
    }
}
