package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class J8 implements ZY {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C0507Is A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -31, -45, -32, -51, -36, -49, -28, -41, -43, -49, -30, -41, -35, -36, -51, -41, -49, -48};
    }

    static {
        A01();
    }

    public J8(C0507Is c0507Is) {
        this.A00 = c0507Is;
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AES(String str) {
        ZP zp;
        ZP zp2;
        AbstractC1428hy abstractC1428hy;
        LJ lj;
        AbstractC1428hy abstractC1428hy2;
        LJ lj2;
        this.A00.A0K = false;
        zp = this.A00.A07;
        zp.setProgress(100);
        zp2 = this.A00.A07;
        XP.A0L(zp2, 8);
        abstractC1428hy = this.A00.A0Y;
        if (abstractC1428hy.A1d()) {
            lj = this.A00.A08;
            if (lj != null) {
                abstractC1428hy2 = this.A00.A0Y;
                String A0y = abstractC1428hy2.A0y();
                if (!TextUtils.isEmpty(A0y)) {
                    lj2 = this.A00.A08;
                    lj2.loadUrl(A0y);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEU(String str) {
        ZP zp;
        ZH zh;
        boolean z;
        int i;
        this.A00.A0K = true;
        zp = this.A00.A07;
        XP.A0L(zp, 0);
        zh = this.A00.A06;
        zh.setUrl(str);
        z = this.A00.A0I;
        if (!z) {
            i = this.A00.A00;
            if (i > 1) {
                this.A00.A0I = true;
                C0507Is c0507Is = this.A00;
                String[] strArr = A02;
                if (strArr[4].charAt(17) == strArr[5].charAt(17)) {
                    throw new RuntimeException();
                }
                A02[2] = "wX256yuF2";
                c0507Is.A0l(A00(0, 19, 95));
            }
        }
        C0507Is.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEq(int i) {
        boolean z;
        ZP zp;
        z = this.A00.A0K;
        if (z) {
            zp = this.A00.A07;
            zp.setProgress(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEt(String str) {
        ZH zh;
        zh = this.A00.A06;
        zh.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEw() {
        C0991ai c0991ai;
        c0991ai = this.A00.A0c;
        c0991ai.A0D().ACf(14);
    }
}
