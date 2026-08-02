package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;

/* loaded from: classes10.dex */
public final class N0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f29510d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f29512f;

    /* renamed from: g, reason: collision with root package name */
    public int f29513g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29512f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29511e = obj;
        this.f29513g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29512f.a((ListOfCardsRequestBody) null, this);
    }
}
