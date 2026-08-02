package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0436Fy extends FrameLayout implements InterfaceC0885Xo {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public static final int A0O;
    public static final int A0P;
    public int A00;
    public int A01;
    public int A02;
    public C0955a8 A03;
    public AbstractC0480Hr A04;
    public C1150dI A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1426hw A0A;
    public final R6 A0B;
    public final SF A0C;
    public final C1153dL A0D;
    public final US A0E;
    public final C0796Ua A0F;
    public final XC A0G;
    public final AbstractC0883Xm A0H;
    public final InterfaceC0884Xn A0I;
    public final YY A0J;
    public final ArrayList<C1098cR> A0K;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0G();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
        A0O = (int) (AbstractC0856Wl.A02 * 48.0f);
        A0P = (int) (AbstractC0856Wl.A02 * 64.0f);
    }

    public C0436Fy(C1153dL c1153dL, YY yy, US us, C1426hw c1426hw, SF sf, InterfaceC0884Xn interfaceC0884Xn) {
        super(c1153dL);
        FrameLayout.LayoutParams layoutParams;
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new G1(this);
        this.A0D = c1153dL;
        this.A0J = yy;
        this.A0E = us;
        this.A0A = c1426hw;
        this.A0C = sf;
        this.A0I = interfaceC0884Xn;
        this.A0F = new C0796Ua(this.A0A.A1x(0).A25(), this.A0E);
        this.A0G = new XC(this);
        this.A0G.A05(XB.A02);
        this.A05 = new C1150dI(this.A0D, this.A0J, this.A0A.A1A(), interfaceC0884Xn);
        this.A0H = A05();
        if (this.A0A.A1U()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0P, A0O, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r4.A1I() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r6.A0H.setToolbarActionMode(0);
        r6.A0D.A0F().A4p();
        r6.A04.A1D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r4.A1I() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00() {
        if (!this.A09) {
            if (this.A04 == null || !this.A04.A1J() || this.A0A.A1t() != 1 || !this.A04.A1K()) {
                return 0;
            }
            A0V(false, this.A02);
            return 1;
        }
        if (this.A04 != null && this.A04.A1J() && this.A0A.A1t() == 1 && !this.A04.A1K()) {
            return 0;
        }
        if (A0W()) {
            AbstractC0480Hr abstractC0480Hr = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "AFu5VcCLRWlCVSPev3Ny5pnjuJiPpe";
                strArr2[7] = "Nhy8N08k5Vw4Z8hL9UmI1FpStaZ0OS";
                if (abstractC0480Hr != null && (this.A04.A1J() || this.A0A.A1t() == 2 || !this.A04.A1I())) {
                    if (!this.A0A.A26()) {
                        this.A08 = true;
                    }
                    A0V(false, this.A02);
                    return 2;
                }
            }
            throw new RuntimeException();
        }
        if (this.A04 != null) {
            AbstractC0480Hr abstractC0480Hr2 = this.A04;
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[2] = "s0FLaM76nMM9Qr7TZwL2usTxvSsXcmqy";
                strArr4[4] = "fT84jb4om2WjLoB8b8HhBoC0fCgiLofU";
            } else {
                String[] strArr5 = A0M;
                strArr5[5] = "A7yRQ8ZNY7QUzDAYMeY8X6eQmfD57M";
                strArr5[7] = "dEOP0V0Fm3EsPKfzbtzpY8oiy2RB1y";
            }
            throw new RuntimeException();
        }
        if (A0X() && !A0Y()) {
            A0F();
            String[] strArr6 = A0M;
            if (strArr6[6].length() != strArr6[3].length()) {
                String[] strArr7 = A0M;
                strArr7[6] = "ldx0hXy1";
                strArr7[3] = "A9K45C3zzpDFd";
                return 4;
            }
            throw new RuntimeException();
        }
        if ((this.A04 instanceof AnonymousClass50) && A0W()) {
            A0V(false, this.A02);
            return 5;
        }
        this.A0F.A04(UZ.A07, null);
        A0K(4);
        return 6;
    }

    private int A01(int i) {
        if (this.A0A.A26()) {
            C1426hw c1426hw = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i < c1426hw.A21().size() && i >= 0) {
                return this.A0A.A21().get(i).intValue();
            }
        }
        return this.A0A.A0m();
    }

    public static /* synthetic */ int A02(C0436Fy c0436Fy, int i) {
        int i2 = c0436Fy.A01 + i;
        c0436Fy.A01 = i2;
        return i2;
    }

    private AbstractC0883Xm A05() {
        AbstractC0883Xm c0635Nr;
        if (!this.A0A.A1U()) {
            c0635Nr = new FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            c0635Nr = new C0635Nr(this.A0D, this.A0I, this.A0F, 2);
        }
        c0635Nr.setFullscreen(true);
        c0635Nr.setToolbarListener(new C0437Fz(this));
        return c0635Nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC0480Hr A0A(boolean z, int i) {
        boolean z2;
        G0 g0 = new G0(this, i);
        AbstractC1428hy A1x = this.A0A.A1x(this.A00);
        if (A1x.A2K()) {
            this.A0H.setOnClickListener(new ViewOnClickListenerC1099cS(this));
        }
        if (this.A0A.A25()) {
            int i2 = this.A00;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "c3gdOFv01Kz0ZnyucW";
            strArr2[1] = "uUEmXxf6IoafQfC48jcO";
            if (i2 > 0) {
                z2 = true;
                boolean z3 = !this.A0A.A24() && this.A00 > 0;
                String A1z = this.A0A.A1z();
                if (!A0Z(A1x)) {
                    int A01 = A01(this.A00);
                    if (A01 == 0) {
                        setUnskippableSecondsComplete(true);
                    }
                    this.A0D.A0F().AJ9(LT.A06);
                    this.A0D.A0F().AIb(this.A00);
                    this.A0D.A0F().A4n(A1z);
                    return new AnonymousClass50(this.A0D, this.A0J, this.A00, this.A0E, A1x, this.A0I, this.A0H, this.A0F, z2, z3, g0, A01, this.A0A.A1u());
                }
                if (A1x.A20().A0T()) {
                    this.A0D.A0F().AJ9(LT.A07);
                    this.A0D.A0F().AIb(this.A00);
                    this.A0D.A0F().A4n(A1z);
                    if (this.A0A.A1U()) {
                        return new C4K(this.A0D, this.A0E, this.A0H, A1x, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, g0, A01(this.A00), this.A0A.A1u());
                    }
                    return new C4Z(this.A0D, this.A0E, this.A0H, A1x, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, g0, A01(this.A00), this.A0A.A1u());
                }
                this.A0D.A0F().AJ9(LT.A07);
                this.A0D.A0F().AIb(this.A00);
                this.A0D.A0F().A4n(A1z);
                return new C01554n(this.A0D, this.A0E, A1x, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, this.A0H, this.A0A.A0m(), i, this.A0A.A1t(), z, this.A0A.A1v(), this.A0A.A26(), z2, z3, g0, A01(this.A00), this.A0A.A1u());
            }
        }
        z2 = false;
        if (this.A0A.A24()) {
        }
        String A1z2 = this.A0A.A1z();
        if (!A0Z(A1x)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        int A00 = A00();
        if (A00 != 0) {
            this.A0D.A0F().A4q(A00);
        }
    }

    private void A0D() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A1x(this.A00 - 1).A25())) {
            US us = this.A0E;
            String A25 = this.A0A.A1x(this.A00 - 1).A25();
            C0938Zp A03 = new C0938Zp().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC0480Hr abstractC0480Hr = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            us.AAt(A25, A03.A02(abstractC0480Hr != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A0H.getToolbarActionMode() == 8) {
            AbstractC0883Xm abstractC0883Xm = this.A0H;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "ALooRHp0AOPErSNB2N5ax0GYeQeSWGkg";
            strArr2[4] = "Jojrpwo5bfgl2L1NDhbRQaPRUafbLI0W";
            abstractC0883Xm.setToolbarActionMode(2);
        }
        int i = this.A00 - 1;
        if (this.A0A.A27(i)) {
            AbstractC1428hy A1x = this.A0A.A1x(i);
            AbstractC0883Xm abstractC0883Xm2 = this.A0H;
            String[] strArr3 = A0M;
            String str = strArr3[2];
            String str2 = strArr3[4];
            int charAt = str.charAt(19);
            int index = str2.charAt(19);
            if (charAt == index) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "SYmrADrPyc9xENaNAh";
            strArr4[1] = "82lRVJ32R9K27GgHKLOx";
            abstractC0883Xm2.setProgressSpinnerInvisible(!A1x.A2J());
            A1x.A2B(false);
            A1x.A20().A0M(-1);
        }
    }

    private void A0F() {
        this.A0D.A0F().A4o();
        this.A07 = true;
        this.A03 = new C0955a8(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        C1098cR c1098cR = null;
        Iterator<C1098cR> it = this.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1098cR next = it.next();
            if (next.A00 == C1098cR.A06) {
                c1098cR = next;
                break;
            }
        }
        if (c1098cR != null) {
            A0L(this.A03, c1098cR);
        } else {
            boolean isEmpty = this.A0K.isEmpty();
            String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "8vyvfMLKM55zirtuKFzVGEL0IOO7sZ";
            strArr2[7] = "ODibu6eYSRbNQzGgUnvrLUj83p1fS4";
            if (!isEmpty) {
                A0L(this.A03, this.A0K.get(0));
            }
        }
        A0U(true);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            XP.A0H(this.A04);
            this.A04.A1B();
            this.A04 = null;
        }
        XP.A0H(this.A03);
        XP.A0E(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0H() {
        this.A0G.A05(XB.A03);
    }

    private synchronized void A0I() {
        this.A0I.A4b(this.A0J.A6d());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(float f) {
        float seenCurrentPosMS;
        float A01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A26() ? 0 : this.A01) + f;
        if (A01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A26()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0H.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0H.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i) {
        this.A0D.A0F().A4l(i);
        setUnskippableSecondsComplete(true);
        A0I();
        A0D();
        this.A0I.A4b(this.A0J.A7o());
    }

    private void A0L(ViewGroup viewGroup, C1098cR c1098cR) {
        if (c1098cR.A00 == C1098cR.A06 && c1098cR.A03 != null) {
            AbstractC0974aR.A00(this.A0D, viewGroup, c1098cR.A03);
        } else {
            int i = c1098cR.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            XP.A0K(viewGroup, i);
        }
        this.A0H.setFullscreen(c1098cR.A05);
        this.A0H.A0A(c1098cR.A02, c1098cR.A04);
    }

    private void A0M(AbstractC1428hy abstractC1428hy) {
        if (this.A0H instanceof FullScreenAdToolbar) {
            if (A0Z(abstractC1428hy) && this.A02 == 2) {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(abstractC1428hy.A23());
            } else {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0N(R0 r0) {
        r0.A0A(this.A0B);
        int i = r0.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0V(this.A0A.A23(), i);
        A0H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0U(boolean z) {
        boolean z2;
        boolean willShowCombinedEndCards;
        String[] strArr;
        if (A0X() && !A0W()) {
            boolean A0Y = A0Y();
            String[] strArr2 = A0M;
            if (strArr2[0].length() == strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0M;
            strArr3[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr3[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (!A0Y) {
                z2 = true;
                willShowCombinedEndCards = A0W();
                if (willShowCombinedEndCards && !z2) {
                    setUnskippableSecondsComplete(true);
                    if (z) {
                        this.A0H.setToolbarActionMessage(A0B(0, 0, 85));
                    }
                    AbstractC0883Xm abstractC0883Xm = this.A0H;
                    String[] strArr4 = A0M;
                    if (strArr4[6].length() == strArr4[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0M;
                    strArr5[0] = "6hDdRvQvhZI2wvmWyf";
                    strArr5[1] = "dfELTL2TgrvtcbRt37j2";
                    abstractC0883Xm.setToolbarActionMode(0);
                    return;
                }
                AbstractC0883Xm abstractC0883Xm2 = this.A0H;
                strArr = A0M;
                if (strArr[0].length() == strArr[1].length()) {
                    String[] strArr6 = A0M;
                    strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
                    strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
                    abstractC0883Xm2.setToolbarActionMode(1);
                    return;
                }
                String[] strArr7 = A0M;
                strArr7[6] = "uCb48oA3";
                strArr7[3] = "eCwSqnipc7icS";
                abstractC0883Xm2.setToolbarActionMode(1);
                return;
            }
        }
        z2 = false;
        willShowCombinedEndCards = A0W();
        if (willShowCombinedEndCards) {
        }
        AbstractC0883Xm abstractC0883Xm22 = this.A0H;
        strArr = A0M;
        if (strArr[0].length() == strArr[1].length()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(boolean z, int i) {
        if (this.A04 != null) {
            this.A04.A1B();
            this.A04.removeAllViews();
            XP.A0H(this.A04);
        }
        if (this.A0A.A1U()) {
            XP.A0H(this.A0H);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0P, A0O, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0W()) {
            setUnskippableSecondsComplete(true);
            if (A0X()) {
                A0F();
                return;
            }
            A0K(1);
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "b6hirdpqFqEpTGRF7TvzfLNB23PEQW";
                strArr2[7] = "Y5Eb3FssofDa3ImZpKtnPvm2BrdUNN";
                return;
            }
        } else {
            if (this.A0A.A26()) {
                setUnskippableSecondsComplete(false);
                this.A0H.setProgressImmediate(0.0f);
            }
            SJ A01 = this.A0D.A01();
            AbstractC1428hy A1x = this.A0A.A1x(this.A00);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                boolean isLoaded = A01.AAD(A1x.A25(), this.A0A.A1y());
                if (!isLoaded) {
                    this.A0D.A0F().A4m();
                    A0K(2);
                    return;
                }
                AbstractC0480Hr A0A = A0A(z, i);
                this.A04 = A0A;
                AbstractC0480Hr abstractC0480Hr = this.A04;
                boolean isLoaded2 = this.A09;
                abstractC0480Hr.A1F(isLoaded2);
                setupToolbarForAd(A0A);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A1E();
                return;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0W() {
        return this.A00 < this.A0A.A1u();
    }

    private boolean A0X() {
        return this.A0A.A1t() == 2;
    }

    private final boolean A0Y() {
        return this.A07;
    }

    public static boolean A0Z(AbstractC1428hy abstractC1428hy) {
        return TextUtils.isEmpty(abstractC1428hy.A20().A0H().A09());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r0) {
        this.A0I.A3x(this, A0N);
        A0N(r0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AEV(boolean z) {
        if (this.A04 != null) {
            this.A04.A1G(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AF0(boolean z) {
        if (this.A04 != null) {
            this.A04.A1H(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AIB(Bundle bundle) {
    }

    public AbstractC0480Hr getContentView() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof AnonymousClass50) {
            A0L(this.A04, this.A04.getFullScreenAdStyle());
            A0M(this.A04.getAdDataBundle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1B();
            this.A04 = null;
        }
        this.A0D.A01().A4r(this.A0A.A1y());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0884Xn interfaceC0884Xn) {
    }

    public void setServerSideRewardHandler(C1150dI c1150dI) {
        this.A05 = c1150dI;
    }

    public void setUnskippableSecondsComplete(boolean z) {
        this.A09 = z;
        if (this.A04 != null) {
            this.A04.A1F(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC0480Hr abstractC0480Hr) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        AbstractC1428hy A1x = this.A0A.A1x(this.A00);
        int A01 = A01(this.A00);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).A0D(this.A0D, A1x.A1t());
            ((FullScreenAdToolbar) this.A0H).A0C(A1x.A23(), A1x.A25(), A01);
        } else if (this.A0H instanceof C0635Nr) {
            ((C0635Nr) this.A0H).setInitialUnskippableSeconds(A01);
        }
        C1098cR fullScreenAdStyle = abstractC0480Hr.getFullScreenAdStyle();
        A0L(abstractC0480Hr, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0H.setToolbarActionMessage(A0B(4, 3, 90) + (this.A00 + 1) + A0B(0, 4, 21) + this.A0A.A1u());
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0M(A1x);
    }
}
