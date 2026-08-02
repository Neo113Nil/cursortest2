package T2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
/* loaded from: classes8.dex */
final class h<R> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    j f26539d;

    /* renamed from: e, reason: collision with root package name */
    c f26540e;

    /* renamed from: f, reason: collision with root package name */
    boolean f26541f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f26542g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ j<Object> f26543h;

    /* renamed from: i, reason: collision with root package name */
    int f26544i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26543h = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26542g = obj;
        this.f26544i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26543h.a(null, this);
    }
}
