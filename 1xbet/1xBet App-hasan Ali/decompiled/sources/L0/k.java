package L0;

import Q2.C0375o;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.NoSuchElementException;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3016c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3017d;

    /* renamed from: e, reason: collision with root package name */
    public M0.e f3018e;
    public final Layout f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3019g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3020h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3021j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3022k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3023l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f3024m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3025n;

    /* renamed from: o, reason: collision with root package name */
    public final N0.h[] f3026o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f3027p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public C0375o f3028q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i5, boolean z3, int i6, int i7, int i8, int i9, int i10, int i11, e eVar) {
        int i12;
        int i13;
        int i14;
        Layout a5;
        long j5;
        N0.h[] hVarArr;
        long j6;
        int i15;
        Layout layout;
        int i16;
        int i17;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        this.f3014a = textPaint;
        this.f3015b = truncateAt;
        this.f3016c = z3;
        int length = charSequence.length();
        TextDirectionHeuristic a6 = l.a(i5);
        Layout.Alignment alignment = i.f3011a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : i.f3012b : i.f3011a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, N0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a7 = eVar.a();
            double d5 = f;
            int ceil = (int) Math.ceil(d5);
            if (a7 == null || eVar.c() > f || z5) {
                this.f3023l = false;
                i12 = i6;
                i13 = 1;
                i14 = 33;
                a5 = h.a(charSequence, textPaint, ceil, charSequence.length(), a6, alignment2, i12, truncateAt, (int) Math.ceil(d5), i11, z3, i7, i8, i9, i10);
                a6 = a6;
            } else {
                this.f3023l = true;
                if (ceil < 0) {
                    Q0.a.a("negative width");
                }
                if (ceil < 0) {
                    Q0.a.a("negative ellipsized width");
                }
                i12 = i6;
                a5 = Build.VERSION.SDK_INT >= 33 ? G.i.e(charSequence, textPaint, ceil, alignment2, a7, z3, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a7, z3, truncateAt, ceil);
                i13 = 1;
                i14 = 33;
            }
            this.f = a5;
            Trace.endSection();
            int min = Math.min(a5.getLineCount(), i12);
            this.f3019g = min;
            int i18 = min - 1;
            this.f3017d = (min >= i12 && (a5.getEllipsisCount(i18) > 0 || a5.getLineEnd(i18) != charSequence.length())) ? i13 : 0;
            if (!z3) {
                if (this.f3023l) {
                    BoringLayout boringLayout = (BoringLayout) a5;
                    if (Build.VERSION.SDK_INT >= i14) {
                        isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        i17 = isFallbackLineSpacingEnabled2;
                        if (i17 == 0) {
                            TextPaint paint = a5.getPaint();
                            CharSequence text = a5.getText();
                            Rect b3 = h.b(paint, text, a5.getLineStart(0), a5.getLineEnd(0));
                            int lineAscent = a5.getLineAscent(0);
                            int i19 = b3.top;
                            int topPadding = i19 < lineAscent ? lineAscent - i19 : a5.getTopPadding();
                            b3 = min != i13 ? h.b(paint, text, a5.getLineStart(i18), a5.getLineEnd(i18)) : b3;
                            int lineDescent = a5.getLineDescent(i18);
                            int i20 = b3.bottom;
                            int bottomPadding = i20 > lineDescent ? i20 - lineDescent : a5.getBottomPadding();
                            j5 = (topPadding == 0 && bottomPadding == 0) ? j5 : (topPadding << 32) | (bottomPadding & 4294967295L);
                        }
                    }
                    i17 = 0;
                    if (i17 == 0) {
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) a5;
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= i14) {
                        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        i17 = isFallbackLineSpacingEnabled;
                    } else {
                        if (i21 >= 28) {
                            i17 = i13;
                        }
                        i17 = 0;
                    }
                    if (i17 == 0) {
                    }
                }
                Paint.FontMetricsInt fontMetricsInt = null;
                if (a5.getText() instanceof Spanned) {
                    CharSequence text2 = a5.getText();
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.text.Spanned", text2);
                    if (h.f((Spanned) text2, N0.h.class) || a5.getText().length() <= 0) {
                        CharSequence text3 = a5.getText();
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.text.Spanned", text3);
                        hVarArr = (N0.h[]) ((Spanned) text3).getSpans(0, a5.getText().length(), N0.h.class);
                        this.f3026o = hVarArr;
                        if (hVarArr != null) {
                            int i22 = 0;
                            int i23 = 0;
                            for (N0.h hVar : hVarArr) {
                                int i24 = hVar.f3733k;
                                i22 = i24 < 0 ? Math.max(i22, Math.abs(i24)) : i22;
                                int i25 = hVar.f3734l;
                                if (i25 < 0) {
                                    i23 = Math.max(i22, Math.abs(i25));
                                }
                            }
                            j6 = (i22 == 0 && i23 == 0) ? l.f3030b : (i22 << 32) | (i23 & 4294967295L);
                        } else {
                            j6 = l.f3030b;
                        }
                        this.f3020h = Math.max((int) (j5 >> 32), (int) (j6 >> 32));
                        this.i = Math.max((int) (j5 & 4294967295L), (int) (j6 & 4294967295L));
                        TextPaint textPaint2 = this.f3014a;
                        N0.h[] hVarArr2 = this.f3026o;
                        i15 = this.f3019g - 1;
                        layout = this.f;
                        if (layout.getLineStart(i15) == layout.getLineEnd(i15) || hVarArr2 == null || hVarArr2.length == 0) {
                            i16 = 0;
                        } else {
                            SpannableString spannableString = new SpannableString("\u200b");
                            if (hVarArr2.length == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            N0.h hVar2 = hVarArr2[0];
                            spannableString.setSpan(new N0.h(hVar2.f3725a, spannableString.length(), (i15 == 0 || !hVar2.f3728d) ? hVar2.f3728d : false, hVar2.f3728d, hVar2.f3729e, hVar2.f), 0, spannableString.length(), i14);
                            StaticLayout a8 = h.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), a6, c.f3000a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f3016c, 0, 0, 0, 0);
                            fontMetricsInt = new Paint.FontMetricsInt();
                            i16 = 0;
                            fontMetricsInt.ascent = a8.getLineAscent(0);
                            fontMetricsInt.descent = a8.getLineDescent(0);
                            fontMetricsInt.top = a8.getLineTop(0);
                            fontMetricsInt.bottom = a8.getLineBottom(0);
                        }
                        this.f3025n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i18) - g(i18))) : i16;
                        this.f3024m = fontMetricsInt;
                        Layout layout2 = this.f;
                        this.f3021j = AbstractC2349a.z(layout2, i18, layout2.getPaint());
                        Layout layout3 = this.f;
                        this.f3022k = AbstractC2349a.A(layout3, i18, layout3.getPaint());
                    }
                }
                hVarArr = null;
                this.f3026o = hVarArr;
                if (hVarArr != null) {
                }
                this.f3020h = Math.max((int) (j5 >> 32), (int) (j6 >> 32));
                this.i = Math.max((int) (j5 & 4294967295L), (int) (j6 & 4294967295L));
                TextPaint textPaint22 = this.f3014a;
                N0.h[] hVarArr22 = this.f3026o;
                i15 = this.f3019g - 1;
                layout = this.f;
                if (layout.getLineStart(i15) == layout.getLineEnd(i15)) {
                }
                i16 = 0;
                this.f3025n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i18) - g(i18))) : i16;
                this.f3024m = fontMetricsInt;
                Layout layout22 = this.f;
                this.f3021j = AbstractC2349a.z(layout22, i18, layout22.getPaint());
                Layout layout32 = this.f;
                this.f3022k = AbstractC2349a.A(layout32, i18, layout32.getPaint());
            }
            j5 = l.f3030b;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (a5.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f3026o = hVarArr;
            if (hVarArr != null) {
            }
            this.f3020h = Math.max((int) (j5 >> 32), (int) (j6 >> 32));
            this.i = Math.max((int) (j5 & 4294967295L), (int) (j6 & 4294967295L));
            TextPaint textPaint222 = this.f3014a;
            N0.h[] hVarArr222 = this.f3026o;
            i15 = this.f3019g - 1;
            layout = this.f;
            if (layout.getLineStart(i15) == layout.getLineEnd(i15)) {
            }
            i16 = 0;
            this.f3025n = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (e(i18) - g(i18))) : i16;
            this.f3024m = fontMetricsInt2;
            Layout layout222 = this.f;
            this.f3021j = AbstractC2349a.z(layout222, i18, layout222.getPaint());
            Layout layout322 = this.f;
            this.f3022k = AbstractC2349a.A(layout322, i18, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z3 = this.f3017d;
        Layout layout = this.f;
        return (z3 ? layout.getLineBottom(this.f3019g - 1) : layout.getHeight()) + this.f3020h + this.i + this.f3025n;
    }

    public final float b(int i) {
        if (i == this.f3019g - 1) {
            return this.f3021j + this.f3022k;
        }
        return 0.0f;
    }

    public final C0375o c() {
        C0375o c0375o = this.f3028q;
        if (c0375o != null) {
            return c0375o;
        }
        C0375o c0375o2 = new C0375o(this.f);
        this.f3028q = c0375o2;
        return c0375o2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f3020h + ((i != this.f3019g + (-1) || (fontMetricsInt = this.f3024m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i5 = this.f3019g;
        int i6 = i5 - 1;
        Layout layout = this.f;
        if (i != i6 || (fontMetricsInt = this.f3024m) == null) {
            return this.f3020h + layout.getLineBottom(i) + (i == i5 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        j jVar = l.f3029a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.f3015b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.f3020h);
    }

    public final float h(int i, boolean z3) {
        return b(this.f.getLineForOffset(i)) + c().r(i, true, z3);
    }

    public final float i(int i, boolean z3) {
        return b(this.f.getLineForOffset(i)) + c().r(i, false, z3);
    }

    public final M0.e j() {
        M0.e eVar = this.f3018e;
        if (eVar != null) {
            return eVar;
        }
        Layout layout = this.f;
        M0.e eVar2 = new M0.e(layout.getText(), layout.getText().length(), this.f3014a.getTextLocale());
        this.f3018e = eVar2;
        return eVar2;
    }
}
