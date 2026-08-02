package com.instagram.common.viewpoint.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0674Pg extends AbstractRunnableC0840Vt {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ VR A00;
    public final /* synthetic */ VU A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, Ascii.DC2, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, Utf8.REPLACEMENT_BYTE, 51, 50, 50, 57, Utf8.REPLACEMENT_BYTE, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1153dL c1153dL;
        C1153dL c1153dL2;
        C1153dL c1153dL3;
        C1153dL c1153dL4;
        C1153dL c1153dL5;
        long j;
        C1153dL c1153dL6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC1233ee A032;
        C1153dL c1153dL7;
        C1153dL c1153dL8;
        C1153dL c1153dL9;
        C1153dL c1153dL10;
        long j2;
        this.A01.A00 = System.currentTimeMillis();
        c1153dL = this.A01.A05;
        if (XE.A00(c1153dL) == XD.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 62);
            c1153dL10 = this.A01.A05;
            LH A0F = c1153dL10.A0F();
            j2 = this.A01.A01;
            A0F.A3O(XG.A01(j2), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0E(new V1(adErrorType, A00));
            return;
        }
        c1153dL2 = this.A01.A05;
        T5.A08(c1153dL2);
        c1153dL3 = this.A01.A05;
        AbstractC0737Rr.A07(c1153dL3);
        TY A002 = TY.A00();
        c1153dL4 = this.A01.A05;
        boolean z = true;
        Map<String, String> A0A = this.A00.A0A(A002.A01(c1153dL4, true).A7q(this.A00.A05()));
        this.A01.A03 = A0A;
        try {
            c1153dL7 = this.A01.A05;
            PackageManager packageManager = c1153dL7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 92);
                StringBuilder sb = new StringBuilder();
                c1153dL8 = this.A01.A05;
                StringBuilder append = sb.append(c1153dL8.getPackageName()).append(A00(0, 1, 59));
                c1153dL9 = this.A01.A05;
                A0A.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1153dL9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != V6.A04 && this.A00.A07() != V6.A06 && this.A00.A07() != V6.A05 && this.A00.A07() != null) {
                z = false;
            }
            c1153dL6 = this.A01.A05;
            InterfaceC1232ed A022 = C1250ev.A02(z, c1153dL6);
            str = this.A01.A07;
            C1246er c1246er = new C1246er();
            map = this.A01.A03;
            byte[] A08 = c1246er.A05(map).A08();
            A032 = this.A01.A03(XG.A00(), this.A00);
            A022.AGE(str, A08, A032);
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            c1153dL5 = this.A01.A05;
            LH A0F2 = c1153dL5.A0F();
            j = this.A01.A01;
            A0F2.A3O(XG.A01(j), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            VU vu = this.A01;
            V1 A01 = V1.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            vu.A0E(A01);
        }
    }

    static {
        A01();
    }

    public C0674Pg(VU vu, VR vr) {
        this.A01 = vu;
        this.A00 = vr;
    }
}
