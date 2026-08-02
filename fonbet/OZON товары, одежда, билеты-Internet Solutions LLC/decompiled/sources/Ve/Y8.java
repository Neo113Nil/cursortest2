package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Y8 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public String f30443d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4180da f30445f;

    /* renamed from: g, reason: collision with root package name */
    public int f30446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(C4180da c4180da, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30445f = c4180da;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30444e = obj;
        this.f30446g |= LinearLayoutManager.INVALID_OFFSET;
        return C4180da.a(this.f30445f, this);
    }
}
