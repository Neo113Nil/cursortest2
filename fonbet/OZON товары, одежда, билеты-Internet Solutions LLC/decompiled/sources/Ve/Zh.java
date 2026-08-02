package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Zh extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4819zi f30597d;

    /* renamed from: e, reason: collision with root package name */
    public We.L f30598e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f30599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4819zi f30600g;

    /* renamed from: h, reason: collision with root package name */
    public int f30601h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zh(C4819zi c4819zi, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30600g = c4819zi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30599f = obj;
        this.f30601h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30600g.c(null, this);
    }
}
