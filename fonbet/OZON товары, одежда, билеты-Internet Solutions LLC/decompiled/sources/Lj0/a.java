package Lj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.logging.business.LogSource;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.logging.business.AndroidTrackerBusinessLogger", f = "AndroidTrackerBusinessLogger.kt", l = {110}, m = "logDatabaseError")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f17093d;

    /* renamed from: e, reason: collision with root package name */
    String f17094e;

    /* renamed from: f, reason: collision with root package name */
    String f17095f;

    /* renamed from: g, reason: collision with root package name */
    e f17096g;

    /* renamed from: h, reason: collision with root package name */
    LogSource f17097h;

    /* renamed from: i, reason: collision with root package name */
    String f17098i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f17099j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ e f17100k;

    /* renamed from: l, reason: collision with root package name */
    int f17101l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f17100k = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17099j = obj;
        this.f17101l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f17100k.a(null, null, this);
    }
}
