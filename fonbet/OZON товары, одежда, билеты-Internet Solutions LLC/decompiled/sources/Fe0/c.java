package Fe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.cache.repository.StyleCacheRepository", f = "StyleCacheRepository.kt", l = {17, 18, 19}, m = "getCachedFile")
/* loaded from: classes7.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f9439d;

    /* renamed from: e, reason: collision with root package name */
    De0.b f9440e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f9441f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f9442g;

    /* renamed from: h, reason: collision with root package name */
    int f9443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f9442g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9441f = obj;
        this.f9443h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9442g.b(null, this);
    }
}
