package Tg0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.dialog.internal.domain.usecase.CheckNeedShowDialogUseCase", f = "CheckNeedShowDialogUseCase.kt", l = {11}, m = "invoke")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f27168d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f27169e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f27170f;

    /* renamed from: g, reason: collision with root package name */
    int f27171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f27170f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f27169e = obj;
        this.f27171g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f27170f.a(this);
    }
}
