package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Rk extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f29863d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f29865f;

    /* renamed from: g, reason: collision with root package name */
    public int f29866g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rk(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29865f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29864e = obj;
        this.f29866g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29865f.e(this);
    }
}
