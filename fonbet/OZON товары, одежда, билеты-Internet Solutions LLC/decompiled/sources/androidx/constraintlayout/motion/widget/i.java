package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.d;
import h2.C6785c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import o2.d;

/* loaded from: classes8.dex */
final class i implements Comparable<i> {

    /* renamed from: c, reason: collision with root package name */
    int f41408c;

    /* renamed from: a, reason: collision with root package name */
    private float f41406a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    int f41407b = 0;

    /* renamed from: d, reason: collision with root package name */
    private float f41409d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f41410e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f41411f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f41412g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f41413h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f41414i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f41415j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private float f41416k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private float f41417l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f41418m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f41419n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f41420o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f41421p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f41422q = new LinkedHashMap<>();

    private static boolean b(float f7, float f11) {
        return (Float.isNaN(f7) || Float.isNaN(f11)) ? Float.isNaN(f7) != Float.isNaN(f11) : Math.abs(f7 - f11) > 1.0E-6f;
    }

    public final void a(HashMap<String, o2.d> hashMap, int i11) {
        o2.d dVar;
        for (String str : hashMap.keySet()) {
            dVar = hashMap.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    dVar.b(Float.isNaN(this.f41411f) ? 0.0f : this.f41411f, i11);
                    break;
                case "rotationY":
                    dVar.b(Float.isNaN(this.f41412g) ? 0.0f : this.f41412g, i11);
                    break;
                case "translationX":
                    dVar.b(Float.isNaN(this.f41417l) ? 0.0f : this.f41417l, i11);
                    break;
                case "translationY":
                    dVar.b(Float.isNaN(this.f41418m) ? 0.0f : this.f41418m, i11);
                    break;
                case "translationZ":
                    dVar.b(Float.isNaN(this.f41419n) ? 0.0f : this.f41419n, i11);
                    break;
                case "progress":
                    dVar.b(Float.isNaN(this.f41421p) ? 0.0f : this.f41421p, i11);
                    break;
                case "scaleX":
                    dVar.b(Float.isNaN(this.f41413h) ? 1.0f : this.f41413h, i11);
                    break;
                case "scaleY":
                    dVar.b(Float.isNaN(this.f41414i) ? 1.0f : this.f41414i, i11);
                    break;
                case "transformPivotX":
                    dVar.b(Float.isNaN(this.f41415j) ? 0.0f : this.f41415j, i11);
                    break;
                case "transformPivotY":
                    dVar.b(Float.isNaN(this.f41416k) ? 0.0f : this.f41416k, i11);
                    break;
                case "rotation":
                    dVar.b(Float.isNaN(this.f41410e) ? 0.0f : this.f41410e, i11);
                    break;
                case "elevation":
                    dVar.b(Float.isNaN(this.f41409d) ? 0.0f : this.f41409d, i11);
                    break;
                case "transitionPathRotate":
                    dVar.b(Float.isNaN(this.f41420o) ? 0.0f : this.f41420o, i11);
                    break;
                case "alpha":
                    dVar.b(Float.isNaN(this.f41406a) ? 1.0f : this.f41406a, i11);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, androidx.constraintlayout.widget.a> linkedHashMap = this.f41422q;
                        if (linkedHashMap.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = linkedHashMap.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).h(i11, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i11 + ", value" + aVar.d() + dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    final void c(i iVar, HashSet<String> hashSet) {
        if (b(this.f41406a, iVar.f41406a)) {
            hashSet.add("alpha");
        }
        if (b(this.f41409d, iVar.f41409d)) {
            hashSet.add("elevation");
        }
        int i11 = this.f41408c;
        int i12 = iVar.f41408c;
        if (i11 != i12 && this.f41407b == 0 && (i11 == 0 || i12 == 0)) {
            hashSet.add("alpha");
        }
        if (b(this.f41410e, iVar.f41410e)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41420o) || !Float.isNaN(iVar.f41420o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41421p) || !Float.isNaN(iVar.f41421p)) {
            hashSet.add("progress");
        }
        if (b(this.f41411f, iVar.f41411f)) {
            hashSet.add("rotationX");
        }
        if (b(this.f41412g, iVar.f41412g)) {
            hashSet.add("rotationY");
        }
        if (b(this.f41415j, iVar.f41415j)) {
            hashSet.add("transformPivotX");
        }
        if (b(this.f41416k, iVar.f41416k)) {
            hashSet.add("transformPivotY");
        }
        if (b(this.f41413h, iVar.f41413h)) {
            hashSet.add("scaleX");
        }
        if (b(this.f41414i, iVar.f41414i)) {
            hashSet.add("scaleY");
        }
        if (b(this.f41417l, iVar.f41417l)) {
            hashSet.add("translationX");
        }
        if (b(this.f41418m, iVar.f41418m)) {
            hashSet.add("translationY");
        }
        if (b(this.f41419n, iVar.f41419n)) {
            hashSet.add("translationZ");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        iVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, androidx.constraintlayout.widget.d dVar, int i11, int i12) {
        rect.width();
        rect.height();
        d.a L11 = dVar.L(i12);
        d.C0759d c0759d = L11.f41709c;
        int i13 = c0759d.f41812c;
        this.f41407b = i13;
        int i14 = c0759d.f41811b;
        this.f41408c = i14;
        this.f41406a = (i14 == 0 || i13 != 0) ? c0759d.f41813d : 0.0f;
        d.e eVar = L11.f41712f;
        boolean z11 = eVar.f41828m;
        this.f41409d = eVar.f41829n;
        this.f41410e = eVar.f41817b;
        this.f41411f = eVar.f41818c;
        this.f41412g = eVar.f41819d;
        this.f41413h = eVar.f41820e;
        this.f41414i = eVar.f41821f;
        this.f41415j = eVar.f41822g;
        this.f41416k = eVar.f41823h;
        this.f41417l = eVar.f41825j;
        this.f41418m = eVar.f41826k;
        this.f41419n = eVar.f41827l;
        d.c cVar = L11.f41710d;
        C6785c.c(cVar.f41800d);
        this.f41420o = cVar.f41804h;
        this.f41421p = L11.f41709c.f41814e;
        for (String str : L11.f41713g.keySet()) {
            androidx.constraintlayout.widget.a aVar = L11.f41713g.get(str);
            if (aVar.f()) {
                this.f41422q.put(str, aVar);
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f7 = this.f41410e + 90.0f;
            this.f41410e = f7;
            if (f7 > 180.0f) {
                this.f41410e = f7 - 360.0f;
                return;
            }
            return;
        }
        this.f41410e -= 90.0f;
    }

    public final void e(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f41408c = view.getVisibility();
        this.f41406a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f41409d = view.getElevation();
        this.f41410e = view.getRotation();
        this.f41411f = view.getRotationX();
        this.f41412g = view.getRotationY();
        this.f41413h = view.getScaleX();
        this.f41414i = view.getScaleY();
        this.f41415j = view.getPivotX();
        this.f41416k = view.getPivotY();
        this.f41417l = view.getTranslationX();
        this.f41418m = view.getTranslationY();
        this.f41419n = view.getTranslationZ();
    }
}
