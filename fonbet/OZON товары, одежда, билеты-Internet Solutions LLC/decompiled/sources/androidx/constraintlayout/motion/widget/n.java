package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import p2.C8834a;

/* loaded from: classes8.dex */
final class n {

    /* renamed from: E, reason: collision with root package name */
    private static final float[][] f41517E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: F, reason: collision with root package name */
    private static final float[][] f41518F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A, reason: collision with root package name */
    private float f41519A;

    /* renamed from: B, reason: collision with root package name */
    private float f41520B;

    /* renamed from: C, reason: collision with root package name */
    private int f41521C;

    /* renamed from: D, reason: collision with root package name */
    private int f41522D;

    /* renamed from: a, reason: collision with root package name */
    private int f41523a;

    /* renamed from: b, reason: collision with root package name */
    private int f41524b;

    /* renamed from: c, reason: collision with root package name */
    private int f41525c;

    /* renamed from: d, reason: collision with root package name */
    private int f41526d;

    /* renamed from: e, reason: collision with root package name */
    private int f41527e;

    /* renamed from: f, reason: collision with root package name */
    private int f41528f;

    /* renamed from: g, reason: collision with root package name */
    private float f41529g;

    /* renamed from: h, reason: collision with root package name */
    private float f41530h;

    /* renamed from: i, reason: collision with root package name */
    private int f41531i;

    /* renamed from: j, reason: collision with root package name */
    boolean f41532j;

    /* renamed from: k, reason: collision with root package name */
    private float f41533k;

    /* renamed from: l, reason: collision with root package name */
    private float f41534l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41535m = false;

    /* renamed from: n, reason: collision with root package name */
    private float[] f41536n = new float[2];

    /* renamed from: o, reason: collision with root package name */
    private int[] f41537o = new int[2];

    /* renamed from: p, reason: collision with root package name */
    private float f41538p;

    /* renamed from: q, reason: collision with root package name */
    private float f41539q;

    /* renamed from: r, reason: collision with root package name */
    private final MotionLayout f41540r;

    /* renamed from: s, reason: collision with root package name */
    private float f41541s;

    /* renamed from: t, reason: collision with root package name */
    private float f41542t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f41543u;

    /* renamed from: v, reason: collision with root package name */
    private float f41544v;

    /* renamed from: w, reason: collision with root package name */
    private int f41545w;

    /* renamed from: x, reason: collision with root package name */
    private float f41546x;

    /* renamed from: y, reason: collision with root package name */
    private float f41547y;

    /* renamed from: z, reason: collision with root package name */
    private float f41548z;

    final class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    final class b implements NestedScrollView.d {
    }

