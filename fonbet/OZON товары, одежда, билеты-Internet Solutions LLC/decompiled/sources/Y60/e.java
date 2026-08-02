package Y60;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.main.MainData;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.common.transformer.MainDataCachedTransformer", f = "MainDataCachedTransformer.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "prepareForCache")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    f f34715d;

    /* renamed from: e, reason: collision with root package name */
    MainData f34716e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f34717f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f34718g;

    /* renamed from: h, reason: collision with root package name */
    int f34719h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f34718g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34717f = obj;
        this.f34719h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34718g.b(null, this);
    }
}
