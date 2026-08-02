package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;

/* loaded from: classes10.dex */
public final class Z1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f30529d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f30531f;

    /* renamed from: g, reason: collision with root package name */
    public int f30532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30531f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30530e = obj;
        this.f30532g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30531f.b((PaymentBnplPlanRequestBody) null, this);
    }
}
