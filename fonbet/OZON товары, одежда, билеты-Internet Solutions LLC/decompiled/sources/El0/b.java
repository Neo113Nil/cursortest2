package El0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {103}, m = "getToken")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public a f8041d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f8043f;

    /* renamed from: g, reason: collision with root package name */
    public int f8044g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8043f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8042e = obj;
        this.f8044g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8043f.b(this);
    }
}
