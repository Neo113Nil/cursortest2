package Ji0;

import Ae.InterfaceC2395h;
import ij0.InterfaceC7088c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi0.AbstractC10323a;

/* loaded from: classes3.dex */
public abstract class b implements kj0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7088c f14811a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fj0.d<?>[] f14812b;

    public b(@NotNull InterfaceC7088c loadConfiguration) {
        Intrinsics.checkNotNullParameter(loadConfiguration, "loadConfiguration");
        this.f14811a = loadConfiguration;
        this.f14812b = new fj0.d[]{AbstractC10323a.C2233a.f102983c, AbstractC10323a.j.f102992c, AbstractC10323a.g.f102989c};
    }

    @NotNull
    protected fj0.d<?>[] a() {
        return this.f14812b;
    }

    @Override // kj0.b
    @NotNull
    public final a load() {
        int length = a().length;
        InterfaceC2395h[] interfaceC2395hArr = new InterfaceC2395h[length];
        for (int i11 = 0; i11 < length; i11++) {
            interfaceC2395hArr[i11] = this.f14811a.a(a()[i11]);
        }
        return new a(interfaceC2395hArr);
    }
}
