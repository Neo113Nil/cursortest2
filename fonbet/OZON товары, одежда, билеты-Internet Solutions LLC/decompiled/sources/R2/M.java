package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
/* loaded from: classes.dex */
final class M<R> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    O f24299d;

    /* renamed from: e, reason: collision with root package name */
    J f24300e;

    /* renamed from: f, reason: collision with root package name */
    boolean f24301f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f24302g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ O<Object> f24303h;

    /* renamed from: i, reason: collision with root package name */
    int f24304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(O o11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24303h = o11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24302g = obj;
        this.f24304i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24303h.a(null, this);
    }
}
