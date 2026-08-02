package ae0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.StyleDownloader", f = "StyleDownloader.kt", l = {98}, m = "checkStyleExistInCache")
/* loaded from: classes7.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f36658d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f36659e;

    /* renamed from: f, reason: collision with root package name */
    int f36660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36659e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36658d = obj;
        this.f36660f |= LinearLayoutManager.INVALID_OFFSET;
        return q.a(this.f36659e, null, null, this);
    }
}
