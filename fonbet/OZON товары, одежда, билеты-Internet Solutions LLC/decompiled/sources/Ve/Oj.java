package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Oj extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f29631d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f29633f;

    /* renamed from: g, reason: collision with root package name */
    public int f29634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oj(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29633f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29632e = obj;
        this.f29634g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29633f.w(null, this);
    }
}
