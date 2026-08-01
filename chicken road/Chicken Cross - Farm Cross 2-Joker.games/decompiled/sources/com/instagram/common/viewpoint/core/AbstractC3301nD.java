package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3301nD extends AbstractC1979Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C1971Eo A00;

    public abstract Pair<C18127s[], InterfaceC3302nE[]> A0d(C1971Eo c1971Eo, int[][][] iArr, int[] iArr2, C3338no c3338no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC18097p[] interfaceC18097pArr, C3453pg c3453pg, int[] iArr, boolean z) throws AD {
        int length = interfaceC18097pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC18097p interfaceC18097p = interfaceC18097pArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC18097p.AKM(c3453pg.A08(bestFormatSupportLevel));
                i3 = Math.max(i3, AbstractC18027i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i3 > formatSupportLevel || (i3 == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = i3;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC18097p interfaceC18097p, C3453pg c3453pg) throws AD {
        int[] iArr = new int[c3453pg.A01];
        for (int i = 0; i < c3453pg.A01; i++) {
            iArr[i] = interfaceC18097p.AKM(c3453pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC18097p[] interfaceC18097pArr) throws AD {
        int[] iArr = new int[interfaceC18097pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC18097pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1979Ew
    public final C1980Ex A0b(InterfaceC18097p[] interfaceC18097pArr, C3320nW c3320nW, C3338no c3338no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC18097pArr.length + 1];
        C3453pg[][] c3453pgArr = new C3453pg[interfaceC18097pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC18097pArr.length + 1][][];
        for (int i = 0; i < c3453pgArr.length; i++) {
            c3453pgArr[i] = new C3453pg[c3320nW.A01];
            iArr2[i] = new int[c3320nW.A01][];
        }
        int[] A0a = A0a(interfaceC18097pArr);
        for (int i2 = 0; i2 < c3320nW.A01; i2++) {
            C3453pg A05 = c3320nW.A05(i2);
            int groupIndex = A0Y(interfaceC18097pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC18097pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC18097pArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c3453pgArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C3320nW[] c3320nWArr = new C3320nW[interfaceC18097pArr.length];
        String[] strArr = new String[interfaceC18097pArr.length];
        int[] iArr3 = new int[interfaceC18097pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC18097pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c3320nWArr[i4] = new C3320nW((C3453pg[]) C5C.A1I(c3453pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC18097pArr[i4].getName();
                iArr3[i4] = interfaceC18097pArr[i4].A9N();
                i4++;
            } else {
                C1971Eo c1971Eo = new C1971Eo(strArr, iArr3, c3320nWArr, A0a, iArr2, new C3320nW((C3453pg[]) C5C.A1I(c3453pgArr[interfaceC18097pArr.length], iArr[interfaceC18097pArr.length])));
                Pair<C18127s[], InterfaceC3302nE[]> A0d = A0d(c1971Eo, iArr2, A0a, c3338no, timeline);
                return new C1980Ex((C18127s[]) A0d.first, (InterfaceC3302nE[]) A0d.second, AbstractC1976Et.A00(c1971Eo, (InterfaceC1973Eq[]) A0d.second), c1971Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1979Ew
    public final void A0c(Object obj) {
        this.A00 = (C1971Eo) obj;
    }
}
