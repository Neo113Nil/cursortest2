package Jc0;

import C2.l0;
import Ib0.i;
import Jc0.a;
import Jc0.h;
import Kc0.p;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.r;
import Sc.s;
import android.app.Application;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.protobuf.DescriptorProtos$FileOptions;
import dc0.C6149M;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginResponse;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f14580a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f14581b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14582c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14583d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14584e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14585f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.InstantLoginImpl$auth$2", f = "InstantLoginImpl.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 41}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        c f14586d;

        /* renamed from: e, reason: collision with root package name */
        int f14587e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
        
            if (r6 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c cVar;
            h g10;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f14587e;
            c cVar2 = c.this;
            if (i11 == 0) {
                s.b(obj);
                if (!cVar2.available()) {
                    return Unit.f71690a;
                }
                Kc0.d c11 = c.c(cVar2);
                this.f14587e = 1;
                obj = c11.b(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = this.f14586d;
                    s.b(obj);
                    g10 = c.g(cVar, (InstantLoginResponse) obj);
                    if (!(g10 instanceof h.b)) {
                        c.e(cVar2).j(new i.c(Gb0.d.INSTANT_LOGIN, null));
                        String a11 = ((h.b) g10).a();
                        if (a11 != null) {
                            c.f(cVar2).f(a11);
                        }
                    } else {
                        if (!(g10 instanceof h.a)) {
                            throw new o();
                        }
                        c.e(cVar2).j(new i.b(Gb0.d.INSTANT_LOGIN));
                        String a12 = ((h.a) g10).a();
                        if (a12 != null) {
                            c.f(cVar2).f(a12);
                        }
                    }
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            l0 l0Var = (l0) obj;
            if (l0Var == null) {
                return Unit.f71690a;
            }
            p d11 = c.d(cVar2);
            this.f14586d = cVar2;
            this.f14587e = 2;
            obj = d11.a(l0Var, this);
            if (obj != aVar) {
                cVar = cVar2;
                g10 = c.g(cVar, (InstantLoginResponse) obj);
                if (!(g10 instanceof h.b)) {
                }
                return Unit.f71690a;
            }
            return aVar;
        }
    }

    public c() {
        throw null;
    }

    public c(Application application, InterfaceC4008j instantLoginRepository, InterfaceC4008j credentialManagerDataSource, InterfaceC4008j ozonIdNotifier, InterfaceC4008j ozonIdAuthEvents) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(instantLoginRepository, "instantLoginRepository");
        Intrinsics.checkNotNullParameter(credentialManagerDataSource, "credentialManagerDataSource");
        Intrinsics.checkNotNullParameter(ozonIdNotifier, "ozonIdNotifier");
        Intrinsics.checkNotNullParameter(ozonIdAuthEvents, "ozonIdAuthEvents");
        this.f14580a = application;
        this.f14581b = dispatcher;
        this.f14582c = instantLoginRepository;
        this.f14583d = credentialManagerDataSource;
        this.f14584e = ozonIdNotifier;
        this.f14585f = ozonIdAuthEvents;
    }

    public static final Kc0.d c(c cVar) {
        return (Kc0.d) cVar.f14583d.getValue();
    }

    public static final p d(c cVar) {
        return (p) cVar.f14582c.getValue();
    }

    public static final Ib0.e e(c cVar) {
        return (Ib0.e) cVar.f14585f.getValue();
    }

    public static final C6149M f(c cVar) {
        return (C6149M) cVar.f14584e.getValue();
    }

    public static final h g(c cVar, InstantLoginResponse instantLoginResponse) {
        if (instantLoginResponse == null) {
            String string = cVar.f14580a.getString(R.string.ozonid_error_technical_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new h.a(string);
        }
        cVar.getClass();
        if (instantLoginResponse.isSuccess() && instantLoginResponse.getData().getAuthToken() != null) {
            return new h.b(instantLoginResponse.getData().getAuthToken(), instantLoginResponse.getData().getMessage());
        }
        String message = instantLoginResponse.getData().getMessage();
        if (message == null) {
            message = cVar.f14580a.getString(R.string.ozonid_error_technical_error_title);
            Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
        }
        return new h.a(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Jc0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        c cVar2;
        Object f26106a;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f14592g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f14592g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f14590e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f14592g;
                if (i11 != 0) {
                    s.b(obj);
                    e eVar = new e(this, map, null);
                    dVar.f14589d = this;
                    dVar.f14592g = 1;
                    obj = C10727i.f(this.f14581b, eVar, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = dVar.f14589d;
                    s.b(obj);
                }
                f26106a = ((r) obj).getF26106a();
                if (r.b(f26106a) != null) {
                    C6149M c6149m = (C6149M) cVar2.f14584e.getValue();
                    String string = cVar2.f14580a.getString(R.string.ozonid_error_technical_error_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    c6149m.f(string);
                }
                return f26106a;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f14590e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f14592g;
        if (i11 != 0) {
        }
        f26106a = ((r) obj2).getF26106a();
        if (r.b(f26106a) != null) {
        }
        return f26106a;
    }

    @Override // Jc0.b
    public final boolean available() {
        Application context = this.f14580a;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
            return googleApiAvailability.isGooglePlayServicesAvailable(context) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Jc0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull String str, Map map, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        Object obj;
        int i11;
        c cVar2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f14600h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f14600h = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = fVar.f14598f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f14600h;
                if (i11 != 0) {
                    s.b(obj);
                    g gVar = new g(this, str, map, null);
                    fVar.f14596d = this;
                    fVar.f14597e = z11;
                    fVar.f14600h = 1;
                    obj = C10727i.f(this.f14581b, gVar, fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = fVar.f14597e;
                    cVar2 = fVar.f14596d;
                    s.b(obj);
                }
                if ((((Jc0.a) obj) instanceof a.C0271a) && z11) {
                    C6149M c6149m = (C6149M) cVar2.f14584e.getValue();
                    String string = cVar2.f14580a.getString(R.string.ozonid_error_technical_error_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    c6149m.f(string);
                }
                return obj;
            }
        }
        fVar = new f(this, cVar);
        obj = fVar.f14598f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f14600h;
        if (i11 != 0) {
        }
        if (((Jc0.a) obj) instanceof a.C0271a) {
            C6149M c6149m2 = (C6149M) cVar2.f14584e.getValue();
            String string2 = cVar2.f14580a.getString(R.string.ozonid_error_technical_error_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            c6149m2.f(string2);
        }
        return obj;
    }

    public final Object h(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f14581b, new a(null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
