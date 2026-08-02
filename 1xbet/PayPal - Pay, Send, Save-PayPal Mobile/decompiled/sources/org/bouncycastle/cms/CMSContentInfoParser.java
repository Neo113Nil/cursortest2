package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSContentInfoParser {
    protected org.bouncycastle.asn1.cms.ContentInfoParser _contentInfo;
    protected java.io.InputStream _data;

    public void close() throws java.io.IOException {
        this._data.close();
    }

    public CMSContentInfoParser(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this._data = inputStream;
        try {
            org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser = (org.bouncycastle.asn1.ASN1SequenceParser) new org.bouncycastle.asn1.ASN1StreamParser(inputStream).readObject();
            if (aSN1SequenceParser == null) {
                throw new org.bouncycastle.cms.CMSException("No content found.");
            }
            this._contentInfo = new org.bouncycastle.asn1.cms.ContentInfoParser(aSN1SequenceParser);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("IOException reading content.", e);
        } catch (java.lang.ClassCastException e2) {
            throw new org.bouncycastle.cms.CMSException("Unexpected object reading content.", e2);
        }
    }
}
