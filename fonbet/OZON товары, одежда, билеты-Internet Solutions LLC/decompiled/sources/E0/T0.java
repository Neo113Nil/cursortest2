package E0;

import B0.C2520w0;
import B0.D1;
import B0.J0;
import E0.F0;
import F0.C2988i;
import F0.C2989j;
import F0.C2990k;
import android.view.KeyEvent;
import androidx.compose.ui.platform.P1;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import k1.C7460f;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import v1.C10179d;

/* loaded from: classes8.dex */
public abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2989j f7085a = new C2989j();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2520w0 f7086b = new C2520w0();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final J0.a f7087c = B0.J0.a();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7088a;

        static {
            int[] iArr = new int[B0.F0.values().length];
            try {
                iArr[B0.F0.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B0.F0.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B0.F0.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[B0.F0.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[B0.F0.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[B0.F0.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[B0.F0.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[B0.F0.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[B0.F0.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[B0.F0.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[B0.F0.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[B0.F0.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[B0.F0.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[B0.F0.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[B0.F0.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[B0.F0.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[B0.F0.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[B0.F0.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[B0.F0.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[B0.F0.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[B0.F0.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[B0.F0.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[B0.F0.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[B0.F0.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[B0.F0.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[B0.F0.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[B0.F0.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[B0.F0.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[B0.F0.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[B0.F0.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[B0.F0.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[B0.F0.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[B0.F0.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[B0.F0.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[B0.F0.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[B0.F0.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[B0.F0.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[B0.F0.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[B0.F0.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[B0.F0.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[B0.F0.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[B0.F0.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[B0.F0.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[B0.F0.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[B0.F0.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[B0.F0.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[B0.F0.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[B0.F0.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f7088a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C2988i, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f7089b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C2988i c2988i) {
            c2988i.s();
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<C2988i, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f7090b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C2988i c2988i) {
            c2988i.y();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(@NotNull KeyEvent keyEvent, @NotNull c1 c1Var, @NotNull Z0 z02, @NotNull C2990k c2990k, boolean z11, boolean z12, @NotNull Function0<Unit> function0) {
        float f7;
        C2988i c2988i;
        K1.Q b11;
        c1 c1Var2;
        boolean z13;
        c1 c1Var3;
        boolean z14;
        c1 c1Var4;
        boolean z15;
        c1 c1Var5;
        boolean z16;
        c1 c1Var6;
        boolean z17;
        c1 c1Var7;
        boolean z18;
        c1 c1Var8;
        boolean z19;
        c1 c1Var9;
        boolean z21;
        c1 c1Var10;
        boolean z22;
        c1 c1Var11;
        boolean z23;
        c1 c1Var12;
        boolean z24;
        c1 c1Var13;
        boolean z25;
        D0.e eVar;
        D0.e eVar2;
        C7460f c7460f;
        Integer a11;
        D0.e eVar3;
        if (C10179d.b(keyEvent) == 2) {
            boolean a12 = D1.a(keyEvent);
            C2989j c2989j = this.f7085a;
            if (!a12 || (a11 = this.f7086b.a(keyEvent)) == null) {
                B0.F0 a13 = this.f7087c.a(keyEvent);
                if (a13 != null && (!a13.a() || z11)) {
                    boolean z26 = (keyEvent.getFlags() & 2) == 2;
                    K1.K f11 = z02.f();
                    B1.B i11 = z02.i();
                    if (i11 != null) {
                        if (!i11.I()) {
                            i11 = null;
                        }
                        if (i11 != null) {
                            B1.B e11 = z02.e();
                            if (e11 != null) {
                                if (!e11.I()) {
                                    e11 = null;
                                }
                                if (e11 != null) {
                                    c7460f = e11.K(i11, true);
                                    if (c7460f != null) {
                                        f7 = C7464j.d(c7460f.p());
                                        c2988i = new C2988i(c1Var, f11, z26, f7, c2989j);
                                        switch (a.f7088a[a13.ordinal()]) {
                                            case 1:
                                                c2990k.B(false);
                                                r4 = true;
                                                break;
                                            case 2:
                                                c2990k.W();
                                                r4 = true;
                                                break;
                                            case 3:
                                                c2990k.D();
                                                r4 = true;
                                                break;
                                            case 4:
                                                c2988i.c(b.f7089b);
                                                r4 = true;
                                                break;
                                            case 5:
                                                c2988i.d(c.f7090b);
                                                r4 = true;
                                                break;
                                            case 6:
                                                c2988i.t();
                                                r4 = true;
                                                break;
                                            case 7:
                                                c2988i.z();
                                                r4 = true;
                                                break;
                                            case 8:
                                                c2988i.x();
                                                r4 = true;
                                                break;
                                            case 9:
                                                c2988i.v();
                                                r4 = true;
                                                break;
                                            case 10:
                                                c2988i.G();
                                                r4 = true;
                                                break;
                                            case 11:
                                                c2988i.q();
                                                r4 = true;
                                                break;
                                            case 12:
                                                c2988i.H();
                                                r4 = true;
                                                break;
                                            case 13:
                                                c2988i.r();
                                                r4 = true;
                                                break;
                                            case 14:
                                                c2988i.F();
                                                r4 = true;
                                                break;
                                            case 15:
                                                c2988i.C();
                                                r4 = true;
                                                break;
                                            case 16:
                                                c2988i.D();
                                                r4 = true;
                                                break;
                                            case 17:
                                                c2988i.E();
                                                r4 = true;
                                                break;
                                            case 18:
                                                c2988i.B();
                                                r4 = true;
                                                break;
                                            case 19:
                                                c2988i.A();
                                                r4 = true;
                                                break;
                                            case 20:
                                                if (K1.Q.e(c2988i.m())) {
                                                    int k11 = c2988i.k();
                                                    Integer valueOf = Integer.valueOf(k11);
                                                    if (k11 == -1) {
                                                        valueOf = null;
                                                    }
                                                    b11 = valueOf != null ? K1.Q.b(K1.S.a(valueOf.intValue(), (int) (c2988i.m() & 4294967295L))) : null;
                                                    if (b11 != null) {
                                                        long k12 = b11.k();
                                                        c1Var2 = c2988i.f8242a;
                                                        z13 = c2988i.f8244c;
                                                        c1.r(c1Var2, "", k12, !z13, 4);
                                                    }
                                                } else {
                                                    c1Var3 = c2988i.f8242a;
                                                    long m11 = c2988i.m();
                                                    z14 = c2988i.f8244c;
                                                    c1.r(c1Var3, "", m11, !z14, 4);
                                                }
                                                r4 = true;
                                                break;
                                            case 21:
                                                if (K1.Q.e(c2988i.m())) {
                                                    int i12 = c2988i.i();
                                                    Integer valueOf2 = Integer.valueOf(i12);
                                                    if (i12 == -1) {
                                                        valueOf2 = null;
                                                    }
                                                    b11 = valueOf2 != null ? K1.Q.b(K1.S.a((int) (c2988i.m() >> 32), valueOf2.intValue())) : null;
                                                    if (b11 != null) {
                                                        long k13 = b11.k();
                                                        c1Var4 = c2988i.f8242a;
                                                        z15 = c2988i.f8244c;
                                                        c1.r(c1Var4, "", k13, !z15, 4);
                                                    }
                                                } else {
                                                    c1Var5 = c2988i.f8242a;
                                                    long m12 = c2988i.m();
                                                    z16 = c2988i.f8244c;
                                                    c1.r(c1Var5, "", m12, !z16, 4);
                                                }
                                                r4 = true;
                                                break;
                                            case 22:
                                                if (K1.Q.e(c2988i.m())) {
                                                    long a14 = K1.S.a(c2988i.l(), (int) (c2988i.m() & 4294967295L));
                                                    c1Var6 = c2988i.f8242a;
                                                    z17 = c2988i.f8244c;
                                                    c1.r(c1Var6, "", a14, !z17, 4);
                                                } else {
                                                    c1Var7 = c2988i.f8242a;
                                                    long m13 = c2988i.m();
                                                    z18 = c2988i.f8244c;
                                                    c1.r(c1Var7, "", m13, !z18, 4);
                                                }
                                                r4 = true;
                                                break;
                                            case 23:
                                                if (K1.Q.e(c2988i.m())) {
                                                    long a15 = K1.S.a((int) (c2988i.m() >> 32), c2988i.j());
                                                    c1Var8 = c2988i.f8242a;
                                                    z19 = c2988i.f8244c;
                                                    c1.r(c1Var8, "", a15, !z19, 4);
                                                } else {
                                                    c1Var9 = c2988i.f8242a;
                                                    long m14 = c2988i.m();
                                                    z21 = c2988i.f8244c;
                                                    c1.r(c1Var9, "", m14, !z21, 4);
                                                }
                                                r4 = true;
                                                break;
                                            case 24:
                                                if (K1.Q.e(c2988i.m())) {
                                                    long a16 = K1.S.a(c2988i.h(), (int) (c2988i.m() & 4294967295L));
                                                    c1Var10 = c2988i.f8242a;
                                                    z22 = c2988i.f8244c;
                                                    c1.r(c1Var10, "", a16, !z22, 4);
                                                } else {
                                                    c1Var11 = c2988i.f8242a;
                                                    long m15 = c2988i.m();
                                                    z23 = c2988i.f8244c;
                                                    c1.r(c1Var11, "", m15, !z23, 4);
                                                }
                                                r4 = true;
                                                break;
                                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                                if (K1.Q.e(c2988i.m())) {
                                                    long a17 = K1.S.a((int) (c2988i.m() >> 32), c2988i.g());
                                                    c1Var12 = c2988i.f8242a;
                                                    z24 = c2988i.f8244c;
                                                    c1.r(c1Var12, "", a17, !z24, 4);
                                                } else {
                                                    c1Var13 = c2988i.f8242a;
                                                    long m16 = c2988i.m();
                                                    z25 = c2988i.f8244c;
                                                    c1.r(c1Var13, "", m16, !z25, 4);
                                                }
                                                r4 = true;
                                                break;
                                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                                if (z12) {
                                                    ((F0.l) function0).invoke();
                                                } else {
                                                    eVar = c1Var.f7171a;
                                                    G0.c cVar = G0.c.MergeIfPossible;
                                                    eVar.d().f().b();
                                                    I d11 = eVar.d();
                                                    d11.c();
                                                    H.a(d11, "\n", 1);
                                                    D0.e.a(eVar, true, cVar);
                                                }
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                                if (!z12) {
                                                    eVar2 = c1Var.f7171a;
                                                    G0.c cVar2 = G0.c.MergeIfPossible;
                                                    eVar2.d().f().b();
                                                    I d12 = eVar2.d();
                                                    d12.c();
                                                    H.a(d12, "\t", 1);
                                                    D0.e.a(eVar2, true, cVar2);
                                                    r4 = true;
                                                    break;
                                                }
                                                break;
                                            case 28:
                                                c2988i.I();
                                                r4 = true;
                                                break;
                                            case 29:
                                                c2988i.s();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                                c2988i.y();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                                c2988i.t();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 32:
                                                c2988i.z();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 33:
                                                c2988i.x();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 34:
                                                c2988i.v();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                                c2988i.F();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                                c2988i.C();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                c2988i.D();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 38:
                                                c2988i.E();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                c2988i.G();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 40:
                                                c2988i.q();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 41:
                                                c2988i.H();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 42:
                                                c2988i.r();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case 43:
                                                c2988i.B();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                c2988i.A();
                                                c2988i.J();
                                                r4 = true;
                                                break;
                                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                c2988i.e();
                                                r4 = true;
                                                break;
                                            case 46:
                                                c1Var.w();
                                                r4 = true;
                                                break;
                                            case 47:
                                                c1Var.o();
                                                r4 = true;
                                                break;
                                            default:
                                                r4 = true;
                                                break;
                                        }
                                        if (!K1.Q.d(c2988i.m(), c2988i.f().d())) {
                                            c1Var.t(c2988i.m());
                                        }
                                    }
                                }
                            }
                            c7460f = null;
                            if (c7460f != null) {
                            }
                        }
                    }
                    f7 = Float.NaN;
                    c2988i = new C2988i(c1Var, f11, z26, f7, c2989j);
                    switch (a.f7088a[a13.ordinal()]) {
                    }
                    if (!K1.Q.d(c2988i.m(), c2988i.f().d())) {
                    }
                }
            } else {
                String sb2 = new StringBuilder(2).appendCodePoint(a11.intValue()).toString();
                if (z11) {
                    boolean z27 = !((keyEvent.getFlags() & 2) == 2);
                    eVar3 = c1Var.f7171a;
                    G0.c cVar3 = G0.c.MergeIfPossible;
                    eVar3.d().f().b();
                    I d13 = eVar3.d();
                    d13.c();
                    H.a(d13, sb2, 1);
                    D0.e.a(eVar3, z27, cVar3);
                    c2989j.b();
                    return true;
                }
            }
        }
        return r4;
    }

    public boolean b(@NotNull KeyEvent keyEvent, @NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull j1.i iVar, @NotNull P1 p12) {
        if (K1.Q.e(c1Var.j().d()) || !B0.G0.a(keyEvent)) {
            return false;
        }
        c2990k.E();
        return true;
    }
}
