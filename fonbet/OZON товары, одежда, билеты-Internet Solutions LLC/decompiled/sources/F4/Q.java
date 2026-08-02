package F4;

import F4.AbstractC3028h;
import F4.O;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class Q extends O.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O.d f8847a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O<Object> f8848b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10737n f8849c;

    Q(O.d dVar, O o11, C10737n c10737n) {
        this.f8847a = dVar;
        this.f8848b = o11;
        this.f8849c = c10737n;
    }

    public final void a(@NotNull List<Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = this.f8847a.f8842a;
        Integer valueOf = i11 == 0 ? null : Integer.valueOf(i11);
        boolean e11 = this.f8848b.e();
        C10737n c10737n = this.f8849c;
        if (e11) {
            AbstractC3028h.a aVar = new AbstractC3028h.a(kotlin.collections.K.f71697a, null, null, 0, 0);
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(aVar);
        } else {
            AbstractC3028h.a aVar2 = new AbstractC3028h.a(data, valueOf, Integer.valueOf(data.size() + i11), LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
            r.Companion companion2 = Sc.r.INSTANCE;
            c10737n.resumeWith(aVar2);
        }
    }
}
