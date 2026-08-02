package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
/* renamed from: R2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3931z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f24492d;

    /* renamed from: e, reason: collision with root package name */
    Object f24493e;

    /* renamed from: f, reason: collision with root package name */
    Serializable f24494f;

    /* renamed from: g, reason: collision with root package name */
    kotlin.jvm.internal.M f24495g;

    /* renamed from: h, reason: collision with root package name */
    boolean f24496h;

    /* renamed from: i, reason: collision with root package name */
    int f24497i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f24498j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24499k;

    /* renamed from: l, reason: collision with root package name */
    int f24500l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3931z(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24499k = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24498j = obj;
        this.f24500l |= LinearLayoutManager.INVALID_OFFSET;
        return C3922p.n(this.f24499k, false, this);
    }
}
