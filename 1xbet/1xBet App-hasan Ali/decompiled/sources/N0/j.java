package N0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f3739a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3740b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3741c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3742d;

    public j(int i, float f, float f5, float f6) {
        this.f3739a = i;
        this.f3740b = f;
        this.f3741c = f5;
        this.f3742d = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f3742d, this.f3740b, this.f3741c, this.f3739a);
    }
}
