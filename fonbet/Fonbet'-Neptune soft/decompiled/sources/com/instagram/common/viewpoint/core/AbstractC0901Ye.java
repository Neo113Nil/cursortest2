package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0901Ye {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (AbstractC0856Wl.A02 * 200.0f);
    public static final int A03 = (int) (AbstractC0856Wl.A02 * 200.0f);
    public static final int A02 = (int) (AbstractC0856Wl.A02 * 50.0f);

    public static EnumC0596Md A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return EnumC0596Md.A04;
        }
        if (A03(nativeAdLayout)) {
            return EnumC0596Md.A05;
        }
        return EnumC0596Md.A03;
    }

    public static AbstractC0900Yd A01(C1153dL c1153dL, US us, String str, View view) {
        if (view == null) {
            return null;
        }
        int w = view.getWidth();
        int height = view.getHeight();
        if (w >= A01 && height >= A01) {
            return new LS(c1153dL, us, str);
        }
        if (w >= A03) {
            int i = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i) {
                return new LU(c1153dL, us, str);
            }
        }
        return null;
    }

    public static LV A02(C1153dL c1153dL, US us, String str, N9 n9, InterfaceC0885Xo interfaceC0885Xo, InterfaceC0884Xn interfaceC0884Xn) {
        return new LV(c1153dL, us, str, n9, interfaceC0885Xo, interfaceC0884Xn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4 < r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w = A01;
        if (width >= w) {
            int w2 = A01;
        }
        int i = A03;
        String[] strArr = A00;
        String str = strArr[1];
        String str2 = strArr[0];
        int h = str.length();
        int w3 = str2.length();
        if (h != w3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[1] = "e";
        strArr2[0] = "I";
        if (width >= i) {
            int w4 = A02;
            if (height >= w4) {
                return false;
            }
        }
        return true;
    }
}
