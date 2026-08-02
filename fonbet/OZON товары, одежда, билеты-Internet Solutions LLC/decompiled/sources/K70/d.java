package K70;

import A30.m;
import Ae.C0;
import Ae.C2399j;
import Ae.InterfaceC2397i;
import D30.f;
import De.C2862e;
import Sc.C4005g;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import g30.InterfaceC6618a;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import xe.Y;

/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f15331a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f15332b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final R30.a f15333c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Q90.c f15334d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f15335e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f15336f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.otp.sms.domain.OtpSmsInteractorImpl$1", f = "OtpSmsInteractorImpl.kt", l = {38, 38}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f15337d;

        /* renamed from: K70.d$a$a, reason: collision with other inner class name */
        static final class C0296a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f15339a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.otp.sms.domain.OtpSmsInteractorImpl$1$1", f = "OtpSmsInteractorImpl.kt", l = {42, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "emit")
            /* renamed from: K70.d$a$a$a, reason: collision with other inner class name */
            static final class C0297a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                Object f15340d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f15341e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C0296a<T> f15342f;

                /* renamed from: g, reason: collision with root package name */
                int f15343g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0297a(C0296a<? super T> c0296a, kotlin.coroutines.d<? super C0297a> dVar) {
                    super(dVar);
                    this.f15342f = c0296a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f15341e = obj;
                    this.f15343g |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f15342f.emit(null, this);
                }
            }

            C0296a(d dVar) {
                this.f15339a = dVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
            
                if (r6.f15339a.h(r0) == r1) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // Ae.InterfaceC2397i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(D30.f fVar, kotlin.coroutines.d<? super Unit> dVar) {
                C0297a c0297a;
                int i11;
                C0296a<T> c0296a;
                if (dVar instanceof C0297a) {
                    c0297a = (C0297a) dVar;
                    int i12 = c0297a.f15343g;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0297a.f15343g = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0297a.f15341e;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0297a.f15343g;
                        if (i11 != 0) {
                            s.b(obj);
                            if ((fVar instanceof f.a) && !this.f15339a.f15336f) {
                                c0297a.f15340d = this;
                                c0297a.f15343g = 1;
                                if (Y.b(6000L, c0297a) != aVar) {
                                    c0296a = this;
                                }
                                return aVar;
                            }
                            return Unit.f71690a;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        c0296a = (C0296a) c0297a.f15340d;
                        s.b(obj);
                        if (Tl.a.f(c0296a.f15339a.f15334d, S90.c.MOB_OFFLINE)) {
                            c0297a.f15340d = null;
                            c0297a.f15343g = 2;
                        }
                        return Unit.f71690a;
                    }
                }
                c0297a = new C0297a(this, dVar);
                Object obj2 = c0297a.f15341e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0297a.f15343g;
                if (i11 != 0) {
                }
                if (Tl.a.f(c0296a.f15339a.f15334d, S90.c.MOB_OFFLINE)) {
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        
            if (((Ae.M0) r6).collect(r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f15337d;
            d dVar = d.this;
            if (i11 == 0) {
                s.b(obj);
                C0 r11 = dVar.f15332b.r();
                C2862e b11 = dVar.f15333c.b();
                this.f15337d = 1;
                obj = C2399j.N(r11, b11, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    throw new C4005g();
                }
                s.b(obj);
            }
            C0296a c0296a = new C0296a(dVar);
            this.f15337d = 2;
        }
    }

    public d(@NotNull g repository, @NotNull m fintechAuthInteractor, @NotNull R30.a appCoroutineScopes, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f15331a = repository;
        this.f15332b = fintechAuthInteractor;
        this.f15333c = appCoroutineScopes;
        this.f15334d = featureToggles;
        this.f15335e = analyticInteractor;
        C10727i.c(appCoroutineScopes.b(), null, null, new a(null), 3);
        fintechAuthInteractor.A(new c(this, 0));
    }

    public static Unit a(d dVar) {
        dVar.f15331a.d();
        return Unit.f71690a;
    }

    @Override // K70.b
    public final boolean b() {
        return !this.f15331a.c().equals("");
    }

    @Override // K70.b
    @NotNull
    public final String c(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "sessionInformation");
        String c11 = this.f15331a.c();
        if (c11.length() <= 0) {
            return "";
        }
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        Arrays.fill(bArr, (byte) 0);
        try {
            String a11 = K70.a.a(K70.a.b(c11));
            String a12 = K70.a.a(bArr);
            Intrinsics.checkNotNullParameter(input, "input");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = input.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.f(digest);
            String a13 = K70.a.a(digest);
            byte[] array = ByteBuffer.allocate(8).putLong((System.currentTimeMillis() / 1000) / 60).array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            return L70.a.a(a11, a12, a13, K70.a.a(array));
        } catch (Exception e11) {
            L80.a.c("OtpSmsInteractorImpl", "Ocra.generateOCRA error", e11);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        d dVar;
        d dVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f15348h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f15348h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f15346f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f15348h;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        g gVar = this.f15331a;
                        eVar.f15344d = this;
                        eVar.f15345e = this;
                        eVar.f15348h = 1;
                        obj = gVar.e(eVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        dVar = this;
                        dVar2 = dVar;
                    } catch (Exception e11) {
                        e = e11;
                        dVar = this;
                        L80.a.c("OtpSmsInteractorImpl", "Ошибка при загрузке отп ключа", e);
                        dVar.f15335e.Z(false);
                        return Unit.f71690a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = eVar.f15345e;
                    dVar = eVar.f15344d;
                    try {
                        s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        L80.a.c("OtpSmsInteractorImpl", "Ошибка при загрузке отп ключа", e);
                        dVar.f15335e.Z(false);
                        return Unit.f71690a;
                    }
                }
                dVar2.f15336f = ((Boolean) obj).booleanValue();
                dVar.f15335e.Z(true);
                return Unit.f71690a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f15346f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f15348h;
        if (i11 != 0) {
        }
        dVar2.f15336f = ((Boolean) obj2).booleanValue();
        dVar.f15335e.Z(true);
        return Unit.f71690a;
    }
}
