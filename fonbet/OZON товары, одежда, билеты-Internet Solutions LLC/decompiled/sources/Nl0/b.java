package Nl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {119, 104}, m = "clear")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f19609d;

    /* renamed from: e, reason: collision with root package name */
    public Je.d f19610e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f19611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f19612g;

    /* renamed from: h, reason: collision with root package name */
    public int f19613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19612g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19611f = obj;
        this.f19613h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19612g.b(this);
    }
}
