package U0;

import O3.l;
import P.AbstractC0329z;
import P.C0305m0;
import S0.k;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h0.C1991e;
import i0.H;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final H f5845a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5846b;

    /* renamed from: c, reason: collision with root package name */
    public final C0305m0 f5847c = AbstractC0329z.t(new C1991e(9205357640488583168L));

    /* renamed from: d, reason: collision with root package name */
    public final P.H f5848d = AbstractC0329z.o(new l(4, this));

    public b(H h3, float f) {
        this.f5845a = h3;
        this.f5846b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.b(textPaint, this.f5846b);
        textPaint.setShader((Shader) this.f5848d.getValue());
    }
}
