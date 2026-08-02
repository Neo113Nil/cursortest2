package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Ba extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f28684d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f28686f;

    /* renamed from: g, reason: collision with root package name */
    public int f28687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28686f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28685e = obj;
        this.f28687g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28686f.i(null, this);
    }
}
