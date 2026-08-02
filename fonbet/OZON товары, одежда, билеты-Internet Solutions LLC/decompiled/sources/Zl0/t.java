package Zl0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import qb.C9017a;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ValidateCallingHostInteractor", f = "ValidateCallingHostInteractor.kt", l = {17}, m = "invoke-gIAlu-s")
/* loaded from: classes4.dex */
public final class t extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public C9017a f36105d;

    /* renamed from: e, reason: collision with root package name */
    public u f36106e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f36108g;

    /* renamed from: h, reason: collision with root package name */
    public int f36109h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36108g = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36107f = obj;
        this.f36109h |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f36108g.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
