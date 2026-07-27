package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.rG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC3533rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3532rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, Ascii.EM, 56, 49, 60, 36};
    }

    public RunnableC3533rG(C3532rF c3532rF, int i, Exception exc) {
        this.A01 = c3532rF;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC2986hc interfaceC2986hc;
        Handler handler;
        Runnable runnable;
        boolean A0B;
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                z = this.A01.A01;
                if (z) {
                    if (C1870Ao.A07) {
                        A0B = this.A01.A0B();
                        if (A0B) {
                            this.A01.A0F();
                            return;
                        }
                    }
                    C3532rF c3532rF = this.A01;
                    interfaceC2986hc = this.A01.A05;
                    c3532rF.A08(interfaceC2986hc.ACf());
                    C3532rF.A03(this.A01);
                    if (0 == 0) {
                        int delay = this.A00;
                        handler = this.A01.A04;
                        runnable = this.A01.A0C;
                        handler.postDelayed(runnable, delay);
                        return;
                    }
                    C3532rF.A03(this.A01);
                    throw new NullPointerException(A00(0, 8, 12));
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
