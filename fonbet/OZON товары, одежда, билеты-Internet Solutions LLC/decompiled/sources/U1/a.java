package U1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;
import l1.C7787E;
import l1.t0;
import n1.AbstractC8413f;
import n1.C8415h;
import n1.C8416i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC8413f f27269a;

    public a(@NotNull AbstractC8413f abstractC8413f) {
        this.f27269a = abstractC8413f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C8415h c8415h = C8415h.f76287a;
            AbstractC8413f abstractC8413f = this.f27269a;
            if (Intrinsics.d(abstractC8413f, c8415h)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC8413f instanceof C8416i) {
                textPaint.setStyle(Paint.Style.STROKE);
                C8416i c8416i = (C8416i) abstractC8413f;
                textPaint.setStrokeWidth(c8416i.e());
                textPaint.setStrokeMiter(c8416i.c());
                int b11 = c8416i.b();
                textPaint.setStrokeJoin(b11 == 0 ? Paint.Join.MITER : b11 == 1 ? Paint.Join.ROUND : b11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int a11 = c8416i.a();
                textPaint.setStrokeCap(a11 == 0 ? Paint.Cap.BUTT : a11 == 1 ? Paint.Cap.ROUND : a11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                t0 d11 = c8416i.d();
                textPaint.setPathEffect(d11 != null ? ((C7787E) d11).a() : null);
            }
        }
    }
}
