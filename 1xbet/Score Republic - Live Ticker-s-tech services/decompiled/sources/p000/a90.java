package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a90 {

    /* JADX INFO: renamed from: a */
    public static final g72 f78a = new g72("CLOSED", 3);

    /* JADX INFO: renamed from: b */
    public static final boolean[] f79b = new boolean[3];

    /* JADX INFO: renamed from: c */
    public static Boolean f80c;

    /* JADX INFO: renamed from: d */
    public static Boolean f81d;

    /* JADX INFO: renamed from: e */
    public static Boolean f82e;

    /* JADX INFO: renamed from: f */
    public static Boolean f83f;

    /* JADX INFO: renamed from: A */
    public static int m104A(byte[] bArr, int i, go1 go1Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            go1Var.f2833b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        go1Var.f2833b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: B */
    public static IOException m105B(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    /* JADX INFO: renamed from: C */
    public static int m106C(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: D */
    public static long m107D(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: E */
    public static int m108E(byte[] bArr, int i, go1 go1Var) throws mp1 {
        int iM138w = m138w(bArr, i, go1Var);
        int i2 = go1Var.f2832a;
        if (i2 < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            go1Var.f2834c = "";
            return iM138w;
        }
        go1Var.f2834c = vq1.m5186d(bArr, iM138w, i2);
        return iM138w + i2;
    }

    /* JADX INFO: renamed from: F */
    public static int m109F(byte[] bArr, int i, go1 go1Var) throws mp1 {
        int iM138w = m138w(bArr, i, go1Var);
        int i2 = go1Var.f2832a;
        if (i2 < 0) {
            re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM138w) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            go1Var.f2834c = ko1.f4486k;
            return iM138w;
        }
        go1Var.f2834c = ko1.m3063j(bArr, iM138w, i2);
        return iM138w + i2;
    }

    /* JADX INFO: renamed from: G */
    public static int m110G(Object obj, hq1 hq1Var, byte[] bArr, int i, int i2, go1 go1Var) throws mp1 {
        int iM140y = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM140y = m140y(i3, bArr, iM140y, go1Var);
            i3 = go1Var.f2832a;
        }
        int i4 = iM140y;
        if (i3 < 0 || i3 > i2 - i4) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = go1Var.f2835d + 1;
        go1Var.f2835d = i5;
        if (i5 >= 100) {
            re1.m4350e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        hq1Var.mo473j(obj, bArr, i4, i6, go1Var);
        go1Var.f2835d--;
        go1Var.f2834c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: H */
    public static int m111H(Object obj, hq1 hq1Var, byte[] bArr, int i, int i2, int i3, go1 go1Var) throws mp1 {
        zp1 zp1Var = (zp1) hq1Var;
        int i4 = go1Var.f2835d + 1;
        go1Var.f2835d = i4;
        if (i4 >= 100) {
            re1.m4350e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iM6021y = zp1Var.m6021y(obj, bArr, i, i2, i3, go1Var);
        go1Var.f2835d--;
        go1Var.f2834c = obj;
        return iM6021y;
    }

    /* JADX INFO: renamed from: I */
    public static int m112I(int i, byte[] bArr, int i2, int i3, kp1 kp1Var, go1 go1Var) {
        ap1 ap1Var = (ap1) kp1Var;
        int iM138w = m138w(bArr, i2, go1Var);
        ap1Var.m458e(go1Var.f2832a);
        while (iM138w < i3) {
            int iM138w2 = m138w(bArr, iM138w, go1Var);
            if (i != go1Var.f2832a) {
                break;
            }
            iM138w = m138w(bArr, iM138w2, go1Var);
            ap1Var.m458e(go1Var.f2832a);
        }
        return iM138w;
    }

    /* JADX INFO: renamed from: J */
    public static int m113J(byte[] bArr, int i, kp1 kp1Var, go1 go1Var) throws mp1 {
        ap1 ap1Var = (ap1) kp1Var;
        int iM138w = m138w(bArr, i, go1Var);
        int i2 = go1Var.f2832a + iM138w;
        while (iM138w < i2) {
            iM138w = m138w(bArr, iM138w, go1Var);
            ap1Var.m458e(go1Var.f2832a);
        }
        if (iM138w == i2) {
            return iM138w;
        }
        re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: K */
    public static int m114K(hq1 hq1Var, int i, byte[] bArr, int i2, int i3, kp1 kp1Var, go1 go1Var) throws mp1 {
        zo1 zo1VarMo464a = hq1Var.mo464a();
        hq1 hq1Var2 = hq1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        go1 go1Var2 = go1Var;
        int iM110G = m110G(zo1VarMo464a, hq1Var2, bArr2, i2, i4, go1Var2);
        hq1Var2.mo472i(zo1VarMo464a);
        go1Var2.f2834c = zo1VarMo464a;
        kp1Var.add(zo1VarMo464a);
        while (iM110G < i4) {
            go1 go1Var3 = go1Var2;
            int i5 = i4;
            int iM138w = m138w(bArr2, iM110G, go1Var3);
            if (i != go1Var3.f2832a) {
                break;
            }
            byte[] bArr3 = bArr2;
            hq1 hq1Var3 = hq1Var2;
            zo1 zo1VarMo464a2 = hq1Var3.mo464a();
            iM110G = m110G(zo1VarMo464a2, hq1Var3, bArr3, iM138w, i5, go1Var3);
            hq1Var2 = hq1Var3;
            bArr2 = bArr3;
            i4 = i5;
            go1Var2 = go1Var3;
            hq1Var2.mo472i(zo1VarMo464a2);
            go1Var2.f2834c = zo1VarMo464a2;
            kp1Var.add(zo1VarMo464a2);
        }
        return iM110G;
    }

    /* JADX INFO: renamed from: L */
    public static int m115L(int i, byte[] bArr, int i2, int i3, oq1 oq1Var, go1 go1Var) throws mp1 {
        if ((i >>> 3) == 0) {
            re1.m4350e("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM104A = m104A(bArr, i2, go1Var);
            oq1Var.m3751d(i, Long.valueOf(go1Var.f2833b));
            return iM104A;
        }
        if (i4 == 1) {
            oq1Var.m3751d(i, Long.valueOf(m107D(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM138w = m138w(bArr, i2, go1Var);
            int i5 = go1Var.f2832a;
            if (i5 < 0) {
                re1.m4350e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM138w) {
                re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                oq1Var.m3751d(i, ko1.f4486k);
            } else {
                oq1Var.m3751d(i, ko1.m3063j(bArr, iM138w, i5));
            }
            return iM138w + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                oq1Var.m3751d(i, Integer.valueOf(m106C(i2, bArr)));
                return i2 + 4;
            }
            re1.m4350e("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        oq1 oq1VarM3748a = oq1.m3748a();
        int i7 = go1Var.f2835d + 1;
        go1Var.f2835d = i7;
        if (i7 >= 100) {
            re1.m4350e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM138w2 = m138w(bArr, i2, go1Var);
            int i9 = go1Var.f2832a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM138w2;
                break;
            }
            i2 = m115L(i9, bArr, iM138w2, i3, oq1VarM3748a, go1Var);
            i8 = i9;
        }
        go1Var.f2835d--;
        if (i2 > i3 || i8 != i6) {
            re1.m4350e("Failed to parse the message.");
            return 0;
        }
        oq1Var.m3751d(i, oq1VarM3748a);
        return i2;
    }

    /* JADX INFO: renamed from: M */
    public static int m116M(int i, byte[] bArr, int i2, int i3, go1 go1Var) throws mp1 {
        if ((i >>> 3) == 0) {
            re1.m4350e("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m104A(bArr, i2, go1Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m138w(bArr, i2, go1Var) + go1Var.f2832a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            re1.m4350e("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m138w(bArr, i2, go1Var);
            i6 = go1Var.f2832a;
            if (i6 == i5) {
                break;
            }
            i2 = m116M(i6, bArr, i2, i3, go1Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        re1.m4350e("Failed to parse the message.");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:409:0x0698  */
    /* JADX WARN: Code duplicated, block: B:412:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:417:0x06af  */
    /* JADX WARN: Code duplicated, block: B:419:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:426:0x06c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x06e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX INFO: renamed from: a */
    public static void m117a(C0179em c0179em, gi0 gi0Var, ArrayList arrayList, int i) {
        int i2;
        C0579pf[] c0579pfArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        C0143dm c0143dm;
        gi0 gi0Var2;
        C0143dm c0143dm2;
        a91 a91Var;
        C0585pl c0585pl;
        a91 a91Var2;
        C0143dm c0143dm3;
        int i6;
        C0585pl[] c0585plArr;
        C0585pl c0585pl2;
        a91 a91Var3;
        int i7;
        C0585pl[] c0585plArr2;
        int i8;
        C0585pl c0585pl3;
        C0585pl c0585pl4;
        a91 a91Var4;
        C0585pl c0585pl5;
        a91 a91Var5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        float f;
        int i11;
        a91 a91Var6;
        a91 a91Var7;
        a91 a91Var8;
        a91 a91Var9;
        C0129d8 c0129d8M2091l;
        float f2;
        C0585pl c0585pl6;
        C0143dm c0143dm4;
        int i12;
        int i13;
        C0143dm c0143dm5;
        C0179em c0179em2 = c0179em;
        if (i == 0) {
            i2 = c0179em2.f2141y0;
            c0579pfArr = c0179em2.f2122B0;
            i3 = 0;
        } else {
            i2 = c0179em2.f2142z0;
            c0579pfArr = c0179em2.f2121A0;
            i3 = 2;
        }
        int i14 = i2;
        C0579pf[] c0579pfArr2 = c0579pfArr;
        int i15 = 0;
        while (i15 < i14) {
            C0579pf c0579pf = c0579pfArr2[i15];
            boolean z4 = c0579pf.f6125q;
            C0143dm c0143dm6 = c0579pf.f6109a;
            C0585pl[] c0585plArr3 = c0143dm6.f1696P;
            int i16 = 3;
            int i17 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i15;
            } else {
                int i18 = c0579pf.f6120l;
                int i19 = i18 * 2;
                C0143dm c0143dm7 = c0143dm6;
                C0143dm c0143dm8 = c0143dm7;
                boolean z5 = false;
                while (!z5) {
                    c0579pf.f6117i++;
                    C0143dm[] c0143dmArr = c0143dm7.f1730l0;
                    C0585pl[] c0585plArr4 = c0143dm7.f1696P;
                    c0143dmArr[i18] = null;
                    c0143dm7.f1728k0[i18] = null;
                    if (c0143dm7.f1718f0 != i17) {
                        c0143dm7.m1255h(i18);
                        c0585plArr4[i19].m3957d();
                        int i20 = i19 + 1;
                        c0585plArr4[i20].m3957d();
                        c0585plArr4[i19].m3957d();
                        c0585plArr4[i20].m3957d();
                        if (c0579pf.f6110b == null) {
                            c0579pf.f6110b = c0143dm7;
                        }
                        c0579pf.f6112d = c0143dm7;
                        int i21 = c0143dm7.f1736o0[i18];
                        if (i21 == i16) {
                            int i22 = c0143dm7.f1741t[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                c0579pf.f6118j++;
                                float f4 = c0143dm7.f1726j0[i18];
                                if (f4 > 0.0f) {
                                    c0579pf.f6119k += f4;
                                }
                                i13 = i18;
                                if (c0143dm7.f1718f0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0579pf.f6122n = true;
                                    } else {
                                        c0579pf.f6123o = true;
                                    }
                                    if (c0579pf.f6116h == null) {
                                        c0579pf.f6116h = new ArrayList();
                                    }
                                    c0579pf.f6116h.add(c0143dm7);
                                }
                                if (c0579pf.f6114f == null) {
                                    c0579pf.f6114f = c0143dm7;
                                }
                                C0143dm c0143dm9 = c0579pf.f6115g;
                                if (c0143dm9 != null) {
                                    c0143dm9.f1728k0[i13] = c0143dm7;
                                }
                                c0579pf.f6115g = c0143dm7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (c0143dm7.f1739r == 0 && c0143dm7.f1742u == 0) {
                                    int i23 = c0143dm7.f1743v;
                                }
                            } else if (c0143dm7.f1740s == 0 && c0143dm7.f1745x == 0) {
                                int i24 = c0143dm7.f1746y;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    C0143dm c0143dm10 = c0143dm8;
                    if (c0143dm10 != c0143dm7) {
                        c0143dm10.f1730l0[i13] = c0143dm7;
                    }
                    C0585pl c0585pl7 = c0585plArr4[i19 + 1].f6197f;
                    if (c0585pl7 != null) {
                        c0143dm5 = c0585pl7.f6195d;
                        C0585pl c0585pl8 = c0143dm5.f1696P[i19].f6197f;
                        if (c0585pl8 == null || c0585pl8.f6195d != c0143dm7) {
                            c0143dm5 = null;
                        }
                    } else {
                        c0143dm5 = null;
                    }
                    if (c0143dm5 == null) {
                        c0143dm5 = c0143dm7;
                        z5 = true;
                    }
                    c0143dm8 = c0143dm7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    c0143dm7 = c0143dm5;
                    i15 = i15;
                }
                i4 = i15;
                int i25 = i18;
                C0143dm c0143dm11 = c0579pf.f6110b;
                if (c0143dm11 != null) {
                    c0143dm11.f1696P[i19].m3957d();
                }
                C0143dm c0143dm12 = c0579pf.f6112d;
                if (c0143dm12 != null) {
                    c0143dm12.f1696P[i19 + 1].m3957d();
                }
                c0579pf.f6111c = c0143dm7;
                if (i25 == 0 && c0579pf.f6121m) {
                    c0579pf.f6113e = c0143dm7;
                } else {
                    c0579pf.f6113e = c0143dm6;
                }
                c0579pf.f6124p = c0579pf.f6123o && c0579pf.f6122n;
            }
            c0579pf.f6125q = true;
            if (arrayList == 0 || arrayList.contains(c0143dm6)) {
                C0143dm c0143dm13 = c0579pf.f6111c;
                C0143dm c0143dm14 = c0579pf.f6110b;
                C0143dm c0143dm15 = c0579pf.f6112d;
                C0143dm c0143dm16 = c0579pf.f6113e;
                float f5 = c0579pf.f6119k;
                int[] iArr = c0179em2.f1736o0;
                C0585pl[] c0585plArr5 = c0179em2.f1696P;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = c0143dm16.f1722h0;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = c0143dm16.f1724i0;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    C0585pl[] c0585plArr6 = c0143dm6.f1696P;
                    int[] iArr2 = c0143dm6.f1736o0;
                    C0585pl c0585pl9 = c0585plArr6[i3];
                    int i28 = z ? 1 : 4;
                    int iM3957d = c0585pl9.m3957d();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && c0143dm6.f1741t[i] == 0;
                    C0585pl c0585pl10 = c0585pl9.f6197f;
                    if (c0585pl10 != null && c0143dm6 != c0143dm6) {
                        iM3957d = c0585pl10.m3957d() + iM3957d;
                    }
                    int i29 = iM3957d;
                    if (z13 && c0143dm6 != c0143dm6 && c0143dm6 != c0143dm14) {
                        i28 = 8;
                    }
                    C0143dm c0143dm17 = c0143dm6;
                    C0585pl c0585pl11 = c0585pl9.f6197f;
                    if (c0585pl11 != null) {
                        boolean z15 = z14;
                        a91 a91Var10 = c0585pl9.f6200i;
                        a91 a91Var11 = c0585pl11.f6200i;
                        if (c0143dm6 == c0143dm14) {
                            gi0Var.m2085f(a91Var10, a91Var11, i29, 6);
                        } else {
                            gi0Var.m2085f(a91Var10, a91Var11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        gi0Var.m2084e(c0585pl9.f6200i, c0585pl9.f6197f.f6200i, i29, (c0143dm6 == c0143dm14 && z13 && c0143dm6.f1698R[i]) ? 5 : i28);
                    }
                    if (z12) {
                        if (c0143dm6.f1718f0 == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            gi0Var.m2085f(c0585plArr6[i3 + 1].f6200i, c0585plArr6[i3].f6200i, 0, 5);
                        }
                        gi0Var.m2085f(c0585plArr6[i3].f6200i, c0585plArr5[i3].f6200i, i12, 8);
                    }
                    C0585pl c0585pl12 = c0585plArr6[i3 + 1].f6197f;
                    if (c0585pl12 != null) {
                        c0143dm4 = c0585pl12.f6195d;
                        C0585pl c0585pl13 = c0143dm4.f1696P[i3].f6197f;
                        if (c0585pl13 == null || c0585pl13.f6195d != c0143dm6) {
                            c0143dm4 = null;
                        }
                    } else {
                        c0143dm4 = null;
                    }
                    if (c0143dm4 != null) {
                        c0143dm6 = c0143dm4;
                    } else {
                        z11 = true;
                    }
                    c0143dm6 = c0143dm17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (c0143dm15 != null) {
                    int i30 = i3 + 1;
                    if (c0143dm13.f1696P[i30].f6197f != null) {
                        C0585pl c0585pl14 = c0143dm15.f1696P[i30];
                        if (c0143dm15.f1736o0[i] == 3 && c0143dm15.f1741t[i] == 0 && !z17) {
                            C0585pl c0585pl15 = c0585pl14.f6197f;
                            if (c0585pl15.f6195d == c0179em2) {
                                gi0Var.m2084e(c0585pl14.f6200i, c0585pl15.f6200i, -c0585pl14.m3957d(), 5);
                            } else if (z17) {
                                c0585pl6 = c0585pl14.f6197f;
                                if (c0585pl6.f6195d == c0179em2) {
                                    gi0Var.m2084e(c0585pl14.f6200i, c0585pl6.f6200i, -c0585pl14.m3957d(), 4);
                                }
                            }
                        } else if (z17) {
                            c0585pl6 = c0585pl14.f6197f;
                            if (c0585pl6.f6195d == c0179em2) {
                                gi0Var.m2084e(c0585pl14.f6200i, c0585pl6.f6200i, -c0585pl14.m3957d(), 4);
                            }
                        }
                        gi0Var.m2086g(c0585pl14.f6200i, c0143dm13.f1696P[i30].f6197f.f6200i, -c0585pl14.m3957d(), 6);
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    a91 a91Var12 = c0585plArr5[i31].f6200i;
                    C0585pl c0585pl16 = c0143dm13.f1696P[i31];
                    gi0Var.m2085f(a91Var12, c0585pl16.f6200i, c0585pl16.m3957d(), 8);
                }
                ArrayList arrayList3 = c0579pf.f6116h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c0579pf.f6122n && !c0579pf.f6124p) {
                        f5 = c0579pf.f6118j;
                    }
                    C0143dm c0143dm18 = null;
                    float f6 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        C0143dm c0143dm19 = (C0143dm) arrayList3.get(i32);
                        float[] fArr = c0143dm19.f1726j0;
                        C0585pl[] c0585plArr7 = c0143dm19.f1696P;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                gi0Var.m2084e(c0585plArr7[i3 + 1].f6200i, c0585plArr7[i3].f6200i, 0, 8);
                                i10 = i14;
                                f = f3;
                                f6 = f6;
                                i11 = i32;
                            } else {
                                float f8 = f6;
                                if (c0143dm18 != null) {
                                    C0585pl[] c0585plArr8 = c0143dm18.f1696P;
                                    a91Var6 = c0585plArr8[i3].f6200i;
                                    int i33 = i3 + 1;
                                    a91Var7 = c0585plArr8[i33].f6200i;
                                    a91Var8 = c0585plArr7[i3].f6200i;
                                    a91Var9 = c0585plArr7[i33].f6200i;
                                    c0129d8M2091l = gi0Var.m2091l();
                                    f2 = f3;
                                    c0129d8M2091l.f1577b = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        i11 = i32;
                                        i10 = i14;
                                        c0129d8M2091l.f1579d.m5110g(a91Var6, 1.0f);
                                        c0129d8M2091l.f1579d.m5110g(a91Var7, -1.0f);
                                        c0129d8M2091l.f1579d.m5110g(a91Var9, 1.0f);
                                        c0129d8M2091l.f1579d.m5110g(a91Var8, -1.0f);
                                    } else {
                                        C0793v7 c0793v7 = c0129d8M2091l.f1579d;
                                        if (f8 == f) {
                                            i11 = i32;
                                            c0793v7.m5110g(a91Var6, 1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var7, -1.0f);
                                            i10 = i14;
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            if (f7 == f3) {
                                                c0793v7.m5110g(a91Var8, 1.0f);
                                                c0129d8M2091l.f1579d.m5110g(a91Var9, -1.0f);
                                            } else {
                                                float f9 = (f8 / f5) / (f7 / f5);
                                                c0793v7.m5110g(a91Var6, 1.0f);
                                                c0129d8M2091l.f1579d.m5110g(a91Var7, -1.0f);
                                                c0129d8M2091l.f1579d.m5110g(a91Var9, f9);
                                                c0129d8M2091l.f1579d.m5110g(a91Var8, -f9);
                                            }
                                        }
                                    }
                                    gi0Var.m2082c(c0129d8M2091l);
                                } else {
                                    i10 = i14;
                                    f = f3;
                                    i11 = i32;
                                }
                                f6 = f7;
                                c0143dm18 = c0143dm19;
                            }
                        } else {
                            if (c0579pf.f6124p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                gi0Var.m2084e(c0585plArr7[i3 + 1].f6200i, c0585plArr7[i3].f6200i, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    gi0Var.m2084e(c0585plArr7[i3 + 1].f6200i, c0585plArr7[i3].f6200i, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (c0143dm18 != null) {
                                        C0585pl[] c0585plArr9 = c0143dm18.f1696P;
                                        a91Var6 = c0585plArr9[i3].f6200i;
                                        int i34 = i3 + 1;
                                        a91Var7 = c0585plArr9[i34].f6200i;
                                        a91Var8 = c0585plArr7[i3].f6200i;
                                        a91Var9 = c0585plArr7[i34].f6200i;
                                        c0129d8M2091l = gi0Var.m2091l();
                                        f2 = f3;
                                        c0129d8M2091l.f1577b = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            i11 = i32;
                                            i10 = i14;
                                            c0129d8M2091l.f1579d.m5110g(a91Var6, 1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var7, -1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var9, 1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var8, -1.0f);
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            c0129d8M2091l.f1579d.m5110g(a91Var6, 1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var7, -1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var9, 1.0f);
                                            c0129d8M2091l.f1579d.m5110g(a91Var8, -1.0f);
                                        }
                                        gi0Var.m2082c(c0129d8M2091l);
                                    } else {
                                        i10 = i14;
                                        f = f3;
                                        i11 = i32;
                                    }
                                    f6 = f7;
                                    c0143dm18 = c0143dm19;
                                }
                            }
                            i10 = i14;
                            f = f3;
                            f6 = f6;
                            i11 = i32;
                        }
                        i32 = i11 + 1;
                        i14 = i10;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i14;
                if (c0143dm14 == null || !(c0143dm14 == c0143dm15 || z17)) {
                    c0143dm = c0143dm15;
                    if (z2 && c0143dm14 != null) {
                        int i35 = c0579pf.f6118j;
                        boolean z18 = i35 > 0 && c0579pf.f6117i == i35;
                        C0143dm c0143dm20 = c0143dm14;
                        C0143dm c0143dm21 = c0143dm20;
                        while (true) {
                            C0585pl[] c0585plArr10 = c0143dm21.f1696P;
                            if (c0143dm20 == null) {
                                break;
                            }
                            C0585pl[] c0585plArr11 = c0143dm20.f1696P;
                            C0143dm c0143dm22 = c0143dm20.f1730l0[i];
                            while (true) {
                                if (c0143dm22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c0143dm22.f1718f0 != 8) {
                                    break;
                                } else {
                                    c0143dm22 = c0143dm22.f1730l0[i];
                                }
                            }
                            if (c0143dm22 != null || c0143dm20 == c0143dm) {
                                C0585pl c0585pl17 = c0585plArr11[i3];
                                a91 a91Var13 = c0585pl17.f6200i;
                                C0585pl c0585pl18 = c0585pl17.f6197f;
                                a91 a91Var14 = c0585pl18 != null ? c0585pl18.f6200i : null;
                                if (c0143dm21 != c0143dm20) {
                                    a91Var14 = c0585plArr10[i3 + 1].f6200i;
                                } else if (c0143dm20 == c0143dm14) {
                                    C0585pl c0585pl19 = c0585plArr3[i3].f6197f;
                                    a91Var14 = c0585pl19 != null ? c0585pl19.f6200i : null;
                                }
                                int iM3957d2 = c0585pl17.m3957d();
                                int i36 = i3 + 1;
                                int iM3957d3 = c0585plArr11[i36].m3957d();
                                if (c0143dm22 != null) {
                                    c0585pl2 = c0143dm22.f1696P[i3];
                                    c0585plArr = c0585plArr10;
                                    a91Var3 = c0585pl2.f6200i;
                                } else {
                                    c0585plArr = c0585plArr10;
                                    c0585pl2 = c0143dm13.f1696P[i36].f6197f;
                                    a91Var3 = c0585pl2 != null ? c0585pl2.f6200i : null;
                                }
                                a91 a91Var15 = c0585plArr11[i36].f6200i;
                                if (c0585pl2 != null) {
                                    iM3957d3 += c0585pl2.m3957d();
                                }
                                int iM3957d4 = c0585plArr[i36].m3957d() + iM3957d2;
                                if (a91Var13 == null || a91Var14 == null || a91Var3 == null || a91Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (c0143dm20 == c0143dm14) {
                                        iM3957d4 = c0143dm14.f1696P[i3].m3957d();
                                    }
                                    int i37 = iM3957d4;
                                    if (c0143dm20 == c0143dm) {
                                        iM3957d3 = c0143dm.f1696P[i36].m3957d();
                                    }
                                    i7 = 8;
                                    gi0Var.m2081b(a91Var13, a91Var14, i37, 0.5f, a91Var3, a91Var15, iM3957d3, z18 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (c0143dm20.f1718f0 != i7) {
                                c0143dm21 = c0143dm20;
                            }
                            c0143dm20 = c0143dm22;
                            c0143dm21 = c0143dm21;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && c0143dm14 != null) {
                            int i39 = c0579pf.f6118j;
                            boolean z19 = i39 > 0 && c0579pf.f6117i == i39;
                            C0143dm c0143dm23 = c0143dm14;
                            C0143dm c0143dm24 = c0143dm23;
                            while (true) {
                                C0585pl[] c0585plArr12 = c0143dm23.f1696P;
                                if (c0143dm24 == null) {
                                    break;
                                }
                                C0585pl[] c0585plArr13 = c0143dm24.f1696P;
                                C0143dm c0143dm25 = c0143dm24.f1730l0[i];
                                while (c0143dm25 != null && c0143dm25.f1718f0 == i38) {
                                    c0143dm25 = c0143dm25.f1730l0[i];
                                }
                                if (c0143dm24 == c0143dm14 || c0143dm24 == c0143dm || c0143dm25 == null) {
                                    c0143dm2 = c0143dm23;
                                } else {
                                    if (c0143dm25 == c0143dm) {
                                        c0143dm25 = null;
                                    }
                                    C0585pl c0585pl20 = c0585plArr13[i3];
                                    a91 a91Var16 = c0585pl20.f6200i;
                                    int i40 = i3 + 1;
                                    a91 a91Var17 = c0585plArr12[i40].f6200i;
                                    int iM3957d5 = c0585pl20.m3957d();
                                    int iM3957d6 = c0585plArr13[i40].m3957d();
                                    if (c0143dm25 != null) {
                                        c0585pl = c0143dm25.f1696P[i3];
                                        a91Var = c0585pl.f6200i;
                                        c0143dm2 = c0143dm23;
                                        C0585pl c0585pl21 = c0585pl.f6197f;
                                        a91Var2 = c0585pl21 != null ? c0585pl21.f6200i : null;
                                    } else {
                                        c0143dm2 = c0143dm23;
                                        C0585pl c0585pl22 = c0143dm.f1696P[i3];
                                        a91Var = c0585pl22 != null ? c0585pl22.f6200i : null;
                                        a91 a91Var18 = c0585plArr13[i40].f6200i;
                                        c0585pl = c0585pl22;
                                        a91Var2 = a91Var18;
                                    }
                                    if (c0585pl != null) {
                                        iM3957d6 += c0585pl.m3957d();
                                    }
                                    int iM3957d7 = c0585plArr12[i40].m3957d() + iM3957d5;
                                    C0143dm c0143dm26 = c0143dm25;
                                    int i41 = iM3957d6;
                                    int i42 = z19 ? 8 : 4;
                                    if (a91Var16 == null || a91Var17 == null || a91Var == null || a91Var2 == null) {
                                        c0143dm3 = c0143dm26;
                                    } else {
                                        a91 a91Var19 = a91Var;
                                        c0143dm3 = c0143dm26;
                                        gi0Var.m2081b(a91Var16, a91Var17, iM3957d7, 0.5f, a91Var19, a91Var2, i41, i42);
                                    }
                                    c0143dm25 = c0143dm3;
                                }
                                if (c0143dm24.f1718f0 != 8) {
                                    c0143dm2 = c0143dm24;
                                }
                                c0143dm24 = c0143dm25;
                                i38 = 8;
                                c0143dm23 = c0143dm2;
                            }
                            gi0Var2 = gi0Var;
                            C0585pl c0585pl23 = c0143dm14.f1696P[i3];
                            C0585pl c0585pl24 = c0585plArr3[i3].f6197f;
                            int i43 = i3 + 1;
                            C0585pl c0585pl25 = c0143dm.f1696P[i43];
                            C0585pl c0585pl26 = c0143dm13.f1696P[i43].f6197f;
                            if (c0585pl24 != null) {
                                if (c0143dm14 != c0143dm) {
                                    gi0Var2.m2084e(c0585pl23.f6200i, c0585pl24.f6200i, c0585pl23.m3957d(), 5);
                                } else if (c0585pl26 != null) {
                                    gi0Var2.m2081b(c0585pl23.f6200i, c0585pl24.f6200i, c0585pl23.m3957d(), 0.5f, c0585pl25.f6200i, c0585pl26.f6200i, c0585pl25.m3957d(), 5);
                                }
                            }
                            if (c0585pl26 != null && c0143dm14 != c0143dm) {
                                gi0Var2.m2084e(c0585pl25.f6200i, c0585pl26.f6200i, -c0585pl25.m3957d(), 5);
                            }
                        }
                        if ((z2 || z3) && c0143dm14 != null && c0143dm14 != c0143dm) {
                            c0585plArr2 = c0143dm14.f1696P;
                            C0585pl c0585pl27 = c0585plArr2[i3];
                            if (c0143dm == null) {
                                c0143dm = c0143dm14;
                            }
                            C0585pl[] c0585plArr14 = c0143dm.f1696P;
                            i8 = i3 + 1;
                            c0585pl3 = c0585plArr14[i8];
                            c0585pl4 = c0585pl27.f6197f;
                            if (c0585pl4 != null) {
                                a91Var4 = c0585pl4.f6200i;
                            } else {
                                a91Var4 = null;
                            }
                            c0585pl5 = c0585pl3.f6197f;
                            if (c0585pl5 != null) {
                                a91Var5 = c0585pl5.f6200i;
                            } else {
                                a91Var5 = null;
                            }
                            if (c0143dm13 != c0143dm) {
                                C0585pl c0585pl28 = c0143dm13.f1696P[i8].f6197f;
                                a91Var5 = c0585pl28 != null ? c0585pl28.f6200i : null;
                            }
                            if (c0143dm14 == c0143dm) {
                                c0585pl3 = c0585plArr2[i8];
                            }
                            if (a91Var4 == null && a91Var5 != null) {
                                gi0Var2.m2081b(c0585pl27.f6200i, a91Var4, c0585pl27.m3957d(), 0.5f, a91Var5, c0585pl3.f6200i, c0585plArr14[i8].m3957d(), 5);
                            }
                        }
                    }
                } else {
                    C0585pl c0585pl29 = c0585plArr3[i3];
                    int i44 = i3 + 1;
                    C0585pl c0585pl30 = c0143dm13.f1696P[i44];
                    C0585pl c0585pl31 = c0585pl29.f6197f;
                    a91 a91Var20 = c0585pl31 != null ? c0585pl31.f6200i : null;
                    C0585pl c0585pl32 = c0585pl30.f6197f;
                    a91 a91Var21 = c0585pl32 != null ? c0585pl32.f6200i : null;
                    C0585pl c0585pl33 = c0143dm14.f1696P[i3];
                    if (c0143dm15 != null) {
                        c0585pl30 = c0143dm15.f1696P[i44];
                    }
                    if (a91Var20 == null || a91Var21 == null) {
                        c0143dm = c0143dm15;
                    } else {
                        float f11 = i == 0 ? c0143dm16.f1712c0 : c0143dm16.f1714d0;
                        int iM3957d8 = c0585pl33.m3957d();
                        int iM3957d9 = c0585pl30.m3957d();
                        a91 a91Var22 = c0585pl33.f6200i;
                        a91 a91Var23 = c0585pl30.f6200i;
                        a91 a91Var24 = a91Var20;
                        c0143dm = c0143dm15;
                        gi0Var.m2081b(a91Var22, a91Var24, iM3957d8, f11, a91Var21, a91Var23, iM3957d9, 7);
                    }
                }
                gi0Var2 = gi0Var;
                if (z2) {
                    c0585plArr2 = c0143dm14.f1696P;
                    C0585pl c0585pl210 = c0585plArr2[i3];
                    if (c0143dm == null) {
                        c0143dm = c0143dm14;
                    }
                    C0585pl[] c0585plArr15 = c0143dm.f1696P;
                    i8 = i3 + 1;
                    c0585pl3 = c0585plArr15[i8];
                    c0585pl4 = c0585pl210.f6197f;
                    if (c0585pl4 != null) {
                        a91Var4 = c0585pl4.f6200i;
                    } else {
                        a91Var4 = null;
                    }
                    c0585pl5 = c0585pl3.f6197f;
                    if (c0585pl5 != null) {
                        a91Var5 = c0585pl5.f6200i;
                    } else {
                        a91Var5 = null;
                    }
                    if (c0143dm13 != c0143dm) {
                        C0585pl c0585pl211 = c0143dm13.f1696P[i8].f6197f;
                        a91Var5 = c0585pl211 != null ? c0585pl211.f6200i : null;
                    }
                    if (c0143dm14 == c0143dm) {
                        c0585pl3 = c0585plArr2[i8];
                    }
                    if (a91Var4 == null) {
                    }
                } else {
                    c0585plArr2 = c0143dm14.f1696P;
                    C0585pl c0585pl212 = c0585plArr2[i3];
                    if (c0143dm == null) {
                        c0143dm = c0143dm14;
                    }
                    C0585pl[] c0585plArr16 = c0143dm.f1696P;
                    i8 = i3 + 1;
                    c0585pl3 = c0585plArr16[i8];
                    c0585pl4 = c0585pl212.f6197f;
                    if (c0585pl4 != null) {
                        a91Var4 = c0585pl4.f6200i;
                    } else {
                        a91Var4 = null;
                    }
                    c0585pl5 = c0585pl3.f6197f;
                    if (c0585pl5 != null) {
                        a91Var5 = c0585pl5.f6200i;
                    } else {
                        a91Var5 = null;
                    }
                    if (c0143dm13 != c0143dm) {
                        C0585pl c0585pl213 = c0143dm13.f1696P[i8].f6197f;
                        a91Var5 = c0585pl213 != null ? c0585pl213.f6200i : null;
                    }
                    if (c0143dm14 == c0143dm) {
                        c0585pl3 = c0585plArr2[i8];
                    }
                    if (a91Var4 == null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            c0179em2 = c0179em;
            i14 = i5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m118b(int i, int i2, String str) {
        if (i < 0) {
            return o80.m3651s("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o80.m3651s("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C0270h1.m2190f(j11.m2773h("negative size: ", i2));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m119c(int i, String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2190f(o80.m3651s(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: d */
    public static void m120d(long j, String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2190f(o80.m3651s(str, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: e */
    public static void m121e(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2190f(o80.m3651s(str, obj));
    }

    /* JADX INFO: renamed from: f */
    public static void m122f(String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2190f(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m123g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m124h(int i, int i2) {
        String strM3651s;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM3651s = o80.m3651s("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C0270h1.m2190f(j11.m2773h("negative size: ", i2));
                    return;
                }
                strM3651s = o80.m3651s("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM3651s);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m125i(C0179em c0179em, gi0 gi0Var, C0143dm c0143dm) {
        c0143dm.f1735o = -1;
        C0585pl c0585pl = c0143dm.f1692L;
        int[] iArr = c0143dm.f1736o0;
        C0585pl c0585pl2 = c0143dm.f1691K;
        C0585pl c0585pl3 = c0143dm.f1689I;
        C0585pl c0585pl4 = c0143dm.f1690J;
        C0585pl c0585pl5 = c0143dm.f1688H;
        c0143dm.f1737p = -1;
        int[] iArr2 = c0179em.f1736o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c0585pl5.f6198g;
            int iM1260o = c0179em.m1260o() - c0585pl4.f6198g;
            c0585pl5.f6200i = gi0Var.m2090k(c0585pl5);
            c0585pl4.f6200i = gi0Var.m2090k(c0585pl4);
            gi0Var.m2083d(c0585pl5.f6200i, i);
            gi0Var.m2083d(c0585pl4.f6200i, iM1260o);
            c0143dm.f1735o = 2;
            c0143dm.f1704X = i;
            int i2 = iM1260o - i;
            c0143dm.f1700T = i2;
            int i3 = c0143dm.f1708a0;
            if (i2 < i3) {
                c0143dm.f1700T = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c0585pl3.f6198g;
        int iM1256i = c0179em.m1256i() - c0585pl2.f6198g;
        c0585pl3.f6200i = gi0Var.m2090k(c0585pl3);
        c0585pl2.f6200i = gi0Var.m2090k(c0585pl2);
        gi0Var.m2083d(c0585pl3.f6200i, i4);
        gi0Var.m2083d(c0585pl2.f6200i, iM1256i);
        if (c0143dm.f1706Z > 0 || c0143dm.f1718f0 == 8) {
            a91 a91VarM2090k = gi0Var.m2090k(c0585pl);
            c0585pl.f6200i = a91VarM2090k;
            gi0Var.m2083d(a91VarM2090k, c0143dm.f1706Z + i4);
        }
        c0143dm.f1737p = 2;
        c0143dm.f1705Y = i4;
        int i5 = iM1256i - i4;
        c0143dm.f1701U = i5;
        int i6 = c0143dm.f1710b0;
        if (i5 < i6) {
            c0143dm.f1701U = i6;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m126j(Object obj, Object obj2, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(o80.m3651s(str, obj2));
    }

    /* JADX INFO: renamed from: k */
    public static void m127k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: l */
    public static final void m128l(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m129m(int i, int i2) {
        if (i < 0 || i > i2) {
            C0270h1.m2193i(m118b(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m130n(int i, int i2, int i3) {
        String strM118b;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM118b = m118b(i, i3, "start index");
            } else {
                strM118b = (i2 < 0 || i2 > i3) ? m118b(i2, i3, "end index") : o80.m3651s("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM118b);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m131o(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2191g(o80.m3651s(str, obj));
    }

    /* JADX INFO: renamed from: p */
    public static void m132p(String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2191g(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m133q(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m134r(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m135s(g61 g61Var, long j, v60 v60Var) {
        while (true) {
            if (g61Var.f2635e >= j && !g61Var.mo956f()) {
                return g61Var;
            }
            Object objM954d = g61Var.m954d();
            g72 g72Var = f78a;
            if (objM954d == g72Var) {
                return g72Var;
            }
            g61 g61Var2 = (g61) ((AbstractC0102cl) objM954d);
            if (g61Var2 == null) {
                g61Var2 = (g61) v60Var.mo1490g(Long.valueOf(g61Var.f2635e + 1), g61Var);
                if (g61Var.m959i(g61Var2)) {
                    if (g61Var.mo956f()) {
                        g61Var.m958h();
                    }
                }
            }
            g61Var = g61Var2;
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m136t(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f80c == null) {
            f80c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f80c.booleanValue();
        if (f81d == null) {
            f81d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f81d.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX INFO: renamed from: u */
    public static nb1 m137u(nb1 nb1Var) {
        if ((nb1Var instanceof pb1) || (nb1Var instanceof ob1)) {
            return nb1Var;
        }
        if (nb1Var instanceof Serializable) {
            return new ob1(nb1Var);
        }
        pb1 pb1Var = new pb1();
        nb1Var.getClass();
        pb1Var.f6073j = nb1Var;
        return pb1Var;
    }

    /* JADX INFO: renamed from: w */
    public static int m138w(byte[] bArr, int i, go1 go1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m140y(b, bArr, i2, go1Var);
        }
        go1Var.f2832a = b;
        return i2;
    }

    /* JADX INFO: renamed from: x */
    public static IOException m139x(g82 g82Var, Uri uri, IOException iOException, String str) {
        try {
            u82 u82Var = new u82();
            u82Var.f7706j = true;
            File file = (File) g82Var.m1999a(uri, u82Var);
            if (!file.exists()) {
                return m141z(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? m141z(file, iOException, str) : m141z(file, iOException, str);
                }
                return file.canWrite() ? m141z(file, iOException, str) : m141z(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? m141z(file, iOException, str) : m141z(file, iOException, str);
            }
            return file.canWrite() ? m141z(file, iOException, str) : m141z(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m140y(int i, byte[] bArr, int i2, go1 go1Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            go1Var.f2832a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            go1Var.f2832a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            go1Var.f2832a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            go1Var.f2832a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                go1Var.f2832a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: z */
    public static IOException m141z(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m105B(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return m105B(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? m105B(file, iOException, str) : m105B(file, iOException, str);
            }
            return parentFile.canWrite() ? m105B(file, iOException, str) : m105B(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? m105B(file, iOException, str) : m105B(file, iOException, str);
        }
        return parentFile.canWrite() ? m105B(file, iOException, str) : m105B(file, iOException, str);
    }

    /* JADX INFO: renamed from: v */
    public abstract int m142v();
}
