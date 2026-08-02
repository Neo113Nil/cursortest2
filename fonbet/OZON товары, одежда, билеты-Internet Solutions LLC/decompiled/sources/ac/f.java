package ac;

import Vb.r;
import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class f implements LeadingMarginSpan {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f36550d = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f36551e = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private final r f36552a;

    /* renamed from: b, reason: collision with root package name */
    private final C4992a f36553b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36554c;

    public f(@NonNull r rVar, @NonNull C4992a c4992a, boolean z11) {
        this.f36552a = rVar;
        this.f36553b = c4992a;
        this.f36554c = z11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        C4992a c4992a = this.f36553b;
        if (z11 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i16) {
            float descent = paint.descent();
            float ascent = paint.ascent();
            int save = canvas.save();
            try {
                c4992a.setBounds(0, 0, (int) ((this.f36552a.f() * 0.75f) + 0.5f), (int) ((((int) ((descent - ascent) + 0.5f)) * 0.75f) + 0.5f));
                c4992a.setState(this.f36554c ? f36550d : f36551e);
                canvas.translate(i12 > 0 ? i11 + ((r10 - r12) / 2) : (i11 - ((r10 - r12) / 2)) - r12, ((int) (i14 + ascent + 0.5f)) + ((r8 - r13) / 2));
                c4992a.draw(canvas);
                canvas.restoreToCount(save);
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return this.f36552a.f();
    }
}
