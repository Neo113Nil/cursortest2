package D90;

import Ae.C0;
import Ae.E0;
import N3.C3660k;
import Sc.InterfaceC4008j;
import androidx.lifecycle.x0;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* loaded from: classes3.dex */
public final class j extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f6211a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f6212b;

    /* renamed from: c, reason: collision with root package name */
    private B0 f6213c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f6214d;

    public j(@NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f6211a = fintechNavigation;
        this.f6212b = E0.b(0, 0, null, 7);
        this.f6214d = Sc.k.b(new h(this, 0));
    }

    public static U80.a d0(j jVar) {
        Object U10 = jVar.f6211a.U();
        L80.a.a("FintechNativeBridgeTestingViewModel", "webViewNavigator = " + U10);
        if (U10 instanceof U80.a) {
            return (U80.a) U10;
        }
        return null;
    }

    public static final U80.a e0(j jVar) {
        return (U80.a) jVar.f6214d.getValue();
    }

    public final void f0(@NotNull String data, @NotNull String group, @NotNull String method, Boolean bool, f fVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(method, "method");
        B0 b02 = this.f6213c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f6213c = C10727i.c(x0.a(this), null, null, new i(this, group, method, null), 3);
        U80.a aVar = (U80.a) this.f6214d.getValue();
        if (aVar != null) {
            aVar.p(C6594f.a("(", data, ")", C3660k.d("window.native_bridge.", group, ".", method, Intrinsics.d(bool, Boolean.TRUE) ? "_sync" : "")), fVar);
        }
    }

    public final Map<String, List<String>> g0() {
        U80.a aVar = (U80.a) this.f6214d.getValue();
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    @NotNull
    public final C0 h0() {
        return this.f6212b;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        B0 b02 = this.f6213c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }
}
