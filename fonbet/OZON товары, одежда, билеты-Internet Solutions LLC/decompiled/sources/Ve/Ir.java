package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Ir extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29249d;

    /* renamed from: e, reason: collision with root package name */
    public int f29250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4601s f29251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ir(C4601s c4601s, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f29251f = c4601s;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29249d = obj;
        this.f29250e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29251f.emit(null, this);
    }
}
