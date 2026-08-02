package M0;

import android.text.TextPaint;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class b extends AbstractC2036a {

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f3586p;

    /* renamed from: q, reason: collision with root package name */
    public final TextPaint f3587q;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f3586p = charSequence;
        this.f3587q = textPaint;
    }

    @Override // k4.AbstractC2036a
    public final int L(int i) {
        int textRunCursor;
        CharSequence charSequence = this.f3586p;
        textRunCursor = this.f3587q.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // k4.AbstractC2036a
    public final int P(int i) {
        int textRunCursor;
        CharSequence charSequence = this.f3586p;
        textRunCursor = this.f3587q.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
