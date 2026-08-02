package Zl0;

import Zl0.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.push.common.messaging.RemoteMessage;
import fm0.InterfaceC6586g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;
import ze.EnumC11113a;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C11115c f36037d = ze.k.a(-2, 4, EnumC11113a.SUSPEND);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final k f36038a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f36039b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Za.d f36040c;

    public f(@NotNull k serviceStarter, @NotNull InterfaceC6586g pushStorage, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(serviceStarter, "serviceStarter");
        Intrinsics.checkNotNullParameter(pushStorage, "pushStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f36038a = serviceStarter;
        this.f36039b = pushStorage;
        this.f36040c = logger.c("ClientServiceDataDispatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull RemoteMessage remoteMessage, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        f fVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f36024g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f36024g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f36022e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f36024g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    s.a aVar2 = new s.a(remoteMessage);
                    this.f36040c.info("Trying to send new push message event to channel");
                    C11115c c11115c = f36037d;
                    bVar.f36021d = this;
                    bVar.f36024g = 1;
                    if (c11115c.n(aVar2, bVar) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = bVar.f36021d;
                    Sc.s.b(obj);
                }
                fVar.f36040c.info("Event with new push message has been sent to channel");
                fVar.f36038a.a();
                return Unit.f71690a;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f36022e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f36024g;
        if (i11 != 0) {
        }
        fVar.f36040c.info("Event with new push message has been sent to channel");
        fVar.f36038a.a();
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        f fVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f36028g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f36028g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f36026e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f36028g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    s.b bVar = new s.b(str);
                    this.f36040c.info("Trying to send new push token event to channel");
                    C11115c c11115c = f36037d;
                    cVar2.f36025d = this;
                    cVar2.f36028g = 1;
                    if (c11115c.n(bVar, cVar2) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = cVar2.f36025d;
                    Sc.s.b(obj);
                }
                fVar.f36040c.info("Event with new push token has been sent to channel");
                fVar.f36038a.a();
                return Unit.f71690a;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f36026e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f36028g;
        if (i11 != 0) {
        }
        fVar.f36040c.info("Event with new push token has been sent to channel");
        fVar.f36038a.a();
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        f fVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f36036g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f36036g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f36034e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f36036g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    s.d dVar = new s.d(list);
                    this.f36040c.info("Trying to send error message event to channel");
                    C11115c c11115c = f36037d;
                    eVar.f36033d = this;
                    eVar.f36036g = 1;
                    if (c11115c.n(dVar, eVar) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f36033d;
                    Sc.s.b(obj);
                }
                fVar.f36040c.info("Event with error message has been sent to channel");
                fVar.f36038a.a();
                return Unit.f71690a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f36034e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f36036g;
        if (i11 != 0) {
        }
        fVar.f36040c.info("Event with error message has been sent to channel");
        fVar.f36038a.a();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r4.b(r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        f fVar;
        String str;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f36020h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f36020h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f36018f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f36020h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    this.f36040c.info("Checking for undelivered push tokens");
                    aVar.f36016d = this;
                    aVar.f36020h = 1;
                    obj = this.f36039b.a(aVar);
                    if (obj != aVar2) {
                        fVar = this;
                    }
                    return aVar2;
                }
                if (i11 == 1) {
                    f fVar2 = aVar.f36016d;
                    Sc.s.b(obj);
                    fVar = fVar2;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    str = aVar.f36017e;
                    fVar = aVar.f36016d;
                    Sc.s.b(obj);
                    String str2 = (String) obj;
                    if (str == null || kotlin.text.h.K(str) || str.equals(str2)) {
                        return Unit.f71690a;
                    }
                    fVar.f36040c.info("Found undelivered token, sending it to service");
                    aVar.f36016d = null;
                    aVar.f36017e = null;
                    aVar.f36020h = 3;
                }
                str = (String) obj;
                InterfaceC6586g interfaceC6586g = fVar.f36039b;
                aVar.f36016d = fVar;
                aVar.f36017e = str;
                aVar.f36020h = 2;
                obj = interfaceC6586g.f(aVar);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f36018f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f36020h;
        if (i11 != 0) {
        }
        str = (String) obj2;
        InterfaceC6586g interfaceC6586g2 = fVar.f36039b;
        aVar.f36016d = fVar;
        aVar.f36017e = str;
        aVar.f36020h = 2;
        obj2 = interfaceC6586g2.f(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        f fVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f36032g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f36032g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f36030e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f36032g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    s.c cVar2 = s.c.f36103a;
                    this.f36040c.info("Trying to send on delete messages event to channel");
                    C11115c c11115c = f36037d;
                    dVar.f36029d = this;
                    dVar.f36032g = 1;
                    if (c11115c.n(cVar2, dVar) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = dVar.f36029d;
                    Sc.s.b(obj);
                }
                fVar.f36040c.info("Event with on delete messages has been sent to channel");
                fVar.f36038a.a();
                return Unit.f71690a;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f36030e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f36032g;
        if (i11 != 0) {
        }
        fVar.f36040c.info("Event with on delete messages has been sent to channel");
        fVar.f36038a.a();
        return Unit.f71690a;
    }
}
