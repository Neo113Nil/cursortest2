package Ve;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* renamed from: Ve.hp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4310hp extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31212d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4310hp(int i11) {
        super(2, null);
        this.f31212d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31212d) {
            case 0:
                C4310hp c4310hp = new C4310hp(2, 0, dVar);
                c4310hp.f31213e = obj;
                return c4310hp;
            case 1:
                C4310hp c4310hp2 = new C4310hp(2, 1, dVar);
                c4310hp2.f31213e = obj;
                return c4310hp2;
            default:
                return new C4310hp((C4592rj) this.f31213e, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31212d) {
            case 0:
                C4310hp c4310hp = new C4310hp(2, 0, (kotlin.coroutines.d) obj2);
                c4310hp.f31213e = (OrderScreenDataResponse) obj;
                return c4310hp.invokeSuspend(Unit.f71690a);
            case 1:
                C4310hp c4310hp2 = new C4310hp(2, 1, (kotlin.coroutines.d) obj2);
                c4310hp2.f31213e = (List) obj;
                return c4310hp2.invokeSuspend(Unit.f71690a);
            default:
                return new C4310hp((C4592rj) this.f31213e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31212d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f31213e;
                if (orderScreenDataResponse != null) {
                    return orderScreenDataResponse.getListOfCardsResponseBody();
                }
                return null;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                List list = (List) this.f31213e;
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += ((C4287h2) it.next()).f31135b;
                }
                return new Long(j11);
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                C4592rj c4592rj = (C4592rj) this.f31213e;
                c4592rj.f31980d = new C4417lh(c4592rj);
                NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(2).build();
                Object systemService = androidx.core.content.a.getSystemService(c4592rj.requireContext(), ConnectivityManager.class);
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                C4417lh c4417lh = c4592rj.f31980d;
                if (c4417lh != null) {
                    connectivityManager.requestNetwork(build, c4417lh);
                    return Unit.f71690a;
                }
                Intrinsics.n("networkCallback");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4310hp(int i11, int i12, kotlin.coroutines.d dVar) {
        super(i11, dVar);
        this.f31212d = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4310hp(C4592rj c4592rj, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31212d = 2;
        this.f31213e = c4592rj;
    }
}
