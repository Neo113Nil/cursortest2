package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public interface LMSContextBasedSigner {
    org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext();

    byte[] generateSignature(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext);

    long getUsagesRemaining();
}
