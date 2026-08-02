package T2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import sf.G;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {180, 187}, m = "readData$suspendImpl")
/* loaded from: classes8.dex */
final class b<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f26520d;

    /* renamed from: e, reason: collision with root package name */
    G f26521e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f26522f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c<T> f26523g;

    /* renamed from: h, reason: collision with root package name */
    int f26524h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f26523g = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26522f = obj;
        this.f26524h |= LinearLayoutManager.INVALID_OFFSET;
        return c.j(this.f26523g, this);
    }
}
