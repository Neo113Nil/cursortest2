package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
public class PnmImageParser extends org.apache.commons.imaging.ImageParser {
    public static final java.lang.String PARAM_KEY_PNM_RAWBITS = "PNM_RAWBITS";
    public static final java.lang.String PARAM_VALUE_PNM_RAWBITS_NO = "NO";
    public static final java.lang.String PARAM_VALUE_PNM_RAWBITS_YES = "YES";
    private static final java.lang.String DEFAULT_EXTENSION = ".pnm";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {".pbm", ".pgm", ".ppm", DEFAULT_EXTENSION, ".pam"};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public PnmImageParser() {
        super.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Pbm-Custom";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.PBM, org.apache.commons.imaging.ImageFormats.PGM, org.apache.commons.imaging.ImageFormats.PPM, org.apache.commons.imaging.ImageFormats.PNM, org.apache.commons.imaging.ImageFormats.PAM};
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        if (r6 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        if (r2 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
    
        if (r3 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0126, code lost:
    
        if (r4 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        if (r5 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
    
        return new org.apache.commons.imaging.formats.pnm.PamFileInfo(r11, r12, r13, r14, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        throw new org.apache.commons.imaging.ImageReadException("PAM header has no TUPLTYPE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        throw new org.apache.commons.imaging.ImageReadException("PAM header has no MAXVAL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
    
        throw new org.apache.commons.imaging.ImageReadException("PAM header has no DEPTH");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        throw new org.apache.commons.imaging.ImageReadException("PAM header has no HEIGHT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
    
        throw new org.apache.commons.imaging.ImageReadException("PAM header has no WIDTH");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.apache.commons.imaging.formats.pnm.FileInfo readHeader(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("Identifier1", inputStream, "Not a Valid PNM File");
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("Identifier2", inputStream, "Not a Valid PNM File");
        if (readByte != 80) {
            throw new org.apache.commons.imaging.ImageReadException("PNM file has invalid prefix byte 1");
        }
        org.apache.commons.imaging.formats.pnm.WhiteSpaceReader whiteSpaceReader = new org.apache.commons.imaging.formats.pnm.WhiteSpaceReader(inputStream);
        if (readByte2 != 49 && readByte2 != 52 && readByte2 != 50 && readByte2 != 53 && readByte2 != 51 && readByte2 != 54) {
            if (readByte2 == 55) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                whiteSpaceReader.readLine();
                int i = -1;
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    java.lang.String readLine = whiteSpaceReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    java.lang.String trim = readLine.trim();
                    if (trim.charAt(0) != '#') {
                        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(trim, " ", false);
                        java.lang.String nextToken = stringTokenizer.nextToken();
                        if ("WIDTH".equals(nextToken)) {
                            if (!stringTokenizer.hasMoreTokens()) {
                                throw new org.apache.commons.imaging.ImageReadException("PAM header has no WIDTH value");
                            }
                            i = java.lang.Integer.parseInt(stringTokenizer.nextToken());
                            z5 = true;
                        } else if ("HEIGHT".equals(nextToken)) {
                            if (!stringTokenizer.hasMoreTokens()) {
                                throw new org.apache.commons.imaging.ImageReadException("PAM header has no HEIGHT value");
                            }
                            i2 = java.lang.Integer.parseInt(stringTokenizer.nextToken());
                            z = true;
                        } else if ("DEPTH".equals(nextToken)) {
                            if (!stringTokenizer.hasMoreTokens()) {
                                throw new org.apache.commons.imaging.ImageReadException("PAM header has no DEPTH value");
                            }
                            i3 = java.lang.Integer.parseInt(stringTokenizer.nextToken());
                            z2 = true;
                        } else if ("MAXVAL".equals(nextToken)) {
                            if (!stringTokenizer.hasMoreTokens()) {
                                throw new org.apache.commons.imaging.ImageReadException("PAM header has no MAXVAL value");
                            }
                            i4 = java.lang.Integer.parseInt(stringTokenizer.nextToken());
                            z3 = true;
                        } else if ("TUPLTYPE".equals(nextToken)) {
                            if (!stringTokenizer.hasMoreTokens()) {
                                throw new org.apache.commons.imaging.ImageReadException("PAM header has no TUPLTYPE value");
                            }
                            sb.append(stringTokenizer.nextToken());
                            z4 = true;
                        } else if (!"ENDHDR".equals(nextToken)) {
                            throw new org.apache.commons.imaging.ImageReadException("Invalid PAM file header type ".concat(java.lang.String.valueOf(nextToken)));
                        }
                    }
                }
            }
        } else {
            try {
                int parseInt = java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
                try {
                    int parseInt2 = java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
                    if (readByte2 == 49) {
                        return new org.apache.commons.imaging.formats.pnm.PbmFileInfo(parseInt, parseInt2, false);
                    }
                    if (readByte2 == 52) {
                        return new org.apache.commons.imaging.formats.pnm.PbmFileInfo(parseInt, parseInt2, true);
                    }
                    if (readByte2 == 50) {
                        return new org.apache.commons.imaging.formats.pnm.PgmFileInfo(parseInt, parseInt2, false, java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                    if (readByte2 == 53) {
                        return new org.apache.commons.imaging.formats.pnm.PgmFileInfo(parseInt, parseInt2, true, java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                    if (readByte2 == 51) {
                        return new org.apache.commons.imaging.formats.pnm.PpmFileInfo(parseInt, parseInt2, false, java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                    if (readByte2 == 54) {
                        return new org.apache.commons.imaging.formats.pnm.PpmFileInfo(parseInt, parseInt2, true, java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                } catch (java.lang.NumberFormatException e) {
                    throw new org.apache.commons.imaging.ImageReadException("Invalid height specified.", e);
                }
            } catch (java.lang.NumberFormatException e2) {
                throw new org.apache.commons.imaging.ImageReadException("Invalid width specified.", e2);
            }
        }
        throw new org.apache.commons.imaging.ImageReadException("PNM file has invalid prefix byte 2");
    }

    private org.apache.commons.imaging.formats.pnm.FileInfo readHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.pnm.FileInfo readHeader = readHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readHeader;
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
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.pnm.FileInfo readHeader = readHeader(byteSource);
        if (readHeader == null) {
            throw new org.apache.commons.imaging.ImageReadException("PNM: Couldn't read Header");
        }
        return new java.awt.Dimension(readHeader.width, readHeader.height);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.pnm.FileInfo readHeader = readHeader(byteSource);
        if (readHeader == null) {
            throw new org.apache.commons.imaging.ImageReadException("PNM: Couldn't read Header");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int bitDepth = readHeader.getBitDepth();
        int numComponents = readHeader.getNumComponents();
        return new org.apache.commons.imaging.ImageInfo(readHeader.getImageTypeDescription(), bitDepth * numComponents, arrayList, readHeader.getImageType(), readHeader.getImageTypeDescription(), readHeader.height, readHeader.getMIMEType(), 1, 72, (float) (readHeader.height / 72.0d), 72, (float) (readHeader.width / 72.0d), readHeader.width, false, readHeader.hasAlpha(), false, readHeader.getColorType(), org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        printWriter.println("pnm.dumpImageFile");
        org.apache.commons.imaging.ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            org.apache.commons.imaging.formats.pnm.FileInfo readHeader = readHeader(inputStream);
            org.apache.commons.imaging.common.ImageBuilder imageBuilder = new org.apache.commons.imaging.common.ImageBuilder(readHeader.width, readHeader.height, readHeader.hasAlpha());
            readHeader.readImage(imageBuilder, inputStream);
            java.awt.image.BufferedImage bufferedImage = imageBuilder.getBufferedImage();
            if (inputStream != null) {
                inputStream.close();
            }
            return bufferedImage;
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
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.util.HashMap hashMap;
        boolean z = true;
        org.apache.commons.imaging.formats.pnm.PnmWriter pnmWriter = null;
        if (map != null) {
            java.lang.Object obj = map.get(PARAM_KEY_PNM_RAWBITS);
            if (obj != null && obj.equals(PARAM_VALUE_PNM_RAWBITS_NO)) {
                z = false;
            }
            java.lang.Object obj2 = map.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
            if (obj2 != null) {
                if (obj2.equals(org.apache.commons.imaging.ImageFormats.PBM)) {
                    pnmWriter = new org.apache.commons.imaging.formats.pnm.PbmWriter(z);
                } else if (obj2.equals(org.apache.commons.imaging.ImageFormats.PGM)) {
                    pnmWriter = new org.apache.commons.imaging.formats.pnm.PgmWriter(z);
                } else if (obj2.equals(org.apache.commons.imaging.ImageFormats.PPM)) {
                    pnmWriter = new org.apache.commons.imaging.formats.pnm.PpmWriter(z);
                } else if (obj2.equals(org.apache.commons.imaging.ImageFormats.PAM)) {
                    pnmWriter = new org.apache.commons.imaging.formats.pnm.PamWriter();
                }
            }
        }
        if (pnmWriter == null) {
            if (new org.apache.commons.imaging.palette.PaletteFactory().hasTransparency(bufferedImage)) {
                pnmWriter = new org.apache.commons.imaging.formats.pnm.PamWriter();
            } else {
                pnmWriter = new org.apache.commons.imaging.formats.pnm.PpmWriter(z);
            }
        }
        if (map != null) {
            hashMap = new java.util.HashMap(map);
        } else {
            hashMap = new java.util.HashMap();
        }
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (hashMap.containsKey(PARAM_KEY_PNM_RAWBITS)) {
            hashMap.remove(PARAM_KEY_PNM_RAWBITS);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        pnmWriter.writeImage(bufferedImage, outputStream, hashMap);
    }
}
