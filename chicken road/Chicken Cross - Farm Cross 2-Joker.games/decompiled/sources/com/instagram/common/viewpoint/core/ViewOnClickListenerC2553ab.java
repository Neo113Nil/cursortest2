package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2553ab implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"sP3gpwd6Zoi5atkrMGPTc5EXN8BQ3Rhb", "CuI3HGsHCqf5OUDiTkLeplOhcTm9T7NI", "qUh1oDSzqsBPPR1tLa2Ioa4F3OHVyWz", "9USBf0H8rgb5C7JYpIITcKF8xtKeHlI", "rVv7rCrqZ3PnTP4EIzYeJpV", "KXSca88saLVPZ5uec2yV3IdyBKC0ygXP", "JOf8s03jk9aSXntkdxYTuuj", "1B5kCc4TTNYrg"};
    public final /* synthetic */ M8 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].charAt(30) == 'J') {
                throw new RuntimeException();
            }
            A02[6] = "NOG9o";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-68, -67, -54, -48, -49, -107, -67, -57, -68, -55, -58, -106, -93, -108, -106, -104, -87, -98, -85, -98, -87, -82, Ascii.DC4, 33, Ascii.ETB, 37, 34, Ascii.FS, Ascii.ETB, -31, Ascii.FS, 33, 39, Ascii.CAN, 33, 39, -31, Ascii.DC4, Ascii.SYN, 39, Ascii.FS, 34, 33, -31, 9, -4, -8, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C2930gi c2930gi;
        C2930gi c2930gi2;
        C2930gi c2930gi3;
        InterfaceC2572au interfaceC2572au;
        InterfaceC2572au interfaceC2572au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 38);
            str2 = this.A00.A06;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 126);
            str3 = this.A00.A06;
            Intent intent = new Intent(A002, XB.A00(str3));
            intent.addFlags(268435456);
            c2930gi = this.A00.A08;
            c2930gi.A0F().A9y();
            try {
                c2930gi3 = this.A00.A08;
                C2434Wu.A0D(c2930gi3, intent);
                interfaceC2572au = this.A00.A05;
                if (interfaceC2572au != null) {
                    interfaceC2572au2 = this.A00.A05;
                    interfaceC2572au2.AF0();
                }
            } catch (C2432Ws e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c2930gi2 = this.A00.A08;
                c2930gi2.A08().ABC(A00(11, 11, 0), AbstractC2342Td.A00, new C2343Te(th));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    static {
        A01();
    }

    public ViewOnClickListenerC2553ab(M8 m8) {
        this.A00 = m8;
    }
}
