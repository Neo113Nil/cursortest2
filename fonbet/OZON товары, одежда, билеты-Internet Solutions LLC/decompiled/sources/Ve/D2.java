package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;

/* loaded from: classes10.dex */
public final class D2 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f28815d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f28817f;

    /* renamed from: g, reason: collision with root package name */
    public int f28818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28817f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28816e = obj;
        this.f28818g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28817f.a((PaymentTokenRequestBody) null, this);
    }
}
