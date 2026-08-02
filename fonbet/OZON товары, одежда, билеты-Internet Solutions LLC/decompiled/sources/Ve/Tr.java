package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Tr extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Je.d f30080d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U0 f30082f;

    /* renamed from: g, reason: collision with root package name */
    public int f30083g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tr(U0 u02, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30082f = u02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30081e = obj;
        this.f30083g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30082f.b(this);
    }
}
