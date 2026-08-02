package Gd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.G0;
import je.L0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9846l;
import wd.AbstractC10517c;

/* loaded from: classes10.dex */
public final class f0 extends AbstractC10517c {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Fd.k f10025k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Jd.x f10026l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull Fd.k c11, @NotNull Jd.x javaTypeParameter, int i11, @NotNull InterfaceC9846l containingDeclaration) {
        super(c11.e(), containingDeclaration, new Fd.g(c11, javaTypeParameter, false), javaTypeParameter.getName(), L0.INVARIANT, false, i11, c11.a().v());
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.f10025k = c11;
        this.f10026l = javaTypeParameter;
    }

    @Override // wd.AbstractC10527m
    @NotNull
    protected final List<je.N> C0(@NotNull List<? extends je.N> bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Fd.k kVar = this.f10025k;
        return kVar.a().r().d(this, bounds, kVar);
    }

    @Override // wd.AbstractC10527m
    protected final void F0(@NotNull je.N type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // wd.AbstractC10527m
    @NotNull
    protected final List<je.N> G0() {
        Collection<Jd.j> upperBounds = this.f10026l.getUpperBounds();
        boolean isEmpty = upperBounds.isEmpty();
        Fd.k kVar = this.f10025k;
        if (isEmpty) {
            je.Y i11 = ((wd.L) kVar.d()).n().i();
            Intrinsics.checkNotNullExpressionValue(i11, "getAnyType(...)");
            je.Y C11 = ((wd.L) kVar.d()).n().C();
            Intrinsics.checkNotNullExpressionValue(C11, "getNullableAnyType(...)");
            return C7714v.a0(je.Q.c(i11, C11));
        }
        Collection<Jd.j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(kVar.g().e((Jd.j) it.next(), Hd.b.d(G0.COMMON, false, this, 3)));
        }
        return arrayList;
    }
}
