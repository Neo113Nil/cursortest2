package V60;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.OfflineRepositoryImpl", f = "OfflineRepositoryImpl.kt", l = {76}, m = "getSmsText")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f28365d;

    /* renamed from: e, reason: collision with root package name */
    String f28366e;

    /* renamed from: f, reason: collision with root package name */
    String f28367f;

    /* renamed from: g, reason: collision with root package name */
    String f28368g;

    /* renamed from: h, reason: collision with root package name */
    boolean f28369h;

    /* renamed from: i, reason: collision with root package name */
    boolean f28370i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f28371j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ b f28372k;

    /* renamed from: l, reason: collision with root package name */
    int f28373l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28372k = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28371j = obj;
        this.f28373l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28372k.g(null, null, null, false, false, this);
    }
}
