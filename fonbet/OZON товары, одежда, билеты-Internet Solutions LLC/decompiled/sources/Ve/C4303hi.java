package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.hi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4303hi extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f31197e;

    /* renamed from: f, reason: collision with root package name */
    public int f31198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4303hi(C4744x c4744x, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31197e = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31196d = obj;
        this.f31198f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31197e.g0(this);
    }
}