    n(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f41523a = 0;
        this.f41524b = 0;
        this.f41525c = 0;
        this.f41526d = -1;
        this.f41527e = -1;
        this.f41528f = -1;
        this.f41529g = 0.5f;
        this.f41530h = 0.5f;
        this.f41531i = -1;
        this.f41532j = false;
        this.f41533k = 0.0f;
        this.f41534l = 1.0f;
        this.f41541s = 4.0f;
        this.f41542t = 1.2f;
        this.f41543u = true;
        this.f41544v = 1.0f;
        this.f41545w = 0;
        this.f41546x = 10.0f;
        this.f41547y = 10.0f;
        this.f41548z = 1.0f;
        this.f41519A = Float.NaN;
        this.f41520B = Float.NaN;
        this.f41521C = 0;
        this.f41522D = 0;
        this.f41540r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f41860q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 16) {
                this.f41526d = obtainStyledAttributes.getResourceId(index, this.f41526d);
            } else if (index == 17) {
                int i12 = obtainStyledAttributes.getInt(index, this.f41523a);
                this.f41523a = i12;
                float[] fArr = f41517E[i12];
                this.f41530h = fArr[0];
                this.f41529g = fArr[1];
            } else if (index == 1) {
                int i13 = obtainStyledAttributes.getInt(index, this.f41524b);
                this.f41524b = i13;
                if (i13 < 6) {
                    float[] fArr2 = f41518F[i13];
                    this.f41533k = fArr2[0];
                    this.f41534l = fArr2[1];
                } else {
                    this.f41534l = Float.NaN;
                    this.f41533k = Float.NaN;
                    this.f41532j = true;
                }
            } else if (index == 6) {
                this.f41541s = obtainStyledAttributes.getFloat(index, this.f41541s);
            } else if (index == 5) {
                this.f41542t = obtainStyledAttributes.getFloat(index, this.f41542t);
            } else if (index == 7) {
                this.f41543u = obtainStyledAttributes.getBoolean(index, this.f41543u);
            } else if (index == 2) {
                this.f41544v = obtainStyledAttributes.getFloat(index, this.f41544v);
            } else if (index == 3) {
                this.f41546x = obtainStyledAttributes.getFloat(index, this.f41546x);
            } else if (index == 18) {
                this.f41527e = obtainStyledAttributes.getResourceId(index, this.f41527e);
            } else if (index == 9) {
                this.f41525c = obtainStyledAttributes.getInt(index, this.f41525c);
            } else if (index == 8) {
                this.f41545w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f41528f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f41531i = obtainStyledAttributes.getResourceId(index, this.f41531i);
            } else if (index == 12) {
                this.f41547y = obtainStyledAttributes.getFloat(index, this.f41547y);
            } else if (index == 13) {
                this.f41548z = obtainStyledAttributes.getFloat(index, this.f41548z);
            } else if (index == 14) {
                this.f41519A = obtainStyledAttributes.getFloat(index, this.f41519A);
            } else if (index == 15) {
                this.f41520B = obtainStyledAttributes.getFloat(index, this.f41520B);
            } else if (index == 11) {
                this.f41521C = obtainStyledAttributes.getInt(index, this.f41521C);
            } else if (index == 0) {
                this.f41522D = obtainStyledAttributes.getInt(index, this.f41522D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    final float a(float f7, float f11) {
        return (f11 * this.f41534l) + (f7 * this.f41533k);
    }

    public final int b() {
        return this.f41522D;
    }

    public final int c() {
        return this.f41545w;
    }

    final RectF d(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f41528f;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    final float e() {
        return this.f41542t;
    }

    public final float f() {
        return this.f41541s;
    }

    final boolean g() {
        return this.f41543u;
    }

    final float h(float f7, float f11) {
        MotionLayout motionLayout = this.f41540r;
        motionLayout.x(this.f41526d, motionLayout.f41262q, this.f41530h, this.f41529g, this.f41536n);
        float f12 = this.f41533k;
        float[] fArr = this.f41536n;
        if (f12 != 0.0f) {
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f7 * f12) / fArr[0];
        }
        if (fArr[1] == 0.0f) {
            fArr[1] = 1.0E-7f;
        }
        return (f11 * this.f41534l) / fArr[1];
    }

    public final int i() {
        return this.f41521C;
    }

    public final float j() {
        return this.f41547y;
    }

    public final float k() {
        return this.f41548z;
    }

    public final float l() {
        return this.f41519A;
    }

    public final float m() {
        return this.f41520B;
    }

    final RectF n(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f41527e;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    final int o() {
        return this.f41527e;
    }

    final boolean p() {
        return this.f41535m;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void q(MotionEvent motionEvent, MotionLayout.f fVar) {
        float f7;
        char c11;
        char c12;
        int i11;
        char c13;
        char c14;
        float right;
        float f11;
        int top;
        int bottom;
        int i12;
        float f12;
        float f13;
        int i13;
        float f14;
        char c15;
        boolean z11 = this.f41532j;
        float[] fArr = this.f41536n;
        MotionLayout motionLayout = this.f41540r;
        if (!z11) {
            MotionLayout.g gVar = (MotionLayout.g) fVar;
            VelocityTracker velocityTracker = gVar.f41309a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f41538p = motionEvent.getRawX();
                this.f41539q = motionEvent.getRawY();
                this.f41535m = false;
                return;
            }
            if (action == 1) {
                this.f41535m = false;
                VelocityTracker velocityTracker2 = gVar.f41309a;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker3 = gVar.f41309a;
                float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                VelocityTracker velocityTracker4 = gVar.f41309a;
                float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
                float f15 = motionLayout.f41262q;
                int i14 = this.f41526d;
                if (i14 != -1) {
                    f7 = f15;
                    motionLayout.x(i14, f7, this.f41530h, this.f41529g, this.f41536n);
                    c11 = 1;
                    c12 = 0;
                } else {
                    f7 = f15;
                    float min = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                    c11 = 1;
                    fArr[1] = this.f41534l * min;
                    c12 = 0;
                    fArr[0] = min * this.f41533k;
                }
                float f16 = this.f41533k != 0.0f ? xVelocity / fArr[c12] : yVelocity / fArr[c11];
                float f17 = !Float.isNaN(f16) ? (f16 / 3.0f) + f7 : f7;
                if (f17 == 0.0f || f17 == 1.0f || (i11 = this.f41525c) == 3) {
                    if (0.0f >= f17 || 1.0f <= f17) {
                        motionLayout.I(MotionLayout.j.FINISHED);
                        return;
                    }
                    return;
                }
                float f18 = ((double) f17) < 0.5d ? 0.0f : 1.0f;
                if (i11 == 6) {
                    if (f7 + f16 < 0.0f) {
                        f16 = Math.abs(f16);
                    }
                    f18 = 1.0f;
                }
                if (this.f41525c == 7) {
                    if (f7 + f16 > 1.0f) {
                        f16 = -Math.abs(f16);
                    }
                    f18 = 0.0f;
                }
                motionLayout.L(f18, this.f41525c, f16);
                if (0.0f >= f7 || 1.0f <= f7) {
                    motionLayout.I(MotionLayout.j.FINISHED);
                    return;
                }
                return;
            }
            if (action != 2) {
                return;
            }
            float rawY = motionEvent.getRawY() - this.f41539q;
            float rawX = motionEvent.getRawX() - this.f41538p;
            if (Math.abs((this.f41534l * rawY) + (this.f41533k * rawX)) > this.f41546x || this.f41535m) {
                float f19 = motionLayout.f41262q;
                if (!this.f41535m) {
                    this.f41535m = true;
                    motionLayout.H(f19);
                }
                int i15 = this.f41526d;
                if (i15 != -1) {
                    this.f41540r.x(i15, f19, this.f41530h, this.f41529g, this.f41536n);
                    c13 = 1;
                    c14 = 0;
                } else {
                    float min2 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                    c13 = 1;
                    fArr[1] = this.f41534l * min2;
                    c14 = 0;
                    fArr[0] = min2 * this.f41533k;
                }
                if (Math.abs(((this.f41534l * fArr[c13]) + (this.f41533k * fArr[c14])) * this.f41544v) < 0.01d) {
                    fArr[0] = 0.01f;
                    fArr[c13] = 0.01f;
                }
                float max = Math.max(Math.min(f19 + (this.f41533k != 0.0f ? rawX / fArr[0] : rawY / fArr[c13]), 1.0f), 0.0f);
                if (this.f41525c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f41525c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float f21 = motionLayout.f41262q;
                if (max != f21) {
                    if (f21 == 0.0f || f21 == 1.0f) {
                        boolean z12 = f21 == 0.0f;
                        int childCount = motionLayout.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            k kVar = motionLayout.f41258m.get(motionLayout.getChildAt(i16));
                            if (kVar != null) {
                                kVar.f(z12);
                            }
                        }
                    }
                    motionLayout.H(max);
                    VelocityTracker velocityTracker5 = gVar.f41309a;
                    if (velocityTracker5 != null) {
                        velocityTracker5.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker6 = gVar.f41309a;
                    float xVelocity2 = velocityTracker6 != null ? velocityTracker6.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker7 = gVar.f41309a;
                    motionLayout.f41251f = this.f41533k != 0.0f ? xVelocity2 / fArr[0] : (velocityTracker7 != null ? velocityTracker7.getYVelocity() : 0.0f) / fArr[1];
                } else {
                    motionLayout.f41251f = 0.0f;
                }
                this.f41538p = motionEvent.getRawX();
                this.f41539q = motionEvent.getRawY();
                return;
            }
            return;
        }
        MotionLayout.g gVar2 = (MotionLayout.g) fVar;
        VelocityTracker velocityTracker8 = gVar2.f41309a;
        if (velocityTracker8 != null) {
            velocityTracker8.addMovement(motionEvent);
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f41538p = motionEvent.getRawX();
            this.f41539q = motionEvent.getRawY();
            this.f41535m = false;
            return;
        }
        int[] iArr = this.f41537o;
        if (action2 != 1) {
            if (action2 != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = motionLayout.getWidth() / 2.0f;
            float height = motionLayout.getHeight() / 2.0f;
            int i17 = this.f41531i;
            if (i17 != -1) {
                View findViewById = motionLayout.findViewById(i17);
                motionLayout.getLocationOnScreen(iArr);
                height = ((findViewById.getBottom() + findViewById.getTop()) / 2.0f) + iArr[1];
                width = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
            } else {
                int i18 = this.f41526d;
                if (i18 != -1) {
                    if (motionLayout.findViewById(motionLayout.f41258m.get(motionLayout.findViewById(i18)).h()) == null) {
                        Log.e("TouchResponse", "could not find view to animate to");
                    } else {
                        motionLayout.getLocationOnScreen(iArr);
                        width = iArr[0] + ((r10.getRight() + r10.getLeft()) / 2.0f);
                        height = iArr[1] + ((r10.getBottom() + r10.getTop()) / 2.0f);
                    }
                }
            }
            float rawX2 = motionEvent.getRawX() - width;
            float rawY2 = motionEvent.getRawY() - height;
            float atan2 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.f41539q - height, this.f41538p - width)) * 180.0d) / 3.141592653589793d);
            if (atan2 > 330.0f) {
                atan2 -= 360.0f;
            } else if (atan2 < -330.0f) {
                atan2 += 360.0f;
            }
            if (Math.abs(atan2) > 0.01d || this.f41535m) {
                float f22 = motionLayout.f41262q;
                if (!this.f41535m) {
                    this.f41535m = true;
                    motionLayout.H(f22);
                }
                int i19 = this.f41526d;
                if (i19 != -1) {
                    c15 = 1;
                    f14 = f22;
                    this.f41540r.x(i19, f14, this.f41530h, this.f41529g, this.f41536n);
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    f14 = f22;
                    c15 = 1;
                    fArr[1] = 360.0f;
                }
                float max2 = Math.max(Math.min(((atan2 * this.f41544v) / fArr[c15]) + f14, 1.0f), 0.0f);
                float f23 = motionLayout.f41262q;
                if (max2 != f23) {
                    if (f23 == 0.0f || f23 == 1.0f) {
                        boolean z13 = f23 == 0.0f;
                        int childCount2 = motionLayout.getChildCount();
                        for (int i21 = 0; i21 < childCount2; i21++) {
                            k kVar2 = motionLayout.f41258m.get(motionLayout.getChildAt(i21));
                            if (kVar2 != null) {
                                kVar2.f(z13);
                            }
                        }
                    }
                    motionLayout.H(max2);
                    VelocityTracker velocityTracker9 = gVar2.f41309a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker10 = gVar2.f41309a;
                    float xVelocity3 = velocityTracker10 != null ? velocityTracker10.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker11 = gVar2.f41309a;
                    double yVelocity2 = velocityTracker11 != null ? velocityTracker11.getYVelocity() : 0.0f;
                    double d11 = xVelocity3;
                    motionLayout.f41251f = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d11) - r7) * Math.hypot(yVelocity2, d11)) / Math.hypot(rawX2, rawY2)));
                } else {
                    motionLayout.f41251f = 0.0f;
                }
                this.f41538p = motionEvent.getRawX();
                this.f41539q = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f41535m = false;
        VelocityTracker velocityTracker12 = gVar2.f41309a;
        if (velocityTracker12 != null) {
            velocityTracker12.computeCurrentVelocity(16);
        }
        VelocityTracker velocityTracker13 = gVar2.f41309a;
        float xVelocity4 = velocityTracker13 != null ? velocityTracker13.getXVelocity() : 0.0f;
        VelocityTracker velocityTracker14 = gVar2.f41309a;
        float yVelocity3 = velocityTracker14 != null ? velocityTracker14.getYVelocity() : 0.0f;
        float f24 = motionLayout.f41262q;
        float width2 = motionLayout.getWidth() / 2.0f;
        float height2 = motionLayout.getHeight() / 2.0f;
        int i22 = this.f41531i;
        if (i22 == -1) {
            int i23 = this.f41526d;
            if (i23 != -1) {
                View findViewById2 = motionLayout.findViewById(motionLayout.f41258m.get(motionLayout.findViewById(i23)).h());
                motionLayout.getLocationOnScreen(iArr);
                right = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                f11 = iArr[1];
                top = findViewById2.getTop();
                bottom = findViewById2.getBottom();
            }
            float rawX3 = motionEvent.getRawX() - width2;
            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX3));
            i12 = this.f41526d;
            if (i12 == -1) {
                f12 = f24;
                this.f41540r.x(i12, f12, this.f41530h, this.f41529g, this.f41536n);
                fArr[1] = (float) Math.toDegrees(fArr[1]);
            } else {
                f12 = f24;
                fArr[1] = 360.0f;
            }
            float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + r1, xVelocity4 + rawX3)) - degrees)) * 62.5f;
            f13 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * this.f41544v) / fArr[1]) + f12 : f12;
            if (f13 != 0.0f || f13 == 1.0f || (i13 = this.f41525c) == 3) {
                if (0.0f < f13 || 1.0f <= f13) {
                    motionLayout.I(MotionLayout.j.FINISHED);
                }
                return;
            }
            float f25 = (degrees2 * this.f41544v) / fArr[1];
            float f26 = ((double) f13) < 0.5d ? 0.0f : 1.0f;
            if (i13 == 6) {
                if (f12 + f25 < 0.0f) {
                    f25 = Math.abs(f25);
                }
                f26 = 1.0f;
            }
            if (this.f41525c == 7) {
                if (f12 + f25 > 1.0f) {
                    f25 = -Math.abs(f25);
                }
                f26 = 0.0f;
            }
            motionLayout.L(f26, this.f41525c, f25 * 3.0f);
            if (0.0f >= f12 || 1.0f <= f12) {
                motionLayout.I(MotionLayout.j.FINISHED);
                return;
            }
            return;
        }
        View findViewById3 = motionLayout.findViewById(i22);
        motionLayout.getLocationOnScreen(iArr);
        right = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
        f11 = iArr[1];
        top = findViewById3.getTop();
        bottom = findViewById3.getBottom();
        float f27 = right;
        height2 = ((bottom + top) / 2.0f) + f11;
        width2 = f27;
        float rawX32 = motionEvent.getRawX() - width2;
        double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX32));
        i12 = this.f41526d;
        if (i12 == -1) {
        }
        float degrees22 = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + r1, xVelocity4 + rawX32)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees22)) {
        }
        if (f13 != 0.0f) {
        }
        if (0.0f < f13) {
        }
        motionLayout.I(MotionLayout.j.FINISHED);
    }

    final void r(float f7, float f11) {
        MotionLayout motionLayout = this.f41540r;
        float f12 = motionLayout.f41262q;
        if (!this.f41535m) {
            this.f41535m = true;
            motionLayout.H(f12);
        }
        this.f41540r.x(this.f41526d, f12, this.f41530h, this.f41529g, this.f41536n);
        float f13 = this.f41533k;
        float[] fArr = this.f41536n;
        if (Math.abs((this.f41534l * fArr[1]) + (f13 * fArr[0])) < 0.01d) {
            fArr[0] = 0.01f;
            fArr[1] = 0.01f;
        }
        float f14 = this.f41533k;
        float max = Math.max(Math.min(f12 + (f14 != 0.0f ? (f7 * f14) / fArr[0] : (f11 * this.f41534l) / fArr[1]), 1.0f), 0.0f);
        if (max != motionLayout.f41262q) {
            motionLayout.H(max);
        }
    }

    final void s(float f7, float f11) {
        this.f41535m = false;
        MotionLayout motionLayout = this.f41540r;
        float f12 = motionLayout.f41262q;
        motionLayout.x(this.f41526d, f12, this.f41530h, this.f41529g, this.f41536n);
        float f13 = this.f41533k;
        float[] fArr = this.f41536n;
        float f14 = f13 != 0.0f ? (f7 * f13) / fArr[0] : (f11 * this.f41534l) / fArr[1];
        if (!Float.isNaN(f14)) {
            f12 += f14 / 3.0f;
        }
        if (f12 != 0.0f) {
            boolean z11 = f12 != 1.0f;
            int i11 = this.f41525c;
            if ((i11 != 3) && z11) {
                this.f41540r.L(((double) f12) >= 0.5d ? 1.0f : 0.0f, i11, f14);
            }
        }
    }

    final void t(float f7, float f11) {
        this.f41538p = f7;
        this.f41539q = f11;
    }

    public final String toString() {
        if (Float.isNaN(this.f41533k)) {
            return "rotation";
        }
        return this.f41533k + " , " + this.f41534l;
    }

    public final void u(boolean z11) {
        float[][] fArr = f41517E;
        float[][] fArr2 = f41518F;
        if (z11) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f41523a];
        this.f41530h = fArr3[0];
        this.f41529g = fArr3[1];
        int i11 = this.f41524b;
        if (i11 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i11];
        this.f41533k = fArr4[0];
        this.f41534l = fArr4[1];
    }

    final void v(float f7, float f11) {
        this.f41538p = f7;
        this.f41539q = f11;
        this.f41535m = false;
    }

    final void w() {
        View view;
        int i11 = this.f41526d;
        if (i11 != -1) {
            MotionLayout motionLayout = this.f41540r;
            view = motionLayout.findViewById(i11);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + C8834a.c(this.f41526d, motionLayout.getContext()));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }
}
