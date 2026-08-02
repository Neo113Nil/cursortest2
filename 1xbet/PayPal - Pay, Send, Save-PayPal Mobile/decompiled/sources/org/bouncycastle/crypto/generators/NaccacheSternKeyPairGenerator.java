package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class NaccacheSternKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private static int[] Camera2StreamConfigurationMap = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 149, 151, 157, 163, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 179, 181, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 193, 197, 199, 211, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 227, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 239, 241, 251, 257, 263, 269, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, 307, 311, 313, 317, com.visa.cbp.getCertUsage.getAucAID, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL, 523, 541, 547, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS};
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        java.math.BigInteger createRandomPrime;
        java.math.BigInteger createRandomPrime2;
        java.math.BigInteger createRandomPrime3;
        java.math.BigInteger add;
        int i;
        java.security.SecureRandom secureRandom;
        java.math.BigInteger bigInteger;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3;
        java.math.BigInteger createRandomPrime4;
        java.math.BigInteger bigInteger4;
        java.math.BigInteger add2;
        java.math.BigInteger bigInteger5;
        java.math.BigInteger bigInteger6;
        long j;
        java.math.BigInteger bigInteger7;
        java.math.BigInteger bigInteger8;
        java.math.BigInteger bigInteger9;
        java.math.BigInteger bigInteger10;
        java.io.PrintStream printStream;
        java.lang.StringBuilder sb;
        java.io.PrintStream printStream2;
        java.lang.StringBuilder sb2;
        java.math.BigInteger bigInteger11;
        java.math.BigInteger createRandomPrime5;
        int i2;
        java.security.SecureRandom secureRandom2;
        int nextInt;
        int i3;
        int i4;
        int strength = this.getHighResolutionOutputSizeshNQ4ISI.getStrength();
        java.security.SecureRandom random = this.getHighResolutionOutputSizeshNQ4ISI.getRandom();
        int certainty = this.getHighResolutionOutputSizeshNQ4ISI.getCertainty();
        boolean isDebug = this.getHighResolutionOutputSizeshNQ4ISI.isDebug();
        if (isDebug) {
            java.io.PrintStream printStream3 = java.lang.System.out;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Fetching first ");
            sb3.append(this.getHighResolutionOutputSizeshNQ4ISI.getCntSmallPrimes());
            sb3.append(" primes.");
            printStream3.println(sb3.toString());
        }
        int cntSmallPrimes = this.getHighResolutionOutputSizeshNQ4ISI.getCntSmallPrimes();
        java.util.Vector vector = new java.util.Vector(cntSmallPrimes);
        for (int i5 = 0; i5 != cntSmallPrimes; i5++) {
            vector.addElement(java.math.BigInteger.valueOf(Camera2StreamConfigurationMap[i5]));
        }
        java.util.Vector vector2 = new java.util.Vector();
        java.util.Vector vector3 = new java.util.Vector();
        for (int i6 = 0; i6 < vector.size(); i6++) {
            vector3.addElement(vector.elementAt(i6));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                break;
            }
            java.lang.Object elementAt = vector3.elementAt(0);
            int size = vector2.size();
            int i7 = size + 1;
            if (((-i7) & i7) == i7) {
                i4 = (int) ((i7 * (random.nextInt() & Integer.MAX_VALUE)) >> 31);
            } else {
                do {
                    nextInt = random.nextInt() & Integer.MAX_VALUE;
                    i3 = nextInt % i7;
                } while ((nextInt - i3) + size < 0);
                i4 = i3;
            }
            vector2.insertElementAt(elementAt, i4);
        }
        java.math.BigInteger bigInteger12 = getHighSpeedVideoFpsRanges;
        java.math.BigInteger bigInteger13 = bigInteger12;
        for (int i8 = 0; i8 < vector2.size() / 2; i8++) {
            bigInteger13 = bigInteger13.multiply((java.math.BigInteger) vector2.elementAt(i8));
        }
        for (int size2 = vector2.size() / 2; size2 < vector2.size(); size2++) {
            bigInteger12 = bigInteger12.multiply((java.math.BigInteger) vector2.elementAt(size2));
        }
        java.math.BigInteger multiply = bigInteger13.multiply(bigInteger12);
        int bitLength = (((strength - multiply.bitLength()) - 48) / 2) + 1;
        do {
            createRandomPrime = org.bouncycastle.util.BigIntegers.createRandomPrime(bitLength, certainty, random);
        } while (createRandomPrime.bitLength() != bitLength);
        do {
            createRandomPrime2 = org.bouncycastle.util.BigIntegers.createRandomPrime(bitLength, certainty, random);
        } while (createRandomPrime2.bitLength() != bitLength);
        if (isDebug) {
            java.lang.System.out.println("generating p and q");
        }
        java.math.BigInteger shiftLeft = createRandomPrime.multiply(bigInteger13).shiftLeft(1);
        java.math.BigInteger shiftLeft2 = createRandomPrime2.multiply(bigInteger12).shiftLeft(1);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            j3++;
            do {
                createRandomPrime3 = org.bouncycastle.util.BigIntegers.createRandomPrime(24, certainty, random);
            } while (createRandomPrime3.bitLength() != 24);
            add = createRandomPrime3.multiply(shiftLeft).add(getHighSpeedVideoFpsRanges);
            if (add.isProbablePrime(certainty)) {
                while (true) {
                    while (true) {
                        createRandomPrime4 = org.bouncycastle.util.BigIntegers.createRandomPrime(24, certainty, random);
                        bigInteger2 = shiftLeft;
                        if (createRandomPrime4.bitLength() == 24) {
                            break;
                        }
                        shiftLeft = bigInteger2;
                    }
                    if (!createRandomPrime3.equals(createRandomPrime4)) {
                        java.math.BigInteger multiply2 = createRandomPrime4.multiply(shiftLeft2);
                        bigInteger4 = getHighSpeedVideoFpsRanges;
                        add2 = multiply2.add(bigInteger4);
                        if (add2.isProbablePrime(certainty)) {
                            break;
                        }
                    }
                    shiftLeft = bigInteger2;
                }
                bigInteger3 = shiftLeft2;
                if (multiply.gcd(createRandomPrime3.multiply(createRandomPrime4)).equals(bigInteger4)) {
                    if (add.multiply(add2).bitLength() >= strength) {
                        break;
                    }
                    if (isDebug) {
                        java.io.PrintStream printStream4 = java.lang.System.out;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("key size too small. Should be ");
                        sb4.append(strength);
                        sb4.append(" but is actually ");
                        sb4.append(add.multiply(add2).bitLength());
                        printStream4.println(sb4.toString());
                    }
                }
                i = strength;
                secureRandom = random;
                bigInteger = createRandomPrime;
            } else {
                i = strength;
                secureRandom = random;
                bigInteger = createRandomPrime;
                bigInteger2 = shiftLeft;
                bigInteger3 = shiftLeft2;
            }
            createRandomPrime = bigInteger;
            shiftLeft = bigInteger2;
            shiftLeft2 = bigInteger3;
            strength = i;
            random = secureRandom;
        }
        if (isDebug) {
            bigInteger6 = createRandomPrime2;
            java.io.PrintStream printStream5 = java.lang.System.out;
            bigInteger5 = createRandomPrime;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("needed ");
            sb5.append(j3);
            sb5.append(" tries to generate p and q.");
            printStream5.println(sb5.toString());
        } else {
            bigInteger5 = createRandomPrime;
            bigInteger6 = createRandomPrime2;
        }
        java.math.BigInteger multiply3 = add.multiply(add2);
        java.math.BigInteger multiply4 = add.subtract(bigInteger4).multiply(add2.subtract(bigInteger4));
        if (isDebug) {
            java.lang.System.out.println("generating g");
        }
        while (true) {
            java.util.Vector vector4 = new java.util.Vector();
            j = j2;
            int i9 = 0;
            while (i9 != vector2.size()) {
                java.math.BigInteger divide = multiply4.divide((java.math.BigInteger) vector2.elementAt(i9));
                while (true) {
                    j++;
                    bigInteger11 = add2;
                    createRandomPrime5 = org.bouncycastle.util.BigIntegers.createRandomPrime(strength, certainty, random);
                    i2 = strength;
                    secureRandom2 = random;
                    if (!createRandomPrime5.modPow(divide, multiply3).equals(getHighSpeedVideoFpsRanges)) {
                        break;
                    }
                    add2 = bigInteger11;
                    strength = i2;
                    random = secureRandom2;
                }
                vector4.addElement(createRandomPrime5);
                i9++;
                add2 = bigInteger11;
                strength = i2;
                random = secureRandom2;
            }
            int i10 = strength;
            java.security.SecureRandom secureRandom3 = random;
            bigInteger7 = add2;
            bigInteger8 = getHighSpeedVideoFpsRanges;
            for (int i11 = 0; i11 < vector2.size(); i11++) {
                bigInteger8 = bigInteger8.multiply(((java.math.BigInteger) vector4.elementAt(i11)).modPow(multiply.divide((java.math.BigInteger) vector2.elementAt(i11)), multiply3)).mod(multiply3);
            }
            int i12 = 0;
            while (true) {
                if (i12 >= vector2.size()) {
                    java.math.BigInteger modPow = bigInteger8.modPow(multiply4.divide(java.math.BigInteger.valueOf(4L)), multiply3);
                    java.math.BigInteger bigInteger14 = getHighSpeedVideoFpsRanges;
                    if (!modPow.equals(bigInteger14)) {
                        if (!bigInteger8.modPow(multiply4.divide(createRandomPrime3), multiply3).equals(bigInteger14)) {
                            if (!bigInteger8.modPow(multiply4.divide(createRandomPrime4), multiply3).equals(bigInteger14)) {
                                bigInteger9 = bigInteger5;
                                if (!bigInteger8.modPow(multiply4.divide(bigInteger9), multiply3).equals(bigInteger14)) {
                                    bigInteger10 = bigInteger6;
                                    if (!bigInteger8.modPow(multiply4.divide(bigInteger10), multiply3).equals(bigInteger14)) {
                                        break;
                                    }
                                    if (isDebug) {
                                        java.lang.System.out.println("g has order phi(n)/b\n g: ".concat(java.lang.String.valueOf(bigInteger8)));
                                    }
                                } else if (isDebug) {
                                    printStream = java.lang.System.out;
                                    sb = new java.lang.StringBuilder("g has order phi(n)/a\n g: ");
                                    sb.append(bigInteger8);
                                    printStream.println(sb.toString());
                                }
                            } else if (isDebug) {
                                printStream2 = java.lang.System.out;
                                sb2 = new java.lang.StringBuilder("g has order phi(n)/q'\n g: ");
                                sb = sb2;
                                printStream = printStream2;
                                bigInteger9 = bigInteger5;
                                sb.append(bigInteger8);
                                printStream.println(sb.toString());
                            }
                        } else if (isDebug) {
                            printStream2 = java.lang.System.out;
                            sb2 = new java.lang.StringBuilder("g has order phi(n)/p'\n g: ");
                            sb = sb2;
                            printStream = printStream2;
                            bigInteger9 = bigInteger5;
                            sb.append(bigInteger8);
                            printStream.println(sb.toString());
                        }
                    } else if (isDebug) {
                        printStream2 = java.lang.System.out;
                        sb2 = new java.lang.StringBuilder("g has order phi(n)/4\n g:");
                        sb = sb2;
                        printStream = printStream2;
                        bigInteger9 = bigInteger5;
                        sb.append(bigInteger8);
                        printStream.println(sb.toString());
                    }
                } else if (!bigInteger8.modPow(multiply4.divide((java.math.BigInteger) vector2.elementAt(i12)), multiply3).equals(getHighSpeedVideoFpsRanges)) {
                    i12++;
                } else if (isDebug) {
                    java.io.PrintStream printStream6 = java.lang.System.out;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("g has order phi(n)/");
                    sb6.append(vector2.elementAt(i12));
                    sb6.append("\n g: ");
                    sb6.append(bigInteger8);
                    printStream6.println(sb6.toString());
                }
            }
            bigInteger9 = bigInteger5;
            bigInteger10 = bigInteger6;
            bigInteger5 = bigInteger9;
            bigInteger6 = bigInteger10;
            j2 = j;
            add2 = bigInteger7;
            strength = i10;
            random = secureRandom3;
        }
        if (isDebug) {
            java.io.PrintStream printStream7 = java.lang.System.out;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("needed ");
            sb7.append(j);
            sb7.append(" tries to generate g");
            printStream7.println(sb7.toString());
            java.lang.System.out.println();
            java.lang.System.out.println("found new NaccacheStern cipher variables:");
            java.lang.System.out.println("smallPrimes: ".concat(java.lang.String.valueOf(vector2)));
            java.io.PrintStream printStream8 = java.lang.System.out;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("sigma:...... ");
            sb8.append(multiply);
            sb8.append(" (");
            sb8.append(multiply.bitLength());
            sb8.append(" bits)");
            printStream8.println(sb8.toString());
            java.lang.System.out.println("a:.......... ".concat(java.lang.String.valueOf(bigInteger9)));
            java.lang.System.out.println("b:.......... ".concat(java.lang.String.valueOf(bigInteger10)));
            java.lang.System.out.println("p':......... ".concat(java.lang.String.valueOf(createRandomPrime3)));
            java.lang.System.out.println("q':......... ".concat(java.lang.String.valueOf(createRandomPrime4)));
            java.lang.System.out.println("p:.......... ".concat(java.lang.String.valueOf(add)));
            java.lang.System.out.println("q:.......... ".concat(java.lang.String.valueOf(bigInteger7)));
            java.lang.System.out.println("n:.......... ".concat(java.lang.String.valueOf(multiply3)));
            java.lang.System.out.println("phi(n):..... ".concat(java.lang.String.valueOf(multiply4)));
            java.lang.System.out.println("g:.......... ".concat(java.lang.String.valueOf(bigInteger8)));
            java.lang.System.out.println();
        }
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.NaccacheSternKeyParameters(false, bigInteger8, multiply3, multiply.bitLength()), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters(bigInteger8, multiply3, multiply.bitLength(), vector2, multiply4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
