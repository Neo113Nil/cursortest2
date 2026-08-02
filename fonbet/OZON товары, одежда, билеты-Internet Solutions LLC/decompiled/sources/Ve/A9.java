package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class A9 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4180da f28591e;

    /* renamed from: f, reason: collision with root package name */
    public int f28592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9(C4180da c4180da, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28591e = c4180da;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28590d = obj;
        this.f28592f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28591e.b(this);
    }
}
