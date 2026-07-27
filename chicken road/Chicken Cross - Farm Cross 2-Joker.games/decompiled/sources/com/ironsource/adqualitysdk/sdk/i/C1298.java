package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Debug;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1298 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String[] f3686 = {StringFog.decrypt("q1xQjbPPOY7nWV3Wpo0lzuJKWJ2zzSaE9k5Uiw==\n", "hDgx+dLgVeE=\n"), StringFog.decrypt("+OjTM3ChaMK07d5oZeN0gqXpnCFj52DM+f/XNWfrdg==\n", "14yyRxGOBK0=\n"), StringFog.decrypt("bitPqShOgQwnKkKuKBGWRjMuTrg=\n", "QVgrykk85SM=\n"), StringFog.decrypt("4z8H6NmJGLivOgqzzMsE+KopD/jZixWwqTUSssvJ\n", "zFtmnLimdNc=\n")};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f3685 = {StringFog.decrypt("+psRSDxM1OH/kFtIPEfG4eaOUEk2Soym8I1LWz9Cx70=\n", "nv4/OlMuos8=\n"), StringFog.decrypt("KaV4eDRYpIYltmt4PFmzgSmkejJ3UKqfJ7B6JA==\n", "RtcfVlk9y/E=\n"), StringFog.decrypt("qdxLmEnWOgq1y0iYSMQkBKHLXg==\n", "xq4stiWlSmU=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f3684 = {StringFog.decrypt("4V3Lcqo6HemoXNNsuygftKUB6nGxLBWijFzbZbk6XqyvXA==\n", "zi6yAd5fcMY=\n"), StringFog.decrypt("qKaDSZxlvjfrvJgVhGmxYPe6iV+MX7Jq8/uJVQ==\n", "h9X6OugA0xg=\n"), StringFog.decrypt("0FgNblTdqJWTQhYrFJep051TBHJT3aHlnlkAM1PX\n", "/yt0HSC4xbo=\n")};

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String[] f3683 = {StringFog.decrypt("JXYO3WYyFeZrYgXHYw==\n", "CgVstAgdO4s=\n"), StringFog.decrypt("bXoKY/TQvhgtew0=\n", "QgloCpr/kHs=\n"), StringFog.decrypt("ElQ4sUsyxz5fHzSkTXTVMQ==\n", "PTBZxSodplo=\n"), StringFog.decrypt("tvolhUGhvCP7sSmeRPuxIuo=\n", "mZ5E8SCO3Uc=\n"), StringFog.decrypt("NzYWGFx7vClgJwYFB3OwYXE2BA==\n", "GEVvayge0QY=\n")};

    /* JADX WARN: Code restructure failed: missing block: B:189:0x00c9, code lost:
    
        if (r2 == null) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0181 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #4 {all -> 0x01c6, blocks: (B:74:0x0179, B:142:0x0181, B:149:0x01bd, B:153:0x01c2, B:154:0x01c5, B:144:0x019f, B:146:0x01a8), top: B:73:0x0179, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0169 A[EDGE_INSN: B:160:0x0169->B:69:0x0169 BREAK  A[LOOP:4: B:61:0x014d->B:157:0x0166], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0149 A[EDGE_INSN: B:162:0x0149->B:60:0x0149 BREAK  A[LOOP:3: B:53:0x0135->B:161:0x0146], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0119 A[EDGE_INSN: B:169:0x0119->B:48:0x0119 BREAK  A[LOOP:2: B:41:0x00fd->B:166:0x0116], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1300 m5942(Context context) {
        BufferedReader bufferedReader;
        int length;
        int i;
        int length2;
        int i2;
        int length3;
        int i3;
        boolean z;
        int length4;
        int i4;
        boolean z2;
        Iterator it;
        BufferedReader bufferedReader2;
        String lowerCase;
        ArrayList arrayList = new ArrayList();
        try {
            Process exec = Runtime.getRuntime().exec(StringFog.decrypt("vm8=\n", "zhzp++91whE=\n"));
            bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            do {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        exec.waitFor();
                        break;
                    }
                    lowerCase = readLine.toLowerCase();
                    if (lowerCase.contains(StringFog.decrypt("EBLSi/dqX8QEFt6d\n", "dmC775ZHLKE=\n"))) {
                        break;
                    }
                } finally {
                }
            } while (!lowerCase.contains(StringFog.decrypt("Xf577CQ=\n", "O4wSiEUnpZE=\n")));
            bufferedReader2.close();
            arrayList.add(10);
        } catch (Throwable unused) {
        }
        Socket socket = null;
        try {
            bufferedReader2 = new BufferedReader(new FileReader(StringFog.decrypt("zj+RumjVCc2NKcy4aooJ\n", "4U/j1Qv6eqg=\n")));
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        while (true) {
            try {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 != null) {
                    String lowerCase2 = readLine2.toLowerCase();
                    if (lowerCase2.contains(StringFog.decrypt("nMY6TUQ=\n", "+rRTKSUTWAk=\n")) || lowerCase2.contains(StringFog.decrypt("RUtdgrCAr4NGV0A=\n", "Izk05tGtzuQ=\n")) || lowerCase2.contains(StringFog.decrypt("ehLwY7YOjdV4B/xz\n", "HGCZB9cj6rQ=\n")) || lowerCase2.contains(StringFog.decrypt("sUkPWM4ZRLA=\n", "3SBtPrxwINE=\n"))) {
                        arrayList.add(11);
                        break;
                    }
                }
            } catch (Throwable unused3) {
            }
            try {
                bufferedReader.close();
                break;
            } catch (Throwable unused4) {
            }
        }
        try {
            Socket socket2 = new Socket();
            try {
                socket2.connect(new InetSocketAddress(StringFog.decrypt("WPJ2bXmFhK5Y\n", "acBBQ0mrtIA=\n"), 27042), 100);
                try {
                    socket2.close();
                } catch (Throwable unused5) {
                }
                arrayList.add(12);
            } catch (Throwable unused6) {
                socket = socket2;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable unused7) {
                    }
                }
                String[] strArr = f3686;
                length = strArr.length;
                i = 0;
                while (true) {
                    if (i < length) {
                    }
                    i++;
                }
                Class.forName(StringFog.decrypt("A82rl8SUUhwGxuGXxJ9AHB/Y6pbOkgpqF8f2gM+0VlsDz+A=\n", "Z6iF5av2JDI=\n"));
                arrayList.add(15);
                PackageManager packageManager = context.getPackageManager();
                String[] strArr2 = f3685;
                length2 = strArr2.length;
                i2 = 0;
                while (true) {
                    if (i2 < length2) {
                    }
                }
                String[] strArr3 = f3684;
                length3 = strArr3.length;
                i3 = 0;
                while (true) {
                    if (i3 < length3) {
                    }
                    i3++;
                }
                if (Debug.isDebuggerConnected()) {
                }
                if (Debug.isDebuggerConnected()) {
                }
                if (z) {
                }
                String[] strArr4 = f3683;
                length4 = strArr4.length;
                i4 = 0;
                while (true) {
                    if (i4 < length4) {
                    }
                    i4++;
                }
                if (z2) {
                }
                it = arrayList.iterator();
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                while (it.hasNext()) {
                }
                return new C1300(z3, z4, z5, z6, arrayList);
            }
        } catch (Throwable unused8) {
        }
        String[] strArr5 = f3686;
        length = strArr5.length;
        i = 0;
        while (true) {
            if (i < length) {
                break;
            }
            if (new File(strArr5[i]).exists()) {
                arrayList.add(13);
                break;
            }
            i++;
        }
        try {
            Class.forName(StringFog.decrypt("A82rl8SUUhwGxuGXxJ9AHB/Y6pbOkgpqF8f2gM+0VlsDz+A=\n", "Z6iF5av2JDI=\n"));
            arrayList.add(15);
        } catch (ClassNotFoundException unused9) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        String[] strArr22 = f3685;
        length2 = strArr22.length;
        i2 = 0;
        while (true) {
            if (i2 < length2) {
                break;
            }
            try {
                packageManager2.getPackageInfo(strArr22[i2], 0);
                arrayList.add(16);
                break;
            } catch (Throwable unused10) {
                i2++;
            }
        }
        String[] strArr32 = f3684;
        length3 = strArr32.length;
        i3 = 0;
        while (true) {
            if (i3 < length3) {
                break;
            }
            if (new File(strArr32[i3]).exists()) {
                arrayList.add(17);
                break;
            }
            i3++;
        }
        if (Debug.isDebuggerConnected()) {
            arrayList.add(18);
        }
        try {
            if (Debug.isDebuggerConnected()) {
                Process exec2 = Runtime.getRuntime().exec(StringFog.decrypt("fPLzqGo+MNFp+Km8fTM1lnz25bR9\n", "G5eH2BhRQPE=\n"));
                bufferedReader2 = new BufferedReader(new InputStreamReader(exec2.getInputStream()));
                try {
                    String readLine3 = bufferedReader2.readLine();
                    exec2.waitFor();
                    if (readLine3 != null) {
                        if (readLine3.trim().equals(StringFog.decrypt("bA==\n", "XQaJ/yLGXe0=\n"))) {
                            z = true;
                            bufferedReader2.close();
                        }
                    }
                    z = false;
                    bufferedReader2.close();
                } finally {
                }
            } else {
                z = true;
            }
        } catch (Throwable unused11) {
            z = false;
        }
        if (z) {
            arrayList.add(19);
        }
        String[] strArr42 = f3683;
        length4 = strArr42.length;
        i4 = 0;
        while (true) {
            if (i4 < length4) {
                z2 = false;
                break;
            }
            if (new File(strArr42[i4]).exists()) {
                z2 = true;
                break;
            }
            i4++;
        }
        if (z2) {
            arrayList.add(20);
        }
        it = arrayList.iterator();
        boolean z32 = false;
        boolean z42 = false;
        boolean z52 = false;
        boolean z62 = false;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 10 && intValue <= 14) {
                z32 = true;
            } else {
                if (intValue >= 15 && intValue <= 17) {
                    z42 = true;
                } else {
                    if (intValue == 18 || intValue == 19) {
                        z52 = true;
                    } else {
                        if (intValue == 20) {
                            z62 = true;
                        }
                    }
                }
            }
        }
        return new C1300(z32, z42, z52, z62, arrayList);
    }
}
