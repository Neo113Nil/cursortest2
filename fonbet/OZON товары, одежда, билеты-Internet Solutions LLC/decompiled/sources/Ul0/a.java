package Ul0;

import De.C2862e;
import El0.n;
import Pl0.h;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import Zl0.i;
import Zl0.l;
import Zl0.m;
import Zl0.r;
import Zl0.s;
import Zl0.u;
import am0.C5033a;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import bb.InterfaceC5614a;
import com.vk.push.common.messaging.RemoteMessage;
import fm0.InterfaceC6586g;
import ib.C7039b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUl0/a;", "Landroid/app/Service;", "", "<init>", "()V", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes8.dex */
public class a extends Service {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27834h = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27835a = k.b(b.f27843b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27836b = k.b(C0566a.f27842b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27837c = k.b(g.f27850b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f27838d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Zl0.g> f27839e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<l> f27840f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Za.d> f27841g;

    /* renamed from: Ul0.a$a, reason: collision with other inner class name */
    public static final class C0566a extends AbstractC7737t implements Function0<InterfaceC5614a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0566a f27842b = new C0566a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC5614a invoke() {
            h.f22655a.getClass();
            return h.b();
        }
    }

    public static final class b extends AbstractC7737t implements Function0<Zl0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27843b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Zl0.f invoke() {
            h.f22655a.getClass();
            return (Zl0.f) h.f22663i.getValue();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<Zl0.g> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Zl0.g invoke() {
            Za.d dVar = Pl0.f.f22652a;
            Za.d logger = a.this.e();
            Intrinsics.checkNotNullParameter(logger, "logger");
            u a11 = Pl0.f.a();
            h.f22655a.getClass();
            return new i(a11, (Zl0.f) h.f22663i.getValue(), (El0.a) Pl0.d.f22648b.getValue(), (InterfaceC6586g) h.f22659e.getValue(), logger);
        }
    }

    public static final class d extends AbstractC7737t implements Function0<Za.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f27845b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Za.d invoke() {
            Intrinsics.checkNotNullParameter("VkpnsMessagingService", "tag");
            n nVar = Pl0.e.f22651b;
            return (nVar != null ? nVar.f8117c : new Za.b("VkpnsClientSdk")).c("VkpnsMessagingService");
        }
    }

    public static final class e extends AbstractC7737t implements Function0<l> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f27846b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final l invoke() {
            Za.d logger = Pl0.f.f22652a;
            Intrinsics.checkNotNullParameter(logger, "logger");
            h.f22655a.getClass();
            Zl0.f fVar = (Zl0.f) h.f22663i.getValue();
            u a11 = Pl0.f.a();
            Context applicationContext = Pl0.e.a().f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            n nVar = Pl0.e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext2 = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "vkpnsPushConfig.application.applicationContext");
            am0.f fVar2 = new am0.f(applicationContext2);
            n nVar2 = Pl0.e.f22651b;
            if (nVar2 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext3 = nVar2.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "vkpnsPushConfig.application.applicationContext");
            return new m(fVar, a11, new am0.e(applicationContext, fVar2, new C5033a(applicationContext3), nb.d.a(), h.b()), (InterfaceC6586g) h.f22659e.getValue(), h.b(), (Ll0.b) Pl0.a.f22641a.getValue());
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService$onCreate$1", f = "RuStoreMessagingService.kt", l = {86, 88}, m = "invokeSuspend")
    public static final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        ze.j f27847d;

        /* renamed from: e, reason: collision with root package name */
        int f27848e;

        public f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
        
            if (Ul0.a.d(r2, r9, r8) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
        
            if (r9 == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0068 -> B:6:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ze.j it;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27848e;
            a aVar2 = a.this;
            if (i11 == 0) {
                s.b(obj);
                a.a(aVar2).getClass();
                it = Zl0.f.f36037d.iterator();
            } else if (i11 == 1) {
                it = this.f27847d;
                s.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f71690a;
                }
                Zl0.s sVar = (Zl0.s) it.next();
                aVar2.e().info("Received event from channel: ".concat(sVar.getClass().getSimpleName()));
                this.f27847d = it;
                this.f27848e = 2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f27847d;
                s.b(obj);
            }
            this.f27847d = it;
            this.f27848e = 1;
            obj = it.b(this);
        }
    }

