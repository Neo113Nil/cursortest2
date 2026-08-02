package El0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {132, 133}, m = "onPushTokenRefreshed-Du7M8sQ")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public a f8045d;

    /* renamed from: e, reason: collision with root package name */
    public String f8046e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f8048g;

    /* renamed from: h, reason: collision with root package name */
    public int f8049h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8048g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8047f = obj;
        this.f8049h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8048g.a(null, this);
    }
}
