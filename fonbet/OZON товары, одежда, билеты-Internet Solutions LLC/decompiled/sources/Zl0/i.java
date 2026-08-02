package Zl0;

import De.C2862e;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.InvalidateTokenResult;
import com.vk.push.core.push.IsPushTokenExistResult;
import com.vk.push.core.push.OnDeleteMessagesResult;
import fm0.InterfaceC6586g;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;
import org.jetbrains.annotations.NotNull;
import qb.C9017a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import yl0.C10923h;

/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final u f36044a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f36045b;

    /* renamed from: c, reason: collision with root package name */
    public final El0.a f36046c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f36047d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Za.d f36048e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final C2862e f36049f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$isPushTokenExist$1", f = "ClientServiceInteractorImpl.kt", l = {100, 101}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public i f36050d;

        /* renamed from: e, reason: collision with root package name */
        public String f36051e;

        /* renamed from: f, reason: collision with root package name */
        public int f36052f;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C9017a f36054h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ InterfaceC7913b f36055i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f36056j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9017a c9017a, InterfaceC7913b interfaceC7913b, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f36054h = c9017a;
            this.f36055i = interfaceC7913b;
            this.f36056j = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(this.f36054h, this.f36055i, this.f36056j, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(9:5|6|(1:21)(1:10)|11|12|13|14|15|16)(2:22|23))(1:24))(1:31)|25|(3:27|(5:30|6|(1:8)|21|11)|29)|12|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        
            r3.f36048e.error("Is push token exist result by ipc has failed", r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            i iVar;
            Object obj3;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36052f;
            i iVar2 = i.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                iVar2.f36048e.info("Validating host...");
                u uVar = iVar2.f36044a;
                this.f36052f = 1;
                Object a11 = uVar.a(this.f36054h, this);
                obj2 = a11;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.f36051e;
                    iVar = this.f36050d;
                    Sc.s.b(obj);
                    IsPushTokenExistResult isPushTokenExistResult = (kotlin.text.h.K(str) && str.equals((String) obj)) ? IsPushTokenExistResult.EXISTS : IsPushTokenExistResult.DOES_NOT_EXIST;
                    iVar.f36048e.info("Check result: " + isPushTokenExistResult.name());
                    r.Companion companion = Sc.r.INSTANCE;
                    obj3 = isPushTokenExistResult;
                    this.f36055i.g(Eb.j.b(obj3));
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
                obj2 = ((Sc.r) obj).getF26106a();
            }
            r.Companion companion2 = Sc.r.INSTANCE;
            boolean z11 = obj2 instanceof r.b;
            obj3 = obj2;
            if (!z11) {
                InterfaceC6586g interfaceC6586g = iVar2.f36047d;
                this.f36050d = iVar2;
                String str2 = this.f36056j;
                this.f36051e = str2;
                this.f36052f = 2;
                obj = interfaceC6586g.a(this);
                if (obj != aVar) {
                    str = str2;
                    iVar = iVar2;
                    if (kotlin.text.h.K(str)) {
                    }
                    iVar.f36048e.info("Check result: " + isPushTokenExistResult.name());
                    r.Companion companion3 = Sc.r.INSTANCE;
                    obj3 = isPushTokenExistResult;
                }
                return aVar;
            }
            this.f36055i.g(Eb.j.b(obj3));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$onDeleteMessages$1", f = "ClientServiceInteractorImpl.kt", l = {ModuleDescriptor.MODULE_VERSION, 75}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f36057d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C9017a f36059f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC7913b f36060g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9017a c9017a, InterfaceC7913b interfaceC7913b, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f36059f = c9017a;
            this.f36060g = interfaceC7913b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new b(this.f36059f, this.f36060g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(8:5|6|7|(1:9)(1:18)|10|11|12|13)(2:19|20))(1:21))(1:27)|22|(1:24)|7|(0)(0)|10|11|12|13) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        
            r4.f36048e.error("On delete messages result by ipc has failed", r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        
            if (r6 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
        
            if (r6 == r0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a11;
            AidlResult<?> b11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36057d;
            i iVar = i.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                iVar.f36048e.info("Validating host...");
                u uVar = iVar.f36044a;
                this.f36057d = 1;
                a11 = uVar.a(this.f36059f, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    a11 = (OnDeleteMessagesResult) obj;
                    r.Companion companion = Sc.r.INSTANCE;
                    b11 = Eb.j.b(a11);
                    if (b11.c()) {
                        iVar.f36048e.error("On delete messages has failed", b11.a());
                    } else {
                        iVar.f36048e.info("On delete messages has successfully finished");
                    }
                    this.f36060g.g(b11);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
                a11 = ((Sc.r) obj).getF26106a();
            }
            r.Companion companion2 = Sc.r.INSTANCE;
            if (!(a11 instanceof r.b)) {
                iVar.f36048e.info("Calling onDeleteMessages...");
                this.f36057d = 2;
                obj = i.e(iVar, this);
            }
            b11 = Eb.j.b(a11);
            if (b11.c()) {
            }
            this.f36060g.g(b11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$onTokenInvalidated$1", f = "ClientServiceInteractorImpl.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f36061d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C9017a f36063f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC7913b f36064g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9017a c9017a, InterfaceC7913b interfaceC7913b, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f36063f = c9017a;
            this.f36064g = interfaceC7913b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new c(this.f36063f, this.f36064g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(10:12|13|14|(1:16)(1:28)|17|18|19|(1:21)(1:22)|7|8))(1:29))(1:34)|30|(1:32)|14|(0)(0)|17|18|19|(0)(0)|7|8) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
        
            if (r7.f(r2, r6) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        
            r5.f36048e.error("Return token invalidated result by ipc has failed", r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        
            if (r5.f36047d.e(r6) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0040, code lost:
        
            if (r7 == r1) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a11;
            AidlResult<?> b11;
            El0.a aVar;
            int i11 = 3;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i12 = this.f36061d;
            i iVar = i.this;
            if (i12 == 0) {
                Sc.s.b(obj);
                iVar.f36048e.info("Validating host...");
                u uVar = iVar.f36044a;
                this.f36061d = 1;
                a11 = uVar.a(this.f36063f, this);
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                    a11 = InvalidateTokenResult.OK;
                    r.Companion companion = Sc.r.INSTANCE;
                    b11 = Eb.j.b(a11);
                    if (b11.c()) {
                        iVar.f36048e.error("Invalidating token has failed", b11.a());
                    } else {
                        iVar.f36048e.info("Invalidating token has successfully finished");
                    }
                    this.f36064g.g(b11);
                    iVar.f36048e.info("Calling re-subscription to retrieve a new push token");
                    C10923h c10923h = new C10923h(0);
                    Pair pair = new Pair(c10923h, new C10923h.a());
                    C10923h c10923h2 = (C10923h) pair.a();
                    C10923h.a aVar3 = (C10923h.a) pair.b();
                    c10923h2.i(new j(iVar));
                    c10923h2.h(new DL.a(iVar, i11));
                    aVar = iVar.f36046c;
                    if (aVar != null) {
                        iVar.f36048e.error("SubscribeComponent is not initialized", null);
                    } else {
                        this.f36061d = 3;
                    }
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
                a11 = ((Sc.r) obj).getF26106a();
            }
            r.Companion companion2 = Sc.r.INSTANCE;
            if (!(a11 instanceof r.b)) {
                iVar.f36048e.info("Clearing push storage...");
                this.f36061d = 2;
            }
            b11 = Eb.j.b(a11);
            if (b11.c()) {
            }
            this.f36064g.g(b11);
            iVar.f36048e.info("Calling re-subscription to retrieve a new push token");
            C10923h c10923h3 = new C10923h(0);
            Pair pair2 = new Pair(c10923h3, new C10923h.a());
            C10923h c10923h22 = (C10923h) pair2.a();
            C10923h.a aVar32 = (C10923h.a) pair2.b();
            c10923h22.i(new j(iVar));
            c10923h22.h(new DL.a(iVar, i11));
            aVar = iVar.f36046c;
            if (aVar != null) {
            }
            return Unit.f71690a;
        }
    }

    public i(@NotNull u validateCallingHostInteractor, @NotNull f dispatcher, El0.a aVar, @NotNull InterfaceC6586g pushStorage, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(validateCallingHostInteractor, "validateCallingHostInteractor");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(pushStorage, "pushStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f36044a = validateCallingHostInteractor;
        this.f36045b = dispatcher;
        this.f36046c = aVar;
        this.f36047d = pushStorage;
        this.f36048e = logger.c("ClientServiceInteractor");
        this.f36049f = N.a(C10720e0.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum e(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        iVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f36043f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f36043f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f36041d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f36043f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    hVar.f36043f = 1;
                    if (iVar.f36045b.e(hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return OnDeleteMessagesResult.OK;
            }
        }
        hVar = new h(iVar, cVar);
        Object obj2 = hVar.f36041d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f36043f;
        if (i11 != 0) {
        }
        return OnDeleteMessagesResult.OK;
    }

    @Override // Zl0.g
    public final void a(@NotNull C9017a callingAppIds, @NotNull String token, @NotNull InterfaceC7913b callback) {
        Intrinsics.checkNotNullParameter(callingAppIds, "callingAppIds");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36048e.info("Checking is push token " + Eb.k.a(token) + " exist...");
        C10727i.c(this.f36049f, null, null, new a(callingAppIds, callback, token, null), 3);
    }

    @Override // Zl0.g
    public final void b(@NotNull C9017a callingAppIds, @NotNull InterfaceC7913b callback) {
        Intrinsics.checkNotNullParameter(callingAppIds, "callingAppIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36048e.info("Token invalidation has requested");
        C10727i.c(this.f36049f, null, null, new c(callingAppIds, callback, null), 3);
    }

    @Override // Zl0.g
    public final void c(@NotNull C9017a callingAppIds, @NotNull InterfaceC7913b callback) {
        Intrinsics.checkNotNullParameter(callingAppIds, "callingAppIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36048e.info("On delete messages has requested");
        C10727i.c(this.f36049f, null, null, new b(callingAppIds, callback, null), 3);
    }

    @Override // hb.InterfaceC6904a
    public final void onDestroy() {
        this.f36048e.info("Destroying");
        N.c(this.f36049f, null);
    }
}
