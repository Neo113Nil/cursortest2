package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;

/* renamed from: Ve.fq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4253fq extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C4234f7 f31059d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4234f7 f31061f;

    /* renamed from: g, reason: collision with root package name */
    public int f31062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4253fq(C4234f7 c4234f7, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f31061f = c4234f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f31060e = obj;
        this.f31062g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31061f.a((CreateBindingOtpRequestBody) null, this);
    }
}
