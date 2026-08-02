package Zc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsViewModel", f = "PageAgreementWithConditionsViewModel.kt", l = {165}, m = "submitOtp")
/* loaded from: classes3.dex */
final class u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    q f35890d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f35891e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f35892f;

    /* renamed from: g, reason: collision with root package name */
    int f35893g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f35892f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35891e = obj;
        this.f35893g |= LinearLayoutManager.INVALID_OFFSET;
        return q.n0(this.f35892f, this);
    }
}
