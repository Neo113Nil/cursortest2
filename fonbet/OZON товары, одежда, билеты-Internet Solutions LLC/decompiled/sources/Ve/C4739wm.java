package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.wm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4739wm extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4712vn f32383e;

    /* renamed from: f, reason: collision with root package name */
    public int f32384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4739wm(C4712vn c4712vn, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32383e = c4712vn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32382d = obj;
        this.f32384f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32383e.a(this);
    }
}
