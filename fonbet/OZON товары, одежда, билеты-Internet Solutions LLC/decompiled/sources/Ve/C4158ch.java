package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.ch, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4158ch extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4744x f30804d;

    /* renamed from: e, reason: collision with root package name */
    public Object f30805e;

    /* renamed from: f, reason: collision with root package name */
    public T8 f30806f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f30807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4744x f30808h;

    /* renamed from: i, reason: collision with root package name */
    public int f30809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4158ch(C4744x c4744x, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30808h = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30807g = obj;
        this.f30809i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30808h.f0(null, null, null, this);
    }
}
