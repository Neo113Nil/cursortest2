package T2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import sf.D;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {236, 137}, m = "writeScope")
/* loaded from: classes8.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    j f26545d;

    /* renamed from: e, reason: collision with root package name */
    Object f26546e;

    /* renamed from: f, reason: collision with root package name */
    D f26547f;

    /* renamed from: g, reason: collision with root package name */
    Object f26548g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f26549h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ j<Object> f26550i;

    /* renamed from: j, reason: collision with root package name */
    int f26551j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26550i = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26549h = obj;
        this.f26551j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26550i.b(null, this);
    }
}
