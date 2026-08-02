package El0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {137, 148}, m = "registerPushToken-Du7M8sQ")
/* loaded from: classes4.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public a f8054d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8055e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f8057g;

    /* renamed from: h, reason: collision with root package name */
    public int f8058h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8057g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8056f = obj;
        this.f8058h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8057g.d(null, this);
    }
}
