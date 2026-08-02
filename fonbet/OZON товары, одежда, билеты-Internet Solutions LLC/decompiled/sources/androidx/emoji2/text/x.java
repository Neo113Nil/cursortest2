package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class x extends p {

    /* renamed from: e, reason: collision with root package name */
    private TextPaint f42761e;

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12, float f7, int i13, int i14, int i15, @NonNull Paint paint) {
        float f11;
        TextPaint textPaint;
        TextPaint textPaint2 = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i11, i12, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint3 = this.f42761e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.f42761e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint2);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint2 = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint2 = (TextPaint) paint;
        }
        if (textPaint2 == null || textPaint2.bgColor == 0) {
            f11 = f7;
            textPaint = textPaint2;
        } else {
            float f12 = i13;
            float f13 = i15;
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            f11 = f7;
            textPaint = textPaint2;
            canvas.drawRect(f11, f12, f7 + b(), f13, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        j.c().getClass();
        w a11 = a();
        float f14 = i14;
        if (textPaint != null) {
            paint = textPaint;
        }
        a11.a(canvas, paint, f11, f14);
    }
}
