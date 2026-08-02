package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Oe extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4588rf f29612d;

    /* renamed from: e, reason: collision with root package name */
    public Object f29613e;

    /* renamed from: f, reason: collision with root package name */
    public String f29614f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f29615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4588rf f29616h;

    /* renamed from: i, reason: collision with root package name */
    public int f29617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oe(C4588rf c4588rf, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29616h = c4588rf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29615g = obj;
        this.f29617i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29616h.a(null, null, this);
    }
}
