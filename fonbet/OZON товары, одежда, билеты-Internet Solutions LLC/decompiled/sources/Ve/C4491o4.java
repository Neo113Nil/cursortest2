package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;

/* renamed from: Ve.o4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4491o4 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f31703d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f31705f;

    /* renamed from: g, reason: collision with root package name */
    public int f31706g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4491o4(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31705f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31704e = obj;
        this.f31706g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31705f.a((BindingSessionIdRequestBody) null, this);
    }
}
