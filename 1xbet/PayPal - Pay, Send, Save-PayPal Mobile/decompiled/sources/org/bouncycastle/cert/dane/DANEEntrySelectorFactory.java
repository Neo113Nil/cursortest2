package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANEEntrySelectorFactory {
    private final org.bouncycastle.operator.DigestCalculator getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cert.dane.DANEEntrySelector createSelector(java.lang.String str) throws org.bouncycastle.cert.dane.DANEException {
        byte[] uTF8ByteArray = org.bouncycastle.util.Strings.toUTF8ByteArray(str.substring(0, str.indexOf(64)));
        try {
            java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRangesFor.getOutputStream();
            outputStream.write(uTF8ByteArray);
            outputStream.close();
            byte[] digest = this.getHighSpeedVideoFpsRangesFor.getDigest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(org.bouncycastle.util.Strings.fromByteArray(org.bouncycastle.util.encoders.Hex.encode(digest)));
            sb.append("._smimecert.");
            sb.append(str.substring(str.indexOf(64) + 1));
            return new org.bouncycastle.cert.dane.DANEEntrySelector(sb.toString());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to calculate digest string: ");
            sb2.append(e.getMessage());
            throw new org.bouncycastle.cert.dane.DANEException(sb2.toString(), e);
        }
    }

    public DANEEntrySelectorFactory(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this.getHighSpeedVideoFpsRangesFor = digestCalculator;
    }
}
