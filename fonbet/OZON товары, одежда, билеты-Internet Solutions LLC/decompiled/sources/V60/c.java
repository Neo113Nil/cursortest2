package V60;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.main.MainData;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.OfflineRepositoryImpl", f = "OfflineRepositoryImpl.kt", l = {172, 176}, m = "buildPlaceholdersMap")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f28359d;

    /* renamed from: e, reason: collision with root package name */
    List f28360e;

    /* renamed from: f, reason: collision with root package name */
    MainData f28361f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f28362g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f28363h;

    /* renamed from: i, reason: collision with root package name */
    int f28364i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28363h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28362g = obj;
        this.f28364i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28363h.h(null, this);
    }
}
