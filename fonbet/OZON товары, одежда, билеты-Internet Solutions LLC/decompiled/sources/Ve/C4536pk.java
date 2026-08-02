package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.pk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4536pk extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4710vl f31806e;

    /* renamed from: f, reason: collision with root package name */
    public int f31807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4536pk(C4710vl c4710vl, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f31806e = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31805d = obj;
        this.f31807f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31806e.q(null, this);
    }
}
