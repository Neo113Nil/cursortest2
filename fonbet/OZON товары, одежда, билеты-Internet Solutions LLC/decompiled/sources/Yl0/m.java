package Yl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.SendPushTokenToClientIfNeedUseCase", f = "SendPushTokenToClientIfNeedUseCase.kt", l = {18, 21, 22}, m = "invoke-Du7M8sQ")
/* loaded from: classes4.dex */
public final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public n f35182d;

    /* renamed from: e, reason: collision with root package name */
    public String f35183e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f35184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f35185g;

    /* renamed from: h, reason: collision with root package name */
    public int f35186h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f35185g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35184f = obj;
        this.f35186h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35185g.a(null, this);
    }
}
