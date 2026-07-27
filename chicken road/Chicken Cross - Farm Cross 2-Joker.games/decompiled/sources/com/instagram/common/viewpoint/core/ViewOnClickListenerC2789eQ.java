package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2789eQ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C2791eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.EM, Ascii.SYN, Ascii.DC2, Ascii.NAK, Ascii.SYN, 35};
    }

    public ViewOnClickListenerC2789eQ(C2791eS c2791eS) {
        this.A00 = c2791eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr;
        ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC2128Kr = this.A00.A0l;
            if (viewOnClickListenerC2128Kr == null) {
                return;
            }
            viewOnClickListenerC2128Kr2 = this.A00.A0l;
            viewOnClickListenerC2128Kr2.A0E(A00(0, 6, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
