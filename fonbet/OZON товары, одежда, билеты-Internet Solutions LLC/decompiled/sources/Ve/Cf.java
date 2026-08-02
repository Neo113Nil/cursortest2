package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;

/* loaded from: classes10.dex */
public final class Cf extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f28759d;

    /* renamed from: e, reason: collision with root package name */
    public ListOfCardsRequestBody f28760e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4710vl f28762g;

    /* renamed from: h, reason: collision with root package name */
    public int f28763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cf(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28762g = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28761f = obj;
        this.f28763h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28762g.v(null, this);
    }
}
