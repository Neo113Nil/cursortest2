package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Ff extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4186dg f29002e;

    /* renamed from: f, reason: collision with root package name */
    public int f29003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ff(C4186dg c4186dg, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29002e = c4186dg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29001d = obj;
        this.f29003f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29002e.a(this);
    }
}
