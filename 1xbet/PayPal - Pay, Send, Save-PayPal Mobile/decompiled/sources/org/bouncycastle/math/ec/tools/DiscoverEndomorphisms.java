package org.bouncycastle.math.ec.tools;

/* loaded from: classes17.dex */
public class DiscoverEndomorphisms {
    private static java.math.BigInteger[] getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        java.math.BigInteger divide = bigInteger.subtract(bigInteger2).divide(bigInteger3);
        java.math.BigInteger divide2 = bigInteger.add(bigInteger2).divide(bigInteger3);
        return divide.compareTo(divide2) <= 0 ? new java.math.BigInteger[]{divide, divide2} : new java.math.BigInteger[]{divide2, divide};
    }

    private static java.math.BigInteger[] getHighSpeedVideoFpsRangesFor(java.math.BigInteger[] bigIntegerArr) {
        boolean z = bigIntegerArr[0].compareTo(bigIntegerArr[1]) < 0;
        if (z) {
            java.math.BigInteger bigInteger = bigIntegerArr[0];
            bigIntegerArr[0] = bigIntegerArr[1];
            bigIntegerArr[1] = bigInteger;
        }
        java.math.BigInteger bigInteger2 = bigIntegerArr[0];
        java.math.BigInteger bigInteger3 = bigIntegerArr[1];
        java.math.BigInteger bigInteger4 = org.bouncycastle.math.ec.ECConstants.ONE;
        java.math.BigInteger bigInteger5 = org.bouncycastle.math.ec.ECConstants.ZERO;
        java.math.BigInteger bigInteger6 = org.bouncycastle.math.ec.ECConstants.ZERO;
        java.math.BigInteger bigInteger7 = org.bouncycastle.math.ec.ECConstants.ONE;
        java.math.BigInteger bigInteger8 = bigInteger3;
        java.math.BigInteger bigInteger9 = bigInteger2;
        while (bigInteger8.compareTo(org.bouncycastle.math.ec.ECConstants.ONE) > 0) {
            java.math.BigInteger[] divideAndRemainder = bigInteger9.divideAndRemainder(bigInteger8);
            java.math.BigInteger bigInteger10 = divideAndRemainder[0];
            java.math.BigInteger bigInteger11 = bigInteger8;
            bigInteger8 = divideAndRemainder[1];
            bigInteger9 = bigInteger11;
            java.math.BigInteger bigInteger12 = bigInteger5;
            bigInteger5 = bigInteger4.subtract(bigInteger10.multiply(bigInteger5));
            bigInteger4 = bigInteger12;
            java.math.BigInteger bigInteger13 = bigInteger7;
            bigInteger7 = bigInteger6.subtract(bigInteger10.multiply(bigInteger7));
            bigInteger6 = bigInteger13;
        }
        if (bigInteger8.signum() <= 0) {
            return null;
        }
        java.math.BigInteger[] bigIntegerArr2 = {bigInteger5, bigInteger7};
        if (z) {
            java.math.BigInteger bigInteger14 = bigIntegerArr2[0];
            bigIntegerArr2[0] = bigIntegerArr2[1];
            bigIntegerArr2[1] = bigInteger14;
        }
        return bigIntegerArr2;
    }

    private static java.math.BigInteger getHighSpeedVideoSizes(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (!bigInteger2.testBit(0)) {
            throw new java.lang.IllegalStateException();
        }
        java.math.BigInteger shiftRight = bigInteger2.subtract(org.bouncycastle.math.ec.ECConstants.ONE).shiftRight(1);
        if (!bigInteger.modPow(shiftRight, bigInteger2).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
            return null;
        }
        java.math.BigInteger bigInteger3 = shiftRight;
        while (!bigInteger3.testBit(0)) {
            bigInteger3 = bigInteger3.shiftRight(1);
            if (!bigInteger.modPow(bigInteger3, bigInteger2).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                for (int i = 2; i < 1000; i++) {
                    java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
                    if (!valueOf.modPow(shiftRight, bigInteger2).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                        java.math.BigInteger bigInteger4 = shiftRight;
                        while (!bigInteger3.testBit(0)) {
                            bigInteger3 = bigInteger3.shiftRight(1);
                            bigInteger4 = bigInteger4.shiftRight(1);
                            if (!bigInteger.modPow(bigInteger3, bigInteger2).equals(valueOf.modPow(bigInteger4, bigInteger2))) {
                                bigInteger4 = bigInteger4.add(shiftRight);
                            }
                        }
                        return bigInteger.modInverse(bigInteger2).modPow(bigInteger3.subtract(org.bouncycastle.math.ec.ECConstants.ONE).shiftRight(1), bigInteger2).multiply(valueOf.modPow(bigInteger4.shiftRight(1), bigInteger2)).mod(bigInteger2);
                    }
                }
                throw new java.lang.IllegalStateException();
            }
        }
        return bigInteger.modPow(bigInteger3.add(org.bouncycastle.math.ec.ECConstants.ONE).shiftRight(1), bigInteger2);
    }

    private static void Camera2StreamConfigurationMap(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bigInteger, bigInteger2);
        java.math.BigInteger[] bigIntegerArr = {highSpeedVideoFpsRangesFor[2], highSpeedVideoFpsRangesFor[3].negate()};
        java.math.BigInteger[] bigIntegerArr2 = {highSpeedVideoFpsRangesFor[0], highSpeedVideoFpsRangesFor[1].negate()};
        java.math.BigInteger[] bigIntegerArr3 = {highSpeedVideoFpsRangesFor[4], highSpeedVideoFpsRangesFor[5].negate()};
        if (!getHighSpeedVideoFpsRanges(bigIntegerArr2, bigIntegerArr3)) {
            bigIntegerArr2 = bigIntegerArr3;
        }
        if (!getHighResolutionOutputSizeshNQ4ISI(bigIntegerArr2[0].abs().max(bigIntegerArr2[1].abs()), bigInteger) && bigIntegerArr[0].gcd(bigIntegerArr[1]).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
            java.math.BigInteger bigInteger3 = bigIntegerArr[0];
            java.math.BigInteger bigInteger4 = bigIntegerArr[1];
            java.math.BigInteger divide = bigInteger3.add(bigInteger4.multiply(bigInteger2)).divide(bigInteger);
            java.math.BigInteger[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(new java.math.BigInteger[]{divide.abs(), bigInteger4.abs()});
            if (highSpeedVideoFpsRangesFor2 != null) {
                java.math.BigInteger bigInteger5 = highSpeedVideoFpsRangesFor2[0];
                java.math.BigInteger bigInteger6 = highSpeedVideoFpsRangesFor2[1];
                if (divide.signum() < 0) {
                    bigInteger5 = bigInteger5.negate();
                }
                if (bigInteger4.signum() > 0) {
                    bigInteger6 = bigInteger6.negate();
                }
                if (!divide.multiply(bigInteger5).subtract(bigInteger4.multiply(bigInteger6)).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                    throw new java.lang.IllegalStateException();
                }
                java.math.BigInteger subtract = bigInteger6.multiply(bigInteger).subtract(bigInteger5.multiply(bigInteger2));
                java.math.BigInteger negate = bigInteger5.negate();
                java.math.BigInteger negate2 = subtract.negate();
                java.math.BigInteger add = getHighResolutionOutputSizeshNQ4ISI(bigInteger.subtract(org.bouncycastle.math.ec.ECConstants.ONE)).add(org.bouncycastle.math.ec.ECConstants.ONE);
                java.math.BigInteger[] highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(negate, add, bigInteger4), getHighSpeedVideoFpsRangesFor(negate2, add, bigInteger3));
                if (highSpeedVideoSizes != null) {
                    for (java.math.BigInteger bigInteger7 = highSpeedVideoSizes[0]; bigInteger7.compareTo(highSpeedVideoSizes[1]) <= 0; bigInteger7 = bigInteger7.add(org.bouncycastle.math.ec.ECConstants.ONE)) {
                        java.math.BigInteger[] bigIntegerArr4 = {subtract.add(bigInteger7.multiply(bigInteger3)), bigInteger5.add(bigInteger7.multiply(bigInteger4))};
                        if (getHighSpeedVideoFpsRanges(bigIntegerArr4, bigIntegerArr2)) {
                            bigIntegerArr2 = bigIntegerArr4;
                        }
                    }
                }
            }
        }
        java.math.BigInteger subtract2 = bigIntegerArr[0].multiply(bigIntegerArr2[1]).subtract(bigIntegerArr[1].multiply(bigIntegerArr2[0]));
        int bitLength = (bigInteger.bitLength() + 16) - (bigInteger.bitLength() & 7);
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bigIntegerArr2[1].shiftLeft(bitLength), subtract2);
        java.math.BigInteger negate3 = getHighSpeedVideoFpsRanges(bigIntegerArr[1].shiftLeft(bitLength), subtract2).negate();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{ ");
        sb.append(bigIntegerArr[0].toString(16));
        sb.append(", ");
        sb.append(bigIntegerArr[1].toString(16));
        sb.append(" }");
        getHighResolutionOutputSizeshNQ4ISI("v1", sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{ ");
        sb2.append(bigIntegerArr2[0].toString(16));
        sb2.append(", ");
        sb2.append(bigIntegerArr2[1].toString(16));
        sb2.append(" }");
        getHighResolutionOutputSizeshNQ4ISI("v2", sb2.toString());
        getHighResolutionOutputSizeshNQ4ISI("d", subtract2.toString(16));
        getHighResolutionOutputSizeshNQ4ISI("(OPT) g1", highSpeedVideoFpsRanges.toString(16));
        getHighResolutionOutputSizeshNQ4ISI("(OPT) g2", negate3.toString(16));
        getHighResolutionOutputSizeshNQ4ISI("(OPT) bits", java.lang.Integer.toString(bitLength));
    }

    private static java.math.BigInteger[] getHighSpeedVideoSizes(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        java.math.BigInteger highSpeedVideoSizes = getHighSpeedVideoSizes(bigInteger3.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4).shiftLeft(2)).mod(bigInteger), bigInteger);
        if (highSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("Solving quadratic equation failed unexpectedly");
        }
        java.math.BigInteger modInverse = bigInteger2.shiftLeft(1).modInverse(bigInteger);
        return new java.math.BigInteger[]{highSpeedVideoSizes.subtract(bigInteger3).multiply(modInverse).mod(bigInteger), highSpeedVideoSizes.negate().subtract(bigInteger3).multiply(modInverse).mod(bigInteger)};
    }

    private static java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        boolean z = bigInteger.signum() != bigInteger2.signum();
        java.math.BigInteger abs = bigInteger.abs();
        java.math.BigInteger abs2 = bigInteger2.abs();
        java.math.BigInteger divide = abs.add(abs2.shiftRight(1)).divide(abs2);
        return z ? divide.negate() : divide;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.Object obj) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("  ");
        stringBuffer.append(str);
        while (stringBuffer.length() < 20) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(": ");
        stringBuffer.append(obj.toString());
        java.lang.System.out.println(stringBuffer.toString());
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters, java.math.BigInteger bigInteger, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        org.bouncycastle.math.ec.ECPoint normalize = x9ECParameters.getG().normalize();
        org.bouncycastle.math.ec.ECPoint normalize2 = normalize.multiply(bigInteger).normalize();
        if (!normalize.getYCoord().equals(normalize2.getYCoord())) {
            throw new java.lang.IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
        }
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!normalize.getXCoord().multiply(eCFieldElement).equals(normalize2.getXCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!normalize.getXCoord().multiply(eCFieldElement).equals(normalize2.getXCoord())) {
                throw new java.lang.IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
            }
        }
        getHighResolutionOutputSizeshNQ4ISI("Point map", "lambda * (x, y) = (beta * x, y)");
        getHighResolutionOutputSizeshNQ4ISI("beta", eCFieldElement.toBigInteger().toString(16));
        getHighResolutionOutputSizeshNQ4ISI("lambda", bigInteger.toString(16));
        Camera2StreamConfigurationMap(x9ECParameters.getN(), bigInteger);
    }

    private static void getHighSpeedVideoSizes(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        java.math.BigInteger n = x9ECParameters.getN();
        java.math.BigInteger bigInteger = org.bouncycastle.math.ec.ECConstants.ONE;
        java.math.BigInteger[] highSpeedVideoSizes = getHighSpeedVideoSizes(n, bigInteger, bigInteger, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECFieldElement[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(x9ECParameters.getCurve());
        getHighResolutionOutputSizeshNQ4ISI(x9ECParameters, highSpeedVideoSizes[0], highSpeedVideoFpsRanges);
        java.lang.System.out.println("OR");
        getHighResolutionOutputSizeshNQ4ISI(x9ECParameters, highSpeedVideoSizes[1], highSpeedVideoFpsRanges);
    }

    private static void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters, java.math.BigInteger bigInteger, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        org.bouncycastle.math.ec.ECPoint normalize = x9ECParameters.getG().normalize();
        org.bouncycastle.math.ec.ECPoint normalize2 = normalize.multiply(bigInteger).normalize();
        if (!normalize.getXCoord().negate().equals(normalize2.getXCoord())) {
            throw new java.lang.IllegalStateException("Derivation of GLV Type A parameters failed unexpectedly");
        }
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!normalize.getYCoord().multiply(eCFieldElement).equals(normalize2.getYCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!normalize.getYCoord().multiply(eCFieldElement).equals(normalize2.getYCoord())) {
                throw new java.lang.IllegalStateException("Derivation of GLV Type A parameters failed unexpectedly");
            }
        }
        getHighResolutionOutputSizeshNQ4ISI("Point map", "lambda * (x, y) = (-x, i * y)");
        getHighResolutionOutputSizeshNQ4ISI("i", eCFieldElement.toBigInteger().toString(16));
        getHighResolutionOutputSizeshNQ4ISI("lambda", bigInteger.toString(16));
        Camera2StreamConfigurationMap(x9ECParameters.getN(), bigInteger);
    }

    private static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        java.math.BigInteger[] highSpeedVideoSizes = getHighSpeedVideoSizes(x9ECParameters.getN(), org.bouncycastle.math.ec.ECConstants.ONE, org.bouncycastle.math.ec.ECConstants.ZERO, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECFieldElement[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(x9ECParameters.getCurve());
        getHighSpeedVideoFpsRanges(x9ECParameters, highSpeedVideoSizes[0], highResolutionOutputSizeshNQ4ISI);
        java.lang.System.out.println("OR");
        getHighSpeedVideoFpsRanges(x9ECParameters, highSpeedVideoSizes[1], highResolutionOutputSizeshNQ4ISI);
    }

    public static void main(java.lang.String[] strArr) {
        if (strArr.length > 0) {
            for (java.lang.String str : strArr) {
                getHighResolutionOutputSizeshNQ4ISI(str);
            }
            return;
        }
        java.util.TreeSet treeSet = new java.util.TreeSet(Camera2StreamConfigurationMap(org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames()));
        treeSet.addAll(Camera2StreamConfigurationMap(org.bouncycastle.crypto.ec.CustomNamedCurves.getNames()));
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            getHighResolutionOutputSizeshNQ4ISI((java.lang.String) it.next());
        }
    }

    private static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger) {
        java.math.BigInteger shiftRight = bigInteger.shiftRight(bigInteger.bitLength() / 2);
        while (true) {
            java.math.BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.equals(shiftRight)) {
                return shiftRight2;
            }
            shiftRight = shiftRight2;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.math.BigInteger[] bigIntegerArr, java.math.BigInteger[] bigIntegerArr2) {
        java.math.BigInteger abs = bigIntegerArr[0].abs();
        java.math.BigInteger abs2 = bigIntegerArr[1].abs();
        java.math.BigInteger abs3 = bigIntegerArr2[0].abs();
        java.math.BigInteger abs4 = bigIntegerArr2[1].abs();
        boolean z = abs.compareTo(abs3) < 0;
        return z == (abs2.compareTo(abs4) < 0) ? z : abs.multiply(abs).add(abs2.multiply(abs2)).compareTo(abs3.multiply(abs3).add(abs4.multiply(abs4))) < 0;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger abs = bigInteger.abs();
        java.math.BigInteger abs2 = bigInteger2.abs();
        int bitLength = abs2.bitLength();
        int bitLength2 = abs.bitLength() * 2;
        if (bitLength2 - 1 <= bitLength) {
            return bitLength2 < bitLength || abs.multiply(abs).compareTo(abs2) < 0;
        }
        return false;
    }

    private static java.math.BigInteger[] getHighSpeedVideoSizes(java.math.BigInteger[] bigIntegerArr, java.math.BigInteger[] bigIntegerArr2) {
        java.math.BigInteger max = bigIntegerArr[0].max(bigIntegerArr2[0]);
        java.math.BigInteger min = bigIntegerArr[1].min(bigIntegerArr2[1]);
        if (max.compareTo(min) > 0) {
            return null;
        }
        return new java.math.BigInteger[]{max, min};
    }

    private static org.bouncycastle.math.ec.ECFieldElement[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.math.ec.ECCurve eCCurve) {
        org.bouncycastle.math.ec.ECFieldElement sqrt = eCCurve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ONE).negate().sqrt();
        if (sqrt != null) {
            return new org.bouncycastle.math.ec.ECFieldElement[]{sqrt, sqrt.negate()};
        }
        throw new java.lang.IllegalStateException("Calculation of non-trivial order-4  field elements failed unexpectedly");
    }

    private static org.bouncycastle.math.ec.ECFieldElement[] getHighSpeedVideoFpsRanges(org.bouncycastle.math.ec.ECCurve eCCurve) {
        java.math.BigInteger modPow;
        java.math.BigInteger characteristic = eCCurve.getField().getCharacteristic();
        java.math.BigInteger divide = characteristic.divide(org.bouncycastle.math.ec.ECConstants.THREE);
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        do {
            modPow = org.bouncycastle.util.BigIntegers.createRandomInRange(org.bouncycastle.math.ec.ECConstants.TWO, characteristic.subtract(org.bouncycastle.math.ec.ECConstants.TWO), secureRandom).modPow(divide, characteristic);
        } while (modPow.equals(org.bouncycastle.math.ec.ECConstants.ONE));
        org.bouncycastle.math.ec.ECFieldElement fromBigInteger = eCCurve.fromBigInteger(modPow);
        return new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger, fromBigInteger.square()};
    }

    private static java.math.BigInteger[] getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigInteger3 = bigInteger;
        java.math.BigInteger bigInteger4 = bigInteger2;
        java.math.BigInteger bigInteger5 = org.bouncycastle.math.ec.ECConstants.ZERO;
        java.math.BigInteger bigInteger6 = org.bouncycastle.math.ec.ECConstants.ONE;
        while (true) {
            java.math.BigInteger[] divideAndRemainder = bigInteger3.divideAndRemainder(bigInteger4);
            java.math.BigInteger bigInteger7 = divideAndRemainder[0];
            java.math.BigInteger bigInteger8 = divideAndRemainder[1];
            java.math.BigInteger subtract = bigInteger5.subtract(bigInteger7.multiply(bigInteger6));
            if (getHighResolutionOutputSizeshNQ4ISI(bigInteger4, bigInteger)) {
                return new java.math.BigInteger[]{bigInteger3, bigInteger5, bigInteger4, bigInteger6, bigInteger8, subtract};
            }
            bigInteger3 = bigInteger4;
            bigInteger5 = bigInteger6;
            bigInteger4 = bigInteger8;
            bigInteger6 = subtract;
        }
    }

    private static java.util.ArrayList Camera2StreamConfigurationMap(java.util.Enumeration enumeration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    private static void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters, java.lang.String str) {
        org.bouncycastle.math.ec.ECCurve curve = x9ECParameters.getCurve();
        if (org.bouncycastle.math.ec.ECAlgorithms.isFpCurve(curve)) {
            java.math.BigInteger characteristic = curve.getField().getCharacteristic();
            if (curve.getB().isZero() && characteristic.mod(org.bouncycastle.math.ec.ECConstants.FOUR).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                java.io.PrintStream printStream = java.lang.System.out;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Curve '");
                sb.append(str);
                sb.append("' has a 'GLV Type A' endomorphism with these parameters:");
                printStream.println(sb.toString());
                getHighSpeedVideoFpsRangesFor(x9ECParameters);
            }
            if (curve.getA().isZero() && characteristic.mod(org.bouncycastle.math.ec.ECConstants.THREE).equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
                java.io.PrintStream printStream2 = java.lang.System.out;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Curve '");
                sb2.append(str);
                sb2.append("' has a 'GLV Type B' endomorphism with these parameters:");
                printStream2.println(sb2.toString());
                getHighSpeedVideoSizes(x9ECParameters);
            }
        }
    }

    public static void discoverEndomorphisms(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        if (x9ECParameters == null) {
            throw new java.lang.NullPointerException("x9");
        }
        getHighSpeedVideoFpsRanges(x9ECParameters, "<UNKNOWN>");
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(str);
        if (byName == null && (byName = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str)) == null) {
            java.lang.System.err.println("Unknown curve: ".concat(java.lang.String.valueOf(str)));
        } else {
            getHighSpeedVideoFpsRanges(byName, str);
        }
    }
}
