package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.tl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4652tl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4744x f32119d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4744x f32121f;

    /* renamed from: g, reason: collision with root package name */
    public int f32122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4652tl(C4744x c4744x, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32121f = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32120e = obj;
        this.f32122g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32121f.j0(this);
    }
}
