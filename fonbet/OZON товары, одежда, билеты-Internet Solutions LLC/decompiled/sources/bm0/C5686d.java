package bm0;

import Sc.r;
import We.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.VkpnsPusherApi", f = "VkpnsPusherApi.kt", l = {101, 102}, m = "deletePushToken-gIAlu-s")
/* renamed from: bm0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5686d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public L f56110d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f56111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f56112f;

    /* renamed from: g, reason: collision with root package name */
    public int f56113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5686d(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f56112f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56111e = obj;
        this.f56113g |= LinearLayoutManager.INVALID_OFFSET;
        Object b11 = this.f56112f.b(null, this);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : r.a(b11);
    }
}
