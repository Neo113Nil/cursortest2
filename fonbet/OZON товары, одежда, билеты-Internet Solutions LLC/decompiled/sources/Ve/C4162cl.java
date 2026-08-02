package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.cl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4162cl extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4249fm f30819d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4249fm f30821f;

    /* renamed from: g, reason: collision with root package name */
    public int f30822g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4162cl(C4249fm c4249fm, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30821f = c4249fm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30820e = obj;
        this.f30822g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30821f.e(this);
    }
}
