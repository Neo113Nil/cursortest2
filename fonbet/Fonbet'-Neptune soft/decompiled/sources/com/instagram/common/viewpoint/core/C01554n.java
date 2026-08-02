package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.4n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01554n extends AbstractC0480Hr {
    public static byte[] A0b;
    public static String[] A0c = {"uwiFFMiPjkxeIpnCelDmRbiHk5Vwnfgt", "wLfFuslsjBH4uPGwj2Xycf6hIgRvR8Oe", "HvNwre", "LU1P5nNd", "IrSP0rhp", "3tH6XBAURu1AudBFEixfPGQY1Q", "mKjuxDaulnRYw", "yhw0zrPGEZfB7fyQoDKXN69L0o"};
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public float A00;
    public C0616My A01;
    public C0850Wd A02;
    public C1143dA A03;
    public EnumC1169db A04;
    public C0348Co A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Handler A0F;
    public final View A0G;
    public final C1153dL A0H;
    public final C0796Ua A0I;
    public final AbstractC0883Xm A0J;
    public final AbstractC0944Zv A0K;
    public final KE A0L;
    public final InterfaceC1100cT A0M;
    public final C1137d4 A0N;
    public final EG A0O;
    public final E1 A0P;
    public final C01243i A0Q;
    public final DX A0R;
    public final DV A0S;
    public final DR A0T;
    public final DP A0U;
    public final DN A0V;
    public final DM A0W;
    public final D9 A0X;
    public final C0356Cw A0Y;
    public final boolean A0Z;
    public final boolean A0a;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0b, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A0b = new byte[]{82, 94, 92, Ascii.US, 87, 80, 82, 84, 83, 94, 94, 90, Ascii.US, 80, 85, 66, Ascii.US, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, Ascii.US, 82, 93, 88, 82, 90, 84, 85, 54, 33, 51, 37, 54, 32, 33, 32, Ascii.ESC, 50, 45, 32, 33, 43, 105, 118, 123, 122, 112};
    }

    static {
        A0J();
        A0k = (int) (AbstractC0856Wl.A02 * 48.0f);
        A0i = OP.A02(-1, 77);
        A0p = (int) (AbstractC0856Wl.A02 * 26.0f);
        A0q = (int) (AbstractC0856Wl.A02 * 12.0f);
        A0m = (int) (AbstractC0856Wl.A02 * 12.0f);
        A0n = (int) (AbstractC0856Wl.A02 * 44.0f);
        A0l = (int) (AbstractC0856Wl.A02 * 8.0f);
        A0o = (int) (AbstractC0856Wl.A02 * 16.0f);
        A0j = OP.A02(A0i, 90);
        A0h = (int) (AbstractC0856Wl.A02 * 4.0f);
        A0g = (int) (AbstractC0856Wl.A03 * 32.0f);
        A0d = (int) (AbstractC0856Wl.A02 * 12.0f);
        A0e = (int) (AbstractC0856Wl.A02 * 16.0f);
        A0f = (int) (AbstractC0856Wl.A02 * 48.0f);
    }

    public C01554n(C1153dL c1153dL, US us, AbstractC1428hy abstractC1428hy, SF sf, YY yy, int i, InterfaceC0884Xn interfaceC0884Xn, C0796Ua c0796Ua, AbstractC0883Xm abstractC0883Xm, int i2, int customVideoDurationMs, int i3, boolean z, int i4, boolean z2, boolean z3, boolean z4, InterfaceC1100cT interfaceC1100cT, int i5, int i6) {
        super(c1153dL, yy, us, abstractC1428hy, i, z3, z4, interfaceC0884Xn, i6);
        C0616My A00;
        this.A0F = new Handler(Looper.getMainLooper());
        this.A00 = 0.0f;
        this.A06 = false;
        this.A07 = false;
        this.A09 = false;
        this.A0V = new DN() { // from class: com.facebook.ads.redexgen.X.4y
            public static String[] A01 = {"7gUYNYKFrrI6cUcpcHgvAqL4Gs6ZbmaO", "eulXJJXioKb3UmnXwerKdv", "DeECHluE8BU5loeJcqNW1HYG1mHcuBH8", "x81kE4wfDh8vlLxHq80CctXU2mbMn00Z", "zBHmazzeC9pHgiKU9uedQ6l4AdxQz", "WRgOWCAEbqLirqS5ZGHJuFqEkTHfhP5W", "572CNMLKJv9WD0LgrUqd1zfS4LkJfaLe", "B1saI0DOHUkU6pw"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r11) {
                C0356Cw c0356Cw;
                KE ke;
                C1153dL c1153dL2;
                C1153dL c1153dL3;
                AbstractC0944Zv abstractC0944Zv;
                AbstractC0944Zv abstractC0944Zv2;
                AbstractC0944Zv abstractC0944Zv3;
                C01554n.this.A09 = true;
                if (C01554n.this.getAdDataBundle().A1U()) {
                    c1153dL2 = C01554n.this.A0H;
                    MH A002 = MI.A00(c1153dL2, ((AbstractC0480Hr) C01554n.this).A08, "", WQ.A00(((AbstractC0480Hr) C01554n.this).A06.A20().A0J().A05()), new HashMap(), ((AbstractC0480Hr) C01554n.this).A06.A21());
                    c1153dL3 = C01554n.this.A0H;
                    c1153dL3.A0F().AJw(AbstractC0847Wa.A00((float) ((AbstractC0480Hr) C01554n.this).A06.A0h()), C01554n.this.getResources().getConfiguration().orientation, true, true, MH.A0C(A002));
                    C01554n.this.A0L(C01554n.this.getResources().getConfiguration().orientation);
                    abstractC0944Zv = C01554n.this.A0K;
                    abstractC0944Zv.setVisibility(0);
                    abstractC0944Zv2 = C01554n.this.A0K;
                    if (abstractC0944Zv2 instanceof KL) {
                        abstractC0944Zv3 = C01554n.this.A0K;
                        ((KL) abstractC0944Zv3).A0q(C01554n.this.getResources().getConfiguration().orientation);
                    }
                }
                if (C01554n.this.getAdDataBundle().A1W()) {
                    C01554n c01554n = C01554n.this;
                    if (A01[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[2] = "UfF1b519MGYLAJGTcPK3SRNJ7v4WOh3N";
                    strArr[0] = "9iqifXeSGzjDh5N7cdDazqMOJ7agOy96";
                    c0356Cw = c01554n.A0Y;
                    ke = C01554n.this.A0L;
                    c0356Cw.setOnClickListener(ke);
                }
            }
        };
        this.A0U = new DP() { // from class: com.facebook.ads.redexgen.X.4x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                if (!((AbstractC0480Hr) C01554n.this).A0A.A07()) {
                    C01554n.this.A1C();
                }
            }
        };
        this.A0T = new DR() { // from class: com.facebook.ads.redexgen.X.4s
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            public final /* bridge */ /* synthetic */ void A03(C3Y c3y) {
            }
        };
        this.A0W = new DM() { // from class: com.facebook.ads.redexgen.X.4r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                float f;
                E1 e1;
                InterfaceC1100cT interfaceC1100cT2;
                C01554n.this.A0Q(c3q);
                f = C01554n.this.A00;
                e1 = C01554n.this.A0P;
                float duration = (f * e1.getDuration()) + c3q.A00();
                interfaceC1100cT2 = C01554n.this.A0M;
                interfaceC1100cT2.ADI(duration);
            }
        };
        this.A0R = new DX() { // from class: com.facebook.ads.redexgen.X.4q
            public static String[] A01 = {"wKs2F0CoKZ83CrYftessGgwUooVDkZ8i", "2Ibb583RxwN39nWjhOn5WWPQj1VmynHE", "A0Qs557f", "DKPVxx7rRSfdfe4bDqdhQ5dEhLiH9LON", "bebhf1UP90kEJwgsUj64UnMMPskca", "Y97MwE7h44FvVbPafIuJT7XHPF7ToAyu", "yGLwGxqGR6Hkk5b2IyfusTMojDv2e", "vJPYkkaf"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C01193d c01193d) {
                InterfaceC1100cT interfaceC1100cT2;
                E1 e1;
                float f;
                InterfaceC1100cT interfaceC1100cT3;
                E1 e12;
                interfaceC1100cT2 = C01554n.this.A0M;
                e1 = C01554n.this.A0P;
                interfaceC1100cT2.ACy(e1.getDuration());
                f = C01554n.this.A00;
                if (f < ((AbstractC0480Hr) C01554n.this).A06.A20().A0G()) {
                    C01554n.A01(C01554n.this, 1.0f);
                    e12 = C01554n.this.A0P;
                    e12.A0h(EnumC1169db.A02, 28);
                    return;
                }
                C01554n c01554n = C01554n.this;
                String[] strArr = A01;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "gUju5w26hU6oOlSn7mf4ATVXJhH4p8zJ";
                strArr2[1] = "33WeYKtkMTovDIRRTCZ4bD6vTYI44Qru";
                if (!c01554n.A1I()) {
                    interfaceC1100cT3 = C01554n.this.A0M;
                    interfaceC1100cT3.ACZ();
                } else {
                    C01554n.this.A1D();
                }
            }
        };
        this.A0S = new C01574p(this);
        this.A0H = c1153dL;
        this.A0I = c0796Ua;
        this.A0J = abstractC0883Xm;
        this.A0E = i5;
        int i7 = -1;
        if (!super.A06.A1U()) {
            this.A0G = new D1(this.A0H, c0796Ua);
        } else {
            i7 = i5;
            this.A0G = new D0(this.A0H, c0796Ua);
        }
        this.A0Y = new C0356Cw(this.A0H, i7);
        if (this.A00 < abstractC1428hy.A20().A0G()) {
            this.A0Y.setShouldClearAnimationWhenVideoCompleted(false);
        }
        this.A0C = i4;
        this.A0a = z2;
        this.A0B = i2;
        this.A0D = customVideoDurationMs;
        this.A0M = interfaceC1100cT;
        this.A0A = i3;
        this.A0Z = z;
        this.A0N = new C1137d4(this.A0H, us, super.A06);
        if (customVideoDurationMs == 1) {
            A00 = super.A06.A1z().A01();
        } else {
            A00 = super.A06.A1z().A00();
        }
        this.A01 = A00;
        this.A0P = new E1(this.A0H);
        this.A0P.getEventBus().A03(this.A0V, this.A0U, this.A0T, this.A0W, this.A0R, this.A0S);
        this.A0Q = new C01243i(c1153dL, us, this.A0P, abstractC1428hy.A25(), 0, 0, abstractC1428hy.A20().A0U(), null, null);
        A0I();
        this.A0P.setVideoURI(sf.A0T(super.A06.A20().A0H().A09()));
        A0H();
        C0851Wg A02 = super.A09.A02(abstractC1428hy);
        this.A0H.A0H().A00(A02.A01);
        this.A0K = A06();
        if (this.A0K instanceof C0539Jy) {
            new CU(this.A0K, 400, 100, 0).A42(true, false);
        } else {
            this.A0K.setVisibility(8);
        }
        this.A0X = new D9(true, abstractC1428hy.A20().A0U());
        A0K();
        this.A0L = this.A0K.getCTAButton();
        if (A02.A00) {
            this.A0P.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C01554n.this.A1L(view);
                }
            });
        }
        XP.A0E(1001, this.A0L);
        A0G();
        if (!getAdDataBundle().A1U()) {
            A0F();
        }
        this.A0K.bringToFront();
        if (U7.A1u(this.A0H)) {
            this.A0H.A0B().AK2(this.A0P, super.A06.A25(), true);
        }
        if (U7.A1v(this.A0H)) {
            this.A0O = new EG(this.A0H, us, this.A0P, super.A06.A25(), abstractC1428hy.A20().A0U(), this.A0Q, null);
        } else {
            this.A0O = null;
        }
    }

    public static /* synthetic */ float A01(C01554n c01554n, float f) {
        float f2 = c01554n.A00 + f;
        c01554n.A00 = f2;
        return f2;
    }

    private AbstractC0944Zv A06() {
        String A0C;
        AbstractC0944Zv c0539Jy;
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -2);
        adDetailsParams.addRule(12);
        if (super.A06.A0v().equals(A0C(37, 14, 3))) {
            A0C = EnumC1175dh.A04.A03();
        } else {
            A0C = A0C(0, 37, 118);
        }
        double A0h2 = super.A06.A0h();
        if (getAdDataBundle().A1U()) {
            if (E1.A0T((float) A0h2)) {
                c0539Jy = new C01845q(this.A0H, this.A0L, AbstractC0480Hr.A0G, false, getColors(), A0C, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0Y, this.A0I, false);
            } else {
                if (A0c[1].charAt(3) != 'F') {
                    throw new RuntimeException();
                }
                String[] strArr = A0c;
                strArr[5] = "xymrPLzTH8UHDAaiBZe05WSUA2";
                strArr[7] = "XCaDYNVy2gwp6c65cWzWipC7tC";
                if (E1.A0V((float) A0h2)) {
                    c0539Jy = new C01835p(this.A0H, this.A0L, AbstractC0480Hr.A0G, false, getColors(), A0C, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0Y, this.A0I, false);
                } else {
                    c0539Jy = new C01855r(this.A0H, this.A0L, AbstractC0480Hr.A0G, false, getColors(), A0C, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0Y, this.A0I, false);
                }
            }
            ((KL) c0539Jy).setChainedAdInfo(super.A00);
        } else {
            c0539Jy = new C0539Jy(this.A0H, null, A0k, super.A06.A20().A0I().A00() == EnumC0612Mu.A05, getColors(), super.A06.A20().A0J().A06(), A0C, super.A08, super.A0B, super.A0D, super.A0A, super.A06);
        }
        c0539Jy.getCTAButton().getCtaActionHelper().A08(super.A06);
        c0539Jy.getCTAButton().setCreativeAsCtaLoggingHelper(super.A09);
        XP.A0E(PointerIconCompat.TYPE_TEXT, c0539Jy);
        c0539Jy.A0h(this.A0D);
        addView(c0539Jy, adDetailsParams);
        c0539Jy.setInfo(super.A06.A20().A0I(), super.A06.A20().A0J(), super.A06.A25(), super.A06.A23().A01(), null, null);
        return c0539Jy;
    }

    private void A0D() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A03 != null) {
            C1143dA c1143dA = this.A03;
            if (A0c[6].length() != 13) {
                throw new RuntimeException();
            }
            A0c[0] = "pczVUfQTZlSxQoKEEMr5D2oLadoOsoUQ";
            c1143dA.A0a(false);
            addView(this.A03.A0T(), layoutParams);
        }
    }

    private void A0E() {
        if (getAdDataBundle().A20().A0K().A03() && !getAdDataBundle().A20().A0K().A02().isEmpty()) {
            XP.A0Z(this.A0K, this.A0G, this.A0L);
            this.A03 = new C1143dA(this.A0H, getAdDataBundle(), super.A0B, this.A0L, this.A0F, this.A0I);
            A0D();
        } else {
            if (getAdDataBundle().A20().A0K().A04() || getAdDataBundle().A20().A0K().A03()) {
                XP.A0Z(this.A0K, this.A0G, this.A0L);
                C1003au c1003au = new C1003au(this.A0H, super.A06, this.A0I, this.A0F, super.A0B);
                c1003au.A0D(false);
                addView(c1003au.A09(this.A0L));
                return;
            }
            Pair<EnumC1136d3, View> A03 = this.A0N.A03(this.A0L);
            View endCardView = (View) A03.second;
            XP.A0E(1101, endCardView);
            A0P((EnumC1136d3) A03.first, endCardView);
        }
    }

    private void A0F() {
        this.A0Y.A08(-1, A0i, false);
        this.A0Y.setPadding(A0q, A0q, A0q, A0q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0p);
        layoutParams.addRule(12);
        addView(this.A0Y, layoutParams);
    }

    private void A0G() {
        RelativeLayout.LayoutParams layoutParams;
        if (!super.A06.A1U()) {
            this.A0G.setPadding(A0m, A0m, A0m, A0m);
            layoutParams = new RelativeLayout.LayoutParams(A0n, A0n);
            layoutParams.setMargins(0, AbstractC0883Xm.A00, A0l, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(A0g, A0g);
            layoutParams.setMargins(A0e, A0f, A0e, A0d);
            layoutParams.addRule(9);
        }
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0P, videoViewParams);
        addView(this.A0G, layoutParams);
    }

    private void A0H() {
        postDelayed(new HL(this), U7.A0P(this.A0H));
    }

    private void A0I() {
        this.A0P.A0i(this.A0Y);
        if (this.A0G instanceof InterfaceC1170dc) {
            this.A0P.A0i((InterfaceC1170dc) this.A0G);
        }
        if (!TextUtils.isEmpty(super.A06.A20().A0H().A08())) {
            C01052p c01052p = new C01052p(this.A0H);
            this.A0P.A0i(c01052p);
            c01052p.setImage(super.A06.A20().A0H().A08());
        }
        this.A0P.A0i(new C2Y(this.A0H));
    }

    private final void A0K() {
        View expandableLayout = this.A0K.getExpandableLayout();
        if (expandableLayout != null) {
            if (this.A05 != null) {
                D9 d9 = this.A0X;
                C0348Co c0348Co = this.A05;
                String[] strArr = A0c;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0c[1] = "yPUFQNIw4jpGFPLG5nXj9YsdQuCVJrWl";
                d9.A0L(c0348Co);
            }
            C0616My A01 = super.A06.A1z().A01();
            this.A0X.A0L(new CY(this.A0K.getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, -1, A01.A0A(true)));
            Drawable A08 = XP.A08(A0i, A0j, A0h);
            Drawable endDrawable = XP.A05(A01.A09(true), A0h);
            this.A0X.A0L(new C0349Cp(this.A0K.getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, A08, endDrawable));
            this.A0X.A0L(new CZ(expandableLayout, Opcodes.FCMPG, false));
            this.A0X.AAm(this.A0P);
            this.A0X.A0K(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (!getAdDataBundle().A1U()) {
            return;
        }
        this.A0H.A0F().AJy(i);
        this.A0P.A0c(i);
        A0M(i, this.A0P, (RelativeLayout) this.A0P.getVideoView());
    }

    private final void A0M(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (this.A0K instanceof KL) {
            boolean z = this.A0K instanceof C01855r;
            if (A0c[0].charAt(8) == 'J') {
                throw new RuntimeException();
            }
            String[] strArr = A0c;
            strArr[5] = "oeSYnKfd6qg69aJdYBhoeO0UNx";
            strArr[7] = "WvPjUISg3i5kB9lwMl0NPsGMqU";
            if (z || (this.A0K instanceof C01845q)) {
                XP.A0H(this.A0K);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    this.A0K.setLayoutParams(layoutParams);
                    viewGroup.addView(this.A0K);
                } else {
                    addView(this.A0K, layoutParams);
                }
            }
            this.A0K.A0h(i);
            ((KL) this.A0K).A0s(viewGroup, relativeLayout, i);
        }
    }

    private void A0P(EnumC1136d3 enumC1136d3, View view) {
        this.A0P.A0k(false);
        this.A0P.setVisibility(8);
        switch (C1078c7.A00[enumC1136d3.ordinal()]) {
            case 1:
                this.A0K.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, AbstractC0883Xm.A00, 0, 0);
                layoutParams.addRule(2, this.A0K.getId());
                addView(view, layoutParams);
                break;
            case 2:
                XP.A0Z(this.A0K);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(A0o, A0o, A0o, A0o);
                addView(view, layoutParams2);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(C3Q c3q) {
        if (this.A0P.getState() == EnumC1223eU.A02 && U7.A1Z(this.A0H)) {
            postDelayed(new HJ(this, c3q), 5000L);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final ME A1A(String str) {
        return this.A0L.A0E(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1B() {
        super.A1B();
        if (this.A02 != null) {
            C0850Wd c0850Wd = this.A02;
            String[] strArr = A0c;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0c;
            strArr2[4] = "vVds5dTr";
            strArr2[3] = "mwltsewL";
            c0850Wd.A06();
        }
        this.A0F.removeCallbacksAndMessages(null);
        if (U7.A1u(this.A0H)) {
            this.A0H.A0B().AJj(this.A0P);
        }
        if (this.A0O != null) {
            this.A0O.A07();
        }
        if (this.A0P != null) {
            this.A0P.getEventBus().A04(this.A0V, this.A0U, this.A0T, this.A0W, this.A0R, this.A0S);
            XP.A0F(this.A0P);
            this.A0P.A0Z();
        }
        this.A0Q.A0p();
        XP.A0Z(this.A0P, this.A0Y, this.A0G);
        super.A0D.A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1D() {
        this.A0H.A0F().A4p();
        this.A06 = true;
        XP.A0R(this);
        XP.A0F(this.A0P);
        XP.A0Z(this.A0P, this.A0Y, this.A0G);
        A0E();
        if (this.A0A != 0 || !this.A0Z) {
            this.A0M.AFE(true);
            if (this.A0J != null && getAdDataBundle().A20().A0K().A00() > 0) {
                this.A07 = false;
                if (getAdDataBundle().A2G()) {
                    this.A0J.setToolbarActionMode(8);
                } else {
                    this.A0J.setToolbarActionMode(2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1077c6(this), getAdDataBundle().A20().A0K().A00());
                return;
            }
            this.A07 = true;
            return;
        }
        if (this.A0a) {
            this.A0M.AJr();
        }
        if (this.A0J != null) {
            this.A0J.setToolbarActionMode(getAdDataBundle().A2G() ? 8 : 2);
        }
        this.A02 = new C0850Wd(this.A0C, 100.0f, 100L, new Handler(Looper.getMainLooper()), new HP(this));
        this.A02.A07();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1E() {
        E1 e1 = this.A0P;
        int secondsForNextCta = super.A06.A20().A0H().A0A() ? 0 : 1065353216;
        e1.setVolume(secondsForNextCta);
        this.A0P.A0h(EnumC1169db.A02, 20);
        int A02 = super.A06.A20().A0H().A02();
        if (A02 >= 0) {
            this.A0J.setProgressSpinnerInvisible(true);
        }
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0E;
            if (A02 < secondsForNextCta2) {
                if (A02 > 0) {
                    new C0850Wd(A02, new HM(this)).A07();
                    return;
                }
                return;
            }
        }
        AbstractC0883Xm abstractC0883Xm = this.A0J;
        if (A0c[6].length() != 13) {
            throw new RuntimeException();
        }
        A0c[6] = "z6ph3MLFkPTln";
        abstractC0883Xm.setToolbarActionMode(8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1G(boolean z) {
        if (this.A02 != null) {
            this.A02.A06();
        }
        if (this.A0P.A0q()) {
            return;
        }
        this.A04 = this.A0P.getVideoStartReason();
        this.A08 = z;
        this.A0P.A0l(false, 13);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1H(boolean z) {
        if (this.A02 != null && !this.A02.A05()) {
            this.A02.A07();
        }
        if (this.A06 || this.A0P.getState() == EnumC1223eU.A06 || this.A04 == null) {
            return;
        }
        if (!this.A08 || z) {
            this.A0P.A0h(this.A04, 19);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final boolean A1I() {
        return (this.A0A == 2 || !super.A06.A20().A0V() || this.A06) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final boolean A1J() {
        return this.A06;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final boolean A1K() {
        return this.A07;
    }

    public final /* synthetic */ void A1L(View view) {
        this.A0L.A0E(A0C(51, 5, 88));
    }

    public C0616My getColors() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public C1098cR getFullScreenAdStyle() {
        return new C1098cR(true, C1098cR.A06, super.A06.A1z().A01(), KE.A05(super.A06), super.A06.A1z().A01().A08(true), super.A06.A20().A0H().A08());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public XH getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C0616My A00;
        super.onConfigurationChanged(configuration);
        if (!this.A06) {
            if (getAdDataBundle().A1U()) {
                A0L(configuration.orientation);
                return;
            }
            if (configuration.orientation == 1) {
                C0604Ml A1z = super.A06.A1z();
                String[] strArr = A0c;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A0c[1] = "ZWQFADQdeKHmDIXasxpY6pydlWSUwrFV";
                A00 = A1z.A01();
            } else {
                A00 = super.A06.A1z().A00();
            }
            this.A01 = A00;
            this.A0L.setViewShowsOverMedia(true);
            this.A0L.setUpButtonColors(this.A01);
            this.A0K.A0h(configuration.orientation);
            return;
        }
        if (this.A03 == null) {
            return;
        }
        this.A03.A0W(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!getAdDataBundle().A1U() && (expandableLayout = this.A0K.getExpandableLayout()) != null && z && this.A05 == null) {
            this.A05 = new C0348Co(expandableLayout, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, expandableLayout.getHeight(), 0);
            this.A0X.A0L(this.A05);
            this.A0X.A0J();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1H(false);
        } else {
            A1G(false);
        }
    }
}
