package Ae0;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.MapStorage", f = "MapStorage.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "getVectorStyleConfig")
/* loaded from: classes7.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f1191d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f1192e;

    /* renamed from: f, reason: collision with root package name */
    int f1193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f1192e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f1191d = obj;
        this.f1193f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f1192e.b(null, null, this);
    }
}
