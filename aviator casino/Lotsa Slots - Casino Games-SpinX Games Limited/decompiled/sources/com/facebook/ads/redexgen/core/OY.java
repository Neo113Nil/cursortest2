package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OY {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-118, -113, -107, -96, -109, -105, -96, -109, -122, -104, -126, -109, -123, -96, -123, -126, -107, -126, -96, -110, -106, -126, -113, -107, -118, -107, -102, -96, -116, -122, -102, -92, -91, -93, -80, -93, -89, -80, -93, -106, -88, -110, -93, -107, -80, -107, -110, -91, -110, -80, -108, -90, -93, -93, -106, -97, -108, -86, -80, -100, -106, -86, -106, -105, -107, -94, -107, -103, -94, -107, -120, -102, -124, -107, -121, -94, -121, -124, -105, -124, -94, -116, -121, -94, -114, -120, -100};
    }

    public static android.os.Bundle A00(android.os.Bundle bundle, com.facebook.ads.RewardData rewardData) {
        bundle.putString(A02(62, 25, 57), rewardData.getUserID());
        bundle.putString(A02(31, 31, 71), rewardData.getCurrency());
        bundle.putInt(A02(0, 31, 55), rewardData.getQuantity());
        return bundle;
    }

    public static com.facebook.ads.RewardData A01(android.os.Bundle bundle) {
        java.lang.String A02 = A02(62, 25, 57);
        if (!bundle.containsKey(A02)) {
            return null;
        }
        java.lang.String string = bundle.getString(A02);
        java.lang.String id = A02(31, 31, 71);
        java.lang.String string2 = bundle.getString(id);
        int i = bundle.getInt(A02(0, 31, 55), 0);
        java.lang.String currency = A02(0, 0, 18);
        if (string == null) {
            string = currency;
        }
        if (string2 != null) {
            currency = string2;
        }
        return new com.facebook.ads.RewardData(string, currency, i);
    }
}
