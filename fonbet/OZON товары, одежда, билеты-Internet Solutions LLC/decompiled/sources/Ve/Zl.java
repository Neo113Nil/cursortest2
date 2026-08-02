package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Zl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30609d;

    /* renamed from: e, reason: collision with root package name */
    public int f30610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4389ki f30611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C4389ki c4389ki, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30611f = c4389ki;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30609d = obj;
        this.f30610e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30611f.emit(null, this);
    }
}
