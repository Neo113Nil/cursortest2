package com.instagram.common.viewpoint.core;

import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.ev, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1250ev {
    public static InterfaceC1230eb A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, Ascii.EM, 51, Ascii.DC2, 114, 47, Ascii.CAN, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, Ascii.NAK, 47, 51, 43, 125, 74, Utf8.REPLACEMENT_BYTE, 96, 71, 122, 102, 66, Byte.MAX_VALUE, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, Byte.MAX_VALUE, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, Byte.MAX_VALUE, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, Ascii.EM, 88, 115, 98, 97, 121, 100, 125, Byte.MAX_VALUE, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, Byte.MAX_VALUE, 120, Byte.MAX_VALUE, 98, 55, 83, 81, 83, 66, Base64.padSymbol, 106, 101, 81, 105, 111, 64, 109, 32, Byte.MAX_VALUE, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, Ascii.SI, 7, Ascii.FS, Ascii.RS, 2, Ascii.SI, 0, Ascii.VT, 49, 3, 1, 10, Ascii.VT, 49, 1, 0, Ascii.GS, Ascii.SYN, 7, 4, Ascii.FS, 1, Ascii.CAN, 33, 58, Ascii.SI, 103, Ascii.DC2, 7, 59, 7, Utf8.REPLACEMENT_BYTE, Ascii.SYN, 108, 5, 96, 3, 3, 0, 49, Ascii.SYN, 37, Ascii.SUB, 39, 19, Ascii.GS, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(Opcodes.JSR, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC1232ed A00(SQ sq) {
        return A03(true, sq);
    }

    public static InterfaceC1232ed A01(SQ sq) {
        return A02(true, sq);
    }

    public static InterfaceC1232ed A02(boolean z, SQ sq) {
        C1236eh c1236eh = new C1236eh();
        C1239ek networkModuleRequestConfigurationBuilder = A04(sq);
        if (!A0B(sq)) {
            c1236eh.A02(A03);
            c1236eh.A01(A02);
        }
        if (WS.A04()) {
            networkModuleRequestConfigurationBuilder.A08(WS.A02());
        }
        CI A002 = AbstractC1234ef.A00();
        C1236eh networkModuleConfigurationBuilder = c1236eh.A00(networkModuleRequestConfigurationBuilder.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z).A04(sq.A05().AAF()).A05(), sq.A08(), XU.A01());
    }

    public static InterfaceC1232ed A03(boolean z, SQ sq) {
        return AbstractC1234ef.A00().A00(new C1236eh().A03(z).A00(A04(sq).A09()).A04(sq.A05().AAF()).A05(), sq.A08(), XU.A01());
    }

    public static C1239ek A04(SQ sq) {
        A08(sq);
        C1239ek c1239ek = new C1239ek();
        if (A0B(sq) || WS.A04()) {
            c1239ek.A02(360000).A04(120000);
        } else {
            c1239ek.A02(U7.A09(sq)).A04(U7.A0B(sq));
        }
        c1239ek.A03(U7.A0A(sq)).A05(U7.A0C(sq)).A06(U7.A0D(sq));
        synchronized (C1250ev.class) {
            if (A00 != null && (A00 instanceof InterfaceC1230eb)) {
                c1239ek.A07(A00);
            }
        }
        return c1239ek;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(SQ sq) {
        if (!A04.get()) {
            sq.A08().AAy(A05(Opcodes.IF_ICMPLT, 7, 110), AbstractC0766Sv.A21, new C0767Sw(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC1230eb interfaceC1230eb) {
        synchronized (C1250ev.class) {
            A00 = interfaceC1230eb;
        }
    }

    public static boolean A0A(SQ sq) {
        return Settings.Global.getInt(sq.getContentResolver(), A05(Opcodes.I2B, 16, 115), 0) != 0;
    }

    public static boolean A0B(SQ sq) {
        String A9I = sq.A05().A9I();
        if (!TextUtils.isEmpty(A9I)) {
            String urlPrefix = A05(3, 3, 58);
            if (!A9I.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (A9I.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
