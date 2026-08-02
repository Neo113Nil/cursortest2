package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Qf extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4503og f29778e;

    /* renamed from: f, reason: collision with root package name */
    public int f29779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qf(C4503og c4503og, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29778e = c4503og;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29777d = obj;
        this.f29779f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29778e.a(this);
    }
}
