package L1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S1.f f16169a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16170b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16171c;

    /* renamed from: d, reason: collision with root package name */
    private M1.h f16172d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Layout f16173e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16174f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16175g;

    /* renamed from: h, reason: collision with root package name */
    private final int f16176h;

    /* renamed from: i, reason: collision with root package name */
    private final float f16177i;

    /* renamed from: j, reason: collision with root package name */
    private final float f16178j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16179k;

    /* renamed from: l, reason: collision with root package name */
    private final Paint.FontMetricsInt f16180l;

    /* renamed from: m, reason: collision with root package name */
    private final int f16181m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Rect f16182n = new Rect();

    /* renamed from: o, reason: collision with root package name */
    private B f16183o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W(CharSequence charSequence, float f7, S1.f fVar, int i11, TextUtils.TruncateAt truncateAt, int i12, boolean z11, int i13, int i14, int i15, int i16, int i17, int i18, C c11) {
        boolean z12;
        int i19;
        Layout a11;
        N1.h[] hVarArr;
        int i21;
        int i22;
        Layout layout;
        int i23;
        int i24;
        W w11;
        int i25;
        int i26;
        this.f16169a = fVar;
        this.f16170b = z11;
        int length = charSequence.length();
        TextDirectionHeuristic e11 = Y.e(i12);
        Layout.Alignment a12 = U.a(i11);
        boolean z13 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, N1.a.class) < length;
        BoringLayout.Metrics a13 = c11.a();
        double d11 = f7;
        int ceil = (int) Math.ceil(d11);
        if (a13 == null || c11.b() > f7 || z13) {
            this.f16179k = false;
            z12 = true;
            i19 = i13;
            a11 = Q.a(ceil, charSequence.length(), i19, (int) Math.ceil(d11), i18, i14, i15, i16, i17, fVar, a12, e11, truncateAt, charSequence, z11, true);
        } else {
            this.f16179k = true;
            if (ceil < 0) {
                throw new IllegalArgumentException("negative width");
            }
            if (ceil < 0) {
                throw new IllegalArgumentException("negative ellipsized width");
            }
            a11 = Build.VERSION.SDK_INT >= 33 ? C3542f.a(charSequence, fVar, ceil, a12, 1.0f, 0.0f, a13, z11, true, truncateAt, ceil) : C3543g.a(charSequence, fVar, ceil, a12, 1.0f, 0.0f, a13, z11, truncateAt, ceil);
            z12 = true;
            i19 = i13;
        }
        this.f16173e = a11;
        int min = Math.min(a11.getLineCount(), i19);
        this.f16174f = min;
        int i27 = min - 1;
        this.f16171c = (min >= i19 && (a11.getEllipsisCount(i27) > 0 || a11.getLineEnd(i27) != charSequence.length())) ? z12 : false;
        long c12 = Y.c(this);
        Paint.FontMetricsInt fontMetricsInt = null;
        if (a11.getText() instanceof Spanned) {
            CharSequence text = a11.getText();
            Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            if (spanned.nextSpanTransition(-1, spanned.length(), N1.h.class) != spanned.length() || a11.getText().length() <= 0) {
                CharSequence text2 = a11.getText();
                Intrinsics.g(text2, "null cannot be cast to non-null type android.text.Spanned");
                i21 = 0;
                hVarArr = (N1.h[]) ((Spanned) text2).getSpans(0, a11.getText().length(), N1.h.class);
                long a14 = hVarArr == null ? Y.a(hVarArr) : Y.f16185b;
                this.f16175g = Math.max((int) (c12 >> 32), (int) (a14 >> 32));
                this.f16176h = Math.max((int) (c12 & 4294967295L), (int) (a14 & 4294967295L));
                i22 = min - 1;
                if (a11.getLineStart(i22) == a11.getLineEnd(i22) || hVarArr == null || hVarArr.length == 0) {
                    layout = a11;
                    i23 = i27;
                    i24 = i21;
                } else {
                    SpannableString spannableString = new SpannableString("\u200b");
                    N1.h hVar = (N1.h) C7705l.C(hVarArr);
                    spannableString.setSpan(hVar.a(spannableString.length(), (i22 == 0 || !hVar.d()) ? hVar.d() : i21), i21, spannableString.length(), 33);
                    i23 = i27;
                    layout = a11;
                    i24 = i21;
                    StaticLayout a15 = Q.a(Integer.MAX_VALUE, spannableString.length(), Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0, 0, fVar, z.a(), e11, null, spannableString, z11, true);
                    fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = a15.getLineAscent(i24);
                    fontMetricsInt.descent = a15.getLineDescent(i24);
                    fontMetricsInt.top = a15.getLineTop(i24);
                    fontMetricsInt.bottom = a15.getLineBottom(i24);
                }
                if (fontMetricsInt == null) {
                    w11 = this;
                    i25 = i23;
                    i26 = fontMetricsInt.bottom - ((int) (w11.k(i25) - w11.u(i25)));
                } else {
                    w11 = this;
                    i25 = i23;
                    i26 = i24;
                }
                w11.f16181m = i26;
                w11.f16180l = fontMetricsInt;
                Layout layout2 = layout;
                w11.f16177i = N1.d.a(layout2, i25, layout.getPaint());
                w11.f16178j = N1.d.b(layout2, i25, layout2.getPaint());
            }
        }
        hVarArr = null;
        i21 = 0;
        if (hVarArr == null) {
        }
        this.f16175g = Math.max((int) (c12 >> 32), (int) (a14 >> 32));
        this.f16176h = Math.max((int) (c12 & 4294967295L), (int) (a14 & 4294967295L));
        i22 = min - 1;
        if (a11.getLineStart(i22) == a11.getLineEnd(i22)) {
        }
        layout = a11;
        i23 = i27;
        i24 = i21;
        if (fontMetricsInt == null) {
        }
        w11.f16181m = i26;
        w11.f16180l = fontMetricsInt;
        Layout layout22 = layout;
        w11.f16177i = N1.d.a(layout22, i25, layout.getPaint());
        w11.f16178j = N1.d.b(layout22, i25, layout22.getPaint());
    }

    private final float f(int i11) {
        if (i11 == this.f16174f - 1) {
            return this.f16177i + this.f16178j;
        }
        return 0.0f;
    }

    private final B i() {
        B b11 = this.f16183o;
        if (b11 != null) {
            return b11;
        }
        B b12 = new B(this.f16173e);
        this.f16183o = b12;
        return b12;
    }

    public final float A(int i11, boolean z11) {
        return i().c(i11, false, z11) + f(this.f16173e.getLineForOffset(i11));
    }

    public final void B(int i11, int i12, @NotNull Path path) {
        this.f16173e.getSelectionPath(i11, i12, path);
        int i13 = this.f16175g;
        if (i13 == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, i13);
    }

    @NotNull
    public final CharSequence C() {
        return this.f16173e.getText();
    }

    @NotNull
    public final TextPaint D() {
        return this.f16169a;
    }

    @NotNull
    public final M1.h E() {
        M1.h hVar = this.f16172d;
        if (hVar != null) {
            return hVar;
        }
        Layout layout = this.f16173e;
        M1.h hVar2 = new M1.h(layout.getText(), layout.getText().length(), this.f16169a.getTextLocale());
        this.f16172d = hVar2;
        return hVar2;
    }

    public final boolean F() {
        boolean z11 = this.f16179k;
        Layout layout = this.f16173e;
        if (!z11) {
            Intrinsics.g(layout, "null cannot be cast to non-null type android.text.StaticLayout");
            StaticLayout staticLayout = (StaticLayout) layout;
            int i11 = Build.VERSION.SDK_INT;
            return i11 >= 33 ? P.a(staticLayout) : i11 >= 28;
        }
        Intrinsics.g(layout, "null cannot be cast to non-null type android.text.BoringLayout");
        BoringLayout boringLayout = (BoringLayout) layout;
        if (Build.VERSION.SDK_INT >= 33) {
            return C3542f.c(boringLayout);
        }
        return false;
    }

    public final boolean G(int i11) {
        int i12 = Y.f16186c;
        return this.f16173e.getEllipsisCount(i11) > 0;
    }

    public final boolean H(int i11) {
        return this.f16173e.isRtlCharAt(i11);
    }

    public final void I(@NotNull Canvas canvas) {
        V v11;
        if (canvas.getClipBounds(this.f16182n)) {
            int i11 = this.f16175g;
            if (i11 != 0) {
                canvas.translate(0.0f, i11);
            }
            v11 = Y.f16184a;
            v11.a(canvas);
            this.f16173e.draw(v11);
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i11, int i12, @NotNull float[] fArr, int i13) {
        float d11;
        float e11;
        Layout layout = this.f16173e;
        int length = layout.getText().length();
        if (i11 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i11 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i12 <= i11) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i12 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i13 < (i12 - i11) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = layout.getLineForOffset(i11);
        int lineForOffset2 = layout.getLineForOffset(i12 - 1);
        C3560y c3560y = new C3560y(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = layout.getLineStart(lineForOffset);
            int o11 = o(lineForOffset);
            int min = Math.min(i12, o11);
            float u11 = u(lineForOffset);
            float k11 = k(lineForOffset);
            boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
            for (int max = Math.max(i11, lineStart); max < min; max++) {
                boolean isRtlCharAt = layout.isRtlCharAt(max);
                if (z11 && !isRtlCharAt) {
                    d11 = c3560y.b(max);
                    e11 = c3560y.c(max + 1);
                } else if (z11 && isRtlCharAt) {
                    e11 = c3560y.d(max);
                    d11 = c3560y.e(max + 1);
                } else if (z11 || !isRtlCharAt) {
                    d11 = c3560y.d(max);
                    e11 = c3560y.e(max + 1);
                } else {
                    e11 = c3560y.b(max);
                    d11 = c3560y.c(max + 1);
                }
                fArr[i13] = d11;
                fArr[i13 + 1] = u11;
                fArr[i13 + 2] = e11;
                fArr[i13 + 3] = k11;
                i13 += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final void b(@NotNull float[] fArr, int i11) {
        float d11;
        float e11;
        Layout layout = this.f16173e;
        int lineStart = layout.getLineStart(i11);
        int o11 = o(i11);
        if (fArr.length < (o11 - lineStart) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C3560y c3560y = new C3560y(this);
        int i12 = 0;
        boolean z11 = layout.getParagraphDirection(i11) == 1;
        while (lineStart < o11) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z11 && !isRtlCharAt) {
                d11 = c3560y.b(lineStart);
                e11 = c3560y.c(lineStart + 1);
            } else if (z11 && isRtlCharAt) {
                e11 = c3560y.d(lineStart);
                d11 = c3560y.e(lineStart + 1);
            } else if (isRtlCharAt) {
                e11 = c3560y.b(lineStart);
                d11 = c3560y.c(lineStart + 1);
            } else {
                d11 = c3560y.d(lineStart);
                e11 = c3560y.e(lineStart + 1);
            }
            fArr[i12] = d11;
            fArr[i12 + 1] = e11;
            i12 += 2;
            lineStart++;
        }
    }

    @NotNull
    public final RectF c(int i11) {
        float A11;
        float A12;
        float y11;
        float y12;
        Layout layout = this.f16173e;
        int lineForOffset = layout.getLineForOffset(i11);
        float u11 = u(lineForOffset);
        float k11 = k(lineForOffset);
        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(i11);
        if (!z11 || isRtlCharAt) {
            if (z11 && isRtlCharAt) {
                y11 = A(i11, false);
                y12 = A(i11 + 1, true);
            } else if (isRtlCharAt) {
                y11 = y(i11, false);
                y12 = y(i11 + 1, true);
            } else {
                A11 = A(i11, false);
                A12 = A(i11 + 1, true);
            }
            float f7 = y11;
            A11 = y12;
            A12 = f7;
        } else {
            A11 = y(i11, false);
            A12 = y(i11 + 1, true);
        }
        return new RectF(A11, u11, A12, k11);
    }

    public final boolean d() {
        return this.f16171c;
    }

    public final int e() {
        boolean z11 = this.f16171c;
        Layout layout = this.f16173e;
        return (z11 ? layout.getLineBottom(this.f16174f - 1) : layout.getHeight()) + this.f16175g + this.f16176h + this.f16181m;
    }

    public final boolean g() {
        return this.f16170b;
    }

    @NotNull
    public final Layout h() {
        return this.f16173e;
    }

    public final float j(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f16175g + ((i11 != this.f16174f + (-1) || (fontMetricsInt = this.f16180l) == null) ? this.f16173e.getLineBaseline(i11) : u(i11) - fontMetricsInt.ascent);
    }

    public final float k(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.f16174f;
        int i13 = i12 - 1;
        Layout layout = this.f16173e;
        if (i11 != i13 || (fontMetricsInt = this.f16180l) == null) {
            return this.f16175g + layout.getLineBottom(i11) + (i11 == i12 + (-1) ? this.f16176h : 0);
        }
        return layout.getLineBottom(i11 - 1) + fontMetricsInt.bottom;
    }

    public final int l() {
        return this.f16174f;
    }

    public final int m(int i11) {
        return this.f16173e.getEllipsisCount(i11);
    }

    public final int n(int i11) {
        return this.f16173e.getEllipsisStart(i11);
    }

    public final int o(int i11) {
        Layout layout = this.f16173e;
        return layout.getEllipsisStart(i11) == 0 ? layout.getLineEnd(i11) : layout.getText().length();
    }

    public final int p(int i11) {
        return this.f16173e.getLineForOffset(i11);
    }

    public final int q(int i11) {
        return this.f16173e.getLineForVertical(i11 - this.f16175g);
    }

    public final float r(int i11) {
        return this.f16173e.getLineLeft(i11) + (i11 == this.f16174f + (-1) ? this.f16177i : 0.0f);
    }

    public final float s(int i11) {
        return this.f16173e.getLineRight(i11) + (i11 == this.f16174f + (-1) ? this.f16178j : 0.0f);
    }

    public final int t(int i11) {
        return this.f16173e.getLineStart(i11);
    }

    public final float u(int i11) {
        return this.f16173e.getLineTop(i11) + (i11 == 0 ? 0 : this.f16175g);
    }

    public final int v(int i11) {
        Layout layout = this.f16173e;
        if (layout.getEllipsisStart(i11) == 0) {
            return i().e(i11);
        }
        return layout.getEllipsisStart(i11) + layout.getLineStart(i11);
    }

    public final int w(float f7, int i11) {
        return this.f16173e.getOffsetForHorizontal(i11, ((-1) * f(i11)) + f7);
    }

    public final int x(int i11) {
        return this.f16173e.getParagraphDirection(i11);
    }

    public final float y(int i11, boolean z11) {
        return i().c(i11, true, z11) + f(this.f16173e.getLineForOffset(i11));
    }

    public final int[] z(@NotNull RectF rectF, int i11, @NotNull Function2<? super RectF, ? super RectF, Boolean> function2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C3538b.f16188a.a(this, rectF, i11, function2);
        }
        return X.b(this, this.f16173e, i(), rectF, i11, function2);
    }
}
