package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class WOTSPlus {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    final org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters getHighSpeedVideoFpsRanges;
    final org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;

    WOTSPlus(org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters wOTSPlusParameters) {
        if (wOTSPlusParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        this.getHighSpeedVideoFpsRanges = wOTSPlusParameters;
        int i = wOTSPlusParameters.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions(wOTSPlusParameters.Camera2StreamConfigurationMap, i);
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[i];
        this.getHighSpeedVideoSizes = new byte[i];
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        int i3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        if (bArr == null) {
            throw new java.lang.NullPointerException("startHash == null");
        }
        if (bArr.length != i3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("startHash needs to be ");
            sb.append(i3);
            sb.append(com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        if (oTSHashAddress.toByteArray() == null) {
            throw new java.lang.NullPointerException("otsHashAddress byte array == null");
        }
        int i4 = i + i2;
        if (i4 > this.getHighSpeedVideoFpsRanges.getOutputFormats - 1) {
            throw new java.lang.IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2 - 1, oTSHashAddress);
        org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress2 = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getHighSpeedVideoFpsRanges).withChainAddress(oTSHashAddress.Camera2StreamConfigurationMap).withHashAddress(i4 - 1).withKeyAndMask(0).build();
        byte[] highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, oTSHashAddress2.toByteArray());
        byte[] highSpeedVideoFpsRangesFor2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, ((org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.getHighSpeedVideoFpsRanges).withChainAddress(oTSHashAddress2.Camera2StreamConfigurationMap).withHashAddress(oTSHashAddress2.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(1).build()).toByteArray());
        byte[] bArr2 = new byte[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i5] = (byte) (highResolutionOutputSizeshNQ4ISI[i5] ^ highSpeedVideoFpsRangesFor2[i5]);
        }
        org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions keyedHashFunctions = this.getHighSpeedVideoFpsRangesFor;
        int length = highSpeedVideoFpsRangesFor.length;
        int i6 = keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI;
        if (length != i6) {
            throw new java.lang.IllegalArgumentException("wrong key length");
        }
        if (i3 == i6) {
            return keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI(0, highSpeedVideoFpsRangesFor, bArr2);
        }
        throw new java.lang.IllegalArgumentException("wrong in length");
    }

    private byte[] getHighSpeedVideoSizes(int i) {
        if (i < 0 || i >= this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalArgumentException("index out of bounds");
        }
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(i, 32));
    }

    final org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor][];
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor; i++) {
            oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getHighSpeedVideoFpsRanges).withChainAddress(i).withHashAddress(oTSHashAddress.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr[i] = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(i), 0, this.getHighSpeedVideoFpsRanges.getOutputFormats - 1, oTSHashAddress);
        }
        return new org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters(this.getHighSpeedVideoFpsRanges, bArr);
    }

    final org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters Camera2StreamConfigurationMap(byte[] bArr, org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature wOTSPlusSignature, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("messageDigest == null");
        }
        if (bArr.length != this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (wOTSPlusSignature == null) {
            throw new java.lang.NullPointerException("signature == null");
        }
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        java.util.List<java.lang.Integer> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr, this.getHighSpeedVideoFpsRanges.getOutputFormats, this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
        int i = 0;
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            i += (this.getHighSpeedVideoFpsRanges.getOutputFormats - 1) - Camera2StreamConfigurationMap.get(i2).intValue();
        }
        Camera2StreamConfigurationMap.addAll(Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(i << (8 - ((this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges * org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(this.getHighSpeedVideoFpsRanges.getOutputFormats)) % 8)), (int) java.lang.Math.ceil((this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges * org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(this.getHighSpeedVideoFpsRanges.getOutputFormats)) / 8.0d)), this.getHighSpeedVideoFpsRanges.getOutputFormats, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges));
        byte[][] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor][];
        for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor; i3++) {
            oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getHighSpeedVideoFpsRanges).withChainAddress(i3).withHashAddress(oTSHashAddress.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i3] = getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(wOTSPlusSignature.getHighSpeedVideoFpsRanges)[i3], Camera2StreamConfigurationMap.get(i3).intValue(), (this.getHighSpeedVideoFpsRanges.getOutputFormats - 1) - Camera2StreamConfigurationMap.get(i3).intValue(), oTSHashAddress);
        }
        return new org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters(this.getHighSpeedVideoFpsRanges, bArr2);
    }

    protected final byte[] Camera2StreamConfigurationMap(byte[] bArr, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(bArr, ((org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getHighSpeedVideoFpsRanges).build()).toByteArray());
    }

    final void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = bArr2;
    }

    final org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature getHighSpeedVideoSizes(byte[] bArr, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("messageDigest == null");
        }
        if (bArr.length != this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        java.util.List<java.lang.Integer> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr, this.getHighSpeedVideoFpsRanges.getOutputFormats, this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
        int i = 0;
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            i += (this.getHighSpeedVideoFpsRanges.getOutputFormats - 1) - Camera2StreamConfigurationMap.get(i2).intValue();
        }
        Camera2StreamConfigurationMap.addAll(Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(i << (8 - ((this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges * org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(this.getHighSpeedVideoFpsRanges.getOutputFormats)) % 8)), (int) java.lang.Math.ceil((this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges * org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(this.getHighSpeedVideoFpsRanges.getOutputFormats)) / 8.0d)), this.getHighSpeedVideoFpsRanges.getOutputFormats, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges));
        byte[][] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor][];
        for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor; i3++) {
            oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getHighSpeedVideoFpsRanges).withChainAddress(i3).withHashAddress(oTSHashAddress.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i3] = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(i3), 0, Camera2StreamConfigurationMap.get(i3).intValue(), oTSHashAddress);
        }
        return new org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature(this.getHighSpeedVideoFpsRanges, bArr2);
    }

    private static java.util.List<java.lang.Integer> Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("msg == null");
        }
        if (i != 4 && i != 16) {
            throw new java.lang.IllegalArgumentException("w needs to be 4 or 16");
        }
        int log2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(i);
        if (i2 > (bArr.length * 8) / log2) {
            throw new java.lang.IllegalArgumentException("outLength too big");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        loop0: for (int i3 : bArr) {
            for (int i4 = 8 - log2; i4 >= 0; i4 -= log2) {
                arrayList.add(java.lang.Integer.valueOf((i3 >> i4) & (i - 1)));
                if (arrayList.size() == i2) {
                    break loop0;
                }
            }
        }
        return arrayList;
    }
}
