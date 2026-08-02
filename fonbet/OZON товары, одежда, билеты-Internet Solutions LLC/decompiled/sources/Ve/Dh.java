package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Dh extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28865d;

    /* renamed from: e, reason: collision with root package name */
    public int f28866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4488o1 f28867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dh(C4488o1 c4488o1, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f28867f = c4488o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28865d = obj;
        this.f28866e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28867f.emit(null, this);
    }
}
