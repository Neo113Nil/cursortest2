package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class J0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29254d;

    /* renamed from: e, reason: collision with root package name */
    public int f29255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4488o1 f29256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C4488o1 c4488o1, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f29256f = c4488o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29254d = obj;
        this.f29255e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29256f.emit(null, this);
    }
}
