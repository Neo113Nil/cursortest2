package Fe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.cache.repository.StyleCacheRepository", f = "StyleCacheRepository.kt", l = {57, 63}, m = "optimizeCache")
/* loaded from: classes7.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f9444d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f9445e;

    /* renamed from: f, reason: collision with root package name */
    long f9446f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f9447g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f9448h;

    /* renamed from: i, reason: collision with root package name */
    int f9449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f9448h = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object c11;
        this.f9447g = obj;
        this.f9449i |= LinearLayoutManager.INVALID_OFFSET;
        c11 = this.f9448h.c(this);
        return c11;
    }
}
