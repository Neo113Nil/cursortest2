package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public final class Ep extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public String f28946d;

    /* renamed from: e, reason: collision with root package name */
    public String f28947e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.d f28949g;

    /* renamed from: h, reason: collision with root package name */
    public int f28950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ep(spay.sdk.d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28949g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28948f = obj;
        this.f28950h |= LinearLayoutManager.INVALID_OFFSET;
        return spay.sdk.d.a(this.f28949g, null, null, this);
    }
}
