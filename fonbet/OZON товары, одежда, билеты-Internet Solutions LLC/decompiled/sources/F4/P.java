package F4;

import F4.AbstractC3028h;
import F4.O;
import Sc.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class P extends O.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O<Object> f8844a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10737n f8845b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O.b f8846c;

    P(O o11, C10737n c10737n, O.b bVar) {
        this.f8844a = o11;
        this.f8845b = c10737n;
        this.f8846c = bVar;
    }

    public final void a(int i11, int i12, @NotNull List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        boolean e11 = this.f8844a.e();
        C10737n c10737n = this.f8845b;
        if (e11) {
            AbstractC3028h.a aVar = new AbstractC3028h.a(kotlin.collections.K.f71697a, null, null, 0, 0);
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(aVar);
            return;
        }
        int size = data.size() + i11;
        AbstractC3028h.a aVar2 = new AbstractC3028h.a(data, i11 == 0 ? null : Integer.valueOf(i11), size != i12 ? Integer.valueOf(size) : null, i11, (i12 - data.size()) - i11);
        O.b bVar = this.f8846c;
        if (bVar.f8841d) {
            aVar2.e(bVar.f8840c);
        }
        r.Companion companion2 = Sc.r.INSTANCE;
        c10737n.resumeWith(aVar2);
    }
}
