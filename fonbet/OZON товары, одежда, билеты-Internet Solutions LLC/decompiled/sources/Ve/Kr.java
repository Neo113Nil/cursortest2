package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Kr extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29373d;

    /* renamed from: e, reason: collision with root package name */
    public int f29374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4659u f29375f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kr(C4659u c4659u, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f29375f = c4659u;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29373d = obj;
        this.f29374e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29375f.emit(null, this);
    }
}
