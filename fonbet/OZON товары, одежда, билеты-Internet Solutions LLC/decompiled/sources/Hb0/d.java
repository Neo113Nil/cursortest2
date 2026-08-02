package Hb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.featureflags.OzonIdFeatureFlagsStoreImpl", f = "OzonIdFeatureFlagsStoreImpl.kt", l = {14}, m = "get")
/* loaded from: classes7.dex */
final class d<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f10788d;

    /* renamed from: e, reason: collision with root package name */
    f f10789e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f10790f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f10791g;

    /* renamed from: h, reason: collision with root package name */
    int f10792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f10791g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f10790f = obj;
        this.f10792h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f10791g.a(null, this);
    }
}
