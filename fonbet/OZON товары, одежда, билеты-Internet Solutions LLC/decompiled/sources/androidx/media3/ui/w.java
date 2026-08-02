package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.Objects;
import l3.C7855a;
import x4.C10655a;

/* loaded from: classes8.dex */
final class w {

    /* renamed from: A, reason: collision with root package name */
    private int f44417A;

    /* renamed from: B, reason: collision with root package name */
    private int f44418B;

    /* renamed from: C, reason: collision with root package name */
    private int f44419C;

    /* renamed from: D, reason: collision with root package name */
    private int f44420D;

    /* renamed from: E, reason: collision with root package name */
    private StaticLayout f44421E;

    /* renamed from: F, reason: collision with root package name */
    private StaticLayout f44422F;

    /* renamed from: G, reason: collision with root package name */
    private int f44423G;

    /* renamed from: H, reason: collision with root package name */
    private int f44424H;

    /* renamed from: I, reason: collision with root package name */
    private int f44425I;

    /* renamed from: J, reason: collision with root package name */
    private Rect f44426J;

    /* renamed from: a, reason: collision with root package name */
    private final float f44427a;

    /* renamed from: b, reason: collision with root package name */
    private final float f44428b;

    /* renamed from: c, reason: collision with root package name */
    private final float f44429c;

    /* renamed from: d, reason: collision with root package name */
    private final float f44430d;

    /* renamed from: e, reason: collision with root package name */
    private final float f44431e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f44432f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f44433g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f44434h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f44435i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f44436j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f44437k;

    /* renamed from: l, reason: collision with root package name */
    private float f44438l;

    /* renamed from: m, reason: collision with root package name */
    private int f44439m;

    /* renamed from: n, reason: collision with root package name */
    private int f44440n;

    /* renamed from: o, reason: collision with root package name */
    private float f44441o;

    /* renamed from: p, reason: collision with root package name */
    private int f44442p;

    /* renamed from: q, reason: collision with root package name */
    private float f44443q;

    /* renamed from: r, reason: collision with root package name */
    private float f44444r;

    /* renamed from: s, reason: collision with root package name */
    private int f44445s;

    /* renamed from: t, reason: collision with root package name */
    private int f44446t;

    /* renamed from: u, reason: collision with root package name */
    private int f44447u;

    /* renamed from: v, reason: collision with root package name */
    private int f44448v;

    /* renamed from: w, reason: collision with root package name */
    private int f44449w;

    /* renamed from: x, reason: collision with root package name */
    private float f44450x;

    /* renamed from: y, reason: collision with root package name */
    private float f44451y;

    /* renamed from: z, reason: collision with root package name */
    private float f44452z;

