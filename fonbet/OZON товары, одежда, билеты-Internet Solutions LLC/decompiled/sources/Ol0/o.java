package Ol0;

import Je.InterfaceC3394a;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import dm0.C6222g;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.U;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Vl0.c f20501a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Pl0.l f20502b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Pl0.m f20503c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Za.d f20504d;

    /* renamed from: e, reason: collision with root package name */
    public volatile U<Rl0.a> f20505e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final Je.d f20506f;

    public o(@NotNull Vl0.c masterHostIPCClientsFactory, @NotNull Pl0.l getMasterHost, @NotNull Pl0.m clearMasterHost, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(masterHostIPCClientsFactory, "masterHostIPCClientsFactory");
        Intrinsics.checkNotNullParameter(getMasterHost, "getMasterHost");
        Intrinsics.checkNotNullParameter(clearMasterHost, "clearMasterHost");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f20501a = masterHostIPCClientsFactory;
        this.f20502b = getMasterHost;
        this.f20503c = clearMasterHost;
        this.f20504d = logger.c("IPCClientsDataSource");
        this.f20506f = Je.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        int i11;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f20510g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f20510g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = pVar.f20508e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f20510g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Pl0.l lVar = oVar.f20502b;
                    pVar.f20507d = oVar;
                    pVar.f20510g = 1;
                    obj = lVar.invoke(pVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = pVar.f20507d;
                    Sc.s.b(obj);
                }
                Za.a masterHost = (Za.a) obj;
                oVar.f20504d.info("Client works with host: " + masterHost.a());
                q onNoHostToBind = new q(oVar, null);
                Vl0.c cVar2 = oVar.f20501a;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(masterHost, "masterHost");
                Intrinsics.checkNotNullParameter(onNoHostToBind, "onNoHostToBind");
                List preferredHosts = C7714v.a0(masterHost);
                Vl0.a onNoHostToBind2 = new Vl0.a(onNoHostToBind, null);
                Context context = cVar2.f32826a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(preferredHosts, "preferredHosts");
                Za.d logger = cVar2.f32828c;
                Intrinsics.checkNotNullParameter(logger, "logger");
                Intrinsics.checkNotNullParameter(onNoHostToBind2, "onNoHostToBind");
                Kl0.l lVar2 = new Kl0.l(logger, context, preferredHosts, onNoHostToBind2);
                Vl0.b onNoHostToBind3 = new Vl0.b(onNoHostToBind, null);
                String projectId = cVar2.f32827b;
                Intrinsics.checkNotNullParameter(projectId, "projectId");
                Context context2 = cVar2.f32826a;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(preferredHosts, "preferredHosts");
                Za.d logger2 = cVar2.f32828c;
                Intrinsics.checkNotNullParameter(logger2, "logger");
                Intrinsics.checkNotNullParameter(onNoHostToBind3, "onNoHostToBind");
                return new Rl0.a(lVar2, new C6222g(projectId, context2, preferredHosts, logger2, onNoHostToBind3), null);
            }
        }
        pVar = new p(oVar, cVar);
        Object obj2 = pVar.f20508e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f20510g;
        if (i11 != 0) {
        }
        Za.a masterHost2 = (Za.a) obj2;
        oVar.f20504d.info("Client works with host: " + masterHost2.a());
        q onNoHostToBind4 = new q(oVar, null);
        Vl0.c cVar22 = oVar.f20501a;
        cVar22.getClass();
        Intrinsics.checkNotNullParameter(masterHost2, "masterHost");
        Intrinsics.checkNotNullParameter(onNoHostToBind4, "onNoHostToBind");
        List preferredHosts2 = C7714v.a0(masterHost2);
        Vl0.a onNoHostToBind22 = new Vl0.a(onNoHostToBind4, null);
        Context context3 = cVar22.f32826a;
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(preferredHosts2, "preferredHosts");
        Za.d logger3 = cVar22.f32828c;
        Intrinsics.checkNotNullParameter(logger3, "logger");
        Intrinsics.checkNotNullParameter(onNoHostToBind22, "onNoHostToBind");
        Kl0.l lVar22 = new Kl0.l(logger3, context3, preferredHosts2, onNoHostToBind22);
        Vl0.b onNoHostToBind32 = new Vl0.b(onNoHostToBind4, null);
        String projectId2 = cVar22.f32827b;
        Intrinsics.checkNotNullParameter(projectId2, "projectId");
        Context context22 = cVar22.f32826a;
        Intrinsics.checkNotNullParameter(context22, "context");
        Intrinsics.checkNotNullParameter(preferredHosts2, "preferredHosts");
        Za.d logger22 = cVar22.f32828c;
        Intrinsics.checkNotNullParameter(logger22, "logger");
        Intrinsics.checkNotNullParameter(onNoHostToBind32, "onNoHostToBind");
        return new Rl0.a(lVar22, new C6222g(projectId2, context22, preferredHosts2, logger22, onNoHostToBind32), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Je.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        Wc.a aVar;
        int i11;
        Je.d dVar;
        o oVar;
        InterfaceC3394a interfaceC3394a;
        Throwable th2;
        Pl0.m mVar;
        o oVar2;
        try {
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i12 = nVar.f20500h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    nVar.f20500h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = nVar.f20498f;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = nVar.f20500h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        dVar = this.f20506f;
                        nVar.f20496d = this;
                        nVar.f20497e = dVar;
                        nVar.f20500h = 1;
                        if (dVar.a(nVar) != aVar) {
                            oVar = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = nVar.f20497e;
                        oVar2 = nVar.f20496d;
                        try {
                            Sc.s.b(obj);
                            oVar2.f20505e = null;
                            Unit unit = Unit.f71690a;
                            interfaceC3394a.c(null);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC3394a.c(null);
                            throw th2;
                        }
                    }
                    ?? r22 = nVar.f20497e;
                    oVar = nVar.f20496d;
                    Sc.s.b(obj);
                    dVar = r22;
                    mVar = oVar.f20503c;
                    nVar.f20496d = oVar;
                    nVar.f20497e = dVar;
                    nVar.f20500h = 2;
                    if (mVar.invoke(nVar) != aVar) {
                        interfaceC3394a = dVar;
                        oVar2 = oVar;
                        oVar2.f20505e = null;
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit2;
                    }
                    return aVar;
                }
            }
            mVar = oVar.f20503c;
            nVar.f20496d = oVar;
            nVar.f20497e = dVar;
            nVar.f20500h = 2;
            if (mVar.invoke(nVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            interfaceC3394a = dVar;
            th2 = th4;
            interfaceC3394a.c(null);
            throw th2;
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f20498f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f20500h;
        if (i11 != 0) {
        }
    }
}
