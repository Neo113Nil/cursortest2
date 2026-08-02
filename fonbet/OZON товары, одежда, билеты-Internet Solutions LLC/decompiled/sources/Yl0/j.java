package Yl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushTokenUseCase", f = "RegisterPushTokenUseCase.kt", l = {20}, m = "invoke-iRXhn8M")
/* loaded from: classes4.dex */
public final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f35171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f35172e;

    /* renamed from: f, reason: collision with root package name */
    public int f35173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f35172e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35171d = obj;
        this.f35173f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f35172e.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
