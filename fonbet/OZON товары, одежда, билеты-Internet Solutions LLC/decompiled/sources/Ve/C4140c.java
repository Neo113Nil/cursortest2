package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4140c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30759d;

    /* renamed from: e, reason: collision with root package name */
    public int f30760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f30761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140c(J j11, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f30761f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30759d = obj;
        this.f30760e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30761f.emit(null, this);
    }
}
