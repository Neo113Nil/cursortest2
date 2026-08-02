package T90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.repository.FeatureTogglesRepositoryImpl", f = "FeatureTogglesRepositoryImpl.kt", l = {58}, m = "loadFeatureFlagsNetwork")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f26925d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f26926e;

    /* renamed from: f, reason: collision with root package name */
    int f26927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26926e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26925d = obj;
        this.f26927f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26926e.b(null, null, this);
    }
}
