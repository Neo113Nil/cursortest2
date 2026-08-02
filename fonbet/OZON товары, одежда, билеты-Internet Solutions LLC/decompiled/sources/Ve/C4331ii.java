package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.ii, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4331ii extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f31303d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f31305f;

    /* renamed from: g, reason: collision with root package name */
    public int f31306g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331ii(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31305f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31304e = obj;
        this.f31306g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31305f.t(null, this);
    }
}
