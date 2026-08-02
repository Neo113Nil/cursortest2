package Ge;

import Sc.r;
import Sc.s;
import io.reactivex.w;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import xe.C10737n;

/* loaded from: classes10.dex */
public final class e implements w<Object> {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC8487b f10083a;

    /* renamed from: b, reason: collision with root package name */
    private Object f10084b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10085c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10737n f10086d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ EnumC3096a f10087e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10088a;

        static {
            int[] iArr = new int[EnumC3096a.values().length];
            try {
                iArr[EnumC3096a.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3096a.FIRST_OR_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3096a.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3096a.SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10088a = iArr;
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8487b f10089a;

        b(InterfaceC8487b interfaceC8487b) {
            this.f10089a = interfaceC8487b;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f10089a.dispose();
            return Unit.f71690a;
        }
    }

    e(C10737n c10737n, EnumC3096a enumC3096a) {
        this.f10086d = c10737n;
        this.f10087e = enumC3096a;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        boolean z11 = this.f10085c;
        C10737n c10737n = this.f10086d;
        if (z11) {
            if (c10737n.isActive()) {
                r.Companion companion = r.INSTANCE;
                c10737n.resumeWith(this.f10084b);
                return;
            }
            return;
        }
        EnumC3096a enumC3096a = EnumC3096a.FIRST_OR_DEFAULT;
        EnumC3096a enumC3096a2 = this.f10087e;
        if (enumC3096a2 == enumC3096a) {
            r.Companion companion2 = r.INSTANCE;
            c10737n.resumeWith(null);
        } else if (c10737n.isActive()) {
            r.Companion companion3 = r.INSTANCE;
            c10737n.resumeWith(s.a(new NoSuchElementException("No value received via onNext for " + enumC3096a2)));
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        r.Companion companion = r.INSTANCE;
        this.f10086d.resumeWith(s.a(th2));
    }

    @Override // io.reactivex.w
    public final void onNext(Object obj) {
        int[] iArr = a.f10088a;
        EnumC3096a enumC3096a = this.f10087e;
        int i11 = iArr[enumC3096a.ordinal()];
        C10737n c10737n = this.f10086d;
        if (i11 == 1 || i11 == 2) {
            if (this.f10085c) {
                return;
            }
            this.f10085c = true;
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(obj);
            InterfaceC8487b interfaceC8487b = this.f10083a;
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
                return;
            } else {
                Intrinsics.n("subscription");
                throw null;
            }
        }
        if (i11 != 3 && i11 != 4) {
            throw new Sc.o();
        }
        if (enumC3096a != EnumC3096a.SINGLE || !this.f10085c) {
            this.f10084b = obj;
            this.f10085c = true;
            return;
        }
        if (c10737n.isActive()) {
            r.Companion companion2 = r.INSTANCE;
            c10737n.resumeWith(s.a(new IllegalArgumentException("More than one onNext value for " + enumC3096a)));
        }
        InterfaceC8487b interfaceC8487b2 = this.f10083a;
        if (interfaceC8487b2 != null) {
            interfaceC8487b2.dispose();
        } else {
            Intrinsics.n("subscription");
            throw null;
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        this.f10083a = interfaceC8487b;
        this.f10086d.q(new b(interfaceC8487b));
    }
}
