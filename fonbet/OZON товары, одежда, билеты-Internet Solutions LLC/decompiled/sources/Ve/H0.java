package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class H0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29098d;

    /* renamed from: e, reason: collision with root package name */
    public int f29099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4430m1 f29100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(C4430m1 c4430m1, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f29100f = c4430m1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29098d = obj;
        this.f29099e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29100f.emit(null, this);
    }
}
