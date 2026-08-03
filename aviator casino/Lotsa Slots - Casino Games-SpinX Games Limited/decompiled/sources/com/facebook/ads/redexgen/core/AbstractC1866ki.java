package com.facebook.ads.redexgen.core;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ki, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1866ki {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"rIY6scqdx44s0lYhNsVasOWOliCxkCUS", "XG17z2bEBjC2W", "Vem1quc5hPIJuUrE", "UcFFOKOZJEGoXQOYNnqMCDDpRLrphEx7", "nkZ3L4NSKd4uHuOS6chXEBDQJqUE8doa", "6xQ37guYp3oV6tn7J9L0pQx9gviAFZKh", "Tb0XI9b9KZ2bW8CyI06iyuXMMlzfJONe", "u0lWMQq9JRx7ZEcoLF7IwO0fOB8k5dGw"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A04(@javax.annotation.CheckForNull T reference) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A05(@javax.annotation.CheckForNull T reference, @javax.annotation.CheckForNull java.lang.Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(errorMessage));
    }

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            java.lang.String[] strArr = A01;
            if (strArr[0].charAt(16) != strArr[3].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "4hJwB50Ffda8q";
            strArr2[2] = "BvOy7f3XfmcoPFEY";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{35, 117, 38, 46, 35, 117, 47, 38, 107, 115, 117, 114, 38, 100, 99, 38, 106, 99, 117, 117, 38, 114, 110, 103, 104, 38, 117, 111, 124, 99, 38, 46, 35, 117, 47, 38, 112, 35, 43, 38, 112, 42, 35, 110, 118, 112, 119, 35, 109, 108, 119, 35, 97, 102, 35, 100, 113, 102, 98, 119, 102, 113, 35, 119, 107, 98, 109, 35, 112, 106, 121, 102, 35, 43, 38, 112, 42, 59, 109, 62, 54, 59, 109, 55, 62, 115, 107, 109, 106, 62, 112, 113, 106, 62, 124, 123, 62, 112, 123, 121, Byte.MAX_VALUE, 106, 119, 104, 123, 50, 57, 51, 119, 62, 57, 51, 50, 47, 114, 121, 115, 55, 126, 121, 115, 114, 111, 55, 63, 50, 100, 62, 55, 122, 98, 100, 99, 55, 121, 120, 99, 55, 117, 114, 55, 123, 114, 100, 100, 55, 99, Byte.MAX_VALUE, 118, 121, 55, 100, 99, 118, 101, 99, 55, 126, 121, 115, 114, 111, 55, 63, 50, 100, 62, 122, 125, 119, 118, 107, 57, 50, 48, 54, 35, 62, 33, 50, 119, 36, 62, 45, 50, 109, 119, Byte.MAX_VALUE, 120, 109, 126, 120, 44, 101, 98, 104, 105, 116};
    }

    static {
        A0A();
    }

    public static int A00(int index, int size) {
        return A02(index, size, A06(167, 5, 127));
    }

    public static int A01(int index, int size) {
        return A03(index, size, A06(167, 5, 127));
    }

    public static int A02(int index, int size, java.lang.String desc) {
        if (index >= 0 && index < size) {
            return index;
        }
        throw new java.lang.IndexOutOfBoundsException(A08(index, size, desc));
    }

    public static int A03(int index, int size, java.lang.String desc) {
        if (index >= 0 && index <= size) {
            return index;
        }
        throw new java.lang.IndexOutOfBoundsException(A09(index, size, desc));
    }

    public static java.lang.String A07(int start, int end, int size) {
        if (start < 0 || start > size) {
            return A09(start, size, A06(187, 11, 96));
        }
        return (end < 0 || end > size) ? A09(end, size, A06(105, 9, 59)) : com.google.common.base.Strings.A02(A06(114, 53, 123), new java.lang.Object[]{java.lang.Integer.valueOf(end), java.lang.Integer.valueOf(start)});
    }

    public static java.lang.String A08(int index, int size, java.lang.String desc) {
        if (index < 0) {
            return com.google.common.base.Strings.A02(A06(77, 28, 114), new java.lang.Object[]{desc, java.lang.Integer.valueOf(index)});
        }
        if (size >= 0) {
            return com.google.common.base.Strings.A02(A06(0, 35, 106), new java.lang.Object[]{desc, java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size)});
        }
        throw new java.lang.IllegalArgumentException(A06(172, 15, 59) + size);
    }

    public static java.lang.String A09(int index, int size, java.lang.String desc) {
        if (index < 0) {
            return com.google.common.base.Strings.A02(A06(77, 28, 114), new java.lang.Object[]{desc, java.lang.Integer.valueOf(index)});
        }
        if (size >= 0) {
            return com.google.common.base.Strings.A02(A06(35, 42, 111), new java.lang.Object[]{desc, java.lang.Integer.valueOf(index), java.lang.Integer.valueOf(size)});
        }
        throw new java.lang.IllegalArgumentException(A06(172, 15, 59) + size);
    }

    public static void A0B(int start, int end, int size) {
        if (start >= 0 && end >= start && end <= size) {
        } else {
            throw new java.lang.IndexOutOfBoundsException(A07(start, end, size));
        }
    }

    public static void A0C(boolean expression) {
        if (expression) {
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void A0D(boolean expression) {
        if (expression) {
        } else {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void A0E(@javax.annotation.CheckForNull boolean expression, java.lang.Object errorMessage) {
        if (expression) {
        } else {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(errorMessage));
        }
    }

    public static void A0F(@javax.annotation.CheckForNull boolean expression, java.lang.Object errorMessage) {
        if (expression) {
        } else {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(errorMessage));
        }
    }

    public static void A0G(boolean expression, java.lang.String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.A02(errorMessageTemplate, new java.lang.Object[]{java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2)}));
        }
    }

    public static void A0H(boolean expression, java.lang.String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.A02(errorMessageTemplate, new java.lang.Object[]{java.lang.Long.valueOf(p1)}));
        }
    }
}
