package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.b7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4119b7 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4442md f30713d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4442md f30715f;

    /* renamed from: g, reason: collision with root package name */
    public int f30716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4119b7(C4442md c4442md, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30715f = c4442md;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30714e = obj;
        this.f30716g |= LinearLayoutManager.INVALID_OFFSET;
        return C4442md.b(this.f30715f, null, null, this);
    }
}
