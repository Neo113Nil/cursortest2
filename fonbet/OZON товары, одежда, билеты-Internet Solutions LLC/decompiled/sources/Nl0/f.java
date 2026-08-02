package Nl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.BaseClientAnalyticsRepository", f = "BaseClientAnalyticsRepository.kt", l = {12}, m = "getBaseParams")
/* loaded from: classes8.dex */
public final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public g f19632d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f19634f;

    /* renamed from: g, reason: collision with root package name */
    public int f19635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f19634f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f19633e = obj;
        this.f19635g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f19634f.a(this);
    }
}
