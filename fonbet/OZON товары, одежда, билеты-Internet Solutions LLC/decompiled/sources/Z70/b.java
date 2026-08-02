package Z70;

import Jb.e;
import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f35689a;

    public b(i iVar) {
        this.f35689a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f35689a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new a(creators);
    }
}
