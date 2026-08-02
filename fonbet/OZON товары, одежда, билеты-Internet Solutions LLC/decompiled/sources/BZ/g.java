package BZ;

import androidx.fragment.app.ComponentCallbacksC5392m;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements xZ.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f3334b;

    public /* synthetic */ g(Object obj, Serializable serializable) {
        this.f3333a = obj;
        this.f3334b = serializable;
    }

    public void a(io.reactivex.i iVar) {
        OzonWebSocketImpl.getSocketFlowable$lambda$3((OzonWebSocketImpl) this.f3333a, (AtomicLong) this.f3334b, iVar);
    }

    @Override // xZ.i
    public ComponentCallbacksC5392m create() {
        ComponentCallbacksC5392m onCreate$lambda$0;
        onCreate$lambda$0 = h.onCreate$lambda$0((h) this.f3333a, (String) this.f3334b);
        return onCreate$lambda$0;
    }
}
