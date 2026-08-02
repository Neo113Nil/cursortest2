package J0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {383}, m = "snapElevation")
/* loaded from: classes8.dex */
final class F0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f12769d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f12770e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ G0 f12771f;

    /* renamed from: g, reason: collision with root package name */
    int f12772g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F0(G0 g02, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f12771f = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object d11;
        this.f12770e = obj;
        this.f12772g |= LinearLayoutManager.INVALID_OFFSET;
        d11 = this.f12771f.d(this);
        return d11;
    }
}
