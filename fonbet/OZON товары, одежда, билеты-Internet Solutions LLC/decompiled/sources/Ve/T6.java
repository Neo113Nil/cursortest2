package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class T6 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4667u7 f30024e;

    /* renamed from: f, reason: collision with root package name */
    public int f30025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T6(C4667u7 c4667u7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30024e = c4667u7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30023d = obj;
        this.f30025f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30024e.e0(this);
    }
}
