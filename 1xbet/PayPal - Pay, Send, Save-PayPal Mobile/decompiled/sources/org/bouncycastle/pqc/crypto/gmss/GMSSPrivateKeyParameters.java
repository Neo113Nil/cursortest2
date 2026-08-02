package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSPrivateKeyParameters extends org.bouncycastle.pqc.crypto.gmss.GMSSKeyParameters {
    private java.util.Vector[] ArtificialStackFrames;
    private java.util.Vector[][] Camera2StreamConfigurationMap;
    private byte[][] CoroutineDebuggingKt;
    private org.bouncycastle.pqc.crypto.gmss.Treehash[][] _BOUNDARY;
    private int[] _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] f7053a;
    private byte[][] accessartificialFrame;
    private int[] b;
    private org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] c;
    private org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] coroutineBoundary;
    private java.util.Vector[][] coroutineCreation;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private byte[][][] getHighResolutionOutputSizeshNQ4ISI;
    private byte[][] getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoFpsRangesFor;
    private byte[][] getHighSpeedVideoSizesFor;
    private org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider getInputFormats;
    private org.bouncycastle.pqc.crypto.gmss.Treehash[][] getInputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.gmss.GMSSParameters getOutputFormats;
    private java.util.Vector[] getOutputMinFrameDuration;
    private int[] getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom getOutputSizes;
    private byte[][][] getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int[] getOutputStallDurationlomOqCM;
    private int[] getValidOutputFormatsForInputhNQ4ISI;
    private org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] isOutputSupportedFor;
    private byte[][][] isOutputSupportedForhNQ4ISI;
    private boolean kernelVersion;
    private org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] toString;
    private org.bouncycastle.crypto.Digest unwrapAs;

    private void getHighSpeedVideoFpsRanges(int i) {
        int i2;
        int i3;
        byte[] leaf;
        boolean z;
        int i4 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i == i4 - 1) {
            int[] iArr = this.getOutputMinFrameDurationlomOqCM;
            iArr[i] = iArr[i] + 1;
        }
        int[] iArr2 = this.getOutputMinFrameDurationlomOqCM;
        int i5 = iArr2[i];
        if (i5 == this._CREATION[i]) {
            if (i4 != 1) {
                if (i > 0) {
                    int i6 = i - 1;
                    iArr2[i6] = iArr2[i6] + 1;
                    int i7 = i;
                    do {
                        i7--;
                        z = this.getOutputMinFrameDurationlomOqCM[i7] >= this._CREATION[i7];
                        if (!z) {
                            break;
                        }
                    } while (i7 > 0);
                    if (!z) {
                        this.getOutputSizes.nextSeed(this.getHighSpeedVideoSizesFor[i]);
                        this.coroutineBoundary[i6].updateSign();
                        if (i > 1) {
                            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr = this.toString;
                            int i8 = i - 2;
                            gMSSLeafArr[i8] = gMSSLeafArr[i8].getHighSpeedVideoFpsRanges();
                        }
                        org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr2 = this.f7053a;
                        gMSSLeafArr2[i6] = gMSSLeafArr2[i6].getHighSpeedVideoFpsRanges();
                        if (this.getValidOutputFormatsForInputhNQ4ISI[i6] >= 0) {
                            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr3 = this.c;
                            gMSSLeafArr3[i6] = gMSSLeafArr3[i6].getHighSpeedVideoFpsRanges();
                            try {
                                this.getInputSizeshNQ4ISI[i6][this.getValidOutputFormatsForInputhNQ4ISI[i6]].update(this.getOutputSizes, this.c[i6].getLeaf());
                                this.getInputSizeshNQ4ISI[i6][this.getValidOutputFormatsForInputhNQ4ISI[i6]].wasFinished();
                            } catch (java.lang.Exception e) {
                                java.lang.System.out.println(e);
                            }
                        }
                        getHighSpeedVideoFpsRangesFor(i);
                        this.getHighSpeedVideoFpsRanges[i6] = this.coroutineBoundary[i6].getSig();
                        for (int i9 = 0; i9 < this.getOutputStallDurationlomOqCM[i] - this.getHighSpeedVideoFpsRangesFor[i]; i9++) {
                            org.bouncycastle.pqc.crypto.gmss.Treehash[] treehashArr = this.getInputSizeshNQ4ISI[i];
                            org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr2 = this._BOUNDARY;
                            treehashArr[i9] = treehashArr2[i6][i9];
                            treehashArr2[i6][i9] = this.isOutputSupportedFor[i6].getTreehash()[i9];
                        }
                        for (int i10 = 0; i10 < this.getOutputStallDurationlomOqCM[i]; i10++) {
                            java.lang.System.arraycopy(this.isOutputSupportedForhNQ4ISI[i6][i10], 0, this.getHighResolutionOutputSizeshNQ4ISI[i][i10], 0, this.getOutputStallDuration);
                            java.lang.System.arraycopy(this.isOutputSupportedFor[i6].getAuthPath()[i10], 0, this.isOutputSupportedForhNQ4ISI[i6][i10], 0, this.getOutputStallDuration);
                        }
                        for (int i11 = 0; i11 < this.getHighSpeedVideoFpsRangesFor[i] - 1; i11++) {
                            java.util.Vector[] vectorArr = this.Camera2StreamConfigurationMap[i];
                            java.util.Vector[][] vectorArr2 = this.coroutineCreation;
                            vectorArr[i11] = vectorArr2[i6][i11];
                            vectorArr2[i6][i11] = this.isOutputSupportedFor[i6].getRetain()[i11];
                        }
                        java.util.Vector[] vectorArr3 = this.getOutputMinFrameDuration;
                        java.util.Vector[] vectorArr4 = this.ArtificialStackFrames;
                        vectorArr3[i] = vectorArr4[i6];
                        vectorArr4[i6] = this.isOutputSupportedFor[i6].getStack();
                        this.accessartificialFrame[i6] = this.isOutputSupportedFor[i6].getRoot();
                        int i12 = this.getOutputStallDuration;
                        byte[] bArr = new byte[i12];
                        byte[] bArr2 = new byte[i12];
                        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor[i6], 0, bArr2, 0, i12);
                        this.getOutputSizes.nextSeed(bArr2);
                        this.getOutputSizes.nextSeed(bArr2);
                        this.coroutineBoundary[i6].initSign(this.getOutputSizes.nextSeed(bArr2), this.accessartificialFrame[i6]);
                        getHighSpeedVideoFpsRanges(i6);
                    }
                }
                this.getOutputMinFrameDurationlomOqCM[i] = 0;
                return;
            }
            return;
        }
        int i13 = this.getOutputStallDurationlomOqCM[i];
        int i14 = this.getHighSpeedVideoFpsRangesFor[i];
        int i15 = 0;
        while (true) {
            i2 = i13 - i14;
            if (i15 >= i2) {
                break;
            }
            this.getInputSizeshNQ4ISI[i][i15].updateNextSeed(this.getOutputSizes);
            i15++;
        }
        if (i5 == 0) {
            i3 = -1;
        } else {
            int i16 = 1;
            int i17 = 0;
            while (i5 % i16 == 0) {
                i16 *= 2;
                i17++;
            }
            i3 = i17 - 1;
        }
        byte[] bArr3 = new byte[this.getOutputStallDuration];
        byte[] nextSeed = this.getOutputSizes.nextSeed(this.getHighSpeedVideoSizesFor[i]);
        int i18 = (i5 >>> (i3 + 1)) & 1;
        int i19 = this.getOutputStallDuration;
        byte[] bArr4 = new byte[i19];
        int i20 = i13 - 1;
        if (i3 < i20 && i18 == 0) {
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI[i][i3], 0, bArr4, 0, i19);
        }
        int i21 = this.getOutputStallDuration;
        byte[] bArr5 = new byte[i21];
        if (i3 == 0) {
            if (i == this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1) {
                leaf = new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(nextSeed, this.getInputFormats.get(), this.b[i]).getPublicKey();
            } else {
                byte[] bArr6 = new byte[i21];
                java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor[i], 0, bArr6, 0, i21);
                this.getOutputSizes.nextSeed(bArr6);
                leaf = this.f7053a[i].getLeaf();
                this.f7053a[i].Camera2StreamConfigurationMap(bArr6);
            }
            java.lang.System.arraycopy(leaf, 0, this.getHighResolutionOutputSizeshNQ4ISI[i][0], 0, this.getOutputStallDuration);
        } else {
            int i22 = i21 << 1;
            byte[] bArr7 = new byte[i22];
            int i23 = i3 - 1;
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI[i][i23], 0, bArr7, 0, i21);
            byte[] bArr8 = this.getOutputSizeshNQ4ISI[i][i23 / 2];
            int i24 = this.getOutputStallDuration;
            java.lang.System.arraycopy(bArr8, 0, bArr7, i24, i24);
            this.unwrapAs.update(bArr7, 0, i22);
            this.getHighResolutionOutputSizeshNQ4ISI[i][i3] = new byte[this.unwrapAs.getDigestSize()];
            this.unwrapAs.doFinal(this.getHighResolutionOutputSizeshNQ4ISI[i][i3], 0);
            for (int i25 = 0; i25 < i3; i25++) {
                if (i25 < i2) {
                    if (this.getInputSizeshNQ4ISI[i][i25].wasFinished()) {
                        java.lang.System.arraycopy(this.getInputSizeshNQ4ISI[i][i25].getFirstNode(), 0, this.getHighResolutionOutputSizeshNQ4ISI[i][i25], 0, this.getOutputStallDuration);
                        this.getInputSizeshNQ4ISI[i][i25].destroy();
                    } else {
                        java.io.PrintStream printStream = java.lang.System.err;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Treehash (");
                        sb.append(i);
                        sb.append(",");
                        sb.append(i25);
                        sb.append(") not finished when needed in AuthPathComputation");
                        printStream.println(sb.toString());
                    }
                }
                if (i25 < i20 && i25 >= i2) {
                    int i26 = i25 - i2;
                    if (this.Camera2StreamConfigurationMap[i][i26].size() > 0) {
                        java.lang.System.arraycopy(this.Camera2StreamConfigurationMap[i][i26].lastElement(), 0, this.getHighResolutionOutputSizeshNQ4ISI[i][i25], 0, this.getOutputStallDuration);
                        java.util.Vector vector = this.Camera2StreamConfigurationMap[i][i26];
                        vector.removeElementAt(vector.size() - 1);
                    }
                }
                if (i25 < i2 && ((1 << i25) * 3) + i5 < this._CREATION[i]) {
                    this.getInputSizeshNQ4ISI[i][i25].initialize();
                }
            }
        }
        if (i3 < i20 && i18 == 0) {
            java.lang.System.arraycopy(bArr4, 0, this.getOutputSizeshNQ4ISI[i][i3 / 2], 0, this.getOutputStallDuration);
        }
        if (i == this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1) {
            for (int i27 = 1; i27 <= i2 / 2; i27++) {
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
                if (highResolutionOutputSizeshNQ4ISI >= 0) {
                    try {
                        byte[] bArr9 = new byte[this.getOutputStallDuration];
                        java.lang.System.arraycopy(this.getInputSizeshNQ4ISI[i][highResolutionOutputSizeshNQ4ISI].getSeedActive(), 0, bArr9, 0, this.getOutputStallDuration);
                        this.getInputSizeshNQ4ISI[i][highResolutionOutputSizeshNQ4ISI].update(this.getOutputSizes, new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(this.getOutputSizes.nextSeed(bArr9), this.getInputFormats.get(), this.b[i]).getPublicKey());
                    } catch (java.lang.Exception e2) {
                        java.lang.System.out.println(e2);
                    }
                }
            }
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI[i] = getHighResolutionOutputSizeshNQ4ISI(i);
        }
        if (i > 0) {
            if (i > 1) {
                org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr4 = this.toString;
                int i28 = i - 2;
                gMSSLeafArr4[i28] = gMSSLeafArr4[i28].getHighSpeedVideoFpsRanges();
            }
            org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr5 = this.f7053a;
            int i29 = i - 1;
            gMSSLeafArr5[i29] = gMSSLeafArr5[i29].getHighSpeedVideoFpsRanges();
            int floor = (int) java.lang.Math.floor((getNumLeafs(i) * 2) / (this.getOutputStallDurationlomOqCM[i29] - this.getHighSpeedVideoFpsRangesFor[i29]));
            int i30 = this.getOutputMinFrameDurationlomOqCM[i];
            if (i30 % floor == 1) {
                if (i30 > 1 && this.getValidOutputFormatsForInputhNQ4ISI[i29] >= 0) {
                    try {
                        this.getInputSizeshNQ4ISI[i29][this.getValidOutputFormatsForInputhNQ4ISI[i29]].update(this.getOutputSizes, this.c[i29].getLeaf());
                        this.getInputSizeshNQ4ISI[i29][this.getValidOutputFormatsForInputhNQ4ISI[i29]].wasFinished();
                    } catch (java.lang.Exception e3) {
                        java.lang.System.out.println(e3);
                    }
                }
                this.getValidOutputFormatsForInputhNQ4ISI[i29] = getHighResolutionOutputSizeshNQ4ISI(i29);
                int i31 = this.getValidOutputFormatsForInputhNQ4ISI[i29];
                if (i31 >= 0) {
                    this.c[i29] = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf(this.getInputFormats.get(), this.b[i29], floor, this.getInputSizeshNQ4ISI[i29][i31].getSeedActive());
                    org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr6 = this.c;
                    gMSSLeafArr6[i29] = gMSSLeafArr6[i29].getHighSpeedVideoFpsRanges();
                }
            } else if (this.getValidOutputFormatsForInputhNQ4ISI[i29] >= 0) {
                org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr7 = this.c;
                gMSSLeafArr7[i29] = gMSSLeafArr7[i29].getHighSpeedVideoFpsRanges();
            }
            this.coroutineBoundary[i29].updateSign();
            if (this.getOutputMinFrameDurationlomOqCM[i] == 1) {
                this.isOutputSupportedFor[i29].initialize(new java.util.Vector());
            }
            getHighSpeedVideoFpsRangesFor(i);
        }
    }

    public org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters nextKey() {
        org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.getHighSpeedVideoFpsRanges(this.getOutputFormats.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    public void markUsed() {
        this.kernelVersion = true;
    }

    public boolean isUsed() {
        return this.kernelVersion;
    }

    public byte[] getSubtreeRootSig(int i) {
        return this.getHighSpeedVideoFpsRanges[i];
    }

    public int getNumLeafs(int i) {
        return this._CREATION[i];
    }

    public org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider getName() {
        return this.getInputFormats;
    }

    public int[] getIndex() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public int getIndex(int i) {
        return this.getOutputMinFrameDurationlomOqCM[i];
    }

    public byte[][] getCurrentSeeds() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizesFor);
    }

    public byte[][][] getCurrentAuthPaths() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private void getHighSpeedVideoFpsRangesFor(int i) {
        byte[] bArr = new byte[this.getOutputStallDuration];
        int i2 = i - 1;
        byte[] nextSeed = this.getOutputSizes.nextSeed(this.CoroutineDebuggingKt[i2]);
        if (i == this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1) {
            this.isOutputSupportedFor[i2].update(this.CoroutineDebuggingKt[i2], new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(nextSeed, this.getInputFormats.get(), this.b[i]).getPublicKey());
        } else {
            this.isOutputSupportedFor[i2].update(this.CoroutineDebuggingKt[i2], this.toString[i2].getLeaf());
            this.toString[i2].Camera2StreamConfigurationMap(this.CoroutineDebuggingKt[i2]);
        }
    }

    private int getHighResolutionOutputSizeshNQ4ISI(int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.getOutputStallDurationlomOqCM[i] - this.getHighSpeedVideoFpsRangesFor[i]; i3++) {
            if (this.getInputSizeshNQ4ISI[i][i3].wasInitialized() && !this.getInputSizeshNQ4ISI[i][i3].wasFinished() && (i2 == -1 || this.getInputSizeshNQ4ISI[i][i3].getLowestNodeHeight() < this.getInputSizeshNQ4ISI[i][i2].getLowestNodeHeight())) {
                i2 = i3;
            }
        }
        return i2;
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr, org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr2, java.util.Vector[] vectorArr, java.util.Vector[] vectorArr2, java.util.Vector[][] vectorArr3, java.util.Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters, org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }

    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr, org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr2, java.util.Vector[] vectorArr, java.util.Vector[] vectorArr2, java.util.Vector[][] vectorArr3, java.util.Vector[][] vectorArr4, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr2, org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[] gMSSRootSigArr, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters, org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider gMSSDigestProvider) {
        super(true, gMSSParameters);
        this.kernelVersion = false;
        org.bouncycastle.crypto.Digest digest = gMSSDigestProvider.get();
        this.unwrapAs = digest;
        this.getOutputStallDuration = digest.getDigestSize();
        this.getOutputFormats = gMSSParameters;
        this.b = gMSSParameters.getWinternitzParameter();
        this.getHighSpeedVideoFpsRangesFor = gMSSParameters.getK();
        this.getOutputStallDurationlomOqCM = gMSSParameters.getHeightOfTrees();
        int numOfLayers = this.getOutputFormats.getNumOfLayers();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = numOfLayers;
        if (iArr == null) {
            this.getOutputMinFrameDurationlomOqCM = new int[numOfLayers];
            for (int i = 0; i < this.getARTIFICIAL_FRAME_PACKAGE_NAME; i++) {
                this.getOutputMinFrameDurationlomOqCM[i] = 0;
            }
        } else {
            this.getOutputMinFrameDurationlomOqCM = iArr;
        }
        this.getHighSpeedVideoSizesFor = bArr;
        this.CoroutineDebuggingKt = bArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr3);
        this.isOutputSupportedForhNQ4ISI = bArr4;
        if (bArr5 == null) {
            this.getOutputSizeshNQ4ISI = new byte[this.getARTIFICIAL_FRAME_PACKAGE_NAME][][];
            for (int i2 = 0; i2 < this.getARTIFICIAL_FRAME_PACKAGE_NAME; i2++) {
                this.getOutputSizeshNQ4ISI[i2] = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getOutputStallDurationlomOqCM[i2] / 2, this.getOutputStallDuration);
            }
        } else {
            this.getOutputSizeshNQ4ISI = bArr5;
        }
        if (vectorArr == null) {
            this.getOutputMinFrameDuration = new java.util.Vector[this.getARTIFICIAL_FRAME_PACKAGE_NAME];
            for (int i3 = 0; i3 < this.getARTIFICIAL_FRAME_PACKAGE_NAME; i3++) {
                this.getOutputMinFrameDuration[i3] = new java.util.Vector();
            }
        } else {
            this.getOutputMinFrameDuration = vectorArr;
        }
        if (vectorArr2 == null) {
            this.ArtificialStackFrames = new java.util.Vector[this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1];
            int i4 = 0;
            for (int i5 = 1; i4 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - i5; i5 = 1) {
                this.ArtificialStackFrames[i4] = new java.util.Vector();
                i4++;
            }
        } else {
            this.ArtificialStackFrames = vectorArr2;
        }
        this.getInputSizeshNQ4ISI = treehashArr;
        this._BOUNDARY = treehashArr2;
        this.Camera2StreamConfigurationMap = vectorArr3;
        this.coroutineCreation = vectorArr4;
        this.accessartificialFrame = bArr6;
        this.getInputFormats = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.isOutputSupportedFor = new org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc[this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1];
            int i6 = 0;
            for (int i7 = 1; i6 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - i7; i7 = 1) {
                int i8 = i6 + 1;
                this.isOutputSupportedFor[i6] = new org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc(this.getOutputStallDurationlomOqCM[i8], this.getHighSpeedVideoFpsRangesFor[i8], this.getInputFormats);
                i6 = i8;
            }
        } else {
            this.isOutputSupportedFor = gMSSRootCalcArr;
        }
        this.getHighSpeedVideoFpsRanges = bArr7;
        this._CREATION = new int[this.getARTIFICIAL_FRAME_PACKAGE_NAME];
        for (int i9 = 0; i9 < this.getARTIFICIAL_FRAME_PACKAGE_NAME; i9++) {
            this._CREATION[i9] = 1 << this.getOutputStallDurationlomOqCM[i9];
        }
        this.getOutputSizes = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(this.unwrapAs);
        int i10 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i10 <= 1) {
            this.toString = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.toString = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[i10 - 2];
            int i11 = 0;
            while (i11 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - 2) {
                int i12 = i11 + 1;
                this.toString[i11] = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf(gMSSDigestProvider.get(), this.b[i12], this._CREATION[i11 + 2], this.CoroutineDebuggingKt[i11]);
                i11 = i12;
            }
        } else {
            this.toString = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.f7053a = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1];
            int i13 = 0;
            for (int i14 = 1; i13 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - i14; i14 = 1) {
                int i15 = i13 + 1;
                this.f7053a[i13] = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf(gMSSDigestProvider.get(), this.b[i13], this._CREATION[i15], this.getHighSpeedVideoSizesFor[i13]);
                i13 = i15;
            }
        } else {
            this.f7053a = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.c = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf[this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1];
            int i16 = 0;
            for (int i17 = 1; i16 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - i17; i17 = 1) {
                int i18 = i16 + 1;
                this.c[i16] = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf(gMSSDigestProvider.get(), this.b[i16], this._CREATION[i18]);
                i16 = i18;
            }
        } else {
            this.c = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.getValidOutputFormatsForInputhNQ4ISI = new int[this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1];
            int i19 = 0;
            for (int i20 = 1; i19 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - i20; i20 = 1) {
                this.getValidOutputFormatsForInputhNQ4ISI[i19] = -1;
                i19++;
            }
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI = iArr2;
        }
        int i21 = this.getOutputStallDuration;
        byte[] bArr8 = new byte[i21];
        byte[] bArr9 = new byte[i21];
        if (gMSSRootSigArr != null) {
            this.coroutineBoundary = gMSSRootSigArr;
            return;
        }
        this.coroutineBoundary = new org.bouncycastle.pqc.crypto.gmss.GMSSRootSig[this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1];
        int i22 = 0;
        while (i22 < this.getARTIFICIAL_FRAME_PACKAGE_NAME - 1) {
            java.lang.System.arraycopy(bArr[i22], 0, bArr8, 0, this.getOutputStallDuration);
            this.getOutputSizes.nextSeed(bArr8);
            byte[] nextSeed = this.getOutputSizes.nextSeed(bArr8);
            int i23 = i22 + 1;
            this.coroutineBoundary[i22] = new org.bouncycastle.pqc.crypto.gmss.GMSSRootSig(gMSSDigestProvider.get(), this.b[i22], this.getOutputStallDurationlomOqCM[i23]);
            this.coroutineBoundary[i22].initSign(nextSeed, bArr6[i22]);
            i22 = i23;
        }
    }

    private GMSSPrivateKeyParameters(org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.kernelVersion = false;
        this.getOutputMinFrameDurationlomOqCM = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.getOutputMinFrameDurationlomOqCM);
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.getHighSpeedVideoSizesFor);
        this.CoroutineDebuggingKt = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.CoroutineDebuggingKt);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI);
        this.isOutputSupportedForhNQ4ISI = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.isOutputSupportedForhNQ4ISI);
        this.getInputSizeshNQ4ISI = gMSSPrivateKeyParameters.getInputSizeshNQ4ISI;
        this._BOUNDARY = gMSSPrivateKeyParameters._BOUNDARY;
        this.getOutputMinFrameDuration = gMSSPrivateKeyParameters.getOutputMinFrameDuration;
        this.ArtificialStackFrames = gMSSPrivateKeyParameters.ArtificialStackFrames;
        this.Camera2StreamConfigurationMap = gMSSPrivateKeyParameters.Camera2StreamConfigurationMap;
        this.coroutineCreation = gMSSPrivateKeyParameters.coroutineCreation;
        this.getOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.getOutputSizeshNQ4ISI);
        this.toString = gMSSPrivateKeyParameters.toString;
        this.f7053a = gMSSPrivateKeyParameters.f7053a;
        this.c = gMSSPrivateKeyParameters.c;
        this.getValidOutputFormatsForInputhNQ4ISI = gMSSPrivateKeyParameters.getValidOutputFormatsForInputhNQ4ISI;
        this.getOutputFormats = gMSSPrivateKeyParameters.getOutputFormats;
        this.accessartificialFrame = org.bouncycastle.util.Arrays.clone(gMSSPrivateKeyParameters.accessartificialFrame);
        this.isOutputSupportedFor = gMSSPrivateKeyParameters.isOutputSupportedFor;
        this.getHighSpeedVideoFpsRanges = gMSSPrivateKeyParameters.getHighSpeedVideoFpsRanges;
        this.coroutineBoundary = gMSSPrivateKeyParameters.coroutineBoundary;
        this.getInputFormats = gMSSPrivateKeyParameters.getInputFormats;
        this.getOutputStallDurationlomOqCM = gMSSPrivateKeyParameters.getOutputStallDurationlomOqCM;
        this.b = gMSSPrivateKeyParameters.b;
        this.getHighSpeedVideoFpsRangesFor = gMSSPrivateKeyParameters.getHighSpeedVideoFpsRangesFor;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = gMSSPrivateKeyParameters.getARTIFICIAL_FRAME_PACKAGE_NAME;
        this.unwrapAs = gMSSPrivateKeyParameters.unwrapAs;
        this.getOutputStallDuration = gMSSPrivateKeyParameters.getOutputStallDuration;
        this.getOutputSizes = gMSSPrivateKeyParameters.getOutputSizes;
        this._CREATION = gMSSPrivateKeyParameters._CREATION;
    }
}
