package X60;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.features.offline.data.common.imagedownloader.ImageDownloaderImpl", f = "ImageDownloaderImpl.kt", l = {18, 19, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER, 29}, m = "downloadImage")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f34142d;

    /* renamed from: e, reason: collision with root package name */
    String f34143e;

    /* renamed from: f, reason: collision with root package name */
    String f34144f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f34145g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f34146h;

    /* renamed from: i, reason: collision with root package name */
    int f34147i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f34146h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34145g = obj;
        this.f34147i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34146h.a(null, null, this);
    }
}
