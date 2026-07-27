package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public final class MW extends RelativeLayout implements InterfaceC2472Yi {
    public static byte[] A0V;
    public static String[] A0W = {"K2KQx5j", "I1DdEcIQOKACt5VfynDO8RkkSmVrIdSu", "CrPvtz5bwgp8q96Y41ywgNmdDqzXYyT", "BcZqlHBP86U0O", "mAAXLn1achaKS", "KDsASou", "qHjTnlroNJSmFEFt4pVmvH8neAK9EJVy", "ok9QX18270ZP2OGfEK6N7HjWUQBUEH7u"};
    public static final int A0X;
    public int A00;
    public C2292Re A01;
    public XO A02;
    public C2520a4 A03;
    public C2535aJ A04;
    public C2539aN A05;
    public C2605bR A06;
    public ViewOnClickListenerC2128Kr A07;
    public C2785eM A08;
    public C2791eS A09;
    public C2798ea A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final AbstractC3095jd A0G;
    public final C2202No A0H;
    public final InterfaceC2298Rk A0I;
    public final C2930gi A0J;
    public final VA A0K;
    public final VI A0L;
    public final XO A0M;
    public final ViewOnSystemUiVisibilityChangeListenerC2461Xx A0N;
    public final InterfaceC2471Yh A0O;
    public final ZU A0P;
    public final C2781eI A0Q;
    public final AtomicBoolean A0R;
    public final AtomicBoolean A0S;
    public final boolean A0T;
    public final AbstractC2465Yb A0U;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0V = new byte[]{-81, -72, -75, -81, -73, -85, -69, -66, -75, -77, -75, -70, -99, -90, -93, -99, -91, -103, -83, -87, -81, -84, -99, -97, -7, -20, -1, -12, 1, -16, -22, -18, -9, -12, -18, -10, Ascii.CAN, Ascii.DC4, 9, Ascii.VT, Ascii.CR, Ascii.NAK, Ascii.CR, Ascii.SYN, Ascii.FS, -18, -26, -28, -21, 3, -15, -18, 2, -11, -15, 3, -21, -17, -8, -11, -17, -9};
    }

    static {
        A0P();
        A0X = XV.A03;
    }

    public MW(C2930gi c2930gi, VA va, InterfaceC2471Yh interfaceC2471Yh, AbstractC3095jd abstractC3095jd, C2202No c2202No, String str, ZU zu) {
        super(c2930gi);
        this.A0C = false;
        this.A0B = false;
        this.A0F = new Handler(Looper.getMainLooper());
        this.A0R = new AtomicBoolean(false);
        this.A0D = false;
        this.A0S = new AtomicBoolean(false);
        this.A0I = new C2175Mm(this);
        this.A0J = c2930gi;
        this.A0K = va;
        this.A0O = interfaceC2471Yh;
        this.A0G = abstractC3095jd;
        this.A0H = c2202No;
        this.A0P = zu;
        this.A0L = new VI(this.A0G.A2E(), this.A0K);
        this.A0A = new C2798ea(c2930gi, this.A0P, str, this.A0O);
        C2175Mm c2175Mm = null;
        this.A0M = new XO(this.A0H.A0C(), new C2164Mb(this, c2175Mm));
        this.A0T = this.A0G.A1v();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.A00 = getResources().getConfiguration().orientation;
        this.A0N = new ViewOnSystemUiVisibilityChangeListenerC2461Xx(this);
        this.A0N.A05(EnumC2460Xw.A03);
        C2163Ma c2163Ma = new C2163Ma(this, c2175Mm);
        HashMap hashMap = new HashMap();
        hashMap.put(A09(36, 9, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), this.A0P.A8l());
        this.A0Q = new C2781eI(this.A0J, this.A0G, this.A0H, this.A0K, c2163Ma, hashMap);
        this.A0U = A04();
        this.A07 = A06();
        this.A0O.A45(this, new RelativeLayout.LayoutParams(-1, -1));
        A0M();
        if (!this.A0H.A0b()) {
            A0b();
        }
    }

    private PU A04() {
        PU pu = new PU(this.A0J, this.A0G, 4);
        pu.setToolbarListener(new InterfaceC2464Ya() { // from class: com.facebook.ads.redexgen.X.NB
            @Override // com.instagram.common.viewpoint.core.InterfaceC2464Ya
            public final void ACl(AbstractC2465Yb abstractC2465Yb) {
                MW.this.A0d(abstractC2465Yb);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(XV.A00, XV.A0N, XV.A00, XV.A00);
        pu.setLayoutParams(layoutParams);
        return pu;
    }

    private ViewOnClickListenerC2128Kr A06() {
        if (this.A0Q != null) {
            C2781eI c2781eI = this.A0Q;
            if (A0W[1].charAt(5) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[5] = "DwrRGPH";
            strArr[0] = "aRDWSvq";
            if (c2781eI.getViewabilityChecker() != null && this.A0Q.getTouchDataRecorder() != null) {
                ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr = new ViewOnClickListenerC2128Kr(this.A0J, this.A0P.A7M(), this.A0G.A28().A01(), this.A0K, this.A0O, this.A0Q.getViewabilityChecker(), this.A0Q.getTouchDataRecorder(), this.A0G.A2A());
                viewOnClickListenerC2128Kr.setCta(this.A0G.A29().A0J(), this.A0G.A2E(), new HashMap(), null);
                viewOnClickListenerC2128Kr.setText(this.A0H.A0M());
                viewOnClickListenerC2128Kr.A0D();
                viewOnClickListenerC2128Kr.setTextSize(13.0f);
                viewOnClickListenerC2128Kr.setPadding(XV.A0D, XV.A00, XV.A0D, XV.A00);
                YB.A0P(viewOnClickListenerC2128Kr, -15902766, A0X);
                viewOnClickListenerC2128Kr.setElevation(0.0f);
                viewOnClickListenerC2128Kr.setStateListAnimator(null);
                viewOnClickListenerC2128Kr.setOutlineProvider(null);
                viewOnClickListenerC2128Kr.setOnClickListener(new ZA(this));
                return viewOnClickListenerC2128Kr;
            }
        }
        return null;
    }

    private void A0C() {
        this.A0U.setToolbarActionMode(2);
        this.A0D = true;
        this.A0L.A04(VH.A0Y, null);
        this.A0J.A0F().AFE();
        if (C2380Up.A1H(this.A0J)) {
            boolean z = this.A0T;
            if (A0W[2].length() == 32) {
                throw new RuntimeException();
            }
            A0W[6] = "k4geMuTXC1h9ucfhhM9HvzcpXwlG9hvy";
            if (z) {
                A0N();
                if (this.A0G.A29().A0S()) {
                    this.A0A.A06();
                    this.A0O.A4k(this.A0P.A6l(), new C4K(0, 0));
                }
            }
        }
        A0V(false, A09(45, 4, 79));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A0E = true;
        if (this.A0G.A29().A0S()) {
            this.A0A.A06();
            this.A0O.A4k(this.A0P.A6l(), new C4K(0, 0));
        }
    }

    private void A0E() {
        if (this.A03 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        layoutParams.setMargins(XV.A00, XV.A00, XV.A0F, XV.A00);
        this.A03.setLayoutParams(layoutParams);
    }

    private void A0F() {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        layoutParams.setMargins(XV.A00, XV.A00, XV.A09, XV.A09);
        this.A04.setLayoutParams(layoutParams);
    }

    private void A0G() {
        if (this.A05 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(20);
            layoutParams.addRule(12);
            layoutParams.setMargins(XV.A09, XV.A00, XV.A00, XV.A09);
            this.A05.setLayoutParams(layoutParams);
        }
    }

    private void A0H() {
        this.A03 = new C2520a4(this.A0J, this.A0G, null, this.A0O);
        A0E();
        addView(this.A03);
    }

    private void A0I() {
        if (this.A0G.A2W()) {
            A0L();
        }
        if (this.A0G.A2M()) {
            A0K();
        } else {
            A0H();
        }
    }

    private void A0J() {
        if (this.A07 == null) {
            return;
        }
        setClipChildren(false);
        this.A06 = new C2605bR(this.A0J, this.A0G, this.A07, this.A0H.A0B(), this.A0H.A0Z());
        A0Q(this.A00);
        addView(this.A06);
    }

    private void A0K() {
        this.A04 = AbstractC2540aO.A01(this.A0J, false, this.A0G, this.A0L, this.A0O, EnumC2538aM.A03, AbstractC2537aL.A00(this.A0G));
        A0F();
        addView(this.A04);
    }

    private void A0L() {
        this.A05 = AbstractC2540aO.A02(this.A0J, EnumC2538aM.A03, this.A0G);
        this.A05.setBackgroundColor(-2145637581);
        A0G();
        addView(this.A05);
    }

    private void A0M() {
        this.A0U.setVisibility(4);
        YB.A0K(this.A0U);
        this.A0Q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        A0R(this.A00);
        addView(this.A0Q);
        addView(this.A0U);
        if (this.A0H.A0a()) {
            A0J();
        }
        A0I();
        if (!this.A0H.A0Y()) {
            boolean A0b = this.A0H.A0b();
            if (A0W[1].charAt(5) != 'c') {
                throw new RuntimeException();
            }
            A0W[7] = "XlBnGmRHSm8FPKQHD6bIB4zK3mUoDq5y";
            if (!A0b) {
                this.A0Q.setVisibility(4);
                return;
            }
        }
        setVisibility(4);
        this.A0Q.A0C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A2M() && this.A04 != null) {
            this.A04.A0P();
            if (this.A0G.A2U()) {
                AbstractC2537aL.A04(this.A0J, EnumC2538aM.A02);
            } else {
                AbstractC2537aL.A05(this.A0J, EnumC2538aM.A02);
            }
        }
        if (this.A0G.A2W() && this.A05 != null) {
            AbstractC2537aL.A06(this.A0J, EnumC2538aM.A02);
        }
        this.A0L.A04(VH.A0z, null);
        if (this.A07 != null) {
            this.A07.setText(this.A0G.A29().A0J().A04());
        }
        if (!this.A0G.A29().A0K().A02().isEmpty()) {
            this.A09 = new C2791eS(this.A0J, this.A0G, this.A0O, this.A07, this.A0F, this.A0L);
            addView(this.A09.A0W(), new RelativeLayout.LayoutParams(-1, -1));
            YB.A0d(this.A0U);
        } else {
            this.A08 = new C2785eM(this.A0J, this.A0K, this.A0G);
            Pair<EnumC2784eL, View> A03 = this.A08.A03(this.A07);
            AbstractC2631br.A00(this.A0J, this, this.A0G.A29().A0H().A08());
            addView((View) A03.second, new RelativeLayout.LayoutParams(-1, -1));
            long A00 = this.A0G.A29().A0K().A00();
            if (A00 > 0) {
                this.A0F.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.Z9
                    @Override // java.lang.Runnable
                    public final void run() {
                        MW.this.A0c();
                    }
                }, A00);
            } else {
                AbstractC2465Yb abstractC2465Yb = this.A0U;
                String[] strArr = A0W;
                if (strArr[5].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A0W[3] = "dsmu";
                abstractC2465Yb.setToolbarActionMode(0);
            }
        }
        YB.A0d(this.A0Q);
        this.A0R.set(true);
    }

    private void A0O() {
        final C2759dw c2759dw = new C2759dw(this.A0J, this.A0G);
        addView(c2759dw, new RelativeLayout.LayoutParams(-1, -1));
        this.A0F.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // java.lang.Runnable
            public final void run() {
                MW.this.A0e(c2759dw);
            }
        }, this.A0H.A0D());
    }

    private void A0Q(int i) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A0I(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i == 2) {
            int i2 = XV.A00;
            if (A0W[4].length() == 25) {
                throw new RuntimeException();
            }
            A0W[2] = "3KWOojhtbTrcKNejqW7";
            layoutParams.setMargins(i2, XV.A00, XV.A00, XV.A05);
        } else {
            layoutParams.setMargins(XV.A00, XV.A00, XV.A00, XV.A0N);
        }
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
    }

    private void A0R(int i) {
        if (i == 2) {
            this.A0Q.setPadding(XV.A01, XV.A01, XV.A01, XV.A01);
            return;
        }
        C2781eI c2781eI = this.A0Q;
        int i2 = XV.A00;
        if (A0W[7].charAt(28) == 'Z') {
            throw new RuntimeException();
        }
        A0W[3] = "dtYS90IKRfB1L";
        c2781eI.setPadding(i2, XV.A00, XV.A00, XV.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(boolean z, String str) {
        this.A0C = true;
        HashMap hashMap = new HashMap();
        hashMap.put(A09(0, 12, 32), z ? A09(49, 13, 96) : A09(24, 12, 95));
        hashMap.put(A09(12, 12, 14), str);
        new C2609bV(this.A0J, this.A0P.A7M(), this.A0Q.getViewabilityChecker(), this.A0Q.getTouchDataRecorder(), this.A0K, this.A0G.A2A(), this.A0O).A05(this.A0G.A2E(), this.A0G.A29().A0J().A05(), hashMap);
    }

    public final void A0b() {
        if (this.A0H.A0Y() || this.A0H.A0b()) {
            setVisibility(0);
            this.A0Q.A0E(0);
            AFi(false);
            if (this.A0S.get()) {
                A0N();
            }
        } else {
            this.A0Q.A0C();
            this.A0Q.setVisibility(0);
            this.A0M.A07();
        }
        if (this.A0H.A0W()) {
            A0O();
        }
        if (this.A06 != null) {
            this.A06.A0E();
        }
        this.A0U.setVisibility(0);
        if (this.A07 != null && this.A0G.A25() > 0 && this.A02 == null) {
            this.A02 = new XO(this.A0G.A25(), new C2165Mc(this));
            this.A02.A07();
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0U.setToolbarActionMode(0);
    }

    public final /* synthetic */ void A0d(AbstractC2465Yb abstractC2465Yb) {
        if (this.A0H.A0A() > 0 && abstractC2465Yb.getToolbarActionMode() == 8) {
            A0C();
            return;
        }
        if (abstractC2465Yb.getToolbarActionMode() != 0 && this.A0H.A0V() && !this.A0R.get()) {
            abstractC2465Yb.setToolbarActionMode(2);
            A0N();
        } else {
            this.A0L.A04(VH.A07, null);
            this.A0J.A0F().AB0();
            this.A0O.A4j(this.A0P.A7w());
        }
    }

    public final /* synthetic */ void A0e(C2759dw c2759dw) {
        removeView(c2759dw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public final void AAu(Intent intent, Bundle bundle, C2292Re c2292Re) {
        this.A01 = c2292Re;
        c2292Re.A0A(this.A0I);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public final void AFA(boolean z) {
        this.A0M.A06();
        this.A0B = true;
        if (this.A06 != null) {
            this.A06.A0G();
        }
        if (this.A04 != null) {
            this.A04.A0P();
        } else {
            if (this.A03 == null) {
                return;
            }
            this.A03.A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public final void AFi(boolean z) {
        this.A0M.A07();
        if (this.A06 != null) {
            this.A06.A0H();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public String getCurrentClientToken() {
        return A09(0, 0, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i == 945321098 && this.A0D && !this.A0R.get()) {
            this.A0L.A04(VH.A07, null);
            this.A0O.A4j(this.A0P.A7w());
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0R(configuration.orientation);
        A0Q(configuration.orientation);
        if (this.A09 != null) {
            this.A09.A0a(configuration.orientation);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2472Yi
    public final void onDestroy() {
        this.A0N.A03();
        if (this.A01 != null) {
            this.A01.A0B(this.A0I);
        }
        if (this.A06 != null) {
            this.A06.A0F();
        }
        if (this.A0Q != null) {
            if (!TextUtils.isEmpty(this.A0G.A2E())) {
                this.A0K.AB7(this.A0G.A2E(), new C2587b9().A03(this.A0Q.getViewabilityChecker()).A02(this.A0Q.getTouchDataRecorder()).A05());
            }
            this.A0Q.A0D();
        }
        if (this.A04 != null) {
            this.A04.A0O();
        } else if (this.A03 != null) {
            this.A03.A04();
        }
        this.A0M.A06();
        AbstractC2465Yb abstractC2465Yb = this.A0U;
        if (A0W[1].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[5] = "SgQ0Vce";
        strArr[0] = "JIQdJaY";
        abstractC2465Yb.setToolbarListener(null);
        this.A0F.removeCallbacksAndMessages(null);
    }

    public void setListener(InterfaceC2471Yh interfaceC2471Yh) {
    }
}
