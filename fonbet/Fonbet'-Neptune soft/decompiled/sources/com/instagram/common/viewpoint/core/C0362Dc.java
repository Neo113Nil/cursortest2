package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.Dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0362Dc {
    public static byte[] A0L;
    public static String[] A0M = {"pLRRT7xfKKmC", "sDjB9WgW1E6gHf8gwZURHsTrfoUrQz1T", "uiJP8xmaVv", "5XKoBHy1xynVgVvyT837PyBbXD1HwArb", "BpJCepaU8WbBulVTB", "9USxYKvyty1bKFarGQoBTCJfC9", "y9X2NkRV2raN2WQBQaXrllWfrJ", "7FHQr1tSmfn5NF7ZWaBxZ9Q6x0"};
    public int A01;
    public int A02;
    public InterfaceC1159dR A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C1357gi A0C;
    public final C1153dL A0D;
    public final US A0E;
    public final InterfaceC1158dQ A0F;
    public final InterfaceC1167dZ A0G;
    public final C1168da A0H;
    public final String A0J;
    public final Map<String, String> A0K;
    public final Object A0I = new Object();
    public int A00 = 0;
    public String A04 = null;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C0362Dc(C1153dL c1153dL, US us, InterfaceC1158dQ interfaceC1158dQ, String str, boolean z, int i, int i2, boolean z2, Bundle bundle, Map<String, String> map, InterfaceC1167dZ interfaceC1167dZ) {
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A0B = false;
        this.A07 = false;
        this.A06 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0D = c1153dL;
        this.A0E = us;
        this.A0F = interfaceC1158dQ;
        this.A0J = str;
        this.A0K = map;
        this.A08 = z;
        this.A07 = z2;
        this.A0G = interfaceC1167dZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0364De(this, 0.5d, -1.0d, 2.0d, true));
        arrayList.add(new C0363Dd(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A0C = new C1357gi(arrayList, bundle.getBundle(A0H(6, 16, 57)), this.A0G);
            this.A02 = bundle.getInt(A0H(97, 18, 74));
            this.A01 = bundle.getInt(A0H(79, 18, 108));
            this.A06 = bundle.getBoolean(A0H(Opcodes.I2C, 10, 97), false);
            this.A0A = bundle.getBoolean(A0H(Opcodes.LOOKUPSWITCH, 20, 71), false);
            this.A09 = bundle.getBoolean(A0H(156, 15, 59), false);
        } else {
            this.A02 = i;
            this.A01 = i2;
            this.A0C = new C1357gi(arrayList, this.A0G);
        }
        this.A05 = U7.A2P(this.A0D);
        this.A0B = U7.A2T(this.A0D);
        this.A0H = new C1168da(new Handler(), this);
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0L = new byte[]{-86, -84, -67, -78, -72, -73, -53, -50, -69, -33, -53, -42, -45, -34, -29, -73, -53, -40, -53, -47, -49, -36, -75, -56, -67, -63, -71, -77, -63, -57, -65, -48, -59, -55, -63, -71, -70, -63, -76, -74, -55, -66, -62, -70, -76, -62, -56, -42, -41, -34, -47, -24, -26, -37, -33, -41, -47, -33, -27, -49, -32, -49, -40, -34, -55, -45, -40, -50, -49, -30, -69, -50, -59, -58, -62, -73, -49, -69, -56, 9, -2, 16, 17, -33, Ascii.FF, Ascii.DC2, Ascii.VT, 1, -2, Ascii.SI, Ascii.SYN, -15, 6, 10, 2, -22, -16, -25, -36, -18, -17, -53, -19, -22, -30, -19, -32, -18, -18, -49, -28, -24, -32, -56, -50, -46, -56, -58, -39, -60, -46, -40, -17, -27, -8, -10, -31, -17, -11, -38, -46, -35, -39, -5, -3, -16, -5, -5, -1, -62, -58, -69, -65, -73, -44, -37, 5, 6, -13, 6, -9, -15, -10, 1, 0, -9, -33, -32, -51, -32, -47, -53, -39, -34, -49, -53, -46, -43, -34, -47, -48, -21, -20, -39, -20, -35, -41, -18, -31, -35, -17, -39, -38, -28, -35, -41, -34, -31, -22, -35, -36, -6, -17, -13, -21, -6, -16, -27, -13, -23, -22, -28, -38, -37, -49, -26, -85, -91, -99, Ascii.US, Ascii.EM, 32, 19, 17, 6, 10, 2, -4, 10, 16, -70, -69, -93, -74, -73, -78, -64, -63, -85, -81, -80, -90, -30, -29, -39, -51, -28, Ascii.CAN, 10, Ascii.SI, 5, 16, Ascii.CAN};
    }

    static {
        A0O();
    }

    private final float A0F() {
        return XM.A00(this.A0D) * this.A0F.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(EnumC1160dS enumC1160dS) {
        int currentPositionInMillis = this.A0F.getCurrentPositionInMillis();
        int i = this.A00 + 1;
        this.A00 = i;
        return A0K(enumC1160dS, currentPositionInMillis, i);
    }

    private Map<String, String> A0K(EnumC1160dS enumC1160dS, int i, int i2) {
        HashMap hashMap = new HashMap();
        XM.A03(hashMap, this.A0F.getVideoStartReason() == EnumC1169db.A02, !this.A0F.AAM());
        A0U(hashMap);
        A0S(hashMap);
        A0W(hashMap, i);
        A0V(hashMap);
        A0T(hashMap);
        A0n(enumC1160dS, hashMap);
        hashMap.put(A0H(0, 6, 24), String.valueOf(enumC1160dS.A00));
        hashMap.put(A0H(59, 11, 57), String.valueOf(i2));
        return hashMap;
    }

    private void A0M() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(EnumC1160dS.A04));
    }

    private void A0N() {
        if (this.A07 && this.A06) {
            return;
        }
        String str = this.A0J;
        String[] strArr = A0M;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[6] = "FJm4aBnN5GbAhpBnCwQDj";
        A0R(str, A0J(EnumC1160dS.A0A));
    }

    private final void A0P(int i, boolean z, boolean z2) {
        if (i <= 0.0d || i < this.A02) {
            return;
        }
        if (i > this.A02) {
            this.A0C.A06((i - this.A02) / 1000.0f, A0F());
            double A9N = this.A0G.A9N();
            if (A9N < 0.5d && U7.A1d(this.A0D)) {
                this.A0D.A0F().AJz(String.valueOf(A9N));
            }
            this.A02 = i;
            if (z2 || i - this.A01 >= 5000) {
                String str = this.A0J;
                EnumC1160dS enumC1160dS = EnumC1160dS.A09;
                int i2 = this.A00 + 1;
                this.A00 = i2;
                A0R(str, A0K(enumC1160dS, i, i2));
                this.A01 = this.A02;
                this.A0C.A05();
                return;
            }
        }
        if (z) {
            if (this.A07 && this.A06) {
                return;
            }
            this.A06 = true;
            String str2 = this.A0J;
            EnumC1160dS enumC1160dS2 = EnumC1160dS.A09;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            A0R(str2, A0K(enumC1160dS2, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str, Map<String, String> data) {
        this.A0E.ABa(str, data);
        if (this.A03 != null) {
            this.A03.AE5();
        }
    }

    private void A0S(Map<String, String> params) {
        O1 A03 = this.A0C.A03();
        O0 A00 = A03.A00();
        params.put(A0H(226, 3, 25), String.valueOf(A00.A00()));
        params.put(A0H(229, 3, 8), String.valueOf(A00.A06()));
        params.put(A0H(232, 5, 59), String.valueOf(A00.A03()));
        params.put(A0H(212, 8, 108), String.valueOf(A00.A02() * 1000.0d));
        params.put(A0H(47, 12, 65), String.valueOf(A00.A01() * 1000.0d));
        params.put(A0H(122, 7, 81), String.valueOf(A00.A04() * 1000.0d));
        if (this.A04 != null) {
            params.put(A0H(220, 6, 19), this.A04);
        }
        O0 A01 = A03.A01();
        params.put(A0H(Opcodes.MONITOREXIT, 3, 83), String.valueOf(A01.A00()));
        params.put(A0H(Opcodes.IFNULL, 3, 76), String.valueOf(A01.A06()));
        params.put(A0H(201, 5, 61), String.valueOf(A01.A03()));
        params.put(A0H(22, 8, 35), String.valueOf(A01.A02() * 1000.0d));
        params.put(A0H(35, 12, 36), String.valueOf(A01.A01() * 1000.0d));
        params.put(A0H(115, 7, 52), String.valueOf(A01.A04() * 1000.0d));
    }

    private void A0T(Map<String, String> params) {
        if (this.A0K != null) {
            params.putAll(this.A0K);
        }
    }

    private void A0U(Map<String, String> map) {
        map.put(A0H(70, 9, 37), String.valueOf(this.A0F.AAH()));
        map.put(A0H(Opcodes.I2L, 4, 90), Long.toString(this.A0F.getInitialBufferTime()));
    }

    private void A0V(Map<String, String> params) {
        Rect rect = new Rect();
        this.A0F.getGlobalVisibleRect(rect);
        params.put(A0H(Opcodes.L2F, 2, 90), String.valueOf(rect.top));
        params.put(A0H(Opcodes.LXOR, 2, 60), String.valueOf(rect.left));
        params.put(A0H(Opcodes.LOR, 2, 57), String.valueOf(this.A0F.getMeasuredHeight()));
        params.put(A0H(Opcodes.D2F, 2, 51), String.valueOf(this.A0F.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A0D.getSystemService(A0H(237, 6, 112));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0H(206, 3, 4), String.valueOf(displayMetrics.heightPixels));
        params.put(A0H(209, 3, 120), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0W(Map<String, String> map, int i) {
        map.put(A0H(30, 5, 43), String.valueOf(System.currentTimeMillis()));
        map.put(A0H(Opcodes.F2I, 5, 33), String.valueOf(this.A01 / 1000.0f));
        map.put(A0H(Opcodes.ATHROW, 4, 85), String.valueOf(i / 1000.0f));
    }

    public final int A0b() {
        return this.A02;
    }

    public final Bundle A0c() {
        A0l(A0b(), A0b());
        Bundle bundle = new Bundle();
        bundle.putInt(A0H(97, 18, 74), this.A02);
        bundle.putInt(A0H(79, 18, 108), this.A01);
        bundle.putBoolean(A0H(Opcodes.I2C, 10, 97), this.A06);
        bundle.putBoolean(A0H(Opcodes.LOOKUPSWITCH, 20, 71), this.A0A);
        bundle.putBoolean(A0H(156, 15, 59), this.A09);
        bundle.putBundle(A0H(6, 16, 57), this.A0C.A02());
        return bundle;
    }

    public final void A0d() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(EnumC1160dS.A07));
    }

    public final void A0e() {
        if (this.A07 && this.A06) {
            return;
        }
        A0R(this.A0J, A0J(EnumC1160dS.A08));
    }

    public final void A0f() {
        if (A0F() < 0.05d) {
            synchronized (this.A0I) {
                if (this.A08) {
                    A0M();
                    this.A08 = false;
                }
            }
            return;
        }
        synchronized (this.A0I) {
            if (!this.A08) {
                A0N();
                this.A08 = true;
            }
        }
    }

    public final void A0g() {
        this.A0D.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A0H);
    }

    public final void A0h() {
        this.A0D.getContentResolver().unregisterContentObserver(this.A0H);
    }

    public final void A0i(int i) {
        if (this.A07 && this.A06) {
            return;
        }
        this.A0C.A04();
        A0R(this.A0J, A0J(EnumC1160dS.A05));
        if (this.A05) {
            A0P(i, false, true);
        } else {
            A0P(i, false, ((double) i) < 2000.0d);
        }
        if (this.A0B) {
            this.A0C.A05();
        }
    }

    public final void A0j(int i) {
        A0P(i, true, false);
        if (!this.A07) {
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0k(int i) {
        A0P(i, false, false);
    }

    public final void A0l(int i, int i2) {
        A0P(i, true, false);
        this.A01 = i2;
        this.A02 = i2;
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0m(InterfaceC1159dR interfaceC1159dR) {
        this.A03 = interfaceC1159dR;
    }

    public void A0n(EnumC1160dS enumC1160dS, Map<String, String> params) {
    }

    public final void A0o(C0362Dc c0362Dc) {
        c0362Dc.A06 = this.A06;
        c0362Dc.A07 = this.A07;
        c0362Dc.A0A = this.A0A;
        c0362Dc.A09 = this.A09;
        c0362Dc.A02 = this.A02;
        c0362Dc.A01 = this.A01;
    }
}
