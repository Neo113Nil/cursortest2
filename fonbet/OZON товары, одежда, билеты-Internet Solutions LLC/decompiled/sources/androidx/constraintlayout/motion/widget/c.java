package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class c extends androidx.constraintlayout.motion.widget.a {

    /* renamed from: e, reason: collision with root package name */
    private int f41334e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f41335f = -1;

    /* renamed from: g, reason: collision with root package name */
    private String f41336g = null;

    /* renamed from: h, reason: collision with root package name */
    private float f41337h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    private float f41338i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f41339j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    private float f41340k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private int f41341l = -1;

    /* renamed from: m, reason: collision with root package name */
    private float f41342m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f41343n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f41344o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f41345p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f41346q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private float f41347r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    private float f41348s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    private float f41349t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    private float f41350u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    private float f41351v = Float.NaN;

    /* renamed from: w, reason: collision with root package name */
    private float f41352w = Float.NaN;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f41353a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41353a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }

        static void a(c cVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                SparseIntArray sparseIntArray = f41353a;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        if (MotionLayout.f41220I0) {
                            int resourceId = typedArray.getResourceId(index, cVar.f41315b);
                            cVar.f41315b = resourceId;
                            if (resourceId == -1) {
                                cVar.f41316c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            cVar.f41316c = typedArray.getString(index);
                            break;
                        } else {
                            cVar.f41315b = typedArray.getResourceId(index, cVar.f41315b);
                            break;
                        }
                    case 2:
                        cVar.f41314a = typedArray.getInt(index, cVar.f41314a);
                        break;
                    case 3:
                        typedArray.getString(index);
                        cVar.getClass();
                        break;
                    case 4:
                        cVar.f41334e = typedArray.getInteger(index, cVar.f41334e);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            cVar.f41336g = typedArray.getString(index);
                            cVar.f41335f = 7;
                            break;
                        } else {
                            cVar.f41335f = typedArray.getInt(index, cVar.f41335f);
                            break;
                        }
                    case 6:
                        cVar.f41337h = typedArray.getFloat(index, cVar.f41337h);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            cVar.f41338i = typedArray.getDimension(index, cVar.f41338i);
                            break;
                        } else {
                            cVar.f41338i = typedArray.getFloat(index, cVar.f41338i);
                            break;
                        }
                    case 8:
                        cVar.f41341l = typedArray.getInt(index, cVar.f41341l);
                        break;
                    case 9:
                        cVar.f41342m = typedArray.getFloat(index, cVar.f41342m);
                        break;
                    case 10:
                        cVar.f41343n = typedArray.getDimension(index, cVar.f41343n);
                        break;
                    case 11:
                        cVar.f41344o = typedArray.getFloat(index, cVar.f41344o);
                        break;
                    case 12:
                        cVar.f41346q = typedArray.getFloat(index, cVar.f41346q);
                        break;
                    case 13:
                        cVar.f41347r = typedArray.getFloat(index, cVar.f41347r);
                        break;
                    case 14:
                        cVar.f41345p = typedArray.getFloat(index, cVar.f41345p);
                        break;
                    case 15:
                        cVar.f41348s = typedArray.getFloat(index, cVar.f41348s);
                        break;
                    case 16:
                        cVar.f41349t = typedArray.getFloat(index, cVar.f41349t);
                        break;
                    case 17:
                        cVar.f41350u = typedArray.getDimension(index, cVar.f41350u);
                        break;
                    case 18:
                        cVar.f41351v = typedArray.getDimension(index, cVar.f41351v);
                        break;
                    case 19:
                        cVar.f41352w = typedArray.getDimension(index, cVar.f41352w);
                        break;
                    case 20:
                        cVar.f41340k = typedArray.getFloat(index, cVar.f41340k);
                        break;
                    case 21:
                        cVar.f41339j = typedArray.getFloat(index, cVar.f41339j) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                }
            }
        }
    }

    public c() {
        this.f41317d = new HashMap<>();
    }

    public final void R(HashMap<String, o2.c> hashMap) {
        o2.c cVar;
        float f7;
        o2.c cVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f41317d.get(str.substring(7));
                if (aVar != null && aVar.c() == a.b.FLOAT_TYPE && (cVar = hashMap.get(str)) != null) {
                    cVar.d(this.f41314a, this.f41335f, this.f41336g, this.f41341l, this.f41337h, this.f41338i, this.f41339j, aVar.d(), aVar);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f7 = this.f41346q;
                        break;
                    case "rotationY":
                        f7 = this.f41347r;
                        break;
                    case "translationX":
                        f7 = this.f41350u;
                        break;
                    case "translationY":
                        f7 = this.f41351v;
                        break;
                    case "translationZ":
                        f7 = this.f41352w;
                        break;
                    case "progress":
                        f7 = this.f41340k;
                        break;
                    case "scaleX":
                        f7 = this.f41348s;
                        break;
                    case "scaleY":
                        f7 = this.f41349t;
                        break;
                    case "rotation":
                        f7 = this.f41344o;
                        break;
                    case "elevation":
                        f7 = this.f41343n;
                        break;
                    case "transitionPathRotate":
                        f7 = this.f41345p;
                        break;
                    case "alpha":
                        f7 = this.f41342m;
                        break;
                    case "waveOffset":
                        f7 = this.f41338i;
                        break;
                    case "wavePhase":
                        f7 = this.f41339j;
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(str));
                        }
                        f7 = Float.NaN;
                        break;
                }
                float f11 = f7;
                if (!Float.isNaN(f11) && (cVar2 = hashMap.get(str)) != null) {
                    cVar2.c(this.f41314a, this.f41335f, this.f41336g, this.f41341l, this.f41337h, this.f41338i, this.f41339j, f11);
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
        c cVar = new c();
        super.c(this);
        cVar.f41334e = this.f41334e;
        cVar.f41335f = this.f41335f;
        cVar.f41336g = this.f41336g;
        cVar.f41337h = this.f41337h;
        cVar.f41338i = this.f41338i;
        cVar.f41339j = this.f41339j;
        cVar.f41340k = this.f41340k;
        cVar.f41341l = this.f41341l;
        cVar.f41342m = this.f41342m;
        cVar.f41343n = this.f41343n;
        cVar.f41344o = this.f41344o;
        cVar.f41345p = this.f41345p;
        cVar.f41346q = this.f41346q;
        cVar.f41347r = this.f41347r;
        cVar.f41348s = this.f41348s;
        cVar.f41349t = this.f41349t;
        cVar.f41350u = this.f41350u;
        cVar.f41351v = this.f41351v;
        cVar.f41352w = this.f41352w;
        return cVar;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41342m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41343n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41344o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41346q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41347r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41348s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41349t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41345p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41350u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41351v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41352w)) {
            hashSet.add("translationZ");
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f41850g));
    }
}
