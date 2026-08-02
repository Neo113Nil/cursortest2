package ae0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.StyleDownloader", f = "StyleDownloader.kt", l = {28}, m = "getStyleForUrl")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    q f36674d;

    /* renamed from: e, reason: collision with root package name */
    String f36675e;

    /* renamed from: f, reason: collision with root package name */
    String f36676f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f36677g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f36678h;

    /* renamed from: i, reason: collision with root package name */
    int f36679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36678h = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36677g = obj;
        this.f36679i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36678h.f(null, null, null, null, this);
    }
}
