package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public interface LMSContextBasedVerifier {
    org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext(byte[] bArr);

    boolean verify(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext);
}
