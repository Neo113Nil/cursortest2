package F20;

import B20.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f8387a;

    public b(@NotNull f ozonDebugMenuRepository) {
        Intrinsics.checkNotNullParameter(ozonDebugMenuRepository, "ozonDebugMenuRepository");
        this.f8387a = ozonDebugMenuRepository;
    }

    @NotNull
    public final ArrayList a() {
        ArrayList d11 = this.f8387a.d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d11.iterator();
        while (it.hasNext()) {
            C7714v.p(G20.a.a((U20.a) it.next()), arrayList);
        }
        return arrayList;
    }
}
