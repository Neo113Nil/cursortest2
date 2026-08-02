package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSRootCalc {
    private byte[][] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Vector getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int[] getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private int getOutputMinFrameDuration;
    private org.bouncycastle.crypto.Digest getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private java.util.Vector[] getOutputSizeshNQ4ISI;
    private java.util.Vector getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private org.bouncycastle.pqc.crypto.gmss.Treehash[] isOutputSupportedFor;

    public boolean wasInitialized() {
        return this.getInputSizeshNQ4ISI;
    }

    public boolean wasFinished() {
        return this.getOutputFormats;
    }

    public void update(byte[] bArr, byte[] bArr2) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i < this.getHighSpeedVideoSizesFor - this.getHighSpeedVideoSizes && this.getOutputMinFrameDuration - 2 == this.getInputFormats[0]) {
            initializeTreehashSeed(bArr, i);
            this.getHighResolutionOutputSizeshNQ4ISI++;
            this.getOutputMinFrameDuration *= 2;
        }
        update(bArr2);
    }

    public void update(byte[] bArr) {
        if (this.getOutputFormats) {
            java.lang.System.out.print("Too much updates for Tree!!");
            return;
        }
        if (!this.getInputSizeshNQ4ISI) {
            java.lang.System.err.println("GMSSRootCalc not initialized!");
            return;
        }
        int[] iArr = this.getInputFormats;
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == 1) {
            java.lang.System.arraycopy(bArr, 0, this.Camera2StreamConfigurationMap[0], 0, this.getOutputStallDurationlomOqCM);
        } else if (i == 3 && this.getHighSpeedVideoSizesFor > this.getHighSpeedVideoSizes) {
            this.isOutputSupportedFor[0].setFirstNode(bArr);
        }
        int i2 = this.getInputFormats[0];
        if ((i2 - 3) % 2 == 0 && i2 >= 3 && this.getHighSpeedVideoSizesFor == this.getHighSpeedVideoSizes) {
            this.getOutputSizeshNQ4ISI[0].insertElementAt(bArr, 0);
        }
        if (this.getInputFormats[0] == 0) {
            this.getOutputStallDuration.addElement(bArr);
            this.getHighSpeedVideoFpsRanges.addElement(org.bouncycastle.util.Integers.valueOf(0));
            return;
        }
        int i3 = this.getOutputStallDurationlomOqCM;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 << 1;
        byte[] bArr3 = new byte[i4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i3);
        int i5 = 0;
        while (this.getOutputStallDuration.size() > 0 && i5 == ((java.lang.Integer) this.getHighSpeedVideoFpsRanges.lastElement()).intValue()) {
            java.lang.System.arraycopy(this.getOutputStallDuration.lastElement(), 0, bArr3, 0, this.getOutputStallDurationlomOqCM);
            java.util.Vector vector = this.getOutputStallDuration;
            vector.removeElementAt(vector.size() - 1);
            java.util.Vector vector2 = this.getHighSpeedVideoFpsRanges;
            vector2.removeElementAt(vector2.size() - 1);
            int i6 = this.getOutputStallDurationlomOqCM;
            java.lang.System.arraycopy(bArr2, 0, bArr3, i6, i6);
            this.getOutputMinFrameDurationlomOqCM.update(bArr3, 0, i4);
            bArr2 = new byte[this.getOutputMinFrameDurationlomOqCM.getDigestSize()];
            this.getOutputMinFrameDurationlomOqCM.doFinal(bArr2, 0);
            i5++;
            if (i5 < this.getHighSpeedVideoSizesFor) {
                int[] iArr2 = this.getInputFormats;
                int i7 = iArr2[i5] + 1;
                iArr2[i5] = i7;
                if (i7 == 1) {
                    java.lang.System.arraycopy(bArr2, 0, this.Camera2StreamConfigurationMap[i5], 0, this.getOutputStallDurationlomOqCM);
                }
                if (i5 >= this.getHighSpeedVideoSizesFor - this.getHighSpeedVideoSizes) {
                    if (i5 == 0) {
                        java.lang.System.out.println("M���P");
                    }
                    int i8 = this.getInputFormats[i5];
                    if ((i8 - 3) % 2 == 0 && i8 >= 3) {
                        this.getOutputSizeshNQ4ISI[i5 - (this.getHighSpeedVideoSizesFor - this.getHighSpeedVideoSizes)].insertElementAt(bArr2, 0);
                    }
                } else if (this.getInputFormats[i5] == 3) {
                    this.isOutputSupportedFor[i5].setFirstNode(bArr2);
                }
            }
        }
        this.getOutputStallDuration.addElement(bArr2);
        this.getHighSpeedVideoFpsRanges.addElement(org.bouncycastle.util.Integers.valueOf(i5));
        if (i5 == this.getHighSpeedVideoSizesFor) {
            this.getOutputFormats = true;
            this.getInputSizeshNQ4ISI = false;
            this.getOutputSizes = (byte[]) this.getOutputStallDuration.lastElement();
        }
    }

    public java.lang.String toString() {
        java.util.Vector vector = this.getOutputStallDuration;
        int size = vector == null ? 0 : vector.size();
        java.lang.String str = "";
        for (int i = 0; i < this.getHighSpeedVideoSizesFor + 8 + size; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(getStatInt()[i]);
            sb.append(" ");
            str = sb.toString();
        }
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizesFor + 1 + size; i2++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(getStatByte()[i2])));
            sb2.append(" ");
            str = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("  ");
        sb3.append(this.getHighSpeedVideoFpsRangesFor.get().getDigestSize());
        return sb3.toString();
    }

    public void initializeTreehashSeed(byte[] bArr, int i) {
        this.isOutputSupportedFor[i].initializeSeed(bArr);
    }

    public void initialize(java.util.Vector vector) {
        int i;
        this.isOutputSupportedFor = new org.bouncycastle.pqc.crypto.gmss.Treehash[this.getHighSpeedVideoSizesFor - this.getHighSpeedVideoSizes];
        int i2 = 0;
        while (true) {
            i = this.getHighSpeedVideoSizesFor;
            if (i2 >= i - this.getHighSpeedVideoSizes) {
                break;
            }
            this.isOutputSupportedFor[i2] = new org.bouncycastle.pqc.crypto.gmss.Treehash(vector, i2, this.getHighSpeedVideoFpsRangesFor.get());
            i2++;
        }
        this.getInputFormats = new int[i];
        this.Camera2StreamConfigurationMap = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i, this.getOutputStallDurationlomOqCM);
        this.getOutputSizes = new byte[this.getOutputStallDurationlomOqCM];
        this.getOutputStallDuration = new java.util.Vector();
        this.getHighSpeedVideoFpsRanges = new java.util.Vector();
        this.getInputSizeshNQ4ISI = true;
        this.getOutputFormats = false;
        for (int i3 = 0; i3 < this.getHighSpeedVideoSizesFor; i3++) {
            this.getInputFormats[i3] = -1;
        }
        this.getOutputSizeshNQ4ISI = new java.util.Vector[this.getHighSpeedVideoSizes - 1];
        for (int i4 = 0; i4 < this.getHighSpeedVideoSizes - 1; i4++) {
            this.getOutputSizeshNQ4ISI[i4] = new java.util.Vector();
        }
        this.getOutputMinFrameDuration = 3;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public org.bouncycastle.pqc.crypto.gmss.Treehash[] getTreehash() {
        return org.bouncycastle.pqc.crypto.gmss.GMSSUtils.getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor);
    }

    public int[] getStatInt() {
        java.util.Vector vector = this.getOutputStallDuration;
        int size = vector == null ? 0 : vector.size();
        int i = this.getHighSpeedVideoSizesFor;
        int[] iArr = new int[i + 8 + size];
        iArr[0] = i;
        iArr[1] = this.getOutputStallDurationlomOqCM;
        iArr[2] = this.getHighSpeedVideoSizes;
        iArr[3] = this.getOutputMinFrameDuration;
        iArr[4] = this.getHighResolutionOutputSizeshNQ4ISI;
        if (this.getOutputFormats) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.getInputSizeshNQ4ISI) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizesFor; i2++) {
            iArr[i2 + 8] = this.getInputFormats[i2];
        }
        for (int i3 = 0; i3 < size; i3++) {
            iArr[this.getHighSpeedVideoSizesFor + 8 + i3] = ((java.lang.Integer) this.getHighSpeedVideoFpsRanges.elementAt(i3)).intValue();
        }
        return iArr;
    }

    public byte[][] getStatByte() {
        java.util.Vector vector = this.getOutputStallDuration;
        int size = vector == null ? 0 : vector.size();
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getHighSpeedVideoSizesFor + 1 + size, 64);
        bArr[0] = this.getOutputSizes;
        int i = 0;
        while (i < this.getHighSpeedVideoSizesFor) {
            int i2 = i + 1;
            bArr[i2] = this.Camera2StreamConfigurationMap[i];
            i = i2;
        }
        for (int i3 = 0; i3 < size; i3++) {
            bArr[this.getHighSpeedVideoSizesFor + 1 + i3] = (byte[]) this.getOutputStallDuration.elementAt(i3);
        }
        return bArr;
    }

    public java.util.Vector getStack() {
        java.util.Vector vector = new java.util.Vector();
        java.util.Enumeration elements = this.getOutputStallDuration.elements();
        while (elements.hasMoreElements()) {
            vector.addElement(elements.nextElement());
        }
        return vector;
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputSizes);
    }

    public java.util.Vector[] getRetain() {
        return org.bouncycastle.pqc.crypto.gmss.GMSSUtils.getHighResolutionOutputSizeshNQ4ISI(this.getOutputSizeshNQ4ISI);
    }

    public byte[][] getAuthPath() {
        return org.bouncycastle.pqc.crypto.gmss.GMSSUtils.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    public GMSSRootCalc(int i, int i2, org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider gMSSDigestProvider) {
        this.getHighSpeedVideoSizesFor = i;
        this.getHighSpeedVideoFpsRangesFor = gMSSDigestProvider;
        org.bouncycastle.crypto.Digest digest = gMSSDigestProvider.get();
        this.getOutputMinFrameDurationlomOqCM = digest;
        int digestSize = digest.getDigestSize();
        this.getOutputStallDurationlomOqCM = digestSize;
        this.getHighSpeedVideoSizes = i2;
        this.getInputFormats = new int[i];
        this.Camera2StreamConfigurationMap = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i, digestSize);
        this.getOutputSizes = new byte[this.getOutputStallDurationlomOqCM];
        this.getOutputSizeshNQ4ISI = new java.util.Vector[this.getHighSpeedVideoSizes - 1];
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            this.getOutputSizeshNQ4ISI[i3] = new java.util.Vector();
        }
    }
}
