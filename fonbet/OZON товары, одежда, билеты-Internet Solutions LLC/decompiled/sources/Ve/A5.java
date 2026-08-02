package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PayBindingRequestBody;

/* loaded from: classes10.dex */
public final class A5 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f28577d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f28579f;

    /* renamed from: g, reason: collision with root package name */
    public int f28580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28579f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28578e = obj;
        this.f28580g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28579f.a((PayBindingRequestBody) null, this);
    }
}
