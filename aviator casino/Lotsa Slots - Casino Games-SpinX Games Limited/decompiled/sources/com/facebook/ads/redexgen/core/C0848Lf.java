package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0848Lf {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"pXXvlweo53LEBZFO8IULCIdZyckTRG5r", "DuGHfKZCm01", "80fcVnrJERY0uuv61EoOWTfKBWpdgNO", "9CXibrLJZkMktsdeymca", "5EX4ZE8RGyFWDwwd0Tfx6XQfl6R1kt5", "MQihPub9yWY", "FZA8FrqtMtEe7NzfiE56", "M8QLs2sFGOm02m2V5lAOlFR2Pc3pvKwT"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{92, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, 92, com.google.common.base.Ascii.DC2, 19, 8, 92, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 8, 19, com.google.common.base.Ascii.SO, 5, 93, 52, com.google.common.base.Ascii.EM, 2, com.google.common.base.Ascii.NAK, 19, 4, com.google.common.base.Ascii.US, 2, 9, 80, 85, 3, 80, 19, 17, com.google.common.base.Ascii.RS, 87, 4, 80, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, 80, 19, 2, com.google.common.base.Ascii.NAK, 17, 4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 62, 9, 9, com.google.common.base.Ascii.DC4, 9, 91, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 91, 1, com.google.common.base.Ascii.RS, 9, com.google.common.base.Ascii.DC4, 86, 8, com.google.common.base.Ascii.DC2, 1, com.google.common.base.Ascii.RS, 91, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.RS, 91, 122, 77, 77, 80, 77, com.google.common.base.Ascii.US, 76, 90, 75, com.google.common.base.Ascii.US, 83, 94, 76, 75, com.google.common.base.Ascii.US, 82, 80, 91, 86, 89, 86, 90, 91, com.google.common.base.Ascii.US, 91, 94, 75, 90, com.google.common.base.Ascii.US, 75, 80, com.google.common.base.Ascii.US, 83, 124, 121, 112, 53, 99, 102, 117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized void A06(java.io.File file) throws java.io.IOException {
        synchronized (com.facebook.ads.redexgen.core.C0848Lf.class) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new java.io.IOException(A00(109, 5, 102) + file + A00(0, 18, 15));
                }
            } else if (!file.mkdirs()) {
                throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, A00(18, 29, 3), file.getAbsolutePath()));
            }
        }
    }

    static {
        A02();
    }

    public static java.util.List<java.io.File> A01(java.io.File file) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            java.util.List<java.io.File> asList = java.util.Arrays.asList(listFiles);
            java.util.Collections.sort(asList, new com.facebook.ads.redexgen.core.C0847Le());
            return asList;
        }
        return linkedList;
    }

    public static void A03(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                A04(file);
                if (file.lastModified() >= currentTimeMillis) {
                } else {
                    throw new java.io.IOException(A00(77, 32, 76) + file);
                }
            }
        }
    }

    public static void A04(java.io.File file) throws java.io.IOException {
        long length = file.length();
        if (length == 0) {
            A05(file);
            java.lang.String[] strArr = A01;
            if (strArr[7].charAt(10) == strArr[0].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "fwMIAeZxeVy";
            strArr2[1] = "XGkZ1N2vKGp";
            return;
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, A00(114, 3, 98));
        long size = length - 1;
        randomAccessFile.seek(size);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(length - 1);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    public static void A05(java.io.File file) throws java.io.IOException {
        if (file.delete() && file.createNewFile()) {
        } else {
            throw new java.io.IOException(A00(47, 30, 8) + file);
        }
    }
}
