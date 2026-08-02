package A0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.ads.C1639u7;
import i4.InterfaceC2015a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p4.AbstractC2282w;
import p4.C2263c;
import p4.C2275o;
import p4.EnumC2281v;
import q4.C2313c;

/* renamed from: A0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010a0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f461l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0010a0 f447m = new C0010a0(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0010a0 f448n = new C0010a0(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0010a0 f449o = new C0010a0(0, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0010a0 f450p = new C0010a0(0, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0010a0 f451q = new C0010a0(0, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C0010a0 f452r = new C0010a0(0, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C0010a0 f453s = new C0010a0(0, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C0010a0 f454t = new C0010a0(0, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C0010a0 f455u = new C0010a0(0, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C0010a0 f456v = new C0010a0(0, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final C0010a0 f457w = new C0010a0(0, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final C0010a0 f458x = new C0010a0(0, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final C0010a0 f459y = new C0010a0(0, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final C0010a0 f460z = new C0010a0(0, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final C0010a0 f434A = new C0010a0(0, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final C0010a0 f435B = new C0010a0(0, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final C0010a0 f436C = new C0010a0(0, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final C0010a0 f437D = new C0010a0(0, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final C0010a0 f438E = new C0010a0(0, 18);

    /* renamed from: F, reason: collision with root package name */
    public static final C0010a0 f439F = new C0010a0(0, 19);

    /* renamed from: G, reason: collision with root package name */
    public static final C0010a0 f440G = new C0010a0(0, 20);

    /* renamed from: H, reason: collision with root package name */
    public static final C0010a0 f441H = new C0010a0(0, 21);

    /* renamed from: I, reason: collision with root package name */
    public static final C0010a0 f442I = new C0010a0(0, 22);
    public static final C0010a0 J = new C0010a0(0, 23);
    public static final C0010a0 K = new C0010a0(0, 24);

    /* renamed from: L, reason: collision with root package name */
    public static final C0010a0 f443L = new C0010a0(0, 25);

    /* renamed from: M, reason: collision with root package name */
    public static final C0010a0 f444M = new C0010a0(0, 26);

    /* renamed from: N, reason: collision with root package name */
    public static final C0010a0 f445N = new C0010a0(0, 27);

    /* renamed from: O, reason: collision with root package name */
    public static final C0010a0 f446O = new C0010a0(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0010a0(int i, int i5) {
        super(i);
        this.f461l = i5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        p4.K k5;
        a4.h h3;
        Choreographer choreographer;
        switch (this.f461l) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    w4.e eVar = p4.D.f18743a;
                    C2313c c2313c = u4.m.f20109a;
                    i4.e c0050o0 = new C0050o0(2, null);
                    Thread currentThread = Thread.currentThread();
                    a4.d dVar = a4.d.f6648k;
                    a4.e eVar2 = (a4.e) c2313c.l(dVar);
                    a4.i iVar = a4.i.f6649k;
                    if (eVar2 == null) {
                        k5 = p4.k0.a();
                        h3 = AbstractC2282w.h(iVar, G4.l.H(c2313c, k5), true);
                        w4.e eVar3 = p4.D.f18743a;
                        if (h3 != eVar3 && h3.l(dVar) == null) {
                            h3 = h3.m(eVar3);
                        }
                    } else {
                        if (eVar2 instanceof p4.K) {
                        }
                        k5 = (p4.K) p4.k0.f18800a.get();
                        h3 = AbstractC2282w.h(iVar, c2313c, true);
                        w4.e eVar4 = p4.D.f18743a;
                        if (h3 != eVar4 && h3.l(dVar) == null) {
                            h3 = h3.m(eVar4);
                        }
                    }
                    C2263c c2263c = new C2263c(h3, currentThread, k5);
                    c2263c.e0(EnumC2281v.f18821k, c2263c, c0050o0);
                    p4.K k6 = c2263c.f18783o;
                    if (k6 != null) {
                        int i = p4.K.f18753p;
                        k6.K(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long L5 = k6 != null ? k6.L() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p4.b0.f18780k;
                            if (atomicReferenceFieldUpdater.get(c2263c) instanceof p4.O) {
                                LockSupport.parkNanos(c2263c, L5);
                            } else {
                                if (k6 != null) {
                                    int i5 = p4.K.f18753p;
                                    k6.H(false);
                                }
                                Object u5 = AbstractC2282w.u(atomicReferenceFieldUpdater.get(c2263c));
                                C2275o c2275o = u5 instanceof C2275o ? (C2275o) u5 : null;
                                if (c2275o != null) {
                                    throw c2275o.f18812a;
                                }
                                choreographer = (Choreographer) u5;
                            }
                        } catch (Throwable th) {
                            if (k6 != null) {
                                int i6 = p4.K.f18753p;
                                k6.H(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    c2263c.y(interruptedException);
                    throw interruptedException;
                }
                C0055r0 c0055r0 = new C0055r0(choreographer, G4.d.l(Looper.getMainLooper()));
                return G4.l.H(c0055r0, c0055r0.f565v);
            case 6:
            case 7:
                return null;
            case 8:
                I0.b("LocalAutofillManager");
                throw null;
            case 9:
                I0.b("LocalAutofillTree");
                throw null;
            case 10:
                I0.b("LocalClipboard");
                throw null;
            case 11:
                I0.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                I0.b("LocalDensity");
                throw null;
            case 14:
                I0.b("LocalFocusManager");
                throw null;
            case 15:
                I0.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                I0.b("LocalFontLoader");
                throw null;
            case 17:
                I0.b("LocalGraphicsContext");
                throw null;
            case 18:
                I0.b("LocalHapticFeedback");
                throw null;
            case 19:
                I0.b("LocalInputManager");
                throw null;
            case 20:
                I0.b("LocalLayoutDirection");
                throw null;
            case C1639u7.zzm /* 21 */:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                I0.b("LocalTextToolbar");
                throw null;
            case 26:
                I0.b("LocalUriHandler");
                throw null;
            case 27:
                I0.b("LocalViewConfiguration");
                throw null;
            default:
                I0.b("LocalWindowInfo");
                throw null;
        }
    }
}
