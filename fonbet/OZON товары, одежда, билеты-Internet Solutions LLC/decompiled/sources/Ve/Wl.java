package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Wl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f30291d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Zm f30293f;

    /* renamed from: g, reason: collision with root package name */
    public int f30294g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wl(Zm zm, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30293f = zm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30292e = obj;
        this.f30294g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30293f.c(null, this);
    }
}
