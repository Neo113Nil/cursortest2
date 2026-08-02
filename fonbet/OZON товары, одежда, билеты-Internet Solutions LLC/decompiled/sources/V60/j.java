package V60;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.OfflineRepositoryImpl", f = "OfflineRepositoryImpl.kt", l = {208, 213}, m = "restore")
/* loaded from: classes3.dex */
final class j<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Y60.b f28384d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f28385e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f28386f;

    /* renamed from: g, reason: collision with root package name */
    int f28387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28386f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object s11;
        this.f28385e = obj;
        this.f28387g |= LinearLayoutManager.INVALID_OFFSET;
        s11 = this.f28386f.s(null, null, this);
        return s11;
    }
}
