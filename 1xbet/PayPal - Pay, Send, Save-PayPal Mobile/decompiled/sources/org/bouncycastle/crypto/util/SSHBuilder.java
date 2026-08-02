package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
class SSHBuilder {
    final java.io.ByteArrayOutputStream getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();

    public final void getHighSpeedVideoFpsRanges(int i) {
        this.getHighSpeedVideoSizes.write((i >>> 24) & 255);
        this.getHighSpeedVideoSizes.write((i >>> 16) & 255);
        this.getHighSpeedVideoSizes.write((i >>> 8) & 255);
        this.getHighSpeedVideoSizes.write(i & 255);
    }

    SSHBuilder() {
    }
}
