package O0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {77, 79, 80}, m = "animate")
/* loaded from: classes8.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    m f19763d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f19764e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f19765f;

    /* renamed from: g, reason: collision with root package name */
    int f19766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19765f = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19764e = obj;
        this.f19766g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19765f.d(this);
    }
}
