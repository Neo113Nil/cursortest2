package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* loaded from: classes10.dex */
public final class Ag extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4744x f28608d;

    /* renamed from: e, reason: collision with root package name */
    public SessionIdResponseBody f28609e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28610f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f28611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4744x f28612h;

    /* renamed from: i, reason: collision with root package name */
    public int f28613i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ag(C4744x c4744x, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f28612h = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f28611g = obj;
        this.f28613i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f28612h.h0(null, this);
    }
}
