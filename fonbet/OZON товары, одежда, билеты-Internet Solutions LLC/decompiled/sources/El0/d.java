package El0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {91, 95, 98}, m = "registerForPushes")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public a f8050d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f8052f;

    /* renamed from: g, reason: collision with root package name */
    public int f8053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f8052f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f8051e = obj;
        this.f8053g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f8052f.e(this);
    }
}
