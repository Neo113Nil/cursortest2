package P0;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f21419a = new S0.B1(a.f21420b);

    static final class a extends AbstractC7737t implements Function0<u2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21420b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final u2 invoke() {
            return new u2(0);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21421a;

        static {
            int[] iArr = new int[R0.t.values().length];
            try {
                iArr[R0.t.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R0.t.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R0.t.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R0.t.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[R0.t.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[R0.t.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[R0.t.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[R0.t.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[R0.t.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[R0.t.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[R0.t.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[R0.t.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[R0.t.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[R0.t.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[R0.t.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f21421a = iArr;
        }
    }

    @NotNull
    public static final S0.B1 a() {
        return f21419a;
    }

    @NotNull
    public static final K1.T b(@NotNull R0.t tVar, InterfaceC3967k interfaceC3967k) {
        u2 u2Var = (u2) interfaceC3967k.m(f21419a);
        switch (b.f21421a[tVar.ordinal()]) {
            case 1:
                return u2Var.d();
            case 2:
                return u2Var.e();
            case 3:
                return u2Var.f();
            case 4:
                return u2Var.g();
            case 5:
                return u2Var.h();
            case 6:
                return u2Var.i();
            case 7:
                return u2Var.m();
            case 8:
                return u2Var.n();
            case 9:
                return u2Var.o();
            case 10:
                return u2Var.a();
            case 11:
                return u2Var.b();
            case 12:
                return u2Var.c();
            case 13:
                return u2Var.j();
            case 14:
                return u2Var.k();
            case 15:
                return u2Var.l();
            default:
                throw new Sc.o();
        }
    }
}
