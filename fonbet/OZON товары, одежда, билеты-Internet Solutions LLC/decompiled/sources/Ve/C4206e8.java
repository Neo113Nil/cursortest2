package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.e8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4206e8 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30915d;

    /* renamed from: e, reason: collision with root package name */
    public int f30916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H8 f30917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4206e8(H8 h82, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30917f = h82;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30915d = obj;
        this.f30916e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30917f.emit(null, this);
    }
}
