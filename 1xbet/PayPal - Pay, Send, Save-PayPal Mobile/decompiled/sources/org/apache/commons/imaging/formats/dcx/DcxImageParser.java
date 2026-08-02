package org.apache.commons.imaging.formats.dcx;

/* loaded from: classes17.dex */
public class DcxImageParser extends org.apache.commons.imaging.ImageParser {
    private static final java.lang.String DEFAULT_EXTENSION = ".dcx";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public DcxImageParser() {
        super.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Dcx-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.DCX};
    }

    static class DcxHeader {
        public static final int DCX_ID = 987654321;
        public final int id;
        public final long[] pageTable;

        DcxHeader(int i, long[] jArr) {
            this.id = i;
            this.pageTable = jArr;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("DcxHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Id: 0x");
            sb.append(java.lang.Integer.toHexString(this.id));
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Pages: ");
            sb2.append(this.pageTable.length);
            printWriter.println(sb2.toString());
            printWriter.println();
        }
    }

    private org.apache.commons.imaging.formats.dcx.DcxImageParser.DcxHeader readDcxHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("Id", inputStream, "Not a Valid DCX File", getByteOrder());
            java.util.ArrayList arrayList = new java.util.ArrayList(1024);
            for (int i = 0; i < 1024; i++) {
                long read4Bytes2 = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("PageTable", inputStream, "Not a Valid DCX File", getByteOrder()) & 4294967295L;
                if (read4Bytes2 == 0) {
                    break;
                }
                arrayList.add(java.lang.Long.valueOf(read4Bytes2));
            }
            if (read4Bytes != 987654321) {
                throw new org.apache.commons.imaging.ImageReadException("Not a Valid DCX File: file id incorrect");
            }
            if (arrayList.size() == 1024) {
                throw new org.apache.commons.imaging.ImageReadException("DCX page table not terminated by zero entry");
            }
            java.lang.Object[] array = arrayList.toArray();
            long[] jArr = new long[array.length];
            for (int i2 = 0; i2 < array.length; i2++) {
                jArr[i2] = ((java.lang.Long) array[i2]).longValue();
            }
            org.apache.commons.imaging.formats.dcx.DcxImageParser.DcxHeader dcxHeader = new org.apache.commons.imaging.formats.dcx.DcxImageParser.DcxHeader(read4Bytes, jArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return dcxHeader;
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

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        readDcxHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.List<java.awt.image.BufferedImage> allBufferedImages = getAllBufferedImages(byteSource);
        if (allBufferedImages.isEmpty()) {
            return null;
        }
        return allBufferedImages.get(0);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.dcx.DcxImageParser.DcxHeader readDcxHeader = readDcxHeader(byteSource);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.apache.commons.imaging.formats.pcx.PcxImageParser pcxImageParser = new org.apache.commons.imaging.formats.pcx.PcxImageParser();
        for (long j : readDcxHeader.pageTable) {
            java.io.InputStream inputStream = byteSource.getInputStream(j);
            try {
                arrayList.add(pcxImageParser.getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), new java.util.HashMap()));
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.lang.Object remove;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (hashMap.containsKey(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_COMPRESSION)) {
            hashMap2.put(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_COMPRESSION, hashMap.remove(org.apache.commons.imaging.formats.pcx.PcxConstants.PARAM_KEY_PCX_COMPRESSION));
        }
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY) && (remove = hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY)) != null) {
            if (!(remove instanceof org.apache.commons.imaging.PixelDensity)) {
                throw new org.apache.commons.imaging.ImageWriteException("Invalid pixel density parameter");
            }
            hashMap2.put(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY, remove);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream = new org.apache.commons.imaging.common.BinaryOutputStream(outputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        binaryOutputStream.write4Bytes(org.apache.commons.imaging.formats.dcx.DcxImageParser.DcxHeader.DCX_ID);
        binaryOutputStream.write4Bytes(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN);
        for (int i = 0; i < 1023; i++) {
            binaryOutputStream.write4Bytes(0);
        }
        new org.apache.commons.imaging.formats.pcx.PcxImageParser().writeImage(bufferedImage, binaryOutputStream, hashMap2);
    }
}