    public w(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f44431e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f44430d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f44427a = round;
        this.f44428b = round;
        this.f44429c = round;
        TextPaint textPaint = new TextPaint();
        this.f44432f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f44433g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f44434h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private void b(Canvas canvas, boolean z11) {
        Canvas canvas2;
        if (!z11) {
            this.f44426J.getClass();
            this.f44437k.getClass();
            canvas.drawBitmap(this.f44437k, (Rect) null, this.f44426J, this.f44434h);
            return;
        }
        StaticLayout staticLayout = this.f44421E;
        StaticLayout staticLayout2 = this.f44422F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f44423G, this.f44424H);
        if (Color.alpha(this.f44447u) > 0) {
            Paint paint = this.f44433g;
            paint.setColor(this.f44447u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f44425I, 0.0f, staticLayout.getWidth() + this.f44425I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f44449w;
        TextPaint textPaint = this.f44432f;
        if (i11 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f44427a);
            textPaint.setColor(this.f44448v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f7 = this.f44428b;
            if (i11 == 2) {
                float f11 = this.f44429c;
                textPaint.setShadowLayer(f7, f11, f11, this.f44448v);
            } else if (i11 == 3 || i11 == 4) {
                boolean z12 = i11 == 3;
                int i12 = z12 ? -1 : this.f44448v;
                int i13 = z12 ? this.f44448v : -1;
                float f12 = f7 / 2.0f;
                textPaint.setColor(this.f44445s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f7, f13, f13, i12);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f7, f12, f12, i13);
            }
        }
        textPaint.setColor(this.f44445s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C7855a c7855a, C10655a c10655a, float f7, float f11, float f12, Canvas canvas, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        float f13;
        int i17;
        float f14;
        float f15;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        Bitmap bitmap = c7855a.f72602d;
        boolean z11 = bitmap == null;
        CharSequence charSequence = c7855a.f72599a;
        if (!z11) {
            i15 = -16777216;
        } else if (TextUtils.isEmpty(charSequence)) {
            return;
        } else {
            i15 = c7855a.f72610l ? c7855a.f72611m : c10655a.f105013c;
        }
        CharSequence charSequence2 = this.f44435i;
        TextPaint textPaint = this.f44432f;
        float f16 = c7855a.f72609k;
        float f17 = c7855a.f72608j;
        int i25 = c7855a.f72607i;
        float f18 = c7855a.f72606h;
        int i26 = c7855a.f72605g;
        int i27 = c7855a.f72604f;
        float f19 = c7855a.f72603e;
        Layout.Alignment alignment = c7855a.f72600b;
        if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(this.f44436j, alignment) && this.f44437k == bitmap && this.f44438l == f19 && this.f44439m == i27) {
            i16 = i26;
            if (Integer.valueOf(this.f44440n).equals(Integer.valueOf(i16)) && this.f44441o == f18 && Integer.valueOf(this.f44442p).equals(Integer.valueOf(i25)) && this.f44443q == f17 && this.f44444r == f16 && this.f44445s == c10655a.f105011a && this.f44446t == c10655a.f105012b && this.f44447u == i15 && this.f44449w == c10655a.f105014d && this.f44448v == c10655a.f105015e && Objects.equals(textPaint.getTypeface(), c10655a.f105016f) && this.f44450x == f7 && this.f44451y == f11 && this.f44452z == f12 && this.f44417A == i11 && this.f44418B == i12 && this.f44419C == i13 && this.f44420D == i14) {
                b(canvas, z11);
                return;
            }
        } else {
            i16 = i26;
        }
        this.f44435i = charSequence;
        this.f44436j = alignment;
        this.f44437k = bitmap;
        this.f44438l = f19;
        this.f44439m = i27;
        this.f44440n = i16;
        this.f44441o = f18;
        this.f44442p = i25;
        this.f44443q = f17;
        this.f44444r = f16;
        this.f44445s = c10655a.f105011a;
        this.f44446t = c10655a.f105012b;
        this.f44447u = i15;
        this.f44449w = c10655a.f105014d;
        this.f44448v = c10655a.f105015e;
        textPaint.setTypeface(c10655a.f105016f);
        this.f44450x = f7;
        this.f44451y = f11;
        this.f44452z = f12;
        this.f44417A = i11;
        this.f44418B = i12;
        this.f44419C = i13;
        this.f44420D = i14;
        if (z11) {
            this.f44435i.getClass();
            CharSequence charSequence3 = this.f44435i;
            SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(this.f44435i);
            int i28 = this.f44419C - this.f44417A;
            int i29 = this.f44420D - this.f44418B;
            textPaint.setTextSize(this.f44450x);
            int i31 = (int) ((this.f44450x * 0.125f) + 0.5f);
            int i32 = i31 * 2;
            int i33 = i28 - i32;
            float f21 = this.f44443q;
            if (f21 != -3.4028235E38f) {
                i33 = (int) (i33 * f21);
            }
            int i34 = i33;
            if (i34 <= 0) {
                m3.s.f("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            } else {
                if (this.f44451y > 0.0f) {
                    f15 = -3.4028235E38f;
                    i18 = 0;
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f44451y), 0, spannableStringBuilder.length(), 16711680);
                } else {
                    f15 = -3.4028235E38f;
                    i18 = 0;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if (this.f44449w == 1) {
                    for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i18, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                        spannableStringBuilder2.removeSpan(foregroundColorSpan);
                    }
                }
                if (Color.alpha(this.f44446t) > 0) {
                    int i35 = this.f44449w;
                    if (i35 == 0 || i35 == 2) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f44446t), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f44446t), 0, spannableStringBuilder2.length(), 16711680);
                    }
                }
                Layout.Alignment alignment2 = this.f44436j;
                if (alignment2 == null) {
                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                }
                Layout.Alignment alignment3 = alignment2;
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i34, alignment3, this.f44430d, this.f44431e, true);
                int i36 = i34;
                this.f44421E = staticLayout;
                int height = staticLayout.getHeight();
                int lineCount = this.f44421E.getLineCount();
                int i37 = 0;
                int i38 = 0;
                while (i37 < lineCount) {
                    i38 = Math.max((int) Math.ceil(this.f44421E.getLineWidth(i37)), i38);
                    i37++;
                    i36 = i36;
                }
                int i39 = i36;
                int i41 = ((this.f44443q == f15 || i38 >= i39) ? i38 : i39) + i32;
                float f22 = this.f44441o;
                if (f22 != f15) {
                    int round = Math.round(i28 * f22);
                    int i42 = this.f44417A;
                    int i43 = round + i42;
                    int i44 = this.f44442p;
                    if (i44 == 1) {
                        i43 = ((i43 * 2) - i41) / 2;
                    } else if (i44 == 2) {
                        i43 -= i41;
                    }
                    i19 = Math.max(i43, i42);
                    i21 = Math.min(i19 + i41, this.f44419C);
                } else {
                    i19 = this.f44417A + ((i28 - i41) / 2);
                    i21 = i19 + i41;
                }
                int i45 = i21 - i19;
                if (i45 <= 0) {
                    m3.s.f("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                } else {
                    float f23 = this.f44438l;
                    if (f23 == f15) {
                        i22 = (this.f44420D - height) - ((int) (i29 * this.f44452z));
                    } else if (this.f44439m == 0) {
                        i22 = Math.round(i29 * f23) + this.f44418B;
                        int i46 = this.f44440n;
                        if (i46 != 2) {
                            if (i46 == 1) {
                                i22 = ((i22 * 2) - height) / 2;
                            }
                            i23 = i22 + height;
                            i24 = this.f44420D;
                            if (i23 <= i24) {
                                i22 = i24 - height;
                            } else {
                                int i47 = this.f44418B;
                                if (i22 < i47) {
                                    i22 = i47;
                                }
                            }
                        }
                        i22 -= height;
                        i23 = i22 + height;
                        i24 = this.f44420D;
                        if (i23 <= i24) {
                        }
                    } else {
                        int lineBottom = this.f44421E.getLineBottom(0) - this.f44421E.getLineTop(0);
                        float f24 = this.f44438l;
                        if (f24 >= 0.0f) {
                            i22 = Math.round(f24 * lineBottom) + this.f44418B;
                            i23 = i22 + height;
                            i24 = this.f44420D;
                            if (i23 <= i24) {
                            }
                        } else {
                            i22 = Math.round((f24 + 1.0f) * lineBottom) + this.f44420D;
                            i22 -= height;
                            i23 = i22 + height;
                            i24 = this.f44420D;
                            if (i23 <= i24) {
                            }
                        }
                    }
                    this.f44421E = new StaticLayout(spannableStringBuilder3, textPaint, i45, alignment3, this.f44430d, this.f44431e, true);
                    this.f44422F = new StaticLayout(spannableStringBuilder2, textPaint, i45, alignment3, this.f44430d, this.f44431e, true);
                    this.f44423G = i19;
                    this.f44424H = i22;
                    this.f44425I = i31;
                }
            }
        } else {
            this.f44437k.getClass();
            Bitmap bitmap2 = this.f44437k;
            int i48 = this.f44419C;
            int i49 = this.f44417A;
            int i51 = this.f44420D;
            int i52 = this.f44418B;
            float f25 = i48 - i49;
            float f26 = (this.f44441o * f25) + i49;
            float f27 = i51 - i52;
            float f28 = (this.f44438l * f27) + i52;
            int round2 = Math.round(f25 * this.f44443q);
            float f29 = this.f44444r;
            int round3 = f29 != -3.4028235E38f ? Math.round(f27 * f29) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * round2);
            int i53 = this.f44442p;
            if (i53 == 2) {
                f13 = round2;
            } else {
                if (i53 == 1) {
                    f13 = round2 / 2;
                }
                int round4 = Math.round(f26);
                i17 = this.f44440n;
                if (i17 != 2) {
                    f14 = round3;
                } else {
                    if (i17 == 1) {
                        f14 = round3 / 2;
                    }
                    int round5 = Math.round(f28);
                    this.f44426J = new Rect(round4, round5, round2 + round4, round3 + round5);
                }
                f28 -= f14;
                int round52 = Math.round(f28);
                this.f44426J = new Rect(round4, round52, round2 + round4, round3 + round52);
            }
            f26 -= f13;
            int round42 = Math.round(f26);
            i17 = this.f44440n;
            if (i17 != 2) {
            }
            f28 -= f14;
            int round522 = Math.round(f28);
            this.f44426J = new Rect(round42, round522, round2 + round42, round3 + round522);
        }
        b(canvas, z11);
    }
}
