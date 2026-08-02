package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class D6 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f28834d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f28836f;

    /* renamed from: g, reason: collision with root package name */
    public int f28837g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28836f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28835e = obj;
        this.f28837g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28836f.a(this);
    }
}
