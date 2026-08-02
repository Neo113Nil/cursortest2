package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Mi extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4593rk f29478e;

    /* renamed from: f, reason: collision with root package name */
    public int f29479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mi(C4593rk c4593rk, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29478e = c4593rk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29477d = obj;
        this.f29479f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29478e.a(null, this);
    }
}
