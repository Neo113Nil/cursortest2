package El0;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm0.InterfaceC5683a;
import cb.C5796a;
import cm0.C5842a;
import com.vk.push.core.push.RegisterForPushesResult;
import em0.C6382a;
import fm0.InterfaceC6586g;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yl0.C10923h;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pl0.c f8031a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5683a f8032b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f8033c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Yl0.c f8034d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Yl0.d f8035e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final Yl0.l f8036f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final Yl0.n f8037g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final LinkedList f8038h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final Za.d f8039i;

    /* renamed from: El0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0179a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8040a;

        static {
            int[] iArr = new int[RegisterForPushesResult.values().length];
            try {
                iArr[RegisterForPushesResult.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegisterForPushesResult.ALREADY_REGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8040a = iArr;
        }
    }

    public a(@NotNull Pl0.c ipcClientsInitializer, @NotNull InterfaceC5683a pushTokenRepository, @NotNull InterfaceC6586g storage, @NotNull Yl0.c deletePushTokenIfExistsUseCase, @NotNull Yl0.d getClientIdUseCase, @NotNull Yl0.l registerPushTokenUseCase, @NotNull Yl0.n sendPushTokenToClientIfNeedUseCase) {
        Za.d logger = Pl0.d.f22647a;
        Intrinsics.checkNotNullParameter(ipcClientsInitializer, "ipcClientsInitializer");
        Intrinsics.checkNotNullParameter(pushTokenRepository, "pushTokenRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(deletePushTokenIfExistsUseCase, "deletePushTokenIfExistsUseCase");
        Intrinsics.checkNotNullParameter(getClientIdUseCase, "getClientIdUseCase");
        Intrinsics.checkNotNullParameter(registerPushTokenUseCase, "registerPushTokenUseCase");
        Intrinsics.checkNotNullParameter(sendPushTokenToClientIfNeedUseCase, "sendPushTokenToClientIfNeedUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f8031a = ipcClientsInitializer;
        this.f8032b = pushTokenRepository;
        this.f8033c = storage;
        this.f8034d = deletePushTokenIfExistsUseCase;
        this.f8035e = getClientIdUseCase;
        this.f8036f = registerPushTokenUseCase;
        this.f8037g = sendPushTokenToClientIfNeedUseCase;
        this.f8038h = new LinkedList();
        this.f8039i = logger.c("SubscribeComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r2.d(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        a aVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f8049h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f8049h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f8047f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f8049h;
                if (i11 != 0) {
                    s.b(obj);
                    this.f8039i.info("Saving new push token to the storage");
                    cVar2.f8045d = this;
                    cVar2.f8046e = str;
                    cVar2.f8049h = 1;
                    if (this.f8033c.g(str, cVar2) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                str = cVar2.f8046e;
                aVar = cVar2.f8045d;
                s.b(obj);
                cVar2.f8045d = null;
                cVar2.f8046e = null;
                cVar2.f8049h = 2;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f8047f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f8049h;
        if (i11 != 0) {
        }
        cVar2.f8045d = null;
        cVar2.f8046e = null;
        cVar2.f8049h = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        a aVar;
        String str;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f8044g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f8044g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f8042e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f8044g;
                if (i11 != 0) {
                    s.b(obj);
                    this.f8039i.info("Get current push token");
                    bVar.f8041d = this;
                    bVar.f8044g = 1;
                    obj = this.f8033c.a(bVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = bVar.f8041d;
                    s.b(obj);
                }
                str = (String) obj;
                if (str == null && !kotlin.text.h.K(str)) {
                    return str;
                }
                aVar.f8039i.b("No saved push token found", null);
                return str;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f8042e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f8044g;
        if (i11 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        aVar.f8039i.b("No saved push token found", null);
        return str;
    }

    public final void c(Throwable th2) {
        Unit unit;
        synchronized (this.f8038h) {
            do {
                try {
                    C10923h.a aVar = (C10923h.a) this.f8038h.poll();
                    if (aVar != null) {
                        aVar.a(th2);
                        unit = Unit.f71690a;
                    } else {
                        unit = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } while (unit != null);
            Unit unit2 = Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        if (r2.f8037g.a(r12, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        String str2;
        Object obj;
        a aVar;
        a aVar2;
        Throwable b11;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f8058h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f8058h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = eVar.f8056f;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f8058h;
                if (i11 != 0) {
                    s.b(obj2);
                    eVar.f8054d = this;
                    eVar.f8055e = str;
                    eVar.f8058h = 1;
                    Object a11 = this.f8036f.a(str, eVar);
                    if (a11 != aVar3) {
                        str2 = str;
                        obj = a11;
                        aVar = this;
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = eVar.f8055e;
                    aVar2 = eVar.f8054d;
                    s.b(obj2);
                    b11 = r.b(obj);
                    if (b11 != null) {
                        aVar2.f8039i.error("Register for pushes has failed", b11);
                    }
                    return Unit.f71690a;
                }
                String str3 = (String) eVar.f8055e;
                aVar = eVar.f8054d;
                s.b(obj2);
                Object f26106a = ((r) obj2).getF26106a();
                str2 = str3;
                obj = f26106a;
                r.Companion companion = r.INSTANCE;
                if (!(obj instanceof r.b)) {
                    C6382a c6382a = (C6382a) obj;
                    aVar.f8039i.info("Register for pushes completed, result = " + c6382a.f62393a);
                    int i13 = C0179a.f8040a[c6382a.f62393a.ordinal()];
                    Za.d dVar = aVar.f8039i;
                    if (i13 == 1) {
                        dVar.info("Register for pushes successful, host = " + c6382a.f62394b.a());
                    } else if (i13 == 2) {
                        dVar.info("Result is already registered");
                    }
                    eVar.f8054d = aVar;
                    eVar.f8055e = obj;
                    eVar.f8058h = 2;
                }
                aVar2 = aVar;
                b11 = r.b(obj);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        eVar = new e(this, cVar);
        Object obj22 = eVar.f8056f;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f8058h;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        if (!(obj instanceof r.b)) {
        }
        aVar2 = aVar;
        b11 = r.b(obj);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r2.f(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r2.d(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        Object b11;
        a aVar;
        String str;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f8053g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f8053g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f8051e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f8053g;
                if (i11 != 0) {
                    s.b(obj);
                    this.f8039i.info("Calling register for pushes");
                    dVar.f8050d = this;
                    dVar.f8053g = 1;
                    b11 = this.f8033c.b(dVar);
                    if (b11 != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                aVar = dVar.f8050d;
                s.b(obj);
                b11 = ((C5842a) obj).f57211a;
                str = (String) b11;
                if (kotlin.text.h.K(str)) {
                    dVar.f8050d = null;
                    dVar.f8053g = 3;
                } else {
                    aVar.f8039i.b("No saved push token found.", null);
                    C10923h c10923h = new C10923h(0);
                    C10923h.a aVar3 = (C10923h.a) new Pair(c10923h, new C10923h.a()).b();
                    dVar.f8050d = null;
                    dVar.f8053g = 2;
                }
                return aVar2;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f8051e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f8053g;
        if (i11 != 0) {
        }
        str = (String) b11;
        if (kotlin.text.h.K(str)) {
        }
        return aVar22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|137|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00cb, code lost:
    
        if (r9 == r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x013a, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x013b, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00bc A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0172 A[EXC_TOP_SPLITTER, LOOP:0: B:18:0x0172->B:31:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c A[Catch: Exception -> 0x013a, TryCatch #5 {Exception -> 0x013a, blocks: (B:48:0x003a, B:49:0x0126, B:51:0x012c, B:54:0x0133, B:56:0x0137, B:60:0x0143, B:63:0x014a, B:69:0x0190, B:71:0x0196, B:72:0x019d, B:78:0x010f, B:85:0x0058, B:101:0x0067, B:102:0x00be, B:105:0x006d, B:106:0x00af), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196 A[Catch: Exception -> 0x013a, TryCatch #5 {Exception -> 0x013a, blocks: (B:48:0x003a, B:49:0x0126, B:51:0x012c, B:54:0x0133, B:56:0x0137, B:60:0x0143, B:63:0x014a, B:69:0x0190, B:71:0x0196, B:72:0x019d, B:78:0x010f, B:85:0x0058, B:101:0x0067, B:102:0x00be, B:105:0x006d, B:106:0x00af), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull C10923h.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        Exception e11;
        a aVar2;
        String message;
        a aVar3;
        a aVar4;
        Object b11;
        Object obj;
        a aVar5;
        Object obj2;
        Object a11;
        Throwable b12;
        String str;
        Unit unit;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f8063h;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f8063h = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj3 = fVar.f8061f;
                Wc.a aVar6 = Wc.a.COROUTINE_SUSPENDED;
                switch (fVar.f8063h) {
                    case 0:
                        s.b(obj3);
                        this.f8039i.info("Full re-subscription has been requested");
                        synchronized (this.f8038h) {
                            if (!this.f8038h.isEmpty()) {
                                this.f8038h.add(aVar);
                                this.f8039i.info("Re-subscription is in progress already");
                                return Unit.f71690a;
                            }
                            this.f8038h.add(aVar);
                            try {
                                Yl0.c cVar2 = this.f8034d;
                                try {
                                    fVar.f8059d = this;
                                    fVar.f8063h = 1;
                                    if (cVar2.a(true, fVar) != aVar6) {
                                        aVar4 = this;
                                        Pl0.c cVar3 = aVar4.f8031a;
                                        fVar.f8059d = aVar4;
                                        fVar.f8063h = 2;
                                        obj3 = cVar3.invoke(fVar);
                                        if (obj3 == aVar6) {
                                        }
                                        Kl0.a aVar7 = ((Rl0.b) obj3).f25164a;
                                        fVar.f8059d = aVar4;
                                        fVar.f8063h = 3;
                                        b11 = aVar7.b(fVar);
                                        break;
                                    }
                                    return aVar6;
                                } catch (Exception e12) {
                                    e = e12;
                                    aVar3 = this;
                                    aVar2 = aVar3;
                                    e11 = e;
                                    aVar2.f8039i.error("Re-subscription failed: ", e11);
                                    message = e11.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    aVar2.c(new Throwable(message));
                                    return Unit.f71690a;
                                }
                            } catch (Exception e13) {
                                e = e13;
                            }
                        }
                    case 1:
                        aVar4 = fVar.f8059d;
                        s.b(obj3);
                        Pl0.c cVar32 = aVar4.f8031a;
                        fVar.f8059d = aVar4;
                        fVar.f8063h = 2;
                        obj3 = cVar32.invoke(fVar);
                        if (obj3 == aVar6) {
                        }
                        Kl0.a aVar72 = ((Rl0.b) obj3).f25164a;
                        fVar.f8059d = aVar4;
                        fVar.f8063h = 3;
                        b11 = aVar72.b(fVar);
                        break;
                    case 2:
                        aVar4 = fVar.f8059d;
                        s.b(obj3);
                        Kl0.a aVar722 = ((Rl0.b) obj3).f25164a;
                        fVar.f8059d = aVar4;
                        fVar.f8063h = 3;
                        b11 = aVar722.b(fVar);
                        break;
                    case 3:
                        aVar4 = fVar.f8059d;
                        s.b(obj3);
                        b11 = ((r) obj3).getF26106a();
                        Object obj4 = b11;
                        a aVar8 = aVar4;
                        try {
                        } catch (Exception e14) {
                            e11 = e14;
                            aVar2 = aVar8;
                            aVar2.f8039i.error("Re-subscription failed: ", e11);
                            message = e11.getMessage();
                            if (message == null) {
                            }
                            aVar2.c(new Throwable(message));
                            return Unit.f71690a;
                        }
                        if (!Eb.j.a(obj4)) {
                            Throwable b13 = r.b(obj4);
                            if (b13 == null) {
                                b13 = new RuntimeException("Auth token error");
                            }
                            aVar8.f8039i.b("Auth token error", b13);
                            aVar8.c(b13);
                            return Unit.f71690a;
                        }
                        aVar8.f8039i.info("Auth token has been obtained");
                        Yl0.d dVar = aVar8.f8035e;
                        fVar.f8059d = aVar8;
                        fVar.f8060e = obj4;
                        fVar.f8063h = 4;
                        Ol0.k kVar = dVar.f35156a.f19637a;
                        if (aVar6 != null) {
                            obj = obj4;
                            aVar5 = aVar8;
                            obj2 = null;
                            InterfaceC5683a interfaceC5683a = aVar5.f8032b;
                            s.b(obj);
                            fVar.f8059d = aVar5;
                            fVar.f8060e = null;
                            fVar.f8063h = 5;
                            a11 = interfaceC5683a.a((String) obj, (C5796a) obj2, fVar);
                            if (a11 == aVar6) {
                            }
                            r.Companion companion = r.INSTANCE;
                            if (!(a11 instanceof r.b)) {
                                C5842a c5842a = (C5842a) (a11 instanceof r.b ? null : a11);
                                String str2 = c5842a != null ? c5842a.f57211a : null;
                                if (str2 == null) {
                                    str2 = null;
                                }
                                if (str2 != null && !kotlin.text.h.K(str2)) {
                                    aVar5.f8039i.info("Push token has been obtained");
                                    s.b(a11);
                                    String str3 = ((C5842a) a11).f57211a;
                                    fVar.f8059d = aVar5;
                                    fVar.f8060e = str3;
                                    fVar.f8063h = 6;
                                    if (aVar5.a(str3, fVar) != aVar6) {
                                        aVar2 = aVar5;
                                        str = str3;
                                        try {
                                            aVar2.f8039i.info("Re-subscription has successfully completed");
                                            synchronized (aVar2.f8038h) {
                                                do {
                                                    try {
                                                        C10923h.a aVar9 = (C10923h.a) aVar2.f8038h.poll();
                                                        if (aVar9 != null) {
                                                            aVar9.b(str);
                                                            unit = Unit.f71690a;
                                                        } else {
                                                            unit = null;
                                                        }
                                                    } finally {
                                                    }
                                                } while (unit != null);
                                                Unit unit2 = Unit.f71690a;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            aVar3 = aVar2;
                                            aVar2 = aVar3;
                                            e11 = e;
                                            aVar2.f8039i.error("Re-subscription failed: ", e11);
                                            message = e11.getMessage();
                                            if (message == null) {
                                            }
                                            aVar2.c(new Throwable(message));
                                            return Unit.f71690a;
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                            }
                            b12 = r.b(a11);
                            if (b12 == null) {
                                b12 = new RuntimeException("Push token is empty");
                            }
                            aVar5.f8039i.b("Push token error", b12);
                            aVar5.c(b12);
                            return Unit.f71690a;
                        }
                        return aVar6;
                    case 4:
                        Object obj5 = fVar.f8060e;
                        a aVar10 = fVar.f8059d;
                        try {
                            s.b(obj3);
                            obj = obj5;
                            aVar5 = aVar10;
                            obj2 = obj3;
                            InterfaceC5683a interfaceC5683a2 = aVar5.f8032b;
                            s.b(obj);
                            fVar.f8059d = aVar5;
                            fVar.f8060e = null;
                            fVar.f8063h = 5;
                            a11 = interfaceC5683a2.a((String) obj, (C5796a) obj2, fVar);
                            if (a11 == aVar6) {
                            }
                            r.Companion companion2 = r.INSTANCE;
                            if (!(a11 instanceof r.b)) {
                            }
                            b12 = r.b(a11);
                            if (b12 == null) {
                            }
                            aVar5.f8039i.b("Push token error", b12);
                            aVar5.c(b12);
                            return Unit.f71690a;
                        } catch (Exception e16) {
                            e11 = e16;
                            aVar2 = aVar10;
                            aVar2.f8039i.error("Re-subscription failed: ", e11);
                            message = e11.getMessage();
                            if (message == null) {
                            }
                            aVar2.c(new Throwable(message));
                            return Unit.f71690a;
                        }
                    case 5:
                        aVar5 = fVar.f8059d;
                        s.b(obj3);
                        a11 = ((r) obj3).getF26106a();
                        r.Companion companion22 = r.INSTANCE;
                        if (!(a11 instanceof r.b)) {
                        }
                        b12 = r.b(a11);
                        if (b12 == null) {
                        }
                        aVar5.f8039i.b("Push token error", b12);
                        aVar5.c(b12);
                        return Unit.f71690a;
                    case 6:
                        str = (String) fVar.f8060e;
                        aVar2 = fVar.f8059d;
                        try {
                            s.b(obj3);
                            aVar2.f8039i.info("Re-subscription has successfully completed");
                            synchronized (aVar2.f8038h) {
                            }
                        } catch (Exception e17) {
                            e11 = e17;
                            aVar2.f8039i.error("Re-subscription failed: ", e11);
                            message = e11.getMessage();
                            if (message == null) {
                            }
                            aVar2.c(new Throwable(message));
                            return Unit.f71690a;
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fVar = new f(this, cVar);
        Object obj32 = fVar.f8061f;
        Wc.a aVar62 = Wc.a.COROUTINE_SUSPENDED;
        switch (fVar.f8063h) {
        }
    }
}
