package ae0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.StyleDownloader", f = "StyleDownloader.kt", l = {108}, m = "safeGetStyleFromCache")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f36680d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f36681e;

    /* renamed from: f, reason: collision with root package name */
    int f36682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36681e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f36680d = obj;
        this.f36682f |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f36681e.g(null, null, this);
        return g10;
    }
}
