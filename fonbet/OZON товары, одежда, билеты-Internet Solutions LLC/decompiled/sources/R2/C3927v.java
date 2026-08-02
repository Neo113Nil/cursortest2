package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
/* renamed from: R2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3927v extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3922p f24473d;

    /* renamed from: e, reason: collision with root package name */
    int f24474e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24475f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24476g;

    /* renamed from: h, reason: collision with root package name */
    int f24477h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3927v(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24476g = c3922p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object r11;
        this.f24475f = obj;
        this.f24477h |= LinearLayoutManager.INVALID_OFFSET;
        r11 = this.f24476g.r(this);
        return r11;
    }
}
