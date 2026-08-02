package Md0;

import Ld0.e;
import Od0.d;
import Sc.InterfaceC3999a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f17898a;

    public c(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.f17898a = diStore;
    }

    @InterfaceC3999a
    @NotNull
    public final LinkedHashSet a() {
        Collection<d<e>> values = this.f17898a.g().values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getAbToolLibsConfigProvider();
            C7714v.p(M.f71699a, linkedHashSet);
        }
        return linkedHashSet;
    }
}
