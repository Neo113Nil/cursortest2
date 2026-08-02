package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.PayOnlineRequestBody;

/* renamed from: Ve.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4256g0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f31067d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f31069f;

    /* renamed from: g, reason: collision with root package name */
    public int f31070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4256g0(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31069f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31068e = obj;
        this.f31070g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31069f.a((PayOnlineRequestBody) null, this);
    }
}
