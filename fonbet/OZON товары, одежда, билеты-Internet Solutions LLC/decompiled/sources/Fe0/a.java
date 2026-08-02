package Fe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.cache.repository.ProviderCacheRepository", f = "ProviderCacheRepository.kt", l = {10}, m = "getFallbackProvider")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f9435d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f9436e;

    /* renamed from: f, reason: collision with root package name */
    int f9437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f9436e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9435d = obj;
        this.f9437f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9436e.a(this);
    }
}
