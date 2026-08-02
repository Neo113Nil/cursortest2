package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;

/* loaded from: classes10.dex */
public final class Mr extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f29504d;

    /* renamed from: e, reason: collision with root package name */
    public ListOfCardsRequestBody f29505e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f29507g;

    /* renamed from: h, reason: collision with root package name */
    public int f29508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mr(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29507g = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29506f = obj;
        this.f29508h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29507g.b((ListOfCardsRequestBody) null, this);
    }
}
