package F4;

import F4.F;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: F4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3023c extends F.d {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3021a<Object> f8867d;

    C3023c(C3021a<Object> c3021a) {
        this.f8867d = c3021a;
    }

    @Override // F4.F.d
    public final void d(@NotNull y type, @NotNull x state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = this.f8867d.e().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(type, state);
        }
    }
}
