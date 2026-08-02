package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class NaccacheSternEngine implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private static java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(0);
    private static java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.NaccacheSternKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.util.Vector[] getInputFormats = null;
    private boolean getHighSpeedVideoSizes = false;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("NaccacheStern engine not initialised");
        }
        if (i2 > getInputBlockSize() + 1) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for Naccache-Stern cipher.\n");
        }
        if (!this.getHighSpeedVideoFpsRanges && i2 < getInputBlockSize()) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("BlockLength does not match modulus for Naccache-Stern cipher.\n");
        }
        int i3 = 0;
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (this.getHighSpeedVideoSizes) {
            java.lang.System.out.println("input as BigInteger: ".concat(java.lang.String.valueOf(bigInteger)));
        }
        if (this.getHighSpeedVideoFpsRanges) {
            return encrypt(bigInteger);
        }
        java.util.Vector vector = new java.util.Vector();
        org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        for (int i4 = 0; i4 < smallPrimes.size(); i4++) {
            java.math.BigInteger modPow = bigInteger.modPow(naccacheSternPrivateKeyParameters.getPhi_n().divide((java.math.BigInteger) smallPrimes.elementAt(i4)), naccacheSternPrivateKeyParameters.getModulus());
            java.util.Vector vector2 = this.getInputFormats[i4];
            if (vector2.size() != ((java.math.BigInteger) smallPrimes.elementAt(i4)).intValue()) {
                if (this.getHighSpeedVideoSizes) {
                    java.io.PrintStream printStream = java.lang.System.out;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Prime is ");
                    sb.append(smallPrimes.elementAt(i4));
                    sb.append(", lookup table has size ");
                    sb.append(vector2.size());
                    printStream.println(sb.toString());
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error in lookup Array for ");
                sb2.append(((java.math.BigInteger) smallPrimes.elementAt(i4)).intValue());
                sb2.append(": Size mismatch. Expected ArrayList with length ");
                sb2.append(((java.math.BigInteger) smallPrimes.elementAt(i4)).intValue());
                sb2.append(" but found ArrayList of length ");
                sb2.append(this.getInputFormats[i4].size());
                throw new org.bouncycastle.crypto.InvalidCipherTextException(sb2.toString());
            }
            int indexOf = vector2.indexOf(modPow);
            if (indexOf == -1) {
                if (this.getHighSpeedVideoSizes) {
                    java.io.PrintStream printStream2 = java.lang.System.out;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Actual prime is ");
                    sb3.append(smallPrimes.elementAt(i4));
                    printStream2.println(sb3.toString());
                    java.lang.System.out.println("Decrypted value is ".concat(java.lang.String.valueOf(modPow)));
                    java.io.PrintStream printStream3 = java.lang.System.out;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("LookupList for ");
                    sb4.append(smallPrimes.elementAt(i4));
                    sb4.append(" with size ");
                    sb4.append(this.getInputFormats[i4].size());
                    sb4.append(" is: ");
                    printStream3.println(sb4.toString());
                    while (i3 < this.getInputFormats[i4].size()) {
                        java.lang.System.out.println(this.getInputFormats[i4].elementAt(i3));
                        i3++;
                    }
                }
                throw new org.bouncycastle.crypto.InvalidCipherTextException("Lookup failed");
            }
            vector.addElement(java.math.BigInteger.valueOf(indexOf));
        }
        java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap;
        java.math.BigInteger bigInteger3 = getHighSpeedVideoFpsRangesFor;
        for (int i5 = 0; i5 < smallPrimes.size(); i5++) {
            bigInteger3 = bigInteger3.multiply((java.math.BigInteger) smallPrimes.elementAt(i5));
        }
        while (i3 < smallPrimes.size()) {
            java.math.BigInteger bigInteger4 = (java.math.BigInteger) smallPrimes.elementAt(i3);
            java.math.BigInteger divide = bigInteger3.divide(bigInteger4);
            bigInteger2 = bigInteger2.add(divide.multiply(divide.modInverse(bigInteger4)).multiply((java.math.BigInteger) vector.elementAt(i3)));
            i3++;
        }
        return bigInteger2.mod(bigInteger3).toByteArray();
    }

    public void setDebug(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public byte[] processData(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] processBlock;
        if (this.getHighSpeedVideoSizes) {
            java.lang.System.out.println();
        }
        if (bArr.length <= getInputBlockSize()) {
            if (this.getHighSpeedVideoSizes) {
                java.lang.System.out.println("data size is less then input block size, processing directly");
            }
            return processBlock(bArr, 0, bArr.length);
        }
        int inputBlockSize = getInputBlockSize();
        int outputBlockSize = getOutputBlockSize();
        if (this.getHighSpeedVideoSizes) {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input blocksize is:  ");
            sb.append(inputBlockSize);
            sb.append(" bytes");
            printStream.println(sb.toString());
            java.io.PrintStream printStream2 = java.lang.System.out;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Output blocksize is: ");
            sb2.append(outputBlockSize);
            sb2.append(" bytes");
            printStream2.println(sb2.toString());
            java.io.PrintStream printStream3 = java.lang.System.out;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Data has length:.... ");
            sb3.append(bArr.length);
            sb3.append(" bytes");
            printStream3.println(sb3.toString());
        }
        byte[] bArr2 = new byte[((bArr.length / inputBlockSize) + 1) * outputBlockSize];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + inputBlockSize;
            if (i3 < bArr.length) {
                processBlock = processBlock(bArr, i, inputBlockSize);
                i = i3;
            } else {
                processBlock = processBlock(bArr, i, bArr.length - i);
                i += bArr.length - i;
            }
            if (this.getHighSpeedVideoSizes) {
                java.lang.System.out.println("new datapos is ".concat(java.lang.String.valueOf(i)));
            }
            if (processBlock == null) {
                if (this.getHighSpeedVideoSizes) {
                    java.lang.System.out.println("cipher returned null");
                }
                throw new org.bouncycastle.crypto.InvalidCipherTextException("cipher returned null");
            }
            java.lang.System.arraycopy(processBlock, 0, bArr2, i2, processBlock.length);
            i2 += processBlock.length;
        }
        byte[] bArr3 = new byte[i2];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i2);
        if (this.getHighSpeedVideoSizes) {
            java.io.PrintStream printStream4 = java.lang.System.out;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("returning ");
            sb4.append(i2);
            sb4.append(" bytes");
            printStream4.println(sb4.toString());
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRanges = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.NaccacheSternKeyParameters) cipherParameters;
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        if (this.getHighSpeedVideoSizes) {
            java.lang.System.out.println("Constructing lookup Array");
        }
        org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        this.getInputFormats = new java.util.Vector[smallPrimes.size()];
        for (int i = 0; i < smallPrimes.size(); i++) {
            java.math.BigInteger bigInteger = (java.math.BigInteger) smallPrimes.elementAt(i);
            int intValue = bigInteger.intValue();
            this.getInputFormats[i] = new java.util.Vector();
            this.getInputFormats[i].addElement(getHighSpeedVideoFpsRangesFor);
            if (this.getHighSpeedVideoSizes) {
                java.lang.System.out.println("Constructing lookup ArrayList for ".concat(java.lang.String.valueOf(intValue)));
            }
            java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap;
            for (int i2 = 1; i2 < intValue; i2++) {
                bigInteger2 = bigInteger2.add(naccacheSternPrivateKeyParameters.getPhi_n());
                this.getInputFormats[i].addElement(naccacheSternPrivateKeyParameters.getG().modPow(bigInteger2.divide(bigInteger), naccacheSternPrivateKeyParameters.getModulus()));
            }
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.getHighSpeedVideoFpsRanges ? this.getHighResolutionOutputSizeshNQ4ISI.getModulus().toByteArray().length : ((this.getHighResolutionOutputSizeshNQ4ISI.getLowerSigmaBound() + 7) / 8) - 1;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.getHighSpeedVideoFpsRanges ? ((this.getHighResolutionOutputSizeshNQ4ISI.getLowerSigmaBound() + 7) / 8) - 1 : this.getHighResolutionOutputSizeshNQ4ISI.getModulus().toByteArray().length;
    }

    public byte[] encrypt(java.math.BigInteger bigInteger) {
        byte[] byteArray = this.getHighResolutionOutputSizeshNQ4ISI.getModulus().toByteArray();
        org.bouncycastle.util.Arrays.fill(byteArray, (byte) 0);
        byte[] byteArray2 = this.getHighResolutionOutputSizeshNQ4ISI.getG().modPow(bigInteger, this.getHighResolutionOutputSizeshNQ4ISI.getModulus()).toByteArray();
        java.lang.System.arraycopy(byteArray2, 0, byteArray, byteArray.length - byteArray2.length, byteArray2.length);
        if (this.getHighSpeedVideoSizes) {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Encrypted value is:  ");
            sb.append(new java.math.BigInteger(byteArray));
            printStream.println(sb.toString());
        }
        return byteArray;
    }

    public byte[] addCryptedBlocks(byte[] bArr, byte[] bArr2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighSpeedVideoFpsRanges) {
            if (bArr.length > getOutputBlockSize() || bArr2.length > getOutputBlockSize()) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("BlockLength too large for simple addition.\n");
            }
        } else if (bArr.length > getInputBlockSize() || bArr2.length > getInputBlockSize()) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("BlockLength too large for simple addition.\n");
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, bArr2);
        java.math.BigInteger mod = bigInteger.multiply(bigInteger2).mod(this.getHighResolutionOutputSizeshNQ4ISI.getModulus());
        if (this.getHighSpeedVideoSizes) {
            java.lang.System.out.println("c(m1) as BigInteger:....... ".concat(java.lang.String.valueOf(bigInteger)));
            java.lang.System.out.println("c(m2) as BigInteger:....... ".concat(java.lang.String.valueOf(bigInteger2)));
            java.lang.System.out.println("c(m1)*c(m2)%n = c(m1+m2)%n: ".concat(java.lang.String.valueOf(mod)));
        }
        byte[] byteArray = this.getHighResolutionOutputSizeshNQ4ISI.getModulus().toByteArray();
        org.bouncycastle.util.Arrays.fill(byteArray, (byte) 0);
        java.lang.System.arraycopy(mod.toByteArray(), 0, byteArray, byteArray.length - mod.toByteArray().length, mod.toByteArray().length);
        return byteArray;
    }
}
