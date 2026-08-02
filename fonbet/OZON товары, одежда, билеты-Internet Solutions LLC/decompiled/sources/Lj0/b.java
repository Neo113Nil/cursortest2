package Lj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.logging.business.LogSource;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.logging.business.AndroidTrackerBusinessLogger", f = "AndroidTrackerBusinessLogger.kt", l = {116}, m = "logDeserializationError")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f17102d;

    /* renamed from: e, reason: collision with root package name */
    String f17103e;

    /* renamed from: f, reason: collision with root package name */
    LogSource f17104f;

    /* renamed from: g, reason: collision with root package name */
    String f17105g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f17106h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ e f17107i;

    /* renamed from: j, reason: collision with root package name */
    int f17108j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f17107i = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17106h = obj;
        this.f17108j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17107i.b(null, this);
    }
}
