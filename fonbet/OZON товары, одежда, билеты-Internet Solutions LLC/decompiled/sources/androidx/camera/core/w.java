package androidx.camera.core;

import C.AbstractC2690j;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class w {

    /* renamed from: d, reason: collision with root package name */
    private b1<?> f38464d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private Object f38465e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private b1<?> f38466f;

    /* renamed from: g, reason: collision with root package name */
    private T0 f38467g;

    /* renamed from: h, reason: collision with root package name */
    private b1<?> f38468h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f38469i;

    /* renamed from: k, reason: collision with root package name */
    private I f38471k;

    /* renamed from: l, reason: collision with root package name */
    private I f38472l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC2690j f38473m;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f38461a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Object f38462b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private a f38463c = a.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private Matrix f38470j = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    private O0 f38474n = O0.b();

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    private O0 f38475o = O0.b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVE;
        public static final a INACTIVE;

        static {
            a aVar = new a("ACTIVE", 0);
            ACTIVE = aVar;
            a aVar2 = new a("INACTIVE", 1);
            INACTIVE = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public interface b {
        void d(@NonNull w wVar);

        void j(@NonNull w wVar);

        void m(@NonNull w wVar);

        void q(@NonNull w wVar);
    }

    protected w(@NonNull b1<?> b1Var) {
        this.f38465e = b1Var;
        this.f38466f = b1Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.camera.core.impl.J0, androidx.camera.core.impl.T, java.lang.Object] */
    @NonNull
    public final b1<?> A(@NonNull H h11, b1<?> b1Var, b1<?> b1Var2) {
        C5123v0 R11;
        if (b1Var2 != null) {
            R11 = C5123v0.S(b1Var2);
            R11.V(J.m.f12651b);
        } else {
            R11 = C5123v0.R();
        }
        T.a<Integer> aVar = InterfaceC5102k0.f38342l;
        ?? r12 = this.f38465e;
        if (r12.d(aVar) || r12.d(InterfaceC5102k0.f38346p)) {
            T.a<Q.b> aVar2 = InterfaceC5102k0.f38350t;
            if (R11.d(aVar2)) {
                R11.V(aVar2);
            }
        }
        T.a<Q.b> aVar3 = InterfaceC5102k0.f38350t;
        if (r12.d(aVar3)) {
            T.a<Size> aVar4 = InterfaceC5102k0.f38348r;
            if (R11.d(aVar4) && ((Q.b) r12.a(aVar3)).d() != null) {
                R11.V(aVar4);
            }
        }
        Iterator<T.a<?>> it = r12.g().iterator();
        while (it.hasNext()) {
            T.t(R11, R11, r12, it.next());
        }
        if (b1Var != null) {
            for (T.a<?> aVar5 : b1Var.g()) {
                if (!aVar5.c().equals(J.m.f12651b.c())) {
                    T.t(R11, R11, b1Var, aVar5);
                }
            }
        }
        if (R11.d(InterfaceC5102k0.f38346p)) {
            T.a<Integer> aVar6 = InterfaceC5102k0.f38342l;
            if (R11.d(aVar6)) {
                R11.V(aVar6);
            }
        }
        T.a<Q.b> aVar7 = InterfaceC5102k0.f38350t;
        if (R11.d(aVar7) && ((Q.b) R11.a(aVar7)).a() != 0) {
            R11.U(b1.f38262B, Boolean.TRUE);
        }
        return I(h11, w(R11));
    }

    protected final void B() {
        this.f38463c = a.ACTIVE;
        E();
    }

    protected final void C() {
        this.f38463c = a.INACTIVE;
        E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        Iterator it = this.f38461a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(this);
        }
    }

    public final void E() {
        int ordinal = this.f38463c.ordinal();
        HashSet hashSet = this.f38461a;
        if (ordinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((b) it.next()).j(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).q(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F() {
        Iterator it = this.f38461a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d(this);
        }
    }

    public void G() {
    }

    public void H() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    @NonNull
    protected b1<?> I(@NonNull H h11, @NonNull b1.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public void J() {
    }

    public void K() {
    }

    @NonNull
    protected T0 L(@NonNull T t2) {
        T0 t02 = this.f38467g;
        if (t02 == null) {
            throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        T0.a g10 = t02.g();
        g10.d(t2);
        return g10.a();
    }

    @NonNull
    protected T0 M(@NonNull T0 t02, T0 t03) {
        return t02;
    }

    public void N() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (y(0) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(AbstractC2690j abstractC2690j) {
        boolean z11 = abstractC2690j == null;
        x2.i.b(z11);
        this.f38473m = abstractC2690j;
    }

    public void P(@NonNull Matrix matrix) {
        this.f38470j = new Matrix(matrix);
    }

    public void Q(@NonNull Rect rect) {
        this.f38469i = rect;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.camera.core.impl.b1<?>, java.lang.Object] */
    public final void R(@NonNull I i11) {
        N();
        synchronized (this.f38462b) {
            try {
                I i12 = this.f38471k;
                if (i11 == i12) {
                    this.f38461a.remove(i12);
                    this.f38471k = null;
                }
                I i13 = this.f38472l;
                if (i11 == i13) {
                    this.f38461a.remove(i13);
                    this.f38472l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38467g = null;
        this.f38469i = null;
        this.f38466f = this.f38465e;
        this.f38464d = null;
        this.f38468h = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S(@NonNull List<O0> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f38474n = list.get(0);
        if (list.size() > 1) {
            this.f38475o = list.get(1);
        }
        Iterator<O0> it = list.iterator();
        while (it.hasNext()) {
            for (W w11 : it.next().o()) {
                if (w11.g() == null) {
                    w11.p(getClass());
                }
            }
        }
    }

    public final void T(@NonNull T0 t02, T0 t03) {
        this.f38467g = M(t02, t03);
    }

    public final void U(@NonNull T t2) {
        this.f38467g = L(t2);
    }

    @SuppressLint({"WrongConstant"})
    public final void a(@NonNull I i11, I i12, b1<?> b1Var, b1<?> b1Var2) {
        synchronized (this.f38462b) {
            this.f38471k = i11;
            this.f38472l = i12;
            this.f38461a.add(i11);
            if (i12 != null) {
                this.f38461a.add(i12);
            }
        }
        this.f38464d = b1Var;
        this.f38468h = b1Var2;
        this.f38466f = A(i11.e(), this.f38464d, this.f38468h);
        G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.b1<?>, java.lang.Object] */
    @NonNull
    protected final b1<?> b() {
        return this.f38465e;
    }

    protected final int c() {
        return ((InterfaceC5102k0) this.f38466f).C();
    }

    public final T0 d() {
        return this.f38467g;
    }

    public final Size e() {
        T0 t02 = this.f38467g;
        if (t02 != null) {
            return t02.e();
        }
        return null;
    }

    public final I f() {
        I i11;
        synchronized (this.f38462b) {
            i11 = this.f38471k;
        }
        return i11;
    }

    @NonNull
    protected final E g() {
        synchronized (this.f38462b) {
            try {
                I i11 = this.f38471k;
                if (i11 == null) {
                    return E.f38114a;
                }
                return i11.k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    protected final String h() {
        I f7 = f();
        x2.i.e(f7, "No camera attached to use case: " + this);
        return f7.e().b();
    }

    @NonNull
    public final b1<?> i() {
        return this.f38466f;
    }

    public abstract b1<?> j(boolean z11, @NonNull c1 c1Var);

    public final AbstractC2690j k() {
        return this.f38473m;
    }

    public final int l() {
        return this.f38466f.i();
    }

    protected final int m() {
        return ((InterfaceC5102k0) this.f38466f).v();
    }

    @NonNull
    public final String n() {
        String l11 = this.f38466f.l("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(l11);
        return l11;
    }

    protected final int o(@NonNull I i11) {
        return p(i11, false);
    }

    protected final int p(@NonNull I i11, boolean z11) {
        int g10 = i11.e().g(v());
        return (i11.p() || !z11) ? g10 : G.r.h(-g10);
    }

    public final I q() {
        I i11;
        synchronized (this.f38462b) {
            i11 = this.f38472l;
        }
        return i11;
    }

    @NonNull
    public final O0 r() {
        return this.f38475o;
    }

    @NonNull
    public final Matrix s() {
        return this.f38470j;
    }

    @NonNull
    public final O0 t() {
        return this.f38474n;
    }

    @NonNull
    protected Set<Integer> u() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    protected final int v() {
        return ((InterfaceC5102k0) this.f38466f).m();
    }

    @NonNull
    public abstract b1.a<?, ?, ?> w(@NonNull T t2);

    public final Rect x() {
        return this.f38469i;
    }

    public final boolean y(int i11) {
        Iterator<Integer> it = u().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if ((i11 & intValue) == intValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean z(@NonNull I i11) {
        int m11 = m();
        if (m11 == -1 || m11 == 0) {
            return false;
        }
        if (m11 == 1) {
            return true;
        }
        if (m11 == 2) {
            return i11.f();
        }
        throw new AssertionError(Ej.b.a(m11, "Unknown mirrorMode: "));
    }
}
