package Kl0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.auth.AuthIPCClientImpl", f = "AuthIPCClientImpl.kt", l = {48}, m = "isUserAuthorized-IoAF18A")
/* loaded from: classes4.dex */
public final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f16016e;

    /* renamed from: f, reason: collision with root package name */
    public int f16017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f16016e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f16015d = obj;
        this.f16017f |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f16016e.a(this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}
