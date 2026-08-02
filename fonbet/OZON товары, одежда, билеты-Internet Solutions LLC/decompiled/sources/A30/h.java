package A30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.auth.domain.FintechAuthInteractor", f = "FintechAuthInteractor.kt", l = {297}, m = "authThrottleStatus")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f362d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f363e;

    /* renamed from: f, reason: collision with root package name */
    int f364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f363e = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f362d = obj;
        this.f364f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f363e.f(this);
    }
}
