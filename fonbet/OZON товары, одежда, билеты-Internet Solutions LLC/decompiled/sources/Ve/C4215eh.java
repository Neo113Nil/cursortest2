package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.eh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4215eh extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f30929d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f30931f;

    /* renamed from: g, reason: collision with root package name */
    public int f30932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4215eh(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30931f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30930e = obj;
        this.f30932g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30931f.r(null, this);
    }
}
