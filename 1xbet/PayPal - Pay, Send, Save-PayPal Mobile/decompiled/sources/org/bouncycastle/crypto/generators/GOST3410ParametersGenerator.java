package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class GOST3410ParametersGenerator {
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(2);
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.GOST3410Parameters generateParameters() {
        long j;
        java.math.BigInteger add;
        java.math.BigInteger[] bigIntegerArr;
        java.lang.String str;
        java.math.BigInteger bigInteger;
        java.math.BigInteger add2;
        java.math.BigInteger[] bigIntegerArr2;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3;
        java.math.BigInteger[] bigIntegerArr3 = new java.math.BigInteger[2];
        java.lang.String str2 = "0";
        int i = 0;
        if (this.getHighSpeedVideoFpsRanges == 1) {
            int nextInt = this.getHighResolutionOutputSizeshNQ4ISI.nextInt();
            int nextInt2 = this.getHighResolutionOutputSizeshNQ4ISI.nextInt();
            int i2 = this.getHighSpeedVideoSizes;
            if (i2 == 512) {
                Camera2StreamConfigurationMap(nextInt, nextInt2, bigIntegerArr3, 512);
            } else {
                if (i2 != 1024) {
                    throw new java.lang.IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                int i3 = nextInt;
                while (true) {
                    if (i3 >= 0 && i3 <= 65536) {
                        break;
                    }
                    i3 = this.getHighResolutionOutputSizeshNQ4ISI.nextInt() / 32768;
                    i = 0;
                }
                int i4 = nextInt2;
                while (true) {
                    if (i4 >= 0 && i4 <= 65536 && i4 / 2 != 0) {
                        break;
                    }
                    i4 = (this.getHighResolutionOutputSizeshNQ4ISI.nextInt() / 32768) + 1;
                    i = 0;
                }
                java.math.BigInteger[] bigIntegerArr4 = new java.math.BigInteger[2];
                java.math.BigInteger bigInteger4 = new java.math.BigInteger(java.lang.Integer.toString(i4));
                java.math.BigInteger bigInteger5 = new java.math.BigInteger("19381");
                int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i3, i4, bigIntegerArr4, 256);
                java.math.BigInteger bigInteger6 = bigIntegerArr4[i];
                int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, i4, bigIntegerArr4, 512);
                java.math.BigInteger bigInteger7 = bigIntegerArr4[i];
                java.math.BigInteger[] bigIntegerArr5 = new java.math.BigInteger[65];
                bigIntegerArr5[i] = new java.math.BigInteger(java.lang.Integer.toString(Camera2StreamConfigurationMap3));
                loop2: while (true) {
                    int i5 = i;
                    while (i5 < 64) {
                        int i6 = i5 + 1;
                        bigIntegerArr5[i6] = bigIntegerArr5[i5].multiply(bigInteger5).add(bigInteger4).mod(getHighSpeedVideoFpsRangesFor.pow(16));
                        i5 = i6;
                    }
                    java.math.BigInteger bigInteger8 = new java.math.BigInteger("0");
                    for (int i7 = i; i7 < 64; i7++) {
                        bigInteger8 = bigInteger8.add(bigIntegerArr5[i7].multiply(getHighSpeedVideoFpsRangesFor.pow(i7 * 16)));
                    }
                    bigIntegerArr5[0] = bigIntegerArr5[64];
                    java.math.BigInteger bigInteger9 = getHighSpeedVideoFpsRangesFor;
                    java.math.BigInteger add3 = bigInteger9.pow(1023).divide(bigInteger6.multiply(bigInteger7)).add(bigInteger9.pow(1023).multiply(bigInteger8).divide(bigInteger6.multiply(bigInteger7).multiply(bigInteger9.pow(1024))));
                    java.math.BigInteger mod = add3.mod(bigInteger9);
                    java.math.BigInteger bigInteger10 = Camera2StreamConfigurationMap;
                    if (mod.compareTo(bigInteger10) == 0) {
                        add3 = add3.add(bigInteger10);
                    }
                    int i8 = 0;
                    while (true) {
                        long j2 = i8;
                        java.math.BigInteger multiply = bigInteger6.multiply(bigInteger7).multiply(add3.add(java.math.BigInteger.valueOf(j2)));
                        java.math.BigInteger bigInteger11 = Camera2StreamConfigurationMap;
                        add2 = multiply.add(bigInteger11);
                        bigIntegerArr2 = bigIntegerArr5;
                        java.math.BigInteger bigInteger12 = getHighSpeedVideoFpsRangesFor;
                        bigInteger2 = bigInteger5;
                        bigInteger3 = bigInteger4;
                        if (add2.compareTo(bigInteger12.pow(1024)) != 1) {
                            if (bigInteger12.modPow(bigInteger6.multiply(bigInteger7).multiply(add3.add(java.math.BigInteger.valueOf(j2))), add2).compareTo(bigInteger11) == 0 && bigInteger12.modPow(bigInteger6.multiply(add3.add(java.math.BigInteger.valueOf(j2))), add2).compareTo(bigInteger11) != 0) {
                                break loop2;
                            }
                            i8 += 2;
                            bigIntegerArr5 = bigIntegerArr2;
                            bigInteger5 = bigInteger2;
                            bigInteger4 = bigInteger3;
                        }
                    }
                    bigIntegerArr5 = bigIntegerArr2;
                    bigInteger5 = bigInteger2;
                    bigInteger4 = bigInteger3;
                    i = 0;
                }
                bigIntegerArr3[0] = add2;
                bigIntegerArr3[1] = bigInteger6;
            }
            java.math.BigInteger bigInteger13 = bigIntegerArr3[0];
            java.math.BigInteger bigInteger14 = bigIntegerArr3[1];
            return new org.bouncycastle.crypto.params.GOST3410Parameters(bigInteger13, bigInteger14, Camera2StreamConfigurationMap(bigInteger13, bigInteger14), new org.bouncycastle.crypto.params.GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = this.getHighResolutionOutputSizeshNQ4ISI.nextLong();
        long nextLong2 = this.getHighResolutionOutputSizeshNQ4ISI.nextLong();
        int i9 = this.getHighSpeedVideoSizes;
        if (i9 == 512) {
            j = nextLong2;
            getHighSpeedVideoSizes(nextLong, j, bigIntegerArr3, 512);
        } else {
            if (i9 != 1024) {
                throw new java.lang.IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            long j3 = nextLong;
            while (true) {
                if (j3 >= 0 && j3 <= 4294967296L) {
                    break;
                }
                j3 = this.getHighResolutionOutputSizeshNQ4ISI.nextInt() * 2;
                nextLong2 = nextLong2;
                str2 = str2;
            }
            long j4 = nextLong2;
            while (true) {
                if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                    break;
                }
                j4 = (this.getHighResolutionOutputSizeshNQ4ISI.nextInt() * 2) + 1;
                nextLong2 = nextLong2;
                str2 = str2;
            }
            java.math.BigInteger[] bigIntegerArr6 = new java.math.BigInteger[2];
            java.math.BigInteger bigInteger15 = new java.math.BigInteger(java.lang.Long.toString(j4));
            j = nextLong2;
            java.math.BigInteger bigInteger16 = new java.math.BigInteger("97781173");
            long j5 = j4;
            long highSpeedVideoSizes = getHighSpeedVideoSizes(j3, j5, bigIntegerArr6, 256);
            java.math.BigInteger bigInteger17 = bigIntegerArr6[0];
            long highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoSizes, j5, bigIntegerArr6, 512);
            java.math.BigInteger bigInteger18 = bigIntegerArr6[0];
            java.math.BigInteger[] bigIntegerArr7 = new java.math.BigInteger[33];
            bigIntegerArr7[0] = new java.math.BigInteger(java.lang.Long.toString(highSpeedVideoSizes2));
            loop8: while (true) {
                int i10 = 0;
                while (i10 < 32) {
                    int i11 = i10 + 1;
                    bigIntegerArr7[i11] = bigIntegerArr7[i10].multiply(bigInteger16).add(bigInteger15).mod(getHighSpeedVideoFpsRangesFor.pow(32));
                    i10 = i11;
                }
                java.math.BigInteger bigInteger19 = new java.math.BigInteger(str2);
                for (int i12 = 0; i12 < 32; i12++) {
                    bigInteger19 = bigInteger19.add(bigIntegerArr7[i12].multiply(getHighSpeedVideoFpsRangesFor.pow(i12 * 32)));
                }
                bigIntegerArr7[0] = bigIntegerArr7[32];
                java.math.BigInteger bigInteger20 = getHighSpeedVideoFpsRangesFor;
                java.math.BigInteger add4 = bigInteger20.pow(1023).divide(bigInteger17.multiply(bigInteger18)).add(bigInteger20.pow(1023).multiply(bigInteger19).divide(bigInteger17.multiply(bigInteger18).multiply(bigInteger20.pow(1024))));
                java.math.BigInteger mod2 = add4.mod(bigInteger20);
                java.math.BigInteger bigInteger21 = Camera2StreamConfigurationMap;
                if (mod2.compareTo(bigInteger21) == 0) {
                    add4 = add4.add(bigInteger21);
                }
                int i13 = 0;
                while (true) {
                    long j6 = i13;
                    java.math.BigInteger multiply2 = bigInteger17.multiply(bigInteger18).multiply(add4.add(java.math.BigInteger.valueOf(j6)));
                    java.math.BigInteger bigInteger22 = Camera2StreamConfigurationMap;
                    add = multiply2.add(bigInteger22);
                    bigIntegerArr = bigIntegerArr7;
                    java.math.BigInteger bigInteger23 = getHighSpeedVideoFpsRangesFor;
                    str = str2;
                    bigInteger = bigInteger16;
                    if (add.compareTo(bigInteger23.pow(1024)) != 1) {
                        if (bigInteger23.modPow(bigInteger17.multiply(bigInteger18).multiply(add4.add(java.math.BigInteger.valueOf(j6))), add).compareTo(bigInteger22) == 0 && bigInteger23.modPow(bigInteger17.multiply(add4.add(java.math.BigInteger.valueOf(j6))), add).compareTo(bigInteger22) != 0) {
                            break loop8;
                        }
                        i13 += 2;
                        bigInteger16 = bigInteger;
                        bigIntegerArr7 = bigIntegerArr;
                        str2 = str;
                    }
                }
                bigInteger16 = bigInteger;
                bigIntegerArr7 = bigIntegerArr;
                str2 = str;
            }
            bigIntegerArr3[0] = add;
            bigIntegerArr3[1] = bigInteger17;
        }
        java.math.BigInteger bigInteger24 = bigIntegerArr3[0];
        java.math.BigInteger bigInteger25 = bigIntegerArr3[1];
        return new org.bouncycastle.crypto.params.GOST3410Parameters(bigInteger24, bigInteger25, Camera2StreamConfigurationMap(bigInteger24, bigInteger25), new org.bouncycastle.crypto.params.GOST3410ValidationParameters(nextLong, j));
    }

    public void init(int i, int i2, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
    }

    private java.math.BigInteger Camera2StreamConfigurationMap(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger subtract = bigInteger.subtract(Camera2StreamConfigurationMap);
        java.math.BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength, this.getHighResolutionOutputSizeshNQ4ISI);
            java.math.BigInteger bigInteger3 = Camera2StreamConfigurationMap;
            if (createRandomBigInteger.compareTo(bigInteger3) > 0 && createRandomBigInteger.compareTo(subtract) < 0) {
                java.math.BigInteger modPow = createRandomBigInteger.modPow(divide, bigInteger);
                if (modPow.compareTo(bigInteger3) != 0) {
                    return modPow;
                }
            }
        }
    }

    private long getHighSpeedVideoSizes(long j, long j2, java.math.BigInteger[] bigIntegerArr, int i) {
        java.math.BigInteger bigInteger;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3;
        int i2;
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = this.getHighResolutionOutputSizeshNQ4ISI.nextInt() * 2;
        }
        long j4 = j2;
        while (true) {
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            j4 = (this.getHighResolutionOutputSizeshNQ4ISI.nextInt() * 2) + 1;
        }
        java.math.BigInteger bigInteger4 = new java.math.BigInteger(java.lang.Long.toString(j4));
        java.math.BigInteger bigInteger5 = new java.math.BigInteger("97781173");
        java.math.BigInteger[] bigIntegerArr2 = {new java.math.BigInteger(java.lang.Long.toString(j3))};
        int[] iArr = {i};
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (iArr[i4] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, length);
            i5 = i4 + 1;
            iArr[i5] = iArr[i4] / 2;
            i4 = i5;
        }
        java.math.BigInteger[] bigIntegerArr3 = new java.math.BigInteger[i5 + 1];
        bigIntegerArr3[i5] = new java.math.BigInteger("8000000B", 16);
        int i6 = i5 - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= i5) {
                bigInteger = bigIntegerArr2[i3];
                break;
            }
            int i8 = 32;
            int i9 = iArr[i6] / 32;
            while (true) {
                int length2 = bigIntegerArr2.length;
                java.math.BigInteger[] bigIntegerArr4 = new java.math.BigInteger[length2];
                java.lang.System.arraycopy(bigIntegerArr2, i3, bigIntegerArr4, i3, bigIntegerArr2.length);
                bigIntegerArr2 = new java.math.BigInteger[i9 + 1];
                java.lang.System.arraycopy(bigIntegerArr4, i3, bigIntegerArr2, i3, length2);
                int i10 = i3;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    bigIntegerArr2[i11] = bigIntegerArr2[i10].multiply(bigInteger5).add(bigInteger4).mod(getHighSpeedVideoFpsRangesFor.pow(i8));
                    i10 = i11;
                }
                java.math.BigInteger bigInteger6 = new java.math.BigInteger("0");
                for (int i12 = i3; i12 < i9; i12++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i12].multiply(getHighSpeedVideoFpsRangesFor.pow(i12 * 32)));
                }
                bigIntegerArr2[i3] = bigIntegerArr2[i9];
                java.math.BigInteger bigInteger7 = getHighSpeedVideoFpsRangesFor;
                int i13 = i6 + 1;
                java.math.BigInteger add = bigInteger7.pow(iArr[i6] - 1).divide(bigIntegerArr3[i13]).add(bigInteger7.pow(iArr[i6] - 1).multiply(bigInteger6).divide(bigIntegerArr3[i13].multiply(bigInteger7.pow(i9 * 32))));
                java.math.BigInteger mod = add.mod(bigInteger7);
                java.math.BigInteger bigInteger8 = Camera2StreamConfigurationMap;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                int i14 = 0;
                while (true) {
                    long j5 = i14;
                    bigInteger2 = bigInteger4;
                    java.math.BigInteger multiply = bigIntegerArr3[i13].multiply(add.add(java.math.BigInteger.valueOf(j5)));
                    java.math.BigInteger bigInteger9 = Camera2StreamConfigurationMap;
                    java.math.BigInteger add2 = multiply.add(bigInteger9);
                    bigIntegerArr3[i6] = add2;
                    bigInteger3 = bigInteger5;
                    java.math.BigInteger bigInteger10 = getHighSpeedVideoFpsRangesFor;
                    i2 = i5;
                    if (add2.compareTo(bigInteger10.pow(iArr[i6])) != 1) {
                        if (bigInteger10.modPow(bigIntegerArr3[i13].multiply(add.add(java.math.BigInteger.valueOf(j5))), bigIntegerArr3[i6]).compareTo(bigInteger9) == 0 && bigInteger10.modPow(add.add(java.math.BigInteger.valueOf(j5)), bigIntegerArr3[i6]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i14 += 2;
                        bigInteger4 = bigInteger2;
                        i5 = i2;
                        bigInteger5 = bigInteger3;
                    }
                }
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                i3 = 0;
                i8 = 32;
                i5 = i2;
            }
            i6--;
            if (i6 < 0) {
                bigIntegerArr[0] = bigIntegerArr3[0];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i7++;
            bigInteger4 = bigInteger2;
            i5 = i2;
            bigInteger5 = bigInteger3;
            i3 = 0;
        }
        return bigInteger.longValue();
    }

    private int Camera2StreamConfigurationMap(int i, int i2, java.math.BigInteger[] bigIntegerArr, int i3) {
        java.math.BigInteger bigInteger;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3;
        int i4;
        int i5 = i;
        while (true) {
            if (i5 >= 0 && i5 <= 65536) {
                break;
            }
            i5 = this.getHighResolutionOutputSizeshNQ4ISI.nextInt() / 32768;
        }
        int i6 = i2;
        while (true) {
            if (i6 >= 0 && i6 <= 65536 && i6 / 2 != 0) {
                break;
            }
            i6 = (this.getHighResolutionOutputSizeshNQ4ISI.nextInt() / 32768) + 1;
        }
        java.math.BigInteger bigInteger4 = new java.math.BigInteger(java.lang.Integer.toString(i6));
        java.math.BigInteger bigInteger5 = new java.math.BigInteger("19381");
        java.math.BigInteger[] bigIntegerArr2 = {new java.math.BigInteger(java.lang.Integer.toString(i5))};
        int[] iArr = {i3};
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (iArr[i8] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, length);
            i9 = i8 + 1;
            iArr[i9] = iArr[i8] / 2;
            i8 = i9;
        }
        java.math.BigInteger[] bigIntegerArr3 = new java.math.BigInteger[i9 + 1];
        int i10 = 16;
        bigIntegerArr3[i9] = new java.math.BigInteger("8003", 16);
        int i11 = i9 - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= i9) {
                bigInteger = bigIntegerArr2[i7];
                break;
            }
            int i13 = iArr[i11] / i10;
            while (true) {
                int length2 = bigIntegerArr2.length;
                java.math.BigInteger[] bigIntegerArr4 = new java.math.BigInteger[length2];
                java.lang.System.arraycopy(bigIntegerArr2, i7, bigIntegerArr4, i7, bigIntegerArr2.length);
                bigIntegerArr2 = new java.math.BigInteger[i13 + 1];
                java.lang.System.arraycopy(bigIntegerArr4, i7, bigIntegerArr2, i7, length2);
                int i14 = i7;
                while (i14 < i13) {
                    int i15 = i14 + 1;
                    bigIntegerArr2[i15] = bigIntegerArr2[i14].multiply(bigInteger5).add(bigInteger4).mod(getHighSpeedVideoFpsRangesFor.pow(i10));
                    i14 = i15;
                }
                java.math.BigInteger bigInteger6 = new java.math.BigInteger("0");
                for (int i16 = i7; i16 < i13; i16++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i16].multiply(getHighSpeedVideoFpsRangesFor.pow(i16 * 16)));
                }
                bigIntegerArr2[i7] = bigIntegerArr2[i13];
                java.math.BigInteger bigInteger7 = getHighSpeedVideoFpsRangesFor;
                int i17 = i11 + 1;
                java.math.BigInteger add = bigInteger7.pow(iArr[i11] - 1).divide(bigIntegerArr3[i17]).add(bigInteger7.pow(iArr[i11] - 1).multiply(bigInteger6).divide(bigIntegerArr3[i17].multiply(bigInteger7.pow(i13 * 16))));
                java.math.BigInteger mod = add.mod(bigInteger7);
                java.math.BigInteger bigInteger8 = Camera2StreamConfigurationMap;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                int i18 = 0;
                while (true) {
                    long j = i18;
                    bigInteger2 = bigInteger4;
                    java.math.BigInteger multiply = bigIntegerArr3[i17].multiply(add.add(java.math.BigInteger.valueOf(j)));
                    java.math.BigInteger bigInteger9 = Camera2StreamConfigurationMap;
                    java.math.BigInteger add2 = multiply.add(bigInteger9);
                    bigIntegerArr3[i11] = add2;
                    bigInteger3 = bigInteger5;
                    java.math.BigInteger bigInteger10 = getHighSpeedVideoFpsRangesFor;
                    i4 = i9;
                    if (add2.compareTo(bigInteger10.pow(iArr[i11])) != 1) {
                        if (bigInteger10.modPow(bigIntegerArr3[i17].multiply(add.add(java.math.BigInteger.valueOf(j))), bigIntegerArr3[i11]).compareTo(bigInteger9) == 0 && bigInteger10.modPow(add.add(java.math.BigInteger.valueOf(j)), bigIntegerArr3[i11]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i18 += 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                        i9 = i4;
                    }
                }
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                i9 = i4;
                i7 = 0;
                i10 = 16;
            }
            i11--;
            if (i11 < 0) {
                bigIntegerArr[0] = bigIntegerArr3[0];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i12++;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            i9 = i4;
            i7 = 0;
            i10 = 16;
        }
        return bigInteger.intValue();
    }
}