    public static final class g extends AbstractC7737t implements Function0<InterfaceC6586g> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f27850b = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC6586g invoke() {
            h.f22655a.getClass();
            return (InterfaceC6586g) h.f22659e.getValue();
        }
    }

    public a() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f27838d = N.a(He.b.f10879b);
        this.f27839e = k.b(new c());
        this.f27840f = k.b(e.f27846b);
        this.f27841g = k.b(d.f27845b);
    }

    public static final Zl0.f a(a aVar) {
        return (Zl0.f) aVar.f27835a.getValue();
    }

    public static final Object d(a aVar, Zl0.s sVar, kotlin.coroutines.d dVar) {
        if (sVar instanceof s.b) {
            Object f7 = aVar.f((s.b) sVar, (kotlin.coroutines.jvm.internal.c) dVar);
            return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
        }
        if (sVar instanceof s.a) {
            aVar.e().info("Sending message to client via onMessageReceived method");
            RemoteMessage remoteMessage = ((s.a) sVar).f36101a;
            ((InterfaceC5614a) aVar.f27836b.getValue()).a(C7039b.a.a(remoteMessage.i(), System.currentTimeMillis()));
            Intrinsics.checkNotNullParameter(remoteMessage, "<this>");
            String f11 = remoteMessage.f();
            remoteMessage.h();
            remoteMessage.l();
            String e11 = remoteMessage.e();
            remoteMessage.c();
            Map<String, String> d11 = remoteMessage.d();
            remoteMessage.j();
            RemoteMessage.b g10 = remoteMessage.g();
            if (g10 != null) {
                remoteMessage.b();
                Intrinsics.checkNotNullParameter(g10, "<this>");
                g10.f();
            }
            aVar.h(new Tl0.a(f11, e11, d11));
            aVar.e().info("Sending message successful");
        } else if (sVar instanceof s.c) {
            aVar.e().info("Sending on delete messages to client via onDeleteMessages method");
            aVar.g();
            aVar.e().info("Sending on delete messages successful");
        } else if (sVar instanceof s.d) {
            aVar.e().info("Sending error to client via onError method");
            List<Sl0.a> errors = ((s.d) sVar).f36104a;
            Intrinsics.checkNotNullParameter(errors, "errors");
            aVar.e().info("Sending error messages successful");
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Za.d e() {
        return this.f27841g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        Ul0.b bVar2;
        Object obj;
        int i11;
        a aVar;
        a aVar2;
        if (cVar instanceof Ul0.b) {
            bVar2 = (Ul0.b) cVar;
            int i12 = bVar2.f27855h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar2.f27855h = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = bVar2.f27853f;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar2.f27855h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    e().info("Sending token to client via onNewToken method");
                    InterfaceC6586g interfaceC6586g = (InterfaceC6586g) this.f27837c.getValue();
                    bVar2.f27851d = this;
                    bVar2.f27852e = bVar;
                    bVar2.f27855h = 1;
                    obj = interfaceC6586g.f(bVar2);
                    if (obj != aVar3) {
                        aVar = this;
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = bVar2.f27851d;
                    Sc.s.b(obj);
                    aVar2.e().info("Sending token successful");
                    return Unit.f71690a;
                }
                bVar = bVar2.f27852e;
                aVar = bVar2.f27851d;
                Sc.s.b(obj);
                if (!Intrinsics.d((String) obj, bVar.f36102a)) {
                    aVar.e().b("This token has already been sent to client earlier", null);
                    return Unit.f71690a;
                }
                String str = bVar.f36102a;
                aVar.i(str);
                InterfaceC6586g interfaceC6586g2 = (InterfaceC6586g) aVar.f27837c.getValue();
                bVar2.f27851d = aVar;
                bVar2.f27852e = null;
                bVar2.f27855h = 2;
                if (interfaceC6586g2.a(str, bVar2) != aVar3) {
                    aVar2 = aVar;
                    aVar2.e().info("Sending token successful");
                    return Unit.f71690a;
                }
                return aVar3;
            }
        }
        bVar2 = new Ul0.b(this, cVar);
        obj = bVar2.f27853f;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar2.f27855h;
        if (i11 != 0) {
        }
        if (!Intrinsics.d((String) obj, bVar.f36102a)) {
        }
    }

    public void g() {
    }

    public void h(@NotNull Tl0.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public void i(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // android.app.Service
    @NotNull
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new r(this.f27840f, this.f27839e, this.f27841g);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!Dl0.a.d()) {
            Log.w("VkpnsMessagingService", "Client SDK is not initialized, did you call init method in your Application class?");
        } else {
            C10727i.c(this.f27838d, null, null, new f(null), 3);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (Dl0.a.d()) {
            e().info("Service is destroying");
            N.c(this.f27838d, null);
            this.f27839e.getValue().onDestroy();
            this.f27840f.getValue().onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        return 1;
    }
}
