package E80;

import Jb.e;
import Jb.h;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements e<Y30.b> {

    /* renamed from: a, reason: collision with root package name */
    private final h f7646a;

    public d(c cVar, h hVar) {
        this.f7646a = hVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map factories = (Map) this.f7646a.get();
        Intrinsics.checkNotNullParameter(factories, "factories");
        return new Y30.b(factories);
    }
}
