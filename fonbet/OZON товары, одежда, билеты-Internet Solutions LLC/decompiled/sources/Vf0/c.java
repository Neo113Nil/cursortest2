package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersDataSource", f = "ExtraHeadersDataSource.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "setExtraHeaders")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Map f32696d;

    /* renamed from: e, reason: collision with root package name */
    e f32697e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f32698f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f32699g;

    /* renamed from: h, reason: collision with root package name */
    int f32700h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32699g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f32698f = obj;
        this.f32700h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32699g.g(null, this);
    }
}
