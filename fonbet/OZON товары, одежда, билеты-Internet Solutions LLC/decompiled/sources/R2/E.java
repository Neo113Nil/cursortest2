package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
/* loaded from: classes.dex */
final class E extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.K f24272d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f24273e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24274f;

    /* renamed from: g, reason: collision with root package name */
    int f24275g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24274f = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24273e = obj;
        this.f24275g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24274f.s(null, false, this);
    }
}
