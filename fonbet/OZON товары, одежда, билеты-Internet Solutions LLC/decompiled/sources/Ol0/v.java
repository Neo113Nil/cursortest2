package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.RegisterPushTokenDataSource", f = "RegisterPushTokenDataSource.kt", l = {10, 11}, m = "registerForPushes-gIAlu-s")
/* loaded from: classes4.dex */
public final class v extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public String f20527d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f20529f;

    /* renamed from: g, reason: collision with root package name */
    public int f20530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20529f = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20528e = obj;
        this.f20530g |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f20529f.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Sc.r.a(a11);
    }
}
