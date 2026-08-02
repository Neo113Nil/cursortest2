package org.bouncycastle.est;

/* loaded from: classes17.dex */
public interface ESTSourceConnectionListener<T, I> {
    org.bouncycastle.est.ESTRequest onConnection(org.bouncycastle.est.Source<T> source, org.bouncycastle.est.ESTRequest eSTRequest) throws java.io.IOException;
}
