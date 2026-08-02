package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import xe.InterfaceC10750u;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
/* renamed from: R2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3924s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f24459d;

    /* renamed from: e, reason: collision with root package name */
    C3922p f24460e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC10750u f24461f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f24462g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24463h;

    /* renamed from: i, reason: collision with root package name */
    int f24464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3924s(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24463h = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24462g = obj;
        this.f24464i |= LinearLayoutManager.INVALID_OFFSET;
        return C3922p.i(this.f24463h, null, this);
    }
}
