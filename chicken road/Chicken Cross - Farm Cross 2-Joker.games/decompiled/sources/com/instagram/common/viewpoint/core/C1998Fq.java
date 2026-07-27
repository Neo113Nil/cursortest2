package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1998Fq extends RK implements InterfaceC2478Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C2194Ng A00;
    public AbstractC2874fo A01;
    public C2875fp A02;
    public C2875fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C2930gi A06;
    public final C6M A07;

    public C1998Fq(C6M c6m, SparseBooleanArray sparseBooleanArray, C2875fp c2875fp, int i, C2930gi c2930gi, C2194Ng c2194Ng) {
        super(c6m);
        this.A06 = c2930gi;
        this.A07 = c6m;
        this.A05 = sparseBooleanArray;
        this.A02 = c2875fp;
        this.A04 = i;
        this.A00 = c2194Ng;
    }

    private void A05(VA va, Y2 y2, String str, C2768e5 c2768e5) {
        if (this.A05.get(c2768e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C2000Fs(this, str, c2768e5, va, c2768e5.A04(), y2);
        this.A03 = new C2875fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C1999Fr(this, c2768e5));
    }

    public final void A0p(C2768e5 c2768e5, VA va, C2336Sx c2336Sx, Y2 y2, String str, int i, int i2, int i3) {
        int A02 = c2768e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c2768e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = A02 == 0 ? i3 : i2;
        if (A02 < this.A04 - 1) {
            i3 = i2;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        String A082 = c2768e5.A03().A0H().A08();
        String A09 = c2768e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(c2336Sx.A0T(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c2768e5.A03().A0J(), c2768e5.A04());
        this.A07.A1W(c2768e5.A04());
        A05(va, y2, str, c2768e5);
    }

    public final void A0q(C2875fp c2875fp) {
        this.A02 = c2875fp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2478Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
