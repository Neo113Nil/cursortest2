package org.bouncycastle.math.ec.tools;

/* loaded from: classes17.dex */
public class F2mSqrtOptimizer {
    public static void printRootZ(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        if (!org.bouncycastle.math.ec.ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            throw new java.lang.IllegalArgumentException("Sqrt optimization only defined over characteristic-2 fields");
        }
        getHighSpeedVideoSizes(x9ECParameters);
    }

    public static void main(java.lang.String[] strArr) {
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet(Camera2StreamConfigurationMap(org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames()));
        treeSet.addAll(Camera2StreamConfigurationMap(org.bouncycastle.crypto.ec.CustomNamedCurves.getNames()));
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
                getHighSpeedVideoSizes(byName);
            }
        }
    }

    private static void getHighSpeedVideoSizes(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        org.bouncycastle.math.ec.ECFieldElement fromBigInteger = x9ECParameters.getCurve().fromBigInteger(java.math.BigInteger.valueOf(2L));
        org.bouncycastle.math.ec.ECFieldElement sqrt = fromBigInteger.sqrt();
        java.lang.System.out.println(sqrt.toBigInteger().toString(16).toUpperCase());
        if (!sqrt.square().equals(fromBigInteger)) {
            throw new java.lang.IllegalStateException("Optimized-sqrt sanity check failed");
        }
    }

    private static java.util.ArrayList Camera2StreamConfigurationMap(java.util.Enumeration enumeration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }
}
