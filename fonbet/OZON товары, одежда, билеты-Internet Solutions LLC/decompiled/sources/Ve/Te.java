package Ve;

import Sc.r;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import om0.C8755b;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* loaded from: classes6.dex */
public final class Te {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f30040g;

    /* renamed from: h, reason: collision with root package name */
    public static C4299he f30041h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f30042a;

    /* renamed from: b, reason: collision with root package name */
    public final C4248fl f30043b;

    /* renamed from: c, reason: collision with root package name */
    public final Vm f30044c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4436m7 f30045d;

    /* renamed from: e, reason: collision with root package name */
    public final C4515p f30046e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f30047f;

    public Te(Context context, C4248fl featuresHandler, Vm sPayDataContract, InterfaceC4436m7 userIdManager, C4515p clientProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(userIdManager, "userIdManager");
        Intrinsics.checkNotNullParameter(clientProvider, "clientProvider");
        this.f30042a = context;
        this.f30043b = featuresHandler;
        this.f30044c = sPayDataContract;
        this.f30045d = userIdManager;
        this.f30046e = clientProvider;
        this.f30047f = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0160 A[LOOP:0: B:19:0x0160->B:27:0x0160, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SPaySdkConfig sPaySdkConfig, Vg vg2, kotlin.coroutines.jvm.internal.c cVar) {
        C4559qe c4559qe;
        Object obj;
        Wc.a aVar;
        int i11;
        Te te2;
        Object obj2;
        String url;
        C4515p c4515p;
        Context context;
        String apiKey;
        Vm sPayDataContract;
        Object obj3;
        Vg networkClient;
        String clickStreamUrl;
        String clickStreamAppId;
        String stand;
        InterfaceC4765xk interfaceC4765xk;
        Object a11;
        if (cVar instanceof C4559qe) {
            c4559qe = (C4559qe) cVar;
            int i12 = c4559qe.f31867m;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4559qe.f31867m = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = c4559qe.f31865k;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4559qe.f31867m;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!Lf.a.r0(this.f30043b, EnumC4290h5.CLICKSTREAM_METRICS, null)) {
                        te2 = this;
                        f30040g = f30041h != null;
                        r.Companion companion = Sc.r.INSTANCE;
                        if (!te2.f30047f.isEmpty()) {
                        }
                        a11 = Unit.f71690a;
                        if (Sc.r.b(a11) != null) {
                        }
                        return Unit.f71690a;
                    }
                    Iterator<T> it = sPaySdkConfig.getSchemas().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        SPaySdkConfig.Schema schema = (SPaySdkConfig.Schema) obj2;
                        String m11 = (schema == null || (stand = schema.getStand()) == null) ? null : M1.b.m(stand);
                        if (m11 == null) {
                            m11 = "";
                        }
                        if (m11.equals(E.e())) {
                            break;
                        }
                    }
                    SPaySdkConfig.Schema schema2 = (SPaySdkConfig.Schema) obj2;
                    String m12 = (schema2 == null || (clickStreamAppId = schema2.getClickStreamAppId()) == null) ? null : M1.b.m(clickStreamAppId);
                    if (m12 == null) {
                        m12 = "";
                    }
                    url = (schema2 == null || (clickStreamUrl = schema2.getClickStreamUrl()) == null) ? null : M1.b.m(clickStreamUrl);
                    if (url == null) {
                        url = "";
                    }
                    c4559qe.f31858d = this;
                    c4559qe.f31859e = vg2;
                    C4515p c4515p2 = this.f30046e;
                    c4559qe.f31860f = c4515p2;
                    Context context2 = this.f30042a;
                    c4559qe.f31861g = context2;
                    c4559qe.f31862h = m12;
                    c4559qe.f31863i = url;
                    Vm vm = this.f30044c;
                    c4559qe.f31864j = vm;
                    c4559qe.f31867m = 1;
                    Object b11 = ((C4180da) this.f30045d).b(c4559qe);
                    if (b11 != aVar) {
                        c4515p = c4515p2;
                        context = context2;
                        apiKey = m12;
                        sPayDataContract = vm;
                        obj3 = b11;
                        networkClient = vg2;
                        te2 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC4765xk = (InterfaceC4765xk) c4559qe.f31859e;
                    te2 = c4559qe.f31858d;
                    Sc.s.b(obj);
                    String id2 = (String) obj;
                    C4299he c4299he = (C4299he) interfaceC4765xk;
                    c4299he.getClass();
                    Intrinsics.checkNotNullParameter(id2, "id");
                    c4299he.f31186c.b(id2);
                    f30040g = f30041h != null;
                    try {
                        r.Companion companion2 = Sc.r.INSTANCE;
                        if (!te2.f30047f.isEmpty()) {
                            while (true) {
                                LinkedList linkedList = te2.f30047f;
                                if (linkedList.isEmpty()) {
                                    break;
                                }
                                Bi event = (Bi) linkedList.pop();
                                C4299he c4299he2 = f30041h;
                                if (c4299he2 != null) {
                                    Intrinsics.checkNotNullExpressionValue(event, "event");
                                    c4299he2.a(event);
                                }
                            }
                        }
                        a11 = Unit.f71690a;
                    } catch (Throwable th2) {
                        r.Companion companion3 = Sc.r.INSTANCE;
                        a11 = Sc.s.a(th2);
                    }
                    if (Sc.r.b(a11) != null) {
                        Lm0.a.f17149a.i("Exception while sending inner analytics", new Object[0]);
                    }
                    return Unit.f71690a;
                }
                sPayDataContract = c4559qe.f31864j;
                String str = c4559qe.f31863i;
                String str2 = c4559qe.f31862h;
                Context context3 = c4559qe.f31861g;
                C4515p c4515p3 = c4559qe.f31860f;
                networkClient = (Vg) c4559qe.f31859e;
                Te te3 = c4559qe.f31858d;
                Sc.s.b(obj);
                url = str;
                te2 = te3;
                c4515p = c4515p3;
                context = context3;
                apiKey = str2;
                obj3 = obj;
                String userId = (String) obj3;
                c4515p.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(apiKey, "apiKey");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(networkClient, "networkClient");
                Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
                Intrinsics.checkNotNullParameter(userId, "userId");
                C4444mf c4444mf = new C4444mf(networkClient);
                C8755b.a aVar2 = new C8755b.a(context, apiKey, url);
                aVar2.b(c4444mf);
                C4299he c4299he3 = new C4299he(sPayDataContract, userId, aVar2.a());
                f30041h = c4299he3;
                InterfaceC4436m7 interfaceC4436m7 = te2.f30045d;
                c4559qe.f31858d = te2;
                c4559qe.f31859e = c4299he3;
                c4559qe.f31860f = null;
                c4559qe.f31861g = null;
                c4559qe.f31862h = null;
                c4559qe.f31863i = null;
                c4559qe.f31864j = null;
                c4559qe.f31867m = 2;
                obj = ((C4180da) interfaceC4436m7).b(c4559qe);
                if (obj != aVar) {
                    interfaceC4765xk = c4299he3;
                    String id22 = (String) obj;
                    C4299he c4299he4 = (C4299he) interfaceC4765xk;
                    c4299he4.getClass();
                    Intrinsics.checkNotNullParameter(id22, "id");
                    c4299he4.f31186c.b(id22);
                    f30040g = f30041h != null;
                    r.Companion companion22 = Sc.r.INSTANCE;
                    if (!te2.f30047f.isEmpty()) {
                    }
                    a11 = Unit.f71690a;
                    if (Sc.r.b(a11) != null) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        c4559qe = new C4559qe(this, cVar);
        obj = c4559qe.f31865k;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4559qe.f31867m;
        if (i11 != 0) {
        }
        String userId2 = (String) obj3;
        c4515p.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(userId2, "userId");
        C4444mf c4444mf2 = new C4444mf(networkClient);
        C8755b.a aVar22 = new C8755b.a(context, apiKey, url);
        aVar22.b(c4444mf2);
        C4299he c4299he32 = new C4299he(sPayDataContract, userId2, aVar22.a());
        f30041h = c4299he32;
        InterfaceC4436m7 interfaceC4436m72 = te2.f30045d;
        c4559qe.f31858d = te2;
        c4559qe.f31859e = c4299he32;
        c4559qe.f31860f = null;
        c4559qe.f31861g = null;
        c4559qe.f31862h = null;
        c4559qe.f31863i = null;
        c4559qe.f31864j = null;
        c4559qe.f31867m = 2;
        obj = ((C4180da) interfaceC4436m72).b(c4559qe);
        if (obj != aVar) {
        }
        return aVar;
    }

    public final void b(Bi analyticMetric) {
        Intrinsics.checkNotNullParameter(analyticMetric, "analyticMetric");
        if (!f30040g) {
            this.f30047f.add(analyticMetric);
            return;
        }
        C4299he c4299he = f30041h;
        if (c4299he != null) {
            c4299he.a(analyticMetric);
        }
    }
}
