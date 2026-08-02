package z;

import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import u.C1616e;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public int f18299c;

    /* renamed from: a, reason: collision with root package name */
    public float f18297a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f18298b = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f18300d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f18301e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f18302f = 0.0f;

    /* renamed from: x, reason: collision with root package name */
    public float f18303x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public float f18304y = 1.0f;

    /* renamed from: z, reason: collision with root package name */
    public float f18305z = 1.0f;

    /* renamed from: A, reason: collision with root package name */
    public float f18289A = Float.NaN;

    /* renamed from: B, reason: collision with root package name */
    public float f18290B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    public float f18291C = 0.0f;

    /* renamed from: D, reason: collision with root package name */
    public float f18292D = 0.0f;

    /* renamed from: E, reason: collision with root package name */
    public float f18293E = 0.0f;

    /* renamed from: F, reason: collision with root package name */
    public float f18294F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    public float f18295G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    public final LinkedHashMap f18296H = new LinkedHashMap();

    public static boolean b(float f7, float f8) {
        return (Float.isNaN(f7) || Float.isNaN(f8)) ? Float.isNaN(f7) != Float.isNaN(f8) : Math.abs(f7 - f8) > 1.0E-6f;
    }

    public final void a(int i7, HashMap hashMap) {
        y.k kVar;
        for (String str : hashMap.keySet()) {
            kVar = (y.k) hashMap.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    kVar.b(Float.isNaN(this.f18302f) ? 0.0f : this.f18302f, i7);
                    break;
                case "rotationY":
                    kVar.b(Float.isNaN(this.f18303x) ? 0.0f : this.f18303x, i7);
                    break;
                case "translationX":
                    kVar.b(Float.isNaN(this.f18291C) ? 0.0f : this.f18291C, i7);
                    break;
                case "translationY":
                    kVar.b(Float.isNaN(this.f18292D) ? 0.0f : this.f18292D, i7);
                    break;
                case "translationZ":
                    kVar.b(Float.isNaN(this.f18293E) ? 0.0f : this.f18293E, i7);
                    break;
                case "progress":
                    kVar.b(Float.isNaN(this.f18295G) ? 0.0f : this.f18295G, i7);
                    break;
                case "scaleX":
                    kVar.b(Float.isNaN(this.f18304y) ? 1.0f : this.f18304y, i7);
                    break;
                case "scaleY":
                    kVar.b(Float.isNaN(this.f18305z) ? 1.0f : this.f18305z, i7);
                    break;
                case "transformPivotX":
                    kVar.b(Float.isNaN(this.f18289A) ? 0.0f : this.f18289A, i7);
                    break;
                case "transformPivotY":
                    kVar.b(Float.isNaN(this.f18290B) ? 0.0f : this.f18290B, i7);
                    break;
                case "rotation":
                    kVar.b(Float.isNaN(this.f18301e) ? 0.0f : this.f18301e, i7);
                    break;
                case "elevation":
                    kVar.b(Float.isNaN(this.f18300d) ? 0.0f : this.f18300d, i7);
                    break;
                case "transitionPathRotate":
                    kVar.b(Float.isNaN(this.f18294F) ? 0.0f : this.f18294F, i7);
                    break;
                case "alpha":
                    kVar.b(Float.isNaN(this.f18297a) ? 1.0f : this.f18297a, i7);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f18296H;
                        if (linkedHashMap.containsKey(str2)) {
                            B.a aVar = (B.a) linkedHashMap.get(str2);
                            if (kVar instanceof y.h) {
                                ((y.h) kVar).f18106f.append(i7, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i7 + ", value" + aVar.a() + kVar);
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

    public final void c(Rect rect, B.m mVar, int i7, int i8) {
        rect.width();
        rect.height();
        B.h h6 = mVar.h(i8);
        B.k kVar = h6.f799c;
        int i9 = kVar.f887c;
        this.f18298b = i9;
        int i10 = kVar.f886b;
        this.f18299c = i10;
        this.f18297a = (i10 == 0 || i9 != 0) ? kVar.f888d : 0.0f;
        B.l lVar = h6.f802f;
        boolean z4 = lVar.f902m;
        this.f18300d = lVar.f903n;
        this.f18301e = lVar.f892b;
        this.f18302f = lVar.f893c;
        this.f18303x = lVar.f894d;
        this.f18304y = lVar.f895e;
        this.f18305z = lVar.f896f;
        this.f18289A = lVar.f897g;
        this.f18290B = lVar.f898h;
        this.f18291C = lVar.j;
        this.f18292D = lVar.f900k;
        this.f18293E = lVar.f901l;
        B.j jVar = h6.f800d;
        C1616e.d(jVar.f876d);
        this.f18294F = jVar.f880h;
        this.f18295G = h6.f799c.f889e;
        for (String str : h6.f803g.keySet()) {
            B.a aVar = (B.a) h6.f803g.get(str);
            int e7 = t.e.e(aVar.f694c);
            if (e7 != 4 && e7 != 5 && e7 != 7) {
                this.f18296H.put(str, aVar);
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return;
                    }
                }
            }
            float f7 = this.f18301e + 90.0f;
            this.f18301e = f7;
            if (f7 > 180.0f) {
                this.f18301e = f7 - 360.0f;
                return;
            }
            return;
        }
        this.f18301e -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((l) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
