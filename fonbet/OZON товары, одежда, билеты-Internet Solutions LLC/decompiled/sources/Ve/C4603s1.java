package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;

/* renamed from: Ve.s1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4603s1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f31996d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f31998f;

    /* renamed from: g, reason: collision with root package name */
    public int f31999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4603s1(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31998f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31997e = obj;
        this.f31999g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31998f.a((PaymentOrderRequestBody) null, this);
    }
}
