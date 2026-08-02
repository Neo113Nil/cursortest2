package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Nc extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f29550d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f29552f;

    /* renamed from: g, reason: collision with root package name */
    public int f29553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nc(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29552f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29551e = obj;
        this.f29553g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29552f.o(null, this);
    }
}
