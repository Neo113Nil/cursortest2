package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o2.e;

/* loaded from: classes8.dex */
public final class g extends androidx.constraintlayout.motion.widget.a {

    /* renamed from: e, reason: collision with root package name */
    private int f41368e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f41369f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    private float f41370g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    private float f41371h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    private float f41372i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    private float f41373j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private float f41374k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private float f41375l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    private float f41376m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f41377n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f41378o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f41379p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f41380q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private int f41381r = 0;

    /* renamed from: s, reason: collision with root package name */
    private float f41382s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    private float f41383t = 0.0f;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f41384a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41384a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }

        public static void a(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                SparseIntArray sparseIntArray = f41384a;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        gVar.f41369f = typedArray.getFloat(index, gVar.f41369f);
                        break;
                    case 2:
                        gVar.f41370g = typedArray.getDimension(index, gVar.f41370g);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 4:
                        gVar.f41371h = typedArray.getFloat(index, gVar.f41371h);
                        break;
                    case 5:
                        gVar.f41372i = typedArray.getFloat(index, gVar.f41372i);
                        break;
                    case 6:
                        gVar.f41373j = typedArray.getFloat(index, gVar.f41373j);
                        break;
                    case 7:
                        gVar.f41375l = typedArray.getFloat(index, gVar.f41375l);
                        break;
                    case 8:
                        gVar.f41374k = typedArray.getFloat(index, gVar.f41374k);
                        break;
                    case 9:
                        typedArray.getString(index);
                        gVar.getClass();
                        break;
                    case 10:
                        if (MotionLayout.f41220I0) {
                            int resourceId = typedArray.getResourceId(index, gVar.f41315b);
                            gVar.f41315b = resourceId;
                            if (resourceId == -1) {
                                gVar.f41316c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.f41316c = typedArray.getString(index);
                            break;
                        } else {
                            gVar.f41315b = typedArray.getResourceId(index, gVar.f41315b);
                            break;
                        }
                    case 12:
                        gVar.f41314a = typedArray.getInt(index, gVar.f41314a);
                        break;
                    case 13:
                        gVar.f41368e = typedArray.getInteger(index, gVar.f41368e);
                        break;
                    case 14:
                        gVar.f41376m = typedArray.getFloat(index, gVar.f41376m);
                        break;
                    case 15:
                        gVar.f41377n = typedArray.getDimension(index, gVar.f41377n);
                        break;
                    case 16:
                        gVar.f41378o = typedArray.getDimension(index, gVar.f41378o);
                        break;
                    case 17:
                        gVar.f41379p = typedArray.getDimension(index, gVar.f41379p);
                        break;
                    case 18:
                        gVar.f41380q = typedArray.getFloat(index, gVar.f41380q);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            typedArray.getString(index);
                            gVar.getClass();
                            gVar.f41381r = 7;
                            break;
                        } else {
                            gVar.f41381r = typedArray.getInt(index, gVar.f41381r);
                            break;
                        }
                    case 20:
                        gVar.f41382s = typedArray.getFloat(index, gVar.f41382s);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            gVar.f41383t = typedArray.getDimension(index, gVar.f41383t);
                            break;
                        } else {
                            gVar.f41383t = typedArray.getFloat(index, gVar.f41383t);
                            break;
                        }
                }
            }
        }
    }

    public g() {
        this.f41317d = new HashMap<>();
    }

    public final void M(HashMap<String, o2.e> hashMap) {
        for (String str : hashMap.keySet()) {
            o2.e eVar = hashMap.get(str);
            if (eVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f41372i)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41372i, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "rotationY":
                            if (Float.isNaN(this.f41373j)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41373j, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "translationX":
                            if (Float.isNaN(this.f41377n)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41377n, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "translationY":
                            if (Float.isNaN(this.f41378o)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41378o, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "translationZ":
                            if (Float.isNaN(this.f41379p)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41379p, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "progress":
                            if (Float.isNaN(this.f41380q)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41380q, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "scaleX":
                            if (Float.isNaN(this.f41375l)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41375l, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "scaleY":
                            if (Float.isNaN(this.f41376m)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41376m, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "rotation":
                            if (Float.isNaN(this.f41371h)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41371h, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "elevation":
                            if (Float.isNaN(this.f41370g)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41370g, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f41374k)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41374k, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        case "alpha":
                            if (Float.isNaN(this.f41369f)) {
                                break;
                            } else {
                                eVar.b(this.f41314a, this.f41369f, this.f41382s, this.f41381r, this.f41383t);
                                break;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f41317d.get(str.substring(7));
                    if (aVar != null) {
                        ((e.b) eVar).i(this.f41314a, aVar, this.f41382s, this.f41381r, this.f41383t);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void a(HashMap<String, o2.d> hashMap) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public final androidx.constraintlayout.motion.widget.a clone() {
        g gVar = new g();
        super.c(this);
        gVar.f41368e = this.f41368e;
        gVar.f41381r = this.f41381r;
        gVar.f41382s = this.f41382s;
        gVar.f41383t = this.f41383t;
        gVar.f41380q = this.f41380q;
        gVar.f41369f = this.f41369f;
        gVar.f41370g = this.f41370g;
        gVar.f41371h = this.f41371h;
        gVar.f41374k = this.f41374k;
        gVar.f41372i = this.f41372i;
        gVar.f41373j = this.f41373j;
        gVar.f41375l = this.f41375l;
        gVar.f41376m = this.f41376m;
        gVar.f41377n = this.f41377n;
        gVar.f41378o = this.f41378o;
        gVar.f41379p = this.f41379p;
        return gVar;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41369f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41370g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41371h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41372i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41373j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41377n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41378o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41379p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f41374k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41375l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41376m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41380q)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f41852i));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f41368e == -1) {
            return;
        }
        if (!Float.isNaN(this.f41369f)) {
            hashMap.put("alpha", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41370g)) {
            hashMap.put("elevation", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41371h)) {
            hashMap.put("rotation", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41372i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41373j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41377n)) {
            hashMap.put("translationX", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41378o)) {
            hashMap.put("translationY", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41379p)) {
            hashMap.put("translationZ", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41374k)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41375l)) {
            hashMap.put("scaleX", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41375l)) {
            hashMap.put("scaleY", Integer.valueOf(this.f41368e));
        }
        if (!Float.isNaN(this.f41380q)) {
            hashMap.put("progress", Integer.valueOf(this.f41368e));
        }
        if (this.f41317d.size() > 0) {
            Iterator<String> it = this.f41317d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(Nk.a.b("CUSTOM,", it.next()), Integer.valueOf(this.f41368e));
            }
        }
    }
}
