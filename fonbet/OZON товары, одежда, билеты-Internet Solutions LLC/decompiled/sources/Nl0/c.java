package Nl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {109}, m = "getHostList")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public e f19614d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f19616f;

    /* renamed from: g, reason: collision with root package name */
    public int f19617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19616f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19615e = obj;
        this.f19617g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19616f.a(null, this);
    }
}
