package Kb0;

import Sc.InterfaceC4003e;
import Vb0.b;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* loaded from: classes3.dex */
final /* synthetic */ class F implements C8588a.b, InterfaceC7732n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a f15448a;

    F(b.a aVar) {
        this.f15448a = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C8588a.b) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7719a(1, this.f15448a, b.a.class, "i", "i(Ljava/lang/String;Ljava/util/Map;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // nf.C8588a.b
    public final void log(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        b.a.e(this.f15448a, p02);
    }
}
