package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.c2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4143c2 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4577r4 f30767d;

    /* renamed from: e, reason: collision with root package name */
    public Object f30768e;

    /* renamed from: f, reason: collision with root package name */
    public C4577r4 f30769f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f30770g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4577r4 f30771h;

    /* renamed from: i, reason: collision with root package name */
    public int f30772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4143c2(C4577r4 c4577r4, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30771h = c4577r4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30770g = obj;
        this.f30772i |= LinearLayoutManager.INVALID_OFFSET;
        return C4577r4.e0(this.f30771h, null, this);
    }
}
