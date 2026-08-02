package P0;

import S0.InterfaceC3967k;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: P0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3759o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f21262a = new S0.B1(a.f21265b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f21263b = new S0.B1(b.f21266b);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21264c = 0;

    /* renamed from: P0.o$a */
    static final class a extends AbstractC7737t implements Function0<C3756n> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21265b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C3756n invoke() {
            return C3759o.f();
        }
    }

    /* renamed from: P0.o$b */
    static final class b extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21266b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: P0.o$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21267a;

        static {
            int[] iArr = new int[R0.c.values().length];
            try {
                iArr[R0.c.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R0.c.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R0.c.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R0.c.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[R0.c.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[R0.c.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[R0.c.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[R0.c.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[R0.c.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[R0.c.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[R0.c.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[R0.c.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[R0.c.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[R0.c.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[R0.c.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[R0.c.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[R0.c.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[R0.c.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[R0.c.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[R0.c.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[R0.c.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[R0.c.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[R0.c.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[R0.c.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[R0.c.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[R0.c.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[R0.c.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[R0.c.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[R0.c.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[R0.c.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[R0.c.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[R0.c.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[R0.c.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[R0.c.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[R0.c.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[R0.c.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f21267a = iArr;
        }
    }

    public static final long a(@NotNull C3756n c3756n, long j11, float f7, InterfaceC3967k interfaceC3967k) {
        return (C7807Z.p(j11, c3756n.E()) && ((Boolean) interfaceC3967k.m(f21263b)).booleanValue()) ? Z1.h.b(f7, (float) 0) ? c3756n.E() : C7811b0.f(C7807Z.o(((((float) Math.log(f7 + 1)) * 4.5f) + 2.0f) / 100.0f, c3756n.M()), c3756n.E()) : j11;
    }

    public static final long b(long j11, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1680936624);
        C3756n c3756n = (C3756n) interfaceC3967k.m(f21262a);
        long p11 = C7807Z.p(j11, c3756n.z()) ? c3756n.p() : C7807Z.p(j11, c3756n.C()) ? c3756n.r() : C7807Z.p(j11, c3756n.O()) ? c3756n.v() : C7807Z.p(j11, c3756n.a()) ? c3756n.m() : C7807Z.p(j11, c3756n.h()) ? c3756n.n() : C7807Z.p(j11, c3756n.A()) ? c3756n.q() : C7807Z.p(j11, c3756n.D()) ? c3756n.s() : C7807Z.p(j11, c3756n.P()) ? c3756n.w() : C7807Z.p(j11, c3756n.i()) ? c3756n.o() : C7807Z.p(j11, c3756n.l()) ? c3756n.j() : C7807Z.p(j11, c3756n.E()) ? c3756n.t() : C7807Z.p(j11, c3756n.N()) ? c3756n.u() : C7807Z.p(j11, c3756n.F()) ? c3756n.t() : C7807Z.p(j11, c3756n.G()) ? c3756n.t() : C7807Z.p(j11, c3756n.H()) ? c3756n.t() : C7807Z.p(j11, c3756n.I()) ? c3756n.t() : C7807Z.p(j11, c3756n.J()) ? c3756n.t() : C7807Z.p(j11, c3756n.K()) ? c3756n.t() : C7807Z.f72259m;
        if (p11 == 16) {
            p11 = ((C7807Z) interfaceC3967k.m(C3776u.a())).w();
        }
        interfaceC3967k.k();
        return p11;
    }

    public static final long c(@NotNull C3756n c3756n, @NotNull R0.c cVar) {
        long j11;
        switch (c.f21267a[cVar.ordinal()]) {
            case 1:
                return c3756n.a();
            case 2:
                return c3756n.h();
            case 3:
                return c3756n.i();
            case 4:
                return c3756n.j();
            case 5:
                return c3756n.k();
            case 6:
                return c3756n.l();
            case 7:
                return c3756n.m();
            case 8:
                return c3756n.n();
            case 9:
                return c3756n.o();
            case 10:
                return c3756n.p();
            case 11:
                return c3756n.q();
            case 12:
                return c3756n.r();
            case 13:
                return c3756n.s();
            case 14:
                return c3756n.t();
            case 15:
                return c3756n.u();
            case 16:
                return c3756n.M();
            case 17:
                return c3756n.v();
            case 18:
                return c3756n.w();
            case 19:
                return c3756n.x();
            case 20:
                return c3756n.y();
            case 21:
                return c3756n.z();
            case 22:
                return c3756n.A();
            case 23:
                return c3756n.B();
            case 24:
                return c3756n.C();
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                return c3756n.D();
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                return c3756n.E();
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return c3756n.N();
            case 28:
                return c3756n.F();
            case 29:
                return c3756n.G();
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                return c3756n.H();
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return c3756n.I();
            case 32:
                return c3756n.J();
            case 33:
                return c3756n.K();
            case 34:
                return c3756n.L();
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return c3756n.O();
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return c3756n.P();
            default:
                j11 = C7807Z.f72259m;
                return j11;
        }
    }

    @NotNull
    public static final S0.B1 d() {
        return f21262a;
    }

    public static final long e(@NotNull R0.c cVar, InterfaceC3967k interfaceC3967k) {
        return c((C3756n) interfaceC3967k.m(f21262a), cVar);
    }

    public static C3756n f() {
        long t2 = R0.b.t();
        return new C3756n(t2, R0.b.j(), R0.b.u(), R0.b.k(), R0.b.e(), R0.b.w(), R0.b.l(), R0.b.x(), R0.b.m(), R0.b.H(), R0.b.p(), R0.b.I(), R0.b.q(), R0.b.a(), R0.b.g(), R0.b.y(), R0.b.n(), R0.b.G(), R0.b.o(), t2, R0.b.f(), R0.b.d(), R0.b.b(), R0.b.h(), R0.b.c(), R0.b.i(), R0.b.r(), R0.b.s(), R0.b.v(), R0.b.z(), R0.b.F(), R0.b.A(), R0.b.B(), R0.b.C(), R0.b.D(), R0.b.E());
    }
}
