package B0;

import B0.J0;
import B0.O0;
import Q1.C3832a;
import Q1.C3843l;
import Q1.C3845n;
import Q1.C3848q;
import Q1.InterfaceC3841j;
import android.view.KeyEvent;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import v1.C10178c;
import v1.C10179d;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O0 f1326a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I0.W0 f1327b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q1.K f1328c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1329d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1330e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final I0.i1 f1331f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Q1.D f1332g;

    /* renamed from: h, reason: collision with root package name */
    private final f2 f1333h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2520w0 f1334i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final J0.a f1335j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function1<Q1.K, Unit> f1336k;

    /* renamed from: l, reason: collision with root package name */
    private final int f1337l;

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<I0.T0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F0 f1338b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A1 f1339c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.I f1340d;

        /* renamed from: B0.A1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0041a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1341a;

            static {
                int[] iArr = new int[F0.values().length];
                try {
                    iArr[F0.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[F0.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[F0.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[F0.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[F0.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[F0.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[F0.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[F0.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[F0.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[F0.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[F0.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[F0.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[F0.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[F0.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[F0.LINE_END.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[F0.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[F0.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[F0.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[F0.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[F0.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[F0.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[F0.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[F0.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[F0.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[F0.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[F0.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[F0.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[F0.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[F0.SELECT_LEFT_CHAR.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[F0.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[F0.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[F0.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[F0.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[F0.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[F0.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[F0.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[F0.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[F0.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[F0.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[F0.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[F0.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[F0.SELECT_PAGE_DOWN.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[F0.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[F0.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[F0.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[F0.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[F0.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[F0.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                f1341a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F0 f02, A1 a12, kotlin.jvm.internal.I i11) {
            super(1);
            this.f1338b = f02;
            this.f1339c = a12;
            this.f1340d = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I0.T0 t02) {
            Q1.K e11;
            Q1.K c11;
            I0.T0 t03 = t02;
            int i11 = C0041a.f1341a[this.f1338b.ordinal()];
            A1 a12 = this.f1339c;
            switch (i11) {
                case 1:
                    a12.f().o(false);
                    break;
                case 2:
                    a12.f().N();
                    break;
                case 3:
                    a12.f().r();
                    break;
                case 4:
                    t03.a(C2509s1.f1939b);
                    break;
                case 5:
                    t03.b(C2512t1.f1969b);
                    break;
                case 6:
                    t03.r();
                    break;
                case 7:
                    t03.v();
                    break;
                case 8:
                    t03.t();
                    break;
                case 9:
                    t03.s();
                    break;
                case 10:
                    t03.C();
                    break;
                case 11:
                    t03.p();
                    break;
                case 12:
                    t03.L();
                    break;
                case 13:
                    t03.K();
                    break;
                case 14:
                    t03.B();
                    break;
                case 15:
                    t03.y();
                    break;
                case 16:
                    t03.z();
                    break;
                case 17:
                    t03.A();
                    break;
                case 18:
                    t03.x();
                    break;
                case 19:
                    t03.w();
                    break;
                case 20:
                    List<InterfaceC3841j> H11 = t03.H(C2515u1.f1990b);
                    if (H11 != null) {
                        a12.e(H11);
                        break;
                    }
                    break;
                case 21:
                    List<InterfaceC3841j> H12 = t03.H(C2518v1.f1994b);
                    if (H12 != null) {
                        a12.e(H12);
                        break;
                    }
                    break;
                case 22:
                    List<InterfaceC3841j> H13 = t03.H(C2521w1.f1997b);
                    if (H13 != null) {
                        a12.e(H13);
                        break;
                    }
                    break;
                case 23:
                    List<InterfaceC3841j> H14 = t03.H(C2524x1.f2002b);
                    if (H14 != null) {
                        a12.e(H14);
                        break;
                    }
                    break;
                case 24:
                    List<InterfaceC3841j> H15 = t03.H(C2527y1.f2019b);
                    if (H15 != null) {
                        a12.e(H15);
                        break;
                    }
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    List<InterfaceC3841j> H16 = t03.H(C2530z1.f2021b);
                    if (H16 != null) {
                        a12.e(H16);
                        break;
                    }
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    if (!a12.g()) {
                        A1.a(a12, new C3832a("\n", 1));
                        break;
                    } else {
                        ((O0.a) a12.h().l()).invoke(C3848q.a(a12.f1337l));
                        break;
                    }
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    if (!a12.g()) {
                        A1.a(a12, new C3832a("\t", 1));
                        break;
                    } else {
                        this.f1340d.f71783a = false;
                        break;
                    }
                case 28:
                    t03.D();
                    break;
                case 29:
                    t03.q();
                    t03.E();
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    t03.u();
                    t03.E();
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    t03.r();
                    t03.E();
                    break;
                case 32:
                    t03.v();
                    t03.E();
                    break;
                case 33:
                    t03.t();
                    t03.E();
                    break;
                case 34:
                    t03.s();
                    t03.E();
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    t03.B();
                    t03.E();
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    t03.y();
                    t03.E();
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    t03.z();
                    t03.E();
                    break;
                case 38:
                    t03.A();
                    t03.E();
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    t03.C();
                    t03.E();
                    break;
                case 40:
                    t03.p();
                    t03.E();
                    break;
                case 41:
                    t03.L();
                    t03.E();
                    break;
                case 42:
                    t03.K();
                    t03.E();
                    break;
                case 43:
                    t03.x();
                    t03.E();
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    t03.w();
                    t03.E();
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    t03.c();
                    break;
                case 46:
                    f2 i12 = a12.i();
                    if (i12 != null) {
                        i12.b(t03.I());
                    }
                    f2 i13 = a12.i();
                    if (i13 != null && (e11 = i13.e()) != null) {
                        a12.f1336k.invoke(e11);
                        break;
                    }
                    break;
                case 47:
                    f2 i14 = a12.i();
                    if (i14 != null && (c11 = i14.c()) != null) {
                        a12.f1336k.invoke(c11);
                        break;
                    }
                    break;
            }
            return Unit.f71690a;
        }
    }

    private A1() {
        throw null;
    }

    public A1(O0 o02, I0.W0 w02, Q1.K k11, boolean z11, boolean z12, I0.i1 i1Var, Q1.D d11, f2 f2Var, C2520w0 c2520w0, Function1 function1, int i11) {
        J0.a a11 = J0.a();
        this.f1326a = o02;
        this.f1327b = w02;
        this.f1328c = k11;
        this.f1329d = z11;
        this.f1330e = z12;
        this.f1331f = i1Var;
        this.f1332g = d11;
        this.f1333h = f2Var;
        this.f1334i = c2520w0;
        this.f1335j = a11;
        this.f1336k = function1;
        this.f1337l = i11;
    }

    public static final void a(A1 a12, C3832a c3832a) {
        a12.getClass();
        a12.e(C7714v.a0(c3832a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<? extends InterfaceC3841j> list) {
        C3843l n11 = this.f1326a.n();
        ArrayList W02 = C7714v.W0(list);
        W02.add(0, new C3845n());
        ((O0.b) this.f1336k).invoke(n11.a(W02));
    }

    @NotNull
    public final I0.W0 f() {
        return this.f1327b;
    }

    public final boolean g() {
        return this.f1330e;
    }

    @NotNull
    public final O0 h() {
        return this.f1326a;
    }

    public final f2 i() {
        return this.f1333h;
    }

    public final boolean j(@NotNull KeyEvent keyEvent) {
        F0 a11;
        Integer a12;
        C3832a c3832a = null;
        if (D1.a(keyEvent) && (a12 = this.f1334i.a(keyEvent)) != null) {
            c3832a = new C3832a(C2462c1.a(a12.intValue(), new StringBuilder()).toString(), 1);
        }
        I0.i1 i1Var = this.f1331f;
        boolean z11 = this.f1329d;
        if (c3832a != null) {
            if (!z11) {
                return false;
            }
            e(C7714v.a0(c3832a));
            i1Var.b();
            return true;
        }
        if (!C10178c.a(C10179d.b(keyEvent), 2) || (a11 = this.f1335j.a(keyEvent)) == null) {
            return false;
        }
        if (a11.a() && !z11) {
            return false;
        }
        kotlin.jvm.internal.I i11 = new kotlin.jvm.internal.I();
        i11.f71783a = true;
        a aVar = new a(a11, this, i11);
        R1 j11 = this.f1326a.j();
        Q1.K k11 = this.f1328c;
        I0.T0 t02 = new I0.T0(k11, this.f1332g, j11, i1Var);
        aVar.invoke(t02);
        if (!K1.Q.d(t02.l(), k11.e()) || !Intrinsics.d(t02.d(), k11.c())) {
            ((O0.b) this.f1336k).invoke(t02.I());
        }
        f2 f2Var = this.f1333h;
        if (f2Var != null) {
            f2Var.a();
        }
        return i11.f71783a;
    }
}
