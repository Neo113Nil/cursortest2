package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0519Je implements ZY {
    public static byte[] A01;
    public final /* synthetic */ JU A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, Base64.padSymbol, 59, 53, 72, Base64.padSymbol, 67, 66, 51, Base64.padSymbol, 53, 54};
    }

    public C0519Je(JU ju) {
        this.A00 = ju;
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AES(String str) {
        ZP zp;
        ZP zp2;
        AbstractC1428hy abstractC1428hy;
        LJ lj;
        AbstractC1428hy abstractC1428hy2;
        LJ lj2;
        this.A00.A0X = false;
        zp = this.A00.A0K;
        zp.setProgress(100);
        zp2 = this.A00.A0K;
        XP.A0L(zp2, 8);
        abstractC1428hy = this.A00.A0H;
        if (abstractC1428hy.A1d()) {
            lj = this.A00.A0L;
            if (lj != null) {
                abstractC1428hy2 = this.A00.A0H;
                String A0y = abstractC1428hy2.A0y();
                if (!TextUtils.isEmpty(A0y)) {
                    lj2 = this.A00.A0L;
                    lj2.loadUrl(A0y);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEU(String str) {
        ZP zp;
        ZO zo;
        boolean z;
        int i;
        this.A00.A0X = true;
        zp = this.A00.A0K;
        XP.A0L(zp, 0);
        zo = this.A00.A0J;
        zo.setUrl(str);
        z = this.A00.A0V;
        if (!z) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0V = true;
                this.A00.A0h(A00(0, 19, 108));
            }
        }
        JU.A03(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEq(int i) {
        boolean z;
        ZP zp;
        z = this.A00.A0X;
        if (z) {
            zp = this.A00.A0K;
            zp.setProgress(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEt(String str) {
        ZO zo;
        zo = this.A00.A0J;
        zo.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEw() {
        C0991ai c0991ai;
        c0991ai = this.A00.A0N;
        c0991ai.A0D().ACf(14);
    }
}
