package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public abstract class ECPoint {
    protected static final org.bouncycastle.math.ec.ECFieldElement[] EMPTY_ZS = new org.bouncycastle.math.ec.ECFieldElement[0];
    protected org.bouncycastle.math.ec.ECCurve curve;
    protected java.util.Hashtable preCompTable;
    protected org.bouncycastle.math.ec.ECFieldElement x;
    protected org.bouncycastle.math.ec.ECFieldElement y;
    protected org.bouncycastle.math.ec.ECFieldElement[] zs;

    public abstract org.bouncycastle.math.ec.ECPoint add(org.bouncycastle.math.ec.ECPoint eCPoint);

    protected abstract org.bouncycastle.math.ec.ECPoint detach();

    protected abstract boolean getCompressionYTilde();

    public abstract org.bouncycastle.math.ec.ECPoint negate();

    protected abstract boolean satisfiesCurveEquation();

    public abstract org.bouncycastle.math.ec.ECPoint subtract(org.bouncycastle.math.ec.ECPoint eCPoint);

    public abstract org.bouncycastle.math.ec.ECPoint twice();

    final boolean getHighSpeedVideoSizes(final boolean z, final boolean z2) {
        if (isInfinity()) {
            return true;
        }
        return !((org.bouncycastle.math.ec.ValidityPrecompInfo) getCurve().precompute(this, "bc_validity", new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.ECPoint.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                org.bouncycastle.math.ec.ValidityPrecompInfo validityPrecompInfo = preCompInfo instanceof org.bouncycastle.math.ec.ValidityPrecompInfo ? (org.bouncycastle.math.ec.ValidityPrecompInfo) preCompInfo : null;
                if (validityPrecompInfo == null) {
                    validityPrecompInfo = new org.bouncycastle.math.ec.ValidityPrecompInfo();
                }
                if (!validityPrecompInfo.getHighSpeedVideoFpsRanges) {
                    if (!validityPrecompInfo.getHighSpeedVideoSizes) {
                        if (!z && !org.bouncycastle.math.ec.ECPoint.this.satisfiesCurveEquation()) {
                            validityPrecompInfo.getHighSpeedVideoFpsRanges = true;
                            return validityPrecompInfo;
                        }
                        validityPrecompInfo.getHighSpeedVideoSizes = true;
                    }
                    if (z2 && !validityPrecompInfo.getHighSpeedVideoFpsRangesFor) {
                        if (!org.bouncycastle.math.ec.ECPoint.this.satisfiesOrder()) {
                            validityPrecompInfo.getHighSpeedVideoFpsRanges = true;
                            return validityPrecompInfo;
                        }
                        validityPrecompInfo.getHighSpeedVideoFpsRangesFor = true;
                    }
                }
                return validityPrecompInfo;
            }
        })).getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
        return twice().add(eCPoint);
    }

    public java.lang.String toString() {
        if (isInfinity()) {
            return "INF";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("(");
        stringBuffer.append(getRawXCoord());
        stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        stringBuffer.append(getRawYCoord());
        for (int i = 0; i < this.zs.length; i++) {
            stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            stringBuffer.append(this.zs[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public org.bouncycastle.math.ec.ECPoint timesPow2(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("'e' cannot be negative");
        }
        org.bouncycastle.math.ec.ECPoint eCPoint = this;
        while (true) {
            i--;
            if (i < 0) {
                return eCPoint;
            }
            eCPoint = eCPoint.twice();
        }
    }

    public org.bouncycastle.math.ec.ECPoint threeTimes() {
        return twicePlus(this);
    }

    public org.bouncycastle.math.ec.ECPoint scaleYNegateX(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().negate(), getRawYCoord().multiply(eCFieldElement), getRawZCoords());
    }

    public org.bouncycastle.math.ec.ECPoint scaleY(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord(), getRawYCoord().multiply(eCFieldElement), getRawZCoords());
    }

    public org.bouncycastle.math.ec.ECPoint scaleXNegateY(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord().negate(), getRawZCoords());
    }

    public org.bouncycastle.math.ec.ECPoint scaleX(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord(), getRawZCoords());
    }

    protected boolean satisfiesOrder() {
        java.math.BigInteger order;
        return org.bouncycastle.math.ec.ECConstants.ONE.equals(this.curve.getCofactor()) || (order = this.curve.getOrder()) == null || org.bouncycastle.math.ec.ECAlgorithms.referenceMultiply(this, order).isInfinity();
    }

    final org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        if (curveCoordinateSystem != 1) {
            if (curveCoordinateSystem == 2 || curveCoordinateSystem == 3 || curveCoordinateSystem == 4) {
                org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement.square();
                return createScaledPoint(square, square.multiply(eCFieldElement));
            }
            if (curveCoordinateSystem != 6) {
                throw new java.lang.IllegalStateException("not a projective coordinate system");
            }
        }
        return createScaledPoint(eCFieldElement, eCFieldElement);
    }

    public org.bouncycastle.math.ec.ECPoint normalize() {
        int curveCoordinateSystem;
        if (!isInfinity() && (curveCoordinateSystem = getCurveCoordinateSystem()) != 0 && curveCoordinateSystem != 5) {
            org.bouncycastle.math.ec.ECFieldElement zCoord = getZCoord(0);
            if (!zCoord.isOne()) {
                if (this.curve == null) {
                    throw new java.lang.IllegalStateException("Detached points must be in affine coordinates");
                }
                org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult = this.curve.randomFieldElementMult(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
                return getHighSpeedVideoFpsRangesFor(zCoord.multiply(randomFieldElementMult).invert().multiply(randomFieldElementMult));
            }
        }
        return this;
    }

    public org.bouncycastle.math.ec.ECPoint multiply(java.math.BigInteger bigInteger) {
        return getCurve().getMultiplier().multiply(this, bigInteger);
    }

    public boolean isValid() {
        return getHighSpeedVideoSizes(false, true);
    }

    public boolean isNormalized() {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        return curveCoordinateSystem == 0 || curveCoordinateSystem == 5 || isInfinity() || this.zs[0].isOne();
    }

    public boolean isInfinity() {
        if (this.x == null || this.y == null) {
            return true;
        }
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr = this.zs;
        return eCFieldElementArr.length > 0 && eCFieldElementArr[0].isZero();
    }

    public int hashCode() {
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        int i = curve == null ? 0 : ~curve.hashCode();
        if (isInfinity()) {
            return i;
        }
        org.bouncycastle.math.ec.ECPoint normalize = normalize();
        return (i ^ (normalize.getXCoord().hashCode() * 17)) ^ (normalize.getYCoord().hashCode() * 257);
    }

    public org.bouncycastle.math.ec.ECFieldElement[] getZCoords() {
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr = this.zs;
        int length = eCFieldElementArr.length;
        if (length == 0) {
            return EMPTY_ZS;
        }
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr2 = new org.bouncycastle.math.ec.ECFieldElement[length];
        java.lang.System.arraycopy(eCFieldElementArr, 0, eCFieldElementArr2, 0, length);
        return eCFieldElementArr2;
    }

    public org.bouncycastle.math.ec.ECFieldElement getZCoord(int i) {
        if (i < 0) {
            return null;
        }
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr = this.zs;
        if (i < eCFieldElementArr.length) {
            return eCFieldElementArr[i];
        }
        return null;
    }

    public static class Fp extends org.bouncycastle.math.ec.ECPoint.AbstractFp {
        protected org.bouncycastle.math.ec.ECFieldElement two(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return eCFieldElement.add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
            if (this == eCPoint) {
                return threeTimes();
            }
            if (!isInfinity()) {
                if (eCPoint.isInfinity()) {
                    return twice();
                }
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.y;
                if (!eCFieldElement.isZero()) {
                    org.bouncycastle.math.ec.ECCurve curve = getCurve();
                    int coordinateSystem = curve.getCoordinateSystem();
                    if (coordinateSystem != 0) {
                        return (coordinateSystem != 4 ? twice() : twiceJacobianModified(false)).add(eCPoint);
                    }
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.x;
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = eCPoint.x;
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = eCPoint.y;
                    org.bouncycastle.math.ec.ECFieldElement subtract = eCFieldElement3.subtract(eCFieldElement2);
                    org.bouncycastle.math.ec.ECFieldElement subtract2 = eCFieldElement4.subtract(eCFieldElement);
                    if (subtract.isZero()) {
                        return subtract2.isZero() ? threeTimes() : this;
                    }
                    org.bouncycastle.math.ec.ECFieldElement square = subtract.square();
                    org.bouncycastle.math.ec.ECFieldElement subtract3 = square.multiply(two(eCFieldElement2).add(eCFieldElement3)).subtract(subtract2.square());
                    if (subtract3.isZero()) {
                        return curve.getInfinity();
                    }
                    org.bouncycastle.math.ec.ECFieldElement invert = subtract3.multiply(subtract).invert();
                    org.bouncycastle.math.ec.ECFieldElement multiply = subtract3.multiply(invert).multiply(subtract2);
                    org.bouncycastle.math.ec.ECFieldElement subtract4 = two(eCFieldElement).multiply(square).multiply(subtract).multiply(invert).subtract(multiply);
                    org.bouncycastle.math.ec.ECFieldElement add = subtract4.subtract(multiply).multiply(multiply.add(subtract4)).add(eCFieldElement3);
                    return new org.bouncycastle.math.ec.ECPoint.Fp(curve, add, eCFieldElement2.subtract(add).multiply(subtract4).subtract(eCFieldElement));
                }
            }
            return eCPoint;
        }

        protected org.bouncycastle.math.ec.ECPoint.Fp twiceJacobianModified(boolean z) {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
            org.bouncycastle.math.ec.ECFieldElement jacobianModifiedW = getJacobianModifiedW();
            org.bouncycastle.math.ec.ECFieldElement add = three(eCFieldElement.square()).add(jacobianModifiedW);
            org.bouncycastle.math.ec.ECFieldElement two = two(eCFieldElement2);
            org.bouncycastle.math.ec.ECFieldElement multiply = two.multiply(eCFieldElement2);
            org.bouncycastle.math.ec.ECFieldElement two2 = two(eCFieldElement.multiply(multiply));
            org.bouncycastle.math.ec.ECFieldElement subtract = add.square().subtract(two(two2));
            org.bouncycastle.math.ec.ECFieldElement two3 = two(multiply.square());
            org.bouncycastle.math.ec.ECFieldElement subtract2 = add.multiply(two2.subtract(subtract)).subtract(two3);
            org.bouncycastle.math.ec.ECFieldElement two4 = z ? two(two3.multiply(jacobianModifiedW)) : null;
            if (!eCFieldElement3.isOne()) {
                two = two.multiply(eCFieldElement3);
            }
            return new org.bouncycastle.math.ec.ECPoint.Fp(getCurve(), subtract, subtract2, new org.bouncycastle.math.ec.ECFieldElement[]{two, two4});
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint twice() {
            org.bouncycastle.math.ec.ECFieldElement add;
            org.bouncycastle.math.ec.ECFieldElement multiply;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.y;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.x;
            if (coordinateSystem == 0) {
                org.bouncycastle.math.ec.ECFieldElement divide = three(eCFieldElement2.square()).add(getCurve().getA()).divide(two(eCFieldElement));
                org.bouncycastle.math.ec.ECFieldElement subtract = divide.square().subtract(two(eCFieldElement2));
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, subtract, divide.multiply(eCFieldElement2.subtract(subtract)).subtract(eCFieldElement));
            }
            if (coordinateSystem == 1) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                boolean isOne = eCFieldElement3.isOne();
                org.bouncycastle.math.ec.ECFieldElement a2 = curve.getA();
                if (!a2.isZero() && !isOne) {
                    a2 = a2.multiply(eCFieldElement3.square());
                }
                org.bouncycastle.math.ec.ECFieldElement add2 = a2.add(three(eCFieldElement2.square()));
                org.bouncycastle.math.ec.ECFieldElement multiply2 = isOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement3);
                org.bouncycastle.math.ec.ECFieldElement square = isOne ? eCFieldElement.square() : multiply2.multiply(eCFieldElement);
                org.bouncycastle.math.ec.ECFieldElement four = four(eCFieldElement2.multiply(square));
                org.bouncycastle.math.ec.ECFieldElement subtract2 = add2.square().subtract(two(four));
                org.bouncycastle.math.ec.ECFieldElement two = two(multiply2);
                org.bouncycastle.math.ec.ECFieldElement multiply3 = subtract2.multiply(two);
                org.bouncycastle.math.ec.ECFieldElement two2 = two(square);
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, multiply3, four.subtract(subtract2).multiply(add2).subtract(two(two2.square())), new org.bouncycastle.math.ec.ECFieldElement[]{two(isOne ? two(two2) : two.square()).multiply(multiply2)});
            }
            if (coordinateSystem != 2) {
                if (coordinateSystem == 4) {
                    return twiceJacobianModified(true);
                }
                throw new java.lang.IllegalStateException("unsupported coordinate system");
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = this.zs[0];
            boolean isOne2 = eCFieldElement4.isOne();
            org.bouncycastle.math.ec.ECFieldElement square2 = eCFieldElement.square();
            org.bouncycastle.math.ec.ECFieldElement square3 = square2.square();
            org.bouncycastle.math.ec.ECFieldElement a3 = curve.getA();
            org.bouncycastle.math.ec.ECFieldElement negate = a3.negate();
            if (negate.toBigInteger().equals(java.math.BigInteger.valueOf(3L))) {
                org.bouncycastle.math.ec.ECFieldElement square4 = isOne2 ? eCFieldElement4 : eCFieldElement4.square();
                add = three(eCFieldElement2.add(square4).multiply(eCFieldElement2.subtract(square4)));
                multiply = square2.multiply(eCFieldElement2);
            } else {
                org.bouncycastle.math.ec.ECFieldElement three = three(eCFieldElement2.square());
                if (!isOne2) {
                    if (a3.isZero()) {
                        add = three;
                    } else {
                        org.bouncycastle.math.ec.ECFieldElement square5 = eCFieldElement4.square().square();
                        if (negate.bitLength() < a3.bitLength()) {
                            add = three.subtract(square5.multiply(negate));
                        } else {
                            a3 = square5.multiply(a3);
                        }
                    }
                    multiply = eCFieldElement2.multiply(square2);
                }
                add = three.add(a3);
                multiply = eCFieldElement2.multiply(square2);
            }
            org.bouncycastle.math.ec.ECFieldElement four2 = four(multiply);
            org.bouncycastle.math.ec.ECFieldElement subtract3 = add.square().subtract(two(four2));
            org.bouncycastle.math.ec.ECFieldElement subtract4 = four2.subtract(subtract3).multiply(add).subtract(eight(square3));
            org.bouncycastle.math.ec.ECFieldElement two3 = two(eCFieldElement);
            if (!isOne2) {
                two3 = two3.multiply(eCFieldElement4);
            }
            return new org.bouncycastle.math.ec.ECPoint.Fp(curve, subtract3, subtract4, new org.bouncycastle.math.ec.ECFieldElement[]{two3});
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint timesPow2(int i) {
            org.bouncycastle.math.ec.ECFieldElement square;
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("'e' cannot be negative");
            }
            if (i == 0 || isInfinity()) {
                return this;
            }
            if (i == 1) {
                return twice();
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.y;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            org.bouncycastle.math.ec.ECFieldElement a2 = curve.getA();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.x;
            int i2 = 0;
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = this.zs.length <= 0 ? curve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ONE) : this.zs[0];
            if (!fromBigInteger.isOne() && coordinateSystem != 0) {
                if (coordinateSystem == 1) {
                    square = fromBigInteger.square();
                    eCFieldElement2 = eCFieldElement2.multiply(fromBigInteger);
                    eCFieldElement = eCFieldElement.multiply(square);
                } else if (coordinateSystem == 2) {
                    square = null;
                } else {
                    if (coordinateSystem != 4) {
                        throw new java.lang.IllegalStateException("unsupported coordinate system");
                    }
                    a2 = getJacobianModifiedW();
                }
                a2 = calculateJacobianModifiedW(fromBigInteger, square);
            }
            while (i2 < i) {
                if (eCFieldElement.isZero()) {
                    return curve.getInfinity();
                }
                org.bouncycastle.math.ec.ECFieldElement three = three(eCFieldElement2.square());
                org.bouncycastle.math.ec.ECFieldElement two = two(eCFieldElement);
                org.bouncycastle.math.ec.ECFieldElement multiply = two.multiply(eCFieldElement);
                org.bouncycastle.math.ec.ECFieldElement two2 = two(eCFieldElement2.multiply(multiply));
                org.bouncycastle.math.ec.ECFieldElement two3 = two(multiply.square());
                if (!a2.isZero()) {
                    three = three.add(a2);
                    a2 = two(two3.multiply(a2));
                }
                org.bouncycastle.math.ec.ECFieldElement subtract = three.square().subtract(two(two2));
                eCFieldElement = three.multiply(two2.subtract(subtract)).subtract(two3);
                fromBigInteger = fromBigInteger.isOne() ? two : two.multiply(fromBigInteger);
                i2++;
                eCFieldElement2 = subtract;
            }
            if (coordinateSystem == 0) {
                org.bouncycastle.math.ec.ECFieldElement invert = fromBigInteger.invert();
                org.bouncycastle.math.ec.ECFieldElement square2 = invert.square();
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, eCFieldElement2.multiply(square2), eCFieldElement.multiply(square2.multiply(invert)));
            }
            if (coordinateSystem == 1) {
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, eCFieldElement2.multiply(fromBigInteger), eCFieldElement, new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger.multiply(fromBigInteger.square())});
            }
            if (coordinateSystem == 2) {
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, eCFieldElement2, eCFieldElement, new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger});
            }
            if (coordinateSystem == 4) {
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, eCFieldElement2, eCFieldElement, new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger, a2});
            }
            throw new java.lang.IllegalStateException("unsupported coordinate system");
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint threeTimes() {
            if (!isInfinity()) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.y;
                if (!eCFieldElement.isZero()) {
                    org.bouncycastle.math.ec.ECCurve curve = getCurve();
                    int coordinateSystem = curve.getCoordinateSystem();
                    if (coordinateSystem != 0) {
                        return coordinateSystem != 4 ? twice().add(this) : twiceJacobianModified(false).add(this);
                    }
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.x;
                    org.bouncycastle.math.ec.ECFieldElement two = two(eCFieldElement);
                    org.bouncycastle.math.ec.ECFieldElement square = two.square();
                    org.bouncycastle.math.ec.ECFieldElement add = three(eCFieldElement2.square()).add(getCurve().getA());
                    org.bouncycastle.math.ec.ECFieldElement subtract = three(eCFieldElement2).multiply(square).subtract(add.square());
                    if (subtract.isZero()) {
                        return getCurve().getInfinity();
                    }
                    org.bouncycastle.math.ec.ECFieldElement invert = subtract.multiply(two).invert();
                    org.bouncycastle.math.ec.ECFieldElement multiply = subtract.multiply(invert).multiply(add);
                    org.bouncycastle.math.ec.ECFieldElement subtract2 = square.square().multiply(invert).subtract(multiply);
                    org.bouncycastle.math.ec.ECFieldElement add2 = subtract2.subtract(multiply).multiply(multiply.add(subtract2)).add(eCFieldElement2);
                    return new org.bouncycastle.math.ec.ECPoint.Fp(curve, add2, eCFieldElement2.subtract(add2).multiply(subtract2).subtract(eCFieldElement));
                }
            }
            return this;
        }

        protected org.bouncycastle.math.ec.ECFieldElement three(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return two(eCFieldElement).add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint negate() {
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            return curve.getCoordinateSystem() != 0 ? new org.bouncycastle.math.ec.ECPoint.Fp(curve, this.x, this.y.negate(), this.zs) : new org.bouncycastle.math.ec.ECPoint.Fp(curve, this.x, this.y.negate());
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECFieldElement getZCoord(int i) {
            return (i == 1 && 4 == getCurveCoordinateSystem()) ? getJacobianModifiedW() : super.getZCoord(i);
        }

        protected org.bouncycastle.math.ec.ECFieldElement getJacobianModifiedW() {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.zs[1];
            if (eCFieldElement != null) {
                return eCFieldElement;
            }
            org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr = this.zs;
            org.bouncycastle.math.ec.ECFieldElement calculateJacobianModifiedW = calculateJacobianModifiedW(this.zs[0], null);
            eCFieldElementArr[1] = calculateJacobianModifiedW;
            return calculateJacobianModifiedW;
        }

        protected org.bouncycastle.math.ec.ECFieldElement four(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return two(two(eCFieldElement));
        }

        protected org.bouncycastle.math.ec.ECFieldElement eight(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return four(two(eCFieldElement));
        }

        protected org.bouncycastle.math.ec.ECFieldElement doubleProductFromSquares(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement3, org.bouncycastle.math.ec.ECFieldElement eCFieldElement4) {
            return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected org.bouncycastle.math.ec.ECPoint detach() {
            return new org.bouncycastle.math.ec.ECPoint.Fp(null, getAffineXCoord(), getAffineYCoord());
        }

        protected org.bouncycastle.math.ec.ECFieldElement calculateJacobianModifiedW(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            org.bouncycastle.math.ec.ECFieldElement a2 = getCurve().getA();
            if (a2.isZero() || eCFieldElement.isOne()) {
                return a2;
            }
            if (eCFieldElement2 == null) {
                eCFieldElement2 = eCFieldElement.square();
            }
            org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement2.square();
            org.bouncycastle.math.ec.ECFieldElement negate = a2.negate();
            return negate.bitLength() < a2.bitLength() ? square.multiply(negate).negate() : square.multiply(a2);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
        @Override // org.bouncycastle.math.ec.ECPoint
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public org.bouncycastle.math.ec.ECPoint add(org.bouncycastle.math.ec.ECPoint eCPoint) {
            org.bouncycastle.math.ec.ECFieldElement square;
            org.bouncycastle.math.ec.ECFieldElement subtract;
            org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct;
            org.bouncycastle.math.ec.ECFieldElement multiply;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement;
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return this;
            }
            if (this == eCPoint) {
                return twice();
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.y;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = eCPoint.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = eCPoint.y;
            if (coordinateSystem == 0) {
                org.bouncycastle.math.ec.ECFieldElement subtract2 = eCFieldElement4.subtract(eCFieldElement2);
                org.bouncycastle.math.ec.ECFieldElement subtract3 = eCFieldElement5.subtract(eCFieldElement3);
                if (subtract2.isZero()) {
                    return subtract3.isZero() ? twice() : curve.getInfinity();
                }
                org.bouncycastle.math.ec.ECFieldElement divide = subtract3.divide(subtract2);
                org.bouncycastle.math.ec.ECFieldElement subtract4 = divide.square().subtract(eCFieldElement2).subtract(eCFieldElement4);
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, subtract4, divide.multiply(eCFieldElement2.subtract(subtract4)).subtract(eCFieldElement3));
            }
            if (coordinateSystem == 1) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement6 = this.zs[0];
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement7 = eCPoint.zs[0];
                boolean isOne = eCFieldElement6.isOne();
                boolean isOne2 = eCFieldElement7.isOne();
                if (!isOne) {
                    eCFieldElement5 = eCFieldElement5.multiply(eCFieldElement6);
                }
                if (!isOne2) {
                    eCFieldElement3 = eCFieldElement3.multiply(eCFieldElement7);
                }
                org.bouncycastle.math.ec.ECFieldElement subtract5 = eCFieldElement5.subtract(eCFieldElement3);
                if (!isOne) {
                    eCFieldElement4 = eCFieldElement4.multiply(eCFieldElement6);
                }
                if (!isOne2) {
                    eCFieldElement2 = eCFieldElement2.multiply(eCFieldElement7);
                }
                org.bouncycastle.math.ec.ECFieldElement subtract6 = eCFieldElement4.subtract(eCFieldElement2);
                if (subtract6.isZero()) {
                    return subtract5.isZero() ? twice() : curve.getInfinity();
                }
                if (isOne) {
                    eCFieldElement6 = eCFieldElement7;
                } else if (!isOne2) {
                    eCFieldElement6 = eCFieldElement6.multiply(eCFieldElement7);
                }
                org.bouncycastle.math.ec.ECFieldElement square2 = subtract6.square();
                org.bouncycastle.math.ec.ECFieldElement multiply2 = square2.multiply(subtract6);
                org.bouncycastle.math.ec.ECFieldElement multiply3 = square2.multiply(eCFieldElement2);
                org.bouncycastle.math.ec.ECFieldElement subtract7 = subtract5.square().multiply(eCFieldElement6).subtract(multiply2).subtract(two(multiply3));
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, subtract6.multiply(subtract7), multiply3.subtract(subtract7).multiplyMinusProduct(subtract5, eCFieldElement3, multiply2), new org.bouncycastle.math.ec.ECFieldElement[]{multiply2.multiply(eCFieldElement6)});
            }
            if (coordinateSystem != 2 && coordinateSystem != 4) {
                throw new java.lang.IllegalStateException("unsupported coordinate system");
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement8 = this.zs[0];
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement9 = eCPoint.zs[0];
            boolean isOne3 = eCFieldElement8.isOne();
            if (isOne3 || !eCFieldElement8.equals(eCFieldElement9)) {
                if (!isOne3) {
                    org.bouncycastle.math.ec.ECFieldElement square3 = eCFieldElement8.square();
                    eCFieldElement4 = square3.multiply(eCFieldElement4);
                    eCFieldElement5 = square3.multiply(eCFieldElement8).multiply(eCFieldElement5);
                }
                boolean isOne4 = eCFieldElement9.isOne();
                if (!isOne4) {
                    org.bouncycastle.math.ec.ECFieldElement square4 = eCFieldElement9.square();
                    eCFieldElement2 = square4.multiply(eCFieldElement2);
                    eCFieldElement3 = square4.multiply(eCFieldElement9).multiply(eCFieldElement3);
                }
                org.bouncycastle.math.ec.ECFieldElement subtract8 = eCFieldElement2.subtract(eCFieldElement4);
                org.bouncycastle.math.ec.ECFieldElement subtract9 = eCFieldElement3.subtract(eCFieldElement5);
                if (subtract8.isZero()) {
                    return subtract9.isZero() ? twice() : curve.getInfinity();
                }
                square = subtract8.square();
                org.bouncycastle.math.ec.ECFieldElement multiply4 = square.multiply(subtract8);
                org.bouncycastle.math.ec.ECFieldElement multiply5 = square.multiply(eCFieldElement2);
                subtract = subtract9.square().add(multiply4).subtract(two(multiply5));
                multiplyMinusProduct = multiply5.subtract(subtract).multiplyMinusProduct(subtract9, multiply4, eCFieldElement3);
                org.bouncycastle.math.ec.ECFieldElement multiply6 = !isOne3 ? subtract8.multiply(eCFieldElement8) : subtract8;
                multiply = !isOne4 ? multiply6.multiply(eCFieldElement9) : multiply6;
                if (multiply != subtract8) {
                    eCFieldElement = subtract;
                }
                return new org.bouncycastle.math.ec.ECPoint.Fp(curve, subtract, multiplyMinusProduct, coordinateSystem != 4 ? new org.bouncycastle.math.ec.ECFieldElement[]{multiply, calculateJacobianModifiedW(multiply, square)} : new org.bouncycastle.math.ec.ECFieldElement[]{multiply});
            }
            org.bouncycastle.math.ec.ECFieldElement subtract10 = eCFieldElement2.subtract(eCFieldElement4);
            org.bouncycastle.math.ec.ECFieldElement subtract11 = eCFieldElement3.subtract(eCFieldElement5);
            if (subtract10.isZero()) {
                return subtract11.isZero() ? twice() : curve.getInfinity();
            }
            org.bouncycastle.math.ec.ECFieldElement square5 = subtract10.square();
            org.bouncycastle.math.ec.ECFieldElement multiply7 = eCFieldElement2.multiply(square5);
            org.bouncycastle.math.ec.ECFieldElement multiply8 = eCFieldElement4.multiply(square5);
            org.bouncycastle.math.ec.ECFieldElement multiply9 = multiply7.subtract(multiply8).multiply(eCFieldElement3);
            eCFieldElement = subtract11.square().subtract(multiply7).subtract(multiply8);
            multiplyMinusProduct = multiply7.subtract(eCFieldElement).multiply(subtract11).subtract(multiply9);
            multiply = subtract10.multiply(eCFieldElement8);
            square = null;
            subtract = eCFieldElement;
            return new org.bouncycastle.math.ec.ECPoint.Fp(curve, subtract, multiplyMinusProduct, coordinateSystem != 4 ? new org.bouncycastle.math.ec.ECFieldElement[]{multiply, calculateJacobianModifiedW(multiply, square)} : new org.bouncycastle.math.ec.ECFieldElement[]{multiply});
        }

        Fp(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        Fp(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }
    }

    public org.bouncycastle.math.ec.ECFieldElement getYCoord() {
        return this.y;
    }

    public org.bouncycastle.math.ec.ECFieldElement getXCoord() {
        return this.x;
    }

    protected final org.bouncycastle.math.ec.ECFieldElement[] getRawZCoords() {
        return this.zs;
    }

    public final org.bouncycastle.math.ec.ECFieldElement getRawYCoord() {
        return this.y;
    }

    public final org.bouncycastle.math.ec.ECFieldElement getRawXCoord() {
        return this.x;
    }

    public byte[] getEncoded(boolean z) {
        if (isInfinity()) {
            return new byte[1];
        }
        org.bouncycastle.math.ec.ECPoint normalize = normalize();
        byte[] encoded = normalize.getXCoord().getEncoded();
        if (z) {
            byte[] bArr = new byte[encoded.length + 1];
            bArr[0] = (byte) (normalize.getCompressionYTilde() ? 3 : 2);
            java.lang.System.arraycopy(encoded, 0, bArr, 1, encoded.length);
            return bArr;
        }
        byte[] encoded2 = normalize.getYCoord().getEncoded();
        byte[] bArr2 = new byte[encoded.length + encoded2.length + 1];
        bArr2[0] = 4;
        java.lang.System.arraycopy(encoded, 0, bArr2, 1, encoded.length);
        java.lang.System.arraycopy(encoded2, 0, bArr2, encoded.length + 1, encoded2.length);
        return bArr2;
    }

    public final org.bouncycastle.math.ec.ECPoint getDetachedPoint() {
        return normalize().detach();
    }

    public static abstract class AbstractF2m extends org.bouncycastle.math.ec.ECPoint {
        public org.bouncycastle.math.ec.ECPoint.AbstractF2m tauPow(int i) {
            org.bouncycastle.math.ec.ECPoint createRawPoint;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new java.lang.IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                createRawPoint = curve.createRawPoint(eCFieldElement.squarePow(i), this.y.squarePow(i), new org.bouncycastle.math.ec.ECFieldElement[]{this.zs[0].squarePow(i)});
                return (org.bouncycastle.math.ec.ECPoint.AbstractF2m) createRawPoint;
            }
            createRawPoint = curve.createRawPoint(eCFieldElement.squarePow(i), this.y.squarePow(i));
            return (org.bouncycastle.math.ec.ECPoint.AbstractF2m) createRawPoint;
        }

        public org.bouncycastle.math.ec.ECPoint.AbstractF2m tau() {
            org.bouncycastle.math.ec.ECPoint createRawPoint;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new java.lang.IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                createRawPoint = curve.createRawPoint(eCFieldElement.square(), this.y.square(), new org.bouncycastle.math.ec.ECFieldElement[]{this.zs[0].square()});
                return (org.bouncycastle.math.ec.ECPoint.AbstractF2m) createRawPoint;
            }
            createRawPoint = curve.createRawPoint(eCFieldElement.square(), this.y.square());
            return (org.bouncycastle.math.ec.ECPoint.AbstractF2m) createRawPoint;
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint subtract(org.bouncycastle.math.ec.ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint scaleYNegateX(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return scaleY(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint scaleY(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return super.scaleY(eCFieldElement);
            }
            org.bouncycastle.math.ec.ECFieldElement rawXCoord = getRawXCoord();
            return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).multiply(eCFieldElement).add(rawXCoord), getRawZCoords());
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint scaleXNegateY(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            return scaleX(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint scaleX(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 5) {
                org.bouncycastle.math.ec.ECFieldElement rawXCoord = getRawXCoord();
                org.bouncycastle.math.ec.ECFieldElement rawYCoord = getRawYCoord();
                return getCurve().createRawPoint(rawXCoord, rawYCoord.add(rawXCoord).divide(eCFieldElement).add(rawXCoord.multiply(eCFieldElement)), getRawZCoords());
            }
            if (curveCoordinateSystem != 6) {
                return super.scaleX(eCFieldElement);
            }
            org.bouncycastle.math.ec.ECFieldElement rawXCoord2 = getRawXCoord();
            org.bouncycastle.math.ec.ECFieldElement rawYCoord2 = getRawYCoord();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = getRawZCoords()[0];
            org.bouncycastle.math.ec.ECFieldElement multiply = rawXCoord2.multiply(eCFieldElement.square());
            return getCurve().createRawPoint(multiply, rawYCoord2.add(rawXCoord2).add(multiply), new org.bouncycastle.math.ec.ECFieldElement[]{eCFieldElement2.multiply(eCFieldElement)});
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected boolean satisfiesOrder() {
            java.math.BigInteger cofactor = this.curve.getCofactor();
            if (org.bouncycastle.math.ec.ECConstants.TWO.equals(cofactor)) {
                return ((org.bouncycastle.math.ec.ECFieldElement.AbstractF2m) normalize().getAffineXCoord()).trace() != 0;
            }
            if (!org.bouncycastle.math.ec.ECConstants.FOUR.equals(cofactor)) {
                return super.satisfiesOrder();
            }
            org.bouncycastle.math.ec.ECPoint normalize = normalize();
            org.bouncycastle.math.ec.ECFieldElement affineXCoord = normalize.getAffineXCoord();
            org.bouncycastle.math.ec.ECFieldElement solveQuadraticEquation = ((org.bouncycastle.math.ec.ECCurve.AbstractF2m) this.curve).solveQuadraticEquation(affineXCoord.add(this.curve.getA()));
            if (solveQuadraticEquation == null) {
                return false;
            }
            return ((org.bouncycastle.math.ec.ECFieldElement.AbstractF2m) affineXCoord.multiply(solveQuadraticEquation).add(normalize.getAffineYCoord())).trace() == 0;
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected boolean satisfiesCurveEquation() {
            org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct;
            org.bouncycastle.math.ec.ECFieldElement squarePlusProduct;
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            org.bouncycastle.math.ec.ECFieldElement a2 = curve.getA();
            org.bouncycastle.math.ec.ECFieldElement b = curve.getB();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 6) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
                org.bouncycastle.math.ec.ECFieldElement multiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement2);
                if (coordinateSystem != 0) {
                    if (coordinateSystem != 1) {
                        throw new java.lang.IllegalStateException("unsupported coordinate system");
                    }
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                    if (!eCFieldElement3.isOne()) {
                        org.bouncycastle.math.ec.ECFieldElement multiply2 = eCFieldElement3.multiply(eCFieldElement3.square());
                        multiply = multiply.multiply(eCFieldElement3);
                        a2 = a2.multiply(eCFieldElement3);
                        b = b.multiply(multiply2);
                    }
                }
                return multiply.equals(eCFieldElement.add(a2).multiply(eCFieldElement.square()).add(b));
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = this.zs[0];
            boolean isOne = eCFieldElement4.isOne();
            if (eCFieldElement.isZero()) {
                org.bouncycastle.math.ec.ECFieldElement square = this.y.square();
                if (!isOne) {
                    b = b.multiply(eCFieldElement4.square());
                }
                return square.equals(b);
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = this.y;
            org.bouncycastle.math.ec.ECFieldElement square2 = eCFieldElement.square();
            if (isOne) {
                multiplyPlusProduct = eCFieldElement5.square().add(eCFieldElement5).add(a2);
                squarePlusProduct = square2.square().add(b);
            } else {
                org.bouncycastle.math.ec.ECFieldElement square3 = eCFieldElement4.square();
                org.bouncycastle.math.ec.ECFieldElement square4 = square3.square();
                multiplyPlusProduct = eCFieldElement5.add(eCFieldElement4).multiplyPlusProduct(eCFieldElement5, a2, square3);
                squarePlusProduct = square2.squarePlusProduct(b, square4);
            }
            return multiplyPlusProduct.multiply(square2).equals(squarePlusProduct);
        }

        public AbstractF2m(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public AbstractF2m(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }
    }

    protected int getCurveCoordinateSystem() {
        org.bouncycastle.math.ec.ECCurve eCCurve = this.curve;
        if (eCCurve == null) {
            return 0;
        }
        return eCCurve.getCoordinateSystem();
    }

    public org.bouncycastle.math.ec.ECCurve getCurve() {
        return this.curve;
    }

    public static class F2m extends org.bouncycastle.math.ec.ECPoint.AbstractF2m {
        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint twicePlus(org.bouncycastle.math.ec.ECPoint eCPoint) {
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return twice();
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            if (curve.getCoordinateSystem() != 6) {
                return twice().add(eCPoint);
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = eCPoint.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = eCPoint.zs[0];
            if (eCFieldElement2.isZero() || !eCFieldElement3.isOne()) {
                return twice().add(eCPoint);
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = this.y;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = this.zs[0];
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement6 = eCPoint.y;
            org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement.square();
            org.bouncycastle.math.ec.ECFieldElement square2 = eCFieldElement4.square();
            org.bouncycastle.math.ec.ECFieldElement square3 = eCFieldElement5.square();
            org.bouncycastle.math.ec.ECFieldElement add = curve.getA().multiply(square3).add(square2).add(eCFieldElement4.multiply(eCFieldElement5));
            org.bouncycastle.math.ec.ECFieldElement addOne = eCFieldElement6.addOne();
            org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct = curve.getA().add(addOne).multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
            org.bouncycastle.math.ec.ECFieldElement multiply = eCFieldElement2.multiply(square3);
            org.bouncycastle.math.ec.ECFieldElement square4 = multiply.add(add).square();
            if (square4.isZero()) {
                return multiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
            }
            if (multiplyPlusProduct.isZero()) {
                return new org.bouncycastle.math.ec.ECPoint.F2m(curve, multiplyPlusProduct, curve.getB().sqrt());
            }
            org.bouncycastle.math.ec.ECFieldElement multiply2 = multiplyPlusProduct.square().multiply(multiply);
            org.bouncycastle.math.ec.ECFieldElement multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
            return new org.bouncycastle.math.ec.ECPoint.F2m(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, addOne, multiply3), new org.bouncycastle.math.ec.ECFieldElement[]{multiply3});
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint twice() {
            org.bouncycastle.math.ec.ECFieldElement add;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem == 0) {
                org.bouncycastle.math.ec.ECFieldElement add2 = this.y.divide(eCFieldElement).add(eCFieldElement);
                org.bouncycastle.math.ec.ECFieldElement add3 = add2.square().add(add2).add(curve.getA());
                return new org.bouncycastle.math.ec.ECPoint.F2m(curve, add3, eCFieldElement.squarePlusProduct(add3, add2.addOne()));
            }
            if (coordinateSystem == 1) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                boolean isOne = eCFieldElement3.isOne();
                org.bouncycastle.math.ec.ECFieldElement multiply = isOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement3);
                if (!isOne) {
                    eCFieldElement2 = eCFieldElement2.multiply(eCFieldElement3);
                }
                org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement.square();
                org.bouncycastle.math.ec.ECFieldElement add4 = square.add(eCFieldElement2);
                org.bouncycastle.math.ec.ECFieldElement square2 = multiply.square();
                org.bouncycastle.math.ec.ECFieldElement add5 = add4.add(multiply);
                org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct = add5.multiplyPlusProduct(add4, square2, curve.getA());
                return new org.bouncycastle.math.ec.ECPoint.F2m(curve, multiply.multiply(multiplyPlusProduct), square.square().multiplyPlusProduct(multiply, multiplyPlusProduct, add5), new org.bouncycastle.math.ec.ECFieldElement[]{multiply.multiply(square2)});
            }
            if (coordinateSystem != 6) {
                throw new java.lang.IllegalStateException("unsupported coordinate system");
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = this.y;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = this.zs[0];
            boolean isOne2 = eCFieldElement5.isOne();
            org.bouncycastle.math.ec.ECFieldElement multiply2 = isOne2 ? eCFieldElement4 : eCFieldElement4.multiply(eCFieldElement5);
            org.bouncycastle.math.ec.ECFieldElement square3 = isOne2 ? eCFieldElement5 : eCFieldElement5.square();
            org.bouncycastle.math.ec.ECFieldElement a2 = curve.getA();
            org.bouncycastle.math.ec.ECFieldElement multiply3 = isOne2 ? a2 : a2.multiply(square3);
            org.bouncycastle.math.ec.ECFieldElement add6 = eCFieldElement4.square().add(multiply2).add(multiply3);
            if (add6.isZero()) {
                return new org.bouncycastle.math.ec.ECPoint.F2m(curve, add6, curve.getB().sqrt());
            }
            org.bouncycastle.math.ec.ECFieldElement square4 = add6.square();
            org.bouncycastle.math.ec.ECFieldElement multiply4 = isOne2 ? add6 : add6.multiply(square3);
            org.bouncycastle.math.ec.ECFieldElement b = curve.getB();
            if (b.bitLength() < (curve.getFieldSize() >> 1)) {
                org.bouncycastle.math.ec.ECFieldElement square5 = eCFieldElement4.add(eCFieldElement).square();
                add = square5.add(add6).add(square3).multiply(square5).add(b.isOne() ? multiply3.add(square3).square() : multiply3.squarePlusProduct(b, square3.square())).add(square4);
                if (!a2.isZero()) {
                    if (!a2.isOne()) {
                        add = add.add(a2.addOne().multiply(multiply4));
                    }
                    return new org.bouncycastle.math.ec.ECPoint.F2m(curve, square4, add, new org.bouncycastle.math.ec.ECFieldElement[]{multiply4});
                }
            } else {
                if (!isOne2) {
                    eCFieldElement = eCFieldElement.multiply(eCFieldElement5);
                }
                add = eCFieldElement.squarePlusProduct(add6, multiply2).add(square4);
            }
            add = add.add(multiply4);
            return new org.bouncycastle.math.ec.ECPoint.F2m(curve, square4, add, new org.bouncycastle.math.ec.ECFieldElement[]{multiply4});
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint negate() {
            if (!isInfinity()) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
                if (!eCFieldElement.isZero()) {
                    int curveCoordinateSystem = getCurveCoordinateSystem();
                    if (curveCoordinateSystem == 0) {
                        return new org.bouncycastle.math.ec.ECPoint.F2m(this.curve, eCFieldElement, this.y.add(eCFieldElement));
                    }
                    if (curveCoordinateSystem == 1) {
                        return new org.bouncycastle.math.ec.ECPoint.F2m(this.curve, eCFieldElement, this.y.add(eCFieldElement), new org.bouncycastle.math.ec.ECFieldElement[]{this.zs[0]});
                    }
                    if (curveCoordinateSystem == 5) {
                        return new org.bouncycastle.math.ec.ECPoint.F2m(this.curve, eCFieldElement, this.y.addOne());
                    }
                    if (curveCoordinateSystem != 6) {
                        throw new java.lang.IllegalStateException("unsupported coordinate system");
                    }
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                    return new org.bouncycastle.math.ec.ECPoint.F2m(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new org.bouncycastle.math.ec.ECFieldElement[]{eCFieldElement3});
                }
            }
            return this;
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECFieldElement getYCoord() {
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return this.y;
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
            if (isInfinity() || eCFieldElement.isZero()) {
                return eCFieldElement2;
            }
            org.bouncycastle.math.ec.ECFieldElement multiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
            if (6 == curveCoordinateSystem) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                if (!eCFieldElement3.isOne()) {
                    return multiply.divide(eCFieldElement3);
                }
            }
            return multiply;
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected boolean getCompressionYTilde() {
            org.bouncycastle.math.ec.ECFieldElement rawXCoord = getRawXCoord();
            if (rawXCoord.isZero()) {
                return false;
            }
            org.bouncycastle.math.ec.ECFieldElement rawYCoord = getRawYCoord();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            return (curveCoordinateSystem == 5 || curveCoordinateSystem == 6) ? rawYCoord.testBitZero() != rawXCoord.testBitZero() : rawYCoord.divide(rawXCoord).testBitZero();
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected org.bouncycastle.math.ec.ECPoint detach() {
            return new org.bouncycastle.math.ec.ECPoint.F2m(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint add(org.bouncycastle.math.ec.ECPoint eCPoint) {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement3;
            org.bouncycastle.math.ec.ECFieldElement squarePlusProduct;
            org.bouncycastle.math.ec.ECFieldElement multiply;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement4;
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement5 = this.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement6 = eCPoint.x;
            if (coordinateSystem == 0) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement7 = this.y;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement8 = eCPoint.y;
                org.bouncycastle.math.ec.ECFieldElement add = eCFieldElement5.add(eCFieldElement6);
                org.bouncycastle.math.ec.ECFieldElement add2 = eCFieldElement7.add(eCFieldElement8);
                if (add.isZero()) {
                    return add2.isZero() ? twice() : curve.getInfinity();
                }
                org.bouncycastle.math.ec.ECFieldElement divide = add2.divide(add);
                org.bouncycastle.math.ec.ECFieldElement add3 = divide.square().add(divide).add(add).add(curve.getA());
                return new org.bouncycastle.math.ec.ECPoint.F2m(curve, add3, divide.multiply(eCFieldElement5.add(add3)).add(add3).add(eCFieldElement7));
            }
            if (coordinateSystem == 1) {
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement9 = this.y;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement10 = this.zs[0];
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement11 = eCPoint.y;
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement12 = eCPoint.zs[0];
                boolean isOne = eCFieldElement12.isOne();
                org.bouncycastle.math.ec.ECFieldElement add4 = eCFieldElement10.multiply(eCFieldElement11).add(isOne ? eCFieldElement9 : eCFieldElement9.multiply(eCFieldElement12));
                org.bouncycastle.math.ec.ECFieldElement add5 = eCFieldElement10.multiply(eCFieldElement6).add(isOne ? eCFieldElement5 : eCFieldElement5.multiply(eCFieldElement12));
                if (add5.isZero()) {
                    return add4.isZero() ? twice() : curve.getInfinity();
                }
                org.bouncycastle.math.ec.ECFieldElement square = add5.square();
                org.bouncycastle.math.ec.ECFieldElement multiply2 = square.multiply(add5);
                if (!isOne) {
                    eCFieldElement10 = eCFieldElement10.multiply(eCFieldElement12);
                }
                org.bouncycastle.math.ec.ECFieldElement add6 = add4.add(add5);
                org.bouncycastle.math.ec.ECFieldElement add7 = add6.multiplyPlusProduct(add4, square, curve.getA()).multiply(eCFieldElement10).add(multiply2);
                org.bouncycastle.math.ec.ECFieldElement multiply3 = add5.multiply(add7);
                if (!isOne) {
                    square = square.multiply(eCFieldElement12);
                }
                return new org.bouncycastle.math.ec.ECPoint.F2m(curve, multiply3, add4.multiplyPlusProduct(eCFieldElement5, add5, eCFieldElement9).multiplyPlusProduct(square, add6, add7), new org.bouncycastle.math.ec.ECFieldElement[]{multiply2.multiply(eCFieldElement10)});
            }
            if (coordinateSystem != 6) {
                throw new java.lang.IllegalStateException("unsupported coordinate system");
            }
            if (eCFieldElement5.isZero()) {
                return eCFieldElement6.isZero() ? curve.getInfinity() : eCPoint.add(this);
            }
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement13 = this.y;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement14 = this.zs[0];
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement15 = eCPoint.y;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement16 = eCPoint.zs[0];
            boolean isOne2 = eCFieldElement14.isOne();
            if (isOne2) {
                eCFieldElement = eCFieldElement6;
                eCFieldElement2 = eCFieldElement15;
            } else {
                eCFieldElement = eCFieldElement6.multiply(eCFieldElement14);
                eCFieldElement2 = eCFieldElement15.multiply(eCFieldElement14);
            }
            boolean isOne3 = eCFieldElement16.isOne();
            if (isOne3) {
                eCFieldElement3 = eCFieldElement13;
            } else {
                eCFieldElement5 = eCFieldElement5.multiply(eCFieldElement16);
                eCFieldElement3 = eCFieldElement13.multiply(eCFieldElement16);
            }
            org.bouncycastle.math.ec.ECFieldElement add8 = eCFieldElement3.add(eCFieldElement2);
            org.bouncycastle.math.ec.ECFieldElement add9 = eCFieldElement5.add(eCFieldElement);
            if (add9.isZero()) {
                return add8.isZero() ? twice() : curve.getInfinity();
            }
            if (eCFieldElement6.isZero()) {
                org.bouncycastle.math.ec.ECPoint normalize = normalize();
                org.bouncycastle.math.ec.ECFieldElement xCoord = normalize.getXCoord();
                org.bouncycastle.math.ec.ECFieldElement yCoord = normalize.getYCoord();
                org.bouncycastle.math.ec.ECFieldElement divide2 = yCoord.add(eCFieldElement15).divide(xCoord);
                eCFieldElement4 = divide2.square().add(divide2).add(xCoord).add(curve.getA());
                if (eCFieldElement4.isZero()) {
                    return new org.bouncycastle.math.ec.ECPoint.F2m(curve, eCFieldElement4, curve.getB().sqrt());
                }
                squarePlusProduct = divide2.multiply(xCoord.add(eCFieldElement4)).add(eCFieldElement4).add(yCoord).divide(eCFieldElement4).add(eCFieldElement4);
                multiply = curve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ONE);
            } else {
                org.bouncycastle.math.ec.ECFieldElement square2 = add9.square();
                org.bouncycastle.math.ec.ECFieldElement multiply4 = add8.multiply(eCFieldElement5);
                org.bouncycastle.math.ec.ECFieldElement multiply5 = add8.multiply(eCFieldElement);
                org.bouncycastle.math.ec.ECFieldElement multiply6 = multiply4.multiply(multiply5);
                if (multiply6.isZero()) {
                    return new org.bouncycastle.math.ec.ECPoint.F2m(curve, multiply6, curve.getB().sqrt());
                }
                org.bouncycastle.math.ec.ECFieldElement multiply7 = add8.multiply(square2);
                if (!isOne3) {
                    multiply7 = multiply7.multiply(eCFieldElement16);
                }
                squarePlusProduct = multiply5.add(square2).squarePlusProduct(multiply7, eCFieldElement13.add(eCFieldElement14));
                multiply = !isOne2 ? multiply7.multiply(eCFieldElement14) : multiply7;
                eCFieldElement4 = multiply6;
            }
            return new org.bouncycastle.math.ec.ECPoint.F2m(curve, eCFieldElement4, squarePlusProduct, new org.bouncycastle.math.ec.ECFieldElement[]{multiply});
        }

        F2m(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        F2m(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }
    }

    public org.bouncycastle.math.ec.ECFieldElement getAffineYCoord() {
        checkNormalized();
        return getYCoord();
    }

    public org.bouncycastle.math.ec.ECFieldElement getAffineXCoord() {
        checkNormalized();
        return getXCoord();
    }

    public boolean equals(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECPoint eCPoint2;
        if (eCPoint == null) {
            return false;
        }
        org.bouncycastle.math.ec.ECCurve curve = getCurve();
        org.bouncycastle.math.ec.ECCurve curve2 = eCPoint.getCurve();
        boolean z = curve == null;
        boolean z2 = curve2 == null;
        boolean isInfinity = isInfinity();
        boolean isInfinity2 = eCPoint.isInfinity();
        if (isInfinity || isInfinity2) {
            return isInfinity && isInfinity2 && (z || z2 || curve.equals(curve2));
        }
        if (!z || !z2) {
            if (!z) {
                if (z2) {
                    eCPoint2 = normalize();
                } else {
                    if (!curve.equals(curve2)) {
                        return false;
                    }
                    org.bouncycastle.math.ec.ECPoint[] eCPointArr = {this, curve.importPoint(eCPoint)};
                    curve.normalizeAll(eCPointArr);
                    eCPoint2 = eCPointArr[0];
                    eCPoint = eCPointArr[1];
                }
                return !eCPoint2.getXCoord().equals(eCPoint.getXCoord()) && eCPoint2.getYCoord().equals(eCPoint.getYCoord());
            }
            eCPoint = eCPoint.normalize();
        }
        eCPoint2 = this;
        if (eCPoint2.getXCoord().equals(eCPoint.getXCoord())) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.ECPoint) {
            return equals((org.bouncycastle.math.ec.ECPoint) obj);
        }
        return false;
    }

    public static abstract class AbstractFp extends org.bouncycastle.math.ec.ECPoint {
        @Override // org.bouncycastle.math.ec.ECPoint
        public org.bouncycastle.math.ec.ECPoint subtract(org.bouncycastle.math.ec.ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected boolean satisfiesCurveEquation() {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement = this.x;
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2 = this.y;
            org.bouncycastle.math.ec.ECFieldElement a2 = this.curve.getA();
            org.bouncycastle.math.ec.ECFieldElement b = this.curve.getB();
            org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement2.square();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 0) {
                if (curveCoordinateSystem == 1) {
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = this.zs[0];
                    if (!eCFieldElement3.isOne()) {
                        org.bouncycastle.math.ec.ECFieldElement square2 = eCFieldElement3.square();
                        org.bouncycastle.math.ec.ECFieldElement multiply = eCFieldElement3.multiply(square2);
                        square = square.multiply(eCFieldElement3);
                        a2 = a2.multiply(square2);
                        b = b.multiply(multiply);
                    }
                } else {
                    if (curveCoordinateSystem != 2 && curveCoordinateSystem != 3 && curveCoordinateSystem != 4) {
                        throw new java.lang.IllegalStateException("unsupported coordinate system");
                    }
                    org.bouncycastle.math.ec.ECFieldElement eCFieldElement4 = this.zs[0];
                    if (!eCFieldElement4.isOne()) {
                        org.bouncycastle.math.ec.ECFieldElement square3 = eCFieldElement4.square();
                        org.bouncycastle.math.ec.ECFieldElement square4 = square3.square();
                        org.bouncycastle.math.ec.ECFieldElement multiply2 = square3.multiply(square4);
                        a2 = a2.multiply(square4);
                        b = b.multiply(multiply2);
                    }
                }
            }
            return square.equals(eCFieldElement.square().add(a2).multiply(eCFieldElement).add(b));
        }

        @Override // org.bouncycastle.math.ec.ECPoint
        protected boolean getCompressionYTilde() {
            return getAffineYCoord().testBitZero();
        }

        public AbstractFp(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public AbstractFp(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }
    }

    protected org.bouncycastle.math.ec.ECPoint createScaledPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord().multiply(eCFieldElement2));
    }

    protected void checkNormalized() {
        if (!isNormalized()) {
            throw new java.lang.IllegalStateException("point not in normal form");
        }
    }

    protected static org.bouncycastle.math.ec.ECFieldElement[] getInitialZCoords(org.bouncycastle.math.ec.ECCurve eCCurve) {
        int coordinateSystem = eCCurve == null ? 0 : eCCurve.getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            return EMPTY_ZS;
        }
        org.bouncycastle.math.ec.ECFieldElement fromBigInteger = eCCurve.fromBigInteger(org.bouncycastle.math.ec.ECConstants.ONE);
        if (coordinateSystem != 1 && coordinateSystem != 2) {
            if (coordinateSystem == 3) {
                return new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger, fromBigInteger, fromBigInteger};
            }
            if (coordinateSystem == 4) {
                return new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger, eCCurve.getA()};
            }
            if (coordinateSystem != 6) {
                throw new java.lang.IllegalArgumentException("unknown coordinate system");
            }
        }
        return new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger};
    }

    protected ECPoint(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        this.preCompTable = null;
        this.curve = eCCurve;
        this.x = eCFieldElement;
        this.y = eCFieldElement2;
        this.zs = eCFieldElementArr;
    }

    protected ECPoint(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, getInitialZCoords(eCCurve));
    }
}
