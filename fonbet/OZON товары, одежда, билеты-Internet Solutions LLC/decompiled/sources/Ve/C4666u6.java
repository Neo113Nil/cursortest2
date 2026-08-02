package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.u6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4666u6 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32182d;

    /* renamed from: e, reason: collision with root package name */
    public int f32183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X6 f32184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4666u6(X6 x62, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f32184f = x62;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32182d = obj;
        this.f32183e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32184f.emit(null, this);
    }
}
