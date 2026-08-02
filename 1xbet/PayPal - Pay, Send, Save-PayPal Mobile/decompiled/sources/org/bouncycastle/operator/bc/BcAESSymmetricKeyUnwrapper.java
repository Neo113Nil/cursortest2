package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcAESSymmetricKeyUnwrapper extends org.bouncycastle.operator.bc.BcSymmetricKeyUnwrapper {
    public BcAESSymmetricKeyUnwrapper(org.bouncycastle.crypto.params.KeyParameter keyParameter) {
        super(org.bouncycastle.operator.bc.AESUtil.getHighResolutionOutputSizeshNQ4ISI(keyParameter), new org.bouncycastle.crypto.engines.AESWrapEngine(), keyParameter);
    }
}
