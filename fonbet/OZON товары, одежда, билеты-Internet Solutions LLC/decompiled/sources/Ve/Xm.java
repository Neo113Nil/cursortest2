package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Xm extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4712vn f30407d;

    /* renamed from: e, reason: collision with root package name */
    public Tq f30408e;

    /* renamed from: f, reason: collision with root package name */
    public C4712vn f30409f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f30410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4712vn f30411h;

    /* renamed from: i, reason: collision with root package name */
    public int f30412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xm(C4712vn c4712vn, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30411h = c4712vn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30410g = obj;
        this.f30412i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30411h.b(this);
    }
}
