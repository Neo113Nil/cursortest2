package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1135Wp {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"vserbkQ71L70HeExkEksLvSV50Js9e5T", "kCtue8tdTX7Ntsd63evdhPLiI5GlGyVZ", "TwC9DE0UkCmO5xuA9ppRryz5QvyD", "4CWs1R6rr7PkkffzytFACCqk28rMKWqF", "DS0L0fcRoHYALrKB9SSkXSb7384LvFtu", "e8tzsRThNax4EAToJhNq21dAKBpwgTLo", "Q0BiPrkB2PSWzVDnLZTkEnIKaCsuaheD", "rbmY91JFcJMC4pCqNbunWn9nQrXHl54t"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[6].charAt(20) == strArr[1].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "hlZJhcxljYiKc7UKHZyQNCRGeosS0rVV";
            strArr2[7] = "L6Z1FseRPLChQnX48wkOINplJZHgpjkr";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
            i4++;
        }
    }

    public static void A03() {
        A00 = new byte[]{-37, -35, -18, -29, -16, -29, -18, -13, -1, com.google.common.base.Ascii.FF, 2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, 7, 2, -52, 7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, 3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, -52, 1, -1, com.google.common.base.Ascii.DC2, 3, 5, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, -52, -22, -33, -13, -20, -31, -26, -29, -16};
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.EnumC1134Wo A00(android.content.Context context) {
        try {
            return A01(context);
        } catch (java.lang.Exception unused) {
            return com.facebook.ads.redexgen.core.EnumC1134Wo.A05;
        }
    }

    public static com.facebook.ads.redexgen.core.EnumC1134Wo A01(android.content.Context context) {
        if (context == null) {
            return com.facebook.ads.redexgen.core.EnumC1134Wo.A0D;
        }
        android.app.ActivityManager mgr = (android.app.ActivityManager) context.getSystemService(A02(0, 8, 73));
        if (mgr == null) {
            com.facebook.ads.redexgen.core.EnumC1134Wo enumC1134Wo = com.facebook.ads.redexgen.core.EnumC1134Wo.A08;
            if (A01[0].charAt(27) == 'o') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "W800VLcbCNBOE1f9F";
            return enumC1134Wo;
        }
        java.util.List<android.app.ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return com.facebook.ads.redexgen.core.EnumC1134Wo.A0B;
        }
        java.util.Iterator<android.app.ActivityManager.AppTask> it = tasks.iterator();
        while (it.hasNext()) {
            android.app.ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getCategories() != null && taskInfo.baseIntent.getCategories().contains(A02(8, 32, 109))) {
                return com.facebook.ads.redexgen.core.EnumC1134Wo.A06;
            }
        }
        com.facebook.ads.redexgen.core.EnumC1134Wo enumC1134Wo2 = com.facebook.ads.redexgen.core.EnumC1134Wo.A09;
        java.lang.String[] strArr = A01;
        if (strArr[3].charAt(22) == strArr[5].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[4] = "GyHEsdoLJV3XEjiFxTFX6orc2Mvnrd3k";
        strArr2[7] = "nU2m6dMK7qfy4atV1JxTmvIeg7zDsgbu";
        return enumC1134Wo2;
    }
}
