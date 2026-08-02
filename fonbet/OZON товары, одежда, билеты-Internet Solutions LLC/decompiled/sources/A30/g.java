package A30;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.auth.domain.FintechAuthInteractor", f = "FintechAuthInteractor.kt", l = {238, 257, 263, 269}, m = "authLogin")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    m f358d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f359e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f360f;

    /* renamed from: g, reason: collision with root package name */
    int f361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f360f = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f359e = obj;
        this.f361g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f360f.e(null, null, this);
    }
}
