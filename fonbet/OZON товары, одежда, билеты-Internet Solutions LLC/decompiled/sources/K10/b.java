package K10;

import Jb.e;
import Jb.f;
import K10.a;
import kotlin.jvm.internal.Intrinsics;
import l10.f;

/* loaded from: classes7.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final f f15106a;

    public b(f fVar) {
        this.f15106a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        f.EnumC1196f topSpacerType = (f.EnumC1196f) this.f15106a.get();
        Intrinsics.checkNotNullParameter(topSpacerType, "topSpacerType");
        return new a(new a.C0289a(topSpacerType != f.EnumC1196f.DISABLED));
    }
}
