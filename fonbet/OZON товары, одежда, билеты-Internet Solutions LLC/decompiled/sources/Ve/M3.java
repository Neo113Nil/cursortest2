package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class M3 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4577r4 f29454d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4577r4 f29456f;

    /* renamed from: g, reason: collision with root package name */
    public int f29457g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(C4577r4 c4577r4, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29456f = c4577r4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29455e = obj;
        this.f29457g |= LinearLayoutManager.INVALID_OFFSET;
        return C4577r4.g0(this.f29456f, this);
    }
}
