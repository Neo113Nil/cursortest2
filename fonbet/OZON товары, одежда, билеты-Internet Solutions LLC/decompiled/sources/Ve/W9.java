package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class W9 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f30251d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f30253f;

    /* renamed from: g, reason: collision with root package name */
    public int f30254g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30253f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30252e = obj;
        this.f30254g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30253f.h(null, this);
    }
}
