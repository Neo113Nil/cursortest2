package J0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {397}, m = "animateElevation")
/* loaded from: classes8.dex */
final class E0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f12754d;

    /* renamed from: e, reason: collision with root package name */
    t0.n f12755e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f12756f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ G0 f12757g;

    /* renamed from: h, reason: collision with root package name */
    int f12758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E0(G0 g02, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f12757g = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f12756f = obj;
        this.f12758h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f12757g.b(null, this);
    }
}
