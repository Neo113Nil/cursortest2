package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class MessageImprint {
    private final org.bouncycastle.asn1.x509.DigestInfo Camera2StreamConfigurationMap;

    public org.bouncycastle.asn1.x509.DigestInfo toASN1Structure() {
        return this.Camera2StreamConfigurationMap;
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.dvcs.MessageImprint) {
            return this.Camera2StreamConfigurationMap.equals(((org.bouncycastle.dvcs.MessageImprint) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public MessageImprint(org.bouncycastle.asn1.x509.DigestInfo digestInfo) {
        this.Camera2StreamConfigurationMap = digestInfo;
    }
}
