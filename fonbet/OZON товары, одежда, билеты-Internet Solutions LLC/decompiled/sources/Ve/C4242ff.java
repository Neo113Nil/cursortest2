package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.ff, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4242ff extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Ef f31031d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ef f31033f;

    /* renamed from: g, reason: collision with root package name */
    public int f31034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4242ff(Ef ef2, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31033f = ef2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31032e = obj;
        this.f31034g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31033f.a(null, this);
    }
}
