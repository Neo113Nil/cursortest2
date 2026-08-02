package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class E7 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Qd f28909d;

    /* renamed from: e, reason: collision with root package name */
    public xe.I f28910e;

    /* renamed from: f, reason: collision with root package name */
    public C4442md f28911f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f28912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4442md f28913h;

    /* renamed from: i, reason: collision with root package name */
    public int f28914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E7(C4442md c4442md, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28913h = c4442md;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28912g = obj;
        this.f28914i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28913h.c(null, null, this);
    }
}
