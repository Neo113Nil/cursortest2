package Xb;

import Vb.r;
import Ve.E;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* renamed from: Xb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4882a implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final r f34241a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f34242b = h.b();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f34243c = h.a();

    public C4882a(@NonNull r rVar) {
        this.f34241a = rVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int g10 = this.f34241a.g();
        Paint paint2 = this.f34243c;
        paint2.set(paint);
        int h11 = E.h(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(h11);
        int i18 = i12 * g10;
        int i19 = i11 + i18;
        int i21 = i18 + i19;
        int min = Math.min(i19, i21);
        int max = Math.max(i19, i21);
        Rect rect = this.f34242b;
        rect.set(min, i13, max, i15);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return this.f34241a.f();
    }
}
