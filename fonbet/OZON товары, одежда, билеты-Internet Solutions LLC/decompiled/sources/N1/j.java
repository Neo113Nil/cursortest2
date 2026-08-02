package N1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    private final int f18397a;

    /* renamed from: b, reason: collision with root package name */
    private final float f18398b;

    /* renamed from: c, reason: collision with root package name */
    private final float f18399c;

    /* renamed from: d, reason: collision with root package name */
    private final float f18400d;

    public j(float f7, float f11, float f12, int i11) {
        this.f18397a = i11;
        this.f18398b = f7;
        this.f18399c = f11;
        this.f18400d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setShadowLayer(this.f18400d, this.f18398b, this.f18399c, this.f18397a);
    }
}
