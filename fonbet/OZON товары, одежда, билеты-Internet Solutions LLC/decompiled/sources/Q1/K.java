package Q1;

import K1.C3422b;
import b1.C5516s;
import b1.C5517t;
import b1.InterfaceC5518u;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f22833a;

    /* renamed from: b, reason: collision with root package name */
    private final long f22834b;

    /* renamed from: c, reason: collision with root package name */
    private final K1.Q f22835c;

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, K, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22836b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC5518u interfaceC5518u, K k11) {
            InterfaceC5518u interfaceC5518u2 = interfaceC5518u;
            K k12 = k11;
            return C7714v.t(K1.B.w(k12.c(), K1.B.g(), interfaceC5518u2), K1.B.w(K1.Q.b(k12.e()), K1.B.q(), interfaceC5518u2));
        }
    }

    static final class b extends AbstractC7737t implements Function1<Object, K> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f22837b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final K invoke(Object obj) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C5517t g10 = K1.B.g();
            Boolean bool = Boolean.FALSE;
            K1.Q q11 = null;
            C3422b c3422b = (Intrinsics.d(obj2, bool) || obj2 == null) ? null : (C3422b) g10.a(obj2);
            Intrinsics.f(c3422b);
            Object obj3 = list.get(1);
            int i11 = K1.Q.f15010c;
            C5517t q12 = K1.B.q();
            if (!Intrinsics.d(obj3, bool) && obj3 != null) {
                q11 = (K1.Q) q12.a(obj3);
            }
            Intrinsics.f(q11);
            return new K(c3422b, q11.k(), 4);
        }
    }

    static {
        C5516s.a(a.f22836b, b.f22837b);
    }

    public K(C3422b c3422b, long j11, K1.Q q11) {
        K1.Q q12;
        this.f22833a = c3422b;
        this.f22834b = K1.S.b(c3422b.h().length(), j11);
        if (q11 != null) {
            q12 = K1.Q.b(K1.S.b(c3422b.h().length(), q11.k()));
        } else {
            q12 = null;
        }
        this.f22835c = q12;
    }

    public static K a(K k11, C3422b c3422b, long j11, int i11) {
        if ((i11 & 1) != 0) {
            c3422b = k11.f22833a;
        }
        if ((i11 & 2) != 0) {
            j11 = k11.f22834b;
        }
        K1.Q q11 = (i11 & 4) != 0 ? k11.f22835c : null;
        k11.getClass();
        return new K(c3422b, j11, q11);
    }

    public static K b(K k11, String str, long j11, int i11) {
        if ((i11 & 2) != 0) {
            j11 = k11.f22834b;
        }
        K1.Q q11 = k11.f22835c;
        k11.getClass();
        return new K(new C3422b(6, str, null), j11, q11);
    }

    @NotNull
    public final C3422b c() {
        return this.f22833a;
    }

    public final K1.Q d() {
        return this.f22835c;
    }

    public final long e() {
        return this.f22834b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k11 = (K) obj;
        return K1.Q.d(this.f22834b, k11.f22834b) && Intrinsics.d(this.f22835c, k11.f22835c) && Intrinsics.d(this.f22833a, k11.f22833a);
    }

    @NotNull
    public final String f() {
        return this.f22833a.h();
    }

    public final int hashCode() {
        int hashCode = this.f22833a.hashCode() * 31;
        int i11 = K1.Q.f15010c;
        int a11 = Pk0.c.a(hashCode, 31, this.f22834b);
        K1.Q q11 = this.f22835c;
        return a11 + (q11 != null ? Long.hashCode(q11.k()) : 0);
    }

    @NotNull
    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f22833a) + "', selection=" + ((Object) K1.Q.j(this.f22834b)) + ", composition=" + this.f22835c + ')';
    }

    public K(int i11, long j11, String str) {
        this(new C3422b(6, (i11 & 1) != 0 ? "" : str, null), (i11 & 2) != 0 ? K1.Q.f15009b : j11, (K1.Q) null);
    }

    public K(C3422b c3422b, long j11, int i11) {
        this(c3422b, (i11 & 2) != 0 ? K1.Q.f15009b : j11, (K1.Q) null);
    }
}
