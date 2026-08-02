package org.apache.commons.imaging.formats.jpeg;

/* loaded from: classes17.dex */
public class JpegImageMetadata implements org.apache.commons.imaging.common.ImageMetadata {
    private static final java.lang.String NEWLINE = java.lang.System.getProperty("line.separator");
    private final org.apache.commons.imaging.formats.tiff.TiffImageMetadata exif;
    private final org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata photoshop;

    public JpegImageMetadata(org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata jpegPhotoshopMetadata, org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata) {
        this.photoshop = jpegPhotoshopMetadata;
        this.exif = tiffImageMetadata;
    }

    public org.apache.commons.imaging.formats.tiff.TiffImageMetadata getExif() {
        return this.exif;
    }

    public org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata getPhotoshop() {
        return this.photoshop;
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findEXIFValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = this.exif;
            if (tiffImageMetadata != null) {
                return tiffImageMetadata.findField(tagInfo);
            }
            return null;
        } catch (org.apache.commons.imaging.ImageReadException unused) {
            return null;
        }
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findEXIFValueWithExactMatch(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = this.exif;
            if (tiffImageMetadata != null) {
                return tiffImageMetadata.findField(tagInfo, true);
            }
            return null;
        } catch (org.apache.commons.imaging.ImageReadException unused) {
            return null;
        }
    }

    public java.awt.Dimension getEXIFThumbnailSize() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        byte[] eXIFThumbnailData = getEXIFThumbnailData();
        if (eXIFThumbnailData != null) {
            return org.apache.commons.imaging.Imaging.getImageSize(eXIFThumbnailData);
        }
        return null;
    }

    public byte[] getEXIFThumbnailData() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata == null) {
            return null;
        }
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = tiffImageMetadata.getDirectories().iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory = (org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next();
            byte[] data = directory.getJpegImageData() != null ? directory.getJpegImageData().getData() : null;
            if (data != null) {
                return data;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.awt.image.BufferedImage getEXIFThumbnail() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.awt.image.BufferedImage read;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata == null) {
            return null;
        }
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = tiffImageMetadata.getDirectories().iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory = (org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next();
            java.awt.image.BufferedImage thumbnail = directory.getThumbnail();
            if (thumbnail != null) {
                return thumbnail;
            }
            org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData = directory.getJpegImageData();
            if (jpegImageData != null) {
                try {
                    read = org.apache.commons.imaging.Imaging.getBufferedImage(jpegImageData.getData());
                } catch (java.io.IOException unused) {
                    byteArrayInputStream = new java.io.ByteArrayInputStream(jpegImageData.getData());
                    read = javax.imageio.ImageIO.read(byteArrayInputStream);
                    if (read != null) {
                    }
                } catch (org.apache.commons.imaging.ImagingException unused2) {
                    byteArrayInputStream = new java.io.ByteArrayInputStream(jpegImageData.getData());
                    read = javax.imageio.ImageIO.read(byteArrayInputStream);
                    if (read != null) {
                    }
                } catch (java.lang.Throwable th) {
                    javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(jpegImageData.getData()));
                    throw th;
                }
                if (read != null) {
                    return read;
                }
            }
        }
        return null;
    }

    public org.apache.commons.imaging.formats.tiff.TiffImageData getRawImageData() {
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata == null) {
            return null;
        }
        java.util.Iterator<? extends org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> it = tiffImageMetadata.getDirectories().iterator();
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData = ((org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory) it.next()).getTiffImageData();
            if (tiffImageData != null) {
                return tiffImageData;
            }
        }
        return null;
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public java.util.List<org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem> getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata != null) {
            arrayList.addAll(tiffImageMetadata.getItems());
        }
        org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata jpegPhotoshopMetadata = this.photoshop;
        if (jpegPhotoshopMetadata != null) {
            arrayList.addAll(jpegPhotoshopMetadata.getItems());
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return toString(null);
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public java.lang.String toString(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        if (this.exif == null) {
            sb.append("No Exif metadata.");
        } else {
            sb.append("Exif metadata:");
            sb.append(NEWLINE);
            sb.append(this.exif.toString("\t"));
        }
        java.lang.String str2 = NEWLINE;
        sb.append(str2);
        sb.append(str);
        if (this.photoshop == null) {
            sb.append("No Photoshop (IPTC) metadata.");
        } else {
            sb.append("Photoshop (IPTC) metadata:");
            sb.append(str2);
            sb.append(this.photoshop.toString("\t"));
        }
        return sb.toString();
    }

    public void dump() {
        org.apache.commons.imaging.internal.Debug.debug(toString());
    }
}
