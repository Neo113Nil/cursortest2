package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
/* loaded from: classes.dex */
final class N extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    O f24305d;

    /* renamed from: e, reason: collision with root package name */
    Object f24306e;

    /* renamed from: f, reason: collision with root package name */
    Object f24307f;

    /* renamed from: g, reason: collision with root package name */
    Q f24308g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f24309h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ O<Object> f24310i;

    /* renamed from: j, reason: collision with root package name */
    int f24311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(O o11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24310i = o11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24309h = obj;
        this.f24311j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24310i.b(null, this);
    }
}
