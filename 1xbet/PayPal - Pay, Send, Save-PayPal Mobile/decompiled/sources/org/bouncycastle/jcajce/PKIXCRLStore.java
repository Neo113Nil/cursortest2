package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public interface PKIXCRLStore<T extends java.security.cert.CRL> extends org.bouncycastle.util.Store<T> {
    @Override // org.bouncycastle.util.Store
    java.util.Collection<T> getMatches(org.bouncycastle.util.Selector<T> selector) throws org.bouncycastle.util.StoreException;
}
