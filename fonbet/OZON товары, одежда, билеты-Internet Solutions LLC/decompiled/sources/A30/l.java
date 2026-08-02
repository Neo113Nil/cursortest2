package A30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.auth.domain.FintechAuthInteractor", f = "FintechAuthInteractor.kt", l = {388}, m = "logOutRoutine")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    m f373d;

    /* renamed from: e, reason: collision with root package name */
    String f374e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f375f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m f376g;

    /* renamed from: h, reason: collision with root package name */
    int f377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f376g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f375f = obj;
        this.f377h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f376g.x(null, this);
    }
}
