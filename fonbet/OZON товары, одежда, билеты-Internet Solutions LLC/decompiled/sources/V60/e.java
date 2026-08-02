package V60;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.OfflineRepositoryImpl", f = "OfflineRepositoryImpl.kt", l = {146, 158, 163}, m = "refresh")
/* loaded from: classes3.dex */
final class e<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f28374d;

    /* renamed from: e, reason: collision with root package name */
    W60.a f28375e;

    /* renamed from: f, reason: collision with root package name */
    Y60.b f28376f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f28377g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f28378h;

    /* renamed from: i, reason: collision with root package name */
    int f28379i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28378h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object r11;
        this.f28377g = obj;
        this.f28379i |= LinearLayoutManager.INVALID_OFFSET;
        r11 = this.f28378h.r(null, null, null, this);
        return r11;
    }
}
