package L1;

import android.graphics.Rect;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final V f16184a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final long f16185b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16186c = 0;

    static {
        long j11 = 0;
        f16185b = (j11 & 4294967295L) | (j11 << 32);
    }

    public static final long a(N1.h[] hVarArr) {
        int i11 = 0;
        int i12 = 0;
        for (N1.h hVar : hVarArr) {
            if (hVar.b() < 0) {
                i11 = Math.max(i11, Math.abs(hVar.b()));
            }
            if (hVar.c() < 0) {
                i12 = Math.max(i11, Math.abs(hVar.c()));
            }
        }
        return (i11 == 0 && i12 == 0) ? f16185b : (i11 << 32) | (i12 & 4294967295L);
    }

    public static final long c(W w11) {
        if (!w11.g() && !w11.F()) {
            TextPaint paint = w11.h().getPaint();
            CharSequence text = w11.h().getText();
            Rect a11 = G.a(paint, text, w11.h().getLineStart(0), w11.h().getLineEnd(0));
            int lineAscent = w11.h().getLineAscent(0);
            int i11 = a11.top;
            int topPadding = i11 < lineAscent ? lineAscent - i11 : w11.h().getTopPadding();
            if (w11.l() != 1) {
                int l11 = w11.l() - 1;
                a11 = G.a(paint, text, w11.h().getLineStart(l11), w11.h().getLineEnd(l11));
            }
            int lineDescent = w11.h().getLineDescent(w11.l() - 1);
            int i12 = a11.bottom;
            int bottomPadding = i12 > lineDescent ? i12 - lineDescent : w11.h().getBottomPadding();
            if (topPadding != 0 || bottomPadding != 0) {
                return (bottomPadding & 4294967295L) | (topPadding << 32);
            }
        }
        return f16185b;
    }

    @NotNull
    public static final TextDirectionHeuristic e(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
