package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class RW {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{17, 32, 47, 51, 65, 5, 4, com.google.common.base.Ascii.NAK, 4, 2, com.google.common.base.Ascii.NAK, 4, 5, 91, 117, 121, 123, 56, 112, 119, 117, 115, 116, 121, 121, 125, 56, 119, 114, 101};
    }

    private java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> A01() {
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> stackTraces = new java.util.TreeMap<>(new com.facebook.ads.redexgen.core.RV(this, android.os.Looper.getMainLooper().getThread()));
        stackTraces.putAll(java.lang.Thread.getAllStackTraces());
        return stackTraces;
    }

    public final java.lang.String A03() {
        java.lang.Thread mainThread = android.os.Looper.getMainLooper().getThread();
        for (java.lang.StackTraceElement element : mainThread.getStackTrace()) {
            if (element.getClassName().startsWith(A00(14, 16, 17))) {
                return element.toString();
            }
        }
        return null;
    }

    public final java.lang.String A04(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A00(1, 13, 102));
        sb.append(str);
        java.lang.String A002 = A00(0, 1, 28);
        sb.append(A002);
        for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : A01().entrySet()) {
            sb.append(entry.getKey().getName());
            sb.append(A002);
            for (java.lang.StackTraceElement stackTraceElement : entry.getValue()) {
                sb.append('\t');
                sb.append(stackTraceElement.toString());
                sb.append(A002);
            }
        }
        return sb.toString();
    }
}
