package L1;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f16141a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextPaint f16142b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16143c;

    /* renamed from: d, reason: collision with root package name */
    private float f16144d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    private float f16145e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    private BoringLayout.Metrics f16146f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16147g;

    public C(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i11) {
        this.f16141a = charSequence;
        this.f16142b = textPaint;
        this.f16143c = i11;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f16147g) {
            TextDirectionHeuristic e11 = Y.e(this.f16143c);
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f16141a;
            TextPaint textPaint = this.f16142b;
            this.f16146f = i11 >= 33 ? C3542f.b(charSequence, textPaint, e11) : C3543g.b(charSequence, textPaint, e11);
            this.f16147g = true;
        }
        return this.f16146f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r5.nextSpanTransition(-1, r5.length(), N1.e.class) != r5.length()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r4.getLetterSpacing() == 0.0f) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        if (!Float.isNaN(this.f16144d)) {
            return this.f16144d;
        }
        BoringLayout.Metrics a11 = a();
        float f7 = a11 != null ? a11.width : -1;
        TextPaint textPaint = this.f16142b;
        CharSequence charSequence = this.f16141a;
        if (f7 < 0.0f) {
            f7 = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (f7 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), N1.f.class) == spanned.length()) {
                }
                f7 += 0.5f;
            }
        }
        this.f16144d = f7;
        return f7;
    }

    public final float c() {
        if (!Float.isNaN(this.f16145e)) {
            return this.f16145e;
        }
        TextPaint textPaint = this.f16142b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = this.f16141a;
        lineInstance.setText(new C3559x(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new D(0));
        int i11 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f()).intValue() - ((Number) pair.e()).intValue() < next - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(next)));
                }
            }
            i11 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            f7 = Math.max(f7, Layout.getDesiredWidth(charSequence, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint));
        }
        this.f16145e = f7;
        return f7;
    }
}
