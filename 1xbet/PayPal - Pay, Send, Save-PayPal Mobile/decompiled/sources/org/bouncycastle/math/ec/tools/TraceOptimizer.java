package org.bouncycastle.math.ec.tools;

/* loaded from: classes17.dex */
public class TraceOptimizer {
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private static final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI = new java.security.SecureRandom();

    public static void printNonZeroTraceBits(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        if (!org.bouncycastle.math.ec.ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            throw new java.lang.IllegalArgumentException("Trace only defined over characteristic-2 fields");
        }
        implPrintNonZeroTraceBits(x9ECParameters);
    }

    public static void main(java.lang.String[] strArr) {
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet(getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames()));
        treeSet.addAll(getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.ec.CustomNamedCurves.getNames()));
        for (java.lang.String str : treeSet) {
            org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(str);
            if (byName == null) {
                byName = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str);
            }
            if (byName != null && org.bouncycastle.math.ec.ECAlgorithms.isF2mCurve(byName.getCurve())) {
                java.io.PrintStream printStream = java.lang.System.out;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                printStream.print(sb.toString());
                implPrintNonZeroTraceBits(byName);
            }
        }
    }

    public static void implPrintNonZeroTraceBits(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        java.io.PrintStream printStream;
        java.lang.StringBuilder sb;
        org.bouncycastle.math.ec.ECCurve curve = x9ECParameters.getCurve();
        int fieldSize = curve.getFieldSize();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < fieldSize; i++) {
            if ((i & 1) != 0 || i == 0) {
                if (getHighSpeedVideoFpsRangesFor(curve.fromBigInteger(getHighSpeedVideoFpsRanges.shiftLeft(i))) != 0) {
                    arrayList.add(org.bouncycastle.util.Integers.valueOf(i));
                    printStream = java.lang.System.out;
                    sb = new java.lang.StringBuilder(" ");
                    sb.append(i);
                    printStream.print(sb.toString());
                }
            } else if (arrayList.contains(org.bouncycastle.util.Integers.valueOf(i >>> 1))) {
                arrayList.add(org.bouncycastle.util.Integers.valueOf(i));
                printStream = java.lang.System.out;
                sb = new java.lang.StringBuilder(" ");
                sb.append(i);
                printStream.print(sb.toString());
            }
        }
        java.lang.System.out.println();
        for (int i2 = 0; i2 < 1000; i2++) {
            java.math.BigInteger bigInteger = new java.math.BigInteger(fieldSize, getHighResolutionOutputSizeshNQ4ISI);
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(curve.fromBigInteger(bigInteger));
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (bigInteger.testBit(((java.lang.Integer) arrayList.get(i4)).intValue())) {
                    i3 ^= 1;
                }
            }
            if (highSpeedVideoFpsRangesFor != i3) {
                throw new java.lang.IllegalStateException("Optimized-trace sanity check failed");
            }
        }
    }

    private static java.util.ArrayList getHighResolutionOutputSizeshNQ4ISI(java.util.Enumeration enumeration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    private static int getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        int numberOfLeadingZeros = 31 - org.bouncycastle.util.Integers.numberOfLeadingZeros(fieldSize);
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = eCFieldElement;
        int i = 1;
        while (numberOfLeadingZeros > 0) {
            eCFieldElement2 = eCFieldElement2.squarePow(i).add(eCFieldElement2);
            numberOfLeadingZeros--;
            i = fieldSize >>> numberOfLeadingZeros;
            if ((i & 1) != 0) {
                eCFieldElement2 = eCFieldElement2.square().add(eCFieldElement);
            }
        }
        if (eCFieldElement2.isZero()) {
            return 0;
        }
        if (eCFieldElement2.isOne()) {
            return 1;
        }
        throw new java.lang.IllegalStateException("Internal error in trace calculation");
    }
}
