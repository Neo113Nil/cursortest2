package Yl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.DeletePushTokenIfExistsUseCase", f = "DeletePushTokenIfExistsUseCase.kt", l = {16, 19, 23}, m = "invoke")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public c f35146d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35147e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f35148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f35149g;

    /* renamed from: h, reason: collision with root package name */
    public int f35150h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f35149g = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35148f = obj;
        this.f35150h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35149g.a(false, this);
    }
}
