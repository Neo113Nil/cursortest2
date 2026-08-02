package Lj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.logging.business.LogSource;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.logging.business.AndroidTrackerBusinessLogger", f = "AndroidTrackerBusinessLogger.kt", l = {116}, m = "logUnknownSendingError")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f17118d;

    /* renamed from: e, reason: collision with root package name */
    String f17119e;

    /* renamed from: f, reason: collision with root package name */
    LogSource f17120f;

    /* renamed from: g, reason: collision with root package name */
    String f17121g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f17122h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ e f17123i;

    /* renamed from: j, reason: collision with root package name */
    int f17124j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f17123i = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17122h = obj;
        this.f17124j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17123i.d(null, this);
    }
}
