package Yl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.UnsubscribeFromTopicUseCase", f = "UnsubscribeFromTopicUseCase.kt", l = {8}, m = "invoke-gIAlu-s")
/* loaded from: classes4.dex */
public final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f35192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f35193e;

    /* renamed from: f, reason: collision with root package name */
    public int f35194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f35193e = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35192d = obj;
        this.f35194f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f35193e.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
