package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
/* renamed from: R2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3928w extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3922p f24478d;

    /* renamed from: e, reason: collision with root package name */
    g0 f24479e;

    /* renamed from: f, reason: collision with root package name */
    boolean f24480f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f24481g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24482h;

    /* renamed from: i, reason: collision with root package name */
    int f24483i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3928w(C3922p<Object> c3922p, kotlin.coroutines.d<? super C3928w> dVar) {
        super(dVar);
        this.f24482h = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24481g = obj;
        this.f24483i |= LinearLayoutManager.INVALID_OFFSET;
        return C3922p.l(this.f24482h, false, this);
    }
}
