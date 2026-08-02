package androidx.constraintlayout.utils.widget;

import B.q;
import H.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import u.C1613b;
import y.f;
import y.k;
import z.n;
import z.o;
import z.w;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: C, reason: collision with root package name */
    public final Paint f8980C;

    /* renamed from: D, reason: collision with root package name */
    public MotionLayout f8981D;

    /* renamed from: E, reason: collision with root package name */
    public final float[] f8982E;

    /* renamed from: F, reason: collision with root package name */
    public final Matrix f8983F;

    /* renamed from: G, reason: collision with root package name */
    public final int f8984G;

    /* renamed from: H, reason: collision with root package name */
    public final int f8985H;

    /* renamed from: I, reason: collision with root package name */
    public final float f8986I;

    public MotionTelltales(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8980C = new Paint();
        this.f8982E = new float[2];
        this.f8983F = new Matrix();
        this.f8984G = 0;
        this.f8985H = -65281;
        this.f8986I = 0.25f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f948t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 0) {
                    this.f8985H = obtainStyledAttributes.getColor(index, this.f8985H);
                } else if (index == 2) {
                    this.f8984G = obtainStyledAttributes.getInt(index, this.f8984G);
                } else if (index == 1) {
                    this.f8986I = obtainStyledAttributes.getFloat(index, this.f8986I);
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i9 = this.f8985H;
        Paint paint = this.f8980C;
        paint.setColor(i9);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        int i7;
        Matrix matrix;
        int i8;
        float[] fArr;
        int i9;
        float[] fArr2;
        int i10;
        float f8;
        int i11;
        float f9;
        k kVar;
        float[] fArr3;
        k kVar2;
        int i12;
        k kVar3;
        k kVar4;
        k kVar5;
        f fVar;
        n nVar;
        k kVar6;
        float[] fArr4;
        double[] dArr;
        a aVar;
        float f10;
        int i13;
        MotionTelltales motionTelltales = this;
        int i14 = 5;
        super.onDraw(canvas);
        Matrix matrix2 = getMatrix();
        Matrix matrix3 = motionTelltales.f8983F;
        matrix2.invert(matrix3);
        if (motionTelltales.f8981D == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f8981D = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr5 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i15 = 0;
        while (i15 < i14) {
            float f11 = fArr5[i15];
            int i16 = 0;
            while (i16 < i14) {
                float f12 = fArr5[i16];
                MotionLayout motionLayout = motionTelltales.f8981D;
                int i17 = motionTelltales.f8984G;
                float f13 = motionLayout.f8840M;
                float f14 = motionLayout.f8862a0;
                if (motionLayout.f8836K != null) {
                    float signum = Math.signum(motionLayout.c0 - f14);
                    float interpolation = motionLayout.f8836K.getInterpolation(motionLayout.f8862a0 + 1.0E-5f);
                    f14 = motionLayout.f8836K.getInterpolation(motionLayout.f8862a0);
                    f13 = (((interpolation - f14) / 1.0E-5f) * signum) / motionLayout.f8858V;
                }
                o oVar = motionLayout.f8836K;
                if (oVar != null) {
                    f13 = oVar.a();
                }
                float f15 = f13;
                n nVar2 = (n) motionLayout.f8854T.get(motionTelltales);
                int i18 = i17 & 1;
                float[] fArr6 = motionTelltales.f8982E;
                if (i18 == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float[] fArr7 = nVar2.f18335v;
                    float b7 = nVar2.b(fArr7, f14);
                    HashMap hashMap = nVar2.f18338y;
                    fArr = fArr5;
                    if (hashMap == null) {
                        fArr3 = fArr6;
                        kVar = null;
                    } else {
                        kVar = (k) hashMap.get("translationX");
                        fArr3 = fArr6;
                    }
                    HashMap hashMap2 = nVar2.f18338y;
                    if (hashMap2 == null) {
                        i12 = i16;
                        kVar2 = null;
                    } else {
                        kVar2 = (k) hashMap2.get("translationY");
                        i12 = i16;
                    }
                    HashMap hashMap3 = nVar2.f18338y;
                    i9 = i15;
                    if (hashMap3 == null) {
                        i8 = height;
                        kVar3 = null;
                    } else {
                        kVar3 = (k) hashMap3.get("rotation");
                        i8 = height;
                    }
                    HashMap hashMap4 = nVar2.f18338y;
                    i7 = width;
                    if (hashMap4 == null) {
                        matrix = matrix3;
                        kVar4 = null;
                    } else {
                        kVar4 = (k) hashMap4.get("scaleX");
                        matrix = matrix3;
                    }
                    HashMap hashMap5 = nVar2.f18338y;
                    if (hashMap5 == null) {
                        f7 = f15;
                        kVar5 = null;
                    } else {
                        kVar5 = (k) hashMap5.get("scaleY");
                        f7 = f15;
                    }
                    HashMap hashMap6 = nVar2.f18339z;
                    f fVar2 = hashMap6 == null ? null : (f) hashMap6.get("translationX");
                    HashMap hashMap7 = nVar2.f18339z;
                    f fVar3 = hashMap7 == null ? null : (f) hashMap7.get("translationY");
                    HashMap hashMap8 = nVar2.f18339z;
                    f fVar4 = hashMap8 == null ? null : (f) hashMap8.get("rotation");
                    HashMap hashMap9 = nVar2.f18339z;
                    f fVar5 = hashMap9 == null ? null : (f) hashMap9.get("scaleX");
                    HashMap hashMap10 = nVar2.f18339z;
                    f fVar6 = hashMap10 != null ? (f) hashMap10.get("scaleY") : null;
                    a aVar2 = new a();
                    aVar2.f3148e = 0.0f;
                    aVar2.f3147d = 0.0f;
                    aVar2.f3146c = 0.0f;
                    aVar2.f3145b = 0.0f;
                    aVar2.f3144a = 0.0f;
                    if (kVar3 != null) {
                        fVar = fVar3;
                        nVar = nVar2;
                        aVar2.f3148e = (float) kVar3.f18109a.g(b7);
                        aVar2.f3149f = kVar3.a(b7);
                    } else {
                        fVar = fVar3;
                        nVar = nVar2;
                    }
                    if (kVar != null) {
                        kVar6 = kVar3;
                        f9 = f11;
                        aVar2.f3146c = (float) kVar.f18109a.g(b7);
                    } else {
                        kVar6 = kVar3;
                        f9 = f11;
                    }
                    if (kVar2 != null) {
                        aVar2.f3147d = (float) kVar2.f18109a.g(b7);
                    }
                    if (kVar4 != null) {
                        aVar2.f3144a = (float) kVar4.f18109a.g(b7);
                    }
                    if (kVar5 != null) {
                        aVar2.f3145b = (float) kVar5.f18109a.g(b7);
                    }
                    if (fVar4 != null) {
                        aVar2.f3148e = fVar4.b(b7);
                    }
                    if (fVar2 != null) {
                        aVar2.f3146c = fVar2.b(b7);
                    }
                    f fVar7 = fVar;
                    if (fVar != null) {
                        aVar2.f3147d = fVar7.b(b7);
                    }
                    if (fVar5 != null) {
                        aVar2.f3144a = fVar5.b(b7);
                    }
                    if (fVar6 != null) {
                        aVar2.f3145b = fVar6.b(b7);
                    }
                    n nVar3 = nVar;
                    C1613b c1613b = nVar3.f18324k;
                    if (c1613b != null) {
                        double[] dArr2 = nVar3.f18329p;
                        if (dArr2.length > 0) {
                            double d7 = b7;
                            c1613b.e(d7, dArr2);
                            nVar3.f18324k.h(d7, nVar3.f18330q);
                            int[] iArr = nVar3.f18328o;
                            double[] dArr3 = nVar3.f18330q;
                            double[] dArr4 = nVar3.f18329p;
                            nVar3.f18320f.getClass();
                            fArr4 = fArr3;
                            aVar = aVar2;
                            i13 = i17;
                            f10 = f12;
                            i11 = i12;
                            w.h(f12, f9, fArr4, iArr, dArr3, dArr4);
                        } else {
                            aVar = aVar2;
                            f10 = f12;
                            fArr4 = fArr3;
                            i13 = i17;
                            i11 = i12;
                        }
                        aVar.a(f10, f9, width2, height2, fArr4);
                        f8 = f10;
                        i10 = i13;
                    } else {
                        fArr4 = fArr3;
                        i11 = i12;
                        if (nVar3.j != null) {
                            double b8 = nVar3.b(fArr7, b7);
                            nVar3.j[0].h(b8, nVar3.f18330q);
                            nVar3.j[0].e(b8, nVar3.f18329p);
                            float f16 = fArr7[0];
                            int i19 = 0;
                            while (true) {
                                dArr = nVar3.f18330q;
                                if (i19 >= dArr.length) {
                                    break;
                                }
                                dArr[i19] = dArr[i19] * f16;
                                i19++;
                            }
                            int[] iArr2 = nVar3.f18328o;
                            double[] dArr5 = nVar3.f18329p;
                            nVar3.f18320f.getClass();
                            w.h(f12, f9, fArr4, iArr2, dArr, dArr5);
                            aVar2.a(f12, f9, width2, height2, fArr4);
                            i10 = i17;
                            f8 = f12;
                        } else {
                            w wVar = nVar3.f18321g;
                            float f17 = wVar.f18384e;
                            w wVar2 = nVar3.f18320f;
                            f fVar8 = fVar5;
                            float f18 = f17 - wVar2.f18384e;
                            float f19 = wVar.f18385f - wVar2.f18385f;
                            f fVar9 = fVar2;
                            float f20 = wVar.f18386x - wVar2.f18386x;
                            float f21 = (wVar.f18387y - wVar2.f18387y) + f19;
                            fArr4[0] = ((f20 + f18) * f12) + ((1.0f - f12) * f18);
                            fArr4[1] = (f21 * f9) + ((1.0f - f9) * f19);
                            aVar2.f3148e = 0.0f;
                            aVar2.f3147d = 0.0f;
                            aVar2.f3146c = 0.0f;
                            aVar2.f3145b = 0.0f;
                            aVar2.f3144a = 0.0f;
                            if (kVar6 != null) {
                                fArr2 = fArr4;
                                aVar2.f3148e = (float) kVar6.f18109a.g(b7);
                                aVar2.f3149f = kVar6.a(b7);
                            } else {
                                fArr2 = fArr4;
                            }
                            if (kVar != null) {
                                aVar2.f3146c = (float) kVar.f18109a.g(b7);
                            }
                            if (kVar2 != null) {
                                aVar2.f3147d = (float) kVar2.f18109a.g(b7);
                            }
                            if (kVar4 != null) {
                                aVar2.f3144a = (float) kVar4.f18109a.g(b7);
                            }
                            if (kVar5 != null) {
                                aVar2.f3145b = (float) kVar5.f18109a.g(b7);
                            }
                            if (fVar4 != null) {
                                aVar2.f3148e = fVar4.b(b7);
                            }
                            if (fVar9 != null) {
                                aVar2.f3146c = fVar9.b(b7);
                            }
                            if (fVar7 != null) {
                                aVar2.f3147d = fVar7.b(b7);
                            }
                            if (fVar8 != null) {
                                aVar2.f3144a = fVar8.b(b7);
                            }
                            if (fVar6 != null) {
                                aVar2.f3145b = fVar6.b(b7);
                            }
                            i10 = i17;
                            f8 = f12;
                            aVar2.a(f12, f9, width2, height2, fArr2);
                        }
                    }
                    fArr2 = fArr4;
                } else {
                    f7 = f15;
                    i7 = width;
                    matrix = matrix3;
                    i8 = height;
                    fArr = fArr5;
                    i9 = i15;
                    fArr2 = fArr6;
                    i10 = i17;
                    f8 = f12;
                    i11 = i16;
                    f9 = f11;
                    nVar2.d(f14, f8, f9, fArr2);
                }
                if (i10 < 2) {
                    fArr2[0] = fArr2[0] * f7;
                    fArr2[1] = fArr2[1] * f7;
                }
                motionTelltales = this;
                float[] fArr8 = motionTelltales.f8982E;
                Matrix matrix4 = matrix;
                matrix4.mapVectors(fArr8);
                int i20 = i7;
                float f22 = i20 * f8;
                int i21 = i8;
                float f23 = i21 * f9;
                float f24 = fArr8[0];
                float f25 = motionTelltales.f8986I;
                float f26 = f23 - (fArr8[1] * f25);
                matrix4.mapVectors(fArr8);
                canvas.drawLine(f22, f23, f22 - (f24 * f25), f26, motionTelltales.f8980C);
                i16 = i11 + 1;
                height = i21;
                f11 = f9;
                fArr5 = fArr;
                i15 = i9;
                i14 = 5;
                matrix3 = matrix4;
                width = i20;
            }
            i15++;
            height = height;
            i14 = 5;
            matrix3 = matrix3;
            width = width;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        super.onLayout(z4, i7, i8, i9, i10);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f8926f = charSequence.toString();
        requestLayout();
    }
}
