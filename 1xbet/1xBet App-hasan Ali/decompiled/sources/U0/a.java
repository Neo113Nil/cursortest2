package U0;

import D2.e;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k0.AbstractC2024d;
import k0.C2027g;
import k0.C2028h;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2024d f5844a;

    public a(AbstractC2024d abstractC2024d) {
        this.f5844a = abstractC2024d;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C2027g c2027g = C2027g.f17547b;
            AbstractC2024d abstractC2024d = this.f5844a;
            if (l.a(abstractC2024d, c2027g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC2024d instanceof C2028h)) {
                throw new e();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C2028h c2028h = (C2028h) abstractC2024d;
            textPaint.setStrokeWidth(c2028h.f17548b);
            textPaint.setStrokeMiter(c2028h.f17549c);
            int i = c2028h.f17551e;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i5 = c2028h.f17550d;
            textPaint.setStrokeCap(i5 == 0 ? Paint.Cap.BUTT : i5 == 1 ? Paint.Cap.ROUND : i5 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            c2028h.getClass();
            textPaint.setPathEffect(null);
        }
    }
}
