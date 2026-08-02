package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class Treehash {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private java.util.Vector getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private org.bouncycastle.crypto.Digest getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private java.util.Vector getOutputSizeshNQ4ISI;

    public boolean wasInitialized() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean wasFinished() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void updateNextSeed(org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom gMSSRandom) {
        gMSSRandom.nextSeed(this.getHighSpeedVideoSizesFor);
    }

    public void update(org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom gMSSRandom, byte[] bArr) {
        java.io.PrintStream printStream;
        java.lang.String str;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            printStream = java.lang.System.err;
            str = "No more update possible for treehash instance!";
        } else {
            if (this.Camera2StreamConfigurationMap) {
                byte[] bArr2 = new byte[this.getInputSizeshNQ4ISI.getDigestSize()];
                gMSSRandom.nextSeed(this.getInputFormats);
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = bArr;
                    this.getHighSpeedVideoSizes = 0;
                } else {
                    int i = 0;
                    while (this.getOutputMinFrameDurationlomOqCM > 0 && i == ((java.lang.Integer) this.getHighSpeedVideoFpsRangesFor.lastElement()).intValue()) {
                        int digestSize = this.getInputSizeshNQ4ISI.getDigestSize() << 1;
                        byte[] bArr3 = new byte[digestSize];
                        java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI.lastElement(), 0, bArr3, 0, this.getInputSizeshNQ4ISI.getDigestSize());
                        java.util.Vector vector = this.getOutputSizeshNQ4ISI;
                        vector.removeElementAt(vector.size() - 1);
                        java.util.Vector vector2 = this.getHighSpeedVideoFpsRangesFor;
                        vector2.removeElementAt(vector2.size() - 1);
                        java.lang.System.arraycopy(bArr, 0, bArr3, this.getInputSizeshNQ4ISI.getDigestSize(), this.getInputSizeshNQ4ISI.getDigestSize());
                        this.getInputSizeshNQ4ISI.update(bArr3, 0, digestSize);
                        bArr = new byte[this.getInputSizeshNQ4ISI.getDigestSize()];
                        this.getInputSizeshNQ4ISI.doFinal(bArr, 0);
                        i++;
                        this.getOutputMinFrameDurationlomOqCM--;
                    }
                    this.getOutputSizeshNQ4ISI.addElement(bArr);
                    this.getHighSpeedVideoFpsRangesFor.addElement(org.bouncycastle.util.Integers.valueOf(i));
                    this.getOutputMinFrameDurationlomOqCM++;
                    if (((java.lang.Integer) this.getHighSpeedVideoFpsRangesFor.lastElement()).intValue() == this.getHighSpeedVideoSizes) {
                        int digestSize2 = this.getInputSizeshNQ4ISI.getDigestSize() << 1;
                        byte[] bArr4 = new byte[digestSize2];
                        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr4, 0, this.getInputSizeshNQ4ISI.getDigestSize());
                        java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI.lastElement(), 0, bArr4, this.getInputSizeshNQ4ISI.getDigestSize(), this.getInputSizeshNQ4ISI.getDigestSize());
                        java.util.Vector vector3 = this.getOutputSizeshNQ4ISI;
                        vector3.removeElementAt(vector3.size() - 1);
                        java.util.Vector vector4 = this.getHighSpeedVideoFpsRangesFor;
                        vector4.removeElementAt(vector4.size() - 1);
                        this.getInputSizeshNQ4ISI.update(bArr4, 0, digestSize2);
                        byte[] bArr5 = new byte[this.getInputSizeshNQ4ISI.getDigestSize()];
                        this.getHighSpeedVideoFpsRanges = bArr5;
                        this.getInputSizeshNQ4ISI.doFinal(bArr5, 0);
                        this.getHighSpeedVideoSizes++;
                        this.getOutputMinFrameDurationlomOqCM = 0;
                    }
                }
                if (this.getHighSpeedVideoSizes == this.getOutputMinFrameDuration) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    return;
                }
                return;
            }
            printStream = java.lang.System.err;
            str = "Treehash instance not initialized before update";
        }
        printStream.println(str);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str = "Treehash    : ";
        for (int i = 0; i < this.getOutputMinFrameDurationlomOqCM + 6; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(getStatInt()[i]);
            sb2.append(" ");
            str = sb2.toString();
        }
        for (int i2 = 0; i2 < this.getOutputMinFrameDurationlomOqCM + 3; i2++) {
            if (getStatByte()[i2] != null) {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(getStatByte()[i2])));
                sb.append(" ");
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("null ");
            }
            str = sb.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("  ");
        sb3.append(this.getInputSizeshNQ4ISI.getDigestSize());
        return sb3.toString();
    }

    public void setFirstNode(byte[] bArr) {
        if (!this.Camera2StreamConfigurationMap) {
            initialize();
        }
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighSpeedVideoSizes = this.getOutputMinFrameDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public void initializeSeed(byte[] bArr) {
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizesFor, 0, this.getInputSizeshNQ4ISI.getDigestSize());
        this.getOutputFormats = true;
    }

    public void initialize() {
        if (!this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Seed ");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(" not initialized");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.Vector();
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = -1;
        this.Camera2StreamConfigurationMap = true;
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, this.getInputFormats, 0, this.getInputSizeshNQ4ISI.getDigestSize());
    }

    public java.util.Vector getTailStack() {
        return this.getOutputSizeshNQ4ISI;
    }

    public int[] getStatInt() {
        int i = this.getOutputMinFrameDurationlomOqCM;
        int[] iArr = new int[i + 6];
        iArr[0] = this.getOutputMinFrameDuration;
        iArr[1] = i;
        iArr[2] = this.getHighSpeedVideoSizes;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            iArr[3] = 1;
        } else {
            iArr[3] = 0;
        }
        if (this.Camera2StreamConfigurationMap) {
            iArr[4] = 1;
        } else {
            iArr[4] = 0;
        }
        if (this.getOutputFormats) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        for (int i2 = 0; i2 < this.getOutputMinFrameDurationlomOqCM; i2++) {
            iArr[i2 + 6] = ((java.lang.Integer) this.getHighSpeedVideoFpsRangesFor.elementAt(i2)).intValue();
        }
        return iArr;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getOutputMinFrameDurationlomOqCM + 3, this.getInputSizeshNQ4ISI.getDigestSize());
        bArr[0] = this.getHighSpeedVideoFpsRanges;
        bArr[1] = this.getInputFormats;
        bArr[2] = this.getHighSpeedVideoSizesFor;
        for (int i = 0; i < this.getOutputMinFrameDurationlomOqCM; i++) {
            bArr[i + 3] = (byte[]) this.getOutputSizeshNQ4ISI.elementAt(i);
        }
        return bArr;
    }

    public byte[] getSeedActive() {
        return this.getInputFormats;
    }

    public int getLowestNodeHeight() {
        return this.getHighSpeedVideoFpsRanges == null ? this.getOutputMinFrameDuration : this.getOutputMinFrameDurationlomOqCM == 0 ? this.getHighSpeedVideoSizes : java.lang.Math.min(this.getHighSpeedVideoSizes, ((java.lang.Integer) this.getHighSpeedVideoFpsRangesFor.lastElement()).intValue());
    }

    public int getFirstNodeHeight() {
        return this.getHighSpeedVideoFpsRanges == null ? this.getOutputMinFrameDuration : this.getHighSpeedVideoSizes;
    }

    public byte[] getFirstNode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void destroy() {
        this.Camera2StreamConfigurationMap = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoSizes = -1;
    }

    public Treehash(org.bouncycastle.crypto.Digest digest, byte[][] bArr, int[] iArr) {
        this.getInputSizeshNQ4ISI = digest;
        this.getOutputMinFrameDuration = iArr[0];
        this.getOutputMinFrameDurationlomOqCM = iArr[1];
        this.getHighSpeedVideoSizes = iArr[2];
        if (iArr[3] == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
        if (iArr[4] == 1) {
            this.Camera2StreamConfigurationMap = true;
        } else {
            this.Camera2StreamConfigurationMap = false;
        }
        if (iArr[5] == 1) {
            this.getOutputFormats = true;
        } else {
            this.getOutputFormats = false;
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.Vector();
        for (int i = 0; i < this.getOutputMinFrameDurationlomOqCM; i++) {
            this.getHighSpeedVideoFpsRangesFor.addElement(org.bouncycastle.util.Integers.valueOf(iArr[i + 6]));
        }
        this.getHighSpeedVideoFpsRanges = bArr[0];
        this.getInputFormats = bArr[1];
        this.getHighSpeedVideoSizesFor = bArr[2];
        this.getOutputSizeshNQ4ISI = new java.util.Vector();
        for (int i2 = 0; i2 < this.getOutputMinFrameDurationlomOqCM; i2++) {
            this.getOutputSizeshNQ4ISI.addElement(bArr[i2 + 3]);
        }
    }

    public Treehash(java.util.Vector vector, int i, org.bouncycastle.crypto.Digest digest) {
        this.getOutputSizeshNQ4ISI = vector;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getOutputFormats = false;
        this.getInputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoSizesFor = new byte[digest.getDigestSize()];
        this.getInputFormats = new byte[this.getInputSizeshNQ4ISI.getDigestSize()];
    }
}
