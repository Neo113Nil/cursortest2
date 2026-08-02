package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;

/* loaded from: classes10.dex */
public final class Wo extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f30298d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f30300f;

    /* renamed from: g, reason: collision with root package name */
    public int f30301g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wo(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30300f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30299e = obj;
        this.f30301g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30300f.a((ConfirmBindingOtpRequestBody) null, this);
    }
}
