package Jd0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.utils.NetworkUtilsKt", f = "NetworkUtils.kt", l = {11}, m = "safeCall")
/* loaded from: classes3.dex */
final class d<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f14623d;

    /* renamed from: e, reason: collision with root package name */
    int f14624e;

    d(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f14623d = obj;
        this.f14624e |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = c.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}
