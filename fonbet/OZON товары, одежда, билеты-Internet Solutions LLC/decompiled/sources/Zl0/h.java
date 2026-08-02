package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl", f = "ClientServiceInteractorImpl.kt", l = {116}, m = "callOnDeleteMessages")
/* loaded from: classes4.dex */
public final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f36041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f36042e;

    /* renamed from: f, reason: collision with root package name */
    public int f36043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36042e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36041d = obj;
        this.f36043f |= LinearLayoutManager.INVALID_OFFSET;
        return i.e(this.f36042e, this);
    }
}
