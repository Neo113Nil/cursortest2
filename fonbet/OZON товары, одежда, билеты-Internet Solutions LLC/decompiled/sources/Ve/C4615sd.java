package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;

/* renamed from: Ve.sd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4615sd extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4710vl f32042d;

    /* renamed from: e, reason: collision with root package name */
    public ListOfCardsRequestBody f32043e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f32044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4710vl f32045g;

    /* renamed from: h, reason: collision with root package name */
    public int f32046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4615sd(C4710vl c4710vl, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32045g = c4710vl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32044f = obj;
        this.f32046h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32045g.l(null, this);
    }
}
