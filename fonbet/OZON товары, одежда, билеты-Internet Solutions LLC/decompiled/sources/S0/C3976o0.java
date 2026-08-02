package S0;

import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: S0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3976o0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.L<K, Object> f25495a;

    private /* synthetic */ C3976o0(androidx.collection.L l11) {
        this.f25495a = l11;
    }

    public static final /* synthetic */ C3976o0 a(androidx.collection.L l11) {
        return new C3976o0(l11);
    }

    public final /* synthetic */ androidx.collection.L b() {
        return this.f25495a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3976o0) {
            return Intrinsics.d(this.f25495a, ((C3976o0) obj).f25495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25495a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f25495a + ')';
    }
}
