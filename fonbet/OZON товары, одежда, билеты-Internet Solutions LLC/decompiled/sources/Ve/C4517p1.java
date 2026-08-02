package Ve;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.p1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4517p1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H3 f31754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4517p1(H3 h32, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31754d = h32;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4517p1(this.f31754d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4517p1(this.f31754d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        H3 h32 = this.f31754d;
        h32.f29115e = new W1(h32);
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(2).build();
        Object systemService = androidx.core.content.a.getSystemService(h32.requireContext(), ConnectivityManager.class);
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        W1 w12 = h32.f29115e;
        if (w12 != null) {
            connectivityManager.requestNetwork(build, w12);
            return Unit.f71690a;
        }
        Intrinsics.n("networkCallback");
        throw null;
    }
}
