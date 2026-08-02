package bc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import bc0.AbstractC5650i;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.logout.presentation.viewModel.LogoutViewModel", f = "LogoutViewModel.kt", l = {80, 82, 83, 86}, m = "onLogoutResult")
/* renamed from: bc0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5647f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C5643b f55914d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC5650i.b f55915e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f55916f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C5643b f55917g;

    /* renamed from: h, reason: collision with root package name */
    int f55918h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5647f(C5643b c5643b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f55917g = c5643b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f55916f = obj;
        this.f55918h |= LinearLayoutManager.INVALID_OFFSET;
        return C5643b.h0(this.f55917g, null, this);
    }
}
