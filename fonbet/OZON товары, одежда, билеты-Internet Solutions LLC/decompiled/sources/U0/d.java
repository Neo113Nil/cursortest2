package U0;

import S0.J0;
import S0.Z0;
import androidx.collection.L;
import androidx.collection.M;
import androidx.collection.W;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d<Key, Scope> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L<Object, Object> f27262a;

    public d() {
        long[] jArr = W.f38661a;
        this.f27262a = new L<>((Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.collection.M] */
    public final void a(@NotNull Key key, @NotNull Scope scope) {
        L<Object, Object> l11 = this.f27262a;
        int e11 = l11.e(key);
        boolean z11 = e11 < 0;
        Scope scope2 = z11 ? null : l11.f38658c[e11];
        if (scope2 != null) {
            if (scope2 instanceof M) {
                ((M) scope2).d(scope);
            } else if (scope2 != scope) {
                ?? m11 = new M((Object) null);
                m11.d(scope2);
                m11.d(scope);
                scope = m11;
            }
            scope = scope2;
        }
        if (!z11) {
            l11.f38658c[e11] = scope;
            return;
        }
        int i11 = ~e11;
        l11.f38657b[i11] = key;
        l11.f38658c[i11] = scope;
    }

    public final void b() {
        this.f27262a.c();
    }

    public final boolean c(@NotNull Key key) {
        return this.f27262a.a(key);
    }

    @NotNull
    public final L<Object, Object> d() {
        return this.f27262a;
    }

    public final int e() {
        return this.f27262a.f38660e;
    }

    public final boolean f(@NotNull Key key, @NotNull Scope scope) {
        L<Object, Object> l11 = this.f27262a;
        Object b11 = l11.b(key);
        if (b11 == null) {
            return false;
        }
        if (!(b11 instanceof M)) {
            if (!b11.equals(scope)) {
                return false;
            }
            l11.g(key);
            return true;
        }
        M m11 = (M) b11;
        boolean l12 = m11.l(scope);
        if (l12 && m11.b()) {
            l11.g(key);
        }
        return l12;
    }

    public final void g(@NotNull Scope scope) {
        boolean z11;
        L<Object, Object> l11 = this.f27262a;
        long[] jArr = l11.f38656a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = l11.f38657b[i14];
                        Object obj2 = l11.f38658c[i14];
                        if (obj2 instanceof M) {
                            Intrinsics.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            M m11 = (M) obj2;
                            m11.l(scope);
                            z11 = m11.b();
                        } else {
                            z11 = obj2 == scope;
                        }
                        if (z11) {
                            l11.h(i14);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void h(@NotNull J0 j02) {
        this.f27262a.i(j02, Z0.f25328a);
    }
}
