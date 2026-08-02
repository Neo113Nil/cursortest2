package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import h2.C6785c;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class e extends f {

    /* renamed from: f, reason: collision with root package name */
    String f41356f;

    /* renamed from: g, reason: collision with root package name */
    int f41357g;

    /* renamed from: h, reason: collision with root package name */
    int f41358h;

    /* renamed from: i, reason: collision with root package name */
    float f41359i;

    /* renamed from: j, reason: collision with root package name */
    float f41360j;

    /* renamed from: k, reason: collision with root package name */
    float f41361k;

    /* renamed from: l, reason: collision with root package name */
    float f41362l;

    /* renamed from: m, reason: collision with root package name */
    float f41363m;

    /* renamed from: n, reason: collision with root package name */
    float f41364n;

    /* renamed from: o, reason: collision with root package name */
    int f41365o;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f41366a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41366a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }

        static void a(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                SparseIntArray sparseIntArray = f41366a;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        if (MotionLayout.f41220I0) {
                            int resourceId = typedArray.getResourceId(index, eVar.f41315b);
                            eVar.f41315b = resourceId;
                            if (resourceId == -1) {
                                eVar.f41316c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.f41316c = typedArray.getString(index);
                            break;
                        } else {
                            eVar.f41315b = typedArray.getResourceId(index, eVar.f41315b);
                            break;
                        }
                    case 2:
                        eVar.f41314a = typedArray.getInt(index, eVar.f41314a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            eVar.f41356f = typedArray.getString(index);
                            break;
                        } else {
                            eVar.f41356f = C6785c.f64643c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        eVar.f41367e = typedArray.getInteger(index, eVar.f41367e);
                        break;
                    case 5:
                        eVar.f41358h = typedArray.getInt(index, eVar.f41358h);
                        break;
                    case 6:
                        eVar.f41361k = typedArray.getFloat(index, eVar.f41361k);
                        break;
                    case 7:
                        eVar.f41362l = typedArray.getFloat(index, eVar.f41362l);
                        break;
                    case 8:
                        float f7 = typedArray.getFloat(index, eVar.f41360j);
                        eVar.f41359i = f7;
                        eVar.f41360j = f7;
                        break;
                    case 9:
                        eVar.f41365o = typedArray.getInt(index, eVar.f41365o);
                        break;
                    case 10:
                        eVar.f41357g = typedArray.getInt(index, eVar.f41357g);
                        break;
                    case 11:
                        eVar.f41359i = typedArray.getFloat(index, eVar.f41359i);
                        break;
                    case 12:
                        eVar.f41360j = typedArray.getFloat(index, eVar.f41360j);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                }
            }
            if (eVar.f41314a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public e() {
        this.f41367e = -1;
        this.f41356f = null;
        this.f41357g = -1;
        this.f41358h = 0;
        this.f41359i = Float.NaN;
        this.f41360j = Float.NaN;
        this.f41361k = Float.NaN;
        this.f41362l = Float.NaN;
        this.f41363m = Float.NaN;
        this.f41364n = Float.NaN;
        this.f41365o = 0;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void a(HashMap<String, o2.d> hashMap) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public final androidx.constraintlayout.motion.widget.a clone() {
        e eVar = new e();
        super.c(this);
        eVar.f41356f = this.f41356f;
        eVar.f41357g = this.f41357g;
        eVar.f41358h = this.f41358h;
        eVar.f41359i = this.f41359i;
        eVar.f41360j = Float.NaN;
        eVar.f41361k = this.f41361k;
        eVar.f41362l = this.f41362l;
        eVar.f41363m = this.f41363m;
        eVar.f41364n = this.f41364n;
        return eVar;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f41851h));
    }
}
