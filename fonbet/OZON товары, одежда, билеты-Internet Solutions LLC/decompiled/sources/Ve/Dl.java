package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Dl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4249fm f28875d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4249fm f28877f;

    /* renamed from: g, reason: collision with root package name */
    public int f28878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dl(C4249fm c4249fm, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28877f = c4249fm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28876e = obj;
        this.f28878g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28877f.d(null, this);
    }
}
