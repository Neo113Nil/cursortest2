package T2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9686l;
import sf.F;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {216}, m = "writeData")
/* loaded from: classes8.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    AbstractC9686l f26559d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC9686l f26560e;

    /* renamed from: f, reason: collision with root package name */
    F f26561f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f26562g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ l<Object> f26563h;

    /* renamed from: i, reason: collision with root package name */
    int f26564i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f26563h = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f26562g = obj;
        this.f26564i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f26563h.c(null, this);
    }
}
