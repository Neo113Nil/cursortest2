package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;

/* renamed from: Ve.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4772y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f32518d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f32520f;

    /* renamed from: g, reason: collision with root package name */
    public int f32521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4772y(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32520f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32519e = obj;
        this.f32521g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32520f.a((PaymentBnplPlanRequestBody) null, this);
    }
}
