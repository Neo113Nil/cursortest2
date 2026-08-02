package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class PackedDate {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    public java.lang.String toString() {
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) ((this.getHighResolutionOutputSizeshNQ4ISI[i] & 255) + 48);
        }
        return new java.lang.String(cArr);
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getEncoding() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.util.Date getDate() throws java.text.ParseException {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.miteksystems.misnap.core.DateUtil.ICAO_FULL_DATE_FORMAT);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("20");
        sb.append(toString());
        return simpleDateFormat.parse(sb.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.eac.PackedDate) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((org.bouncycastle.asn1.eac.PackedDate) obj).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    private static byte[] getHighSpeedVideoSizes(java.lang.String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[6];
        for (int i = 0; i != 6; i++) {
            bArr[i] = (byte) (charArray[i] - '0');
        }
        return bArr;
    }

    PackedDate(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public PackedDate(java.util.Date date, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyMMdd'Z'", locale);
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(simpleDateFormat.format(date));
    }

    public PackedDate(java.util.Date date) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyMMdd'Z'");
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(simpleDateFormat.format(date));
    }

    public PackedDate(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(str);
    }
}
