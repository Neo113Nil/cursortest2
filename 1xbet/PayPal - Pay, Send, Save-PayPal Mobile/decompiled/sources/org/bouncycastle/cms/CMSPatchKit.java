package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSPatchKit {

    static class ModEncAlgSignerInformation extends org.bouncycastle.cms.SignerInformation {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected ModEncAlgSignerInformation(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
            super(signerInformation, new org.bouncycastle.asn1.cms.SignerInfo(r0.getSID(), r0.getDigestAlgorithm(), r0.getAuthenticatedAttributes(), algorithmIdentifier, r0.getEncryptedDigest(), r0.getUnauthenticatedAttributes()));
            org.bouncycastle.asn1.cms.SignerInfo signerInfo = signerInformation.info;
        }
    }

    static class DLSignerInformation extends org.bouncycastle.cms.SignerInformation {
        @Override // org.bouncycastle.cms.SignerInformation
        public byte[] getEncodedSignedAttributes() throws java.io.IOException {
            return this.signedAttributeSet.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DL);
        }

        protected DLSignerInformation(org.bouncycastle.cms.SignerInformation signerInformation) {
            super(signerInformation);
        }
    }

    public static org.bouncycastle.cms.SignerInformation createWithSignatureAlgorithm(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return new org.bouncycastle.cms.CMSPatchKit.ModEncAlgSignerInformation(signerInformation, algorithmIdentifier);
    }

    public static org.bouncycastle.cms.SignerInformation createNonDERSignerInfo(org.bouncycastle.cms.SignerInformation signerInformation) {
        return new org.bouncycastle.cms.CMSPatchKit.DLSignerInformation(signerInformation);
    }
}
