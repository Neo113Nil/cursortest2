package Oe;

import Le.InterfaceC3583a;
import Me.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class N implements Me.f, InterfaceC3690i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20256a;

    /* renamed from: b, reason: collision with root package name */
    private final r<?> f20257b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20258c;

    /* renamed from: d, reason: collision with root package name */
    private int f20259d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f20260e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Annotation>[] f20261f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final boolean[] f20262g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Object f20263h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f20264i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f20265j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f20266k;

    public N(@NotNull String serialName, r<?> rVar, int i11) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f20256a = serialName;
        this.f20257b = rVar;
        this.f20258c = i11;
        this.f20259d = -1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.f20260e = strArr;
        int i13 = this.f20258c;
        this.f20261f = new List[i13];
        this.f20262g = new boolean[i13];
        this.f20263h = kotlin.collections.U.c();
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f20264i = Sc.k.a(nVar, new F70.a(this, 1));
        this.f20265j = Sc.k.a(nVar, new M(this, 0));
        this.f20266k = Sc.k.a(nVar, new F70.c(this, 2));
    }

    public static String g(N n11, int i11) {
        return n11.f20260e[i11] + ": " + n11.c(i11).f();
    }

    public static Me.f[] h(N n11) {
        return J.b(n11.f20257b != null ? new ArrayList(0) : null);
    }

    public static InterfaceC3583a[] i(N n11) {
        r<?> rVar = n11.f20257b;
        return rVar != null ? rVar.a() : P.f20267a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Oe.InterfaceC3690i
    @NotNull
    public final Set<String> a() {
        return this.f20263h.keySet();
    }

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // Me.f
    @NotNull
    public Me.f c(int i11) {
        return ((InterfaceC3583a[]) this.f20264i.getValue())[i11].b();
    }

    @Override // Me.f
    public final int d() {
        return this.f20258c;
    }

    @Override // Me.f
    @NotNull
    public final String e(int i11) {
        return this.f20260e[i11];
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            Me.f fVar = (Me.f) obj;
            if (Intrinsics.d(this.f20256a, fVar.f()) && Arrays.equals(k(), ((N) obj).k())) {
                int d11 = fVar.d();
                int i12 = this.f20258c;
                if (i12 == d11) {
                    for (0; i11 < i12; i11 + 1) {
                        i11 = (Intrinsics.d(c(i11).f(), fVar.c(i11).f()) && Intrinsics.d(c(i11).getKind(), fVar.c(i11).getKind())) ? i11 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Me.f
    @NotNull
    public final String f() {
        return this.f20256a;
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // Me.f
    @NotNull
    public Me.m getKind() {
        return n.a.f17935a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f20266k.getValue()).intValue();
    }

    @Override // Me.f
    public boolean isInline() {
        return false;
    }

    public final void j(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i11 = this.f20259d + 1;
        this.f20259d = i11;
        String[] strArr = this.f20260e;
        strArr[i11] = name;
        this.f20262g[i11] = z11;
        this.f20261f[i11] = null;
        if (i11 == this.f20258c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                hashMap.put(strArr[i12], Integer.valueOf(i12));
            }
            this.f20263h = hashMap;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final Me.f[] k() {
        return (Me.f[]) this.f20265j.getValue();
    }

    @NotNull
    public String toString() {
        return C7714v.V(kotlin.ranges.h.o(0, this.f20258c), ", ", B3.D.c(new StringBuilder(), this.f20256a, '('), ")", new Function1() { // from class: Oe.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return N.g(N.this, ((Integer) obj).intValue());
            }
        }, 24);
    }
}
