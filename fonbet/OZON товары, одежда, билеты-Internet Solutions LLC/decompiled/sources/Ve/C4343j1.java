package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.j1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4343j1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public sf.F f31334d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q1 f31336f;

    /* renamed from: g, reason: collision with root package name */
    public int f31337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4343j1(Q1 q12, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31336f = q12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31335e = obj;
        this.f31337g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31336f.b(null, null, this);
    }
}
