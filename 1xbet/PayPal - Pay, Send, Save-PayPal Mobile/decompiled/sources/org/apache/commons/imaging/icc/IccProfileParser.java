package org.apache.commons.imaging.icc;

/* loaded from: classes17.dex */
public class IccProfileParser extends org.apache.commons.imaging.common.BinaryFileParser {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.icc.IccProfileParser.class.getName());

    public IccProfileParser() {
        setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    public org.apache.commons.imaging.icc.IccProfileInfo getICCProfileInfo(java.awt.color.ICC_Profile iCC_Profile) {
        if (iCC_Profile == null) {
            return null;
        }
        return getICCProfileInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(iCC_Profile.getData()));
    }

    public org.apache.commons.imaging.icc.IccProfileInfo getICCProfileInfo(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return getICCProfileInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public org.apache.commons.imaging.icc.IccProfileInfo getICCProfileInfo(java.io.File file) {
        if (file == null) {
            return null;
        }
        return getICCProfileInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.apache.commons.imaging.icc.IccProfileInfo getICCProfileInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = byteSource.getInputStream();
            try {
                try {
                    org.apache.commons.imaging.icc.IccProfileInfo readICCProfileInfo = readICCProfileInfo(inputStream);
                    if (readICCProfileInfo == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                return null;
                            } catch (java.lang.Exception e) {
                                LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), (java.lang.Throwable) e);
                            }
                        }
                        return null;
                    }
                    inputStream.close();
                    for (org.apache.commons.imaging.icc.IccTag iccTag : readICCProfileInfo.getTags()) {
                        iccTag.setData(byteSource.getBlock(iccTag.offset, iccTag.length));
                    }
                    return readICCProfileInfo;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), (java.lang.Throwable) e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Exception e3) {
                            LOGGER.log(java.util.logging.Level.SEVERE, e3.getMessage(), (java.lang.Throwable) e3);
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.lang.Exception e4) {
                        LOGGER.log(java.util.logging.Level.SEVERE, e4.getMessage(), (java.lang.Throwable) e4);
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    private org.apache.commons.imaging.icc.IccProfileInfo readICCProfileInfo(java.io.InputStream inputStream) {
        java.lang.String str = "]";
        java.lang.String str2 = "Not a Valid ICC Profile";
        org.apache.commons.imaging.icc.CachingInputStream cachingInputStream = new org.apache.commons.imaging.icc.CachingInputStream(inputStream);
        try {
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileSize", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Signature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("CMMTypeSignature", read4Bytes2);
            }
            int read4Bytes3 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileVersion", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            int read4Bytes4 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileDeviceClassSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("ProfileDeviceClassSignature", read4Bytes4);
            }
            int read4Bytes5 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, read4Bytes5);
            }
            int read4Bytes6 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileConnectionSpace", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("ProfileConnectionSpace", read4Bytes6);
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(cachingInputStream, 12L, "Not a Valid ICC Profile");
            int read4Bytes7 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileFileSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("ProfileFileSignature", read4Bytes7);
            }
            int read4Bytes8 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("PrimaryPlatformSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("PrimaryPlatformSignature", read4Bytes8);
            }
            int read4Bytes9 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("VariousFlags", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("VariousFlags", read4Bytes7);
            }
            int read4Bytes10 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("DeviceManufacturer", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("DeviceManufacturer", read4Bytes10);
            }
            int read4Bytes11 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.DeviceModel, cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.DeviceModel, read4Bytes11);
            }
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(cachingInputStream, 8L, "Not a Valid ICC Profile");
            int read4Bytes12 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("RenderingIntent", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("RenderingIntent", read4Bytes12);
            }
            int i = read4Bytes12;
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(cachingInputStream, 12L, "Not a Valid ICC Profile");
            int read4Bytes13 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileCreatorSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("ProfileCreatorSignature", read4Bytes13);
            }
            int i2 = read4Bytes13;
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(cachingInputStream, 16L, "Not a Valid ICC Profile");
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(cachingInputStream, 28L, "Not a Valid ICC Profile");
            int read4Bytes14 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("TagCount", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            org.apache.commons.imaging.icc.IccTag[] iccTagArr = new org.apache.commons.imaging.icc.IccTag[read4Bytes14];
            int i3 = 0;
            while (i3 < read4Bytes14) {
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int i4 = read4Bytes14;
                    sb.append("TagSignature[");
                    sb.append(i3);
                    sb.append(str);
                    int read4Bytes15 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(sb.toString(), cachingInputStream, str2, getByteOrder());
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    int i5 = i2;
                    sb2.append("OffsetToData[");
                    sb2.append(i3);
                    sb2.append(str);
                    int read4Bytes16 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(sb2.toString(), cachingInputStream, str2, getByteOrder());
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    int i6 = i;
                    sb3.append("ElementSize[");
                    sb3.append(i3);
                    sb3.append(str);
                    java.lang.String str3 = str;
                    iccTagArr[i3] = new org.apache.commons.imaging.icc.IccTag(read4Bytes15, read4Bytes16, org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(sb3.toString(), cachingInputStream, str2, getByteOrder()), getIccTagType(read4Bytes15));
                    i3++;
                    read4Bytes14 = i4;
                    str = str3;
                    str2 = str2;
                    i = i6;
                    i2 = i5;
                } catch (java.lang.Exception e) {
                    e = e;
                    LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), (java.lang.Throwable) e);
                    return null;
                }
            }
            int i7 = i2;
            int i8 = i;
            while (cachingInputStream.read() >= 0) {
            }
            byte[] cache = cachingInputStream.getCache();
            if (cache.length < read4Bytes) {
                throw new java.io.IOException("Couldn't read ICC Profile.");
            }
            org.apache.commons.imaging.icc.IccProfileInfo iccProfileInfo = new org.apache.commons.imaging.icc.IccProfileInfo(cache, read4Bytes, read4Bytes2, read4Bytes3, read4Bytes4, read4Bytes5, read4Bytes6, read4Bytes7, read4Bytes8, read4Bytes9, read4Bytes10, read4Bytes11, i8, i7, null, iccTagArr);
            java.util.logging.Logger logger2 = LOGGER;
            if (logger2.isLoggable(java.util.logging.Level.FINEST)) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append("issRGB: ");
                sb4.append(iccProfileInfo.issRGB());
                logger2.finest(sb4.toString());
            }
            return iccProfileInfo;
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    private org.apache.commons.imaging.icc.IccTagType getIccTagType(int i) {
        for (org.apache.commons.imaging.icc.IccTagTypes iccTagTypes : org.apache.commons.imaging.icc.IccTagTypes.values()) {
            if (iccTagTypes.getSignature() == i) {
                return iccTagTypes;
            }
        }
        return null;
    }

    public boolean issRGB(java.awt.color.ICC_Profile iCC_Profile) throws java.io.IOException {
        return issRGB(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(iCC_Profile.getData()));
    }

    public boolean issRGB(byte[] bArr) throws java.io.IOException {
        return issRGB(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public boolean issRGB(java.io.File file) throws java.io.IOException {
        return issRGB(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    public boolean issRGB(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileSize", inputStream, "Not a Valid ICC Profile", getByteOrder());
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, 20L);
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, 12L, "Not a Valid ICC Profile");
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, 12L);
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ProfileFileSignature", inputStream, "Not a Valid ICC Profile", getByteOrder());
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad("DeviceManufacturer", read4Bytes);
            }
            int read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.DeviceModel, inputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                org.apache.commons.imaging.common.BinaryFunctions.printCharQuad(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.DeviceModel, read4Bytes2);
            }
            boolean z = read4Bytes == 1229275936 && read4Bytes2 == 1934772034;
            if (inputStream != null) {
                inputStream.close();
            }
            return z;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
