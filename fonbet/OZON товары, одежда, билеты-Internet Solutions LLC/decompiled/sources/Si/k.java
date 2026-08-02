package Si;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.presentation.GalleryViewModel", f = "GalleryViewModel.kt", l = {286}, m = "getSelectedMedia")
/* loaded from: classes10.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    LinkedHashMap f26322d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f26323e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f26324f;

    /* renamed from: g, reason: collision with root package name */
    int f26325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26324f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26323e = obj;
        this.f26325g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26324f.H0(this);
    }
}
