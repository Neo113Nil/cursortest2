package Me;

import B3.D;
import Oe.InterfaceC3690i;
import Oe.J;
import Sc.InterfaceC4008j;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h implements f, InterfaceC3690i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17918a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f17919b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17920c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Annotation> f17921d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final HashSet f17922e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String[] f17923f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final f[] f17924g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<Annotation>[] f17925h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f17926i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final f[] f17927j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f17928k;

    public h(@NotNull String serialName, @NotNull m kind, int i11, @NotNull List<? extends f> typeParameters, @NotNull C3618a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f17918a = serialName;
        this.f17919b = kind;
        this.f17920c = i11;
        this.f17921d = builder.b();
        this.f17922e = C7714v.S0(builder.e());
        String[] strArr = (String[]) builder.e().toArray(new String[0]);
        this.f17923f = strArr;
        this.f17924g = J.b(builder.d());
        this.f17925h = (List[]) builder.c().toArray(new List[0]);
        C7714v.P0(builder.f());
        O k02 = C7705l.k0(strArr);
        ArrayList arrayList = new ArrayList(C7714v.z(k02, 10));
        Iterator it = k02.iterator();
        while (true) {
            P p11 = (P) it;
            if (!p11.hasNext()) {
                this.f17926i = U.s(arrayList);
                this.f17927j = J.b(typeParameters);
                this.f17928k = Sc.k.b(new g(this, 0));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) p11.next();
            arrayList.add(new Pair(indexedValue.d(), Integer.valueOf(indexedValue.c())));
        }
    }

    public static int g(h hVar) {
        return Oe.O.a(hVar, hVar.f17927j);
    }

    public static String h(h hVar, int i11) {
        return hVar.f17923f[i11] + ": " + hVar.f17924g[i11].f();
    }

    @Override // Oe.InterfaceC3690i
    @NotNull
    public final Set<String> a() {
        return this.f17922e;
    }

    @Override // Me.f
    public final boolean b() {
        return false;
    }

    @Override // Me.f
    @NotNull
    public final f c(int i11) {
        return this.f17924g[i11];
    }

    @Override // Me.f
    public final int d() {
        return this.f17920c;
    }

    @Override // Me.f
    @NotNull
    public final String e(int i11) {
        return this.f17923f[i11];
    }

    public final boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            f fVar = (f) obj;
            if (Intrinsics.d(this.f17918a, fVar.f()) && Arrays.equals(this.f17927j, ((h) obj).f17927j)) {
                int d11 = fVar.d();
                int i12 = this.f17920c;
                if (i12 == d11) {
                    for (0; i11 < i12; i11 + 1) {
                        f[] fVarArr = this.f17924g;
                        i11 = (Intrinsics.d(fVarArr[i11].f(), fVar.c(i11).f()) && Intrinsics.d(fVarArr[i11].getKind(), fVar.c(i11).getKind())) ? i11 + 1 : 0;
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
        return this.f17918a;
    }

    @Override // Me.f
    @NotNull
    public final List<Annotation> getAnnotations() {
        return this.f17921d;
    }

    @Override // Me.f
    @NotNull
    public final m getKind() {
        return this.f17919b;
    }

    public final int hashCode() {
        return ((Number) this.f17928k.getValue()).intValue();
    }

    @Override // Me.f
    public final boolean isInline() {
        return false;
    }

    @NotNull
    public final String toString() {
        return C7714v.V(kotlin.ranges.h.o(0, this.f17920c), ", ", D.c(new StringBuilder(), this.f17918a, '('), ")", new F90.c(this, 2), 24);
    }
}
