package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1105cY implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C01333r A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 84, 80, 85, 84, 67};
    }

    public ViewOnClickListenerC1105cY(C01333r c01333r) {
        this.A00 = c01333r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            abstractC0987ae = this.A00.A03;
            if (abstractC0987ae != null) {
                abstractC0987ae2 = this.A00.A03;
                abstractC0987ae2.A1A(A00(0, 6, 24));
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
