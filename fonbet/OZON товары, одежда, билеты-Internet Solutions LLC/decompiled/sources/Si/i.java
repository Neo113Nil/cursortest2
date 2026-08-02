package Si;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.presentation.GalleryViewModel", f = "GalleryViewModel.kt", l = {291}, m = "getMediaById")
/* loaded from: classes10.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f26318d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f26319e;

    /* renamed from: f, reason: collision with root package name */
    int f26320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26319e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26318d = obj;
        this.f26320f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26319e.A0(0L, this);
    }
}
