package N70;

import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f18781a;

    public f(i iVar) {
        this.f18781a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f18781a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new e(creators);
    }
}
