package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.db, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4181db extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f30864d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30865e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f30866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4710vl f30867g;

    /* renamed from: h, reason: collision with root package name */
    public int f30868h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4181db(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30867g = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30866f = obj;
        this.f30868h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30867g.j(null, false, this);
    }
}
