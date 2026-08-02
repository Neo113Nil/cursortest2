package Ul0;

import Zl0.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService", f = "RuStoreMessagingService.kt", l = {132, 135}, m = "handleNewPushTokenEvent")
/* loaded from: classes4.dex */
final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    a f27851d;

    /* renamed from: e, reason: collision with root package name */
    s.b f27852e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f27853f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ a f27854g;

    /* renamed from: h, reason: collision with root package name */
    int f27855h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, c cVar) {
        super(cVar);
        this.f27854g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        this.f27853f = obj;
        this.f27855h |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f27854g.f(null, this);
        return f7;
    }
}
