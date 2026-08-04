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
import p143u.b;
import p165y.f;
import p165y.k;
import p169z.n;
import p169z.o;
import p169z.w;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Paint f8980C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public MotionLayout f8981D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float[] f8982E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Matrix f8983F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f8984G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f8985H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f948t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 0) {
                    this.f8985H = typedArrayObtainStyledAttributes.getColor(index, this.f8985H);
                } else if (index == 2) {
                    this.f8984G = typedArrayObtainStyledAttributes.getInt(index, this.f8984G);
                } else if (index == 1) {
                    this.f8986I = typedArrayObtainStyledAttributes.getFloat(index, this.f8986I);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
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
        int i7;
        float[] fArr;
        int i8;
        float[] fArr2;
        int i9;
        float f7;
        double[] dArr;
        MotionTelltales motionTelltales = this;
        int i10 = 5;
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = motionTelltales.f8983F;
        matrix.invert(matrix2);
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
        float[] fArr3 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i11 = 0;
        while (i11 < i10) {
            float f8 = fArr3[i11];
            int i12 = 0;
            while (i12 < i10) {
                float f9 = fArr3[i12];
                MotionLayout motionLayout = motionTelltales.f8981D;
                int i13 = motionTelltales.f8984G;
                float fA = motionLayout.f8840M;
                float interpolation = motionLayout.f8862a0;
                if (motionLayout.f8836K != null) {
                    float fSignum = Math.signum(motionLayout.c0 - interpolation);
                    float interpolation2 = motionLayout.f8836K.getInterpolation(motionLayout.f8862a0 + 1.0E-5f);
                    interpolation = motionLayout.f8836K.getInterpolation(motionLayout.f8862a0);
                    fA = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / motionLayout.f8858V;
                }
                o oVar = motionLayout.f8836K;
                if (oVar != null) {
                    fA = oVar.a();
                }
                float f10 = fA;
                n nVar = (n) motionLayout.f8854T.get(motionTelltales);
                int i14 = i13 & 1;
                float[] fArr4 = motionTelltales.f8982E;
                if (i14 == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float[] fArr5 = nVar.f18341v;
                    float fB = nVar.b(fArr5, interpolation);
                    HashMap map = nVar.f18344y;
                    fArr = fArr3;
                    k kVar = map == null ? null : (k) map.get("translationX");
                    HashMap map2 = nVar.f18344y;
                    k kVar2 = map2 == null ? null : (k) map2.get("translationY");
                    HashMap map3 = nVar.f18344y;
                    i8 = i11;
                    k kVar3 = map3 == null ? null : (k) map3.get("rotation");
                    HashMap map4 = nVar.f18344y;
                    i7 = width;
                    k kVar4 = map4 == null ? null : (k) map4.get("scaleX");
                    HashMap map5 = nVar.f18344y;
                    k kVar5 = map5 == null ? null : (k) map5.get("scaleY");
                    HashMap map6 = nVar.f18345z;
                    f fVar = map6 == null ? null : (f) map6.get("translationX");
                    HashMap map7 = nVar.f18345z;
                    f fVar2 = map7 == null ? null : (f) map7.get("translationY");
                    HashMap map8 = nVar.f18345z;
                    f fVar3 = map8 == null ? null : (f) map8.get("rotation");
                    HashMap map9 = nVar.f18345z;
                    f fVar4 = map9 == null ? null : (f) map9.get("scaleX");
                    HashMap map10 = nVar.f18345z;
                    f fVar5 = map10 != null ? (f) map10.get("scaleY") : null;
                    a aVar = new a();
                    aVar.f3148e = 0.0f;
                    aVar.f3147d = 0.0f;
                    aVar.f3146c = 0.0f;
                    aVar.f3145b = 0.0f;
                    aVar.f3144a = 0.0f;
                    if (kVar3 != null) {
                        aVar.f3148e = (float) kVar3.f18115a.g(fB);
                        aVar.f3149f = kVar3.a(fB);
                    }
                    if (kVar != null) {
                        aVar.f3146c = (float) kVar.f18115a.g(fB);
                    }
                    if (kVar2 != null) {
                        aVar.f3147d = (float) kVar2.f18115a.g(fB);
                    }
                    if (kVar4 != null) {
                        aVar.f3144a = (float) kVar4.f18115a.g(fB);
                    }
                    if (kVar5 != null) {
                        aVar.f3145b = (float) kVar5.f18115a.g(fB);
                    }
                    if (fVar3 != null) {
                        aVar.f3148e = fVar3.b(fB);
                    }
                    if (fVar != null) {
                        aVar.f3146c = fVar.b(fB);
                    }
                    f fVar6 = fVar2;
                    if (fVar2 != null) {
                        aVar.f3147d = fVar6.b(fB);
                    }
                    if (fVar4 != null) {
                        aVar.f3144a = fVar4.b(fB);
                    }
                    if (fVar5 != null) {
                        aVar.f3145b = fVar5.b(fB);
                    }
                    b bVar = nVar.f18330k;
                    if (bVar != null) {
                        double[] dArr2 = nVar.f18335p;
                        if (dArr2.length > 0) {
                            double d7 = fB;
                            bVar.e(d7, dArr2);
                            nVar.f18330k.h(d7, nVar.f18336q);
                            int[] iArr = nVar.f18334o;
                            double[] dArr3 = nVar.f18336q;
                            double[] dArr4 = nVar.f18335p;
                            nVar.f18326f.getClass();
                            fArr2 = fArr4;
                            w.h(f9, f8, fArr2, iArr, dArr3, dArr4);
                        } else {
                            fArr2 = fArr4;
                        }
                        aVar.a(f9, f8, width2, height2, fArr2);
                        f7 = f9;
                        i9 = i13;
                    } else {
                        fArr2 = fArr4;
                        i12 = i12;
                        if (nVar.j != null) {
                            double dB = nVar.b(fArr5, fB);
                            nVar.j[0].h(dB, nVar.f18336q);
                            nVar.j[0].e(dB, nVar.f18335p);
                            float f11 = fArr5[0];
                            int i15 = 0;
                            while (true) {
                                dArr = nVar.f18336q;
                                if (i15 >= dArr.length) {
                                    break;
                                }
                                dArr[i15] = dArr[i15] * ((double) f11);
                                i15++;
                            }
                            int[] iArr2 = nVar.f18334o;
                            double[] dArr5 = nVar.f18335p;
                            nVar.f18326f.getClass();
                            w.h(f9, f8, fArr2, iArr2, dArr, dArr5);
                            aVar.a(f9, f8, width2, height2, fArr2);
                            i9 = i13;
                            f7 = f9;
                        } else {
                            w wVar = nVar.f18327g;
                            float f12 = wVar.f18390e;
                            w wVar2 = nVar.f18326f;
                            f fVar7 = fVar4;
                            float f13 = f12 - wVar2.f18390e;
                            float f14 = wVar.f18391f - wVar2.f18391f;
                            f fVar8 = fVar;
                            float f15 = wVar.f18392x - wVar2.f18392x;
                            float f16 = (wVar.f18393y - wVar2.f18393y) + f14;
                            fArr2[0] = ((f15 + f13) * f9) + ((1.0f - f9) * f13);
                            fArr2[1] = (f16 * f8) + ((1.0f - f8) * f14);
                            aVar.f3148e = 0.0f;
                            aVar.f3147d = 0.0f;
                            aVar.f3146c = 0.0f;
                            aVar.f3145b = 0.0f;
                            aVar.f3144a = 0.0f;
                            if (kVar3 != 0) {
                                aVar.f3148e = (float) kVar3.f18115a.g(fB);
                                aVar.f3149f = kVar3.a(fB);
                            }
                            if (kVar != null) {
                                aVar.f3146c = (float) kVar.f18115a.g(fB);
                            }
                            if (kVar2 != null) {
                                aVar.f3147d = (float) kVar2.f18115a.g(fB);
                            }
                            if (kVar4 != null) {
                                aVar.f3144a = (float) kVar4.f18115a.g(fB);
                            }
                            if (kVar5 != null) {
                                aVar.f3145b = (float) kVar5.f18115a.g(fB);
                            }
                            if (fVar3 != null) {
                                aVar.f3148e = fVar3.b(fB);
                            }
                            if (fVar8 != null) {
                                aVar.f3146c = fVar8.b(fB);
                            }
                            if (fVar6 != null) {
                                aVar.f3147d = fVar6.b(fB);
                            }
                            if (fVar7 != null) {
                                aVar.f3144a = fVar7.b(fB);
                            }
                            if (fVar5 != null) {
                                aVar.f3145b = fVar5.b(fB);
                            }
                            i9 = i13;
                            f7 = f9;
                            aVar.a(f9, f8, width2, height2, fArr2);
                        }
                    }
                    fArr2 = fArr2;
                } else {
                    f10 = f10;
                    i7 = width;
                    matrix2 = matrix2;
                    height = height;
                    fArr = fArr3;
                    i8 = i11;
                    fArr2 = fArr4;
                    i9 = i13;
                    f7 = f9;
                    i12 = i12;
                    f8 = f8;
                    nVar.d(interpolation, f7, f8, fArr2);
                }
                if (i9 < 2) {
                    fArr2[0] = fArr2[0] * f10;
                    fArr2[1] = fArr2[1] * f10;
                }
                motionTelltales = this;
                float[] fArr6 = motionTelltales.f8982E;
                Matrix matrix3 = matrix2;
                matrix3.mapVectors(fArr6);
                int i16 = i7;
                float f17 = i16 * f7;
                int i17 = height;
                float f18 = i17 * f8;
                float f19 = fArr6[0];
                float f20 = motionTelltales.f8986I;
                float f21 = f18 - (fArr6[1] * f20);
                matrix3.mapVectors(fArr6);
                canvas.drawLine(f17, f18, f17 - (f19 * f20), f21, motionTelltales.f8980C);
                i12++;
                height = i17;
                f8 = f8;
                fArr3 = fArr;
                i11 = i8;
                i10 = 5;
                matrix2 = matrix3;
                width = i16;
            }
            i11++;
            height = height;
            i10 = 5;
            matrix2 = matrix2;
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
