package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class E0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public sf.G f28891d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q1 f28893f;

    /* renamed from: g, reason: collision with root package name */
    public int f28894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(Q1 q12, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28893f = q12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28892e = obj;
        this.f28894g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28893f.a(null, this);
    }
}
