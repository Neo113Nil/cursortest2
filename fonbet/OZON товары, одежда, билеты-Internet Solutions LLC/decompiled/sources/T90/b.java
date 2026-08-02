package T90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.repository.FeatureTogglesRepositoryImpl", f = "FeatureTogglesRepositoryImpl.kt", l = {71}, m = "loadFeatureFlag")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f26921d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f26922e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f26923f;

    /* renamed from: g, reason: collision with root package name */
    int f26924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26923f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26922e = obj;
        this.f26924g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26923f.c(null, null, this);
    }
}
