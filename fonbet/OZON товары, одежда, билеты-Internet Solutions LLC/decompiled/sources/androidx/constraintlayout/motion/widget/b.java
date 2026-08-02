package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o2.d;

/* loaded from: classes8.dex */
public final class b extends androidx.constraintlayout.motion.widget.a {

    /* renamed from: e, reason: collision with root package name */
    private int f41318e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f41319f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    private float f41320g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    private float f41321h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    private float f41322i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    private float f41323j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private float f41324k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private float f41325l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    private float f41326m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f41327n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f41328o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f41329p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f41330q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private float f41331r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    private float f41332s = Float.NaN;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f41333a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41333a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }

        public static void a(b bVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                SparseIntArray sparseIntArray = f41333a;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        bVar.f41319f = typedArray.getFloat(index, bVar.f41319f);
                        break;
                    case 2:
                        bVar.f41320g = typedArray.getDimension(index, bVar.f41320g);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 4:
                        bVar.f41321h = typedArray.getFloat(index, bVar.f41321h);
                        break;
                    case 5:
                        bVar.f41322i = typedArray.getFloat(index, bVar.f41322i);
                        break;
                    case 6:
                        bVar.f41323j = typedArray.getFloat(index, bVar.f41323j);
                        break;
                    case 7:
                        bVar.f41327n = typedArray.getFloat(index, bVar.f41327n);
                        break;
                    case 8:
                        bVar.f41326m = typedArray.getFloat(index, bVar.f41326m);
                        break;
                    case 9:
                        typedArray.getString(index);
                        bVar.getClass();
                        break;
                    case 10:
                        if (MotionLayout.f41220I0) {
                            int resourceId = typedArray.getResourceId(index, bVar.f41315b);
                            bVar.f41315b = resourceId;
                            if (resourceId == -1) {
                                bVar.f41316c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            bVar.f41316c = typedArray.getString(index);
                            break;
                        } else {
                            bVar.f41315b = typedArray.getResourceId(index, bVar.f41315b);
                            break;
                        }
                    case 12:
                        bVar.f41314a = typedArray.getInt(index, bVar.f41314a);
                        break;
                    case 13:
                        bVar.f41318e = typedArray.getInteger(index, bVar.f41318e);
                        break;
                    case 14:
                        bVar.f41328o = typedArray.getFloat(index, bVar.f41328o);
                        break;
                    case 15:
                        bVar.f41329p = typedArray.getDimension(index, bVar.f41329p);
                        break;
                    case 16:
                        bVar.f41330q = typedArray.getDimension(index, bVar.f41330q);
                        break;
                    case 17:
                        bVar.f41331r = typedArray.getDimension(index, bVar.f41331r);
                        break;
                    case 18:
                        bVar.f41332s = typedArray.getFloat(index, bVar.f41332s);
                        break;
                    case 19:
                        bVar.f41324k = typedArray.getDimension(index, bVar.f41324k);
                        break;
                    case 20:
                        bVar.f41325l = typedArray.getDimension(index, bVar.f41325l);
                        break;
                }
            }
        }
    }

    public b() {
        this.f41317d = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void a(HashMap<String, o2.d> hashMap) {
        for (String str : hashMap.keySet()) {
            o2.d dVar = hashMap.get(str);
            if (dVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f41322i)) {
                                break;
                            } else {
                                dVar.b(this.f41322i, this.f41314a);
                                break;
                            }
                        case "rotationY":
                            if (Float.isNaN(this.f41323j)) {
                                break;
                            } else {
                                dVar.b(this.f41323j, this.f41314a);
                                break;
                            }
                        case "translationX":
                            if (Float.isNaN(this.f41329p)) {
                                break;
                            } else {
                                dVar.b(this.f41329p, this.f41314a);
                                break;
                            }
                        case "translationY":
                            if (Float.isNaN(this.f41330q)) {
                                break;
                            } else {
                                dVar.b(this.f41330q, this.f41314a);
                                break;
                            }
                        case "translationZ":
                            if (Float.isNaN(this.f41331r)) {
                                break;
                            } else {
                                dVar.b(this.f41331r, this.f41314a);
                                break;
                            }
                        case "progress":
                            if (Float.isNaN(this.f41332s)) {
                                break;
                            } else {
                                dVar.b(this.f41332s, this.f41314a);
                                break;
                            }
                        case "scaleX":
                            if (Float.isNaN(this.f41327n)) {
                                break;
                            } else {
                                dVar.b(this.f41327n, this.f41314a);
                                break;
                            }
                        case "scaleY":
                            if (Float.isNaN(this.f41328o)) {
                                break;
                            } else {
                                dVar.b(this.f41328o, this.f41314a);
                                break;
                            }
                        case "transformPivotX":
                            if (Float.isNaN(this.f41322i)) {
                                break;
                            } else {
                                dVar.b(this.f41324k, this.f41314a);
                                break;
                            }
                        case "transformPivotY":
                            if (Float.isNaN(this.f41323j)) {
                                break;
                            } else {
                                dVar.b(this.f41325l, this.f41314a);
                                break;
                            }
                        case "rotation":
                            if (Float.isNaN(this.f41321h)) {
                                break;
                            } else {
                                dVar.b(this.f41321h, this.f41314a);
                                break;
                            }
                        case "elevation":
                            if (Float.isNaN(this.f41320g)) {
                                break;
                            } else {
                                dVar.b(this.f41320g, this.f41314a);
                                break;
                            }
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f41326m)) {
                                break;
                            } else {
                                dVar.b(this.f41326m, this.f41314a);
                                break;
                            }
                        case "alpha":
                            if (Float.isNaN(this.f41319f)) {
                                break;
                            } else {
                                dVar.b(this.f41319f, this.f41314a);
                                break;
                            }
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f41317d.get(str.substring(7));
                    if (aVar != null) {
                        ((d.b) dVar).h(this.f41314a, aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public final androidx.constraintlayout.motion.widget.a clone() {
        b bVar = new b();
        super.c(this);
        bVar.f41318e = this.f41318e;
        bVar.f41319f = this.f41319f;
        bVar.f41320g = this.f41320g;
        bVar.f41321h = this.f41321h;
        bVar.f41322i = this.f41322i;
        bVar.f41323j = this.f41323j;
        bVar.f41324k = this.f41324k;
        bVar.f41325l = this.f41325l;
        bVar.f41326m = this.f41326m;
        bVar.f41327n = this.f41327n;
        bVar.f41328o = this.f41328o;
        bVar.f41329p = this.f41329p;
        bVar.f41330q = this.f41330q;
        bVar.f41331r = this.f41331r;
        bVar.f41332s = this.f41332s;
        return bVar;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41319f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41320g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41321h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41322i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41323j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41324k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f41325l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f41329p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41330q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41331r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f41326m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41327n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41328o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41332s)) {
            hashSet.add("progress");
        }
        if (this.f41317d.size() > 0) {
            Iterator<String> it = this.f41317d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f41849f));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f41318e == -1) {
            return;
        }
        if (!Float.isNaN(this.f41319f)) {
            hashMap.put("alpha", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41320g)) {
            hashMap.put("elevation", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41321h)) {
            hashMap.put("rotation", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41322i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41323j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41324k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41325l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41329p)) {
            hashMap.put("translationX", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41330q)) {
            hashMap.put("translationY", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41331r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41326m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41327n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41328o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f41318e));
        }
        if (!Float.isNaN(this.f41332s)) {
            hashMap.put("progress", Integer.valueOf(this.f41318e));
        }
        if (this.f41317d.size() > 0) {
            Iterator<String> it = this.f41317d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(Nk.a.b("CUSTOM,", it.next()), Integer.valueOf(this.f41318e));
            }
        }
    }
}
