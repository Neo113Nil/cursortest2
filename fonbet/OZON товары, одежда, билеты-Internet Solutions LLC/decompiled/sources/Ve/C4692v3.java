package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.v3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4692v3 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y3 f32256e;

    /* renamed from: f, reason: collision with root package name */
    public int f32257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4692v3(Y3 y32, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32256e = y32;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32255d = obj;
        this.f32257f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32256e.e0(this);
    }
}
