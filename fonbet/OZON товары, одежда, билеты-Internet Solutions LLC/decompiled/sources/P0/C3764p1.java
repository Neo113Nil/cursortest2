package P0;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3764p1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f21299a = new S0.B1(a.f21300b);

    /* renamed from: P0.p1$a */
    static final class a extends AbstractC7737t implements Function0<C3761o1> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21300b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C3761o1 invoke() {
            return new C3761o1(0);
        }
    }

    /* renamed from: P0.p1$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21301a;

        static {
            int[] iArr = new int[R0.l.values().length];
            try {
                iArr[R0.l.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R0.l.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R0.l.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R0.l.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[R0.l.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[R0.l.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[R0.l.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[R0.l.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[R0.l.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[R0.l.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[R0.l.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f21301a = iArr;
        }
    }

    @NotNull
    public static final S0.B1 a() {
        return f21299a;
    }

    @NotNull
    public static final l1.J0 b(@NotNull R0.l lVar, InterfaceC3967k interfaceC3967k) {
        C3761o1 c3761o1 = (C3761o1) interfaceC3967k.m(f21299a);
        switch (b.f21301a[lVar.ordinal()]) {
            case 1:
                return c3761o1.a();
            case 2:
                return c(c3761o1.a());
            case 3:
                return c3761o1.b();
            case 4:
                return c(c3761o1.b());
            case 5:
                return A0.h.e();
            case 6:
                return c3761o1.c();
            case 7:
                float f7 = (float) 0.0d;
                return A0.a.copy$default(c3761o1.c(), A0.c.b(f7), null, null, A0.c.b(f7), 6, null);
            case 8:
                return c(c3761o1.c());
            case 9:
                return c3761o1.d();
            case 10:
                return l1.y0.a();
            case 11:
                return c3761o1.e();
            default:
                throw new Sc.o();
        }
    }

    @NotNull
    public static final A0.a c(@NotNull A0.a aVar) {
        float f7 = (float) 0.0d;
        return A0.a.copy$default(aVar, null, null, A0.c.b(f7), A0.c.b(f7), 3, null);
    }
}
