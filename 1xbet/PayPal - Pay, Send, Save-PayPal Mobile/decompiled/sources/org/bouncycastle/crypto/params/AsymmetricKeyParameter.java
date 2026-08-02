package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class AsymmetricKeyParameter implements org.bouncycastle.crypto.CipherParameters {
    boolean getHighSpeedVideoSizes;

    public boolean isPrivate() {
        return this.getHighSpeedVideoSizes;
    }

    public AsymmetricKeyParameter(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }
}
