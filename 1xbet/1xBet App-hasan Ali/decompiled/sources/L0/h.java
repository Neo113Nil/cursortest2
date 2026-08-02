package L0;

import K0.C0196a;
import Q2.C0375o;
import X3.C0442b;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;
import l4.C2060b;
import l4.C2062d;

/* loaded from: classes.dex */
public abstract class h {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i6, TextUtils.TruncateAt truncateAt, int i7, int i8, boolean z3, int i9, int i10, int i11, int i12) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i5 < 0) {
            Q0.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i5 < 0 || i5 > length) {
            Q0.a.a("invalid end value");
        }
        if (i6 < 0) {
            Q0.a.a("invalid maxLines value");
        }
        if (i < 0) {
            Q0.a.a("invalid width value");
        }
        if (i7 < 0) {
            Q0.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i5, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i6);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i7);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z3);
        obtain.setBreakStrategy(i9);
        obtain.setHyphenationFrequency(i12);
        obtain.setIndents(null, null);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            obtain.setJustificationMode(i8);
        }
        if (i13 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i13 >= 33) {
            lineBreakStyle = G.i.a().setLineBreakStyle(i10);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i11);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i13 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i, int i5) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i5, MetricAffectingSpan.class) != i5) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i5) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i5, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    C0442b i6 = kotlin.jvm.internal.l.i(metricAffectingSpanArr);
                    while (i6.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) i6.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i, i5, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i5, rect3);
        return rect3;
    }

    public static final float c(int i, int i5, float[] fArr) {
        return fArr[((i - i5) * 2) + 1];
    }

    public static final int d(Layout layout, int i, boolean z3) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z3) {
                    return lineForOffset - 1;
                }
            } else if (!z3) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int e(k kVar, Layout layout, C0375o c0375o, int i, RectF rectF, M0.d dVar, C0196a c0196a, boolean z3) {
        d[] dVarArr;
        int i5;
        int i6;
        d[] dVarArr2;
        boolean z5;
        int i7;
        int i8;
        int g5;
        float c5;
        int i9;
        int i10;
        int f;
        Bidi createLineBidi;
        boolean z6;
        int i11;
        float a5;
        float a6;
        float f5;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i12 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i12];
        Layout layout2 = kVar.f;
        int lineStart2 = layout2.getLineStart(i);
        int f6 = kVar.f(i);
        if (i12 < (f6 - lineStart2) * 2) {
            Q0.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        G0.i iVar = new G0.i(kVar);
        boolean z7 = layout2.getParagraphDirection(i) == 1;
        int i13 = 0;
        while (lineStart2 < f6) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (!z7 || isRtlCharAt) {
                z6 = z7;
                if (z6 && isRtlCharAt) {
                    i11 = i13;
                    f5 = iVar.a(lineStart2, false, false, false);
                    a5 = iVar.a(lineStart2 + 1, true, true, false);
                } else {
                    i11 = i13;
                    if (isRtlCharAt) {
                        a6 = iVar.a(lineStart2, false, false, true);
                        a5 = iVar.a(lineStart2 + 1, true, true, true);
                    } else {
                        a5 = iVar.a(lineStart2, false, false, false);
                        a6 = iVar.a(lineStart2 + 1, true, true, false);
                    }
                    f5 = a6;
                }
            } else {
                z6 = z7;
                a5 = iVar.a(lineStart2, false, false, true);
                f5 = iVar.a(lineStart2 + 1, true, true, true);
                i11 = i13;
            }
            fArr[i11] = a5;
            fArr[i11 + 1] = f5;
            i13 = i11 + 2;
            lineStart2++;
            z7 = z6;
        }
        Layout layout3 = (Layout) c0375o.f5042l;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int s2 = c0375o.s(lineStart3, false);
        int t5 = c0375o.t(s2);
        int i14 = lineStart3 - t5;
        int i15 = lineEnd2 - t5;
        Bidi k5 = c0375o.k(s2);
        if (k5 == null || (createLineBidi = k5.createLineBidi(i14, i15)) == null) {
            d dVar2 = new d(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3));
            i5 = 0;
            dVarArr = new d[]{dVar2};
        } else {
            int runCount = createLineBidi.getRunCount();
            dVarArr = new d[runCount];
            int i16 = 0;
            while (i16 < runCount) {
                int i17 = runCount;
                dVarArr[i16] = new d(createLineBidi.getRunStart(i16) + lineStart3, createLineBidi.getRunLimit(i16) + lineStart3, createLineBidi.getRunLevel(i16) % 2 == 1);
                i16++;
                runCount = i17;
            }
            i5 = 0;
        }
        C2060b c2062d = z3 ? new C2062d(i5, dVarArr.length - 1, 1) : new C2060b(dVarArr.length - 1, i5, -1);
        int i18 = c2062d.f17851k;
        int i19 = c2062d.f17852l;
        int i20 = c2062d.f17853m;
        if ((i20 <= 0 || i18 > i19) && (i20 >= 0 || i19 > i18)) {
            return -1;
        }
        while (true) {
            d dVar3 = dVarArr[i18];
            boolean z8 = dVar3.f3003c;
            int i21 = dVar3.f3001a;
            int i22 = dVar3.f3002b;
            float f7 = z8 ? fArr[((i22 - 1) - lineStart) * 2] : fArr[(i21 - lineStart) * 2];
            float c6 = z8 ? c(i21, lineStart, fArr) : c(i22 - 1, lineStart, fArr);
            boolean z9 = dVar3.f3003c;
            if (z3) {
                float f8 = rectF.left;
                if (c6 >= f8) {
                    i6 = i20;
                    float f9 = rectF.right;
                    if (f7 <= f9) {
                        if ((z9 || f8 > f7) && (!z9 || f9 < c6)) {
                            int i23 = i21;
                            int i24 = i22;
                            while (true) {
                                i9 = i24;
                                if (i24 - i23 <= 1) {
                                    break;
                                }
                                int i25 = (i9 + i23) / 2;
                                float f10 = fArr[(i25 - lineStart) * 2];
                                if ((z9 || f10 <= rectF.left) && (!z9 || f10 >= rectF.right)) {
                                    i24 = i9;
                                    i23 = i25;
                                } else {
                                    i24 = i25;
                                }
                            }
                            i10 = z9 ? i9 : i23;
                        } else {
                            i10 = i21;
                        }
                        int g6 = dVar.g(i10);
                        if (g6 != -1 && (f = dVar.f(g6)) < i22) {
                            if (f >= i21) {
                                i21 = f;
                            }
                            if (g6 > i22) {
                                g6 = i22;
                            }
                            dVarArr2 = dVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i26 = g6;
                            while (true) {
                                rectF2.left = z9 ? fArr[((i26 - 1) - lineStart) * 2] : fArr[(i21 - lineStart) * 2];
                                rectF2.right = z9 ? c(i21, lineStart, fArr) : c(i26 - 1, lineStart, fArr);
                                if (((Boolean) c0196a.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                i21 = dVar.q(i21);
                                if (i21 == -1 || i21 >= i22) {
                                    break;
                                }
                                i26 = dVar.g(i21);
                                if (i26 > i22) {
                                    i26 = i22;
                                }
                            }
                            z5 = true;
                        }
                    }
                } else {
                    i6 = i20;
                }
                dVarArr2 = dVarArr;
                i21 = -1;
                z5 = true;
            } else {
                i6 = i20;
                dVarArr2 = dVarArr;
                float f11 = rectF.left;
                if (c6 >= f11) {
                    float f12 = rectF.right;
                    if (f7 <= f12) {
                        if ((z9 || f12 < c6) && (!z9 || f11 > f7)) {
                            int i27 = i21;
                            i8 = i22;
                            for (int i28 = 1; i8 - i27 > i28; i28 = 1) {
                                int i29 = (i8 + i27) / 2;
                                float f13 = fArr[(i29 - lineStart) * 2];
                                if ((z9 || f13 <= rectF.right) && (!z9 || f13 >= rectF.left)) {
                                    i27 = i29;
                                } else {
                                    i8 = i29;
                                }
                            }
                            if (!z9) {
                                i8 = i27;
                            }
                        } else {
                            i8 = i22 - 1;
                        }
                        int f14 = dVar.f(i8 + 1);
                        if (f14 != -1 && (g5 = dVar.g(f14)) > i21) {
                            if (f14 < i21) {
                                f14 = i21;
                            }
                            if (g5 <= i22) {
                                i22 = g5;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i30 = f14;
                            while (true) {
                                rectF3.left = z9 ? fArr[((i22 - 1) - lineStart) * 2] : fArr[(i30 - lineStart) * 2];
                                if (z9) {
                                    c5 = c(i30, lineStart, fArr);
                                    z5 = true;
                                } else {
                                    z5 = true;
                                    c5 = c(i22 - 1, lineStart, fArr);
                                }
                                rectF3.right = c5;
                                if (((Boolean) c0196a.invoke(rectF3, rectF)).booleanValue()) {
                                    i7 = i22;
                                    break;
                                }
                                i22 = dVar.r(i22);
                                if (i22 == -1 || i22 <= i21) {
                                    break;
                                }
                                i30 = dVar.f(i22);
                                if (i30 < i21) {
                                    i30 = i21;
                                }
                            }
                            i7 = -1;
                        } else {
                            i7 = -1;
                            z5 = true;
                        }
                        i21 = i7;
                    }
                }
                z5 = true;
                i7 = -1;
                i21 = i7;
            }
            if (i21 >= 0) {
                return i21;
            }
            if (i18 == i19) {
                return -1;
            }
            i18 += i6;
            i20 = i6;
            dVarArr = dVarArr2;
        }
    }

    public static final boolean f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
