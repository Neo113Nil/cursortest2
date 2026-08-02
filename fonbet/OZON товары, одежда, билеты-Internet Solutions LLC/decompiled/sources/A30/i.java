package A30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.auth.domain.FintechAuthInteractor", f = "FintechAuthInteractor.kt", l = {364, 366, 368, 374, 376}, m = "logOut")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    m f365d;

    /* renamed from: e, reason: collision with root package name */
    String f366e;

    /* renamed from: f, reason: collision with root package name */
    boolean f367f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f368g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ m f369h;

    /* renamed from: i, reason: collision with root package name */
    int f370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f369h = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f368g = obj;
        this.f370i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f369h.w(false, this);
    }
}
