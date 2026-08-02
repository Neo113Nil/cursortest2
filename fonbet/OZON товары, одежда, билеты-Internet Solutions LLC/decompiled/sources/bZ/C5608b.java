package bZ;

import We.B;
import We.G;
import We.L;
import org.jetbrains.annotations.NotNull;

/* renamed from: bZ.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5608b implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.a("x-o3-sdk-versions", V.e.b(new Object[]{"2.5.6"}, 1, "cdnchooser_android/%s", "format(...)"));
        return aVar.proceed(aVar2.b());
    }
}
