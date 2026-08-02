package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: Ve.il, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4334il extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f31313d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31314e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f31315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Il f31316g;

    /* renamed from: h, reason: collision with root package name */
    public int f31317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4334il(Il il, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31316g = il;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31315f = obj;
        this.f31317h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31316g.a(null, this);
    }
}
