package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;

/* loaded from: classes10.dex */
public final class Fq extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f29024d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f29026f;

    /* renamed from: g, reason: collision with root package name */
    public int f29027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fq(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f29026f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f29025e = obj;
        this.f29027g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f29026f.a((CreateOtpSdkRequestBody) null, this);
    }
}
