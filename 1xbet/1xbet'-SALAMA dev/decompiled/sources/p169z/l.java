package p169z;

import B.a;
import B.j;
import B.m;
import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p143u.e;
import p165y.h;
import p165y.k;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18305c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18303a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18304b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18306d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18307e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18308f = 0.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f18309x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f18310y = 1.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f18311z = 1.0f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f18295A = Float.NaN;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f18296B = Float.NaN;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f18297C = 0.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f18298D = 0.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f18299E = 0.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f18300F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f18301G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final LinkedHashMap f18302H = new LinkedHashMap();

    public static boolean b(float f7, float f8) {
        if (Float.isNaN(f7) || Float.isNaN(f8)) {
            return Float.isNaN(f7) != Float.isNaN(f8);
        }
        return Math.abs(f7 - f8) > 1.0E-6f;
    }

    public final void a(int i7, HashMap map) {
        for (String str : map.keySet()) {
            k kVar = (k) map.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    kVar.b(Float.isNaN(this.f18308f) ? 0.0f : this.f18308f, i7);
                    break;
                case "rotationY":
                    kVar.b(Float.isNaN(this.f18309x) ? 0.0f : this.f18309x, i7);
                    break;
                case "translationX":
                    kVar.b(Float.isNaN(this.f18297C) ? 0.0f : this.f18297C, i7);
                    break;
                case "translationY":
                    kVar.b(Float.isNaN(this.f18298D) ? 0.0f : this.f18298D, i7);
                    break;
                case "translationZ":
                    kVar.b(Float.isNaN(this.f18299E) ? 0.0f : this.f18299E, i7);
                    break;
                case "progress":
                    kVar.b(Float.isNaN(this.f18301G) ? 0.0f : this.f18301G, i7);
                    break;
                case "scaleX":
                    kVar.b(Float.isNaN(this.f18310y) ? 1.0f : this.f18310y, i7);
                    break;
                case "scaleY":
                    kVar.b(Float.isNaN(this.f18311z) ? 1.0f : this.f18311z, i7);
                    break;
                case "transformPivotX":
                    kVar.b(Float.isNaN(this.f18295A) ? 0.0f : this.f18295A, i7);
                    break;
                case "transformPivotY":
                    kVar.b(Float.isNaN(this.f18296B) ? 0.0f : this.f18296B, i7);
                    break;
                case "rotation":
                    kVar.b(Float.isNaN(this.f18307e) ? 0.0f : this.f18307e, i7);
                    break;
                case "elevation":
                    kVar.b(Float.isNaN(this.f18306d) ? 0.0f : this.f18306d, i7);
                    break;
                case "transitionPathRotate":
                    kVar.b(Float.isNaN(this.f18300F) ? 0.0f : this.f18300F, i7);
                    break;
                case "alpha":
                    kVar.b(Float.isNaN(this.f18303a) ? 1.0f : this.f18303a, i7);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f18302H;
                        if (linkedHashMap.containsKey(str2)) {
                            a aVar = (a) linkedHashMap.get(str2);
                            if (kVar instanceof h) {
                                ((h) kVar).f18112f.append(i7, aVar);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i7 + ", value" + aVar.a() + kVar);
                            }
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public final void c(Rect rect, m mVar, int i7, int i8) {
        rect.width();
        rect.height();
        B.h hVarH = mVar.h(i8);
        B.k kVar = hVarH.f799c;
        int i9 = kVar.f887c;
        this.f18304b = i9;
        int i10 = kVar.f886b;
        this.f18305c = i10;
        this.f18303a = (i10 == 0 || i9 != 0) ? kVar.f888d : 0.0f;
        B.l lVar = hVarH.f802f;
        boolean z4 = lVar.f902m;
        this.f18306d = lVar.f903n;
        this.f18307e = lVar.f892b;
        this.f18308f = lVar.f893c;
        this.f18309x = lVar.f894d;
        this.f18310y = lVar.f895e;
        this.f18311z = lVar.f896f;
        this.f18295A = lVar.f897g;
        this.f18296B = lVar.f898h;
        this.f18297C = lVar.j;
        this.f18298D = lVar.f900k;
        this.f18299E = lVar.f901l;
        j jVar = hVarH.f800d;
        e.d(jVar.f876d);
        this.f18300F = jVar.f880h;
        this.f18301G = hVarH.f799c.f889e;
        for (String str : hVarH.f803g.keySet()) {
            a aVar = (a) hVarH.f803g.get(str);
            int iE = p136t.e.e(aVar.f694c);
            if (iE != 4 && iE != 5 && iE != 7) {
                this.f18302H.put(str, aVar);
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
            float f7 = this.f18307e + 90.0f;
            this.f18307e = f7;
            if (f7 > 180.0f) {
                this.f18307e = f7 - 360.0f;
                return;
            }
            return;
        }
        this.f18307e -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((l) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
