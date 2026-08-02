package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkIccp extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.png.chunks.PngChunkIccp.class.getName());
    private final byte[] compressedProfile;
    public final int compressionMethod;
    public final java.lang.String profileName;
    private final byte[] uncompressedProfile;

    public PngChunkIccp(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        int findNull = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PngChunkIccp: No Profile Name");
        }
        byte[] bArr2 = new byte[findNull];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, findNull);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.ISO_8859_1);
        this.profileName = str;
        byte b = bArr[findNull + 1];
        this.compressionMethod = b;
        int i4 = findNull + 2;
        int length = bArr.length - i4;
        byte[] bArr3 = new byte[length];
        this.compressedProfile = bArr3;
        java.lang.System.arraycopy(bArr, i4, bArr3, 0, length);
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("ProfileName: ".concat(str));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileName.length(): ");
            sb.append(str.length());
            logger.finest(sb.toString());
            logger.finest("CompressionMethod: ".concat(java.lang.String.valueOf((int) b)));
            logger.finest("CompressedProfileLength: ".concat(java.lang.String.valueOf(length)));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("bytes.length: ");
            sb2.append(bArr.length);
            logger.finest(sb2.toString());
        }
        this.uncompressedProfile = org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes(new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr3)));
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("UncompressedProfile: ");
            sb3.append(bArr.length);
            logger.finest(sb3.toString());
        }
    }

    public byte[] getUncompressedProfile() {
        return (byte[]) this.uncompressedProfile.clone();
    }
}
