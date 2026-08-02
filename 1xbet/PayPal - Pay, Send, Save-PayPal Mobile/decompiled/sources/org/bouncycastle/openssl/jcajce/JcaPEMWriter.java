package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcaPEMWriter extends org.bouncycastle.util.io.pem.PemWriter {
    @Override // org.bouncycastle.util.io.pem.PemWriter
    public void writeObject(org.bouncycastle.util.io.pem.PemObjectGenerator pemObjectGenerator) throws java.io.IOException {
        super.writeObject(pemObjectGenerator);
    }

    public void writeObject(java.lang.Object obj, org.bouncycastle.openssl.PEMEncryptor pEMEncryptor) throws java.io.IOException {
        try {
            super.writeObject((org.bouncycastle.util.io.pem.PemObjectGenerator) new org.bouncycastle.openssl.jcajce.JcaMiscPEMGenerator(obj, pEMEncryptor));
        } catch (org.bouncycastle.util.io.pem.PemGenerationException e) {
            if (!(e.getCause() instanceof java.io.IOException)) {
                throw e;
            }
            throw ((java.io.IOException) e.getCause());
        }
    }

    public void writeObject(java.lang.Object obj) throws java.io.IOException {
        writeObject(obj, null);
    }

    public JcaPEMWriter(java.io.Writer writer) {
        super(writer);
    }
}
