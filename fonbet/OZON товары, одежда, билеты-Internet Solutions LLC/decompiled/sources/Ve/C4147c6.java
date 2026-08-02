package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PayBindingRequestBody;

/* renamed from: Ve.c6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4147c6 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f30780d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f30782f;

    /* renamed from: g, reason: collision with root package name */
    public int f30783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4147c6(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30782f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30781e = obj;
        this.f30783g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30782f.b((PayBindingRequestBody) null, this);
    }
}
