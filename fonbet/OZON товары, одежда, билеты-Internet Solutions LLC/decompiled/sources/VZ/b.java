package VZ;

import T00.e;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<T00.a, Map<String, Object>> f28468a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1<? super T00.a, ? extends Map<String, ? extends Object>> function1) {
        this.f28468a = function1;
    }

    @Override // VZ.a
    @NotNull
    public final Rg.a a(@NotNull T00.a composerState, String str) {
        String b11;
        e.a b12;
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        T00.e h11 = composerState.h();
        String f7 = h11 != null ? h11.f() : null;
        String str2 = f7 == null ? "" : f7;
        String c11 = composerState.c();
        String str3 = c11 == null ? "" : c11;
        T00.e h12 = composerState.h();
        Integer c12 = h12 != null ? h12.c() : null;
        if (c12 != null && c12.intValue() == -1) {
            c12 = null;
        }
        String num = c12 != null ? c12.toString() : null;
        T00.e h13 = composerState.h();
        Integer i11 = h13 != null ? h13.i() : null;
        if (i11 != null && i11.intValue() == -1) {
            i11 = null;
        }
        String num2 = i11 != null ? i11.toString() : null;
        T00.e h14 = composerState.h();
        Integer d11 = h14 != null ? h14.d() : null;
        if (d11 != null && d11.intValue() == -1) {
            d11 = null;
        }
        String num3 = d11 != null ? d11.toString() : null;
        T00.e h15 = composerState.h();
        Long f11 = (h15 == null || (b12 = h15.b()) == null) ? null : b12.f();
        String n11 = composerState.n();
        Function1<T00.a, Map<String, Object>> function1 = this.f28468a;
        Map<String, Object> invoke = function1 != null ? function1.invoke(composerState) : null;
        if (invoke == null) {
            invoke = U.c();
        }
        Map<String, Object> map = invoke;
        T00.e h16 = composerState.h();
        if (h16 == null || (b11 = h16.g()) == null) {
            b11 = P4.f.b("toString(...)");
        }
        return new Rg.a(str2, str3, num, num3, num2, f11, str, n11, null, b11, map, 768);
    }
}
