package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.df, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4185df extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f30874d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f30876f;

    /* renamed from: g, reason: collision with root package name */
    public int f30877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4185df(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30876f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30875e = obj;
        this.f30877g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30876f.n(null, this);
    }
}
