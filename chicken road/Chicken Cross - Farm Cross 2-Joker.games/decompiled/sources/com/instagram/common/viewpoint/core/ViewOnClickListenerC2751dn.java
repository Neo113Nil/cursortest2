package com.instagram.common.viewpoint.core;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2751dn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C17394x A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, Base64.padSymbol};
    }

    public ViewOnClickListenerC2751dn(C17394x c17394x) {
        this.A00 = c17394x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC2643c3 abstractC2643c3;
        AbstractC2643c3 abstractC2643c32;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC2643c3 = this.A00.A00;
            if (abstractC2643c3 != null) {
                abstractC2643c32 = this.A00.A00;
                abstractC2643c32.A1B(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
