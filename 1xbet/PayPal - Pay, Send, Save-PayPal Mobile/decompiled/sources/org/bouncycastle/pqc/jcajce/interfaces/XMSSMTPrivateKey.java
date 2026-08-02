package org.bouncycastle.pqc.jcajce.interfaces;

/* loaded from: classes17.dex */
public interface XMSSMTPrivateKey extends org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey, java.security.PrivateKey {
    org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey extractKeyShard(int i);

    long getIndex();

    long getUsagesRemaining();
}
