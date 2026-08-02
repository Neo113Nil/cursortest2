package bm0;

import Sc.r;
import We.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.VkpnsPusherApi", f = "VkpnsPusherApi.kt", l = {101, 102}, m = "getNewPushToken-0E7RQCE")
/* renamed from: bm0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5688f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public h f56115d;

    /* renamed from: e, reason: collision with root package name */
    public L f56116e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f56117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f56118g;

    /* renamed from: h, reason: collision with root package name */
    public int f56119h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5688f(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f56118g = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56117f = obj;
        this.f56119h |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f56118g.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}
