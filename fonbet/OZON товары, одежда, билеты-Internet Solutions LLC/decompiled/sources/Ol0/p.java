package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource", f = "IPCClientsDataSource.kt", l = {52}, m = "createIPCClients")
/* loaded from: classes8.dex */
public final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public o f20507d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f20509f;

    /* renamed from: g, reason: collision with root package name */
    public int f20510g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20509f = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20508e = obj;
        this.f20510g |= LinearLayoutManager.INVALID_OFFSET;
        return o.a(this.f20509f, this);
    }
}
