package O40;

import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f19948a;

    public e(i iVar) {
        this.f19948a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f19948a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new d(creators);
    }
}
