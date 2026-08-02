package org.bouncycastle.pqc.jcajce.interfaces;

/* loaded from: classes17.dex */
public interface LMSPrivateKey extends org.bouncycastle.pqc.jcajce.interfaces.LMSKey, java.security.PrivateKey {
    org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey extractKeyShard(int i);

    long getIndex();

    long getUsagesRemaining();
}
