package Q90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles", f = "FeatureToggles.kt", l = {281}, m = "initFeatureFlagsNetwork")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f23082d;

    /* renamed from: e, reason: collision with root package name */
    String f23083e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f23084f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f23085g;

    /* renamed from: h, reason: collision with root package name */
    int f23086h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f23085g = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23084f = obj;
        this.f23086h |= LinearLayoutManager.INVALID_OFFSET;
        return c.j(this.f23085g, this);
    }
}
