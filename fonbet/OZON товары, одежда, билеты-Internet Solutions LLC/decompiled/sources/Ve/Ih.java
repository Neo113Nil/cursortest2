package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Ih extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4744x f29234d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4744x f29236f;

    /* renamed from: g, reason: collision with root package name */
    public int f29237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ih(C4744x c4744x, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29236f = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29235e = obj;
        this.f29237g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29236f.k0(null, this);
    }
}
