package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Jm extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4365jn f29306e;

    /* renamed from: f, reason: collision with root package name */
    public int f29307f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jm(C4365jn c4365jn, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29306e = c4365jn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29305d = obj;
        this.f29307f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29306e.a(null, null, null, this);
    }
}
