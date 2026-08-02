package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.xm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4767xm extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f32495d;

    /* renamed from: e, reason: collision with root package name */
    public Object f32496e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f32497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Zm f32498g;

    /* renamed from: h, reason: collision with root package name */
    public int f32499h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4767xm(Zm zm, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32498g = zm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32497f = obj;
        this.f32499h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32498g.d(null, null, this);
    }
}
