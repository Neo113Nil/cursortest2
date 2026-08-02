package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.ir, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4340ir extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4744x f31324d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4744x f31326f;

    /* renamed from: g, reason: collision with root package name */
    public int f31327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4340ir(C4744x c4744x, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31326f = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31325e = obj;
        this.f31327g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31326f.l0(null, this);
    }
}
