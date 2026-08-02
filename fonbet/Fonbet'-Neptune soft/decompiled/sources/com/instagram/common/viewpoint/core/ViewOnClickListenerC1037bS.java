package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1037bS implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0507Is A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DC2, Ascii.ETB, Ascii.ETB, Ascii.SYN, 7, Ascii.DC2, Ascii.SUB, Ascii.US, 0};
    }

    public ViewOnClickListenerC1037bS(C0507Is c0507Is) {
        this.A00 = c0507Is;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0991ai c0991ai;
        C0991ai c0991ai2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0m(A00(0, 9, 105));
            c0991ai = this.A00.A0c;
            if (c0991ai.A0E() != null) {
                c0991ai2 = this.A00.A0c;
                c0991ai2.A0E().ABr();
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
