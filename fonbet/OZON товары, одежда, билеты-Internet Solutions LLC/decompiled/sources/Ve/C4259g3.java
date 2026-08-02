package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.g3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4259g3 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f31073d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f31075f;

    /* renamed from: g, reason: collision with root package name */
    public int f31076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4259g3(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31075f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31074e = obj;
        this.f31076g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31075f.a(null, null, this);
    }
}
