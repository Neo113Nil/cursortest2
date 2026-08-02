package org.bouncycastle.asn1.ua;

/* loaded from: classes17.dex */
public abstract class DSTU4145PointEncoder {
    public static org.bouncycastle.math.ec.ECPoint decodePoint(org.bouncycastle.math.ec.ECCurve eCCurve, byte[] bArr) {
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement;
        org.bouncycastle.math.ec.ECFieldElement fromBigInteger = eCCurve.fromBigInteger(java.math.BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        org.bouncycastle.math.ec.ECFieldElement fromBigInteger2 = eCCurve.fromBigInteger(new java.math.BigInteger(1, bArr));
        org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = fromBigInteger2;
        for (int i = 1; i < fromBigInteger2.getFieldSize(); i++) {
            eCFieldElement2 = eCFieldElement2.square().add(fromBigInteger2);
        }
        if (!eCFieldElement2.equals(eCCurve.getA())) {
            fromBigInteger2 = fromBigInteger2.addOne();
        }
        if (fromBigInteger2.isZero()) {
            eCFieldElement = eCCurve.getB().sqrt();
        } else {
            org.bouncycastle.math.ec.ECFieldElement add = fromBigInteger2.square().invert().multiply(eCCurve.getB()).add(eCCurve.getA()).add(fromBigInteger2);
            if (!add.isZero()) {
                org.bouncycastle.math.ec.ECFieldElement fromBigInteger3 = eCCurve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ZERO);
                java.util.Random random = new java.util.Random();
                int fieldSize = add.getFieldSize();
                while (true) {
                    org.bouncycastle.math.ec.ECFieldElement fromBigInteger4 = eCCurve.fromBigInteger(new java.math.BigInteger(fieldSize, random));
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = add;
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = fromBigInteger3;
                    for (int i2 = 1; i2 <= fieldSize - 1; i2++) {
                        org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement3.square();
                        eCFieldElement4 = eCFieldElement4.square().add(square.multiply(fromBigInteger4));
                        eCFieldElement3 = square.add(add);
                    }
                    if (!eCFieldElement3.isZero()) {
                        add = null;
                        break;
                    }
                    if (!eCFieldElement4.square().add(eCFieldElement4).isZero()) {
                        add = eCFieldElement4;
                        break;
                    }
                }
            }
            if (add != null) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = add;
                for (int i3 = 1; i3 < add.getFieldSize(); i3++) {
                    eCFieldElement5 = eCFieldElement5.square().add(add);
                }
                if (!eCFieldElement5.equals(fromBigInteger)) {
                    add = add.addOne();
                }
                eCFieldElement = fromBigInteger2.multiply(add);
            } else {
                eCFieldElement = null;
            }
        }
        if (eCFieldElement != null) {
            return eCCurve.validatePoint(fromBigInteger2.toBigInteger(), eCFieldElement.toBigInteger());
        }
        throw new java.lang.IllegalArgumentException("Invalid point compression");
    }

    public static byte[] encodePoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECPoint normalize = eCPoint.normalize();
        org.bouncycastle.math.ec.ECFieldElement affineXCoord = normalize.getAffineXCoord();
        byte[] encoded = affineXCoord.getEncoded();
        if (!affineXCoord.isZero()) {
            org.bouncycastle.math.ec.ECFieldElement divide = normalize.getAffineYCoord().divide(affineXCoord);
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = divide;
            for (int i = 1; i < divide.getFieldSize(); i++) {
                eCFieldElement = eCFieldElement.square().add(divide);
            }
            if (eCFieldElement.isOne()) {
                int length = encoded.length - 1;
                encoded[length] = (byte) (1 | encoded[length]);
                return encoded;
            }
            int length2 = encoded.length - 1;
            encoded[length2] = (byte) (encoded[length2] & 254);
        }
        return encoded;
    }
}
