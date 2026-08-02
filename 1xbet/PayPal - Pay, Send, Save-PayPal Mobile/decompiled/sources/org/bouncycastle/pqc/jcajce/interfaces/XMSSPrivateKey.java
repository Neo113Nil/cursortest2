package org.bouncycastle.pqc.jcajce.interfaces;

/* loaded from: classes17.dex */
public interface XMSSPrivateKey extends org.bouncycastle.pqc.jcajce.interfaces.XMSSKey, java.security.PrivateKey {
    org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey extractKeyShard(int i);

    long getIndex();

    long getUsagesRemaining();
}
