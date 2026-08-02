package Si;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.presentation.GalleryViewModel", f = "GalleryViewModel.kt", l = {259}, m = "removeMissingSelectedMediaIds")
/* loaded from: classes10.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f26331d;

    /* renamed from: e, reason: collision with root package name */
    List f26332e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f26333f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f26334g;

    /* renamed from: h, reason: collision with root package name */
    int f26335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26334g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26333f = obj;
        this.f26335h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26334g.O0(this);
    }
}
