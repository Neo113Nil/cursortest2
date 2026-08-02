package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0725Rf {
    public static byte[] A07;
    public static String[] A08 = {"AnF1hfDBxlCdLbiDFLPUuTr8rEIYbsCs", "DcTEZsyKQaFycdRSUI2qHgy2Whp5epDQ", "oumPRRvCFD06iOY6OIziseOiJT3r0Y1F", "T68w1lZpg2aHhxWtuqshCv95QbfqOWN4", "NXTzrqYb1pzocIC4FPaomVlkuxRd4v50", "22ngLnp9x9FhYwfhJQ2wIkSm", "Bx3CPZoq94eNKBlojUhsqxvx", "nU7JTpeEhpBFqPr5yRkbJ9HjbOYUZCS7"};
    public final Handler A00;
    public final InterfaceC0724Re A01;
    public final SF A02;
    public final String A03;
    public final String A04;
    public final JSONObject A05;
    public final boolean A06;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{Ascii.SO, 32, 32, Ascii.DC2, 33, 32, -85, -82, -79, -86, -37, -33, -45, -39, -41, -61, -74, -79, -78, -68};
    }

    static {
        A07();
    }

    public C0725Rf(SF sf, JSONObject jSONObject, String str, String str2, boolean z, InterfaceC0724Re interfaceC0724Re) {
        this.A02 = sf;
        this.A05 = jSONObject;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z && A0A(this.A05);
        this.A01 = interfaceC0724Re;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z, C0723Rd c0723Rd) {
        String A03 = A03(6, 4, 8);
        String A032 = A03(15, 5, 16);
        String A033 = A03(10, 5, 53);
        if (z) {
            if (A033.equals(c0723Rd.A02)) {
                this.A02.A0d(new SD(c0723Rd.A03, -1, -1, this.A04, this.A03));
                return;
            } else if (A032.equals(c0723Rd.A02)) {
                this.A02.A0a(new SB(c0723Rd.A03, this.A04, this.A03));
                return;
            } else {
                if (!A03.equals(c0723Rd.A02)) {
                    return;
                }
                this.A02.A0Z(new SB(c0723Rd.A03, this.A04, this.A03));
                return;
            }
        }
        boolean equals = A033.equals(c0723Rd.A02);
        String[] strArr = A08;
        if (strArr[0].charAt(19) == strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "flwbx6LrQCqeci7k9ke6latQGKdtr0Wf";
        strArr2[4] = "KvRVuDaSTwPscix8AFjTqHYTdR1zRqiC";
        if (equals) {
            this.A02.A0c(new SD(c0723Rd.A03, -1, -1, this.A04, this.A03));
        } else if (A032.equals(c0723Rd.A02)) {
            this.A02.A0b(new SB(c0723Rd.A03, this.A04, this.A03));
        } else {
            if (!A03.equals(c0723Rd.A02)) {
                return;
            }
            this.A02.A0Y(new SB(c0723Rd.A03, this.A04, this.A03));
        }
    }

    public static boolean A0A(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has(A03(0, 6, 112));
    }

    public final void A0B() {
        if (!this.A06) {
            this.A01.ACN();
        }
        XU.A06.execute(new C1285fV(this));
    }
}
