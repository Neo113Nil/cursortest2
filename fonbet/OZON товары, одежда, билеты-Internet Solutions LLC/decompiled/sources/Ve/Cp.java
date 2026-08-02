package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;

/* loaded from: classes10.dex */
public final class Cp extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f28783d;

    /* renamed from: e, reason: collision with root package name */
    public ConfirmOtpRequestBody f28784e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f28786g;

    /* renamed from: h, reason: collision with root package name */
    public int f28787h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cp(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28786g = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28785f = obj;
        this.f28787h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28786g.a((ConfirmOtpRequestBody) null, this);
    }
}
