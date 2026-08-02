package B70;

import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f3018a;

    public h(i iVar) {
        this.f3018a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f3018a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new e(creators);
    }
}
