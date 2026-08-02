package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Kh extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f29354d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f29356f;

    /* renamed from: g, reason: collision with root package name */
    public int f29357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kh(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29356f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29355e = obj;
        this.f29357g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29356f.s(null, this);
    }
}
