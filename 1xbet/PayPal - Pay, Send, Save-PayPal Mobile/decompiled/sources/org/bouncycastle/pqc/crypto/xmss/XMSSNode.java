package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSNode implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final byte[] Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoSizes;

    public final byte[] getValue() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.Camera2StreamConfigurationMap);
    }

    public final int getHeight() {
        return this.getHighSpeedVideoSizes;
    }

    protected XMSSNode(int i, byte[] bArr) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = bArr;
    }
}
