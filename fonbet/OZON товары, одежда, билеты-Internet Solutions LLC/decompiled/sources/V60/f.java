package V60;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.OfflineRepositoryImpl", f = "OfflineRepositoryImpl.kt", l = {95, 96, 97}, m = "refreshAll")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f28380d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f28381e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f28382f;

    /* renamed from: g, reason: collision with root package name */
    int f28383g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28382f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28381e = obj;
        this.f28383g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28382f.o(this);
    }
}
