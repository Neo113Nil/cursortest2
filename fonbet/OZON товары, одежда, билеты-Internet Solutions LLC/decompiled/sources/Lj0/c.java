package Lj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.logging.business.LogSource;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.logging.business.AndroidTrackerBusinessLogger", f = "AndroidTrackerBusinessLogger.kt", l = {110}, m = "logResponseError")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f17109d;

    /* renamed from: e, reason: collision with root package name */
    String f17110e;

    /* renamed from: f, reason: collision with root package name */
    e f17111f;

    /* renamed from: g, reason: collision with root package name */
    LogSource f17112g;

    /* renamed from: h, reason: collision with root package name */
    String f17113h;

    /* renamed from: i, reason: collision with root package name */
    int f17114i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f17115j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ e f17116k;

    /* renamed from: l, reason: collision with root package name */
    int f17117l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f17116k = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17115j = obj;
        this.f17117l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17116k.c(0, null, this);
    }
}
