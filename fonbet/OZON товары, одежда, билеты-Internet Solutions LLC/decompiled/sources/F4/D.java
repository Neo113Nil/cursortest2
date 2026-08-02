package F4;

import F4.AbstractC3028h;
import F4.C;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class D extends C.a<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f8777a;

    D(C10737n c10737n, boolean z11) {
        this.f8777a = c10737n;
    }

    public final void a(@NotNull kotlin.collections.K data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AbstractC3028h.a aVar = new AbstractC3028h.a(data, null, null, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        r.Companion companion = Sc.r.INSTANCE;
        this.f8777a.resumeWith(aVar);
    }
}
