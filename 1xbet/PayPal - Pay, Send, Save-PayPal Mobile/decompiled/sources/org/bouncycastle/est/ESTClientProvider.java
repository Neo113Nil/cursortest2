package org.bouncycastle.est;

/* loaded from: classes17.dex */
public interface ESTClientProvider {
    boolean isTrusted();

    org.bouncycastle.est.ESTClient makeClient() throws org.bouncycastle.est.ESTException;
}
