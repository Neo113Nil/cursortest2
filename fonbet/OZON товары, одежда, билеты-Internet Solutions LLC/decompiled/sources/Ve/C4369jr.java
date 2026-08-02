package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.BindingV3SessionIdRequestBody;

/* renamed from: Ve.jr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4369jr extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f31401d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f31403f;

    /* renamed from: g, reason: collision with root package name */
    public int f31404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4369jr(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31403f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31402e = obj;
        this.f31404g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31403f.a((BindingV3SessionIdRequestBody) null, this);
    }
}
