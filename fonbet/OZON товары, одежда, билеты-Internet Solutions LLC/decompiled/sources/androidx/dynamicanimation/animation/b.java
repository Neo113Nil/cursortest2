package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.Y;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.b;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final s f42643m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f42644n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f42645o;

    /* renamed from: p, reason: collision with root package name */
    public static final s f42646p;

    /* renamed from: q, reason: collision with root package name */
    public static final s f42647q;

    /* renamed from: r, reason: collision with root package name */
    public static final s f42648r;

    /* renamed from: s, reason: collision with root package name */
    public static final s f42649s;

    /* renamed from: t, reason: collision with root package name */
    public static final s f42650t;

    /* renamed from: a, reason: collision with root package name */
    float f42651a;

    /* renamed from: b, reason: collision with root package name */
    float f42652b;

    /* renamed from: c, reason: collision with root package name */
    boolean f42653c;

    /* renamed from: d, reason: collision with root package name */
    final Object f42654d;

    /* renamed from: e, reason: collision with root package name */
    final androidx.dynamicanimation.animation.d f42655e;

    /* renamed from: f, reason: collision with root package name */
    boolean f42656f;

    /* renamed from: g, reason: collision with root package name */
    float f42657g;

    /* renamed from: h, reason: collision with root package name */
    float f42658h;

    /* renamed from: i, reason: collision with root package name */
    private long f42659i;

    /* renamed from: j, reason: collision with root package name */
    private float f42660j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f42661k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f42662l;

    static class a extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setY(f7);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    static class C0783b extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return Y.q(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            Y.R(view, f7);
        }
    }

    static class c extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setAlpha(f7);
        }
    }

    static class d extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setScrollX((int) f7);
        }
    }

    static class e extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setScrollY((int) f7);
        }
    }

    final class f extends androidx.dynamicanimation.animation.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.dynamicanimation.animation.e f42663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.dynamicanimation.animation.e eVar) {
            super("FloatValueHolder");
            this.f42663a = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(Object obj) {
            return this.f42663a.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(Object obj, float f7) {
            this.f42663a.b(f7);
        }
    }

    static class g extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setTranslationX(f7);
        }
    }

    static class h extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setTranslationY(f7);
        }
    }

    static class i extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return Y.p(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            Y.P(view, f7);
        }
    }

    static class j extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setScaleX(f7);
        }
    }

    static class k extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setScaleY(f7);
        }
    }

    static class l extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setRotation(f7);
        }
    }

    static class m extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setRotationX(f7);
        }
    }

    static class n extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setRotationY(f7);
        }
    }

    static class o extends s {
        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(View view, float f7) {
            view.setX(f7);
        }
    }

    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f42664a;

        /* renamed from: b, reason: collision with root package name */
        float f42665b;
    }

    public interface q {
        void a(b bVar, boolean z11, float f7, float f11);
    }

    public interface r {
        void a(b bVar, float f7, float f11);
    }

    public static abstract class s extends androidx.dynamicanimation.animation.d<View> {
    }

    static {
        new i("translationZ");
        f42645o = new j("scaleX");
        f42646p = new k("scaleY");
        f42647q = new l("rotation");
        f42648r = new m("rotationX");
        f42649s = new n("rotationY");
        new o("x");
        new a("y");
        new C0783b("z");
        f42650t = new c("alpha");
        new d("scrollX");
        new e("scrollY");
    }

    b(androidx.dynamicanimation.animation.e eVar) {
        this.f42651a = 0.0f;
        this.f42652b = Float.MAX_VALUE;
        this.f42653c = false;
        this.f42656f = false;
        this.f42657g = Float.MAX_VALUE;
        this.f42658h = -3.4028235E38f;
        this.f42659i = 0L;
        this.f42661k = new ArrayList<>();
        this.f42662l = new ArrayList<>();
        this.f42654d = null;
        this.f42655e = new f(eVar);
        this.f42660j = 1.0f;
    }

    private void e(boolean z11) {
        ArrayList<q> arrayList;
        int i11 = 0;
        this.f42656f = false;
        ThreadLocal<androidx.dynamicanimation.animation.a> threadLocal = androidx.dynamicanimation.animation.a.f42632f;
        if (threadLocal.get() == null) {
            threadLocal.set(new androidx.dynamicanimation.animation.a());
        }
        threadLocal.get().c(this);
        this.f42659i = 0L;
        this.f42653c = false;
        while (true) {
            arrayList = this.f42661k;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) != null) {
                arrayList.get(i11).a(this, z11, this.f42652b, this.f42651a);
            }
            i11++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // androidx.dynamicanimation.animation.a.b
    public final boolean a(long j11) {
        long j12 = this.f42659i;
        if (j12 == 0) {
            this.f42659i = j11;
            j(this.f42652b);
            return false;
        }
        this.f42659i = j11;
        boolean m11 = m(j11 - j12);
        float min = Math.min(this.f42652b, this.f42657g);
        this.f42652b = min;
        float max = Math.max(min, this.f42658h);
        this.f42652b = max;
        j(max);
        if (m11) {
            e(false);
        }
        return m11;
    }

    public final void b(q qVar) {
        ArrayList<q> arrayList = this.f42661k;
        if (arrayList.contains(qVar)) {
            return;
        }
        arrayList.add(qVar);
    }

    public final void c(r rVar) {
        if (this.f42656f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList<r> arrayList = this.f42662l;
        if (arrayList.contains(rVar)) {
            return;
        }
        arrayList.add(rVar);
    }

    public final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f42656f) {
            e(true);
        }
    }

    final float f() {
        return this.f42660j * 0.75f;
    }

    public final boolean g() {
        return this.f42656f;
    }

    public final void h() {
        this.f42657g = Float.POSITIVE_INFINITY;
    }

    public final void i() {
        this.f42658h = Float.NEGATIVE_INFINITY;
    }

    final void j(float f7) {
        ArrayList<r> arrayList;
        this.f42655e.setValue(this.f42654d, f7);
        int i11 = 0;
        while (true) {
            arrayList = this.f42662l;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) != null) {
                arrayList.get(i11).a(this, this.f42652b, this.f42651a);
            }
            i11++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void k(float f7) {
        this.f42652b = f7;
        this.f42653c = true;
    }

    public void l() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z11 = this.f42656f;
        if (z11 || z11) {
            return;
        }
        this.f42656f = true;
        if (!this.f42653c) {
            this.f42652b = this.f42655e.getValue(this.f42654d);
        }
        float f7 = this.f42652b;
        if (f7 > this.f42657g || f7 < this.f42658h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<androidx.dynamicanimation.animation.a> threadLocal = androidx.dynamicanimation.animation.a.f42632f;
        if (threadLocal.get() == null) {
            threadLocal.set(new androidx.dynamicanimation.animation.a());
        }
        androidx.dynamicanimation.animation.a aVar = threadLocal.get();
        ArrayList<a.b> arrayList = aVar.f42634b;
        if (arrayList.size() == 0) {
            aVar.b().a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    abstract boolean m(long j11);

    <K> b(K k11, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f42651a = 0.0f;
        this.f42652b = Float.MAX_VALUE;
        this.f42653c = false;
        this.f42656f = false;
        this.f42657g = Float.MAX_VALUE;
        this.f42658h = -Float.MAX_VALUE;
        this.f42659i = 0L;
        this.f42661k = new ArrayList<>();
        this.f42662l = new ArrayList<>();
        this.f42654d = k11;
        this.f42655e = dVar;
        if (dVar != f42647q && dVar != f42648r && dVar != f42649s) {
            if (dVar == f42650t) {
                this.f42660j = 0.00390625f;
                return;
            } else if (dVar != f42645o && dVar != f42646p) {
                this.f42660j = 1.0f;
                return;
            } else {
                this.f42660j = 0.00390625f;
                return;
            }
        }
        this.f42660j = 0.1f;
    }
}
