package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Ji extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f29294d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f29296f;

    /* renamed from: g, reason: collision with root package name */
    public int f29297g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ji(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29296f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29295e = obj;
        this.f29297g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29296f.u(null, this);
    }
}
