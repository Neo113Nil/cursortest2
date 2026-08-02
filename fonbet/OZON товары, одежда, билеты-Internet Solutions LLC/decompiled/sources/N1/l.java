package N1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18402a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18403b;

    public l(boolean z11, boolean z12) {
        this.f18402a = z11;
        this.f18403b = z12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f18402a);
        textPaint.setStrikeThruText(this.f18403b);
    }
}
