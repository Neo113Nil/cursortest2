package Nl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.RegisterPushTokenRepository", f = "RegisterPushTokenRepository.kt", l = {11}, m = "registerForPushes-iRXhn8M")
/* loaded from: classes4.dex */
public final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f19644e;

    /* renamed from: f, reason: collision with root package name */
    public int f19645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19644e = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19643d = obj;
        this.f19645f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f19644e.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
