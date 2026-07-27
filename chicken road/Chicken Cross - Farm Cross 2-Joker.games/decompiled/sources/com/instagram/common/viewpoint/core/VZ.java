package com.instagram.common.viewpoint.core;

import androidx.media3.common.PlaybackException;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC2328Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C3112ju A00;
    public final /* synthetic */ UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.FS, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk, C3112ju c3112ju, boolean z) {
        this.A01 = uk;
        this.A00 = c3112ju;
        this.A02 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADL() {
        C2930gi c2930gi;
        long j;
        InterfaceC2360Tv interfaceC2360Tv;
        InterfaceC2360Tv interfaceC2360Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c2930gi = this.A01.A0g;
        InterfaceC2156Lt A0F = c2930gi.A0F();
        j = this.A01.A00;
        A0F.A3N(Y1.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC2360Tv = this.A01.A0I;
        if (interfaceC2360Tv != null) {
            interfaceC2360Tv2 = this.A01.A0I;
            interfaceC2360Tv2.ADp(C2402Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2328Sp
    public final void ADT() {
        InterfaceC2360Tv interfaceC2360Tv;
        VW vw;
        C2930gi c2930gi;
        InterfaceC2360Tv interfaceC2360Tv2;
        C2930gi c2930gi2;
        boolean A0r;
        InterfaceC2360Tv interfaceC2360Tv3;
        C18007g c18007g;
        C18007g c18007g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c18007g = this.A01.A0B;
            if (c18007g != null) {
                c18007g2 = this.A01.A0B;
                c18007g2.A0L();
            }
        }
        interfaceC2360Tv = this.A01.A0I;
        if (interfaceC2360Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC2360Tv3 = this.A01.A0I;
                    interfaceC2360Tv3.AEq();
                }
            }
            if (this.A02) {
                UK uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c2930gi = uk.A0g;
                    if (C2380Up.A1s(c2930gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        UK uk2 = this.A01;
                        c2930gi2 = this.A01.A0g;
                        uk2.A0P = AbstractC2715dD.A01(c2930gi2, this.A01.A13(), 4, new C2406Vr(this));
                        return;
                    } else {
                        UK uk3 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            interfaceC2360Tv2 = uk3.A0I;
                            interfaceC2360Tv2.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
