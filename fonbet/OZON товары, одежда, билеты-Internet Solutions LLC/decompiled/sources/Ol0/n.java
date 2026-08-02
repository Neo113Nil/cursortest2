package Ol0;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource", f = "IPCClientsDataSource.kt", l = {71, 46}, m = "clear")
/* loaded from: classes4.dex */
public final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public o f20496d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3394a f20497e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f20498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f20499g;

    /* renamed from: h, reason: collision with root package name */
    public int f20500h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20499g = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20498f = obj;
        this.f20500h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20499g.b(this);
    }
}
