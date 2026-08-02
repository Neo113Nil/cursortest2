package R2;

import R2.C3922p;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
/* renamed from: R2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3919m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f24383d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f24384e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3922p<Object>.a f24385f;

    /* renamed from: g, reason: collision with root package name */
    int f24386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3919m(C3922p.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24385f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24384e = obj;
        this.f24386g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24385f.b(this);
    }
}
