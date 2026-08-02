package org.apache.commons.imaging.icc;

/* loaded from: classes17.dex */
public class IccProfileInfo {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.icc.IccProfileInfo.class.getName());
    public final int cmmTypeSignature;
    public final int colorSpace;
    private final byte[] data;
    public final int deviceManufacturer;
    public final int deviceModel;
    public final int primaryPlatformSignature;
    public final int profileConnectionSpace;
    public final int profileCreatorSignature;
    public final int profileDeviceClassSignature;
    public final int profileFileSignature;
    private final byte[] profileId;
    public final int profileSize;
    public final int profileVersion;
    public final int renderingIntent;
    private final org.apache.commons.imaging.icc.IccTag[] tags;
    public final int variousFlags;

    public IccProfileInfo(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, byte[] bArr2, org.apache.commons.imaging.icc.IccTag[] iccTagArr) {
        this.data = bArr;
        this.profileSize = i;
        this.cmmTypeSignature = i2;
        this.profileVersion = i3;
        this.profileDeviceClassSignature = i4;
        this.colorSpace = i5;
        this.profileConnectionSpace = i6;
        this.profileFileSignature = i7;
        this.primaryPlatformSignature = i8;
        this.variousFlags = i9;
        this.deviceManufacturer = i10;
        this.deviceModel = i11;
        this.renderingIntent = i12;
        this.profileCreatorSignature = i13;
        this.profileId = bArr2;
        this.tags = iccTagArr;
    }

    public byte[] getData() {
        return (byte[]) this.data.clone();
    }

    public byte[] getProfileId() {
        return (byte[]) this.profileId.clone();
    }

    public org.apache.commons.imaging.icc.IccTag[] getTags() {
        return this.tags;
    }

    public boolean issRGB() {
        return this.deviceManufacturer == 1229275936 && this.deviceModel == 1934772034;
    }

    private void printCharQuad(java.io.PrintWriter printWriter, java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": '");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        sb.append("'");
        printWriter.println(sb.toString());
    }

    public void dump(java.lang.String str) {
        LOGGER.fine(toString());
    }

    public java.lang.String toString() {
        try {
            return toString("");
        } catch (java.lang.Exception unused) {
            return "IccProfileInfo: Error";
        }
    }

    public java.lang.String toString(java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": data length: ");
        sb.append(this.data.length);
        printWriter.println(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(": ProfileDeviceClassSignature");
        printCharQuad(printWriter, sb2.toString(), this.profileDeviceClassSignature);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(": CMMTypeSignature");
        printCharQuad(printWriter, sb3.toString(), this.cmmTypeSignature);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append(": ProfileDeviceClassSignature");
        printCharQuad(printWriter, sb4.toString(), this.profileDeviceClassSignature);
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(str);
        sb5.append(": ColorSpace");
        printCharQuad(printWriter, sb5.toString(), this.colorSpace);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(": ProfileConnectionSpace");
        printCharQuad(printWriter, sb6.toString(), this.profileConnectionSpace);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append(": ProfileFileSignature");
        printCharQuad(printWriter, sb7.toString(), this.profileFileSignature);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str);
        sb8.append(": PrimaryPlatformSignature");
        printCharQuad(printWriter, sb8.toString(), this.primaryPlatformSignature);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(str);
        sb9.append(": ProfileFileSignature");
        printCharQuad(printWriter, sb9.toString(), this.profileFileSignature);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(str);
        sb10.append(": DeviceManufacturer");
        printCharQuad(printWriter, sb10.toString(), this.deviceManufacturer);
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        sb11.append(str);
        sb11.append(": DeviceModel");
        printCharQuad(printWriter, sb11.toString(), this.deviceModel);
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
        sb12.append(str);
        sb12.append(": RenderingIntent");
        printCharQuad(printWriter, sb12.toString(), this.renderingIntent);
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
        sb13.append(str);
        sb13.append(": ProfileCreatorSignature");
        printCharQuad(printWriter, sb13.toString(), this.profileCreatorSignature);
        int i = 0;
        while (true) {
            org.apache.commons.imaging.icc.IccTag[] iccTagArr = this.tags;
            if (i < iccTagArr.length) {
                org.apache.commons.imaging.icc.IccTag iccTag = iccTagArr[i];
                java.lang.StringBuilder sb14 = new java.lang.StringBuilder("\t");
                sb14.append(i);
                sb14.append(": ");
                iccTag.dump(printWriter, sb14.toString());
                i++;
            } else {
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                sb15.append(str);
                sb15.append(": issRGB: ");
                sb15.append(issRGB());
                printWriter.println(sb15.toString());
                printWriter.flush();
                return stringWriter.getBuffer().toString();
            }
        }
    }
}
