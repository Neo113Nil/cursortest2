package B5;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.collection.C5133b;
import androidx.collection.C5153w;
import androidx.collection.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final z f2734a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f2735b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f2736c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap f2737d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f2738e;

    /* renamed from: f, reason: collision with root package name */
    private a0<H5.d> f2739f;

    /* renamed from: g, reason: collision with root package name */
    private C5153w<K5.e> f2740g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f2741h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f2742i;

    /* renamed from: j, reason: collision with root package name */
    private float f2743j;

    /* renamed from: k, reason: collision with root package name */
    private float f2744k;

    /* renamed from: l, reason: collision with root package name */
    private float f2745l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2746m;

    /* renamed from: n, reason: collision with root package name */
    private int f2747n;

    public g() {
        z zVar = new z();
        new C5133b(0);
        new HashMap();
        this.f2734a = zVar;
        this.f2735b = new HashSet<>();
        this.f2747n = 0;
    }

    public final void a(String str) {
        O5.c.c(str);
        this.f2735b.add(str);
    }

    public final Rect b() {
        return this.f2742i;
    }

    public final a0<H5.d> c() {
        return this.f2739f;
    }

    public final float d() {
        return (long) ((e() / this.f2745l) * 1000.0f);
    }

    public final float e() {
        return this.f2744k - this.f2743j;
    }

    public final float f() {
        return this.f2744k;
    }

    public final Map<String, H5.c> g() {
        return this.f2738e;
    }

    public final float h(float f7) {
        return O5.f.e(this.f2743j, this.f2744k, f7);
    }

    public final float i() {
        return this.f2745l;
    }

    public final Map<String, s> j() {
        return this.f2737d;
    }

    public final List<K5.e> k() {
        return this.f2741h;
    }

    public final int l() {
        return this.f2747n;
    }

    public final z m() {
        return this.f2734a;
    }

    public final List<K5.e> n(String str) {
        return (List) this.f2736c.get(str);
    }

    public final float o() {
        return this.f2743j;
    }

    public final boolean p() {
        return this.f2746m;
    }

    public final boolean q() {
        return !this.f2737d.isEmpty();
    }

    public final void r(int i11) {
        this.f2747n += i11;
    }

    public final void s(Rect rect, float f7, float f11, float f12, ArrayList arrayList, C5153w c5153w, HashMap hashMap, HashMap hashMap2, a0 a0Var, HashMap hashMap3, ArrayList arrayList2) {
        this.f2742i = rect;
        this.f2743j = f7;
        this.f2744k = f11;
        this.f2745l = f12;
        this.f2741h = arrayList;
        this.f2740g = c5153w;
        this.f2736c = hashMap;
        this.f2737d = hashMap2;
        this.f2739f = a0Var;
        this.f2738e = hashMap3;
    }

    public final K5.e t(long j11) {
        return this.f2740g.b(j11);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f2741h.iterator();
        while (it.hasNext()) {
            sb2.append(((K5.e) it.next()).z("\t"));
        }
        return sb2.toString();
    }

    public final void u() {
        this.f2746m = true;
    }

    public final void v() {
        this.f2734a.getClass();
    }
}
