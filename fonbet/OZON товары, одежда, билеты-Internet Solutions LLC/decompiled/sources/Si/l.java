package Si;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.presentation.GalleryViewModel", f = "GalleryViewModel.kt", l = {373}, m = "getTypeOfSelectedItems")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f26326d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f26327e;

    /* renamed from: f, reason: collision with root package name */
    int f26328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26327e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26326d = obj;
        this.f26328f |= LinearLayoutManager.INVALID_OFFSET;
        return e.h0(this.f26327e, this);
    }
}
