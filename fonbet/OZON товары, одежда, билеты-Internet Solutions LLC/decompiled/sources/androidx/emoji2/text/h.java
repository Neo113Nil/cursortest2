package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.emoji2.text.j;

/* loaded from: classes.dex */
final class h implements j.e {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f42687b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f42688a;

    h() {
        TextPaint textPaint = new TextPaint();
        this.f42688a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public final boolean a(int i11, int i12, @NonNull CharSequence charSequence) {
        ThreadLocal<StringBuilder> threadLocal = f42687b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb2 = threadLocal.get();
        sb2.setLength(0);
        while (i11 < i12) {
            sb2.append(charSequence.charAt(i11));
            i11++;
        }
        return androidx.core.graphics.e.a(this.f42688a, sb2.toString());
    }
}
