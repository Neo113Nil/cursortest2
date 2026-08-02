package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.ze, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4815ze extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f32649d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4710vl f32651f;

    /* renamed from: g, reason: collision with root package name */
    public int f32652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4815ze(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32651f = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32650e = obj;
        this.f32652g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32651f.x(null, this);
    }
}
