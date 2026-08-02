package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* renamed from: a, reason: collision with root package name */
    protected org.bouncycastle.math.ec.ECFieldElement f7050a;
    protected org.bouncycastle.math.ec.ECFieldElement b;
    protected java.math.BigInteger cofactor;
    protected org.bouncycastle.math.field.FiniteField field;
    protected java.math.BigInteger order;
    protected int coord = 0;
    protected org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism = null;
    protected org.bouncycastle.math.ec.ECMultiplier multiplier = null;

    protected abstract org.bouncycastle.math.ec.ECCurve cloneCurve();

    protected abstract org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2);

    protected abstract org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr);

    protected abstract org.bouncycastle.math.ec.ECPoint decompressPoint(int i, java.math.BigInteger bigInteger);

    public abstract org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger);

    public abstract int getFieldSize();

    public abstract org.bouncycastle.math.ec.ECPoint getInfinity();

    public abstract boolean isValidFieldElement(java.math.BigInteger bigInteger);

    public abstract org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom secureRandom);

    public abstract org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i) {
        return i == 0;
    }

    public static abstract class AbstractF2m extends org.bouncycastle.math.ec.ECCurve {
        private java.math.BigInteger[] Camera2StreamConfigurationMap;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractF2m(int i, int i2, int i3, int i4) {
            super(r2);
            org.bouncycastle.math.field.PolynomialExtensionField binaryExtensionField;
            if (i2 == 0) {
                throw new java.lang.IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 != 0) {
                    throw new java.lang.IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                binaryExtensionField = org.bouncycastle.math.field.FiniteFields.getBinaryExtensionField(new int[]{0, i2, i});
            } else {
                if (i3 <= i2) {
                    throw new java.lang.IllegalArgumentException("k2 must be > k1");
                }
                if (i4 <= i3) {
                    throw new java.lang.IllegalArgumentException("k3 must be > k2");
                }
                binaryExtensionField = org.bouncycastle.math.field.FiniteFields.getBinaryExtensionField(new int[]{0, i2, i3, i4, i});
            }
            this.Camera2StreamConfigurationMap = null;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom secureRandom) {
            java.math.BigInteger createRandomBigInteger;
            java.math.BigInteger createRandomBigInteger2;
            int fieldSize = getFieldSize();
            do {
                createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(fieldSize, secureRandom);
            } while (createRandomBigInteger.signum() <= 0);
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(createRandomBigInteger);
            do {
                createRandomBigInteger2 = org.bouncycastle.util.BigIntegers.createRandomBigInteger(fieldSize, secureRandom);
            } while (createRandomBigInteger2.signum() <= 0);
            return fromBigInteger.multiply(fromBigInteger(createRandomBigInteger2));
        }

        protected org.bouncycastle.math.ec.ECFieldElement solveQuadraticEquation(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement2;
            org.bouncycastle.math.ec.ECFieldElement.AbstractF2m abstractF2m = (org.bouncycastle.math.ec.ECFieldElement.AbstractF2m) eCFieldElement;
            boolean hasFastTrace = abstractF2m.hasFastTrace();
            if (hasFastTrace && abstractF2m.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                org.bouncycastle.math.ec.ECFieldElement halfTrace = abstractF2m.halfTrace();
                if (hasFastTrace || halfTrace.square().add(halfTrace).add(eCFieldElement).isZero()) {
                    return halfTrace;
                }
                return null;
            }
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(org.bouncycastle.math.ec.ECConstants.ZERO);
            java.util.Random random = new java.util.Random();
            do {
                org.bouncycastle.math.ec.ECFieldElement fromBigInteger2 = fromBigInteger(new java.math.BigInteger(fieldSize, random));
                org.bouncycastle.math.ec.ECFieldElement eCFieldElement3 = eCFieldElement;
                eCFieldElement2 = fromBigInteger;
                for (int i = 1; i < fieldSize; i++) {
                    org.bouncycastle.math.ec.ECFieldElement square = eCFieldElement3.square();
                    eCFieldElement2 = eCFieldElement2.square().add(square.multiply(fromBigInteger2));
                    eCFieldElement3 = square.add(eCFieldElement);
                }
                if (!eCFieldElement3.isZero()) {
                    return null;
                }
            } while (eCFieldElement2.square().add(eCFieldElement2).isZero());
            return eCFieldElement2;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom secureRandom) {
            return fromBigInteger(org.bouncycastle.util.BigIntegers.createRandomBigInteger(getFieldSize(), secureRandom));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(java.math.BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        public boolean isKoblitz() {
            if (this.order == null || this.cofactor == null || !this.b.isOne()) {
                return false;
            }
            return this.f7050a.isZero() || this.f7050a.isOne();
        }

        final java.math.BigInteger[] getHighSpeedVideoFpsRanges() {
            java.math.BigInteger[] bigIntegerArr;
            synchronized (this) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.Tnaf.getHighResolutionOutputSizeshNQ4ISI(this);
                }
                bigIntegerArr = this.Camera2StreamConfigurationMap;
            }
            return bigIntegerArr;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECPoint decompressPoint(int i, java.math.BigInteger bigInteger) {
            org.bouncycastle.math.ec.ECFieldElement eCFieldElement;
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            if (fromBigInteger.isZero()) {
                eCFieldElement = getB().sqrt();
            } else {
                org.bouncycastle.math.ec.ECFieldElement solveQuadraticEquation = solveQuadraticEquation(fromBigInteger.square().invert().multiply(getB()).add(getA()).add(fromBigInteger));
                if (solveQuadraticEquation != null) {
                    if (solveQuadraticEquation.testBitZero() != (i == 1)) {
                        solveQuadraticEquation = solveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElement = (coordinateSystem == 5 || coordinateSystem == 6) ? solveQuadraticEquation.add(fromBigInteger) : solveQuadraticEquation.multiply(fromBigInteger);
                } else {
                    eCFieldElement = null;
                }
            }
            if (eCFieldElement != null) {
                return createRawPoint(fromBigInteger, eCFieldElement);
            }
            throw new java.lang.IllegalArgumentException("Invalid point compression");
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECPoint createPoint(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!fromBigInteger.isZero()) {
                    fromBigInteger2 = fromBigInteger2.divide(fromBigInteger).add(fromBigInteger);
                } else if (!fromBigInteger2.square().equals(getB())) {
                    throw new java.lang.IllegalArgumentException();
                }
            }
            return createRawPoint(fromBigInteger, fromBigInteger2);
        }

        public static java.math.BigInteger inverse(int i, int[] iArr, java.math.BigInteger bigInteger) {
            return new org.bouncycastle.math.ec.LongArray(bigInteger).getHighResolutionOutputSizeshNQ4ISI(i, iArr).Camera2StreamConfigurationMap();
        }
    }

    public static abstract class AbstractFp extends org.bouncycastle.math.ec.ECCurve {
        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom secureRandom) {
            java.math.BigInteger createRandomBigInteger;
            java.math.BigInteger createRandomBigInteger2;
            java.math.BigInteger characteristic = getField().getCharacteristic();
            do {
                createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(characteristic.bitLength(), secureRandom);
            } while (createRandomBigInteger.compareTo(characteristic) >= 0);
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(createRandomBigInteger);
            do {
                createRandomBigInteger2 = org.bouncycastle.util.BigIntegers.createRandomBigInteger(characteristic.bitLength(), secureRandom);
            } while (createRandomBigInteger2.compareTo(characteristic) >= 0);
            return fromBigInteger.multiply(fromBigInteger(createRandomBigInteger2));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom secureRandom) {
            java.math.BigInteger createRandomBigInteger;
            java.math.BigInteger characteristic = getField().getCharacteristic();
            while (true) {
                createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(characteristic.bitLength(), secureRandom);
                if (createRandomBigInteger.signum() > 0 && createRandomBigInteger.compareTo(characteristic) < 0) {
                    break;
                }
            }
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(createRandomBigInteger);
            while (true) {
                java.math.BigInteger createRandomBigInteger2 = org.bouncycastle.util.BigIntegers.createRandomBigInteger(characteristic.bitLength(), secureRandom);
                if (createRandomBigInteger2.signum() > 0 && createRandomBigInteger2.compareTo(characteristic) < 0) {
                    return fromBigInteger.multiply(fromBigInteger(createRandomBigInteger2));
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(java.math.BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECPoint decompressPoint(int i, java.math.BigInteger bigInteger) {
            org.bouncycastle.math.ec.ECFieldElement fromBigInteger = fromBigInteger(bigInteger);
            org.bouncycastle.math.ec.ECFieldElement sqrt = fromBigInteger.square().add(this.f7050a).multiply(fromBigInteger).add(this.b).sqrt();
            if (sqrt == null) {
                throw new java.lang.IllegalArgumentException("Invalid point compression");
            }
            if (sqrt.testBitZero() != (i == 1)) {
                sqrt = sqrt.negate();
            }
            return createRawPoint(fromBigInteger, sqrt);
        }

        public AbstractFp(java.math.BigInteger bigInteger) {
            super(org.bouncycastle.math.field.FiniteFields.getPrimeField(bigInteger));
        }
    }

    public static class F2m extends org.bouncycastle.math.ec.ECCurve.AbstractF2m {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.math.ec.ECPoint.F2m getHighSpeedVideoSizes;

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
            final int i3 = (this.Camera2StreamConfigurationMap + 63) >>> 6;
            final int[] iArr = isTrinomial() ? new int[]{this.getHighSpeedVideoFpsRangesFor} : new int[]{this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI};
            final long[] jArr = new long[i2 * i3 * 2];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i5];
                long[] jArr2 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCPoint.getRawXCoord()).getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.System.arraycopy(jArr2, 0, jArr, i4, jArr2.length);
                int i6 = i4 + i3;
                long[] jArr3 = ((org.bouncycastle.math.ec.ECFieldElement.F2m) eCPoint.getRawYCoord()).getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.System.arraycopy(jArr3, 0, jArr, i6, jArr3.length);
                i4 = i6 + i3;
            }
            return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.F2m.1
                @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
                public org.bouncycastle.math.ec.ECPoint lookupVar(int i7) {
                    long[] create64 = org.bouncycastle.math.raw.Nat.create64(i3);
                    long[] create642 = org.bouncycastle.math.raw.Nat.create64(i3);
                    int i8 = i7 * i3 * 2;
                    int i9 = 0;
                    while (true) {
                        int i10 = i3;
                        if (i9 >= i10) {
                            return Camera2StreamConfigurationMap(create64, create642);
                        }
                        long[] jArr4 = jArr;
                        create64[i9] = jArr4[i8 + i9];
                        create642[i9] = jArr4[i10 + i8 + i9];
                        i9++;
                    }
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public org.bouncycastle.math.ec.ECPoint lookup(int i7) {
                    int i8;
                    long[] create64 = org.bouncycastle.math.raw.Nat.create64(i3);
                    long[] create642 = org.bouncycastle.math.raw.Nat.create64(i3);
                    int i9 = 0;
                    for (int i10 = 0; i10 < i2; i10++) {
                        long j = ((i10 ^ i7) - 1) >> 31;
                        int i11 = 0;
                        while (true) {
                            i8 = i3;
                            if (i11 < i8) {
                                long j2 = create64[i11];
                                long[] jArr4 = jArr;
                                create64[i11] = j2 ^ (jArr4[i9 + i11] & j);
                                create642[i11] = create642[i11] ^ (jArr4[(i8 + i9) + i11] & j);
                                i11++;
                            }
                        }
                        i9 += i8 * 2;
                    }
                    return Camera2StreamConfigurationMap(create64, create642);
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public int getSize() {
                    return i2;
                }

                private org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap(long[] jArr4, long[] jArr5) {
                    return org.bouncycastle.math.ec.ECCurve.F2m.this.createRawPoint(new org.bouncycastle.math.ec.ECFieldElement.F2m(org.bouncycastle.math.ec.ECCurve.F2m.this.Camera2StreamConfigurationMap, iArr, new org.bouncycastle.math.ec.LongArray(jArr4)), new org.bouncycastle.math.ec.ECFieldElement.F2m(org.bouncycastle.math.ec.ECCurve.F2m.this.Camera2StreamConfigurationMap, iArr, new org.bouncycastle.math.ec.LongArray(jArr5)));
                }
            };
        }

        public boolean isTrinomial() {
            return this.getHighSpeedVideoFpsRanges == 0 && this.getHighResolutionOutputSizeshNQ4ISI == 0;
        }

        public int getM() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getK3() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public int getK2() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public int getK1() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECPoint getInfinity() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger) {
            return new org.bouncycastle.math.ec.ECFieldElement.F2m(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
            return new org.bouncycastle.math.ec.ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            return new org.bouncycastle.math.ec.ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new org.bouncycastle.math.ec.WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECCurve cloneCurve() {
            return new org.bouncycastle.math.ec.ECCurve.F2m(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.f7050a, this.b, this.order, this.cofactor);
        }

        public F2m(int i, int i2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        public F2m(int i, int i2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }

        protected F2m(int i, int i2, int i3, int i4, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.getHighSpeedVideoFpsRanges = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.getHighSpeedVideoSizes = new org.bouncycastle.math.ec.ECPoint.F2m(this, null, null);
            this.f7050a = eCFieldElement;
            this.b = eCFieldElement2;
            this.coord = 6;
        }

        public F2m(int i, int i2, int i3, int i4, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.getHighSpeedVideoFpsRanges = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.getHighSpeedVideoSizes = new org.bouncycastle.math.ec.ECPoint.F2m(this, null, null);
            this.f7050a = fromBigInteger(bigInteger);
            this.b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        public F2m(int i, int i2, int i3, int i4, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
    }

    public org.bouncycastle.math.ec.ECPoint validatePoint(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        org.bouncycastle.math.ec.ECPoint createPoint = createPoint(bigInteger, bigInteger2);
        if (createPoint.isValid()) {
            return createPoint;
        }
        throw new java.lang.IllegalArgumentException("Invalid point coordinates");
    }

    public org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.ECPoint eCPoint, java.lang.String str, org.bouncycastle.math.ec.PreCompCallback preCompCallback) {
        java.util.Hashtable hashtable;
        org.bouncycastle.math.ec.PreCompInfo precompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
            if (hashtable == null) {
                hashtable = new java.util.Hashtable(4);
                eCPoint.preCompTable = hashtable;
            }
        }
        synchronized (hashtable) {
            org.bouncycastle.math.ec.PreCompInfo preCompInfo = (org.bouncycastle.math.ec.PreCompInfo) hashtable.get(str);
            precompute = preCompCallback.precompute(preCompInfo);
            if (precompute != preCompInfo) {
                hashtable.put(str, precompute);
            }
        }
        return precompute;
    }

    public void normalizeAll(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, int i2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i, i2);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new java.lang.IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr = new org.bouncycastle.math.ec.ECFieldElement[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i5];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i3] = eCPoint.getZCoord(0);
                iArr[i3] = i5;
                i3++;
            }
        }
        if (i3 != 0) {
            org.bouncycastle.math.ec.ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i3, eCFieldElement);
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = iArr[i6];
                eCPointArr[i7] = eCPointArr[i7].getHighSpeedVideoFpsRangesFor(eCFieldElementArr[i6]);
            }
        }
    }

    public void normalizeAll(org.bouncycastle.math.ec.ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public org.bouncycastle.math.ec.ECPoint importPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        org.bouncycastle.math.ec.ECPoint normalize = eCPoint.normalize();
        return createPoint(normalize.getXCoord().toBigInteger(), normalize.getYCoord().toBigInteger());
    }

    public int hashCode() {
        return (getField().hashCode() ^ org.bouncycastle.util.Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ org.bouncycastle.util.Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public org.bouncycastle.math.ec.PreCompInfo getPreCompInfo(org.bouncycastle.math.ec.ECPoint eCPoint, java.lang.String str) {
        java.util.Hashtable hashtable;
        org.bouncycastle.math.ec.PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            preCompInfo = (org.bouncycastle.math.ec.PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public java.math.BigInteger getOrder() {
        return this.order;
    }

    public org.bouncycastle.math.ec.ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public org.bouncycastle.math.field.FiniteField getField() {
        return this.field;
    }

    public org.bouncycastle.math.ec.endo.ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public java.math.BigInteger getCofactor() {
        return this.cofactor;
    }

    public org.bouncycastle.math.ec.ECFieldElement getB() {
        return this.b;
    }

    public org.bouncycastle.math.ec.ECFieldElement getA() {
        return this.f7050a;
    }

    public static class Fp extends org.bouncycastle.math.ec.ECCurve.AbstractFp {
        java.math.BigInteger Camera2StreamConfigurationMap;
        java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.math.ec.ECPoint.Fp getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECPoint importPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new org.bouncycastle.math.ec.ECPoint.Fp(this, fromBigInteger(eCPoint.x.toBigInteger()), fromBigInteger(eCPoint.y.toBigInteger()), new org.bouncycastle.math.ec.ECFieldElement[]{fromBigInteger(eCPoint.zs[0].toBigInteger())});
        }

        public java.math.BigInteger getQ() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECPoint getInfinity() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.getHighResolutionOutputSizeshNQ4ISI.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger) {
            return new org.bouncycastle.math.ec.ECFieldElement.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
            return new org.bouncycastle.math.ec.ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
            return new org.bouncycastle.math.ec.ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected org.bouncycastle.math.ec.ECCurve cloneCurve() {
            return new org.bouncycastle.math.ec.ECCurve.Fp(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.f7050a, this.b, this.order, this.cofactor);
        }

        protected Fp(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
            super(bigInteger);
            this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
            this.Camera2StreamConfigurationMap = bigInteger2;
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.math.ec.ECPoint.Fp(this, null, null);
            this.f7050a = eCFieldElement;
            this.b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }

        public Fp(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5) {
            super(bigInteger);
            this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
            this.Camera2StreamConfigurationMap = org.bouncycastle.math.ec.ECFieldElement.Fp.getHighSpeedVideoFpsRangesFor(bigInteger);
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.math.ec.ECPoint.Fp(this, null, null);
            this.f7050a = fromBigInteger(bigInteger2);
            this.b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        public Fp(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }
    }

    public boolean equals(org.bouncycastle.math.ec.ECCurve eCCurve) {
        if (this != eCCurve) {
            return eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger());
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof org.bouncycastle.math.ec.ECCurve) && equals((org.bouncycastle.math.ec.ECCurve) obj);
        }
        return true;
    }

    public org.bouncycastle.math.ec.ECPoint decodePoint(byte[] bArr) {
        org.bouncycastle.math.ec.ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new java.lang.IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = decompressPoint(b & 1, org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.getHighSpeedVideoSizes(true, true)) {
                    throw new java.lang.IllegalArgumentException("Invalid point");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid point encoding 0x");
                    sb.append(java.lang.Integer.toString(b, 16));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new java.lang.IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                java.math.BigInteger fromUnsignedByteArray = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                java.math.BigInteger fromUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                if (fromUnsignedByteArray2.testBit(0) != (b == 7)) {
                    throw new java.lang.IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                infinity = validatePoint(fromUnsignedByteArray, fromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new java.lang.IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                infinity = validatePoint(org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                throw new java.lang.IllegalArgumentException("Incorrect length for infinity encoding");
            }
            infinity = getInfinity();
        }
        if (b == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new java.lang.IllegalArgumentException("Invalid infinity encoding");
    }

    public org.bouncycastle.math.ec.ECPoint createPoint(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    protected org.bouncycastle.math.ec.ECMultiplier createDefaultMultiplier() {
        org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof org.bouncycastle.math.ec.endo.GLVEndomorphism ? new org.bouncycastle.math.ec.GLVMultiplier(this, (org.bouncycastle.math.ec.endo.GLVEndomorphism) eCEndomorphism) : new org.bouncycastle.math.ec.WNafL2RMultiplier();
    }

    public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
        final int fieldSize = (getFieldSize() + 7) >>> 3;
        final byte[] bArr = new byte[i2 * fieldSize * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i4];
            byte[] byteArray = eCPoint.getRawXCoord().toBigInteger().toByteArray();
            byte[] byteArray2 = eCPoint.getRawYCoord().toBigInteger().toByteArray();
            int i5 = 1;
            int i6 = byteArray.length > fieldSize ? 1 : 0;
            int length = byteArray.length - i6;
            if (byteArray2.length <= fieldSize) {
                i5 = 0;
            }
            int length2 = byteArray2.length - i5;
            int i7 = i3 + fieldSize;
            java.lang.System.arraycopy(byteArray, i6, bArr, i7 - length, length);
            i3 = i7 + fieldSize;
            java.lang.System.arraycopy(byteArray2, i5, bArr, i3 - length2, length2);
        }
        return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.1
            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookupVar(int i8) {
                int i9 = fieldSize;
                byte[] bArr2 = new byte[i9];
                byte[] bArr3 = new byte[i9];
                int i10 = i8 * i9 * 2;
                int i11 = 0;
                while (true) {
                    int i12 = fieldSize;
                    if (i11 >= i12) {
                        return Camera2StreamConfigurationMap(bArr2, bArr3);
                    }
                    byte[] bArr4 = bArr;
                    bArr2[i11] = bArr4[i10 + i11];
                    bArr3[i11] = bArr4[i12 + i10 + i11];
                    i11++;
                }
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookup(int i8) {
                int i9;
                int i10 = fieldSize;
                byte[] bArr2 = new byte[i10];
                byte[] bArr3 = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = ((i12 ^ i8) - 1) >> 31;
                    int i14 = 0;
                    while (true) {
                        i9 = fieldSize;
                        if (i14 < i9) {
                            byte b = bArr2[i14];
                            byte[] bArr4 = bArr;
                            bArr2[i14] = (byte) (b ^ (bArr4[i11 + i14] & i13));
                            bArr3[i14] = (byte) ((bArr4[(i9 + i11) + i14] & i13) ^ bArr3[i14]);
                            i14++;
                        }
                    }
                    i11 += i9 * 2;
                }
                return Camera2StreamConfigurationMap(bArr2, bArr3);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }

            private org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap(byte[] bArr2, byte[] bArr3) {
                org.bouncycastle.math.ec.ECCurve eCCurve = org.bouncycastle.math.ec.ECCurve.this;
                return eCCurve.createRawPoint(eCCurve.fromBigInteger(new java.math.BigInteger(1, bArr2)), org.bouncycastle.math.ec.ECCurve.this.fromBigInteger(new java.math.BigInteger(1, bArr3)));
            }
        };
    }

    public class Config {
        protected int coord;
        protected org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism;
        protected org.bouncycastle.math.ec.ECMultiplier multiplier;

        public org.bouncycastle.math.ec.ECCurve.Config setMultiplier(org.bouncycastle.math.ec.ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }

        public org.bouncycastle.math.ec.ECCurve.Config setEndomorphism(org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public org.bouncycastle.math.ec.ECCurve.Config setCoordinateSystem(int i) {
            this.coord = i;
            return this;
        }

        public org.bouncycastle.math.ec.ECCurve create() {
            if (!org.bouncycastle.math.ec.ECCurve.this.supportsCoordinateSystem(this.coord)) {
                throw new java.lang.IllegalStateException("unsupported coordinate system");
            }
            org.bouncycastle.math.ec.ECCurve cloneCurve = org.bouncycastle.math.ec.ECCurve.this.cloneCurve();
            if (cloneCurve == org.bouncycastle.math.ec.ECCurve.this) {
                throw new java.lang.IllegalStateException("implementation returned current curve");
            }
            synchronized (cloneCurve) {
                cloneCurve.coord = this.coord;
                cloneCurve.endomorphism = this.endomorphism;
                cloneCurve.multiplier = this.multiplier;
            }
            return cloneCurve;
        }

        Config(int i, org.bouncycastle.math.ec.endo.ECEndomorphism eCEndomorphism, org.bouncycastle.math.ec.ECMultiplier eCMultiplier) {
            this.coord = i;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }
    }

    public org.bouncycastle.math.ec.ECCurve.Config configure() {
        org.bouncycastle.math.ec.ECCurve.Config config;
        synchronized (this) {
            config = new org.bouncycastle.math.ec.ECCurve.Config(this.coord, this.endomorphism, this.multiplier);
        }
        return config;
    }

    protected void checkPoints(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, int i2) {
        if (eCPointArr == null) {
            throw new java.lang.IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > eCPointArr.length - i2) {
            throw new java.lang.IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i3];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                throw new java.lang.IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    protected void checkPoints(org.bouncycastle.math.ec.ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    protected void checkPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new java.lang.IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    protected ECCurve(org.bouncycastle.math.field.FiniteField finiteField) {
        this.field = finiteField;
    }
}
