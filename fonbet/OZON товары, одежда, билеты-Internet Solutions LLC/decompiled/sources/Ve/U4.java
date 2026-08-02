package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* loaded from: classes10.dex */
public final class U4 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f30097d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f30099f;

    /* renamed from: g, reason: collision with root package name */
    public int f30100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f30099f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f30098e = obj;
        this.f30100g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f30099f.a((SpasiboBonusesRequestBody) null, this);
    }
}
