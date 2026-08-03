package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.43, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass43 {
    public static java.lang.reflect.Method A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"rt6CjKtQUOFxarnmkWqgGWje", "3nuh3b0J3kR9pkmWbi6mdwRc069ydG03", "vgqSEb59pwcvKw9WdixQFoz3Va18KFsr", "h35Isj3aZViVWltuKEoucz22tQqncTnx", "yJGJRoZVng69n9xQNPvqaXzNAukE8cwJ", "ZigbL863Rtw4tWoi2mLflUon", "c977rkHkuANnZfYHmbWrwArrI1mgRqhG", "I5ankwGA25juUPMFKSRh1H9yjdqc0trO"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{107, 92, 71, 77, 69, 76, 124, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 44, com.google.common.base.Ascii.VT, 3, 6, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 74, com.google.common.base.Ascii.RS, 5, 74, 3, 4, com.google.common.base.Ascii.FS, 5, 1, com.google.common.base.Ascii.SI, 74, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 35, 40, 3, 4, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, 74, com.google.common.base.Ascii.FS, 3, com.google.common.base.Ascii.VT, 74, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 6, com.google.common.base.Ascii.SI, 9, com.google.common.base.Ascii.RS, 3, 5, 4, 99, 68, 76, 73, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 5, 81, 74, 5, 87, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 87, 76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 83, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 5, 66, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 108, 103, 76, 75, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 5, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 77, 74, 65, 120, 122, 107, 86, 93, 118, 113, 123, 122, 109};
    }

    static {
        A03();
    }

    public static android.os.IBinder A00(android.os.Bundle bundle, java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 18) {
            return bundle.getBinder(str);
        }
        android.os.IBinder A012 = A01(bundle, str);
        if (A02[7].charAt(19) == 'S') {
            throw new java.lang.RuntimeException();
        }
        A02[7] = "R1pRDUJQUvAtWdszhYbqbgNcOgXvgcSI";
        return A012;
    }

    public static android.os.IBinder A01(android.os.Bundle bundle, java.lang.String str) {
        java.lang.reflect.Method method = A00;
        java.lang.String A022 = A02(0, 10, 89);
        if (method == null) {
            try {
                java.lang.reflect.Method getIBinder = android.os.Bundle.class.getMethod(A02(88, 10, 111), java.lang.String.class);
                A00 = getIBinder;
                java.lang.reflect.Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (java.lang.NoSuchMethodException e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A09(A022, A02(52, 36, 85), e);
                return null;
            }
        }
        try {
            return (android.os.IBinder) method.invoke(bundle, str);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A09(A022, A02(10, 42, 26), e2);
            return null;
        }
    }
}
