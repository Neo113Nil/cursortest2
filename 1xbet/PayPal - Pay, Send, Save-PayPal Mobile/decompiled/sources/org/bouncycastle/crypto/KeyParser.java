package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface KeyParser {
    org.bouncycastle.crypto.params.AsymmetricKeyParameter readKey(java.io.InputStream inputStream) throws java.io.IOException;
}
