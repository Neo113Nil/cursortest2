package N0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3743a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3744b;

    public k(boolean z3, boolean z5) {
        this.f3743a = z3;
        this.f3744b = z5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f3743a);
        textPaint.setStrikeThruText(this.f3744b);
    }
}
