package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Cg extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f28764d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f28766f;

    /* renamed from: g, reason: collision with root package name */
    public int f28767g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cg(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28766f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28765e = obj;
        this.f28767g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28766f.p(null, this);
    }
}
